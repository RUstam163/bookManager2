# bookManager2
Simple CRUD example using Maven, Spring MVC, Hibernate, MySQL
This is a layout of an electronic library with the ability to add and edit books, authors and genres.



SQL:

Use test;
CREATE TABLE `author` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  `lastname` varchar(30) NOT NULL,
  `fathername` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci

CREATE TABLE `genre` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `genre_name` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci

CREATE TABLE `book` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `book_name` varchar(255) NOT NULL,
  `book_author` int(11) NOT NULL,
  `book_genre` int(11) NOT NULL,
  `publisher` varchar(255) NOT NULL,
  `year` int(11) NOT NULL,
  `city` varchar(100) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `book_author` (`book_author`),
  KEY `book_grene` (`book_genre`),
  CONSTRAINT `book_ibfk_1` FOREIGN KEY (`book_author`) REFERENCES `author` (`id`),
  CONSTRAINT `book_ibfk_2` FOREIGN KEY (`book_genre`) REFERENCES `genre` (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci
