package com.example.demo.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Bank;


@Repository
public interface BankRepository extends JpaRepository<Bank, String> {
    





}