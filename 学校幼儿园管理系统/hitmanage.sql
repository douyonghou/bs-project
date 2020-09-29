/*
Navicat MySQL Data Transfer

Source Server         : aly_mysql
Source Server Version : 50729
Source Host           : 101.200.235.134:3306
Source Database       : hitmanage

Target Server Type    : MYSQL
Target Server Version : 50729
File Encoding         : 65001

Date: 2020-06-28 22:12:05
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `discussion`
-- ----------------------------
DROP TABLE IF EXISTS `discussion`;
CREATE TABLE `discussion` (
  `discussion_id` int(11) NOT NULL AUTO_INCREMENT,
  `topic` varchar(100) NOT NULL,
  `name` varchar(100) NOT NULL,
  `teacher_id` varchar(100) DEFAULT NULL,
  `student_id` varchar(100) DEFAULT NULL,
  `teacher_words` varchar(200) DEFAULT NULL,
  `student_words` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`discussion_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of discussion
-- ----------------------------
INSERT INTO `discussion` VALUES ('2', '作业', '作业', '1', '1', '作业', '作业');
INSERT INTO `discussion` VALUES ('4', '??', '??', null, '1163710215', null, 'ww');
INSERT INTO `discussion` VALUES ('5', '??', '??', null, '1231231234', null, 'ok');
INSERT INTO `discussion` VALUES ('6', '??', '??', null, '1231231234', null, 'ok');
INSERT INTO `discussion` VALUES ('7', '??', '??', null, '1231231234', null, 'ok');

-- ----------------------------
-- Table structure for `student_info`
-- ----------------------------
DROP TABLE IF EXISTS `student_info`;
CREATE TABLE `student_info` (
  `id` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `year` int(11) NOT NULL,
  `phonenum` varchar(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student_info
-- ----------------------------
INSERT INTO `student_info` VALUES ('1152625346', '123456', 'ls', '2018', '15512931688');
INSERT INTO `student_info` VALUES ('1163710214', '123456', 'Anderson', '2018', '18846135525');
INSERT INTO `student_info` VALUES ('1163710215', '123456', '窦永厚', '2020', '18406504309');
INSERT INTO `student_info` VALUES ('1163710299', 'e10adc3949ba59abbe56e057f20f883e', 'dyh', '2015', '146246832');
INSERT INTO `student_info` VALUES ('1231231234', 'e10adc3949ba59abbe56e057f20f883e', 'thanks', '2018', '7363634');
INSERT INTO `student_info` VALUES ('1234567890', 'e10adc3949ba59abbe56e057f20f883e', 'qtde', '2016', '64243');
INSERT INTO `student_info` VALUES ('1545454534', '96e79218965eb72c92a549dd5a330112', 'tony', '2015', '4246432674');
INSERT INTO `student_info` VALUES ('1554651223', '123456', 'ww', '1976', '15512931688');

-- ----------------------------
-- Table structure for `subject`
-- ----------------------------
DROP TABLE IF EXISTS `subject`;
CREATE TABLE `subject` (
  `subject_id` varchar(100) NOT NULL,
  `subject_name` varchar(100) NOT NULL,
  `teacher_id` varchar(100) NOT NULL,
  `student_id` varchar(100) DEFAULT NULL,
  `score` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of subject
-- ----------------------------
INSERT INTO `subject` VALUES ('cs03', '体育', '20181234', '1163710215', '99');
INSERT INTO `subject` VALUES ('cs01', '手工', '20181234', '1163710215', '88');
INSERT INTO `subject` VALUES ('cs02', '画画', '20181235', '1163710216', '100');
INSERT INTO `subject` VALUES ('a', 'a', 'a', '', '0');
INSERT INTO `subject` VALUES ('a', 'a', 'a', '', '0');
INSERT INTO `subject` VALUES ('cs11', 'english', '20181234', '', '0');
INSERT INTO `subject` VALUES ('cs11', 'english', '20181234', '', '0');
INSERT INTO `subject` VALUES ('cs11', 'english', '20181234', '1231231234', '99');

-- ----------------------------
-- Table structure for `teacher_info`
-- ----------------------------
DROP TABLE IF EXISTS `teacher_info`;
CREATE TABLE `teacher_info` (
  `id` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `phonenum` varchar(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher_info
-- ----------------------------
INSERT INTO `teacher_info` VALUES ('20181234', 'e10adc3949ba59abbe56e057f20f883e', '张老师', '18406504309');
INSERT INTO `teacher_info` VALUES ('20181235', 'e10adc3949ba59abbe56e057f20f883e', '窦老师', '18406504309');

-- ----------------------------
-- Table structure for `TodayReci`
-- ----------------------------
DROP TABLE IF EXISTS `TodayReci`;
CREATE TABLE `TodayReci` (
  `todayReci_time` varchar(10) DEFAULT NULL,
  `todayReci_name` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of TodayReci
-- ----------------------------
INSERT INTO `TodayReci` VALUES ('2020-06-28', '土豆丝');
