DROP TABLE IF EXISTS `t_student`;

CREATE TABLE `t_student`
(
	id BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
	name VARCHAR(30) NULL DEFAULT NULL COMMENT '姓名',
	age INT(11) NULL DEFAULT NULL COMMENT '年龄',
	addr VARCHAR(50) NULL DEFAULT NULL COMMENT '地址',
	PRIMARY KEY (id)
);