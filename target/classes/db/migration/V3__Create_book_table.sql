create table BOOK (
    ID int not null AUTO_INCREMENT, 
    TITLE varchar(100) not null,
    AUTHOR varchar(100) not null,
    ID_USER int,
    PRIMARY KEY (ID),
    FOREIGN KEY (ID_USER) REFERENCES USER(ID)
);