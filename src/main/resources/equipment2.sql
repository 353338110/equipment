/*
Navicat MySQL Data Transfer

Source Server         : csh
Source Server Version : 80011
Source Host           : localhost:3306
Source Database       : equipment

Target Server Type    : MYSQL
Target Server Version : 80011
File Encoding         : 65001

Date: 2019-01-15 01:46:01
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for equipment
-- ----------------------------
DROP TABLE IF EXISTS `equipment`;
CREATE TABLE `equipment` (
  `id` varchar(16) NOT NULL,
  `equipmentName` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '' COMMENT '装备名称',
  `equipmentDesc` varchar(255) DEFAULT '' COMMENT '装备描述',
  `pic` varchar(255) DEFAULT NULL,
  `count` int(11) NOT NULL COMMENT '装备金额',
  `createTime` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `updateTime` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of equipment
-- ----------------------------
INSERT INTO `equipment` VALUES ('1000000605701629', 'hah', 'eeeee', '11', '2000', '2018-12-20 15:37:48', '2018-12-20 15:37:48');
INSERT INTO `equipment` VALUES ('1000000818700247', '装备名字', '测试描述', null, '1999', '2019-01-01 14:38:09', '2019-01-01 14:38:09');
INSERT INTO `equipment` VALUES ('1000001041755409', '装备一', '阿力的装备', null, '1000', null, null);
INSERT INTO `equipment` VALUES ('1000001751528136', '装备名字', '测试描述', null, '1999', '2018-12-31 20:39:50', '2018-12-31 20:39:50');
INSERT INTO `equipment` VALUES ('1000001955988430', '装备er', '阿力的装备', null, '1000', '2018-12-30 12:21:48', '2018-12-30 12:21:48');

-- ----------------------------
-- Table structure for merchant
-- ----------------------------
DROP TABLE IF EXISTS `merchant`;
CREATE TABLE `merchant` (
  `id` varchar(16) NOT NULL,
  `app_id` varchar(32) NOT NULL COMMENT '支付宝分配给开发者的应用ID ',
  `sign` varchar(344) NOT NULL COMMENT '商户请求参数的签名串',
  `notify_url` varchar(255) NOT NULL COMMENT '支付宝服务器主动通知商户服务器里指定的页面http/https路径',
  `app_auth_token` varchar(40) NOT NULL,
  `store_id` varchar(16) DEFAULT '123456' COMMENT '商户编号',
  `merchantPrivateKey` varchar(5000) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '应用私钥',
  `alipayPublicKey` varchar(5000) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '支付宝公钥',
  `equimentId` varchar(255) NOT NULL,
  `mostTimes` int(4) DEFAULT '0' COMMENT '最大成交次数',
  `successTimes` int(4) DEFAULT '0' COMMENT '已经成交的次数，最大次数不能超过mostTimes',
  `createTime` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `updateTime` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `merchantEquipmentId` (`equimentId`),
  CONSTRAINT `merchantEquipmentId` FOREIGN KEY (`equimentId`) REFERENCES `equipment` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of merchant
-- ----------------------------
INSERT INTO `merchant` VALUES ('1000000605701610', '2016092200572517', '1', 'http://cshweixin.free.idcfengye.com/alipay/result', '1', '123456', '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', '1000000605701629', '10', '6', '2018-12-31 19:59:47', '2018-12-31 19:59:47');
INSERT INTO `merchant` VALUES ('1000001977652757', '2016092200572517', '111', 'http://cshweixin.free.idcfengye.com/alipay/result', '1111', '112333', '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', '1000000605701629', '11', '0', '2018-12-31 21:59:44', '2018-12-31 21:59:44');

-- ----------------------------
-- Table structure for merchantinfo
-- ----------------------------
DROP TABLE IF EXISTS `merchantinfo`;
CREATE TABLE `merchantinfo` (
  `id` varchar(255) NOT NULL,
  `app_id` varchar(32) NOT NULL COMMENT '支付宝分配给开发者的应用ID ',
  `sign` varchar(344) NOT NULL COMMENT '商户请求参数的签名串',
  `notify_url` varchar(255) NOT NULL COMMENT '支付宝服务器主动通知商户服务器里指定的页面http/https路径',
  `app_auth_token` varchar(40) NOT NULL,
  `store_id` varchar(16) DEFAULT '123456' COMMENT '商户编号',
  `merchantPrivateKey` varchar(5000) NOT NULL COMMENT '应用私钥',
  `alipayPublicKey` varchar(5000) NOT NULL COMMENT '支付宝公钥',
  `


productName` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '卖点',
  `subProductName` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '子卖点，子描述',
  `maxAmount` int(16) NOT NULL COMMENT '每日交易最大金额',
  `successAmount` int(16) DEFAULT '0' COMMENT '已经成交金额数',
  `createTime` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `updateTime` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of merchantinfo
-- ----------------------------

-- ----------------------------
-- Table structure for record
-- ----------------------------
DROP TABLE IF EXISTS `record`;
CREATE TABLE `record` (
  `id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '商户订单号 ',
  `trade_no` varchar(64) DEFAULT NULL COMMENT '支付宝交易号 ',
  `euipmentId` varchar(255) NOT NULL,
  `userId` varchar(255) NOT NULL,
  `status` int(11) DEFAULT NULL COMMENT '支付状态 1支付成功 2支付失败 3支付取消',
  `createTime` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `updateTime` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `userId` (`userId`),
  KEY `equipmentId` (`euipmentId`),
  CONSTRAINT `equipmentId` FOREIGN KEY (`euipmentId`) REFERENCES `equipment` (`id`),
  CONSTRAINT `userId` FOREIGN KEY (`userId`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of record
-- ----------------------------
INSERT INTO `record` VALUES ('1000000366688187', null, '1000000605701629', '1000001715033763', '1', '2018-12-31 19:38:01', '2018-12-31 19:38:01');
INSERT INTO `record` VALUES ('1000000384183570', null, '1000000605701629', '1000001715033763', '1', '2018-12-31 19:59:50', '2018-12-31 19:59:50');
INSERT INTO `record` VALUES ('1000001037688030', null, '1000000605701629', '1000001715033763', '0', '2018-12-31 19:44:56', '2018-12-31 19:44:56');
INSERT INTO `record` VALUES ('1000001383559540', null, '1000000605701629', '1000001715033763', '0', '2019-01-01 14:38:37', '2019-01-01 14:38:37');
INSERT INTO `record` VALUES ('1000001417065061', null, '1000000605701629', '1000001715033763', '1', '2018-12-31 19:48:53', '2018-12-31 19:48:53');
INSERT INTO `record` VALUES ('1000001511641601', null, '1000000605701629', '1000001715033763', '1', '2018-12-31 20:18:41', '2018-12-31 20:18:41');
INSERT INTO `record` VALUES ('1000002011585658', null, '1000000605701629', '1000001715033763', '0', '2019-01-01 14:38:22', '2019-01-01 14:38:22');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` varchar(16) NOT NULL,
  `username` varchar(32) NOT NULL,
  `password` varchar(32) NOT NULL,
  `createTime` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `updateTime` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1000001715033763', '123456', 'xvBXuGWElC5BVDX/sfqT1A==', '2018-12-20 15:39:53', '2018-12-20 15:39:53');
INSERT INTO `user` VALUES ('1000001847897435', '111111', 'lueSGJZetyySpUndWjMBEg==', '2018-12-19 23:08:13', '2018-12-19 23:08:13');
INSERT INTO `user` VALUES ('1000001964638596', '000', 'xvBXuGWElC5BVDX/sfqT1A==', '2018-12-22 18:48:22', '2018-12-22 18:48:22');
