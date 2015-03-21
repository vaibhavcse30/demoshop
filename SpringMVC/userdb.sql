--<ScriptOptions statementTerminator=";"/>

ALTER TABLE `userdb`.`schooldress` DROP PRIMARY KEY;

ALTER TABLE `userdb`.`users` DROP PRIMARY KEY;

ALTER TABLE `userdb`.`book` DROP PRIMARY KEY;

ALTER TABLE `userdb`.`user` DROP PRIMARY KEY;

ALTER TABLE `userdb`.`Announcment` DROP PRIMARY KEY;

DROP TABLE `userdb`.`Announcment`;

DROP TABLE `userdb`.`users`;

DROP TABLE `userdb`.`Shop`;

DROP TABLE `userdb`.`schooldress`;

DROP TABLE `userdb`.`book`;

DROP TABLE `userdb`.`user`;

CREATE TABLE `userdb`.`Announcment` (
	`ID` INT NOT NULL,
	`message_type` VARCHAR(255),
	`directed_to` VARCHAR(255),
	`category` VARCHAR(255),
	`message` VARCHAR(255),
	`scheduled_timestamp` DATETIME,
	PRIMARY KEY (`ID`)
) ENGINE=InnoDB;

CREATE TABLE `userdb`.`users` (
	`user_id` INT NOT NULL,
	`first_name` VARCHAR(100),
	`last_name` VARCHAR(100),
	`gender` VARCHAR(30),
	`city` VARCHAR(30),
	PRIMARY KEY (`user_id`)
) ENGINE=InnoDB;

CREATE TABLE `userdb`.`Shop` (
	`name` VARCHAR(30),
	`staffName` VARCHAR(30)
) ENGINE=InnoDB;

CREATE TABLE `userdb`.`schooldress` (
	`id` VARCHAR(37) NOT NULL,
	`title` VARCHAR(128) NOT NULL,
	`description` VARCHAR(256) NOT NULL,
	`schoolname` VARCHAR(64) NOT NULL,
	`createdate` DATETIME NOT NULL,
	`updatedate` DATETIME NOT NULL,
	PRIMARY KEY (`id`)
) ENGINE=InnoDB;

CREATE TABLE `userdb`.`book` (
	`id` VARCHAR(37) NOT NULL,
	`title` VARCHAR(128) NOT NULL,
	`description` VARCHAR(256) NOT NULL,
	`author` VARCHAR(64) NOT NULL,
	`createdate` DATETIME NOT NULL,
	`updatedate` DATETIME NOT NULL,
	PRIMARY KEY (`id`)
) ENGINE=InnoDB;

CREATE TABLE `userdb`.`user` (
	`UserId` INT NOT NULL,
	`first_name` VARCHAR(100),
	`last_name` VARCHAR(100),
	`gender` VARCHAR(30),
	`city` VARCHAR(30),
	PRIMARY KEY (`UserId`)
) ENGINE=InnoDB;

