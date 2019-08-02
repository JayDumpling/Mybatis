create table user
(
  id      int unsigned auto_increment
    primary key,
  name    varchar(64)  default '' not null,
  dept    varchar(254) default '' not null,
  website varchar(254) default '' null,
  phone   varchar(16)  default '' not null
)
  charset = utf8;


