package com.example.demo.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;





import com.example.demo.model.Customeruser;





@Repository
public interface CustomeruserRepository extends JpaRepository<Customeruser, Integer> {
    





}