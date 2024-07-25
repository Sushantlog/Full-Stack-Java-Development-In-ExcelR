-- 17/07/24

use myschema;

select * from customers;

insert into customers values (107,'parth','patil',30,'UK');

-- both 26 and 30 will be included
select * from customers where age between 26 and 30;

-- both 26 and 30 will be excluded
select * from customers where age not between 26 and 30;

select * from customers where first_name between 'B' and 'K';

-- it include the first alphabet but not the second alphabet 
select * from customers where first_name between 'B' and 'J'; -- B is included and J is not included

-- ------------------------------------
select * from customers where country like 'UK';

select * from customers where last_name like 'r%t' or last_name like '%e';

select * from customers where first_name like 'r%t' or last_name like '%e';

select * from customers where cust_id like 105;

select * from customers where cust_id like '1%5' or cust_id like '1%';

select * from customers where country not like 'USA';

insert into customers values (108,'Ujwala','Patil',21,'INDIA');

select * from customers where country not like 'INDIA';

-- --------------- IN Operator ----------------------------

select first_name,country from customers where country in ('USA','UK');

select first_name,country from customers where country in ("USA","UK");

select first_name,country from customers where 'USA' in (country);

-- ------------------ NOT IN Operator ----------------------
select first_name,country from customers where country not in ('USA','UK');


-- -------------------------- exists operator ---------------------------------

create table orders(
	order_id int,
    item varchar(255),
    amount int,
    cust_id int 
);

insert into orders values (1,'pen',10,101),
	(2,'Book',25,101),
    (3,'calculator',100,103),
    (4,'Pen-box','30',3),
    (5,'scale','10',3);

select * from orders;

select * from customers;

-- doute in this 101 is double but it will take only one value

select cust_id,first_name from customers 
	where exists(
    -- subquery
    select order_id from orders where orders.cust_id = customers.cust_id
    );
    
    
-- ------------------ IS NULL Operator ----------------------------

insert into customers values (109,'Piu','Patil',null,'INDIA'),
							(110,'Prachi','Patil',null,'INDIA');
                            
select * from customers;

select * from customers where age is null;

select * from customers where age is not null;



