CREATE DATABASE fitness; -- tworzenie bazy danych

USE fitness;
DROP TABLE klubowicz;
DROP TABLE klient;
DROP TABLE magazyn;
DROP TABLE zamowienie;
DROP TABLE rejestracja;
DROP TABLE dostawca;
SHOW TABLES;

-- tworzenie tabeli klubowicz
CREATE TABLE klubowicz
(
	id INT AUTO_INCREMENT PRIMARY KEY,
    imie VARCHAR(20) NOT NULL,
    nazwisko VARCHAR(50) NOT NULL,
    email VARCHAR(255) NOT NULL,
    adres_ulica VARCHAR(255) NOT NULL,
    adres_miasto VARCHAR(255) NOT NULL,
    adres_kod VARCHAR(6) NOT NULL,
    telefon INT(9) NOT NULL
);
-- wczytywanie klubowiczów z plików w folderze
LOAD DATA INFILE
'C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\fake.csv' 
INTO TABLE klubowicz
CHARACTER SET utf8
FIELDS TERMINATED BY ';'
LINES TERMINATED BY '\r\n'
(imie, nazwisko, email, adres_ulica, adres_miasto, adres_kod, telefon);

-- tworzenie tabeli klient
CREATE TABLE klient
(
	id INT AUTO_INCREMENT PRIMARY KEY,
    imie VARCHAR(20) NOT NULL,
    nazwisko VARCHAR(50) NOT NULL,
    email VARCHAR(255) NOT NULL,
    adres_ulica VARCHAR(255) NOT NULL,
    adres_miasto VARCHAR(255) NOT NULL,
    adres_kod VARCHAR(6) NOT NULL,
    telefon INT(9) NOT NULL
);
-- wczytywanie klientów do tabeli z pliku
LOAD DATA INFILE
'C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\fake2.csv'
INTO TABLE klient
CHARACTER SET utf8
FIELDS TERMINATED BY ';'
LINES TERMINATED BY '\r\n'
(imie, nazwisko, email, adres_ulica, adres_miasto, adres_kod, telefon);

-- tworzenie tabeli magazyn
CREATE TABLE magazyn
(	
	id_zam INT PRIMARY KEY,
    produkt VARCHAR(50) NOT NULL,
    rodzaj VARCHAR(50) NOT NULL,
    cena DECIMAL(4,2) NOT NULL,
    stan INT NOT NULL
);

-- ręczne uzupełnianie magazynu wartościami
INSERT INTO magazyn VALUES(1, 'OP Gladiator', 'Odżywka', 50, 10);
INSERT INTO magazyn VALUES(2, 'Potega i Chwała', 'Odżywka', 60, 15);
INSERT INTO magazyn VALUES(3, 'ChudFast', 'Suplement', 30, 20);
INSERT INTO magazyn VALUES(4, 'Woda x6', 'Napoje', 10, 30);
INSERT INTO magazyn VALUES(5, 'Karnet fitness', 'Karnety', 10, 100);

-- tworzenie tabeli dostawca
CREATE TABLE dostawca
(
	id INT PRIMARY KEY,
    nazwa VARCHAR(50) NOT NULL,
    miejscowosc VARCHAR(255) NOT NULL,
    kod VARCHAR (10) NOT NULL,
    telefon INT(9) NOT NULL
);

-- ręczne wprowadzanie wartości do tabeli
INSERT INTO dostawca VALUES (1, 'Kolimp', 'Poznań', '45-300', 0849324);
INSERT INTO dostawca VALUES (2, 'Suply', 'Częstochowa', '42-200', 3232341);
INSERT INTO dostawca VALUES (3, 'Chudeks', 'Berlin', '50-500', 437434710);
INSERT INTO dostawca VALUES (4, 'Napójks', 'Pacanowo', '79-900', 23141253);
INSERT INTO dostawca VALUES (5, 'Karnetix', 'Egipt', '92-213', 3435356);

-- tworzenie tabeli rejestracja
CREATE TABLE rejestracja
(
	id_klubowicz INT,
    id_klient INT,
    id_dostawca INT,
    id_zam INT,
	FOREIGN KEY (id_klubowicz) REFERENCES klubowicz(id),
    FOREIGN KEY (id_klient) REFERENCES klient(id),
    FOREIGN KEY (id_zam) REFERENCES magazyn(id_zam),
    FOREIGN KEY (id_dostawca) REFERENCES dostawca(id) 
);

-- ręczne wprowadzanie wartości do tabeli
INSERT INTO rejestracja VALUES(1,1,1,1);
INSERT INTO rejestracja VALUES(2,2,2,2);
INSERT INTO rejestracja VALUES(3,3,3,3);
INSERT INTO rejestracja VALUES(4,4,4,4);
INSERT INTO rejestracja VALUES(5,5,5,5);

-- tworzenie tabeli łączonej zamowienie
CREATE TABLE zamowienie
( 
	id_zam INT PRIMARY KEY NOT NULL,
    zrealizowane INT NOT NULL,
    FOREIGN KEY (id_zam) REFERENCES magazyn(id_zam)
);

-- wprowadzanie wartości poprzez zapytanie Insert
INSERT INTO zamowienie VALUES(1,0);
INSERT INTO zamowienie VALUES(2,1);
INSERT INTO zamowienie VALUES(3,1);
INSERT INTO zamowienie VALUES(4,0);
INSERT INTO zamowienie VALUES(5,1);


-- dodanie użytkownika i nadanie mu uprawnień
CREATE USER 'adrian_naz'@'localhost' IDENTIFIED BY 'wiedzmin';

GRANT INSERT, DELETE, SELECT, UPDATE ON fitness.klubowicz TO 'adrian_naz'@'localhost';
GRANT INSERT, SELECT, UPDATE ON fitness.klient TO 'adrian_naz'@'localhost';
GRANT SELECT ON fitness.magazyn TO 'adrian_naz'@'localhost';
GRANT SELECT, UPDATE ON fitness.zamowienie TO 'adrian_naz'@'localhost';
GRANT SELECT ON fitness.dostawca TO 'adrian_naz'@'localhost';

SELECT * FROM klubowicz; -- sprawdzanie stanu klubowiczów uczęszczających stale do siłowni
INSERT INTO klubowicz VALUES(6, 'Mystery', 'Method', 'artysta@en.com', 'MiamiBeach', 'LosAngeles', '69-700', '690700111'); -- dodawanie przykładowego klubowicza
DELETE FROM klubowicz WHERE id = 6; -- usunięcie przykładowego klubowicza
UPDATE klubowicz SET telefon = '770333444' WHERE id = 6; -- aktualizowanie danych klubowicza
SELECT * FROM klient; -- sprawdzanie stanu klubowiczów uczęszczających stale do siłowni
INSERT INTO klient VALUES(6, 'Mystery', 'Method', 'artysta@en.com', 'MiamiBeach', 'LosAngeles', '69-700', '690700111'); -- dodawanie klienta
UPDATE klient SET imie = 'Erik' WHERE id = 6; -- aktualizowanie danych klienta
SELECT * FROM magazyn; -- sprawdzanie stanu magazynu

	
