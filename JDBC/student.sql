/*
 Navicat Premium Data Transfer

 Source Server         : SQL
 Source Server Type    : MySQL
 Source Server Version : 50639
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 50639
 File Encoding         : 65001

 Date: 22/09/2018 20:22:28
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `Sno` int(10) NOT NULL,
  `Sname` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Ssex` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `Sage` int(10) DEFAULT NULL,
  `Sdept` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`Sno`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES (2015163001, '张伟鑫', '男', 22, '电子信息工程');
INSERT INTO `student` VALUES (2015163011, '高亚良', '女', 22, '信息管理与信息系统');
INSERT INTO `student` VALUES (2015163012, '高心怡', '女', 2, '家里蹲');
INSERT INTO `student` VALUES (2015163031, '杨世浩', '男', 21, '计算机科学与技术');
INSERT INTO `student` VALUES (2015163034, '刘亮州', '男', 23, 'JavaEE');
INSERT INTO `student` VALUES (2015163051, '齐玳萱', '男', 23, '信息管理与信息系统专业');
INSERT INTO `student` VALUES (2015163057, '梁玉民', '男', 22, '信息管理与信息系统');
INSERT INTO `student` VALUES (2015163058, '郝志鹏', '男', 22, '信息管理与信息系统');

SET FOREIGN_KEY_CHECKS = 1;
