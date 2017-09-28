package com.example.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import com.example.domain.Emp;


public interface EmpRepository extends JpaRepository<Emp, Integer>, QuerydslPredicateExecutor<Emp>{

}
