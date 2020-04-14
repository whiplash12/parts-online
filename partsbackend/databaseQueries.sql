CREATE TABLE category(
category_id INT NOT NULL AUTO_INCREMENT, 
category_name VARCHAR(50),
category_desc VARCHAR(255), 
category_img_url VARCHAR(50), 
category_is_active BOOLEAN,
CONSTRAINT pk_category_id PRIMARY KEY (category_id) 
);

INSERT INTO category (category_name, category_desc, category_img_url, category_is_active) VALUES ('Television', 'This is description for Television', 'cat_1.png', true);
INSERT INTO category (category_name, category_desc, category_img_url, category_is_active) VALUES ('Laptop', 'This is description for Laptop', 'cat_2.png', true);
INSERT INTO category (category_name, category_desc, category_img_url, category_is_active) VALUES ('Mobile', 'This is description for Mobile', 'cat_3.png', true);

CREATE TABLE user_detail(
user_id INT NOT NULL AUTO_INCREMENT, 
user_fName VARCHAR(50),
user_lName VARCHAR(50),
user_role VARCHAR(50), 
enabled BOOLEAN,
user_password VARCHAR(50),
user_email VARCHAR(100),
user_contact_number VARCHAR(15),
CONSTRAINT pk_user_id PRIMARY KEY (user_id) 
);

INSERT INTO user_detail (user_fName, user_lName, user_role, enabled, user_password, user_email, user_contact_number) VALUES ('Hrithik', 'Roshan', 'ADMIN', true, 'hrithik', 'hrithik@gmail.com', '1111111111');
INSERT INTO user_detail (user_fName, user_lName, user_role, enabled, user_password, user_email, user_contact_number) VALUES ('Ranbir', 'Singh', 'SUPPLIER', true, 'ranbir', 'ranbir@gmail.com', '2222222222');
INSERT INTO user_detail (user_fName, user_lName, user_role, enabled, user_password, user_email, user_contact_number) VALUES ('Akshay', 'Kumar', 'SUPPLIER', true, 'akshay', 'akshay@gmail.com', '3333333333');

CREATE TABLE product(
product_id INT NOT NULL AUTO_INCREMENT, 
product_code VARCHAR(20),
product_name VARCHAR(50),
product_brand VARCHAR(50), 
product_description VARCHAR(255),
product_unit_price DECIMAL(10,2),
product_quantity INT,
product_is_active BOOLEAN,
product_category_id INT,
product_supplier_id INT,
product_purchases INT DEFAULT 0,
product_views INT DEFAULT 0,
CONSTRAINT pk_product_id PRIMARY KEY (product_id),
CONSTRAINT fk_product_category_id FOREIGN KEY (product_category_id) REFERENCES category (category_id),
CONSTRAINT fk_product_supplier_id FOREIGN KEY (product_supplier_id) REFERENCES user_detail (user_id)
);

INSERT INTO product (product_code, product_name, product_brand, product_description, product_unit_price, product_quantity, 
product_is_active, product_category_id, product_supplier_id, product_purchases, product_views) VALUES ('ABC123', 'Galaxy', 'Samsung', 
'Best Mobile Phone', 32000, 3, true, 3, 1, 5, 2);
INSERT INTO product (product_code, product_name, product_brand, product_description, product_unit_price, product_quantity, 
product_is_active, product_category_id, product_supplier_id, product_purchases, product_views) VALUES ('TV321', 'LED', 'LG', 
'Best TV', 40000, 3, true, 1, 2, 5, 2);
INSERT INTO product (product_code, product_name, product_brand, product_description, product_unit_price, product_quantity, 
product_is_active, product_category_id, product_supplier_id, product_purchases, product_views) VALUES ('LAP456', 'Vostro', 'Dell', 
'Best Laptop', 49000, 3, true, 2, 3, 5, 2);





