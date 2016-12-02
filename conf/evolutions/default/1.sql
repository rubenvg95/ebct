# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table token (
  token                         varchar(255) not null,
  user_id                       bigint,
  type                          varchar(8),
  date_creation                 timestamp,
  email                         varchar(255),
  constraint ck_token_type check (type in ('password','email')),
  constraint pk_token primary key (token)
);

create table user (
  id                            bigint not null,
  email                         varchar(255),
  name                          varchar(255),
  surname                       varchar(255),
  is_artist                     boolean,
  confirmation_token            varchar(255),
  password_hash                 varchar(255),
  date_creation                 timestamp,
  validated                     boolean,
  constraint uq_user_email unique (email),
  constraint uq_user_name unique (name),
  constraint uq_user_surname unique (surname),
  constraint pk_user primary key (id)
);
create sequence user_seq;


# --- !Downs

drop table if exists token;

drop table if exists user;
drop sequence if exists user_seq;

