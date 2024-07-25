-- 19/07/24

use myschema;

-- ------------ not null constraint ----------

create table colleges(
	college_id int not null,
    college_code varchar(20) not null,
    college_name varchar(50)
);

insert into colleges values (101,'XYZ1009','XYZ Engineering College');

select * from colleges;

insert into colleges(college_id,college_code,college_name)
	values (102,'bits1000','BITS Pliani');
    
insert into colleges(college_id,college_code) 
	values(104,'JG12345');
    
-- reomve not null constraint from the column

alter table colleges modify college_code varchar(20);

-- ----------------------- Unique constraint -----------------------
create table employees(
	emp_id int not null unique,
    emp_name varchar(255),
    emp_salary int,
    emp_city varchar(255)
);

insert into employees values (1001,'Samarth Jain',45000,'Bengaluru'),
							(1002,'Sushant Patil',50000,'Kowad'),
                            (1003,'Mahesh Patil',55000,'Mysore'),
                            (103,'Hema Sood',89000,'Hydrabad');

-- it will give the error like Duplicate entry '103' for key 'employees.emp_id'
insert into employees values(103,'Harish Gupta',60000,'Pune');

select * from employees;

-- crate any column modify
alter table employees modify emp_salary int unique;

-- ---------------------- Primary Key constraint -----------------------
create table student(
	student_id int,
    student_name varchar(255),
    student_course varchar(255),
    constraint studentID primary key(student_id)
);

create table student1(
	student_id int primary key,
    student_name varchar(255),
    student_course varchar(255)
);

-- ---------------------- Foreign Key constraint --------------------------

use myschema;

-- this table not have foreign key
-- Parent table
create table customer(
	id int primary key,
    name varchar(255),
    age int
);

insert into customer values(1,'sham',25),
							(2,'Ram',32),
                            (3,'Sushant',22),
                            (4,'Pratibha',26),
                            (5,'Varsha',25);

-- create another table products and add foreign key to the customer_id

-- child table
create table products(
	customer_id int, 
    name varchar(255),
    foreign key (customer_id) references customer(id)
);

-- insert the records with foregin key constraint

insert into products values (2,'Keyboard'),
							(2,'Mouse'),
                            (3,'Book'),
                            (4,'Monitor');

select * from customer;

select * from products;

insert into products values (null ,'Pen');

-- ------------------------------------------------------------

-- ----------------------- Multiple foreign key -------------------------

create table users (
	id int primary key,
    first_name varchar(255),
    last_name varchar(255),
    age int,
    country varchar(255)
);

insert into users values (101,'John','Doe',25,'IND'),
						(102,'Joseph','Galler',25,'NYK'),
                        (103,'Ross','Galler',28,'Paris'),
                        (104,'San','Bing',56,'France');

create table transactions(
	transaction_id int primary key,
    amount int,
    seller int,
    buyer int,
    constraint fk_seller foreign key (seller) references users(id),
    constraint fk_buyer foreign key (buyer) references users(id)
);

insert into transactions values(1002030,2300,101,102);

-- this will be give an error insert into transactions values(10020,2300,101,105)	Error Code: 1452. Cannot add or update a child row: a foreign key constraint fails 
insert into transactions values(10020,2300,101,105);

insert into transactions values(10020,2300,101,104);

select * from transactions;

select * from users;







