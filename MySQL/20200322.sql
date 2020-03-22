
use hello20200322;
-- drop table `memberaccount2020`memberaccount2020memberaccount2020;
CREATE TABLE `memberaccount2020` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `EMAIL` varchar(40) COLLATE utf8_unicode_ci DEFAULT NULL,
  `PASSWORD` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ADDRESS` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `CELLPHONE` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `CREATE_DATE` datetime DEFAULT NULL,
  PRIMARY KEY (`ID`)
  )