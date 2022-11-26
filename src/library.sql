CREATE TABLE librarian(
librarianId VARCHAR(30) PRIMARY KEY,
Username VARCHAR(30),
Password VARCHAR(30) UNIQUE ,
name VARCHAR(30)
);
select * from librarian;
INSERT INTO librarian VALUES
('L001','Librarian','Password1','Amaan'),
('L002','Librarian','Password2','Ayush'),
('L003','Librarian','Password3','Sanket'),
('L004','Librarian','Password4','Amey');

CREATE TABLE books(
 bookId varchar(50) PRIMARY KEY NOT NULL,
 bname VARCHAR(100) UNIQUE,
 author VARCHAR(50),
 genre VARCHAR(100),
 copies INT
);

INSERT INTO books (bookId,bname,author,genre,copies) VALUES
('A001','Harry Potter and the Philosopher`s Stone ','J.K.Rowling','Fantasy Fiction',10),
('A002','Harry Potter and the Chamber of Secrets','J.K.Rowling','Fantasy Fiction',10),
('A003','Harry Potter and the Prisoner of Azkaban','J.K.Rowling','Fantasy Fiction',10),
('A004','Harry Potter and the Goblet of Fire','J.K.Rowling','Fantasy Fiction',10),
('A005','Harry Potter and the Order of the Phoenix','J.K.Rowling','Fantasy Fiction',10),
('A006','Harry Potter and the Half Blood Prince','J.K.Rowling','Fantasy Fiction',10),
('A007','Harry Potter and the Deathly Hallows','J.K.Rowling','Fantasy Fiction',10),
('A008','Harry Potter and the Cursed Child','J.K.Rowling','Fantasy Fiction',10),
('A009','The Casual Vacancy','J.K.Rowling','Fantasy Fiction, Dark comedy, Tragicomedy',10),
('A010','Fantastic Beasts And Where To Find Them','J.K.Rowling','Fantasy, Adventure',10),
('A011','Fantastic Beasts: The Crimes of Grindelwald','J.K.Rowling','Fantasy, Adventure',10),
('A012','The Tales of Beedle the Bard','J.K.Rowling','Children`s Literature, Fantasy Fiction, Anthology',10),
('A013','The Cuckoo`s Calling','J.K.Rowling',' Novel, Mystery, Crime Fiction',10),
('A014','The Christmas Pig','J.K.Rowling','Children`s literature, Fantasy Fiction, Adventure Fiction',10),
('A015','The Twilight Saga','Stephenie Meyer','Romance novel,Fantasy Fiction,Horror fiction,Vampire literature',10),
('A016','The Twilight Saga: New Moon','Stephenie Meyer','Romance novel,Fantasy Fiction,Horror fiction,Vampire literature',10),
('A017','The Twilight Saga: Eclipse','Stephenie Meyer','Romance novel,Fantasy Fiction,Horror fiction,Vampire literature',10),
('A018','The Twilight Saga: Breaking Dawn','Stephenie Meyer','Romance Novel,Fantasy Fiction,Horror fiction,Vampire literature',10),
('A019','The Host','Stephenie Meyer','Science Fiction, Romance Novel, Thriller, Dystopian',10),
('A020','The Seeker','Stephenie Meyer','Science Fiction, Romance Novel, Thriller, Dystopian',10),
('A021','The Soul','Stephenie Meyer','Science Fiction, Romance Novel, Thriller, Dystopian',10),
('A022','The Hunger Games','Suzanne Collins','Dystopian, ‎Science Fiction‎, ‎Drama‎, ‎Action',10),
('A023','The Hunger Games: Catching Fire','Suzanne Collins','Dystopian, ‎Science Fiction‎, ‎Drama‎, ‎Action',10),
('A024','The Hunger Games: Mockingjay','Suzanne Collins','Dystopian, ‎Science Fiction‎, ‎Drama‎, ‎Action',10),
('A025','Divergent','Veronica Roth','Young Adult Fiction, Science Fiction, Romance Novel, Dystopian',10),
('A026','Insurgent','Veronica Roth','Young Adult Fiction, Science Fiction, Romance Novel, Dystopian',10),
('A027','Allegiant','Veronica Roth','Young Adult Fiction, Science Fiction, Romance Novel, Dystopian',10),
('A028','Four: A Divergent Collection','Veronica Roth','Young Adult Fiction, Science Fiction, Romance Novel, Dystopian',10),
('A029','The Mortal Instruments: City of Bones','Cassandra Clare','Young Adult Fiction, Fantasy Fiction, Urban Fantasy, Adventure',10),
('A030','The Mortal Instruments: City of Ashes','Cassandra Clare','Young Adult Fiction, Fantasy Fiction, Urban Fantasy, Adventure',10),
('A031','The Mortal Instruments: City of Glass','Cassandra Clare','Young Adult Fiction, Fantasy Fiction, Urban Fantasy, Adventure',10),
('A032','The Mortal Instruments: City of Fallen Angels ','Cassandra Clare','Young Adult Fiction, Fantasy Fiction, Urban Fantasy, Adventure',10),
('A033','The Mortal Instruments: City of Lost Souls','Cassandra Clare','Young Adult Fiction, Fantasy Fiction, Urban Fantasy, Adventure',10),
('A034','The Mortal Instruments: City of Heavenly Fire ','Cassandra Clare','Young Adult Fiction, Fantasy Fiction, Urban Fantasy, Adventure',10),
('A035','Pride and Prejudice','Jane Austen','Fiction, Romance Novel, Satire',10),
('A036','To Kill a Mockingbird','Harper Lee','Bildungsroman, Thriller, Southern Gothic, Domestic Fiction',10),
('A037','The Book Thief','Markus Zusak','Young Adult Fiction, Historical Fiction, Bildungsroman',10),
('A038','The Chronicles of Narnia: The Lion, the Witch and the Wardrobe','C.S.Lewis','Fantasy, Children`s Literature',10),
('A039','The Chronicles of Narnia: Prince Caspian','C.S.Lewis','Fantasy, Children`s Literature',10),
('A040','The Chronicles of Narnia: The Voyage of the Dawn Treader','C.S.Lewis','Fantasy, Children`s Literature',10),
('A041','The Chronicles of Narnia: The Silver Chair','C.S.Lewis','Fantasy, Children`s Literature',10),
('A042','TheChronicles of Narnia: The Horse and His Boy','C.S.Lewis','Fantasy, Children`s Literature',10),
('A043','The Chronicles of Narnia: The Magician`s Nephew','C.S.Lewis','Fantasy, Children`s Literature',10),
('A044','The Chronicles of Narnia: The Last Battle','C.S.Lewis','Fantasy, Children`s Literature',10),
('A045','Angels and Demons','Dan Brown','Mystery, Detective Fiction, Conspiracy Fiction, Thriller',10),
('A046','The Da Vinci Code','Dan Brown','Mystery, Detective Fiction, Conspiracy Fiction, Thriller',10),
('A047','The Lost Symbol','Dan Brown','Mystery, Detective Fiction, Conspiracy Fiction, Thriller',10),
('A048','Inferno','Dan Brown','Mystery, Detective Fiction, Conspiracy Fiction, Thriller',10),
('A049','Origin','Dan Brown','Mystery, Detective Fiction, Conspiracy Fiction, Thriller',10),
('A050','Digital Fortress','Dan Brown','Mystery, Detective Fiction, Conspiracy Fiction, Thriller',10),
('A051','Deception Point','Dan Brown','Mystery, Detective Fiction, Conspiracy Fiction, Thriller',10),
('A052','The Infernal Devices: Clockwork Angel','Cassandra Clare','Fantasy, Adventure',10),
('A053','The Infernal Devices: Clockwork Prince','Cassandra Clare','Fantasy, Adventure',10),
('A054','The Infernal Devices: Clockwork Princess','Cassandra Clare','Fantasy, Adventure',10),
('A055','Cosmos','Carl Sagan','Popular Science',20),
('A056','Packing for Mars: The Curious Science of Life in the Void','Mary Roach','Popular Science',20),
('A057','Astrophysics for People in a Hurry','Neil deGrasse Tyson','Non Fiction,Popular Science',20),
('A058','The Edge of Physics','Anil Ananthaswamy','Travel Literature',20),
('A059','A Brief History of Time','Stephen Hawking','Popular Science',20),
('A060','The Grand Design','Stephen Hawking and Leonard Mlodinow','Popular Science',20),
('A061','My Brief History','Stephen Hawking','Biography,Memoir',20),
('A062','The Universe in a Nutshell','Stephen Hawking','Popular Science',20),
('A063','Black Holes and Baby Universes','Stephen Hawking','Popular Science',20),
('A064','A Briefer History of Time','Stephen Hawking','Popular Science',20),
('A065','How to Make a Spaceship','Julian Guthrie','Biography,Popular Science',20),
('A066','The Illustrated A Brief History of Time','Stephen Hawking','Popular Science',20),
('A067','The Theory Of Everything','Stephen Hawking','Science',20),
('A068','Black Holes: The Reith Lectures','Stephen Hawking','Biography',20),
('A069','Brief Answers To The Big Questions','Stephen Hawking','Biography,Autobiography',20),
('A070','Unlocking the Universe','Stephen Hawking,Lucy Hawking','Non fiction,Science',20),
('A071','The Origin Of (ALMOST) Everything','Stephen Hawking','Non fiction,Science',20),
('A072','George`s Secret Key to the Universe (Book 1)','Lucy Hawking, Stephen Hawking, Christophe Galfard','Popular Science',20),
('A073','George`s Cosmic Treasure Hunt (Book 2)','Lucy Hawking, Stephen Hawking, Christophe Galfard','Popular Science',20),
('A074','George and the Big Bang (Book 3)','Lucy Hawking, Stephen Hawking, Christophe Galfard','Popular Science',20),
('A075','George and the Unbreakable Code (Book 4)','Lucy Hawking, Stephen Hawking, Christophe Galfard','Popular Science',20),
('A076','George and the Blue Moon (Book 5)','Lucy Hawking, Stephen Hawking, Christophe Galfard','Popular Science',20),
('A077','Big Bang: The Origin of the Universe','Simon Singh','Non Fiction',20),
('A078','The Planets','Dava Sobel','Non fiction,Science',20),
('A079','The Right Stuff','Tom Wolfe','Biography,New Journalism, ‎Non Fiction',20),
('A080','Turn Left at Orion (1st Edition)','Guy Consolmagno, Dan Davis','Reference Work',20),
('A081','Turn Left at Orion (2st Edition)','Guy Consolmagno, Dan Davis','Reference Work',20),
('A082','Turn Left at Orion (3st Edition)','Guy Consolmagno, Dan Davis','Reference Work',20),
('A083','Turn Left at Orion (4st Edition)','Guy Consolmagno, Dan Davis','Reference Work',20),
('A084','Turn Left at Orion (5st Edition)','Guy Consolmagno, Dan Davis','Reference Work',20),
('A085','Relativity: The Special and the General Theory','Albert Einstein','Science',20),
('A086','The Theory of Relativity','Albert Einstein','Science',20),
('A087','The Meaning of Relativity','Albert Einstein','Science',20),
('A088','The Principle of Relativity','Albert Einstein','Science',20),
('A089','Sidelights on Relativity','Albert Einstein','Science',20),
('A090','The World As I See It','Albert Einstein','Science',20),
('A091','Finding the Mother Tree','Suzanne Simard','Biography,Autobiography',20),
('A092','Rationality','Steven Pinker','Self Help Book',10),
('A093','The Sirens of Mars','Sarah Stewart Johnson','Autobiography',10),
('A094','Helgoland','Carlo Rovelli','Non Fiction',10),
('A095','The God Equation','Michio Kaku','Popular Science',10),
('A096','The Uninhabitable Earth','David Wallace-Wells','Non Fiction',10),
('A097','Losing Eden','Lucy Jones','Self Help Book,Natural Writing',10),
('A098','Immune: A Journey Into The Mysterious System That Keeps You Alive','Philipp Dettmer','Educational',10),
('A099','Spineless','Juli Berwald','Autobiography',10),
('A100','Breath: The New Science of a Lost Art','James Nestor','Self Help Book,Creative Non Fiction',10),
('A101','A Short History of Nearly Everything','Bill Bryson','Non Fiction,Popular Science',10);

