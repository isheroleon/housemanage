/*
Navicat MySQL Data Transfer

Source Server         : yl
Source Server Version : 50629
Source Host           : 127.0.0.1:3306
Source Database       : zufang

Target Server Type    : MYSQL
Target Server Version : 50629
File Encoding         : 65001

Date: 2017-02-25 23:09:34
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_build
-- ----------------------------
DROP TABLE IF EXISTS `t_build`;
CREATE TABLE `t_build` (
  `buildId` int(11) NOT NULL,
  `blocaltion` varchar(255) DEFAULT NULL,
  `bprice` decimal(10,2) DEFAULT NULL,
  `bstatus` varchar(255) DEFAULT NULL,
  `bphone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`buildId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of t_build
-- ----------------------------

-- ----------------------------
-- Table structure for t_customer
-- ----------------------------
DROP TABLE IF EXISTS `t_customer`;
CREATE TABLE `t_customer` (
  `customerId` int(11) NOT NULL AUTO_INCREMENT,
  `cname` varchar(255) DEFAULT NULL,
  `csex` varchar(255) DEFAULT NULL,
  `cemail` varchar(255) DEFAULT NULL,
  `cphone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`customerId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of t_customer
-- ----------------------------

-- ----------------------------
-- Table structure for t_employee
-- ----------------------------
DROP TABLE IF EXISTS `t_employee`;
CREATE TABLE `t_employee` (
  `employeeId` int(11) NOT NULL AUTO_INCREMENT,
  `ename` varchar(255) DEFAULT NULL,
  `esex` varchar(255) DEFAULT NULL,
  `eage` int(3) DEFAULT NULL,
  `ephone` varchar(255) DEFAULT NULL,
  `emoney` decimal(10,0) DEFAULT NULL,
  `ewokerage` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`employeeId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of t_employee
-- ----------------------------

-- ----------------------------
-- Table structure for t_news
-- ----------------------------
DROP TABLE IF EXISTS `t_news`;
CREATE TABLE `t_news` (
  `nwesId` int(11) NOT NULL AUTO_INCREMENT,
  `ncontext` varchar(255) DEFAULT NULL,
  `ntitle` varchar(255) DEFAULT NULL,
  `nstatus` varchar(255) DEFAULT NULL,
  `nname` varchar(255) DEFAULT NULL,
  `nphone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`nwesId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of t_news
-- ----------------------------

-- ----------------------------
-- Table structure for t_permission
-- ----------------------------
DROP TABLE IF EXISTS `t_permission`;
CREATE TABLE `t_permission` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `permissionName` varchar(50) DEFAULT NULL,
  `roleId` int(11) DEFAULT NULL,
  `uri` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `nfatherId` int(11) DEFAULT NULL,
  `isMenu` int(2) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `roleId` (`roleId`),
  CONSTRAINT `t_permission_ibfk_1` FOREIGN KEY (`roleId`) REFERENCES `t_role` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_permission
-- ----------------------------
INSERT INTO `t_permission` VALUES ('1', '', '1', '', '基础数据管理', '0', '0');
INSERT INTO `t_permission` VALUES ('2', 'userManger', '1', '/user/userSearch.do', '用户管理', '1', '1');
INSERT INTO `t_permission` VALUES ('3', 'employeeManger', '1', '/employee/employeeSearch.do', '员工管理', '1', '1');
INSERT INTO `t_permission` VALUES ('4', 'customerManger', '1', '/customer/customerSearch.do', '客户管理', '1', '1');
INSERT INTO `t_permission` VALUES ('5', 'buildManger', '1', '/build/buildSearch.do', '楼盘管理', '1', '1');
INSERT INTO `t_permission` VALUES ('6', null, '1', null, '出租管理', '0', '0');
INSERT INTO `t_permission` VALUES ('7', 'tenementManger', '1', '/tenement/tenementSearch.do', '出租信息管理', '6', '1');
INSERT INTO `t_permission` VALUES ('8', 'wantManger', '1', null, '求租信息管理', '6', '1');
INSERT INTO `t_permission` VALUES ('9', null, '1', null, '新闻管理', '0', '0');
INSERT INTO `t_permission` VALUES ('10', 'newsManger', '1', null, '新闻信息管理', '9', '1');
INSERT INTO `t_permission` VALUES ('11', 'newsInsert', '1', null, '添加新闻信息', '16', '1');
INSERT INTO `t_permission` VALUES ('12', 'wantInsert', '1', '/want/wantInsert.do', '添加求租信息', '16', '1');
INSERT INTO `t_permission` VALUES ('13', 'employeeInsert', '1', '/employee/employeeInsert.do', '添加员工信息', '16', '1');
INSERT INTO `t_permission` VALUES ('14', 'customerInsert', '1', '/customer/customerInsert.do', '添加客户信息', '16', '1');
INSERT INTO `t_permission` VALUES ('15', null, '1', null, '售房管理', '0', '0');
INSERT INTO `t_permission` VALUES ('16', null, '1', null, '添加信息管理', '0', '0');
INSERT INTO `t_permission` VALUES ('17', 'sellHouseManger', '1', '/sellHouse/sellHouseSearch.do', '售房信息管理', '15', '1');
INSERT INTO `t_permission` VALUES ('18', 'searchHouseManger', '1', '/searchHouseSearch.do', '个人寻房', '15', '1');
INSERT INTO `t_permission` VALUES ('19', 'sellHouseInsert', '1', null, '添加售房', '16', '1');
INSERT INTO `t_permission` VALUES ('20', 'searchHouseInsert', '1', null, '添加个人寻房', '16', '1');
INSERT INTO `t_permission` VALUES ('21', 'tenementInsert', '1', null, '添加出租房', '16', '1');
INSERT INTO `t_permission` VALUES ('22', 'buildInsert', '1', null, '添加楼盘', '16', '1');

-- ----------------------------
-- Table structure for t_role
-- ----------------------------
DROP TABLE IF EXISTS `t_role`;
CREATE TABLE `t_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `roleName` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_role
-- ----------------------------
INSERT INTO `t_role` VALUES ('1', 'admin');
INSERT INTO `t_role` VALUES ('2', 'teacher');

-- ----------------------------
-- Table structure for t_searchhouse
-- ----------------------------
DROP TABLE IF EXISTS `t_searchhouse`;
CREATE TABLE `t_searchhouse` (
  `searchhouseId` int(11) NOT NULL AUTO_INCREMENT,
  `saddress` varchar(255) DEFAULT NULL,
  `scontacts` varchar(255) DEFAULT NULL,
  `sprice` decimal(10,2) DEFAULT NULL,
  `sphone` varchar(255) DEFAULT NULL,
  `stype` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`searchhouseId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of t_searchhouse
-- ----------------------------

-- ----------------------------
-- Table structure for t_sellhouse
-- ----------------------------
DROP TABLE IF EXISTS `t_sellhouse`;
CREATE TABLE `t_sellhouse` (
  `sellHouseId` int(11) NOT NULL AUTO_INCREMENT,
  `sadress` varchar(255) DEFAULT NULL,
  `scontacts` varchar(255) DEFAULT NULL,
  `sstatus` varchar(255) DEFAULT NULL,
  `sprice` decimal(10,2) DEFAULT NULL,
  `sphone` varchar(255) DEFAULT NULL,
  `stype` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`sellHouseId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of t_sellhouse
-- ----------------------------

-- ----------------------------
-- Table structure for t_tenement
-- ----------------------------
DROP TABLE IF EXISTS `t_tenement`;
CREATE TABLE `t_tenement` (
  `tenementId` int(11) NOT NULL,
  `taddress` varchar(255) DEFAULT NULL,
  `tcontacts` varchar(255) DEFAULT NULL,
  `tprice` decimal(10,2) DEFAULT NULL,
  `tphone` varchar(255) DEFAULT NULL,
  `tpriceType` varchar(255) DEFAULT NULL,
  `ttype` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`tenementId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of t_tenement
-- ----------------------------

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(20) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  `roleId` int(11) DEFAULT NULL,
  `email` varchar(20) DEFAULT NULL,
  `phone` varchar(11) DEFAULT NULL,
  `realName` varchar(8) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `sex` int(2) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `roleId` (`roleId`),
  CONSTRAINT `t_user_ibfk_1` FOREIGN KEY (`roleId`) REFERENCES `t_role` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', 'admin', '123456', '1', null, null, null, null, null);
INSERT INTO `t_user` VALUES ('2', 'aaa', '12345', '2', null, null, null, null, null);
INSERT INTO `t_user` VALUES ('3', 'bbb', '12345', null, null, null, null, null, null);
INSERT INTO `t_user` VALUES ('4', 'ccc', '12345', null, null, null, null, null, null);

-- ----------------------------
-- Table structure for t_want
-- ----------------------------
DROP TABLE IF EXISTS `t_want`;
CREATE TABLE `t_want` (
  `wantId` int(11) NOT NULL AUTO_INCREMENT,
  `waddress` varchar(255) DEFAULT NULL,
  `wcontacts` varchar(255) DEFAULT NULL,
  `wprice` decimal(10,2) DEFAULT NULL,
  `wphone` varchar(255) DEFAULT NULL,
  `wpricetype` varchar(255) DEFAULT NULL,
  `wtype` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`wantId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of t_want
-- ----------------------------
