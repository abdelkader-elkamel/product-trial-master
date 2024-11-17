INSERT INTO
    product (code, name, description, image, price, category, quantity, internal_reference, shell_id, inventory_status, rating, created_at)
VALUES
    ('code1', 'product1', 'descriptionProduct1', 'linkImage1', 100.00, 'category1', 11, 'ref1', 1388, 'INSTOCK', 5, NOW()),
    ('code2', 'product2', 'descriptionProduct2', 'linkImage2', 200.00, 'category2', 3, 'ref2', 1223, 'LOWSTOCK', 4, NOW()),
    ('code3', 'product3', 'descriptionProduct3', 'linkImage3', 150.00, 'category1', 0, 'ref3', 1654, 'OUTOFSTOCK', 2, NOW());
