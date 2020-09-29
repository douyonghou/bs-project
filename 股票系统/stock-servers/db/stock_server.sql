/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1_3306
Source Server Version : 50720
Source Host           : 127.0.0.1:3306
Source Database       : stock_server

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2020-05-28 01:46:29
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `stock_server`
-- ----------------------------
DROP TABLE IF EXISTS `stock_server`;
CREATE TABLE `stock_server` (
  `users` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `user_id` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `stock_id` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `stock_price` double(10,0) DEFAULT NULL,
  `stock_number` int(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of stock_server
-- ----------------------------
INSERT INTO `stock_server` VALUES ('dyh', '001', '600688', '2020-05-13 18:58:13', '15', '100');
INSERT INTO `stock_server` VALUES ('dyh', '001', '600601', '2020-03-04 18:58:37', '33', '99');
INSERT INTO `stock_server` VALUES ('dyh', '001', '600030', '2019-07-25 18:59:01', '51', '9');

-- ----------------------------
-- Table structure for `user_account`
-- ----------------------------
DROP TABLE IF EXISTS `user_account`;
CREATE TABLE `user_account` (
  `user_id` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `account_balance` int(4) DEFAULT NULL,
  `last_modify` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of user_account
-- ----------------------------

-- ----------------------------
-- Table structure for `user_info`
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `user_id` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `user` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `password` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `name` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `sex` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `birthday` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `email` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `telephone` varchar(11) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of user_info
-- ----------------------------
INSERT INTO `user_info` VALUES ('001', 'dyh', '123', 'dyh', '1', '1990-1', 'dyh@163.com', '18406504309');
INSERT INTO `user_info` VALUES ('92668751', 'admin', 'asd', 'asd', '1', '1990-1', '1059433980@qq.com', '18406504309');
INSERT INTO `user_info` VALUES ('3478592', 'qqqq', 'qqqq', 'qqqq', '1', '1990-1', 'aaa@163.com', '18406504309');
INSERT INTO `user_info` VALUES ('3098654', 'dyh1', 'ddd', 'ddd', '1', '1990-1', '1059433980@qq.com', '18406504309');
INSERT INTO `user_info` VALUES ('96321', 'aaa', 'aaa', 'aaaa', '1', '1990-1', 'aaa@163.com', '18406504309');
INSERT INTO `user_info` VALUES ('118167', 'www', 'wwww', 'wwwww', '1', '1990-1', 'aaa@163.com', '18406504309');
INSERT INTO `user_info` VALUES ('107244', 'lll', 'lll', 'lll', '1', '1990-1', 'aaa@163.com', '18406504309');
