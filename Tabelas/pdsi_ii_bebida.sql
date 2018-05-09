-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: pdsi_ii
-- ------------------------------------------------------
-- Server version	5.7.14

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `bebida`
--

DROP TABLE IF EXISTS `bebida`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bebida` (
  `ID_bebida` int(11) NOT NULL AUTO_INCREMENT,
  `Tipo` varchar(100) DEFAULT NULL,
  `Nome` varchar(100) DEFAULT NULL,
  `Fornecedor` varchar(100) DEFAULT NULL,
  `Volume` varchar(100) DEFAULT NULL,
  `Quant` int(11) DEFAULT NULL,
  `Preco` float DEFAULT NULL,
  PRIMARY KEY (`ID_bebida`)
) ENGINE=MyISAM AUTO_INCREMENT=40 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bebida`
--

LOCK TABLES `bebida` WRITE;
/*!40000 ALTER TABLE `bebida` DISABLE KEYS */;
INSERT INTO `bebida` VALUES (1,'Refrigerante','COCA-COLA','COCA COLA DISTRBUIDORA','300 ML',50,1.5),(2,'Refrigerante','COCA-COLA','COCA COLA DISTRBUIDORA','300 ML',50,1.5),(3,'Refrigerante','fanta','COCA COLA DISTRBUIDORA','300 ML',50,1.5),(4,'Refrigerante','fanta','COCA COLA DISTRBUIDORA','300 ML',50,1.5),(5,'Refrigerante','ddd','gvgvg','600 ML',56,1.5),(6,'Refrigerante','ddd','gvgvg','600 ML',56,1.5),(7,'Refrigerante','ddd','gvgvg','600 ML',57,1.5),(8,'Refrigerante','ddd','gvgvg','600 ML',57,1.5),(9,'Refrigerante','coca','coca','600 ML',56,2),(10,'Refrigerante','coca','coca','600 ML',56,2),(11,'Refrigerante','mhh','bkbkh','1 L',45,1.5),(12,'Refrigerante','mhh','bkbkh','1 L',45,1.5),(13,'Suco','xcscs','asxas','600 ML',122,1.5),(14,'Suco','xcscs','asxas','600 ML',122,1.5),(15,'Suco','a','a','600 ML',5,2),(16,'Suco','a','a','600 ML',5,2),(17,'Refrigerante','s','s','600 ML',4,2.5),(18,'Refrigerante','s','s','600 ML',4,2.5),(19,'Refrigerante','fff','vghvhg','600 ML',456,2),(20,'Refrigerante','fff','vghvhg','600 ML',456,2),(21,'Refrigerante','coca','coca','300 ML',43,2),(22,'Refrigerante','njns','njnj','600 ML',22,1),(23,'Suco','bscj','jnj','600 ML',23,2),(24,'Refrigerante','js','sj','600 ML',34,5),(25,'Refrigerante','hbchd','dncdj',NULL,32,20),(26,'Refrigerante','hbchd','dncdj',NULL,32,20),(27,'Refrigerante','d','d','600 ML',23,2),(28,'Refrigerante','s','s',NULL,44,22),(29,'Refrigerante','','',NULL,44,22),(30,'Suco','a','as','300 ML',12,22),(31,'Suco','sxas','asa','600 ML',2,2),(32,'Refrigerante','sd','sds','600 ML',3,3),(33,'Refrigerante','s','a','300 ML',4,4),(34,'Refrigerante','s','a','300 ML',4,4),(35,'Refrigerante','s','s','300 ML',4,4),(36,'Refrigerante','s','s','300 ML',4,4),(37,'Suco','j','t','300 ML',4,2),(38,'Refrigerante','s','s','600 ML',4,3),(39,'Refrigerante','ss','s','600 ML',3,3);
/*!40000 ALTER TABLE `bebida` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-05-08 22:11:38
