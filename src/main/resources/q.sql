-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        8.0.11 - MySQL Community Server - GPL
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  10.2.0.5639
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- 导出 vehicle_management 的数据库结构
CREATE DATABASE IF NOT EXISTS `vehicle_management` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;
USE `vehicle_management`;

-- 导出  表 vehicle_management.car_accident 结构
CREATE TABLE IF NOT EXISTS `car_accident` (
  `accident_id` varchar(50) NOT NULL DEFAULT 'AUTO_INCREMENT',
  `car_id` varchar(50) NOT NULL DEFAULT '0',
  `accident_time` date DEFAULT NULL,
  `accident_site` varchar(50) NOT NULL DEFAULT '0' COMMENT '地点',
  `accident_type` varchar(50) NOT NULL DEFAULT '0',
  `accident_status` varchar(50) NOT NULL DEFAULT '0' COMMENT '状态',
  `accident_notes` varchar(50) NOT NULL DEFAULT '0',
  `accident_modified` datetime DEFAULT NULL,
  `accident_create` datetime NOT NULL,
  `accident_operator` varchar(50) NOT NULL DEFAULT '0' COMMENT '操作人员',
  `is_delete` int(11) DEFAULT '0',
  PRIMARY KEY (`accident_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='事故表';

-- 正在导出表  vehicle_management.car_accident 的数据：~1 rows (大约)
/*!40000 ALTER TABLE `car_accident` DISABLE KEYS */;
REPLACE INTO `car_accident` (`accident_id`, `car_id`, `accident_time`, `accident_site`, `accident_type`, `accident_status`, `accident_notes`, `accident_modified`, `accident_create`, `accident_operator`, `is_delete`) VALUES
	('1', '1', '2020-05-08', '贵阳市', '违停', '未处理', '驾驶员承担责任', '2020-05-08 17:37:13', '2020-05-08 17:37:13', 'admin', 0),
	('7f7ce511dddf42598e5aaeb3d386d4bc', '1', '2020-05-08', '重庆市', '违停', '已处理', '驾驶员承担责任', NULL, '2020-05-18 11:01:21', '初始值', 0),
	('ffcdf59566c04fbda80b88605d344489', '1', '2020-05-08', '重庆市', '违停', '未处理', '驾驶员承担责任', '2020-05-18 11:22:54', '2020-05-18 10:05:05', '初始值', 0);
/*!40000 ALTER TABLE `car_accident` ENABLE KEYS */;

-- 导出  表 vehicle_management.car_alarm 结构
CREATE TABLE IF NOT EXISTS `car_alarm` (
  `alarm_id` varchar(50) NOT NULL DEFAULT 'AUTO_INCREMENT',
  `car_id` varchar(50) NOT NULL DEFAULT '0',
  `alarm_time` date NOT NULL,
  `alarm_info` varchar(50) NOT NULL DEFAULT '0',
  `alarm_operator` datetime NOT NULL,
  `alarm_modified` datetime DEFAULT NULL,
  `alarm_create` varchar(50) NOT NULL,
  `is_delete` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`alarm_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='警报车辆信息表：警报 id；车辆 id；报警时间；报警消息；';

-- 正在导出表  vehicle_management.car_alarm 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `car_alarm` DISABLE KEYS */;
/*!40000 ALTER TABLE `car_alarm` ENABLE KEYS */;

-- 导出  表 vehicle_management.car_apply 结构
CREATE TABLE IF NOT EXISTS `car_apply` (
  `apply_id` varchar(50) NOT NULL DEFAULT 'AUTO_INCREMENT',
  `car_id` varchar(50) NOT NULL DEFAULT '0',
  `employee_id` varchar(50) NOT NULL DEFAULT '0',
  `use_info` varchar(50) NOT NULL DEFAULT '0' COMMENT '使用信息',
  `apply_route` varchar(50) NOT NULL DEFAULT '0' COMMENT '行程',
  `apply_time` datetime NOT NULL,
  `apply_status` varchar(50) NOT NULL DEFAULT '' COMMENT '状态',
  `apply_operator` varchar(50) NOT NULL DEFAULT '',
  `apply_modified` datetime DEFAULT NULL,
  `apply_create` datetime NOT NULL,
  `is_delete` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`apply_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='申请信息表：申请 id；员工 id；申请车辆 id；用车信息；驾车方式；申请时间；申请状态；';

-- 正在导出表  vehicle_management.car_apply 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `car_apply` DISABLE KEYS */;
/*!40000 ALTER TABLE `car_apply` ENABLE KEYS */;

-- 导出  表 vehicle_management.car_as 结构
CREATE TABLE IF NOT EXISTS `car_as` (
  `as_id` varchar(50) NOT NULL DEFAULT 'AUTO_INCREMENT',
  `car_id` varchar(50) NOT NULL DEFAULT '0',
  `as_time` date NOT NULL,
  `as_next_time` date NOT NULL,
  `as_cost` int(11) NOT NULL DEFAULT '0',
  `as_place` int(11) NOT NULL DEFAULT '0',
  `as_notes` int(11) NOT NULL DEFAULT '0',
  `as_invoices` int(11) NOT NULL DEFAULT '0' COMMENT '单据',
  `as_operator` varchar(50) DEFAULT NULL,
  `as_modified` datetime DEFAULT NULL,
  `as_create` datetime DEFAULT NULL,
  `is_delete` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`as_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='年检  年检 id；车辆 id；年检日期；下次年检日期；年检费用；年检地点；备注；单据信息；';

-- 正在导出表  vehicle_management.car_as 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `car_as` DISABLE KEYS */;
/*!40000 ALTER TABLE `car_as` ENABLE KEYS */;

-- 导出  表 vehicle_management.car_fault 结构
CREATE TABLE IF NOT EXISTS `car_fault` (
  `fault_id` varchar(50) NOT NULL DEFAULT 'AUTO_INCREMENT',
  `car_id` varchar(50) NOT NULL DEFAULT '0',
  `fault_time` date NOT NULL,
  `fault_site` varchar(50) NOT NULL DEFAULT '0' COMMENT '地点',
  `fault_type` varchar(50) NOT NULL DEFAULT '0',
  `fault_status` varchar(50) NOT NULL DEFAULT '0' COMMENT '状态',
  `fault_notes` varchar(50) NOT NULL DEFAULT '0',
  `fault_modified` datetime DEFAULT NULL,
  `fault_create` datetime NOT NULL,
  `fault_operator` varchar(50) NOT NULL DEFAULT '0' COMMENT '操作人员',
  `is_delete` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`fault_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='车辆故障信息  故障 id；车辆 id；操作员；时间；地点；类型；状态；备注；';

-- 正在导出表  vehicle_management.car_fault 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `car_fault` DISABLE KEYS */;
REPLACE INTO `car_fault` (`fault_id`, `car_id`, `fault_time`, `fault_site`, `fault_type`, `fault_status`, `fault_notes`, `fault_modified`, `fault_create`, `fault_operator`, `is_delete`) VALUES
	('1', '1', '2020-05-08', '贵阳市', '车胎类型', '已处理', '车胎爆了', '2020-05-08 16:51:42', '2020-05-08 16:51:43', 'admin', 0);
/*!40000 ALTER TABLE `car_fault` ENABLE KEYS */;

-- 导出  表 vehicle_management.car_info 结构
CREATE TABLE IF NOT EXISTS `car_info` (
  `car_id` varchar(50) NOT NULL,
  `car_number` varchar(50) DEFAULT '0',
  `car_brand` varchar(50) DEFAULT '0' COMMENT '品牌',
  `car_name` varchar(50) DEFAULT '0',
  `car_type` varchar(50) DEFAULT '0',
  `car_status` varchar(50) DEFAULT '0' COMMENT '状态',
  `car_age` int(11) DEFAULT '0',
  `car_department` varchar(50) DEFAULT '0' COMMENT '所属部门',
  `car_possessor` varchar(50) DEFAULT '0' COMMENT '所属人',
  `car_engine_number` varchar(50) DEFAULT '0' COMMENT '发动机号',
  `car_function` varchar(50) DEFAULT '0' COMMENT '使用性质：运营/非运营',
  `car_vin` varchar(50) DEFAULT '0' COMMENT '车架号',
  `car_registration_date` date DEFAULT NULL COMMENT '注册日期',
  `car_licence_issued` date DEFAULT NULL COMMENT '领证日期',
  `car_operator` varchar(50) DEFAULT NULL COMMENT '操作人员',
  `car_modified` datetime DEFAULT NULL COMMENT '修改日期',
  `car_create` datetime NOT NULL COMMENT '创建日期',
  `is_delete` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`car_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- 正在导出表  vehicle_management.car_info 的数据：~24 rows (大约)
/*!40000 ALTER TABLE `car_info` DISABLE KEYS */;
REPLACE INTO `car_info` (`car_id`, `car_number`, `car_brand`, `car_name`, `car_type`, `car_status`, `car_age`, `car_department`, `car_possessor`, `car_engine_number`, `car_function`, `car_vin`, `car_registration_date`, `car_licence_issued`, `car_operator`, `car_modified`, `car_create`, `is_delete`) VALUES
	('1', '贵A11111', '奥迪\r\n', 'Q7', '轿车', '未预约', 3, '后勤部', '王五', '3g3454hyaat4gdf', '非运营', '54885224', '2020-05-08', '2020-05-08', NULL, '2020-05-08 16:21:58', '2020-05-08 16:21:59', 0),
	('12', '贵A43234', '奔驰', 'C级', '跑车', '已预约', 2, '财务部', '小王', '32435rwsw3', '非运营', '234234', '2020-05-14', '2020-05-14', 'name', NULL, '2020-05-14 11:33:38', 0),
	('13', '贵A43234', '奔驰', 'C级', '跑车', '未预约', 2, '财务部', '小王', '32435rwsw3', '非运营', '234234', '2020-05-13', '2020-05-13', 'name', NULL, '2020-05-13 17:02:23', 0),
	('14', '贵A43234', '奔驰', 'C级', '跑车', '未预约', 2, '财务部', '小王', '32435rwsw3', '非运营', '234234', '2020-05-13', '2020-05-13', 'name', NULL, '2020-05-13 17:02:23', 0),
	('15', '贵A2344', '奔驰', 'S级', '豪车', '已预约', 2, '财务部', '小王', '32435rwsw3', '非运营', '234234', '2020-05-14', '2020-05-14', 'name', '2020-05-14 11:40:52', '2020-05-14 11:36:21', 0),
	('16', '贵A43234', '奔驰', 'C级', '跑车', '未预约', 2, '财务部', '小王', '32435rwsw3', '非运营', '234234', '2020-05-13', '2020-05-13', 'name', NULL, '2020-05-13 17:07:12', 0),
	('17', '贵A43234', '奔驰', 'C级', '跑车', '未预约', 2, '财务部', '小王', '32435rwsw3', '非运营', '234234', '2020-05-13', '2020-05-13', 'name', NULL, '2020-05-13 17:25:31', 0),
	('18', '贵A43234', '奔驰', 'C级', '跑车', '未预约', 2, '财务部', '小王', '32435rwsw3', '非运营', '234234', '2020-05-13', '2020-05-13', 'name', NULL, '2020-05-13 17:25:46', 0),
	('19', '贵A43234', '奔驰', 'C级', '跑车', '未预约', 2, '财务部', '小王', '32435rwsw3', '非运营', '234234', '2020-05-13', '2020-05-13', 'name', NULL, '2020-05-13 17:25:52', 0),
	('2', '贵A13222', '宝马', 'x6', '轿车', '已预约', 2, '研发部', '李四', '654ds6fd5ds', '运营', '45636855', '2020-05-13', '2020-05-13', 'admin', '2020-05-13 14:34:22', '2020-05-13 14:34:23', 0),
	('20', '贵A43234', '奔驰', 'C级', '跑车', '未预约', 2, '财务部', '小王', '32435rwsw3', '非运营', '234234', '2020-05-14', '2020-05-14', 'name', NULL, '2020-05-14 13:27:46', 0),
	('21', '贵A43234', '奔驰', 'C级', '跑车', '未预约', 2, '财务部', '小王', '32435rwsw3', '非运营', '234234', '2020-05-14', '2020-05-14', 'name', NULL, '2020-05-14 13:27:49', 0),
	('22', '贵A43234', '奔驰', 'C级', '跑车', '未预约', 2, '财务部', '小王', '32435rwsw3', '非运营', '234234', '2020-05-14', '2020-05-14', 'name', NULL, '2020-05-14 13:27:50', 0),
	('24', '贵A43234', '奔驰', 'C级', '跑车', '未预约', 2, '财务部', '小王', '32435rwsw3', '非运营', '234234', '2020-05-14', '2020-05-14', 'name', NULL, '2020-05-14 13:27:53', 0),
	('25', '贵A43234', '奔驰', 'C级', '跑车', '未预约', 2, '财务部', '小王', '32435rwsw3', '非运营', '234234', '2020-05-14', '2020-05-14', 'name', NULL, '2020-05-14 13:27:54', 0),
	('28', '贵A43234', '奔驰', 'C级', '跑车', '未预约', 2, '财务部', '小王', '32435rwsw3', '非运营', '234234', '2020-05-14', '2020-05-14', 'name', NULL, '2020-05-14 13:28:05', 0),
	('29', '贵A43234', '奔驰', 'C级', '跑车', '未预约', 2, '财务部', '小王', '32435rwsw3', '非运营', '234234', '2020-05-14', '2020-05-14', 'name', NULL, '2020-05-14 13:28:05', 0),
	('3', '粤A33333', '现代', 'x11', '轿车', '未预约', 2, '财政部', '成连', '234554323jk3', '非运营', '234323423', '2020-05-13', '2020-05-13', 'admin', '2020-05-13 15:27:04', '2020-05-13 15:27:04', 0),
	('30', '渝A11111', '宾利', '3222', '轿车', '已预约', 2, '财务部', '陈三', '23456234345', '非运营', '1234323245', '2020-05-13', '2020-05-14', '初始值', '2020-05-15 15:03:19', '2020-05-14 13:28:06', 0),
	('31', '贵A43234', '奔驰', 'C级', '跑车', '未预约', 2, '财务部', '小王', '32435rwsw3', '非运营', '234234', '2020-05-14', '2020-05-14', 'name', NULL, '2020-05-14 13:28:06', 0),
	('32', '贵A43234', '奔驰', 'C级', '跑车', '未预约', 2, '财务部', '小王', '32435rwsw3', '非运营', '234234', '2020-05-14', '2020-05-14', 'name', NULL, '2020-05-14 13:28:07', 0),
	('33', NULL, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL, NULL, NULL, '2020-05-14', '2020-05-14', 'name', NULL, '2020-05-14 16:49:13', 0),
	('34', NULL, NULL, '北京', NULL, NULL, 0, NULL, NULL, NULL, NULL, NULL, '2020-05-14', '2020-05-14', 'name', NULL, '2020-05-14 16:50:43', 0),
	('35', NULL, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL, NULL, NULL, '2020-05-14', '2020-05-14', 'name', NULL, '2020-05-14 16:56:54', 0),
	('688f94d59a3f4b15a06f68797b5ff282', '渝A11111', '宾利', '3222', '轿车', '未预约', 2, '财务部', '陈三', '23456234345', '非运营', '1234323245', '2020-05-13', '2020-05-14', '初始值', NULL, '2020-05-15 15:01:27', 0);
/*!40000 ALTER TABLE `car_info` ENABLE KEYS */;

-- 导出  表 vehicle_management.car_insurance 结构
CREATE TABLE IF NOT EXISTS `car_insurance` (
  `insurance_id` varchar(50) NOT NULL DEFAULT 'AUTO_INCREMENT',
  `car_id` varchar(50) NOT NULL DEFAULT '0',
  `insurance_place` varchar(50) NOT NULL DEFAULT '0',
  `insurance_commercial_cost` int(11) NOT NULL DEFAULT '0' COMMENT '商业保险费',
  `insurance_strong_cost` int(11) NOT NULL DEFAULT '0' COMMENT '交强保险费',
  `insurance_else_cost` int(11) NOT NULL DEFAULT '0' COMMENT '其他保险费',
  `insurance_begin_time` date NOT NULL COMMENT '保险开始日期',
  `insurance_end_time` date NOT NULL,
  `insurance_notes` varchar(50) NOT NULL DEFAULT '',
  `insurance_voucher` varchar(50) NOT NULL DEFAULT '' COMMENT '收据',
  `insurance_operator` varchar(50) DEFAULT NULL,
  `insurance_modified` datetime DEFAULT NULL,
  `insurance_create` datetime DEFAULT NULL,
  `is_delete` int(10) unsigned NOT NULL DEFAULT '0',
  PRIMARY KEY (`insurance_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='保险 id；车辆 id；保险单位；商业保险费；交强保险费；其他保险费；保险开始日期；保险结束日期；备注；单据信息；';

-- 正在导出表  vehicle_management.car_insurance 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `car_insurance` DISABLE KEYS */;
/*!40000 ALTER TABLE `car_insurance` ENABLE KEYS */;

-- 导出  表 vehicle_management.car_maintain 结构
CREATE TABLE IF NOT EXISTS `car_maintain` (
  `maintain_id` varchar(50) NOT NULL DEFAULT 'AUTO_INCREMENT',
  `car_id` varchar(50) NOT NULL DEFAULT '0',
  `maintain_place` int(11) NOT NULL DEFAULT '0' COMMENT '保养地方',
  `maintain_this_time` date NOT NULL,
  `maintain_this_km` int(11) NOT NULL DEFAULT '0',
  `maintain_next_time` date NOT NULL,
  `maintain_next_km` int(11) NOT NULL,
  `maintain_project` varchar(50) NOT NULL DEFAULT '0' COMMENT '保养项目',
  `maintain_cost` int(11) NOT NULL DEFAULT '0' COMMENT '花费',
  `maintain_notes` varchar(50) NOT NULL DEFAULT '0',
  `maintain_receipts` varchar(50) NOT NULL DEFAULT '0',
  `maintain_operator` varchar(50) NOT NULL DEFAULT '0',
  `maintain_modified` datetime DEFAULT NULL,
  `maintain_create` datetime NOT NULL,
  `is_delete` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`maintain_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='车辆保养 保养 id；车辆 id；保养单位；本次保养日期；本次保养里程；下次保养日期；下次保养里程；保养项目;花费；备注；单据信息；';

-- 正在导出表  vehicle_management.car_maintain 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `car_maintain` DISABLE KEYS */;
/*!40000 ALTER TABLE `car_maintain` ENABLE KEYS */;

-- 导出  表 vehicle_management.car_refuel 结构
CREATE TABLE IF NOT EXISTS `car_refuel` (
  `refuel_id` varchar(50) NOT NULL DEFAULT 'AUTO_INCREMENT',
  `car_id` varchar(50) NOT NULL DEFAULT '0',
  `refuel_time` int(11) NOT NULL DEFAULT '0',
  `refuel_cost` int(11) NOT NULL DEFAULT '0' COMMENT '费用',
  `refuel_gasoline_number` int(11) NOT NULL DEFAULT '0' COMMENT '油号',
  `refuel_price` int(11) NOT NULL DEFAULT '0' COMMENT '油价',
  `refuel_quantity` int(11) NOT NULL DEFAULT '0' COMMENT '油量',
  `refuel_station` varchar(50) NOT NULL DEFAULT '0' COMMENT '加油站',
  `refuel_present_mileage` int(11) NOT NULL DEFAULT '0' COMMENT '仪表盘里程',
  `refuel_remain_mileage` int(11) NOT NULL DEFAULT '0' COMMENT '剩余里程',
  `refuel_notes` varchar(50) NOT NULL DEFAULT '0' COMMENT '备注',
  `refuel_documents_info` varchar(50) NOT NULL DEFAULT '0' COMMENT '单据信息',
  `refuel_create` datetime NOT NULL,
  `refuel_modified` datetime DEFAULT NULL,
  `refuel_operator` varchar(50) NOT NULL DEFAULT '0',
  `is_delete` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`refuel_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='加油车辆信息表加油 id；车辆 id；时间；费用；油号；单价；加油量；加油站；仪表盘里程；剩余里程；备注；单据信息';

-- 正在导出表  vehicle_management.car_refuel 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `car_refuel` DISABLE KEYS */;
/*!40000 ALTER TABLE `car_refuel` ENABLE KEYS */;

-- 导出  表 vehicle_management.car_repairing 结构
CREATE TABLE IF NOT EXISTS `car_repairing` (
  `repairing_id` varchar(50) NOT NULL DEFAULT 'AUTO_INCREMENT',
  `fault_id` varchar(50) DEFAULT NULL,
  `accident_id` int(11) DEFAULT '0',
  `repairing_time` date NOT NULL,
  `repairing_type` varchar(50) NOT NULL DEFAULT '' COMMENT '保险/自费',
  `repairing_cost` double NOT NULL DEFAULT '0' COMMENT '费用',
  `repairing_notes` varchar(50) NOT NULL DEFAULT '0',
  `repairing_modified` datetime DEFAULT NULL,
  `repairing_create` datetime NOT NULL,
  `repairing_operator` varchar(50) NOT NULL DEFAULT '',
  `is_delete` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`repairing_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='修车表';

-- 正在导出表  vehicle_management.car_repairing 的数据：~1 rows (大约)
/*!40000 ALTER TABLE `car_repairing` DISABLE KEYS */;
REPLACE INTO `car_repairing` (`repairing_id`, `fault_id`, `accident_id`, `repairing_time`, `repairing_type`, `repairing_cost`, `repairing_notes`, `repairing_modified`, `repairing_create`, `repairing_operator`, `is_delete`) VALUES
	('1', '1', 0, '2020-05-08', '保险', 500, '修好了', '2020-05-08 17:34:32', '0000-00-00 00:00:00', 'admin', 0);
/*!40000 ALTER TABLE `car_repairing` ENABLE KEYS */;

-- 导出  表 vehicle_management.car_schedul 结构
CREATE TABLE IF NOT EXISTS `car_schedul` (
  `schedul_id` varchar(50) NOT NULL DEFAULT 'AUTO_INCREMENT',
  `car_id` varchar(50) NOT NULL DEFAULT '',
  `schedul_status` varchar(50) NOT NULL DEFAULT '' COMMENT '排班状态：可预约/不可预约',
  `schedul_appointment_info` varchar(50) NOT NULL DEFAULT '' COMMENT '预约提示',
  `schedul_notes` varchar(50) NOT NULL DEFAULT '',
  `schedul_operator` varchar(50) NOT NULL DEFAULT '',
  `schedul_modified` datetime DEFAULT NULL,
  `schedul_create` datetime DEFAULT NULL,
  `is_delete` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`schedul_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='排班信息表：排班 id；车辆 id；状态；预约提示；备注；';

-- 正在导出表  vehicle_management.car_schedul 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `car_schedul` DISABLE KEYS */;
/*!40000 ALTER TABLE `car_schedul` ENABLE KEYS */;

-- 导出  表 vehicle_management.car_send 结构
CREATE TABLE IF NOT EXISTS `car_send` (
  `send_id` varchar(50) NOT NULL DEFAULT 'AUTO_INCREMENT',
  `car_id` varchar(50) NOT NULL DEFAULT '0',
  `driver_id` varchar(50) NOT NULL DEFAULT '0',
  `send_time` date NOT NULL,
  `send_start` varchar(50) NOT NULL DEFAULT '0' COMMENT '出发点',
  `send_destination` varchar(50) NOT NULL DEFAULT '0' COMMENT '目的地',
  `send_reason` varchar(50) NOT NULL DEFAULT '0' COMMENT '理由',
  `send_passenger` varchar(50) NOT NULL DEFAULT '0' COMMENT '乘客',
  `send_operator` varchar(50) NOT NULL DEFAULT '0',
  `send_modified` datetime DEFAULT NULL,
  `send_create` datetime NOT NULL,
  `is_delete` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`send_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='派车信息表：id；车辆 id；司机；派车时间；出发点；目的地；用车理由；内部乘车人；外部乘车人；备注；\r\n';

-- 正在导出表  vehicle_management.car_send 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `car_send` DISABLE KEYS */;
/*!40000 ALTER TABLE `car_send` ENABLE KEYS */;

-- 导出  表 vehicle_management.driver_info 结构
CREATE TABLE IF NOT EXISTS `driver_info` (
  `driver_id` varchar(50) NOT NULL DEFAULT 'AUTO_INCREMENT',
  `employee_id` varchar(50) NOT NULL DEFAULT '0' COMMENT '对应员工id',
  `driver_driving_license` bigint(20) NOT NULL DEFAULT '0' COMMENT '驾照',
  `driver_issue_date` date NOT NULL COMMENT '拿证日期',
  `driver_status` varchar(50) NOT NULL DEFAULT '0' COMMENT '忙闲',
  `driver_modified` datetime DEFAULT NULL COMMENT '修改日期',
  `driver_create` datetime NOT NULL COMMENT '创建日期',
  `driver_operator` varchar(50) DEFAULT NULL COMMENT '操作人员',
  `is_delete` int(11) DEFAULT '0',
  PRIMARY KEY (`driver_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='司机表';

-- 正在导出表  vehicle_management.driver_info 的数据：~3 rows (大约)
/*!40000 ALTER TABLE `driver_info` DISABLE KEYS */;
REPLACE INTO `driver_info` (`driver_id`, `employee_id`, `driver_driving_license`, `driver_issue_date`, `driver_status`, `driver_modified`, `driver_create`, `driver_operator`, `is_delete`) VALUES
	('1', '1', 214343525454, '2020-05-08', '空闲', '2020-05-08 16:33:18', '2020-05-08 16:33:19', NULL, NULL),
	('2', '2', 312456554345, '2020-05-15', '空闲', '2020-05-15 09:17:59', '2020-05-15 09:18:00', 'admin', NULL),
	('3', '3', 65432345432, '2020-05-15', '空闲', NULL, '2020-05-15 09:18:24', 'admin', NULL);
/*!40000 ALTER TABLE `driver_info` ENABLE KEYS */;

-- 导出  表 vehicle_management.employee_info 结构
CREATE TABLE IF NOT EXISTS `employee_info` (
  `employee_id` varchar(50) NOT NULL DEFAULT 'AUTO_INCREMENT',
  `employee_name` varchar(20) NOT NULL DEFAULT '0',
  `employee_age` int(11) NOT NULL DEFAULT '0',
  `employee_sex` varchar(50) NOT NULL DEFAULT '0' COMMENT '0表示男1表示女',
  `employee_birthday` date NOT NULL DEFAULT '0000-00-00',
  `employee_address` varchar(100) NOT NULL DEFAULT '0',
  `employee_id_card` varchar(50) NOT NULL DEFAULT '0' COMMENT '身份证',
  `employee_phone` bigint(20) NOT NULL DEFAULT '0',
  `employee_department` varchar(50) NOT NULL DEFAULT '0' COMMENT '部门',
  `employee_working_years` int(11) NOT NULL DEFAULT '0' COMMENT '工龄',
  `employee_create` datetime DEFAULT NULL COMMENT '创建时间',
  `employee_modified` datetime DEFAULT NULL COMMENT '修改时间',
  `employee_operator` varchar(50) DEFAULT NULL COMMENT '操作人员',
  `is_delete` int(11) DEFAULT '0',
  PRIMARY KEY (`employee_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='员工表';

-- 正在导出表  vehicle_management.employee_info 的数据：~7 rows (大约)
/*!40000 ALTER TABLE `employee_info` DISABLE KEYS */;
REPLACE INTO `employee_info` (`employee_id`, `employee_name`, `employee_age`, `employee_sex`, `employee_birthday`, `employee_address`, `employee_id_card`, `employee_phone`, `employee_department`, `employee_working_years`, `employee_create`, `employee_modified`, `employee_operator`, `is_delete`) VALUES
	('1', '张三', 18, '0', '2020-08-06', '贵阳市', '568412368415962276', 1689534786, '研发部', 3, '2020-05-08 00:00:00', '2020-05-08 00:00:00', NULL, 0),
	('2', '王五', 23, '0', '1997-10-11', '重庆', '2134535454124345', 43423435434, '后勤部', 2, '2020-05-14 14:52:25', '2020-05-14 14:52:26', 'admin', 0),
	('3', '龙傲天', 25, '男', '1997-10-11', '上海市', '1111111111111111111', 1888688885, '研发部', 4, '2020-05-14 15:23:54', NULL, 'admin', 0),
	('4', '龙傲天', 25, '男', '1997-10-11', '上海市', '1111111111111111111', 1888688885, '研发部', 4, '2020-05-14 15:24:11', NULL, 'admin', 0),
	('5', '龙傲天', 25, '男', '1997-10-11', '上海市', '1111111111111111111', 1888688885, '研发部', 4, '2020-05-14 15:24:12', NULL, 'admin', 0),
	('6', '龙傲天', 25, '男', '1997-10-11', '上海市', '1111111111111111111', 1888688885, '研发部', 4, '2020-05-14 15:24:12', NULL, 'admin', 0),
	('7', '龙傲天', 25, '男', '1997-10-11', '上海市', '1111111111111111111', 1888688885, '研发部', 4, '2020-05-14 15:24:13', NULL, 'admin', 0);
/*!40000 ALTER TABLE `employee_info` ENABLE KEYS */;

-- 导出  表 vehicle_management.test 结构
CREATE TABLE IF NOT EXISTS `test` (
  `id` int(11) DEFAULT NULL,
  `test_name` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- 正在导出表  vehicle_management.test 的数据：~7 rows (大约)
/*!40000 ALTER TABLE `test` DISABLE KEYS */;
REPLACE INTO `test` (`id`, `test_name`) VALUES
	(1, 'ww '),
	(2, '龙傲天'),
	(3, '小时'),
	(5, '655'),
	(5, '655'),
	(6, '655'),
	(5, '234'),
	(7, '234');
/*!40000 ALTER TABLE `test` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
