
-- ----------------------------
-- Table structure for my_test
-- ----------------------------
DROP TABLE IF EXISTS `my_test`;
CREATE TABLE `my_test`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `name` varchar(255) NOT NULL COMMENT '名称',
  `remark` varchar(255) NULL DEFAULT NULL COMMENT '备注',
  `created_on` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `updated_on` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
);


INSERT INTO `my_test` VALUES ('1', 'leahoop', 'new customer', '2019-03-25 09:14:05', '2019-03-25 09:14:05');