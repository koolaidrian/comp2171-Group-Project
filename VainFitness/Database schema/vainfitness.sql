-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: May 20, 2020 at 01:29 AM
-- Server version: 10.4.10-MariaDB
-- PHP Version: 7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `vainfitness`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
CREATE TABLE IF NOT EXISTS `admin` (
  `UserType` varchar(5) NOT NULL DEFAULT 'ADMIN',
  `Username` varchar(30) NOT NULL,
  `Password` varchar(30) NOT NULL,
  `FirstName` varchar(30) NOT NULL,
  `LastName` varchar(30) NOT NULL,
  `Contact` varchar(30) NOT NULL,
  `Email` varchar(30) NOT NULL,
  `Gender` char(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `clients`
--

DROP TABLE IF EXISTS `clients`;
CREATE TABLE IF NOT EXISTS `clients` (
  `UserType` varchar(10) NOT NULL DEFAULT 'CLIENT',
  `ID` int(11) NOT NULL,
  `Username` varchar(30) NOT NULL,
  `Password` varchar(30) NOT NULL,
  `FirstName` varchar(30) NOT NULL,
  `LastName` varchar(30) NOT NULL,
  `Contact` varchar(30) NOT NULL,
  `Email` varchar(30) NOT NULL,
  `Gender` char(10) NOT NULL,
  `Height` double NOT NULL,
  `DOB` date NOT NULL,
  `Address` varchar(50) NOT NULL,
  `Trainer` int(11) DEFAULT NULL,
  `InitialWeight` double NOT NULL,
  `CurrentWeight` double NOT NULL,
  `GoalWeight` double NOT NULL,
  `DCGoal` double NOT NULL,
  `CarbPercentage` int(11) NOT NULL,
  `ProteinPercentage` int(11) NOT NULL,
  `FatPercentage` int(11) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `clients`
--

INSERT INTO `clients` (`UserType`, `ID`, `Username`, `Password`, `FirstName`, `LastName`, `Contact`, `Email`, `Gender`, `Height`, `DOB`, `Address`, `Trainer`, `InitialWeight`, `CurrentWeight`, `GoalWeight`, `DCGoal`, `CarbPercentage`, `ProteinPercentage`, `FatPercentage`) VALUES
('CLIENT', 0, 'Tester', 'Password', 'Test', 'ing', '123445', 'test@test.com', 'M', 173, '2010-11-06', 'tester land', 0, 100, 110, 120, 1000, 30, 40, 30),
('Client', 1, 'Koolaidrian', 'myPAssW', 'oshea', 'campbell', '1876555444', 'email@example.com', 'Male', 178, '1998-10-08', 'somewhere', 1, 125, 130, 150, 1550, 40, 50, 10);

-- --------------------------------------------------------

--
-- Table structure for table `fooditems`
--

DROP TABLE IF EXISTS `fooditems`;
CREATE TABLE IF NOT EXISTS `fooditems` (
  `Name` varchar(30) NOT NULL,
  `CaloricValue` double NOT NULL,
  `MainNutritionalContent` varchar(30) NOT NULL,
  `Carbs` double NOT NULL,
  `Protein` double NOT NULL,
  `Fats` double NOT NULL,
  `image` longblob NOT NULL,
  PRIMARY KEY (`Name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `meal`
--

DROP TABLE IF EXISTS `meal`;
CREATE TABLE IF NOT EXISTS `meal` (
  `Name` varchar(30) NOT NULL,
  `TotalCaloricValue` double NOT NULL,
  `Image` longblob NOT NULL,
  PRIMARY KEY (`Name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `mealplans`
--

DROP TABLE IF EXISTS `mealplans`;
CREATE TABLE IF NOT EXISTS `mealplans` (
  `Name` varchar(30) NOT NULL,
  `Type` enum('LOCALIZED','CUSTOM') NOT NULL,
  `TotalCalories` double NOT NULL,
  `Creator` enum('CLIENT','TRAINER') NOT NULL,
  `CreatorID` int(11) NOT NULL,
  `Breakfast` varchar(20) NOT NULL,
  `Lunch` varchar(20) NOT NULL,
  `Dinner` varchar(20) NOT NULL,
  PRIMARY KEY (`Name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `meal_items`
--

DROP TABLE IF EXISTS `meal_items`;
CREATE TABLE IF NOT EXISTS `meal_items` (
  `Meal` varchar(30) NOT NULL,
  `foodItem` varchar(30) NOT NULL,
  PRIMARY KEY (`Meal`,`foodItem`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `sessionhours`
--

DROP TABLE IF EXISTS `sessionhours`;
CREATE TABLE IF NOT EXISTS `sessionhours` (
  `intervals` varchar(10) NOT NULL,
  PRIMARY KEY (`intervals`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `trainers`
--

DROP TABLE IF EXISTS `trainers`;
CREATE TABLE IF NOT EXISTS `trainers` (
  `UserType` varchar(10) NOT NULL DEFAULT 'TRAINER',
  `ID` int(11) NOT NULL,
  `Username` varchar(30) NOT NULL,
  `Password` varchar(30) NOT NULL,
  `FirstName` varchar(30) NOT NULL,
  `Lastname` varchar(30) NOT NULL,
  `Contact` varchar(30) NOT NULL,
  `Email` varchar(30) NOT NULL,
  `Gender` char(1) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `trainer_hours`
--

DROP TABLE IF EXISTS `trainer_hours`;
CREATE TABLE IF NOT EXISTS `trainer_hours` (
  `TrainerID` int(11) NOT NULL,
  `hours` varchar(10) NOT NULL,
  PRIMARY KEY (`TrainerID`,`hours`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
