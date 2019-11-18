SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
`name` varchar(255) NOT NULL COMMENT '名称',
`pid` bigint(20) NOT NULL COMMENT '上级部门',
`create_time` datetime DEFAULT NULL,
`enabled` bit(1) NOT NULL,
PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

INSERT INTO `dept` VALUES ('1', 'ali', '0', '2019-03-25 09:14:05', '1');
