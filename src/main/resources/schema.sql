use project;

drop table if exists post;
drop table if exists user;

create table user(
  id bigint primary key auto_increment,
  account varchar(100) not null unique,
  password varchar(100),
  name varchar(100),
  gender varchar(50),
  age varchar(50),
  created datetime default current_timestamp,
  updated datetime default current_timestamp on update current_timestamp
) default charset utf8mb4 engine=InnoDB;

create table post(
  id bigint primary key auto_increment,
  user_id bigint,
  writer varchar(100),
  title varchar(255),
  content text,
  recommedation bigint,
  views bigint,
  created datetime default current_timestamp,
  updated datetime default current_timestamp on update current_timestamp
) default charset utf8mb4 engine=InnoDB;