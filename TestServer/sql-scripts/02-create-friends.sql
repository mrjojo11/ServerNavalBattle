USE `testdatabase`;

CREATE TABLE `friend` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name_entry` varchar(45) DEFAULT NULL,
  `friend_name` varchar(45) DEFAULT NULL,
  
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

INSERT INTO testdatabase.friend 
VALUES(1, "Test", "Test5");
