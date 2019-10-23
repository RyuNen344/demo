drop table if exists todo;

create table if not exists todo (
    id bigint identity not null primary key,
    title varchar(100) not null,
    detail varchar(1000),
    image blob,
);