-- ALT+S로 코드 수행
select * from tbl_dept;
select * from tbl_emp;

insert into TBL_DEPT select * from DEPT;
insert into TBL_EMP 
(comm, deptno, empno, ename, gender, hiredate, job, mgr, sal)
select comm, deptno, empno, ename, gender, hiredate, job, mgr, sal from EMP;