# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table employee (
  id                        varchar(255) not null,
  name                      varchar(255),
  constraint pk_employee primary key (id))
;

create sequence employee_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists employee;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists employee_seq;

