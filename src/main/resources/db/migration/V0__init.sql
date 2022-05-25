create table JsonPayload
(
    name              varchar(127) primary key,
    rules             JSON                 not null,
    defaultValue      tinyint(1) default 0 not null
);
