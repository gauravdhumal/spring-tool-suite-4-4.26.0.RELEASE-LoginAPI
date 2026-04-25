package com.loginApi.LoginRepo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loginApi.LoginEntity.Entitys;

public interface Repository extends JpaRepository<Entitys, Integer> {

	Optional<Entitys> findByName(String name);

}
