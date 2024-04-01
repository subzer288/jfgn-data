CREATE TABLE IF NOT EXISTS `jfgn`.`courses` (
`id` INT NOT NULL AUTO_INCREMENT,
`course` VARCHAR(255) NULL,
`institution` VARCHAR(255) NULL,
`start_date` DATE NULL,
`currently_learning` TINYINT(1) NULL,
`end_date` DATE NULL,
PRIMARY KEY (`id`));

CREATE TABLE IF NOT EXISTS `jfgn`.`jobs` (
`id` INT NOT NULL AUTO_INCREMENT,
`name` VARCHAR(255) NULL,
`company` VARCHAR(255) NULL,
`city` VARCHAR(255) NULL,
`start_date` DATE NULL,
`current_job` TINYINT(1) NULL,
`end_date` DATE NULL,
PRIMARY KEY (`id`));

CREATE TABLE IF NOT EXISTS `jfgn`.`job_activities` (
`id` INT NOT NULL AUTO_INCREMENT,
`activity` VARCHAR(255) NULL,
`id_job` INT NOT NULL,
PRIMARY KEY (`id`),
INDEX `id_job_idx` (`id_job` ASC) VISIBLE,
CONSTRAINT `id_job`
FOREIGN KEY (`id_job`)
REFERENCES `jfgn`.`jobs` (`id`)
ON DELETE NO ACTION
ON UPDATE NO ACTION);

CREATE TABLE IF NOT EXISTS `jfgn`.`type_technologies` (
`id` INT NOT NULL AUTO_INCREMENT,
`name` VARCHAR(255) NULL,
PRIMARY KEY (`id`));

CREATE TABLE IF NOT EXISTS `jfgn`.`technologies` (
`id` INT NOT NULL AUTO_INCREMENT,
`name` VARCHAR(255) NULL,
`value` INT NULL,
`id_type_technologies` INT NOT NULL,
PRIMARY KEY (`id`),
INDEX `id_type_technologies_idx` (`id_type_technologies` ASC) VISIBLE,
CONSTRAINT `id_type_technologies`
FOREIGN KEY (`id_type_technologies`)
REFERENCES `jfgn`.`type_technologies` (`id`)
ON DELETE NO ACTION
ON UPDATE NO ACTION);

CREATE TABLE IF NOT EXISTS `jfgn`.`education` (
`id` INT NOT NULL AUTO_INCREMENT,
`name` VARCHAR(255) NULL,
`school` VARCHAR(255) NULL,
`city` VARCHAR(255) NULL,
`start_date` DATE NULL,
`currently_student` TINYINT(1) NULL,
`end_date` DATE NULL,
`status` VARCHAR(255) NULL,
PRIMARY KEY (`id`));