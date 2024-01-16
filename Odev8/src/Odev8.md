# SQL Ödev8
####
* Q1 - test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.
####
* A1 - `CREATE TABLE employee(
  id SERIAL PRIMARY KEY  ,
  name VARCHAR(50) NOT NULL,
  birthday DATE,
  email VARCHAR(100)
  );`
####
* Q2 - Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.
####
* A2 - `insert into employee (name, email, birthday) values ('Ailsun Meehan', 'ameehan0@google.ru', '2021-08-24'); ` * 50 kez farklı bilgiler ekliyoruz.
####
* Q3 - Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.
####
* A3 - `UPDATE employee
  SET name = 'Siegfried'
  WHERE id = 2;`

`UPDATE employee
SET email = 'ojar@slat.com'
WHERE id = 4;`

`UPDATE employee
SET name = 'Marco'
WHERE id = 17;`

`UPDATE employee
SET birthday = '1994-05-18'
WHERE id = 25;`

`UPDATE employee
SET email = 'max@forbes.com'
WHERE id = 32;`
####
* Q4 - Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.
####
* A4 - `DELETE FROM employee
  WHERE name = 'Dasie';`

`DELETE FROM employee
WHERE email = 'bluxt@oracle.com';`

`DELETE FROM employee
WHERE id = 7;`

`DELETE FROM employee
WHERE id = 45;`

`DELETE FROM employee
WHERE birthday = '2021-12-27';`