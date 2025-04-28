-- liquibase formatted sql

-- changelog user2:1
create table Comment(
id serial,
author int,
authorImage text,
authorFirstName text,
createdAt int,
pk int,
"text" text
)

-- changelog user2:2
create table Announcements(
id serial,
author int,
image text,
pk int,
price int,
title text
)
-- changelog user2:3
create table "User"(
id serial,
email text,
firstName text,
lastName text,
phone text,
role text,
image text,
password text
)







