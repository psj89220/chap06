package com.example.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import com.example.domain.Dept;

public interface DeptRepository extends JpaRepository<Dept, Integer>, QuerydslPredicateExecutor<Dept>{

}
