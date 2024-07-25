show databases; -- this is single line comment

/*
	this is 
    multi-line
    comment
*/ 

use record_company;

create table test(
	test_col int
);

drop table test;

create table student(
	id int,
    name text,
    age int,
    city text
);

-- 15/04/24
select * from student;

select id,name from student;

create table employee(
	emp_id int,
    emp_name varchar(255),
    emp_address varchar(255),
    emp_city varchar(255)
);

insert into employee values(101,'Sushant','Sakal Office','Kowad');

insert into employee values(102,'Ujwala','lakshi galli','Kowad');

insert into employee(emp_id,emp_name) values (103,'Pavan');

insert into employee values
(104,'Prachi','kowad road','kowad'),
(105,'parth','Nager','kolhapur');

select * from employee;
-- find unique value
select distinct emp_city from employee;

-- user the where closes in the database
select * from employee where emp_city = 'Kowad';

select * from employee where emp_city is null;

select * from employee where emp_id = 104;

-- order by
select * from employee order by emp_name asc;

select * from employee order by emp_name desc;

-- add multiple colume it is not possible to both 
select * from employee order by emp_name,emp_address asc;

--  -------------------  16/07/2024  ----------------------

select 20 + 30;

select 50-40;

select 15*5;

select 60/45;

select 90%15




















