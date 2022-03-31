-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 31, 2022 at 07:02 PM
-- Server version: 10.4.18-MariaDB
-- PHP Version: 7.4.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbtp1dpbo`
--

-- --------------------------------------------------------

--
-- Table structure for table `dbauthor_tp1`
--

CREATE TABLE `dbauthor_tp1` (
  `id` int(100) NOT NULL,
  `image` varchar(255) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `jumlah_buku` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `dbauthor_tp1`
--

INSERT INTO `dbauthor_tp1` (`id`, `image`, `nama`, `jumlah_buku`) VALUES
(1, 'gambar author 1', 'Satria', 3),
(2, 'gambar author 2', 'pinandita', 4),
(3, 'gambar author 3', 'abyatarsyah', 5),
(4, 'gambar1', 'buku4', 12);

-- --------------------------------------------------------

--
-- Table structure for table `dbbook_tp1`
--

CREATE TABLE `dbbook_tp1` (
  `id` int(100) NOT NULL,
  `image` varchar(255) NOT NULL,
  `penerbit` varchar(255) NOT NULL,
  `author` varchar(255) NOT NULL,
  `description` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `dbbook_tp1`
--

INSERT INTO `dbbook_tp1` (`id`, `image`, `penerbit`, `author`, `description`) VALUES
(1, 'gambar buku 1', 'penerbit 1', 'satria', 'buku 1'),
(2, 'gambar buku 2', 'penerbit 1', 'pinandita', 'buku 2'),
(3, 'gambar buku 3', 'penerbit 2', 'abyatarsyah', 'buku 3');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `dbauthor_tp1`
--
ALTER TABLE `dbauthor_tp1`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `dbbook_tp1`
--
ALTER TABLE `dbbook_tp1`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
