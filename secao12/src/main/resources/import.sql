INSERT INTO tb_user (name, email, phone, password) VALUES ('Marcos', 'marcos@gmail.com', '999999', '12134');
INSERT INTO tb_user (name, email, phone, password) VALUES ('Rita', 'rita@gmail.com', '92997880581', '5454');
INSERT INTO tb_user (name, email, phone, password) VALUES ('Enrico', 'enrico@gmail.com', '9922371151', '9789');

INSERT INTO tb_order (moment, order_status, client_id) VALUES (NOW(), 1, 1);
INSERT INTO tb_order (moment, order_status, client_id) VALUES (NOW(), 2, 2);
INSERT INTO tb_order (moment, order_status, client_id) VALUES (NOW(), 3, 3);

INSERT INTO tb_category (name) VALUES ('Books');
INSERT INTO tb_category (name) VALUES ('Computers');

INSERT INTO tb_product (name, description, price, img) VALUES ('The Lord of the Rings', 'Lorem ipsum dolor sit amet, consectetur.', 90.5, '');
INSERT INTO tb_product (name, description, price, img) VALUES ('Smart TV', 'Nulla eu imperdiet purus. Maecenas ante.', 2190.0, '');

INSERT INTO tb_product_category (product_id, category_id) VALUES (1, 2);