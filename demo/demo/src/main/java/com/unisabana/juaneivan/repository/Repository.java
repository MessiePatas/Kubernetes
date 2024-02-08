package com.unisabana.juaneivan.repository;

import com.unisabana.juaneivan.Entity.Estudiante;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Estudiante,Integer> {}