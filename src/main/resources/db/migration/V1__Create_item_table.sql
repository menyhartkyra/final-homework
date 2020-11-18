drop table if exists items;
create table items (
    id int primary key auto_increment,
    name varchar(100),
    description varchar(250),
    photo_url varchar(300),
    starting_price int,
    purchase_price int
);