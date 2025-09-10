package com.example.springbootmysqldocker.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbootmysqldocker.entity.FormData;

public interface FormDataRepository extends JpaRepository<FormData, Long> {
}
