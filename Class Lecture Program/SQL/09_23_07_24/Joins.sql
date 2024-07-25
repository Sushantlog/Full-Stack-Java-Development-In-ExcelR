-- 23/04/24

-- ------------------------- Joins --------------------

use myschema;

select * from customers;

select * from orders;

-- join customers and orders tables based on cust_id of customers and cust_id from orders

select customers.cust_id,customers.first_name,orders.amount
	from customers
    join orders
    on customers.cust_id = orders.cust_id;
    
create table shippings(
	shipping_id int,
    status varchar(255),
    cust_id int
);

insert into shippings values (1,'pending',101),
							(2,'Delivered',102),
                            (3,'Pending',103),
                            (4,'Delivered',101);

select * from shippings;

-- join three tables - customers,order,shippings

select customers.first_name,orders.item,shippings.status
	from customers   -- table 1
    join orders on customers.cust_id = orders.cust_id
    join shippings on customers.cust_id = shippings.cust_id;

-- befours on mention for table alieses and column alieses like fName,i,s
select customers.first_name as fName,orders.item as i,shippings.status as s
	from customers t1  -- table 1
    join orders as t2 on customers.cust_id = orders.cust_id       
    join shippings as t3 on customers.cust_id = shippings.cust_id;
    
    


