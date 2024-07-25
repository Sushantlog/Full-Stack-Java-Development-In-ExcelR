-- -------------------  16/07/2024  ----------------------
select 20 + 30;

select 50-40;

select 15*5;

select 60/45;

select 90%15

create database myschema;

use myschema;

create table product_table(
	order_id int,
    item varchar(255),
    amount int,
    cust_id int
);

insert into product_table values(1,'keyboard',400,1001),
(2,'Mouse',500,1002),
(3,'Monitor',10000,1001),
(4,'keyboard',400,1003),
(5,'MousePad',250,1002);

select * from product_table;

select order_id,item,amount from product_table where cust_id = 1002;

-- task find out keyboard property
select order_id,item,amount from product_table where item = "keyboard";

select order_id,item,amount from product_table where amount < 400;

select order_id,item,amount from product_table where amount > 400;

select order_id,item,amount from product_table where amount <= 400;

select order_id,item,amount from product_table where amount >= 400;

select order_id,item,amount from product_table where amount != 400;

create table customers(
	cust_id int,
    first_name varchar(255),
    last_name varchar(255),
    age int,
    country varchar(255)
);

insert into customers values (101,'john','Doe',28,'USA'),
(102,'Robert','Luna',29,'USA'),
(103,'Divid','Robinson',22,'UK'),
(104,'John','Geller',26,'UK'),
(105,'Betty','Doe','28','UK');

select * from customers;

select first_name,last_name from customers where country = 'UK' 
and last_name = 'Doe' and first_name = 'john';

select first_name,last_name from customers where country = 'USA' 
and last_name = 'Doe';

select * from customers where country = 'USA' 
and last_name = 'Doe';

select first_name,last_name from customers where country = 'USA' 
or last_name = 'Doe';

-- ---------------------------

select first_name,last_name from customers where country = 'USA'
or age >= 22;

select first_name,last_name from customers where first_name = 'john'
or age > 25;

 -- ---------------- 
 
 select first_name,last_name from customers where not country = 'USA';

select * from customers where (country = 'USA' or country = 'UK') and age > 26;
 
select * from customers where (country = 'USA' or country = 'IND') and age > 26;

select * from customers where country != 'USA' and last_name = 'doe';

select * from customers where not country = 'USA' and not last_name = 'doe';

select first_name,last_name from customers where not country = 'USA';

select * from customers where not country = 'USA';

select * from customers;

select * from customers where (country = 'USA' or country = 'UK') and age >= 28; 

select * from customers where not (country = 'USA' and last_name = 'Doe'); 

select * from customers where not country = 'USA' and not last_name = 'Doe';

select * from customers where (not country = 'USA') and (not last_name = 'Doe');

-- task 

select * from customers;

insert into customers values(106,'Sushant','Patil',22,'USA');

select * from customers where (not country = 'UK') and (not age >= 25);

select * from customers where age <= 25 or country = 'UK';

select * from customers where country = 'USA' and last_name = 'luna';

-- -------------------------- 17/07/24 ---------------------------------------

use myschema;

select * from customers where age between 26 and 30;
-- both 26 and 30 will be included 

select * from customers where age not between 26 and 30;
-- both 26 and 30 will be excluded 

select * from customers;

select * from customers where first_name between 'B' and 'j';  
-- B is included and j is not included

-- ----------------------------------------
select * from customers where country like 'UK';

-- select customers whose last name start with R and end with t
-- or customers whose 

