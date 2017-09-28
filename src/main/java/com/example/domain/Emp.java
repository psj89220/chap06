package com.example.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.ToString;

@Entity
@Table(name="tbl_emp")
@ToString(exclude={"mgr", "dept"})
@Data
public class Emp {
	
	public enum Gender {
		M, m, f, F;
	}
	
	@Id
	@TableGenerator(name="idGen", table="id_gen",
	pkColumnName="seq_name", valueColumnName="nextval",
	initialValue=7000, allocationSize=10)
	@GeneratedValue(strategy = GenerationType.TABLE, generator="idGen")
	private Integer empno;
	private String ename;
	@Enumerated(EnumType.STRING)
	private Gender gender;
	private String job;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="mgr")
	private Emp mgr;
	
	@Temporal(TemporalType.DATE)
	private Date hiredate;
	private BigDecimal sal;
	private BigDecimal comm;
//	private BigInteger deptno;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="deptno")
	private Dept dept;
}
