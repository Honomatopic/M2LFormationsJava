-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Hôte : localhost
-- Généré le : mer. 13 jan. 2021 à 21:02
-- Version du serveur :  8.0.22
-- Version de PHP : 7.4.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `m2lformations`
--

-- --------------------------------------------------------

--
-- Structure de la table `duree`
--

CREATE TABLE `duree` (
  `id` int NOT NULL,
  `datedebut` date DEFAULT NULL,
  `datefin` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `duree`
--

INSERT INTO `duree` (`id`, `datedebut`, `datefin`) VALUES
(1, '2014-09-01', '2015-01-04'),
(2, '2015-01-05', '2015-06-07'),
(3, '2015-06-08', '2015-08-31'),
(8, '2015-09-02', '2015-10-03');

-- --------------------------------------------------------

--
-- Structure de la table `employe`
--

CREATE TABLE `employe` (
  `id` int NOT NULL,
  `nom` varchar(250) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `prenom` varchar(250) DEFAULT NULL,
  `email` varchar(250) DEFAULT NULL,
  `motpasse` varchar(250) DEFAULT NULL,
  `statut` tinyint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `employe`
--

INSERT INTO `employe` (`id`, `nom`, `prenom`, `email`, `motpasse`, `statut`) VALUES
(12, 'Rasamoelina', 'Honoré', 'honore.rasamoelina@yahoo.com', 'honore', 1),
(13, 'Poupard', 'Diane', 'diane.poupard@yahoo.com', 'diane', 0),
(14, 'De Giovanni', 'Ségolène', 'segolene.degiovanni@yahoo.com', 'segolene', 0),
(15, 'Gibert', 'Stéphanie', 'stephanie.gibert@yahoo.com', 'stephanie', 0),
(16, 'De Andrade', 'Aurélia', 'aurelia.deandrade@yahoo.com', 'aurelia', 0),
(17, 'Challouet', 'Marie', 'marie.challouet@yahoo.com', 'marie', 0),
(18, 'Allain', 'Nathalie', 'nathalie.allain@yahoo.com', 'nathalie', 0),
(19, 'Attia', 'Sabera', 'sabera.attia@yahoo.com', 'sabera', 0),
(22, 'Faria', 'Stéphanie', 'stephanie.faria@yahoo.com', 'stephanie', 0),
(25, 'Baranger', 'Audrey', 'audrey.baranger@yahoo.com', 'audrey', 0),
(26, 'Fontaine', 'Sandra', 'sandra.fontaine@yahoo.com', 'sandra', 0);

-- --------------------------------------------------------

--
-- Structure de la table `formation`
--

CREATE TABLE `formation` (
  `id` int NOT NULL,
  `intitule` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `formation`
--

INSERT INTO `formation` (`id`, `intitule`) VALUES
(20, 'Formation de PHP'),
(21, 'Formation de SQL'),
(22, 'Formation de Java J2EE'),
(26, 'Formation de Merise'),
(29, 'Formation de contrôleur programmeur');

-- --------------------------------------------------------

--
-- Structure de la table `inscrire`
--

CREATE TABLE `inscrire` (
  `employe_id` int DEFAULT NULL,
  `session_id` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `inscrire`
--

INSERT INTO `inscrire` (`employe_id`, `session_id`) VALUES
(12, 1),
(12, 3),
(13, 1);

-- --------------------------------------------------------

--
-- Structure de la table `intervenant`
--

CREATE TABLE `intervenant` (
  `id` int NOT NULL,
  `nom` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `intervenant`
--

INSERT INTO `intervenant` (`id`, `nom`) VALUES
(1, 'Guy Martin'),
(2, 'Philippe Vignard'),
(3, 'Jean-François Poivey'),
(8, 'Honoré Rasamoelina');

-- --------------------------------------------------------

--
-- Structure de la table `prestataire`
--

CREATE TABLE `prestataire` (
  `id` int NOT NULL,
  `nom` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `prestataire`
--

INSERT INTO `prestataire` (`id`, `nom`) VALUES
(1, 'Inconnu'),
(2, 'CNAM'),
(3, 'GRETA'),
(4, 'AFPA'),
(5, 'Privé'),
(12, 'Service public');

-- --------------------------------------------------------

--
-- Structure de la table `salle`
--

CREATE TABLE `salle` (
  `id` int NOT NULL,
  `nom` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `salle`
--

INSERT INTO `salle` (`id`, `nom`) VALUES
(1, 'Salle Majorette'),
(2, 'Salle Grüber'),
(3, 'Salle Lamour'),
(4, 'Salle Longwy'),
(5, 'Salle Daum'),
(6, 'Salle Gallé'),
(7, 'Salle Corbin'),
(8, 'Salle Baccarat'),
(13, 'Salle multimedia');

-- --------------------------------------------------------

--
-- Structure de la table `session`
--

CREATE TABLE `session` (
  `id` int NOT NULL,
  `formation_id` int DEFAULT NULL,
  `duree_id` int DEFAULT NULL,
  `salle_id` int DEFAULT NULL,
  `intervenant_id` int DEFAULT NULL,
  `prestataire_id` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `session`
--

INSERT INTO `session` (`id`, `formation_id`, `duree_id`, `salle_id`, `intervenant_id`, `prestataire_id`) VALUES
(1, 20, 1, 5, 2, 3),
(3, 22, 1, 4, 1, 2),
(4, 21, 1, 3, 3, 5),
(5, 22, 2, 1, 1, 3),
(10, 20, 2, 3, 1, 3),
(15, 21, 1, 3, 3, 5),
(17, 29, 8, 2, 2, 12);

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `duree`
--
ALTER TABLE `duree`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `employe`
--
ALTER TABLE `employe`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `formation`
--
ALTER TABLE `formation`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `inscrire`
--
ALTER TABLE `inscrire`
  ADD KEY `fk_session_has_employe_employe1_idx` (`employe_id`),
  ADD KEY `fk_session_has_employe_session1_idx` (`session_id`);

--
-- Index pour la table `intervenant`
--
ALTER TABLE `intervenant`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `prestataire`
--
ALTER TABLE `prestataire`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `salle`
--
ALTER TABLE `salle`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `session`
--
ALTER TABLE `session`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_session_intervenant1_idx` (`intervenant_id`),
  ADD KEY `fk_session_prestataire1_idx` (`prestataire_id`),
  ADD KEY `fk_session_formation1_idx` (`formation_id`),
  ADD KEY `fk_session_duree1_idx` (`duree_id`),
  ADD KEY `fk_session_salle1_idx` (`salle_id`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `duree`
--
ALTER TABLE `duree`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT pour la table `employe`
--
ALTER TABLE `employe`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=38;

--
-- AUTO_INCREMENT pour la table `formation`
--
ALTER TABLE `formation`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;

--
-- AUTO_INCREMENT pour la table `intervenant`
--
ALTER TABLE `intervenant`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT pour la table `prestataire`
--
ALTER TABLE `prestataire`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT pour la table `salle`
--
ALTER TABLE `salle`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT pour la table `session`
--
ALTER TABLE `session`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `inscrire`
--
ALTER TABLE `inscrire`
  ADD CONSTRAINT `fk_session_has_employe_employe1` FOREIGN KEY (`employe_id`) REFERENCES `employe` (`id`),
  ADD CONSTRAINT `fk_session_has_employe_session1` FOREIGN KEY (`session_id`) REFERENCES `session` (`id`);

--
-- Contraintes pour la table `session`
--
ALTER TABLE `session`
  ADD CONSTRAINT `fk_session_duree1` FOREIGN KEY (`duree_id`) REFERENCES `duree` (`id`),
  ADD CONSTRAINT `fk_session_formation1` FOREIGN KEY (`formation_id`) REFERENCES `formation` (`id`),
  ADD CONSTRAINT `fk_session_intervenant1` FOREIGN KEY (`intervenant_id`) REFERENCES `intervenant` (`id`),
  ADD CONSTRAINT `fk_session_prestataire1` FOREIGN KEY (`prestataire_id`) REFERENCES `prestataire` (`id`),
  ADD CONSTRAINT `fk_session_salle1` FOREIGN KEY (`salle_id`) REFERENCES `salle` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
