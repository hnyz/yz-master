/*
Navicat MySQL Data Transfer

Source Server         : bendi
Source Server Version : 50132
Source Host           : localhost:3306
Source Database       : yzgaming

Target Server Type    : MYSQL
Target Server Version : 50132
File Encoding         : 65001

Date: 2017-11-23 08:52:55
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `yz_banner_image`
-- ----------------------------
DROP TABLE IF EXISTS `yz_banner_image`;
CREATE TABLE `yz_banner_image` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `image_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '图片名称(带后缀名)',
  `image_url` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '点击图片跳转链接',
  `image_title` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '图片说明(banner下方文字)',
  `type` tinyint(4) DEFAULT NULL COMMENT '属于那个端(0，共用，1,PC客户端，2，APP，3微信端)',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='横幅图表\r\n';

-- ----------------------------
-- Records of yz_banner_image
-- ----------------------------

-- ----------------------------
-- Table structure for `yz_join_academy`
-- ----------------------------
DROP TABLE IF EXISTS `yz_join_academy`;
CREATE TABLE `yz_join_academy` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `user_id` int(11) DEFAULT NULL COMMENT '用户ID',
  `academy_id` int(11) DEFAULT NULL COMMENT '武堂ID',
  `join_time` datetime DEFAULT NULL COMMENT '加入时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_user_academy` (`user_id`,`academy_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='讲武堂入学表';

-- ----------------------------
-- Records of yz_join_academy
-- ----------------------------
INSERT INTO `yz_join_academy` VALUES ('1', '1', '1', '2017-10-30 01:01:59');
INSERT INTO `yz_join_academy` VALUES ('2', '1', '2', '2017-10-30 01:02:08');

-- ----------------------------
-- Table structure for `yz_match_info`
-- ----------------------------
DROP TABLE IF EXISTS `yz_match_info`;
CREATE TABLE `yz_match_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `match_name` varchar(125) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '赛事名称',
  `match_title` varchar(125) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '赛事标题',
  `sign_fee` int(11) DEFAULT NULL COMMENT '报名费用',
  `bonus_amount` int(11) DEFAULT NULL COMMENT '总奖金',
  `match_start_time` datetime DEFAULT NULL COMMENT '赛事开始时间',
  `match_end_time` datetime DEFAULT NULL COMMENT '赛事结束时间',
  `end_state` tinyint(1) DEFAULT '1' COMMENT '手动结束开关(1,开启，2，结束)',
  `match_rule_text` varchar(1000) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '比赛规则说明',
  `match_reward_text` varchar(1000) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '奖励规则说明',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='赛事主表';

-- ----------------------------
-- Records of yz_match_info
-- ----------------------------

-- ----------------------------
-- Table structure for `yz_military_academy`
-- ----------------------------
DROP TABLE IF EXISTS `yz_military_academy`;
CREATE TABLE `yz_military_academy` (
  `id` int(11) NOT NULL DEFAULT '0',
  `academy_name` varchar(125) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '名称',
  `academy_title` varchar(125) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '标题',
  `academy_image` varchar(125) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '背景图片 ',
  `academy_join_cost` decimal(10,0) DEFAULT NULL COMMENT '加入费用最低费用',
  `academy_reward_cost` decimal(10,0) DEFAULT NULL COMMENT '奖励金额',
  `academy_out_cost` decimal(10,0) DEFAULT NULL COMMENT '自动退出下限',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='奖武堂表';

-- ----------------------------
-- Records of yz_military_academy
-- ----------------------------

-- ----------------------------
-- Table structure for `yz_notice_info`
-- ----------------------------
DROP TABLE IF EXISTS `yz_notice_info`;
CREATE TABLE `yz_notice_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `notice_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '公告名称',
  `notice_title` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '公告标题',
  `notice_text` text COLLATE utf8_unicode_ci COMMENT '公告主内容',
  `notice_type` tinyint(4) DEFAULT NULL COMMENT '公告类型 (0,通用，1PC客户端，2，APP,3，微信)',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='平台公告表';

-- ----------------------------
-- Records of yz_notice_info
-- ----------------------------

-- ----------------------------
-- Table structure for `yz_prize_notice`
-- ----------------------------
DROP TABLE IF EXISTS `yz_prize_notice`;
CREATE TABLE `yz_prize_notice` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `user_id` int(11) DEFAULT NULL COMMENT '用户ID',
  `user_name` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '用户名',
  `game_grade` varchar(125) CHARACTER SET utf8 DEFAULT NULL COMMENT '游戏等级(如：璀璨的钻石3)',
  `game_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '游戏名',
  `game_area` varchar(125) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '游戏大区',
  `bonus_money` decimal(10,0) DEFAULT NULL COMMENT '奖励金',
  `prize_time` datetime DEFAULT NULL COMMENT '获奖时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='获奖通知表';

-- ----------------------------
-- Records of yz_prize_notice
-- ----------------------------

-- ----------------------------
-- Table structure for `yz_user_info`
-- ----------------------------
DROP TABLE IF EXISTS `yz_user_info`;
CREATE TABLE `yz_user_info` (
  `id` bigint(11) NOT NULL,
  `user_name` varchar(225) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '用户名',
  `user_password` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '登录密码',
  `user_mobile` varchar(15) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '手机号',
  `user_coming` tinyint(4) DEFAULT NULL COMMENT '来自哪里(1,PC客户端，2APP,3微信端)',
  `join_time` datetime DEFAULT NULL COMMENT '加入时间',
  `last_login_time` datetime DEFAULT NULL,
  `last_login_ip` varchar(125) COLLATE utf8_unicode_ci DEFAULT NULL,
  `last_login_type` tinyint(4) DEFAULT NULL COMMENT '最后登录类型(1，PC客户端，2安卓APP,3IosAPP,4,微信端)',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='用户表';

-- ----------------------------
-- Records of yz_user_info
-- ----------------------------
INSERT INTO `yz_user_info` VALUES ('1', '1', '111', '18877754', '1', '2017-11-07 23:46:43', '2017-11-13 23:46:46', '11', '11');
