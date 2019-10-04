-- begin CUBATEST_CUSTOMER
create table CUBATEST_CUSTOMER (
    ID integer not null,
    UUID varchar(36),
    --
    Name varchar(255),
    INN varchar(255),
    Type varchar(50),
    Email varchar(255),
    --
    primary key (ID)
)^
-- end CUBATEST_CUSTOMER
-- begin CUBATEST_INVENT_TABLE
create table CUBATEST_INVENT_TABLE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    primary key (ID)
)^
-- end CUBATEST_INVENT_TABLE
