
-- 1. Создать таблицу с гостями: name, email, phone (id само собой)
-- 2. Создать пользователя manager. Он может заносить данные в таблицу с гостями, а так же смотреть список гостей.
-- 3. Создать view guest_name. Должны быть только имена гостей.
-- 4. Создать пользователя guard. Он может только смотреть только guest_name.

create schema party;
create table party.guest(
	id serial primary key, 
	name varchar(100), 
	email varchar(100),
	phone varchar(20));

create user manager with password '1234';
grant select on party.guest to manager;
grant insert on party.guest to manager;

create or replace view party.guest_name as (select name from party.guest);
create user guard with password '1111';
grant select on party.guest_name to guard;
