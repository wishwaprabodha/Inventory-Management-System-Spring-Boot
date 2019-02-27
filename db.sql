-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema ipaytest2
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema ipaytest2
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `ipaytest2` DEFAULT CHARACTER SET latin1 ;
USE `ipaytest2` ;

-- -----------------------------------------------------
-- Table `ipaytest2`.`category`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ipaytest2`.`category` (
  `categoryId` INT(11) NOT NULL,
  `categoryName` VARCHAR(20) NULL DEFAULT NULL,
  `CreatedUser` VARCHAR(30) NOT NULL,
  `CreatedDateTime` DATETIME NOT NULL,
  `LastModifiedUser` VARCHAR(30) NULL DEFAULT NULL,
  `LastModifiedDateTime` DATETIME NULL DEFAULT NULL,
  `VERSION` DECIMAL(10,0) NULL DEFAULT NULL,
  PRIMARY KEY (`categoryId`))
  ENGINE = InnoDB
  DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `ipaytest2`.`category_log`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ipaytest2`.`category_log` (
  `categoryId` INT(11) NOT NULL,
  `categoryName` VARCHAR(20) NULL DEFAULT NULL,
  `CreatedUser` VARCHAR(30) NOT NULL,
  `CreatedDateTime` DATETIME NOT NULL,
  `LastModifiedUser` VARCHAR(30) NULL DEFAULT NULL,
  `LastModifiedDateTime` DATETIME NULL DEFAULT NULL,
  `VERSION` DECIMAL(10,0) NULL DEFAULT NULL,
  PRIMARY KEY (`categoryId`))
  ENGINE = InnoDB
  DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `ipaytest2`.`pricing`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ipaytest2`.`pricing` (
  `pricingId` INT(11) NOT NULL,
  `pricingName` VARCHAR(20) NULL DEFAULT NULL,
  `pricingDiscountPrecentage` DECIMAL(10,0) NULL DEFAULT NULL,
  `pricingEffectiveDate` DATE NULL DEFAULT NULL,
  `pricingExpireDate` DATE NULL DEFAULT NULL,
  `CreatedUser` VARCHAR(30) NOT NULL,
  `CreatedDateTime` DATETIME NOT NULL,
  `LastModifiedUser` VARCHAR(30) NULL DEFAULT NULL,
  `LastModifiedDateTime` DATETIME NULL DEFAULT NULL,
  `VERSION` DECIMAL(10,0) NULL DEFAULT NULL,
  PRIMARY KEY (`pricingId`))
  ENGINE = InnoDB
  DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `ipaytest2`.`pricing_log`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ipaytest2`.`pricing_log` (
  `pricingId` INT(11) NOT NULL,
  `pricingName` VARCHAR(20) NULL DEFAULT NULL,
  `pricingDiscountPrecentage` DECIMAL(10,0) NULL DEFAULT NULL,
  `pricingEffectiveDate` DATE NULL DEFAULT NULL,
  `pricingExpireDate` DATE NULL DEFAULT NULL,
  `CreatedUser` VARCHAR(30) NOT NULL,
  `CreatedDateTime` DATETIME NOT NULL,
  `LastModifiedUser` VARCHAR(30) NULL DEFAULT NULL,
  `LastModifiedDateTime` DATETIME NULL DEFAULT NULL,
  `VERSION` DECIMAL(10,0) NULL DEFAULT NULL,
  PRIMARY KEY (`pricingId`))
  ENGINE = InnoDB
  DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `ipaytest2`.`product`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ipaytest2`.`product` (
  `productId` INT(11) NOT NULL,
  `productName` VARCHAR(20) NULL DEFAULT NULL,
  `productIsService` TINYINT(1) NULL DEFAULT NULL,
  `productbuyingPrice` DOUBLE NULL DEFAULT NULL,
  `productsellingPrice` DOUBLE NULL DEFAULT NULL,
  `categoryId` INT(11) NULL DEFAULT NULL,
  `CreatedUser` VARCHAR(30) NOT NULL,
  `CreatedDateTime` DATETIME NOT NULL,
  `LastModifiedUser` VARCHAR(30) NULL DEFAULT NULL,
  `LastModifiedDateTime` DATETIME NULL DEFAULT NULL,
  `VERSION` DECIMAL(10,0) NULL DEFAULT NULL,
  PRIMARY KEY (`productId`),
  INDEX `categoryId` (`categoryId` ASC),
  CONSTRAINT `product_ibfk_2`
  FOREIGN KEY (`categoryId`)
  REFERENCES `ipaytest2`.`category` (`categoryId`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
  ENGINE = InnoDB
  DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `ipaytest2`.`product_log`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ipaytest2`.`product_log` (
  `productId` INT(11) NOT NULL,
  `productName` VARCHAR(20) NULL DEFAULT NULL,
  `productIsService` TINYINT(1) NULL DEFAULT NULL,
  `productbuyingPrice` DOUBLE NULL DEFAULT NULL,
  `productsellingPrice` DOUBLE NULL DEFAULT NULL,
  `pricingId` INT(11) NULL DEFAULT NULL,
  `categoryId` INT(11) NULL DEFAULT NULL,
  `CreatedUser` VARCHAR(30) NOT NULL,
  `CreatedDateTime` DATETIME NOT NULL,
  `LastModifiedUser` VARCHAR(30) NULL DEFAULT NULL,
  `LastModifiedDateTime` DATETIME NULL DEFAULT NULL,
  `VERSION` DECIMAL(10,0) NULL DEFAULT NULL,
  PRIMARY KEY (`productId`))
  ENGINE = InnoDB
  DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `ipaytest2`.`supplier`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ipaytest2`.`supplier` (
  `supplierId` INT(11) NOT NULL,
  `supplierName` VARCHAR(20) NULL DEFAULT NULL,
  `supplierContact` DECIMAL(10,0) NULL DEFAULT NULL,
  `supplierCompany` VARCHAR(30) NULL DEFAULT NULL,
  `CreatedUser` VARCHAR(30) NOT NULL,
  `CreatedDateTime` DATETIME NOT NULL,
  `LastModifiedUser` VARCHAR(30) NULL DEFAULT NULL,
  `LastModifiedDateTime` DATETIME NULL DEFAULT NULL,
  `VERSION` DECIMAL(10,0) NULL DEFAULT NULL,
  PRIMARY KEY (`supplierId`))
  ENGINE = InnoDB
  DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `ipaytest2`.`stock`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ipaytest2`.`stock` (
  `refId` INT(11) NOT NULL,
  `stockId` INT(11) NULL DEFAULT NULL,
  `supplierId` INT(11) NULL DEFAULT NULL,
  `productId` INT(11) NULL DEFAULT NULL,
  `categoryId` INT(11) NULL DEFAULT NULL,
  `quantity` INT(11) NULL DEFAULT NULL,
  `dateStock` DATE NULL DEFAULT NULL,
  `CreatedUser` VARCHAR(30) NOT NULL,
  `CreatedDateTime` DATETIME NOT NULL,
  `LastModifiedUser` VARCHAR(30) NULL DEFAULT NULL,
  `LastModifiedDateTime` DATETIME NULL DEFAULT NULL,
  `branchId` VARCHAR(45) NULL,
  `VERSION` DECIMAL(10,0) NULL DEFAULT NULL,
  PRIMARY KEY (`refId`),
  INDEX `productId` (`productId` ASC),
  INDEX `supplierId` (`supplierId` ASC),
  INDEX `categoryId` (`categoryId` ASC),
  CONSTRAINT `stock_ibfk_1`
  FOREIGN KEY (`productId`)
  REFERENCES `ipaytest2`.`product` (`productId`),
  CONSTRAINT `stock_ibfk_2`
  FOREIGN KEY (`supplierId`)
  REFERENCES `ipaytest2`.`supplier` (`supplierId`),
  CONSTRAINT `stock_ibfk_3`
  FOREIGN KEY (`categoryId`)
  REFERENCES `ipaytest2`.`category` (`categoryId`))
  ENGINE = InnoDB
  DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `ipaytest2`.`stock_log`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ipaytest2`.`stock_log` (
  `refId` INT(11) NOT NULL,
  `stockId` INT(11) NULL DEFAULT NULL,
  `supplierId` INT(11) NULL DEFAULT NULL,
  `productId` INT(11) NULL DEFAULT NULL,
  `categoryId` INT(11) NULL DEFAULT NULL,
  `quantity` INT(11) NULL DEFAULT NULL,
  `dateStock` DATE NULL DEFAULT NULL,
  `CreatedUser` VARCHAR(30) NOT NULL,
  `CreatedDateTime` DATETIME NOT NULL,
  `LastModifiedUser` VARCHAR(30) NULL DEFAULT NULL,
  `LastModifiedDateTime` DATETIME NULL DEFAULT NULL,
  `VERSION` DECIMAL(10,0) NULL DEFAULT NULL,
  PRIMARY KEY (`refId`))
  ENGINE = InnoDB
  DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `ipaytest2`.`supplier_log`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ipaytest2`.`supplier_log` (
  `supplierId` INT(11) NOT NULL,
  `supplierName` VARCHAR(20) NULL DEFAULT NULL,
  `supplierContact` DECIMAL(10,0) NULL DEFAULT NULL,
  `supplierCompany` VARCHAR(30) NULL DEFAULT NULL,
  `CreatedUser` VARCHAR(30) NOT NULL,
  `CreatedDateTime` DATETIME NOT NULL,
  `LastModifiedUser` VARCHAR(30) NULL DEFAULT NULL,
  `LastModifiedDateTime` DATETIME NULL DEFAULT NULL,
  `VERSION` DECIMAL(10,0) NULL DEFAULT NULL,
  PRIMARY KEY (`supplierId`))
  ENGINE = InnoDB
  DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `ipaytest2`.`product_pricing`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ipaytest2`.`product_pricing` (
  `refId` INT NOT NULL,
  `pricing_pricingId` INT(11) NOT NULL,
  `product_productId` INT(11) NOT NULL,
  PRIMARY KEY (`refId`),
  INDEX `fk_product_pricing_pricing1_idx` (`pricing_pricingId` ASC),
  INDEX `fk_product_pricing_product1_idx` (`product_productId` ASC),
  CONSTRAINT `fk_product_pricing_pricing1`
  FOREIGN KEY (`pricing_pricingId`)
  REFERENCES `ipaytest2`.`pricing` (`pricingId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_product_pricing_product1`
  FOREIGN KEY (`product_productId`)
  REFERENCES `ipaytest2`.`product` (`productId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
  ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ipaytest2`.`user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ipaytest2`.`user` (
  `userId` INT NOT NULL,
  `userName` VARCHAR(50) NOT NULL,
  `userFname` VARCHAR(45) NOT NULL,
  `userLname` VARCHAR(45) NOT NULL,
  `userContactNumber` DECIMAL(11) NOT NULL,
  `userEmail` VARCHAR(45) NOT NULL,
  `userAddress` VARCHAR(105) NOT NULL,
  `CreatedUser` VARCHAR(30) NOT NULL,
  `CreatedDateTime` DATETIME NOT NULL,
  `LastModifiedUser` VARCHAR(30) NULL DEFAULT NULL,
  `LastModifiedDateTime` DATETIME NULL DEFAULT NULL,
  `VERSION` DECIMAL(10,0) NULL DEFAULT NULL,
  PRIMARY KEY (`userId`))
  ENGINE = InnoDB;



-- -----------------------------------------------------
-- Table `ipaytest2`.`user_log`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ipaytest2`.`user_log` (
  `userId` INT NOT NULL,
  `userName` VARCHAR(50) NOT NULL,
  `userFname` VARCHAR(45) NOT NULL,
  `userLname` VARCHAR(45) NOT NULL,
  `userContactNumber` DECIMAL(11) NOT NULL,
  `userEmail` VARCHAR(45) NOT NULL,
  `userAddress` VARCHAR(105) NOT NULL,
  `CreatedUser` VARCHAR(30) NOT NULL,
  `CreatedDateTime` DATETIME NOT NULL,
  `LastModifiedUser` VARCHAR(30) NULL DEFAULT NULL,
  `LastModifiedDateTime` DATETIME NULL DEFAULT NULL,
  `VERSION` DECIMAL(10,0) NULL DEFAULT NULL,
  PRIMARY KEY (`userId`))
  ENGINE = InnoDB;




