package com.nrg948.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CodeCleanupScheduler {

    @Autowired
    private SecureAPI secureAPI;

    // Run every minute
    @Scheduled(fixedRate = 60000)
    public void deleteExpiredKeys() {
        secureAPI.cleanAllKeys();
    }
}
