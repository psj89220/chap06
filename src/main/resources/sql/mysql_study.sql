select * from dept;
show tables;

select * from tbl_dept;
select * from tbl_emp;

insert into tbl_dept select * from dept;
insert into tbl_emp 
(comm, deptno, empno, ename, gender, hiredate, job, mgr, sal)
select comm, deptno, empno, ename, gender, hiredate, job, mgr, sal from emp;