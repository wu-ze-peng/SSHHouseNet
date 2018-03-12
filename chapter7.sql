--用户表
create table users(
       id number(4) primary key,   --主键  id
       name nvarchar2(50) not null,      --用户名
       password nvarchar2(50)，          --密码
       telephone nvarchar2(15),         --电话
       username nvarchar2(50),          --姓名
       isadmin nvarchar2(5)             --是否是管理员
);
--房屋类型表
create table type(
       id number(4) primary key,
       name nvarchar2(50) not null       --类型名称
);
--区县表
create table district(
       id number(4) primary key,
       name nvarchar2(50) not null
);
--街道表
create table street(
       id number(4) primary key,
       name nvarchar2(50) not null,
       district_id number(4)
);
--房屋信息表
create table house(
       id number(6) primary key,
       title nvarchar2(50),              --标题
       description nvarchar2(2000),      --描述
       price number(6),                  --价格
       pubdate date,                     --发布时间
       floorage number(4),               --面积
       contact nvarchar2(100),           --联系人
       user_id number(4),                
       type_id number(4),
       street_id number(4)
);

--创建序列
create sequence seq_user_id;
create sequence seq_type_id;
create sequence seq_district_id;
create sequence seq_street_id;
create sequence seq_house_id;


select * from users;
select * from type;
select * from street;
select * from district;
select * from house;
insert into users values(1,'李阳','asdf','13213232334','asdf','否');
insert into users values(3,'李四','asdf','13213232334','asdf','否');
insert into users values(2,'张三','asdf','13213232334','asdf','是');
insert into users values(4,'王五','asdf','13213232334','asdf','是');
insert into type values(1,'一房一厅');
insert into type values(2,'两房一厅');
insert into type values(3,'三房两厅');
insert into type values(4,'单房');
insert into district values(1,'罗湖');
insert into district values(2,'布吉');
insert into district values(3,'福永');
insert into district values(4,'龙岗');
insert into district values(5,'宝安');
insert into district values(6,'坪山');
insert into street values(1,'新桥',5);
insert into street values(2,'沙湾',2);
insert into street values(3,'罗笋',3);
insert into street values(4,'飞西',6);
insert into street values(5,'平湖',4);
insert into street values(6,'东门',1);
insert into house values(1,'东门','一房一厅',2500,sysdate,100,'李阳',1,1,6);
insert into house values(2,'新桥','两房一厅',2000,sysdate,150,'李四',2,2,1);
insert into house values(3,'罗笋','两房一厅',3500,sysdate,175,'张三',3,2,3);
insert into house values(4,'飞西','三房两厅',2000,sysdate,200,'王五',4,3,4);
insert into house values(5,'平湖','三房两厅',3500,sysdate,210.23,'王五',4,3,5);
insert into house values(6,'平湖','单房',700,sysdate,75,'张三',3,4,5);
insert into house values(7,'飞西','单房',1500,sysdate,85,'张三',3,4,4);

