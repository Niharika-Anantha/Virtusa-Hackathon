package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.ReportModel;

public interface ReportRepository extends JpaRepository<ReportModel, String> {

}
