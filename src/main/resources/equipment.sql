/*
Navicat MySQL Data Transfer

Source Server         : csh
Source Server Version : 80011
Source Host           : localhost:3306
Source Database       : equipment

Target Server Type    : MYSQL
Target Server Version : 80011
File Encoding         : 65001

Date: 2019-01-16 23:31:38
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for alipayrecord
-- ----------------------------
DROP TABLE IF EXISTS `alipayrecord`;
CREATE TABLE `alipayrecord` (
  `id` varchar(16) NOT NULL,
  `merchantInfoId` varchar(16) NOT NULL COMMENT 'merchantInfo的id',
  `amount` int(16) NOT NULL COMMENT '交易的金额',
  `userId` varchar(16) NOT NULL COMMENT '用户的id',
  `username` varchar(32) DEFAULT NULL COMMENT '用户的昵称',
  `trado_no` varchar(64) DEFAULT NULL COMMENT '支付宝流水号',
  `buyer_logon_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '买家支付宝账号',
  `seller_email` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '卖家支付宝账号',
  `status` int(4) NOT NULL DEFAULT '0' COMMENT '0 初始状态 支付状态 1支付成功 2支付失败 3支付取消',
  `createTime` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `updateTime` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of alipayrecord
-- ----------------------------
INSERT INTO `alipayrecord` VALUES ('1000000144729953', '1000001074537641', '100000', '1000001715033763', '123456', null, null, null, '0', '2019-01-15 22:41:28', '2019-01-15 22:41:28');
INSERT INTO `alipayrecord` VALUES ('1000000206387988', '1000000768089096', '1', '1000001715033763', '123456', null, null, null, '0', '2019-01-16 22:35:23', '2019-01-16 22:35:23');
INSERT INTO `alipayrecord` VALUES ('1000000263075743', '1000001919623709', '200000', '1000001715033763', '123456', null, null, null, '1', '2019-01-15 22:54:51', '2019-01-15 22:54:51');
INSERT INTO `alipayrecord` VALUES ('1000000270720251', '1000001074537641', '100000', '1000001715033763', '123456', null, null, null, '0', '2019-01-15 22:38:36', '2019-01-15 22:38:36');
INSERT INTO `alipayrecord` VALUES ('1000000369881761', '1000000768089096', '1', '1000001715033763', '123456', null, null, null, '0', '2019-01-16 22:36:03', '2019-01-16 22:36:03');
INSERT INTO `alipayrecord` VALUES ('1000000634077635', '1000001074537641', '2000', '1000001715033763', '123456', null, null, null, '0', '2019-01-16 00:04:41', '2019-01-16 00:04:41');
INSERT INTO `alipayrecord` VALUES ('1000001010911765', '1000001074537641', '100000', '1000001715033763', '123456', null, null, null, '0', '2019-01-15 22:27:04', '2019-01-15 22:27:04');
INSERT INTO `alipayrecord` VALUES ('1000001059968898', '1000000768089096', '1', '1000001715033763', '123456', null, null, null, '0', '2019-01-16 23:06:28', '2019-01-16 23:06:28');
INSERT INTO `alipayrecord` VALUES ('1000001352136133', '1000001074537641', '2000', '1000001715033763', '123456', null, null, null, '0', '2019-01-16 21:33:10', '2019-01-16 21:33:10');
INSERT INTO `alipayrecord` VALUES ('1000001401117110', '1000001074537641', '20', '1000001715033763', '123456', null, null, null, '1', '2019-01-15 22:53:10', '2019-01-15 22:53:10');
INSERT INTO `alipayrecord` VALUES ('1000001454100595', '1000001074537641', '2000', '1000001715033763', '123456', null, '2088102176811043', '2088102177379542', '1', '2019-01-15 23:58:23', '2019-01-15 23:58:23');
INSERT INTO `alipayrecord` VALUES ('1000001600900227', '1000000768089096', '1', '1000001715033763', '123456', null, 'hyi***@sandbox.com', 'klkycu1192@sandbox.com', '1', '2019-01-16 23:11:47', '2019-01-16 23:11:47');
INSERT INTO `alipayrecord` VALUES ('1000001630609183', '1000001074537641', '20', '1000001715033763', '123456', null, null, null, '1', '2019-01-15 22:47:51', '2019-01-15 22:47:51');
INSERT INTO `alipayrecord` VALUES ('1000001638062207', '1000001074537641', '100000', '1000001715033763', '123456', null, null, null, '0', '2019-01-15 22:43:57', '2019-01-15 22:43:57');
INSERT INTO `alipayrecord` VALUES ('1000001651358020', '1000000768089096', '1', '1000001715033763', '123456', null, '136****3334', '13400578159@163.com', '1', '2019-01-16 22:48:31', '2019-01-16 22:48:31');
INSERT INTO `alipayrecord` VALUES ('1000001713201669', '1000000768089096', '1', '1000001715033763', '123456', null, null, null, '0', '2019-01-16 23:07:12', '2019-01-16 23:07:12');
INSERT INTO `alipayrecord` VALUES ('1000001760509171', '1000000768089096', '1', '1000001715033763', '123456', null, '136****3334', '13400578159@163.com', '1', '2019-01-16 22:53:27', '2019-01-16 22:53:27');
INSERT INTO `alipayrecord` VALUES ('1000001761420106', '1000001074537641', '20', '1000001715033763', '123456', null, null, null, '1', '2019-01-15 22:44:08', '2019-01-15 22:44:08');
INSERT INTO `alipayrecord` VALUES ('1000001933443185', '1000001074537641', '100000', '1000001715033763', '123456', null, null, null, '0', '2019-01-15 22:37:45', '2019-01-15 22:37:45');
INSERT INTO `alipayrecord` VALUES ('1000001984151959', '1000001074537641', '2000', '1000001715033763', '123456', null, 'hyi***@sandbox.com', 'acqnfn5010@sandbox.com', '1', '2019-01-16 00:04:46', '2019-01-16 00:04:46');
INSERT INTO `alipayrecord` VALUES ('1000002121015858', '1000001074537641', '2000', '1000001715033763', '123456', null, 'hyi***@sandbox.com', 'acqnfn5010@sandbox.com', '1', '2019-01-16 00:06:35', '2019-01-16 00:06:35');

-- ----------------------------
-- Table structure for equipment
-- ----------------------------
DROP TABLE IF EXISTS `equipment`;
CREATE TABLE `equipment` (
  `id` varchar(16) NOT NULL,
  `equipmentName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '装备名称',
  `equipmentDesc` varchar(255) DEFAULT '' COMMENT '装备描述',
  `pic` varchar(255) DEFAULT NULL,
  `count` int(11) NOT NULL COMMENT '装备金额',
  `createTime` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `updateTime` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

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
  `merchantPrivateKey` varchar(5000) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '应用私钥',
  `alipayPublicKey` varchar(5000) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '支付宝公钥',
  `equimentId` varchar(255) NOT NULL,
  `mostTimes` int(4) DEFAULT '0' COMMENT '最大成交次数',
  `successTimes` int(4) DEFAULT '0' COMMENT '已经成交的次数，最大次数不能超过mostTimes',
  `createTime` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `updateTime` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `merchantEquipmentId` (`equimentId`),
  CONSTRAINT `merchantEquipmentId` FOREIGN KEY (`equimentId`) REFERENCES `equipment` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

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
  `productName` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '卖点',
  `subProductName` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '子卖点，子描述',
  `maxAmount` int(16) NOT NULL COMMENT '每日交易最大金额',
  `successAmount` int(16) DEFAULT '0' COMMENT '已经成交金额数',
  `createTime` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `updateTime` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of merchantinfo
-- ----------------------------
INSERT INTO `merchantinfo` VALUES ('1000000768089096', '2016092200572415', '111', 'http://cshweixin.free.idcfengye.com/alipay/result', '111', '123', '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', 'LOL充值', '正式的key', '400000', '12', '2019-01-16 22:33:43', '2019-01-16 23:11:09');

-- ----------------------------
-- Table structure for record
-- ----------------------------
DROP TABLE IF EXISTS `record`;
CREATE TABLE `record` (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商户订单号 ',
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1000001715033763', '123456', 'xvBXuGWElC5BVDX/sfqT1A==', '2018-12-20 15:39:53', '2018-12-20 15:39:53');
INSERT INTO `user` VALUES ('1000001847897435', '111111', 'lueSGJZetyySpUndWjMBEg==', '2018-12-19 23:08:13', '2018-12-19 23:08:13');
INSERT INTO `user` VALUES ('1000001964638596', '000', 'xvBXuGWElC5BVDX/sfqT1A==', '2018-12-22 18:48:22', '2018-12-22 18:48:22');