-- -----------------------------------------------------
-- Table `ipaytest2`.`role`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ipaytest2`.`role` (
  `roleId` INT NOT NULL,
  `roleName` VARCHAR(45) NULL,
  `CreatedUser` VARCHAR(30) NOT NULL,
  `CreatedDateTime` DATETIME NOT NULL,
  `LastModifiedUser` VARCHAR(30) NULL DEFAULT NULL,
  `LastModifiedDateTime` DATETIME NULL DEFAULT NULL,
  `VERSION` DECIMAL(10,0) NULL DEFAULT NULL,
  PRIMARY KEY (`roleId`))
  ENGINE = InnoDB;



-- -----------------------------------------------------
-- Table `ipaytest2`.`role_log`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ipaytest2`.`role_log` (
  `roleId` INT NOT NULL,
  `roleName` VARCHAR(45) NULL,
  `CreatedUser` VARCHAR(30) NOT NULL,
  `CreatedDateTime` DATETIME NOT NULL,
  `LastModifiedUser` VARCHAR(30) NULL DEFAULT NULL,
  `LastModifiedDateTime` DATETIME NULL DEFAULT NULL,
  `VERSION` DECIMAL(10,0) NULL DEFAULT NULL,
  PRIMARY KEY (`roleId`))
  ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ipaytest2`.`permission`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ipaytest2`.`permission` (
  `permissionId` INT NOT NULL,
  `permissionName` VARCHAR(45) NULL,
  PRIMARY KEY (`permissionId`))
  ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ipaytest2`.`permission_log`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ipaytest2`.`permission_log` (
  `permissionId` INT NOT NULL,
  `permissionName` VARCHAR(45) NULL,
  PRIMARY KEY (`permissionId`))
  ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `ipaytest2`.`user_role`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ipaytest2`.`user_role` (
  `refId` INT NOT NULL,
  `user_userId` INT NOT NULL,
  `role_roleId` INT NOT NULL,
  PRIMARY KEY (`refId`),
  INDEX `fk_user_role_user1_idx` (`user_userId` ASC),
  INDEX `fk_user_role_role1_idx` (`role_roleId` ASC),
  CONSTRAINT `fk_user_role_user1`
  FOREIGN KEY (`user_userId`)
  REFERENCES `ipaytest2`.`user` (`userId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_user_role_role1`
  FOREIGN KEY (`role_roleId`)
  REFERENCES `ipaytest2`.`role` (`roleId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
  ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ipaytest2`.`role_permission`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ipaytest2`.`role_permission` (
  `refId` INT NOT NULL,
  `role_roleId` INT NOT NULL,
  `permission_permissionId` INT NOT NULL,
  PRIMARY KEY (`refId`),
  INDEX `fk_role_permission_role1_idx` (`role_roleId` ASC),
  INDEX `fk_role_permission_permission1_idx` (`permission_permissionId` ASC),
  CONSTRAINT `fk_role_permission_role1`
  FOREIGN KEY (`role_roleId`)
  REFERENCES `ipaytest2`.`role` (`roleId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_role_permission_permission1`
  FOREIGN KEY (`permission_permissionId`)
  REFERENCES `ipaytest2`.`permission` (`permissionId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
  ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ipaytest2`.`invoice`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ipaytest2`.`invoice` (
  `invoiceId` INT NOT NULL,
  `productId` INT NULL,
  `productName` VARCHAR(45) NULL,
  `quantity` DOUBLE NULL,
  `lineTotal` DOUBLE NULL,
  `total` DOUBLE NULL,
  `VERSION` DECIMAL(10,0) NULL,
  PRIMARY KEY (`invoiceId`))
  ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ipaytest2`.`product_invoice`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ipaytest2`.`product_invoice` (
  `refId` INT NOT NULL,
  `product_productId` INT(11) NOT NULL,
  `invoice_invoiceId` INT NOT NULL,
  PRIMARY KEY (`refId`),
  INDEX `fk_product_invoice_product1_idx` (`product_productId` ASC),
  INDEX `fk_product_invoice_invoice1_idx` (`invoice_invoiceId` ASC),
  CONSTRAINT `fk_product_invoice_product1`
  FOREIGN KEY (`product_productId`)
  REFERENCES `ipaytest2`.`product` (`productId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_product_invoice_invoice1`
  FOREIGN KEY (`invoice_invoiceId`)
  REFERENCES `ipaytest2`.`invoice` (`invoiceId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
  ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
