# SQL Ödev11
####
* Q1 - actor ve customer tablolarında bulunan first_name sütunları için tüm verileri sıralayalım.
####
* A1 -
 `(
  SELECT first_name FROM actor
  )
  UNION ALL
  (
  SELECT first_name FROM customer
  ); `
####
* Q2 - actor ve customer tablolarında bulunan first_name sütunları için kesişen verileri sıralayalım.
####
* A2 -
 `(
  SELECT first_name FROM actor
  )
  INTERSECT ALL
  (
  SELECT first_name FROM customer
  );`
####
* Q3 - actor ve customer tablolarında bulunan first_name sütunları için ilk tabloda bulunan ancak ikinci tabloda bulunmayan verileri sıralayalım.
####
* A3 -
 `(
  SELECT first_name FROM actor
  )
  EXCEPT ALL
  (
  SELECT first_name FROM customer
  );`
* A4 - 3 sorgu da tekrar edilen veriler için de yapılıyor.


  
