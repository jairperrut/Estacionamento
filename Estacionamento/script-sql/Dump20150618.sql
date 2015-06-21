CREATE DATABASE  IF NOT EXISTS `webpark` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `webpark`;
-- MySQL dump 10.13  Distrib 5.6.13, for Win32 (x86)
--
-- Host: 127.0.0.1    Database: grupo7
-- ------------------------------------------------------
-- Server version	5.6.14

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
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cliente` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Placa` varchar(45) NOT NULL,
  `NumeroCartao` int(11) NOT NULL DEFAULT '0',
  `Nome` varchar(45) DEFAULT NULL,
  `CPF` varchar(14) DEFAULT NULL,
  `Modelo` varchar(45) DEFAULT NULL,
  `tipocliente` varchar(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (11,'AFC-1520',0,'CAIO','803.324.934-82','FORD','M'),(12,'HJD-2000',0,'MARIA','718.678.898-00','VOLKS','M'),(14,'AFC-1800',0,'','___.___.___-__','FORD','A'),(15,'IOH-7000',0,'','___.___.___-__','FIAT','A'),(16,'MGX-8227',0,'','___.___.___-__','UNO','A'),(17,'MGP-7491',0,'Jair','___.___.___-__','PEGEOUT','A');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `movimentacao`
--

DROP TABLE IF EXISTS `movimentacao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `movimentacao` (
  `vaga_id` int(11) NOT NULL,
  `cliente_id` int(11) NOT NULL,
  `idmovimentacao` int(11) NOT NULL AUTO_INCREMENT,
  `dtentrada` timestamp NULL DEFAULT NULL,
  `dtsaida` timestamp NULL DEFAULT NULL,
  `vlrtotal` double DEFAULT NULL,
  PRIMARY KEY (`idmovimentacao`),
  KEY `fk_vaga_has_cliente_cliente1_idx` (`cliente_id`),
  KEY `fk_vaga_has_cliente_vaga_idx` (`vaga_id`),
  CONSTRAINT `fk_vaga_has_cliente_cliente1` FOREIGN KEY (`cliente_id`) REFERENCES `cliente` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `fk_vaga_has_cliente_vaga` FOREIGN KEY (`vaga_id`) REFERENCES `vaga` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movimentacao`
--

LOCK TABLES `movimentacao` WRITE;
/*!40000 ALTER TABLE `movimentacao` DISABLE KEYS */;
INSERT INTO `movimentacao` VALUES (3,11,11,'2014-06-25 11:40:25','2014-06-25 11:34:41',3),(5,14,14,'2014-06-26 04:49:45','2014-06-26 05:14:46',3),(2,14,15,'2014-06-27 13:51:45','2015-06-18 08:12:46',42755),(2,17,16,'2015-06-18 11:23:05','2015-06-18 11:23:50',65);
/*!40000 ALTER TABLE `movimentacao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vaga`
--

DROP TABLE IF EXISTS `vaga`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vaga` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Numero_vaga` int(11) NOT NULL,
  `Tipo_vaga` varchar(45) NOT NULL,
  `Tipo_valor` varchar(45) NOT NULL,
  `Valor_unit` double NOT NULL,
  `Status` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vaga`
--

LOCK TABLES `vaga` WRITE;
/*!40000 ALTER TABLE `vaga` DISABLE KEYS */;
INSERT INTO `vaga` VALUES (1,1,'Mensalista','Mensal',200,0),(2,2,'Avulso','Hora/Fração',5,0),(3,3,'Mensalista','Mensal',3,0),(4,4,'Avulso','Hora/Fração',3,0),(5,5,'Avulso','Hora/Fração',3,0);
/*!40000 ALTER TABLE `vaga` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-06-18 21:46:54
