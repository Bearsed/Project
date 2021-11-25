/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 80025
Source Host           : localhost:3306
Source Database       : brand

Target Server Type    : MYSQL
Target Server Version : 80025
File Encoding         : 65001

Date: 2021-11-25 11:26:18
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for brand
-- ----------------------------
DROP TABLE IF EXISTS `brand`;
CREATE TABLE `brand` (
  `id` bigint NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of brand
-- ----------------------------
INSERT INTO `brand` VALUES ('1', 'HTC');
INSERT INTO `brand` VALUES ('2', 'LG');
INSERT INTO `brand` VALUES ('3', 'TCL');
INSERT INTO `brand` VALUES ('4', '海尔');
INSERT INTO `brand` VALUES ('5', '海信');
INSERT INTO `brand` VALUES ('6', '华为');
INSERT INTO `brand` VALUES ('7', '华硕');
INSERT INTO `brand` VALUES ('8', '联想');

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `brand_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES ('1', 'HTC拉莫斯海油', '1');
INSERT INTO `product` VALUES ('2', 'LG脉冲', '2');
INSERT INTO `product` VALUES ('3', 'TCL马克', '3');
INSERT INTO `product` VALUES ('7', 'TCL安达尔', '3');
INSERT INTO `product` VALUES ('8', 'HTC拉莫', '2');
INSERT INTO `product` VALUES ('9', 'HTC拉莫斯', '4');
