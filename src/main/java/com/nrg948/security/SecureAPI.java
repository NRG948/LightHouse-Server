package com.nrg948.security;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@RestController
public class SecureAPI {
	@Autowired VerifDatabase database;
	@Value("${spring.datasource.username}")
	private String username;
	@Value("${spring.datasource.password}")
	private String password;
	
	private HashMap<String, String> tempComments = new HashMap<>();
	private HashMap<String, Long> tempKeyTimestamps = new HashMap<>();
	private Random random = new Random();
	
	@PostMapping("/secure/create")
	public ResponseEntity<String> createUUID(@RequestHeader String uuid, @RequestHeader String key) throws NoSuchAlgorithmException {
		if(!tempKeyTimestamps.containsKey(key)) {
			return ResponseEntity.badRequest().body("INVALID KEY");
		}
		
		tempKeyTimestamps.remove(key);
		
		VerifCode code = new VerifCode();
		code.setPassword(hash(uuid));
		System.out.println("THE COMMENT: " + tempComments);
		code.setComment(tempComments.remove(key));
		database.save(code);
		
		return ResponseEntity.ok("");
	}
	
	@PostMapping("/secure/gen")
	public ResponseEntity<String> generateKey(@RequestHeader String username, @RequestHeader String password, @RequestHeader(defaultValue = "") String comment) {
	    if (this.username.equals(username) && this.password.equals(password)) {
	        String generatedCode = genKey();
	        tempKeyTimestamps.put(generatedCode, System.currentTimeMillis());
	        tempComments.put(generatedCode, comment);

	        // Immediately return the response
	        return ResponseEntity.ok(generatedCode);  
	    } else {
	        return ResponseEntity.badRequest().body("INVALID USERNAME OR PASSWORD");
	    }
	}

	
	private String genKey() {
        long value = random.nextLong();
        
        // Convert long to byte array
        byte[] bytes = new byte[8];
        for (int i = 0; i < 8; i++) {
            bytes[7 - i] = (byte) (value >>> (i * 8));
        }
        
        // Encode byte array to Base64
        String base64Encoded = Base64.getEncoder().encodeToString(bytes);
        return base64Encoded;
	}
	
	public String hash(String input) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hashBytes = digest.digest(input.getBytes());
        StringBuilder hexString = new StringBuilder();
        for (byte b : hashBytes) {
            hexString.append(String.format("%02x", b));
        }
        return hexString.toString();
    }

	public void cleanAllKeys() {
		long currentTime = System.currentTimeMillis();
		int keysRemoved = 0;

        // Iterate over tempKeys and remove expired keys
        for (String key : tempKeyTimestamps.keySet()) {
            long timestamp = tempKeyTimestamps.get(key);
            if (currentTime - timestamp > 60000*5) {  // 5 min before code expires
                tempKeyTimestamps.remove(key);
                tempComments.remove(key);
                keysRemoved++;
            }
        }
        System.out.println("Keys removed: " + keysRemoved);
	}
}