ALTER TABLE books ADD Publisher VARCHAR(50);
UPDATE books
SET Publisher ='Pearson'
WHERE bookId='A001' OR  bookId='A002' OR bookId='A003' OR bookId='A004' OR bookId='A005' OR bookId='A006' OR bookId='A007' OR bookId='A008' OR bookId='A009' OR bookId='A010' ;
UPDATE books
SET Publisher ='RELX Group'
WHERE bookId='A011' OR  bookId='A012' OR bookId='A013' OR bookId='A014' OR bookId='A015' OR bookId='A016' OR bookId='A017' OR bookId='A018' OR bookId='A019' OR bookId='A020' ;
UPDATE books
SET Publisher ='Bertelsmann'
WHERE bookId='A021' OR  bookId='A022' OR bookId='A023' OR bookId='A024' OR bookId='A025' OR bookId='A026' OR bookId='A027' OR bookId='A028' OR bookId='A029' OR bookId='A030' ;
UPDATE books
SET Publisher ='Scholastic'
WHERE bookId='A031' OR  bookId='A032' OR bookId='A033' OR bookId='A034' OR bookId='A035' OR bookId='A036' OR bookId='A037' OR bookId='A038' OR bookId='A039' OR bookId='A040' ;
UPDATE books
SET Publisher ='Wiley'
WHERE bookId='A041' OR  bookId='A042' OR bookId='A043' OR bookId='A044' OR bookId='A045' OR bookId='A046' OR bookId='A047' OR bookId='A048' OR bookId='A049' OR bookId='A050' ;
UPDATE books
SET Publisher ='Harper Collins'
WHERE bookId='A051' OR  bookId='A052' OR bookId='A053' OR bookId='A054' OR bookId='A055' OR bookId='A056' OR bookId='A057' OR bookId='A058' OR bookId='A059' OR bookId='A060' ;
UPDATE books
SET Publisher ='Informa'
WHERE bookId='A061' OR  bookId='A062' OR bookId='A063' OR bookId='A064' OR bookId='A065' OR bookId='A066' OR bookId='A067' OR bookId='A068' OR bookId='A069' OR bookId='A070' ;
UPDATE books
SET Publisher ='Simon & Schuster'
WHERE bookId='A071' OR  bookId='A072' OR bookId='A073' OR bookId='A074' OR bookId='A075' OR bookId='A076' OR bookId='A077' OR bookId='A078' OR bookId='A079' OR bookId='A080' ;
UPDATE books
SET Publisher ='WEKA'
WHERE bookId='A081' OR  bookId='A082' OR bookId='A083' OR bookId='A084' OR bookId='A085' OR bookId='A086' OR bookId='A087' OR bookId='A088' OR bookId='A089' OR bookId='A090' ;
UPDATE books
SET Publisher ='C.H.Beck'
WHERE bookId='A091' OR  bookId='A092' OR bookId='A093' OR bookId='A094' OR bookId='A095' OR bookId='A096' OR bookId='A097' OR bookId='A098' OR bookId='A099' OR bookId='A100' OR bookId='A101' ;

