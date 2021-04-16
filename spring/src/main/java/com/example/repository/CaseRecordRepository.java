package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.CaseRecordModel;

public interface CaseRecordRepository extends JpaRepository<CaseRecordModel, Integer>{

}
