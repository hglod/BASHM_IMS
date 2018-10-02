-- phpMyAdmin SQL Dump
-- version 4.7.7
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 27, 2018 at 10:57 PM
-- Server version: 10.1.30-MariaDB
-- PHP Version: 7.2.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `BASHM`
--

-- --------------------------------------------------------

--
-- Table structure for table `Parts`
--

CREATE TABLE `parts` (
  `ID` int(30) NOT NULL,
  `Quantity` int(5) NOT NULL,
  `Price` decimal(6,0) NOT NULL,
  `Purchase_Date` date NOT NULL,
  `Description` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Parts`
--

INSERT INTO `Parts` (`ID`, `Quantity`, `Price`, `Purchase_Date`, `Description`) VALUES
(1, 2, '20', '2018-09-27', 'Memory Sticks');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Parts`
--
ALTER TABLE `Parts`
  ADD PRIMARY KEY (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