ALTER TABLE books DROP COLUMN copies;
ALTER TABLE books ADD copies INT;
UPDATE books 
SET copies=10;
SELECT * FROM books;

CREATE TABLE SignUp(
Email VARCHAR(50) PRIMARY KEY,
Name VARCHAR(20),
Create_Pass VARCHAR(30) UNIQUE NOT NULL,
Role VARCHAR(30),
RollNo_FalNo VARCHAR(30) UNIQUE NOT NULL,
City VARCHAR(10)
) ;
INSERT INTO SignUp VALUES
('ayushrajpurohit@gmail.com','Ayush','Password@1','Student','21101B0005','City1'),
('ameydhoke@gmail.com','Amey','Password@2','Student','21101B0023','City2'),
('amaandhamasker@gmail.com','Amaan','Password@3','Student','21101B0003','City3'),
('mailf1@mail.com','Faculty1','FPassword@1','Faculty','21101F0001','CityA'),
('mailu1@mail.com','User1','UPassword@1','Student','21101U0001','CityB');
SELECT * FROM SignUp;

create table Bookisbn (
	ISBN int 
);
insert into Bookisbn values(1),(2),(3),(4),(5),(6),(7),(8),(9),(10);
create table Books1 as select * from books,Bookisbn ;
alter table books1 ADD PRIMARY KEY(bookId,ISBN);
select * from books1 order by bookId;
select * from Books1;

