--  --------------------------- 18/07/24 --------------------------------------

use myschema;

select * from customers;

select max(age) from customers;

select min(age) from customers;

-- using the aliases like max_age
select max(age) as max_age from customers;

-- -----------------------------------

-- using MAX() and MIN() is nested select 
select * from customers where age = (select min(age) from customers);

 select * from customers where age = (select max(age) from customers);
 
 -- find out second minimum number 
 select min(age) from customers 
	where age not in (select min(age) from customers);

select * from customers;

-- -------------- count() --------------------

select count(*) from customers;

-- count of age column
select count(age) from customers;  -- return count except null values

select count(country) from customers;

select count(country) from customers where country = 'INDIA';

select count(country) as country_count from customers where country = 'INDIA';

-- count the unique countries in customers table 
select count(distinct country) from customers;

select * from customers;


-- count the number of customers in each country
select country, count(*) as customers from customers group by country;

select count(*) as customers from customers group by country;  -- check the how it works

-- ----------------- SQL SUM() Function ---------------------------

select * from orders;

select sum(amount) as total_sales from orders;

-- select the sum of amount of id 3 from orders
select sum(amount) as total_of_cust3 from orders where cust_id = 3;

-- ------------------ AVG() --------------------------
-- get average age of customers
select avg(age) as Average_age from customers;

-- select the average amount spent by each customers from the order table

select cust_id, avg(amount) as average_spends from orders group by cust_id;

-- --------------------- Use of having clause ------------------------

select * from customers;

-- it will be could not take any null value in age (not consider null age)

insert into customers values(111,'Sushant','Patil',22,'INDIA');

select count(age) as count,first_name 
	from customers group by first_name having count(age) > 1;
    
select count(age) as count,first_name 
	from customers group by first_name having count(age) = 1;

-- select the count of customers ids greater than 105 their corresponding
-- incompleted 

select count(cust_id) as count ,country
	from customers group by country having count(cust_id);
    
select * from orders;
    
-- select the count of order ids greater than 1 with their cust_id
select count(order_id),cust_id from orders 
	group by cust_id having count(order_id) > 1;




