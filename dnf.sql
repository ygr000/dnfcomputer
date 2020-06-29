-- MySQL dump 10.13  Distrib 8.0.20, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: dnf
-- ------------------------------------------------------
-- Server version	8.0.20

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `equip`
--

DROP TABLE IF EXISTS `equip`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `equip` (
  `id` int NOT NULL AUTO_INCREMENT,
  `suit_id` int DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `huang` decimal(10,2) DEFAULT NULL,
  `huangzhui` decimal(10,2) DEFAULT NULL,
  `bao` decimal(10,2) DEFAULT NULL,
  `baozhui` decimal(10,2) DEFAULT NULL,
  `bai` decimal(10,2) DEFAULT NULL,
  `shubai` decimal(10,2) DEFAULT NULL,
  `percentage_lizhi` decimal(10,2) DEFAULT NULL,
  `zuizhong` decimal(10,2) DEFAULT NULL,
  `percentage_sangong` decimal(10,2) DEFAULT NULL,
  `shuqiang` decimal(10,2) DEFAULT NULL,
  `jineng` decimal(10,2) DEFAULT NULL,
  `fixed_intelligence` decimal(10,2) DEFAULT NULL,
  `lengque` decimal(10,2) DEFAULT NULL,
  `fixed_power` decimal(10,2) DEFAULT NULL,
  `dengji` varchar(255) DEFAULT NULL,
  `modify_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `equip_type` varchar(50) DEFAULT NULL COMMENT '1：头肩\n2：上衣\n3：腰带\n4：下装\n5：鞋\n6：武器\n7：称号\n8：手镯\n9：项链\n10：戒指\n11：辅助装备\n12：魔法师\n13：耳环\n14：宠物\n15：宠物装备\n...',
  `equip_level` varchar(50) DEFAULT NULL COMMENT '史诗，神器',
  `fixed_physics` decimal(10,2) DEFAULT NULL COMMENT '固定 物理攻击',
  `fixed_magic` decimal(10,2) DEFAULT NULL COMMENT 'guding mofa ',
  `fixed_gushang` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `equip`
--

LOCK TABLES `equip` WRITE;
/*!40000 ALTER TABLE `equip` DISABLE KEYS */;
INSERT INTO `equip` (`id`, `suit_id`, `name`, `huang`, `huangzhui`, `bao`, `baozhui`, `bai`, `shubai`, `percentage_lizhi`, `zuizhong`, `percentage_sangong`, `shuqiang`, `jineng`, `fixed_intelligence`, `lengque`, `fixed_power`, `dengji`, `modify_time`, `equip_type`, `equip_level`, `fixed_physics`, `fixed_magic`, `fixed_gushang`) VALUES (1,0,NULL,100.00,101.11,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'2020-06-23 09:17:28',NULL,NULL,NULL,NULL,NULL),(2,3,'古代祭祀长礼袍',NULL,NULL,NULL,NULL,NULL,NULL,10.00,12.00,10.00,NULL,NULL,158.00,NULL,100.00,NULL,'2020-06-29 09:13:12','2','史诗',NULL,NULL,NULL),(3,3,'古代祭司长披肩',NULL,NULL,NULL,NULL,NULL,NULL,10.00,NULL,10.00,NULL,12.00,146.00,NULL,100.00,NULL,'2020-06-29 11:04:53','1','史诗',NULL,NULL,NULL),(4,3,'古代祭司长裙子',NULL,12.00,NULL,NULL,NULL,NULL,10.00,NULL,10.00,NULL,NULL,158.00,NULL,100.00,NULL,'2020-06-29 11:06:47','4','史诗',NULL,NULL,NULL),(5,3,'古代祭司长凉鞋',NULL,NULL,NULL,NULL,12.00,NULL,10.00,NULL,10.00,NULL,NULL,135.00,NULL,100.00,NULL,'2020-06-29 11:07:43','5','史诗',NULL,NULL,NULL),(6,3,'古代祭司长腰带',NULL,NULL,NULL,12.00,NULL,NULL,10.00,NULL,10.00,NULL,NULL,135.00,NULL,100.00,NULL,'2020-06-29 11:08:44','3','史诗',NULL,NULL,NULL);
/*!40000 ALTER TABLE `equip` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `equip_type`
--

DROP TABLE IF EXISTS `equip_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `equip_type` (
  `id` int NOT NULL AUTO_INCREMENT,
  `typeName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `equip_type`
--

LOCK TABLES `equip_type` WRITE;
/*!40000 ALTER TABLE `equip_type` DISABLE KEYS */;
INSERT INTO `equip_type` (`id`, `typeName`) VALUES (1,'头肩'),(2,'上衣'),(3,'腰带'),(4,'下装'),(5,'鞋'),(6,'武器'),(7,'称号'),(8,'手镯'),(9,'项链'),(10,'戒指'),(11,'辅助装备'),(12,'魔法石'),(13,'耳环'),(14,'宠物'),(15,'宠物装备');
/*!40000 ALTER TABLE `equip_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `suit`
--

DROP TABLE IF EXISTS `suit`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `suit` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `huang2` decimal(10,2) DEFAULT NULL,
  `huangzhui2` decimal(10,2) DEFAULT NULL,
  `bao2` decimal(10,2) DEFAULT NULL,
  `baozhui2` decimal(10,2) DEFAULT NULL,
  `bai2` decimal(10,2) DEFAULT NULL,
  `shubai2` decimal(10,2) DEFAULT NULL,
  `percentage_lizhi2` decimal(10,2) DEFAULT NULL,
  `zuizhong2` decimal(10,2) DEFAULT NULL,
  `percentage_sangong2` decimal(10,2) DEFAULT NULL,
  `shuqiang2` decimal(10,2) DEFAULT NULL,
  `jineng2` decimal(10,2) DEFAULT NULL,
  `dengji2` varchar(255) DEFAULT NULL,
  `lengque2` decimal(10,2) DEFAULT NULL,
  `fixed_power2` decimal(10,2) DEFAULT NULL,
  `fixed_intelligence2` decimal(10,2) DEFAULT NULL,
  `huang3` decimal(10,2) DEFAULT NULL,
  `huangzhui3` decimal(10,2) DEFAULT NULL,
  `bao3` decimal(10,2) DEFAULT NULL,
  `baozhui3` decimal(10,2) DEFAULT NULL,
  `bai3` decimal(10,2) DEFAULT NULL,
  `shubai3` decimal(10,2) DEFAULT NULL,
  `percentage_lizhi3` decimal(10,2) DEFAULT NULL,
  `zuizhong3` decimal(10,2) DEFAULT NULL,
  `percentage_sangong3` decimal(10,2) DEFAULT NULL,
  `shuqiang3` decimal(10,2) DEFAULT NULL,
  `jineng3` decimal(10,2) DEFAULT NULL,
  `dengji3` varchar(255) DEFAULT NULL,
  `lengque3` decimal(10,2) DEFAULT NULL,
  `fixed_power3` decimal(10,2) DEFAULT NULL,
  `fixed_intelligence3` decimal(10,2) DEFAULT NULL,
  `huang5` decimal(10,2) DEFAULT NULL,
  `huangzhui5` decimal(10,2) DEFAULT NULL,
  `bao5` decimal(10,2) DEFAULT NULL,
  `baozhui5` decimal(10,2) DEFAULT NULL,
  `bai5` decimal(10,2) DEFAULT NULL,
  `shubai5` decimal(10,2) DEFAULT NULL,
  `percentage_lizhi5` decimal(10,2) DEFAULT NULL,
  `zuizhong5` decimal(10,2) DEFAULT NULL,
  `percentage_sangong5` decimal(10,2) DEFAULT NULL,
  `shuqiang5` decimal(10,2) DEFAULT NULL,
  `jineng5` decimal(10,2) DEFAULT NULL,
  `dengji5` varchar(255) DEFAULT NULL,
  `lengque5` decimal(10,2) DEFAULT NULL,
  `fixed_power5` decimal(10,2) DEFAULT NULL,
  `fixed_intelligence5` decimal(10,2) DEFAULT NULL,
  `modify_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `describtion` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `suit`
--

LOCK TABLES `suit` WRITE;
/*!40000 ALTER TABLE `suit` DISABLE KEYS */;
INSERT INTO `suit` (`id`, `name`, `huang2`, `huangzhui2`, `bao2`, `baozhui2`, `bai2`, `shubai2`, `percentage_lizhi2`, `zuizhong2`, `percentage_sangong2`, `shuqiang2`, `jineng2`, `dengji2`, `lengque2`, `fixed_power2`, `fixed_intelligence2`, `huang3`, `huangzhui3`, `bao3`, `baozhui3`, `bai3`, `shubai3`, `percentage_lizhi3`, `zuizhong3`, `percentage_sangong3`, `shuqiang3`, `jineng3`, `dengji3`, `lengque3`, `fixed_power3`, `fixed_intelligence3`, `huang5`, `huangzhui5`, `bao5`, `baozhui5`, `bai5`, `shubai5`, `percentage_lizhi5`, `zuizhong5`, `percentage_sangong5`, `shuqiang5`, `jineng5`, `dengji5`, `lengque5`, `fixed_power5`, `fixed_intelligence5`, `modify_time`, `describtion`) VALUES (0,'无',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'2020-06-29 07:25:30','默认单件无套装属性，使装备表单件suitid填此id'),(3,'古代祭司长的神圣仪式',NULL,21.00,NULL,NULL,NULL,NULL,8.00,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,21.00,NULL,NULL,NULL,8.00,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,21.00,NULL,NULL,NULL,NULL,NULL,NULL,25.00,NULL,NULL,NULL,NULL,'2020-06-29 10:20:37','古代祭司长的神圣仪式套装');
/*!40000 ALTER TABLE `suit` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-06-29 19:30:47