create table User_book(
	username varchar(30),
    book_id varchar(10),
    ISBN int,
    issue_date date,
    return_date date ,
    fine int default(0),
    primary key(username,book_id,ISBN)
);
insert into User_book(username,book_id,ISBN,issue_date,return_date) values
('sanketdalvi25@gmail.com','A001',1,(select curdate()),(select adddate(curdate(),interval 30 day))),
('ayushrajpro@gmail.com','A071',1,(select curdate()),(select adddate(curdate(),interval 30 day))),
('mail1@mail.com','A051',1,(select curdate()),(select adddate(curdate(),interval 30 day))),
('sanketdalvi25@gmail.com','A101',1,(select curdate()),(select adddate(curdate(),interval 30 day)));
select * from User_book;
/*
UPDATE User_book 
SET return_date=(select adddate(issue_date,interval 30 day))
WHERE username='amaandhamasker@gmail.com' and book_id='A007';
UPDATE User_book 
SET issue_date=(select subdate(curdate(),interval 60 day))
WHERE username='amaandhamasker@gmail.com' and book_id='A007';
update User_book set fine=0; 
*/

create table book_request(
	username varchar(30),
    book_id varchar(10),
    status varchar(50)
);
insert into book_request values('sanketdalvi25@gmail.com','A099','Pending');
insert into book_request values('ayushrajpro@gmail.com','A064','Pending');
insert into book_request values('mail1@mail.com','A076','Pending');
select * from book_request;

CREATE TABLE User_book_request AS SELECT username,bookId, bname from book_request,books where bookId=book_id;
Select * from User_book_request;
drop table User_book_request;

-- select datediff((select return_date from User_book where ISBN=1 and book_id='A012'),(select curdate())) as days;
-- select book_id,bname,ISBN,issue_date,return_date from User_book,books where book_id=bookId and username='ayushrajpro@gmail.com';