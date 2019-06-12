create database bank;
use bank;
create table money(
id varchar(15),
name varchar(15),
age int(3),
tel varchar(20)
);
insert into member values('vorip', 'choi', 24, '01012341234');
insert into member values('gnoh', 'hong', 20, '01011112222');
insert into member values('han', 'hanyoung', 22, '01022221111');
insert into member values('hong', 'jong', 123, '01012341234');
update member set tel='12341234567' where id='han';
update member set tel='9999999999' where id='gnoh';
select * from member;
select * from member where id = 'vorip';
select * from member where id = 'gnoh';
delete from member where id='han';
delete from member where id='hong';