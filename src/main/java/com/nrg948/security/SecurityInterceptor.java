package com.nrg948.security;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.annotation.PostConstruct;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class SecurityInterceptor implements HandlerInterceptor {
	@Autowired VerifDatabase database;
	
	@Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		String path = request.getServletPath();
		if(!(path.startsWith("/api") || path.startsWith("/int")) || path.equals("/api/patch") || path.startsWith("/h2-console")) {
			System.out.println("bypassed " + path);
			return true; // don't check anything that isn't /api or /int
		} else {
			System.out.println("checking " + path);
		}
		
		String apiHeader = request.getHeader("X-API-KEY");
		boolean able = apiHeader == null ? false : (database.findById(hash(apiHeader)).isPresent());
		if(apiHeader == null || !able) {
			System.out.println("REJECTED");
			response.sendError(400);
			response.flushBuffer();
			return false;
		} else {
			return true;
		}
    }
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("interceptor constructed");
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
}
