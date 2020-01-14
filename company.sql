-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 14 Jan 2020 pada 11.58
-- Versi server: 10.3.15-MariaDB
-- Versi PHP: 7.3.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `company`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `bighit`
--

CREATE TABLE `bighit` (
  `id_artis` int(10) NOT NULL,
  `nama` varchar(25) NOT NULL,
  `alamat` varchar(15) NOT NULL,
  `grup` varchar(15) NOT NULL,
  `th_debut` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `bighit`
--

INSERT INTO `bighit` (`id_artis`, `nama`, `alamat`, `grup`, `th_debut`) VALUES
(1, 'Jimin', 'Busan', 'BTS', '2013'),
(2, 'Subin', 'seoul', 'TXT', '2019'),
(3, 'Atiqo', 'pandaan', 'BP', '2035'),
(4, 'Elmaida', 'Baujeng', 'jk', '2015');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `bighit`
--
ALTER TABLE `bighit`
  ADD PRIMARY KEY (`id_artis`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
