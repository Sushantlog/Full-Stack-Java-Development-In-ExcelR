-- 25/07/24 
-- --------------------- Store Procedure ----------------------------

use myschema;

delimiter //
create procedure display_customer()
begin
select * from customers order by country;
end //

call display_customer;

-- drop procedure
drop procedure display_customer;

delimiter // 
create procedure uk_customers()
begin
select cust_id,first_name 
from customers
where country = 'UK';
end //

call uk_customers();

-- parameterized procedures

delimiter //
create procedure ctr_customers(ctr varchar(50))
begin
select cust_id,first_name
from customers
where country = ctr;
end //

call ctr_customers('UK');
call ctr_customers('INDIA');

-- create a procedure with cust_id and max_amount as parameter
select * from customers;
select * from orders;

-- Featching the maximum amount of customers
delimiter //
create procedure order_details (cust_id int,max_amt int)
begin
select customers.cust_id , customers.first_name , orders.amount
from customers
join orders
on customers.cust_id = orders.cust_id  -- join 
where customers.cust_id = cust_id and orders.amount < max_amt;  -- procedure
end //

call order_details(101,400);

-- create procedure which fetches the emp_name and manager_name for particular manager
select * from manager;
select * from employee;


delimiter //
create procedure emp_name(mgr_id varchar(20))
begin
select employee.emp_name , manager.manager_name 
from employee
join manager
on employee.managers_id = manager.manager_id
where employee.managers_id = mgr_id;
end //

drop procedure emp_name;

call emp_name('M4');
call emp_name('M1');















