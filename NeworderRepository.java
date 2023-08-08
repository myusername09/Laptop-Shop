package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Neworder;
@Repository
public interface NeworderRepository extends JpaRepository<Neworder, String> {

}
