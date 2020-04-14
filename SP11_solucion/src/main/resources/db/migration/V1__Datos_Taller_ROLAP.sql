SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de cadena1: `test`
--
use  test;

CREATE TABLE `dimpaciente` (
`id` int(11) NOT NULL AUTO_INCREMENT,
`epoc` bit(1) NOT NULL,
`imc` int(11) NOT NULL,
`alcoholismo` bit(1) NOT NULL,
`cancer` bit(1) NOT NULL,
`cardiopatia` bit(1) NOT NULL,
`colesterol` bit(1) NOT NULL,
`edad` int(11) NOT NULL,
`forma_fisica` int(11) NOT NULL,
`hepatitis` int(11) NOT NULL,
`hipertension` bit(1) NOT NULL,
`reuma` bit(1) NOT NULL,
`sexo` bit(1) NOT NULL,
`tabaquismo` bit(1) NOT NULL,
PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `dimtiempo` (
`id` int(11) NOT NULL AUTO_INCREMENT,
`anio` int(11) NOT NULL,
`cuatrim` int(11) NOT NULL,
`dia` int(11) NOT NULL,
`diasemana` varchar(255) DEFAULT NULL,
`esfinde` bit(1) NOT NULL,
`fecha` datetime DEFAULT NULL,
`mes` int(11) NOT NULL,
PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `dimhospital` (
`id` varchar(255) NOT NULL,
`autopista` varchar(255) DEFAULT NULL,
`cpostal` int(11) NOT NULL,
`gestor` varchar(255) DEFAULT NULL,
`nombre` varchar(255) DEFAULT NULL,
PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `tablahechos` (
`id` int(11) NOT NULL AUTO_INCREMENT,
`uci` varchar(255) DEFAULT NULL,
`duracion` int(11) NOT NULL,
`fallecido` varchar(255) DEFAULT NULL,
`tratamiento` int(11) NOT NULL,
`cliente_id` int(11) DEFAULT NULL,
`fecha_ingreso_id` int(11) DEFAULT NULL,
`hospital_id` varchar(255) DEFAULT NULL,
PRIMARY KEY (`id`),
KEY `FK_daa8660jljeega6a0hoiy61uc` (`cliente_id`),
KEY `FK_dpnb4j2ovr4rwlp54qsfjh6iq` (`fecha_ingreso_id`),
CONSTRAINT `FK_daa8660jljeega6a0hoiy61uc` FOREIGN KEY (`cliente_id`) REFERENCES `dimpaciente` (`id`),
CONSTRAINT `FK_dpnb4j2ovr4rwlp54qsfjh6iq` FOREIGN KEY (`fecha_ingreso_id`) REFERENCES `dimtiempo` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
