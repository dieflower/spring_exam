/*
 Navicat Premium Data Transfer

 Source Server         : 123
 Source Server Type    : MySQL
 Source Server Version : 50528
 Source Host           : localhost:3306
 Source Schema         : exam

 Target Server Type    : MySQL
 Target Server Version : 50528
 File Encoding         : 65001

 Date: 24/04/2019 21:05:17
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for bill_type
-- ----------------------------
DROP TABLE IF EXISTS `bill_type`;
CREATE TABLE `bill_type`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of bill_type
-- ----------------------------
INSERT INTO `bill_type` VALUES (1, '不限');
INSERT INTO `bill_type` VALUES (2, '支出');
INSERT INTO `bill_type` VALUES (3, '收入');
INSERT INTO `bill_type` VALUES (4, '转账');
INSERT INTO `bill_type` VALUES (5, '借出');
INSERT INTO `bill_type` VALUES (6, '借入');
INSERT INTO `bill_type` VALUES (7, '还入');
INSERT INTO `bill_type` VALUES (8, '还出');

-- ----------------------------
-- Table structure for bills
-- ----------------------------
DROP TABLE IF EXISTS `bills`;
CREATE TABLE `bills`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `billtime` datetime DEFAULT NULL,
  `typeid` int(11) DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 29 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of bills
-- ----------------------------
INSERT INTO `bills` VALUES (1, '流水账', '2013-08-11 00:00:00', 1, 500, 'hao');
INSERT INTO `bills` VALUES (2, '2', '2019-03-05 00:00:00', 1, 213, '22');
INSERT INTO `bills` VALUES (3, 'd', '2019-03-05 15:59:42', 1, 222, '22');
INSERT INTO `bills` VALUES (4, '23', '2019-03-05 16:00:55', 1, 231, '321');
INSERT INTO `bills` VALUES (5, '213', '2019-03-05 16:02:36', 1, 213, '123');
INSERT INTO `bills` VALUES (6, 'saf', '2019-03-05 16:03:33', 1, 12312, '213');
INSERT INTO `bills` VALUES (7, '3424', '2019-03-05 16:04:24', 2, 3213, '213');
INSERT INTO `bills` VALUES (8, 'sda', '2019-03-05 16:05:51', 2, 231, '213');
INSERT INTO `bills` VALUES (9, '321', '2019-03-05 16:07:41', 3, 1232, '213');
INSERT INTO `bills` VALUES (10, '34', '2019-03-05 16:09:33', 2, 342, '342');
INSERT INTO `bills` VALUES (11, 'ewqr', '2019-03-05 16:09:53', 2, 4324, '324');
INSERT INTO `bills` VALUES (12, 'dafs', '2019-03-05 16:13:53', 1, 3421, '124');
INSERT INTO `bills` VALUES (13, 'sadf', '2019-03-05 16:14:29', 2, 41, '4321');
INSERT INTO `bills` VALUES (14, '213', '2019-03-05 16:14:40', 2, 123, '213');
INSERT INTO `bills` VALUES (15, '231', '2019-03-05 16:15:00', 2, 213, '213');
INSERT INTO `bills` VALUES (16, '3342', '2019-03-05 16:15:28', 2, 324, '324');
INSERT INTO `bills` VALUES (17, '432', '2019-03-05 16:16:03', 2, 324, '324');
INSERT INTO `bills` VALUES (18, '241', '2019-03-05 16:16:28', 2, 123, '213');
INSERT INTO `bills` VALUES (19, '24', '2019-03-05 16:18:50', 2, 213, '213');
INSERT INTO `bills` VALUES (20, 'sd', '2019-03-05 16:19:41', 2, 12, 'qwe');
INSERT INTO `bills` VALUES (21, 'qwe', '2019-03-05 16:21:37', 1, 213, '123');
INSERT INTO `bills` VALUES (22, '123', '2019-03-05 16:21:50', 2, 213, '213');
INSERT INTO `bills` VALUES (23, '123', '2019-03-05 16:22:11', 2, 123, '213');
INSERT INTO `bills` VALUES (24, '123', '2019-03-05 16:22:18', 2, 123, '213');
INSERT INTO `bills` VALUES (25, 'fds', '2019-03-05 21:14:10', 1, 123, '213');
INSERT INTO `bills` VALUES (26, '3', '2019-03-06 08:47:04', 2, 123, '231');
INSERT INTO `bills` VALUES (27, '21123', '2019-03-06 08:52:28', 2, 21, '321');
INSERT INTO `bills` VALUES (28, '11111111111', '2019-04-24 12:55:50', 1, 111, '111');

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user`  (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `loginname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `pwd` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES (1, 'pipi', 'pipi', '123456');

SET FOREIGN_KEY_CHECKS = 1;
