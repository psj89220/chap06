package com.example.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import lombok.Data;
import lombok.ToString;

@Entity
@Table(name="tbl_dept")
@Data
@ToString(exclude={"emps"})
public class Dept {
	
	@Id
	@TableGenerator(name="idGen", table="id_gen",
		pkColumnName="seq_name", valueColumnName="nextval",
		initialValue=100, allocationSize=10)
	@GeneratedValue(strategy = GenerationType.TABLE, generator="idGen")
	Integer deptno;
	String dname;
	String loc;
	
	@OneToMany(mappedBy="dept", fetch=FetchType.LAZY)
	List<Emp> emps;
}
