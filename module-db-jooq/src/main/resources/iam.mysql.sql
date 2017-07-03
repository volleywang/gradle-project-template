create database testdb;

CREATE USER name IDENTIFIED BY 'test';
SET PASSWORD FOR name=PASSWORD('test');

GRANT SELECT ON testdb.* TO test;


DROP TABLE IF EXISTS `sys_authentication`;
DROP TABLE IF EXISTS `info_user`;

CREATE TABLE `sys_authentication` (
    `auth_id` int NOT NULL,
    `auth_code` varchar(255) NOT NULL,
    `password` varchar(255) NOT NULL,

    CONSTRAINT pk_sys_authentication PRIMARY KEY (`auth_id`)
);

CREATE TABLE `info_user` (
    `user_id` int NOT NULL,
    `user_name` varchar(255) NOT NULL,
    `nick_name` varchar(255) DEFAULT NULL,
    `first_name` varchar(255) DEFAULT NULL,
    `last_name` varchar(255) DEFAULT NULL,
    `email` varchar(255) DEFAULT NULL,
    `mobile_number` varchar(255) DEFAULT NULL,


    CONSTRAINT pk_info_user PRIMARY KEY (`user_id`)
);