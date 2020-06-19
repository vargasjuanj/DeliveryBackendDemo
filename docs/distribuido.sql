/*
SQLyog Ultimate v11.11 (64 bit)
MySQL - 5.5.5-10.4.6-MariaDB : Database - distribuido
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`distribuido` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `distribuido`;

/*Table structure for table `articulo` */

DROP TABLE IF EXISTS `articulo`;

CREATE TABLE `articulo` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `denominacion` varchar(255) DEFAULT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `es_insumo` bit(1) DEFAULT NULL,
  `imagen` varchar(255) DEFAULT NULL,
  `precio_compra` float DEFAULT NULL,
  `precio_venta` float DEFAULT NULL,
  `stock_actual` int(11) DEFAULT NULL,
  `stock_max` int(11) DEFAULT NULL,
  `stock_min` int(11) DEFAULT NULL,
  `articulo_categoria_articulo` bigint(20) DEFAULT NULL,
  `articulo_medida_articulo` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKqhpb77pywj7tycrx5m51n5bmh` (`articulo_categoria_articulo`),
  KEY `FKha1tua7j1xdss5i894ltgv45r` (`articulo_medida_articulo`),
  CONSTRAINT `FKha1tua7j1xdss5i894ltgv45r` FOREIGN KEY (`articulo_medida_articulo`) REFERENCES `medidaarticulo` (`id`),
  CONSTRAINT `FKqhpb77pywj7tycrx5m51n5bmh` FOREIGN KEY (`articulo_categoria_articulo`) REFERENCES `categoriaarticulo` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `articulo` */

insert  into `articulo`(`id`,`denominacion`,`descripcion`,`es_insumo`,`imagen`,`precio_compra`,`precio_venta`,`stock_actual`,`stock_max`,`stock_min`,`articulo_categoria_articulo`,`articulo_medida_articulo`) values (1,'Queso','Rockeford','','img',5,10,15,20,10,1,1),(2,'Salsa','De tomate','','img2',10,20,30,40,20,2,2);

/*Table structure for table `categoriaarticulo` */

DROP TABLE IF EXISTS `categoriaarticulo`;

CREATE TABLE `categoriaarticulo` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `denominacion` varchar(255) DEFAULT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `categoria_articulo_categoria_articulo` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK1tsm00x9eg5k4fo8eepyrosn1` (`categoria_articulo_categoria_articulo`),
  CONSTRAINT `FK1tsm00x9eg5k4fo8eepyrosn1` FOREIGN KEY (`categoria_articulo_categoria_articulo`) REFERENCES `categoriaarticulo` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `categoriaarticulo` */

insert  into `categoriaarticulo`(`id`,`denominacion`,`descripcion`,`categoria_articulo_categoria_articulo`) values (1,'Lacteos','La serenisima',NULL),(2,'Salsas','La salsita',NULL);

/*Table structure for table `categoriaplato` */

DROP TABLE IF EXISTS `categoriaplato`;

CREATE TABLE `categoriaplato` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `denominacion` varchar(255) DEFAULT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `categoria_plato_categoria_plato` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKtbpos759xwvkr2wc448c043pu` (`categoria_plato_categoria_plato`),
  CONSTRAINT `FKtbpos759xwvkr2wc448c043pu` FOREIGN KEY (`categoria_plato_categoria_plato`) REFERENCES `categoriaplato` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `categoriaplato` */

insert  into `categoriaplato`(`id`,`denominacion`,`descripcion`,`categoria_plato_categoria_plato`) values (1,'Pizzas','Al horno',NULL),(2,'Empanadas','Caseras',NULL);

/*Table structure for table `detalleplato` */

DROP TABLE IF EXISTS `detalleplato`;

CREATE TABLE `detalleplato` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `cantidad` int(11) DEFAULT NULL,
  `detalle_plato_articulo` bigint(20) DEFAULT NULL,
  `detalle_plato_medida_plato` bigint(20) DEFAULT NULL,
  `detalle_plato_plato` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKb6jwaqoqif8gqevegvjajbmyf` (`detalle_plato_articulo`),
  KEY `FKoygf7hiefutq2ahaougfcown4` (`detalle_plato_medida_plato`),
  KEY `FKea1rfbbm82lsbbqn0npev8oda` (`detalle_plato_plato`),
  CONSTRAINT `FKb6jwaqoqif8gqevegvjajbmyf` FOREIGN KEY (`detalle_plato_articulo`) REFERENCES `articulo` (`id`),
  CONSTRAINT `FKea1rfbbm82lsbbqn0npev8oda` FOREIGN KEY (`detalle_plato_plato`) REFERENCES `plato` (`id`),
  CONSTRAINT `FKoygf7hiefutq2ahaougfcown4` FOREIGN KEY (`detalle_plato_medida_plato`) REFERENCES `medidaplato` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=latin1;

/*Data for the table `detalleplato` */

insert  into `detalleplato`(`id`,`cantidad`,`detalle_plato_articulo`,`detalle_plato_medida_plato`,`detalle_plato_plato`) values (28,5,1,1,25),(29,9,2,2,25);

/*Table structure for table `medidaarticulo` */

DROP TABLE IF EXISTS `medidaarticulo`;

CREATE TABLE `medidaarticulo` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `denominacion` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `medidaarticulo` */

insert  into `medidaarticulo`(`id`,`denominacion`) values (1,'gr'),(2,'cc');

/*Table structure for table `medidaplato` */

DROP TABLE IF EXISTS `medidaplato`;

CREATE TABLE `medidaplato` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `denominacion` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `medidaplato` */

insert  into `medidaplato`(`id`,`denominacion`) values (1,'medio'),(2,'cuarto');

/*Table structure for table `plato` */

DROP TABLE IF EXISTS `plato`;

CREATE TABLE `plato` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `denominacion` varchar(255) DEFAULT NULL,
  `imagen` varchar(255) DEFAULT NULL,
  `precio_venta` float DEFAULT NULL,
  `tiempo_preparacion` int(11) DEFAULT NULL,
  `plato_categoria_plato` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKb3iq3qffjbfq05jk8p85k58ol` (`plato_categoria_plato`),
  CONSTRAINT `FKb3iq3qffjbfq05jk8p85k58ol` FOREIGN KEY (`plato_categoria_plato`) REFERENCES `categoriaplato` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=latin1;

/*Data for the table `plato` */

insert  into `plato`(`id`,`denominacion`,`imagen`,`precio_venta`,`tiempo_preparacion`,`plato_categoria_plato`) values (25,'Pizza Especial','http://firebase/storage/pizza_especial.jpeg',99,15,1);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
