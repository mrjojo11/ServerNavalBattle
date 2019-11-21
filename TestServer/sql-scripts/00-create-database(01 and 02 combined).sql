USE `testdatabase`;

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(45) DEFAULT NULL,
  `password` varchar(5000) DEFAULT NULL,
  `vegetarian` int(11) DEFAULT NULL,
  `produce` int(11) DEFAULT NULL,
  `car` int(11) DEFAULT NULL,
  `public_transportation` int(11) DEFAULT NULL,
  `bike` int(11) DEFAULT NULL,
  `temperature` int(11) DEFAULT NULL,
  `solar` int(11) DEFAULT NULL,
  `total_saved` int(11) DEFAULT NULL,
  `total_used` int(11) DEFAULT NULL,
  `total` int(11) DEFAULT NULL,

  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

INSERT INTO testdatabase.user
VALUES(997, "Test5", "pwd", 1, 2, 3, 4, 5, 6, 7, 8, 9,10);

INSERT INTO testdatabase.user
VALUES(998, "Test", "pwd", 1, 2, 3, 4, 5, 6, 7, 8, 9,10);

INSERT INTO testdatabase.user 
VALUES (999, "Global Chat", "Global Chat: Be the first to post in the chat!SplitHereer", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);


USE `testdatabase`;

CREATE TABLE `friend` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name_entry` varchar(45) DEFAULT NULL,
  `friend_name` varchar(45) DEFAULT NULL,

  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

INSERT INTO testdatabase.friend 
VALUES(1, "Test", "Test5");
