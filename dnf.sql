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
  `dengji` decimal(10,2) DEFAULT NULL,
  `lengque` decimal(10,2) DEFAULT NULL,
  `fixed_power` decimal(10,2) DEFAULT NULL,
  `fixed_intelligence` decimal(10,2) DEFAULT NULL,
  `modify_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `equip`
--

LOCK TABLES `equip` WRITE;
/*!40000 ALTER TABLE `equip` DISABLE KEYS */;
INSERT INTO `equip` (`id`, `suit_id`, `name`, `huang`, `huangzhui`, `bao`, `baozhui`, `bai`, `shubai`, `percentage_lizhi`, `zuizhong`, `percentage_sangong`, `shuqiang`, `jineng`, `dengji`, `lengque`, `fixed_power`, `fixed_intelligence`, `modify_time`) VALUES (1,NULL,NULL,100.00,101.11,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'2020-06-23 09:17:28');
/*!40000 ALTER TABLE `equip` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-06-26 11:43:42
