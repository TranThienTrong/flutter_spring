-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema employee_db
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema employee_db
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `employee_db` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `employee_db` ;

-- -----------------------------------------------------
-- Table `employee_db`.`employee`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `employee_db`.`employee` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `fullname` VARCHAR(45) CHARACTER SET 'utf8' NOT NULL,
  `mobile_number` INT NOT NULL,
  `gender` VARCHAR(10) NULL DEFAULT NULL,
  `birthdate` DATE NOT NULL,
  `address` VARCHAR(255) CHARACTER SET 'utf8' NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 4
DEFAULT CHARACTER SET = latin1;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
