CREATE DATABASE test;
CREATE USER 'user'@'%' IDENTIFIED BY  'password';
GRANT ALL PRIVILEGES ON test.* TO 'user'@'%';
FLUSH PRIVILEGES;
