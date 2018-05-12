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
-- Table structure for table `cad_alimentos`
--

DROP TABLE IF EXISTS `cad_alimentos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cad_alimentos` (
  `ID_alimento` int(11) NOT NULL AUTO_INCREMENT,
  `Tipo` varchar(100) DEFAULT NULL,
  `Fornecedor` varchar(100) DEFAULT NULL,
  `QuantidadeT` float DEFAULT NULL,
  `Preco_de_compra` float DEFAULT NULL,
  `preco_total` float DEFAULT NULL,
  `Quantidade_kg_porcao` float DEFAULT NULL,
  PRIMARY KEY (`ID_alimento`)
) ENGINE=MyISAM AUTO_INCREMENT=21 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cad_alimentos`
--

LOCK TABLES `cad_alimentos` WRITE;
/*!40000 ALTER TABLE `cad_alimentos` DISABLE KEYS */;
INSERT INTO `cad_alimentos` VALUES (1,'peito de frango','45',45,6,270,0.3),(2,'peito de frango','45',45,6,270,0.3),(3,'peito de frango','22',22,3,66,0.3),(4,'peito de frango','22',22,3,66,0.3),(5,'peito de frango','44',44,3,132,20),(6,'peito de frango','44',44,3,132,20),(7,'peito de frango','44',44,2,88,0.3),(8,'peito de frango','44',44,2,88,0.3),(9,'peito de frango','55',55,2,110,0.3),(10,'peito de frango','55',55,2,110,0.3),(11,'peito de frango','3',3,2,6,3),(12,'peito de frango','3',3,2,6,3),(13,'peito de frango','3',3,2,6,3),(14,'peito de frango','3',3,2,6,3),(15,'peito de peru','555',555,33,18315,33),(16,'peito de peru','555',555,33,18315,33),(17,'peito de frango','43',43,3,129,5),(18,'peito de frango','43',43,3,129,5),(19,'peito de frango','345',345,1,345,55),(20,'peito de frango','345',345,1,345,55);
/*!40000 ALTER TABLE `cad_alimentos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-05-10 22:11:18
