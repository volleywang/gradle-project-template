DROP TABLE IF EXISTS `SYS_Authentication`;
DROP TABLE IF EXISTS `INFO_User`;

CREATE TABLE `SYS_Authentication` (
    `id` int NOT NULL,
    `auth_id` varchar(255) NOT NULL,
    `password` varchar(255) NOT NULL,

    CONSTRAINT pk_sys_authentication PRIMARY KEY (`id`)
);

CREATE TABLE `INFO_User` (
    `id` int NOT NULL,
    `user_name` varchar(255) NOT NULL,
    `nick_name` varchar(255) DEFAULT NULL,
    `first_name` varchar(255) DEFAULT NULL,
    `last_name` varchar(255) DEFAULT NULL,
    `email` varchar(255) DEFAULT NULL,
    `mobile_number` varchar(255) DEFAULT NULL,


    CONSTRAINT pk_info_user PRIMARY KEY (`id`)
);