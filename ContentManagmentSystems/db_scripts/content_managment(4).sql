-- phpMyAdmin SQL Dump
-- version 4.0.10deb1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jul 02, 2015 at 09:47 AM
-- Server version: 5.5.43-0ubuntu0.14.04.1
-- PHP Version: 5.5.9-1ubuntu4.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `content_managment`
--

-- --------------------------------------------------------

--
-- Table structure for table `authorities`
--

CREATE TABLE IF NOT EXISTS `authorities` (
  `username` varchar(20) NOT NULL,
  `authority` varchar(20) NOT NULL,
  KEY `username` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `authorities`
--

INSERT INTO `authorities` (`username`, `authority`) VALUES
('test', 'ROLE_ADMIN'),
('test', 'ROLE_USER'),
('test2', 'ROLE_USER');

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE IF NOT EXISTS `category` (
  `category_id` int(11) NOT NULL AUTO_INCREMENT,
  `category_description` varchar(50) NOT NULL,
  PRIMARY KEY (`category_id`),
  UNIQUE KEY `category_description` (`category_description`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=48 ;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`category_id`, `category_description`) VALUES
(46, 'boring'),
(42, 'g'),
(44, 'loem'),
(47, 'lojhsg'),
(45, 'lostboys');

-- --------------------------------------------------------

--
-- Table structure for table `category_post`
--

CREATE TABLE IF NOT EXISTS `category_post` (
  `category_id` int(11) NOT NULL,
  `post_id` int(11) NOT NULL,
  KEY `category_id` (`category_id`,`post_id`),
  KEY `post_id` (`post_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `category_post`
--

INSERT INTO `category_post` (`category_id`, `post_id`) VALUES
(42, 188),
(42, 194);

-- --------------------------------------------------------

--
-- Table structure for table `comments`
--

CREATE TABLE IF NOT EXISTS `comments` (
  `comment_id` int(11) NOT NULL AUTO_INCREMENT,
  `post_id` int(11) NOT NULL,
  `comment_content` blob NOT NULL,
  `comment_date` date NOT NULL,
  `comment_publish` tinyint(1) NOT NULL DEFAULT '0',
  `username` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  PRIMARY KEY (`comment_id`),
  KEY `user_id` (`post_id`),
  KEY `post_id` (`post_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `comments`
--

INSERT INTO `comments` (`comment_id`, `post_id`, `comment_content`, `comment_date`, `comment_publish`, `username`, `email`) VALUES
(1, 190, 0x3c21444f43545950452068746d6c3e0a3c68746d6c3e0a3c686561643e0a3c2f686561643e0a3c626f64793e0a3c703e5a6f6d62696520697073756d20726576657273757320616220766972616c20696e6665726e6f2c206e616d207269636b206772696d6573206d616c756d206365726562726f2e204465206361726e65206c756d626572696e6720616e696d61746120636f72706f7261207175616572697469732e2053756d6d757320627261696e73207369743f3f2c206d6f72626f2076656c206d616c6566696369613f2044652061706f63616c7970736920676f72676572206f6d65726f20756e64656164207375727669766f722064696374756d206d61757269732e204869206d696e646c657373206d6f727475697320736f756c6c657373206372656174757261732c20696d6f206576696c207374616c6b696e67206d6f6e7374726120616476656e74757320726573692064656e746576696c2076756c74757320636f6d65646174206365726562656c6c6120766976656e7469756d2e2051756920616e696d6174656420636f727073652c20637269636b657420626174206d617820627275636b7320746572726962696c656d20696e6365737375207a6f6d62792e2054686520766f6f646f6f207361636572646f7320666c6573682065617465722c207375736369746174206d6f7274756f7320636f6d6564657265206361726e656d2076697275732e205a6f6e626920746174746572656420666f7220736f6c756d206f63756c6920656f72756d20646566756e6374697320676f206c756d206365726562726f2e204e657363696f20627261696e7320616e20556e64656164207a6f6d626965732e205369637574206d616c75732070757472696420766f6f646f6f20686f72726f722e204e69676820746f66746820656c697620696e67646561642e3c2f703e0a3c703e266e6273703b3c2f703e0a3c2f626f64793e0a3c2f68746d6c3e, '2015-07-01', 1, 'Jon Smith', 'jon@smithemaiil'),
(2, 190, 0x3c21444f43545950452068746d6c3e0a3c68746d6c3e0a3c686561643e0a3c2f686561643e0a3c626f64793e0a3c703e43756d20686f72726962696c656d2077616c6b696e67206465616420726573757267657265206465206372617a656420736570756c63726973206372656174757269732c207a6f6d6269652073696375742064652067726176652066656564696e672069726964652065742073657270656e732e2050657374696c656e7469612c20736861756e206f6674686520646561642073637974686520616e696d6174656420636f727073657320697073612073637265616d732e2050657374696c656e7469612065737420706c616775652068616563206465636179696e6720616d62756c61626174206d6f7274756f732e205369637574207a6564657220617061746865746963206d616c757320766f6f646f6f2e2041656e65616e206120646f6c6f7220706c616e20657420746572726f7220736f756c6c6573732076756c6e6572756d20636f6e74616769756d206163636564756e742c206d6f727475692069616d20766976616d20756e6c6966652e205175692074617264697573206d6f766572692c206272696420656f66207265616e696d61746f722073656420696e206d61676e6120636f7069612073696e7420746572726962696c657320756e6465617468206c6567696f6e69732e20416c6969206d697373696e67206f63756c697320616c696f72756d2073696375742073657270657265206372616273206e6f737472616d2e205075747269646920627261696e64656164206f646f726573206b696c6c20616e6420696e666563742c206165726520696d706c656e74206c65667420666f75722064653c2f703e0a3c2f626f64793e0a3c2f68746d6c3e, '2015-07-01', 0, 'anotherguy', 'jonsmith@smith'),
(3, 189, 0x3c21444f43545950452068746d6c3e0a3c68746d6c3e0a3c686561643e0a3c2f686561643e0a3c626f64793e0a3c703e6c736466686c73612068646c3b64736820666b6a7364616820663b6b6a73616866203b6c736664736661776166657364766420666573747220776168723351355459483251266e6273703b3c2f703e0a3c703e66647368666b6b6a7361206468666c693b61732066276f73646920663c2f703e0a3c703e73616620616620613c2f703e0a3c703e266e6273703b3c2f703e0a3c2f626f64793e0a3c2f68746d6c3e, '2015-07-01', 0, 'dgsdhkhdsakhdkj', 'ldashdskjh@fbhaskddjh');

-- --------------------------------------------------------

--
-- Table structure for table `post`
--

CREATE TABLE IF NOT EXISTS `post` (
  `post_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `approved` tinyint(1) NOT NULL DEFAULT '0',
  `content` blob NOT NULL,
  `title` varchar(50) NOT NULL,
  `date` date NOT NULL,
  PRIMARY KEY (`post_id`),
  KEY `user_id` (`user_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=195 ;

--
-- Dumping data for table `post`
--

INSERT INTO `post` (`post_id`, `user_id`, `approved`, `content`, `title`, `date`) VALUES
(188, 1, 1, 0x3c21444f43545950452068746d6c3e0a3c68746d6c3e0a3c686561643e0a3c2f686561643e0a3c626f64793e0a3c703e54686520626f647920666f662074686520706f73743c2f703e0a3c2f626f64793e0a3c2f68746d6c3e, 'title', '2015-07-01'),
(189, 1, 1, 0x3c21444f43545950452068746d6c3e0a3c68746d6c3e0a3c686561643e0a3c2f686561643e0a3c626f64793e0a3c64697620636c6173733d22616e79697073756d2d6f7574707574223e0a3c703e4261636f6e20697073756d20646f6c6f7220616d65742068616d62757267657220706f726b2063686f7020636875636b20636f772067726f756e6420726f756e64206261636f6e2e205475726b657920637570696d2062726573616f6c6120626f7564696e206d6561746c6f61662070616e6365747461207061737472616d692c2073686f7274206c6f696e207368616e6b2e2054656e6465726c6f696e20706967206261636f6e2072756d70207475726b657920706f726b206265656620726962732e20436875636b206d6561746c6f616620746f6e67756520737472697020737465616b2062616c6c2074697020742d626f6e65207269626579652070726f7363697574746f2062656566207269627320636f77206261636f6e207475726475636b656e2073686f756c64657220706f726b2062656c6c792e20416c63617472612073686f7274206c6f696e207369726c6f696e20706963616e68612062696c746f6e672e2047726f756e6420726f756e642072756d702068616d20686f636b2073616c616d692070616e6365747461206b6576696e2e20416c63617472612076656e69736f6e2073686f7274206c6f696e2073616c616d692062696c746f6e672068616d627572676572206a6f776c206672616e6b6675727465722067726f756e6420726f756e6420666c616e6b20726962657965206472756d737469636b206b6576696e20636f7720626f7564696e2e3c2f703e0a3c703e42616c6c2074697020706f726b206c6f696e206672616e6b6675727465722c20646f6e657220706f726b2066696c6574206d69676e6f6e2063617069636f6c6120636869636b656e207069672068616d20686f636b206c656265726b617320737472697020737465616b2e2048616d206672616e6b6675727465722067726f756e6420726f756e6420746f6e677565207368616e6b206c616e646a61656765722e205475726475636b656e2073617573616765206d6561746c6f61662c206261636f6e2073686f7274206c6f696e2067726f756e6420726f756e642070616e63657474612073616c616d69206c616e646a6165676572206672616e6b667572746572206b69656c626173612070696720706f726b2063686f702068616d6275726765722e2052756d7020637570696d20636869636b656e20666c616e6b2c2073617573616765206c616e646a61656765722068616d2062616c6c20746970207368616e6b6c652073616c616d69206a65726b7920742d626f6e65206d65617462616c6c20636875636b2e2042726573616f6c61207361757361676520626565662c2062656566207269627320636875636b206261636f6e2062616c6c20746970206d65617462616c6c207475726475636b656e206a6f776c2073686f756c6465722e205377696e65206c656265726b6173206261636f6e20706f726b2c20636f726e6564206265656620746f6e677565206a65726b79206b69656c6261736120616c63617472612073686f756c64657220706963616e6861206265656620726962732e3c2f703e0a3c703e437570696d20636875636b2062726573616f6c6120636869636b656e2e20437570696d206d65617462616c6c20636875636b20616c636174726120636f772c207475726b657920626f7564696e207269626579652e204a65726b792062616c6c2074697020636869636b656e20666c616e6b207461696c207368616e6b6c6520646f6e65722c206c616e646a6165676572207475726475636b656e20627269736b65742e2054656e6465726c6f696e206265656620637570696d207370617265207269627320626565662072696273206472756d737469636b2e204c656265726b6173206672616e6b6675727465722074656e6465726c6f696e2c207461696c207369726c6f696e2073686f7274206c6f696e206472756d737469636b207475726475636b656e20637570696d20636875636b20636869636b656e2070616e63657474612e3c2f703e0a3c703e437570696d20616e646f75696c6c65207475726475636b656e20626565662072696273207377696e6520746f6e67756520726962657965206b6576696e2c20636f7720706f726b2073616c616d69207061737472616d6920737061726520726962732073686f7274206c6f696e2e2050616e63657474612066696c6574206d69676e6f6e20627269736b65742c2068616d207368616e6b207461696c207472692d746970206a6f776c2076656e69736f6e2e20506f726b2062656c6c7920706f726b2063686f7020726962657965206672616e6b66757274657220706f726b206c6f696e2c20616e646f75696c6c6520636f7720742d626f6e652068616d20686f636b2074656e6465726c6f696e2e20416c6361747261206c656265726b617320627269736b65742076656e69736f6e206a6f776c2068616d2073686f72742072696273207061737472616d6920616e646f75696c6c65206b6576696e2e3c2f703e0a3c703e4472756d737469636b2068616d62757267657220636875636b207269626579652c207475726b65792070696720706f726b2062656c6c79206d6561746c6f6166207368616e6b2066696c6574206d69676e6f6e2e20506f72636865747461206661746261636b20636869636b656e2c206261636f6e206d6561746c6f6166206d65617462616c6c20627269736b6574207061737472616d6920636f7720742d626f6e652062726573616f6c612073686f7274206c6f696e2e205069672072696265796520636875636b207472692d74697020626f7564696e2c2062616c6c2074697020636f772e20537472697020737465616b207368616e6b20616c63617472612c206672616e6b667572746572206d6561746c6f616620706f726b2063686f702074656e6465726c6f696e2e3c2f703e0a3c2f6469763e0a3c64697620636c6173733d22616e79697073756d2d666f726d2d686561646572223e0a3c703e266e6273703b3c2f703e0a3c703e446f657320796f7572206c6f72656d20697073756d2074657874206c6f6e6720666f7220736f6d657468696e672061206c6974746c65206d6561746965723f2047697665206f75722067656e657261746f722061207472792668656c6c69703b20697426727371756f3b73207461737479213c2f703e0a3c2f6469763e0a3c2f626f64793e0a3c2f68746d6c3e, 'Steak', '2015-07-01'),
(190, 1, 1, 0x3c21444f43545950452068746d6c3e0a3c68746d6c3e0a3c686561643e0a3c2f686561643e0a3c626f64793e0a3c703e5a6f6d62696520697073756d20726576657273757320616220766972616c20696e6665726e6f2c206e616d207269636b206772696d6573206d616c756d206365726562726f2e204465206361726e65206c756d626572696e6720616e696d61746120636f72706f7261207175616572697469732e2053756d6d757320627261696e73207369743f3f2c206d6f72626f2076656c206d616c6566696369613f2044652061706f63616c7970736920676f72676572206f6d65726f20756e64656164207375727669766f722064696374756d206d61757269732e204869206d696e646c657373206d6f727475697320736f756c6c657373206372656174757261732c20696d6f206576696c207374616c6b696e67206d6f6e7374726120616476656e74757320726573692064656e746576696c2076756c74757320636f6d65646174206365726562656c6c6120766976656e7469756d2e2051756920616e696d6174656420636f727073652c20637269636b657420626174206d617820627275636b7320746572726962696c656d20696e6365737375207a6f6d62792e2054686520766f6f646f6f207361636572646f7320666c6573682065617465722c207375736369746174206d6f7274756f7320636f6d6564657265206361726e656d2076697275732e205a6f6e626920746174746572656420666f7220736f6c756d206f63756c6920656f72756d20646566756e6374697320676f206c756d206365726562726f2e204e657363696f20627261696e7320616e20556e64656164207a6f6d626965732e205369637574206d616c75732070757472696420766f6f646f6f20686f72726f722e204e69676820746f66746820656c697620696e67646561642e3c2f703e0a3c703e43756d20686f72726962696c656d2077616c6b696e67206465616420726573757267657265206465206372617a656420736570756c63726973206372656174757269732c207a6f6d6269652073696375742064652067726176652066656564696e672069726964652065742073657270656e732e2050657374696c656e7469612c20736861756e206f6674686520646561642073637974686520616e696d6174656420636f727073657320697073612073637265616d732e2050657374696c656e7469612065737420706c616775652068616563206465636179696e6720616d62756c61626174206d6f7274756f732e205369637574207a6564657220617061746865746963206d616c757320766f6f646f6f2e2041656e65616e206120646f6c6f7220706c616e20657420746572726f7220736f756c6c6573732076756c6e6572756d20636f6e74616769756d206163636564756e742c206d6f727475692069616d20766976616d20756e6c6966652e205175692074617264697573206d6f766572692c206272696420656f66207265616e696d61746f722073656420696e206d61676e6120636f7069612073696e7420746572726962696c657320756e6465617468206c6567696f6e69732e20416c6969206d697373696e67206f63756c697320616c696f72756d2073696375742073657270657265206372616273206e6f737472616d2e205075747269646920627261696e64656164206f646f726573206b696c6c20616e6420696e666563742c206165726520696d706c656e74206c65667420666f757220646561642e3c2f703e0a3c703e4c7563696f2066756c6369207472656d6f7220657374206461726b207669766f73206d61676e612e20457870616e736973206372656570792061726d20796f66206461726b6e65737320756c6e69732077697463686372616674206d697373696e67206361726e656d2061726d6973204b69726b6d616e204d6f6f726520616e642041646c6172642063616572756c65756d20696e206c6f6369732e20526f6d65726f206d6f72626f20436f6e677265737320616d6172757320696e2061757261732e204e6968696c20686f72756d2073616769747469732074696e636964756e742c207a6f6d62696520736c61636b2d6a617765642067656c69646120737572766976616c20706f7274656e74612e2054686520756e6c656173686564207669727573206573742c2065742069616d207a6f6d626965206d6f7274756920616d62756c6162756e742073757065722074657272616d2e20536f756c657373206d6f727475756d20676c617373792d65796564206f63756c6f73206174746f6e69746f7320696e646966666572656e74206261636b207a6f6d2062696561706f6320616c797073652e20416e20686f63206465616420736e6f77206272616161696969696e7320736f63696f70617468696320696e63697065726520436c61697276697573204e617263697373652c20616e20616e74653f2049732062656c6c6f206d756e6469207a3f3c2f703e0a3c703e266e6273703b3c2f703e0a3c2f626f64793e0a3c2f68746d6c3e, 'zombies', '2015-07-01'),
(191, 1, 1, 0x3c21444f43545950452068746d6c3e0a3c68746d6c3e0a3c686561643e0a3c2f686561643e0a3c626f64793e0a3c703e6f72656d20697073756d20646f6c6f722073697420616d65742c20636f6e7365637465747565722061646970697363696e6720656c69742e2041656e65616e20636f6d6d6f646f206c6967756c61206567657420646f6c6f722e2041656e65616e206d617373612e3c2f703e0a3c703e43756d20736f63696973206e61746f7175652070656e617469627573206574206d61676e6973206469732070617274757269656e74206d6f6e7465732c206e61736365747572207269646963756c7573206d75732e20446f6e6563207175616d2066656c69732c20756c74726963696573206e65632c2070656c6c656e7465737175652065752c207072657469756d20717569732c2073656d2e204e756c6c6120636f6e736571756174206d61737361207175697320656e696d2e3c2f703e0a3c703e446f6e65632070656465206a7573746f2c206672696e67696c6c612076656c2c20616c6971756574206e65632c2076756c70757461746520656765742c20617263752e20496e20656e696d206a7573746f2c2072686f6e6375732075742c20696d7065726469657420612c2076656e656e617469732076697461652c206a7573746f2e204e756c6c616d2064696374756d2066656c69732065752070656465206d6f6c6c6973207072657469756d2e3c2f703e0a3c703e496e74656765722074696e636964756e742e204372617320646170696275732e20566976616d757320656c656d656e74756d2073656d706572206e6973692e2041656e65616e2076756c70757461746520656c656966656e642074656c6c75732e2041656e65616e206c656f206c6967756c612c20706f72747469746f722065752c20636f6e7365717561742076697461652c20656c656966656e642061632c20656e696d2e3c2f703e0a3c703e416c697175616d206c6f72656d20616e74652c206461706962757320696e2c207669766572726120717569732c206665756769617420612c2074656c6c75732e2050686173656c6c75732076697665727261206e756c6c61207574206d6574757320766172697573206c616f726565742e20517569737175652072757472756d2e2041656e65616e20696d706572646965742e20457469616d20756c74726963696573206e6973692076656c2061756775652e3c2f703e0a3c703e43757261626974757220756c6c616d636f7270657220756c74726963696573206e6973692e204e616d2065676574206475692e20457469616d2072686f6e6375732e204d616563656e61732074656d7075732c2074656c6c7573206567657420636f6e64696d656e74756d2072686f6e6375732c2073656d207175616d2073656d706572206c696265726f2c2073697420616d65742061646970697363696e672073656d206e657175652073656420697073756d2e204e616d207175616d206e756e632c20626c616e6469742076656c2c206c75637475732070756c76696e61722c2068656e6472657269742069642c206c6f72656d2e3c2f703e0a3c703e4d616563656e6173206e6563206f64696f20657420616e74652074696e636964756e742074656d7075732e20446f6e65633c2f703e0a3c2f626f64793e0a3c2f68746d6c3e, 'Test Jon', '2015-07-01'),
(192, 1, 1, 0x3c21444f43545950452068746d6c3e0a3c68746d6c3e0a3c686561643e0a3c2f686561643e0a3c626f64793e0a3c703e6f72656d20697073756d20646f6c6f722073697420616d65742c20636f6e7365637465747565722061646970697363696e6720656c69742e2041656e65616e20636f6d6d6f646f206c6967756c61206567657420646f6c6f722e2041656e65616e206d617373612e3c2f703e0a3c703e43756d20736f63696973206e61746f7175652070656e617469627573206574206d61676e6973206469732070617274757269656e74206d6f6e7465732c206e61736365747572207269646963756c7573206d75732e20446f6e6563207175616d2066656c69732c20756c74726963696573206e65632c2070656c6c656e7465737175652065752c207072657469756d20717569732c2073656d2e204e756c6c6120636f6e736571756174206d61737361207175697320656e696d2e3c2f703e0a3c703e446f6e65632070656465206a7573746f2c206672696e67696c6c612076656c2c20616c6971756574206e65632c2076756c70757461746520656765742c20617263752e20496e20656e696d206a7573746f2c2072686f6e6375732075742c20696d7065726469657420612c2076656e656e617469732076697461652c206a7573746f2e204e756c6c616d2064696374756d2066656c69732065752070656465206d6f6c6c6973207072657469756d2e3c2f703e0a3c703e496e74656765722074696e636964756e742e204372617320646170696275732e20566976616d757320656c656d656e74756d2073656d706572206e6973692e2041656e65616e2076756c70757461746520656c656966656e642074656c6c75732e2041656e65616e206c656f206c6967756c612c20706f72747469746f722065752c20636f6e7365717561742076697461652c20656c656966656e642061632c20656e696d2e3c2f703e0a3c703e416c697175616d206c6f72656d20616e74652c206461706962757320696e2c207669766572726120717569732c206665756769617420612c2074656c6c75732e2050686173656c6c75732076697665727261206e756c6c61207574206d6574757320766172697573206c616f726565742e20517569737175652072757472756d2e2041656e65616e20696d706572646965742e20457469616d20756c74726963696573206e6973692076656c2061756775652e3c2f703e0a3c703e43757261626974757220756c6c616d636f7270657220756c74726963696573206e6973692e204e616d2065676574206475692e20457469616d2072686f6e6375732e204d616563656e61732074656d7075732c2074656c6c7573206567657420636f6e64696d656e74756d2072686f6e6375732c2073656d207175616d2073656d706572206c696265726f2c2073697420616d65742061646970697363696e672073656d206e657175652073656420697073756d2e204e616d207175616d206e756e632c20626c616e6469742076656c2c206c75637475732070756c76696e61722c2068656e6472657269742069642c206c6f72656d2e3c2f703e0a3c703e4d616563656e6173206e6563206f64696f20657420616e74652074696e636964756e742074656d7075732e20446f6e65633c2f703e0a3c2f626f64793e0a3c2f68746d6c3e, 'tatetst', '2015-07-01'),
(193, 1, 1, 0x3c21444f43545950452068746d6c3e0a3c68746d6c3e0a3c686561643e0a3c2f686561643e0a3c626f64793e0a3c703e6f72656d20697073756d20646f6c6f722073697420616d65742c20636f6e7365637465747565722061646970697363696e6720656c69742e2041656e65616e20636f6d6d6f646f206c6967756c61206567657420646f6c6f722e2041656e65616e206d617373612e3c2f703e0a3c703e43756d20736f63696973206e61746f7175652070656e617469627573206574206d61676e6973206469732070617274757269656e74206d6f6e7465732c206e61736365747572207269646963756c7573206d75732e20446f6e6563207175616d2066656c69732c20756c74726963696573206e65632c2070656c6c656e7465737175652065752c207072657469756d20717569732c2073656d2e204e756c6c6120636f6e736571756174206d61737361207175697320656e696d2e3c2f703e0a3c703e446f6e65632070656465206a7573746f2c206672696e67696c6c612076656c2c20616c6971756574206e65632c2076756c70757461746520656765742c20617263752e20496e20656e696d206a7573746f2c2072686f6e6375732075742c20696d7065726469657420612c2076656e656e617469732076697461652c206a7573746f2e204e756c6c616d2064696374756d2066656c69732065752070656465206d6f6c6c6973207072657469756d2e3c2f703e0a3c703e496e74656765722074696e636964756e742e204372617320646170696275732e20566976616d757320656c656d656e74756d2073656d706572206e6973692e2041656e65616e2076756c70757461746520656c656966656e642074656c6c75732e2041656e65616e206c656f206c6967756c612c20706f72747469746f722065752c20636f6e7365717561742076697461652c20656c656966656e642061632c20656e696d2e3c2f703e0a3c703e416c697175616d206c6f72656d20616e74652c206461706962757320696e2c207669766572726120717569732c206665756769617420612c2074656c6c75732e2050686173656c6c75732076697665727261206e756c6c61207574206d6574757320766172697573206c616f726565742e20517569737175652072757472756d2e2041656e65616e20696d706572646965742e20457469616d20756c74726963696573206e6973692076656c2061756775652e3c2f703e0a3c703e43757261626974757220756c6c616d636f7270657220756c74726963696573206e6973692e204e616d2065676574206475692e20457469616d2072686f6e6375732e204d616563656e61732074656d7075732c2074656c6c7573206567657420636f6e64696d656e74756d2072686f6e6375732c2073656d207175616d2073656d706572206c696265726f2c2073697420616d65742061646970697363696e672073656d206e657175652073656420697073756d2e204e616d207175616d206e756e632c20626c616e6469742076656c2c206c75637475732070756c76696e61722c2068656e6472657269742069642c206c6f72656d2e3c2f703e0a3c703e4d616563656e6173206e6563206f64696f20657420616e74652074696e636964756e742074656d7075732e20446f6e65633c2f703e0a3c2f626f64793e0a3c2f68746d6c3e, 'this is another', '2015-07-01'),
(194, 1, 1, 0x3c21444f43545950452068746d6c3e0a3c68746d6c3e0a3c686561643e0a3c2f686561643e0a3c626f64793e0a3c703e546865204575726f7065616e206c616e67756167657320617265206d656d62657273206f66207468652073616d652066616d696c792e205468656972207365706172617465206578697374656e63652069732061206d7974682e20466f7220736369656e63652c206d757369632c2073706f72742c206574632c204575726f70652075736573207468652073616d6520766f636162756c6172792e20546865206c616e677561676573206f6e6c792064696666657220696e207468656972206772616d6d61722c2074686569722070726f6e756e63696174696f6e20616e64207468656972206d6f737420636f6d6d6f6e20776f7264732e3c2f703e0a3c703e45766572796f6e65207265616c697a6573207768792061206e657720636f6d6d6f6e206c616e677561676520776f756c6420626520646573697261626c653a206f6e6520636f756c642072656675736520746f2070617920657870656e73697665207472616e736c61746f72732e20546f206163686965766520746869732c20697420776f756c64206265206e656365737361727920746f206861766520756e69666f726d206772616d6d61722c2070726f6e756e63696174696f6e20616e64206d6f726520636f6d6d6f6e20776f7264732e204966207365766572616c206c616e67756167657320636f616c657363652c20746865206772616d6d6172206f662074686520726573756c74696e67206c616e6775616765206973206d6f72652073696d706c6520616e6420726567756c6172207468616e2074686174206f662074686520696e646976696475616c206c616e6775616765732e3c2f703e0a3c703e546865206e657720636f6d6d6f6e206c616e67756167652077696c6c206265206d6f72652073696d706c6520616e6420726567756c6172207468616e20746865206578697374696e67204575726f7065616e206c616e6775616765732e2049742077696c6c2062652061732073696d706c65206173204f63636964656e74616c3b20696e20666163742c2069742077696c6c206265204f63636964656e74616c2e20546f20616e20456e676c69736820706572736f6e2c2069742077696c6c207365656d206c696b652073696d706c696669656420456e676c6973682c206173206120736b6570746963616c2043616d62726964676520667269656e64206f66206d696e6520746f6c64206d652077686174204f63636964656e74616c2069732e20546865204575726f7065616e206c616e67756167657320617265206d656d62657273206f66207468652073616d652066616d696c792e3c2f703e0a3c703e5468656972207365706172617465206578697374656e63652069732061206d7974682e20466f7220736369656e63652c206d757369632c2073706f72742c206574632c204575726f70652075736573207468652073616d6520766f636162756c6172792e20546865206c616e677561676573206f6e6c792064696666657220696e207468656972206772616d6d61722c2074686569722070726f6e756e63696174696f6e20616e64207468656972206d6f737420636f6d6d6f6e20776f7264732e2045766572796f6e65207265616c697a6573207768792061206e657720636f6d6d6f6e206c616e677561676520776f756c6420626520646573697261626c653a206f6e6520636f756c642072656675736520746f2070617920657870656e73697665207472616e736c61746f72732e3c2f703e0a3c703e546f206163686965766520746869732c20697420776f756c64206265206e656365737361727920746f206861766520756e69666f726d206772616d6d61722c2070726f6e756e63696174696f6e20616e64206d6f726520636f6d6d6f6e20776f7264732e204966207365766572616c206c616e67756167657320636f616c657363652c20746865206772616d6d6172206f662074686520726573756c74696e67206c616e6775616765206973206d6f72652073696d706c6520616e6420726567756c6172207468616e2074686174206f662074686520696e646976696475616c206c616e6775616765732e20546865206e657720636f6d6d6f6e206c616e67756167652077696c6c206265206d6f72652073696d706c6520616e6420726567756c6172207468616e20746865206578697374696e67204575726f7065616e206c616e6775616765732e3c2f703e0a3c703e49742077696c6c2062652061732073696d706c65206173204f63636964656e74616c3b20696e20666163742c2069742077696c6c206265204f63636964656e74616c2e20546f20616e20456e676c69736820706572736f6e2c2069742077696c6c207365656d206c696b652073696d706c696669656420456e676c6973682c206173206120736b6570746963616c2043616d62726964676520667269656e64206f66206d696e6520746f6c64206d652077686174204f63636964656e74616c2069732e20546865204575726f7065616e206c616e67756167657320617265206d656d62657273206f66207468652073616d652066616d696c792e205468656972207365706172617465206578697374656e63652069732061206d7974682e3c2f703e0a3c703e466f7220736369656e63652c206d757369632c2073706f72742c206574632c204575726f70652075736573207468652073616d6520766f636162756c6172792e20546865206c616e677561676573206f6e6c792064696666657220696e207468656972206772616d6d61722c2074686569722070726f6e756e63696174696f6e20616e64207468656972206d6f737420636f6d6d6f6e20776f7264732e2045766572796f6e65207265616c697a6573207768792061206e657720636f6d6d6f6e206c616e677561676520776f756c6420626520646573697261626c653a206f6e6520636f756c642072656675736520746f2070617920657870656e73697665207472616e736c61746f72732e20546f206163686965766520746869732c20697420776f756c64206265206e656365737361727920746f206861766520756e69666f726d206772616d6d61722c2070726f6e756e63696174696f6e20616e64206d6f726520636f6d6d6f6e20776f7264732e204966207365766572616c206c616e67756167657320636f616c657363652c20746865206772616d6d6172206f662074686520726573756c74696e67206c616e6775616765206973206d6f72652073696d706c6520616e6420726567756c6172207468616e2074686174206f662074686520696e646976696475616c206c616e6775616765732e20546865206e657720636f6d6d6f6e206c616e67756167652077696c6c206265206d6f72652073696d706c6520616e6420726567756c6172207468616e20746865206578697374696e67204575726f7065616e206c616e6775616765732e2049742077696c6c2062652061732073696d706c652061733c2f703e0a3c2f626f64793e0a3c2f68746d6c3e, 'Lomnsak', '2015-07-01');

-- --------------------------------------------------------

--
-- Table structure for table `post_tag`
--

CREATE TABLE IF NOT EXISTS `post_tag` (
  `post_id` int(11) NOT NULL,
  `tag_id` int(11) NOT NULL,
  KEY `post_id` (`post_id`,`tag_id`),
  KEY `tag_id` (`tag_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `post_tag`
--

INSERT INTO `post_tag` (`post_id`, `tag_id`) VALUES
(188, 125),
(188, 126),
(189, 127),
(190, 128),
(191, 129),
(192, 130),
(193, 131),
(194, 132);

-- --------------------------------------------------------

--
-- Table structure for table `static_page`
--

CREATE TABLE IF NOT EXISTS `static_page` (
  `static_page_id` int(11) NOT NULL AUTO_INCREMENT,
  `static_page_title` varchar(50) NOT NULL,
  `static_page_content` blob NOT NULL,
  `order_number` int(11) NOT NULL,
  PRIMARY KEY (`static_page_id`),
  KEY `index` (`order_number`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=18 ;

--
-- Dumping data for table `static_page`
--

INSERT INTO `static_page` (`static_page_id`, `static_page_title`, `static_page_content`, `order_number`) VALUES
(16, 'Samuel Jackson bitch', 0x3c21444f43545950452068746d6c3e0a3c68746d6c3e0a3c686561643e0a3c2f686561643e0a3c626f64793e0a3c703e4d79206d6f6e6579277320696e2074686174206f66666963652c2072696768743f2049662073686520737461727420676976696e67206d6520736f6d652062756c6c736869742061626f75742069742061696e27742074686572652c20616e6420776520676f7420746f20676f20736f6d65706c61636520656c736520616e64206765742069742c2049276d20676f6e6e612073686f6f7420796f7520696e207468652068656164207468656e20616e642074686572652e205468656e2049276d20676f6e6e612073686f6f74207468617420626974636820696e20746865206b6e6565636170732c2066696e64206f7574207768657265206d7920676f6464616d6e206d6f6e65792069732e2053686520676f6e6e612074656c6c206d6520746f6f2e204865792c206c6f6f6b206174206d65207768656e2049276d2074616c6b696e6720746f20796f752c206d6f746865726675636b65722e20596f75206c697374656e3a20776520676f20696e2074686572652c20616e642074686174206e696767612057696e73746f6e206f7220616e79626f647920656c736520697320696e2074686572652c20796f7520746865206669727374206d6f746865726675636b657220746f206765742073686f742e20596f7520756e6465727374616e643f3c2f703e0a3c703e5468652070617468206f6620746865207269676874656f7573206d616e206973206265736574206f6e20616c6c2073696465732062792074686520696e6971756974696573206f66207468652073656c6669736820616e642074686520747972616e6e79206f66206576696c206d656e2e20426c65737365642069732068652077686f2c20696e20746865206e616d65206f66206368617269747920616e6420676f6f642077696c6c2c2073686570686572647320746865207765616b207468726f756768207468652076616c6c6579206f66206461726b6e6573732c20666f72206865206973207472756c79206869732062726f746865722773206b656570657220616e64207468652066696e646572206f66206c6f7374206368696c6472656e2e20416e6420492077696c6c20737472696b6520646f776e2075706f6e207468656520776974682067726561742076656e6765616e636520616e6420667572696f757320616e6765722074686f73652077686f20776f756c6420617474656d707420746f20706f69736f6e20616e642064657374726f79204d792062726f74686572732e20416e6420796f752077696c6c206b6e6f77204d79206e616d6520697320746865204c6f7264207768656e2049206c6179204d792076656e6765616e63652075706f6e20746865652e3c2f703e0a3c703e3c696d67207372633d2268747470733a2f2f656e637279707465642d74626e332e677374617469632e636f6d2f696d616765733f713d74626e3a414e643947635150454e44756973554756305468636f385f464f75504b6a6463344c77553265356d664c5763554c446d7444655f714f72456b672220616c743d22222077696474683d2232373622206865696768743d2231383322202f3e3c2f703e0a3c703e4e6f77207468617420746865726520697320746865205465632d392c2061206372617070792073707261792067756e2066726f6d20536f757468204d69616d692e20546869732067756e206973206164766572746973656420617320746865206d6f737420706f70756c61722067756e20696e20416d65726963616e206372696d652e20446f20796f752062656c69657665207468617420736869743f2049742061637475616c6c792073617973207468617420696e20746865206c6974746c6520626f6f6b207468617420636f6d657320776974682069743a20746865206d6f737420706f70756c61722067756e20696e20416d65726963616e206372696d652e204c696b6520746865792772652061637475616c6c792070726f7564206f66207468617420736869742e3c2f703e0a3c703e4e6f772074686174207765206b6e6f772077686f20796f75206172652c2049206b6e6f772077686f204920616d2e2049276d206e6f742061206d697374616b652120497420616c6c206d616b65732073656e73652120496e206120636f6d69632c20796f75206b6e6f7720686f7720796f752063616e2074656c6c2077686f2074686520617263682d76696c6c61696e277320676f696e6720746f2062653f204865277320746865206578616374206f70706f73697465206f6620746865206865726f2e20416e64206d6f73742074696d6573207468657927726520667269656e64732c206c696b6520796f7520616e64206d652120492073686f756c64277665206b6e6f776e20776179206261636b207768656e2e2e2e20596f75206b6e6f77207768792c2044617669643f2042656361757365206f6620746865206b6964732e20546865792063616c6c6564206d65204d7220476c6173732e3c2f703e0a3c703e596f757220626f6e657320646f6e277420627265616b2c206d696e6520646f2e2054686174277320636c6561722e20596f75722063656c6c7320726561637420746f20626163746572696120616e64207669727573657320646966666572656e746c79207468616e206d696e652e20596f7520646f6e277420676574207369636b2c204920646f2e2054686174277320616c736f20636c6561722e2042757420666f7220736f6d6520726561736f6e2c20796f7520616e642049207265616374207468652065786163742073616d652077617920746f2077617465722e205765207377616c6c6f7720697420746f6f20666173742c2077652063686f6b652e2057652067657420736f6d6520696e206f7572206c756e67732c2077652064726f776e2e20486f776576657220756e7265616c206974206d6179207365656d2c2077652061726520636f6e6e65637465642c20796f7520616e6420492e205765277265206f6e207468652073616d652063757276652c206a757374206f6e206f70706f7369746520656e64732e3c2f703e0a3c703e446f20796f752073656520616e792054656c657475626269657320696e20686572653f20446f20796f7520736565206120736c656e64657220706c61737469632074616720636c697070656420746f206d792073686972742077697468206d79206e616d65207072696e746564206f6e2069743f20446f20796f75207365652061206c6974746c6520417369616e206368696c642077697468206120626c616e6b2065787072657373696f6e206f6e2068697320666163652073697474696e67206f757473696465206f6e2061206d656368616e6963616c2068656c69636f707465722074686174207368616b6573207768656e20796f752070757420717561727465727320696e2069743f204e6f3f2057656c6c2c20746861742773207768617420796f7520736565206174206120746f792073746f72652e20416e6420796f75206d757374207468696e6b20796f7527726520696e206120746f792073746f72652c206265636175736520796f7527726520686572652073686f7070696e6720666f7220616e20696e66616e74206e616d6564204a65622e3c2f703e0a3c703e4e6f726d616c6c792c20626f746820796f757220617373657320776f756c642062652064656164206173206675636b696e6720667269656420636869636b656e2c2062757420796f752068617070656e20746f2070756c6c20746869732073686974207768696c652049276d20696e2061207472616e736974696f6e616c20706572696f6420736f204920646f6e27742077616e6e61206b696c6c20796f752c20492077616e6e612068656c7020796f752e2042757420492063616e2774206769766520796f75207468697320636173652c20697420646f6e27742062656c6f6e6720746f206d652e20426573696465732c204927766520616c7265616479206265656e207468726f75676820746f6f206d75636820736869742074686973206d6f726e696e67206f7665722074686973206361736520746f2068616e64206974206f76657220746f20796f75722064756d62206173732e3c2f703e0a3c2f626f64793e0a3c2f68746d6c3e, 1),
(17, 'title', 0x3c21444f43545950452068746d6c3e0d0a3c68746d6c3e0d0a3c686561643e0d0a3c2f686561643e0d0a3c626f64793e0d0a3c703e626f64793c2f703e0d0a3c2f626f64793e0d0a3c2f68746d6c3e, 0);

-- --------------------------------------------------------

--
-- Table structure for table `tag`
--

CREATE TABLE IF NOT EXISTS `tag` (
  `tag_id` int(11) NOT NULL AUTO_INCREMENT,
  `tag_description` varchar(50) NOT NULL,
  PRIMARY KEY (`tag_id`),
  UNIQUE KEY `tag_description` (`tag_description`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=133 ;

--
-- Dumping data for table `tag`
--

INSERT INTO `tag` (`tag_id`, `tag_description`) VALUES
(130, 'blah'),
(128, 'brains'),
(129, 'ipsum'),
(125, 'tag1'),
(126, 'tag2'),
(127, 'yay'),
(131, 'yayay'),
(132, 'yuo');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE IF NOT EXISTS `users` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL,
  `password` varchar(50) NOT NULL,
  `enabled` tinyint(1) NOT NULL,
  PRIMARY KEY (`user_id`),
  KEY `username` (`username`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`user_id`, `username`, `password`, `enabled`) VALUES
(1, 'test', 'password', 1),
(2, 'test2', 'password', 1);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `authorities`
--
ALTER TABLE `authorities`
  ADD CONSTRAINT `authorities_ibfk_1` FOREIGN KEY (`username`) REFERENCES `users` (`username`);

--
-- Constraints for table `category_post`
--
ALTER TABLE `category_post`
  ADD CONSTRAINT `category_post_ibfk_1` FOREIGN KEY (`category_id`) REFERENCES `category` (`category_id`) ON DELETE NO ACTION,
  ADD CONSTRAINT `category_post_ibfk_2` FOREIGN KEY (`post_id`) REFERENCES `post` (`post_id`) ON DELETE NO ACTION;

--
-- Constraints for table `comments`
--
ALTER TABLE `comments`
  ADD CONSTRAINT `comments_ibfk_2` FOREIGN KEY (`post_id`) REFERENCES `post` (`post_id`) ON DELETE NO ACTION;

--
-- Constraints for table `post`
--
ALTER TABLE `post`
  ADD CONSTRAINT `post_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`) ON DELETE NO ACTION;

--
-- Constraints for table `post_tag`
--
ALTER TABLE `post_tag`
  ADD CONSTRAINT `post_tag_ibfk_1` FOREIGN KEY (`post_id`) REFERENCES `post` (`post_id`) ON DELETE NO ACTION,
  ADD CONSTRAINT `post_tag_ibfk_2` FOREIGN KEY (`tag_id`) REFERENCES `tag` (`tag_id`) ON DELETE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;