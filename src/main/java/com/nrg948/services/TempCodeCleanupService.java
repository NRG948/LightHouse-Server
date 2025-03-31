package com.nrg948.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.nrg948.security.SecureAPI;

@Component
public class TempCodeCleanupService {

    @Autowired
    private SecureAPI secureAPI;

    // Run every minute
    @Scheduled(fixedRate = 60000)
    public void deleteExpiredKeys() {
        secureAPI.cleanAllKeys();
    }
}
