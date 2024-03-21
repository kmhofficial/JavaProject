-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: possystem
-- ------------------------------------------------------
-- Server version	8.0.35

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `items`
--

DROP TABLE IF EXISTS `items`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `items` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `name` varchar(999) DEFAULT NULL,
  `type` varchar(45) DEFAULT NULL,
  `drinktype` varchar(45) DEFAULT NULL,
  `foodtype` varchar(45) DEFAULT NULL,
  `item_img` varchar(999) DEFAULT NULL,
  `baseprice` varchar(45) DEFAULT NULL,
  `qty` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=62 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `items`
--

LOCK TABLES `items` WRITE;
/*!40000 ALTER TABLE `items` DISABLE KEYS */;
INSERT INTO `items` VALUES (1,'Oleato™ Gingerbread Oatmilk Latte','Drink','Oleato™',NULL,'OleatoGingerbreadLatte.png','500','13'),(2,'Oleato Golden Foam™ Cold Brew','Drink','Oleato™',NULL,'Oleato_GoldenFoam_ColdBrew.png','700','20'),(3,'Oleato™ Caffé Latte with Oatmilk','Drink','Oleato™',NULL,'Oleato_CaffeLatte.png','400','20'),(4,'Oleato™ Iced Shaken Espresso with Oatmilk and Toffeenut','Drink','Oleato™',NULL,'Oleato_ToffeeNut_ShakenEspresso.png','250','20'),(5,'Iced Chai Tea Latte with Oleato Golden Foam™','Drink','Oleato™',NULL,'IcedChaiTeaLatte-GoldenFoam.png','650','20'),(6,'Iced Matcha Tea Latte with Oleato Golden Foam™','Drink','Oleato™',NULL,'SBX20211029_7356_IcedMatchaTeaLatte-GoldenFoam-onGray_sRGB-1800.png','480','20'),(7,'Paradise Drink Starbucks Refreshers® Beverage with Oleato Golden Foam™','Drink','Oleato™',NULL,'SBX20221014_4603_ParadiseDrink-GoldenFoam-onGray_sRGB-1800.png','120','20'),(8,'Dragon Drink® Starbucks Refreshers® Beverage with Oleato Golden Foam™','Drink','Oleato™',NULL,'SBX20221014_4538_DragonDrink-GoldenColdFoam-onGray_sRGB-1800.png','240','20'),(10,'Caffè Americano','Drink','Hot Coffees',NULL,'SBX20190617_CaffeAmericano.png','450','20'),(11,'Featured Blonde Roast','Drink','Hot Coffees',NULL,'Veranda_Blend_Hot.png','100','20'),(12,'Caffè Misto','Drink','Hot Coffees',NULL,'SBX20190617_CaffeMisto.png','200','20'),(13,'Cappuccino','Drink','Hot Coffees',NULL,'SBX20190617_Cappuccino.png','450','20'),(14,'Espresso','Drink','Hot Coffees',NULL,'SBX20190617_Espresso_Single.png','100','20'),(15,'Caffè Latte','Drink','Hot Coffees',NULL,'SBX20190617_CaffeLatte.png','1500','20'),(16,'Starbucks® Blonde Vanilla Latte','Drink','Hot Coffees',NULL,'blonde_vanilla_latte.png','450','20'),(17,'Caffè Mocha','Drink','Hot Coffees',NULL,'SBX20220607_CaffeMocha.png','400','20'),(18,'White Chocolate Mocha','Drink','Hot Coffees',NULL,'SBX20190617_WhiteChocolateMocha.png','600','20'),(19,'Peppermint White Chocolate Mocha','Drink','Hot Coffees',NULL,'SBX20220607_1480_PeppermintMocha-onGreen-MOP_1800.png','900','20'),(20,'Chai Tea Latte','Drink','Hot Teas',NULL,'SBX20220411_ChaiLatte.png','700','20'),(21,'Chai Tea','Drink','Hot Teas',NULL,'ChaiBrewedTea.png','500','20'),(22,'Matcha Tea Latte','Drink','Hot Teas',NULL,'SBX20211115_MatchaTeaLatte.png','800','20'),(23,'Hot Chocolate','Drink','Hot Drinks',NULL,'SBX20190617_SignatureHotChocolate.png','400','20'),(24,'White Hot Chocolate','Drink','Hot Drinks',NULL,'SBX20190624_WhiteHotChocolate.png','950','20'),(25,'Caramel Apple Spice','Drink','Hot Drinks',NULL,'SBX20190624_CaramelAppleSpice.png','1000','20'),(26,'Steamed Apple Juice','Drink','Hot Drinks',NULL,'SBX20190624 SteamedAppleJuice.png','450','20'),(27,'Chestnut Praline Crème','Drink','Hot Drinks',NULL,'SBX20190716_ChestnutPralineCreme.png','350','20'),(28,'Steamed Milk','Drink','Hot Drinks',NULL,'SBX20190617_SteamedMilk.png','250','20'),(29,'Sugar Cookie Almondmilk Frappuccino® Blended Beverage','Drink','Frappuccino® Blended Beverages',NULL,'SBX20230612_4665_SugarCookieAlmondmilkFrappuccino.png','150','19'),(30,'Apple Crisp Oatmilk Frappuccino® Blended Beverage','Drink','Frappuccino® Blended Beverages',NULL,'SBX20210903_AppleCrispFrapp.png','100','20'),(31,'Caramel Brulée Frappuccino® Blended Beverage','Drink','Frappuccino® Blended Beverages',NULL,'SBX20230612_4567-CaramelBruleeFrappuccino-onGreen-MOP_1800.png','50','20'),(32,'Chestnut Praline Frappuccino® Blended Beverage','Drink','Frappuccino® Blended Beverages',NULL,'ChestnutPralineFrappuccino.png','500','20'),(33,'Espresso Frappuccino® Blended Beverage','Drink','Frappuccino® Blended Beverages',NULL,'SBX20190528_EspressoFrapp.png','550','20'),(34,'Caffè Vanilla Frappuccino® Blended Beverage','Drink','Frappuccino® Blended Beverages',NULL,'SBX20190528_CaffeVanillaFrapp.png','600','20'),(35,'Caramel Frappuccino® Blended Beverage','Drink','Frappuccino® Blended Beverages',NULL,'SBX20220323_CaramelFrapp.png','650','20'),(36,'Coffee Frappuccino® Blended Beverage','Drink','Frappuccino® Blended Beverages',NULL,'SBX20190528_CoffeeFrapp.png','750','20'),(37,'Java Chip Frappuccino® Blended Beverage','Drink','Frappuccino® Blended Beverages',NULL,'SBX20190528_JavaChipFrapp.png','700','20'),(38,'Apple Crisp Oatmilk Crème Frappuccino® Blended Beverage','Drink','Frappuccino® Blended Beverages',NULL,'SBX20230510_2672_AppleCrispCremeFrappuccino-onGreen-MOP_1800.png','600','20'),(39,'Pumpkin Spice Crème Frappuccino® Blended Beverage','Drink','Frappuccino® Blended Beverages',NULL,'SBX20230510_2658_PumpkinSpiceCremeFrappuccino-onGreen-MOP_1800.png','150','20'),(40,'Strawberry Crème Frappuccino® Blended Beverage','Drink','Frappuccino® Blended Beverages',NULL,'SBX20220323_StrawberryFrapp.png','650','20'),(41,'Matcha Crème Frappuccino® Blended Beverage','Drink','Frappuccino® Blended Beverages',NULL,'SBX20181127_MatchaGreenTeaFrapp.png','100','20'),(42,'Double Chocolaty Chip Crème Frappuccino® Blended Beverage','Drink','Frappuccino® Blended Beverages',NULL,'SBX20190528_DoubleChocolatyChipCremeFrapp.png','200','20'),(43,'Pumpkin Cream Cold Brew','Drink','Cold Coffees',NULL,'SBX20220323_PumpkinCreamColdBrew-onGreen.png','300','20'),(44,'Oleato Golden Foam™ Cold Brew','Drink','Cold Coffees',NULL,'Oleato_GoldenFoam_ColdBrew.png','400','20'),(45,'Salted Caramel Cream Cold Brew','Drink','Cold Coffees',NULL,'SBX20211029_SaltedCaramelCreamColdBrew.png','500','20'),(46,'Vanilla Sweet Cream Cold Brew','Drink','Cold Coffees',NULL,'SBX20190607_VanillaSweetCreamColdBrew.png','600','20'),(47,'Starbucks® Cold Brew Coffee with Milk','Drink','Cold Coffees',NULL,'SBX20190416_ColdBrewWithMilk.png','700','20'),(48,'Cinnamon Caramel Cream Nitro Cold Brew','Drink','Cold Coffees',NULL,'SBX20221014_CinnamonCaramelCreamNitroColdBrew.png','800','20'),(49,'Nitro Cold Brew','Drink','Cold Coffees',NULL,'SBX20190410_NitroColdBrew.png','900','20'),(50,'Vanilla Sweet Cream Nitro Cold Brew','Drink','Cold Coffees',NULL,'SBX20190410_VanillaSweetCreamNitroColdBrew.png','1000','20'),(51,'Iced Caffè Americano','Drink','Cold Coffees',NULL,'SBX20190607_IcedCaffeAmericano.png','150','20'),(52,'Iced Coffee','Drink','Cold Coffees',NULL,'SBX20190607_IcedCoffee.png','250','20'),(53,'Iced Coffee with Milk','Drink','Cold Coffees',NULL,'SBX20190607_IcedCoffeeWithMilk.png','350','20'),(54,'Iced Espresso','Drink','Cold Coffees',NULL,'SBX20190607_IcedEspresso.png','450','20'),(55,'Iced Apple Crisp Oatmilk Shaken Espresso','Drink','Cold Coffees',NULL,'SBX20211029_IcedAppleCrispOatmilkShakenEspresso.png','650','20'),(56,'Oleato™ Iced Shaken Espresso with Oatmilk and Toffeenut','Drink','Cold Coffees',NULL,'Oleato_ToffeeNut_ShakenEspresso.png','750','20'),(57,'Iced Toasted Vanilla Oatmilk Shaken Espresso','Drink','Cold Coffees',NULL,'SBX20211029_IcedToastedVanillaOatmilkShakenEspresso.png','850','20'),(58,'Iced Brown Sugar Oatmilk Shaken Espresso','Drink','Cold Coffees',NULL,'SBX20201011_IcedBrownSugarOatmilkShakenEspresso.png','950','20'),(59,'Iced Apple Crisp Oatmilk Macchiato','Drink','Cold Coffees',NULL,'SBX20220323_IcedAppleCrispOatmilkMacchiato.png','400','20'),(60,'Iced Caffè Mocha','Drink','Cold Coffees',NULL,'SBX20190607_IcedCaffeMocha.png','850','20');
/*!40000 ALTER TABLE `items` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `salehistory`
--

DROP TABLE IF EXISTS `salehistory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `salehistory` (
  `id` int NOT NULL,
  `itemname` varchar(45) DEFAULT NULL,
  `short` varchar(45) DEFAULT NULL,
  `tall` varchar(45) DEFAULT NULL,
  `grande` varchar(45) DEFAULT NULL,
  `venti` varchar(45) DEFAULT NULL,
  `totalsalequantity` varchar(45) DEFAULT NULL,
  `totalsale` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `ID_UNIQUE` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `salehistory`
--

LOCK TABLES `salehistory` WRITE;
/*!40000 ALTER TABLE `salehistory` DISABLE KEYS */;
INSERT INTO `salehistory` VALUES (1,'icecoffee','2','13','12','2','30','10000.0Kyat');
/*!40000 ALTER TABLE `salehistory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tempdata`
--

DROP TABLE IF EXISTS `tempdata`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tempdata` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `itemsname` varchar(999) DEFAULT NULL,
  `Sugar` varchar(45) DEFAULT NULL,
  `Ice` varchar(45) DEFAULT NULL,
  `Topping` varchar(45) DEFAULT NULL,
  `price` varchar(45) DEFAULT NULL,
  `type` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tempdata`
--

LOCK TABLES `tempdata` WRITE;
/*!40000 ALTER TABLE `tempdata` DISABLE KEYS */;
INSERT INTO `tempdata` VALUES (1,'Sugar Cookie Almondmilk Frappuccino® Blended Beverage','25%','Less Ice','Milk Pudding','6200.0Kyat','Venti'),(2,'Oleato™ Gingerbread Oatmilk Latte','25%','Less Ice','Milk Pudding','6700.0Kyat','Venti'),(3,'Oleato™ Gingerbread Oatmilk Latte','25%','Less Ice','Coconut Jelly','6000.0Kyat','Venti'),(4,'Oleato™ Gingerbread Oatmilk Latte','25%','Less Ice','Coconut Jelly','6000.0Kyat','Venti'),(5,'Oleato™ Gingerbread Oatmilk Latte','25%','Less Ice','Coconut Jelly','6000.0Kyat','Venti'),(6,'Oleato™ Gingerbread Oatmilk Latte','25%','Less Ice','Coconut Jelly','6000.0Kyat','Venti'),(7,'Oleato™ Gingerbread Oatmilk Latte','25%','Less Ice','Coconut Jelly','6000.0Kyat','Venti'),(8,'Oleato™ Gingerbread Oatmilk Latte','25%','Normal','Coconut Jelly','6000.0Kyat','Venti');
/*!40000 ALTER TABLE `tempdata` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `type` varchar(45) DEFAULT NULL,
  `joined_date` varchar(45) DEFAULT NULL,
  `phnum` varchar(45) DEFAULT NULL,
  `location` varchar(45) DEFAULT NULL,
  `profileimg` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'KMH','KMH','KMH','Owner','18/12/2023','0912345','Yangon','jennie.jpg'),(2,'Kaung Khant Kyaw','kkk','kkk','Staff','18/12/2023','0912345','Yangon','jennie.jpg'),(3,'Kim Jennie','jennie','jennie','Staff','18/12/2023','0912345','Yangon','jennie.jpg'),(4,'Lalisa Manobal','lisa','lisa','Staff','18/12/2023','0912345','Yangon','lisa.jpeg'),(5,'Roseanne Park','rose','rose','Staff','18/12/2023','0912345','Yangon','rose.jpg'),(6,'Kim Jisoo','jisoo','jisoo','Staff','18/12/2023','0912345','Yangon','jisoo.jpg');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-12-21 12:48:40
