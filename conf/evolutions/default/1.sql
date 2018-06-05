# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table product (
  key                       bigint not null,
  name                      varchar(255),
  description               varchar(256),
  price                     integer,
  constraint pk_product primary key (key))
;

create sequence product_seq;




# --- !Downs

drop table if exists product cascade;

drop sequence if exists product_seq;

