create database ss11;
use ss11;
CREATE TABLE category
(
    id            INT AUTO_INCREMENT PRIMARY KEY,
    category_name VARCHAR(50) NOT NULL UNIQUE,
    status        BIT DEFAULT 1
);
delimiter //
create procedure find_all()
begin
    select * from category;
end;
delimiter //
DELIMITER $$

CREATE PROCEDURE insert_category(IN name VARCHAR(50), IN status BIT)
BEGIN
    INSERT INTO category (category_name, status) VALUES (name, status);
END$$

CREATE PROCEDURE check_category_name(IN name VARCHAR(50))
BEGIN
    SELECT * FROM category WHERE category_name = name;
END$$

DELIMITER ;
