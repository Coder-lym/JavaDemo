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

 Date: 22/09/2018 20:22:56
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for emp
-- ----------------------------
DROP TABLE IF EXISTS `emp`;
CREATE TABLE `emp`  (
  `empno` int(4) NOT NULL,
  `ename` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `job` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `hiredate` date DEFAULT NULL,
  `salary` double(6, 2) DEFAULT NULL,
  PRIMARY KEY (`empno`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of emp
-- ----------------------------
INSERT INTO `emp` VALUES (1001, '孙悟空', '保安', '2018-01-01', 8000.00);
INSERT INTO `emp` VALUES (1002, '猪八戒', '司机', '2018-01-02', 6000.00);
INSERT INTO `emp` VALUES (1003, '沙僧', '秘书', '2018-01-10', 6000.00);
INSERT INTO `emp` VALUES (1004, '白龙马', '伙夫', '2018-01-08', 5000.00);
INSERT INTO `emp` VALUES (1005, '唐僧', '老板', '2017-12-01', 5000.00);
INSERT INTO `emp` VALUES (1006, '李世民', '总指挥', '2017-12-01', 5000.00);

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `salary` double(10, 2) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES (1, '梁玉民', 10000.00, 22);
INSERT INTO `employee` VALUES (2, '高亚良', 9000.00, 22);
INSERT INTO `employee` VALUES (3, '关键字', 4423.00, 20);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('梁玉民', 'lym');
INSERT INTO `user` VALUES ('高亚良', 'gyl');
INSERT INTO `user` VALUES ('高心怡', 'gxy');
INSERT INTO `user` VALUES ('计算机', 'jsj');
INSERT INTO `user` VALUES ('大北农', 'dbn');
INSERT INTO `user` VALUES ('齐玳萱', 'qdx');

SET FOREIGN_KEY_CHECKS = 1;
