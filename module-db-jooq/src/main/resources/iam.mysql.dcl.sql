create database testdb;

CREATE USER name IDENTIFIED BY 'test';
SET PASSWORD FOR name=PASSWORD('test');

GRANT SELECT ON testdb.* TO test;
