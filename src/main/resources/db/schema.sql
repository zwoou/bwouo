
CREATE TABLE `sys_permission` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  `pid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
);


CREATE TABLE `sys_permission_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` int(11) DEFAULT NULL,
  `permisson_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `sys_role` (
  `role_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`role_id`)
);

CREATE TABLE `sys_user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
);

CREATE TABLE `sys_user_role` (
  `user_role_id` int(11) NOT NULL AUTO_INCREMENT,
  `sys_user_id` int(11) DEFAULT NULL,
  `sys_role_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`user_role_id`)
);
