package com.nrg948.security;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VerifDatabase extends JpaRepository<VerifCode, String>{
}

