package com.nrg948.data;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FlagDatabase extends JpaRepository<DataFlagEntry, Long> {
}
