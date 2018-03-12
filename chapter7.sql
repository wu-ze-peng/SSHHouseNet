--�û���
create table users(
       id number(4) primary key,   --����  id
       name nvarchar2(50) not null,      --�û���
       password nvarchar2(50)��          --����
       telephone nvarchar2(15),         --�绰
       username nvarchar2(50),          --����
       isadmin nvarchar2(5)             --�Ƿ��ǹ���Ա
);
--�������ͱ�
create table type(
       id number(4) primary key,
       name nvarchar2(50) not null       --��������
);
--���ر�
create table district(
       id number(4) primary key,
       name nvarchar2(50) not null
);
--�ֵ���
create table street(
       id number(4) primary key,
       name nvarchar2(50) not null,
       district_id number(4)
);
--������Ϣ��
create table house(
       id number(6) primary key,
       title nvarchar2(50),              --����
       description nvarchar2(2000),      --����
       price number(6),                  --�۸�
       pubdate date,                     --����ʱ��
       floorage number(4),               --���
       contact nvarchar2(100),           --��ϵ��
       user_id number(4),                
       type_id number(4),
       street_id number(4)
);

--��������
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
insert into users values(1,'����','asdf','13213232334','asdf','��');
insert into users values(3,'����','asdf','13213232334','asdf','��');
insert into users values(2,'����','asdf','13213232334','asdf','��');
insert into users values(4,'����','asdf','13213232334','asdf','��');
insert into type values(1,'һ��һ��');
insert into type values(2,'����һ��');
insert into type values(3,'��������');
insert into type values(4,'����');
insert into district values(1,'�޺�');
insert into district values(2,'����');
insert into district values(3,'����');
insert into district values(4,'����');
insert into district values(5,'����');
insert into district values(6,'ƺɽ');
insert into street values(1,'����',5);
insert into street values(2,'ɳ��',2);
insert into street values(3,'����',3);
insert into street values(4,'����',6);
insert into street values(5,'ƽ��',4);
insert into street values(6,'����',1);
insert into house values(1,'����','һ��һ��',2500,sysdate,100,'����',1,1,6);
insert into house values(2,'����','����һ��',2000,sysdate,150,'����',2,2,1);
insert into house values(3,'����','����һ��',3500,sysdate,175,'����',3,2,3);
insert into house values(4,'����','��������',2000,sysdate,200,'����',4,3,4);
insert into house values(5,'ƽ��','��������',3500,sysdate,210.23,'����',4,3,5);
insert into house values(6,'ƽ��','����',700,sysdate,75,'����',3,4,5);
insert into house values(7,'����','����',1500,sysdate,85,'����',3,4,4);

