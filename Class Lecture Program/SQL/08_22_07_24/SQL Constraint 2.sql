-- 22/07/24

-- -------------- Check Constraint ----------------------------
use myschema;

create table orders_table(
	order_id int primary key,
    amount int check(amount < 10000)
);

-- -----------------  or ------------------------

-- with name
create table orders_table(
	order_id int primary key,
    amount int, 
    constraint amountCK check(amount < 10000) -- with name
);

select * from orders_table;

insert into orders_table values (1,5000),
								(2,6000),
                                (3,4500),
                                (4,5600);

-- this will give an error Check constraint 'orders_table_chk_1' is violated.
insert into orders_table values (5,45000);

-- adding check constraint to product_table
alter table product_table add check (amount > 0); -- without name
                                
alter table product_table add constraint amountCK check (amount > 0); -- with name

-- this will give an error Check constraint 'product_table_chk_1' is violated.
insert into product_table values (1001,'Cubboard',-2000,1);
                                
-- remove the constraint 
alter table product_table drop check amountCK;


-- -------------- Default constraint ----------------------

create table schools(
	school_id int primary key,
    school_name varchar(255),
    school_country varchar(20) default 'IND'
);

insert into schools values(101,'JNV','US'),
						(102,'KV','IND');
                        
select * from schools;

insert into schools(school_id,school_name) 
				values(103,'Rotary'); -- add default IND school_contry (it will consider defalult value - IND)
                
insert into schools(school_id) values (104); -- it will add null and IND

-- using alter add default constraint to the college table 
alter table colleges 
	alter college_name set default 'others';    
-- colleges is table name & college_name is column name

-- removing the constraint 
alter table colleges alter college_name drop default;


-- ------------------------- Index Constraint ---------------------
-- create index constraint

create index college_index on colleges(college_code);

create unique index school_index on schools(school_id);

select * from schools;

-- drop index
alter table schools drop index school_index;










                                
                                
                                