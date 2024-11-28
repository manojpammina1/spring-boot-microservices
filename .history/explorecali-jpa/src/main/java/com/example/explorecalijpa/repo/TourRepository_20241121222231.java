package com.example.explorecalijpa.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.explorecalijpa.model.Tour;
import com.example.explorecalijpa.model.TourPackage;

public interface TourRepository extends JpaRepository<Tour, Integer> {
  Optional<TourPackage> findByname(String name)
}