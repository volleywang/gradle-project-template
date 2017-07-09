

DROP TABLE IF EXISTS `sys_authentication`;
DROP TABLE IF EXISTS `inf_user`;

CREATE TABLE `sys_authentication` (
    `auth_id` char(32) NOT NULL,
    `auth_code` varchar(255) NOT NULL,
    `password` varchar(255) NOT NULL,

    CONSTRAINT pk_sys_authentication PRIMARY KEY (`auth_id`)
);

CREATE TABLE `inf_user` (
    `user_id` char(32) NOT NULL,
    `user_name` varchar(255) NOT NULL,
    `nick_name` varchar(255) DEFAULT NULL,
    `first_name` varchar(255) DEFAULT NULL,
    `last_name` varchar(255) DEFAULT NULL,
    `email` varchar(255) DEFAULT NULL,
    `mobile_number` varchar(255) DEFAULT NULL,


    CONSTRAINT pk_inf_user PRIMARY KEY (`user_id`)
);