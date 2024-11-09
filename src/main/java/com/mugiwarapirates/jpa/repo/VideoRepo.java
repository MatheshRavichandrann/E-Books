package com.mugiwarapirates.jpa.repo;

import com.mugiwarapirates.jpa.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepo extends JpaRepository<Video, Integer> {
}
