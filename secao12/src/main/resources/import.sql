INSERT INTO tb_user (name, email, phone, password) VALUES ('Marcos', 'marcos@gmail.com', '999999', '12134');
INSERT INTO tb_user (name, email, phone, password) VALUES ('Rita', 'rita@gmail.com', '92997880581', '5454');
INSERT INTO tb_user (name, email, phone, password) VALUES ('Enrico', 'enrico@gmail.com', '9922371151', '9789');

INSERT INTO tb_order (moment, order_status, client_id) VALUES (NOW(), 1, 1);
INSERT INTO tb_order (moment, order_status, client_id) VALUES (NOW(), 2, 2);
INSERT INTO tb_order (moment, order_status, client_id) VALUES (NOW(), 3, 3);

INSERT INTO tb_category (name) VALUES ('Books');
INSERT INTO tb_category (name) VALUES ('Computers');