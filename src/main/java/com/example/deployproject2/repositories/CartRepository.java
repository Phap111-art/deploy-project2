package com.example.deployproject2.repositories;


import com.example.deployproject2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<User,Integer> {
}
