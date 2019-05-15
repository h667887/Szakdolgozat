# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table coupon (
  id                            integer not null,
  discount                      float not null,
  image_got                     varchar(255),
  image_none                    varchar(255),
  description                   varchar(255),
  constraint pk_coupon primary key (id)
);

create table coupon_user (
  id                            integer not null,
  coupon_id                     integer not null,
  user_id                       varchar(255),
  constraint pk_coupon_user primary key (id)
);

create table ingredient (
  id                            integer not null,
  name                          varchar(255),
  image_path                    varchar(255),
  price                         float not null,
  quantity                      integer not null,
  constraint pk_ingredient primary key (id)
);

create table ingredient_product (
  id                            integer not null,
  product_id                    integer not null,
  ingredient_id                 integer not null,
  constraint pk_ingredient_product primary key (id),
  foreign key (product_id) references product (id) on delete restrict on update restrict
);

create table message (
  id                            integer not null,
  date                          varchar(255),
  text                          varchar(255),
  constraint pk_message primary key (id)
);

create table orders (
  id                            integer not null,
  user                          varchar(255),
  product_id                    integer not null,
  full_name                     varchar(255),
  address                       varchar(255),
  phone_number                  varchar(255),
  email                         varchar(255),
  is_ordered                    integer(1) default 0 not null,
  is_delivered                  integer(1) default 0 not null,
  date                          varchar(255),
  constraint pk_orders primary key (id)
);

create table product (
  id                            integer not null,
  image_path                    varchar(255),
  not_avail_image_path          varchar(255),
  name                          varchar(255),
  price                         float not null,
  type_p                        varchar(255),
  size                          integer not null,
  multiplier                    float not null,
  unique_p                      integer(1) default 0 not null,
  description                   varchar(255),
  quantity                      integer not null,
  constraint pk_product primary key (id)
);

create table user (
  email                         varchar(255) not null,
  username                      varchar(255),
  password                      varchar(255),
  admin                         integer(1) default 0 not null,
  image_path                    varchar(255),
  rang_path                     varchar(255),
  full_name                     varchar(255),
  address                       varchar(255),
  phone_number                  varchar(255),
  token                         varchar(255),
  validity_date                 varchar(255),
  money_spent                   integer not null,
  constraint pk_user primary key (email)
);


# --- !Downs

drop table if exists coupon;

drop table if exists coupon_user;

drop table if exists ingredient;

drop table if exists ingredient_product;

drop table if exists message;

drop table if exists orders;

drop table if exists product;

drop table if exists user;

