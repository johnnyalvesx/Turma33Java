create database db_ecommerce;

create table tb_produtos(
	id bigint(5) auto_increment,
	nome varchar (30) not null,
	marca varchar (15) not null,
    lancamento date not null,
	preco decimal (7,2) not null, 
	primary key (id)

);

insert into tb_produtos(nome, marca, lancamento, preco) values ("Camiseta Naruto", "Lollipop", '2020-08-05', 59.99);
insert into tb_produtos(nome, marca, lancamento, preco) values ("Caneca personalizada", "Abiridin", '2020-04-02', 29.99);
insert into tb_produtos(nome, marca, lancamento, preco) values ("Colar Bleach", "Shonen Jump", '2018-07-22', 24.99);
insert into tb_produtos(nome, marca, lancamento, preco) values ("Cartas Clow - Original", "CLAMP", '2010-01-07', 559.00);
insert into tb_produtos(nome, marca, lancamento, preco) values ("Action figure Madoka Magica", "MQ", '2017-05-14', 700.00);
insert into tb_produtos(nome, marca, lancamento, preco) values ("Caderno Death Note", "Raito", '2009-09-05', 119.99);
insert into tb_produtos(nome, marca, lancamento, preco) values ("Jaqueta Hogwarts", "Big blusas", '2018-01-28', 209.99);
insert into tb_produtos(nome, marca, lancamento, preco) values ("Kit de adesivos - Animes", "StickTok", '2018-10-08', 19.99);

select * from tb_produtos where; 
select * from tb_produtos where preco < 500;
select * from tb_produtos where preco > 500;

update tb_produtos set id = 20
	where id = 5;
update tb_produtos set id = 30
	where id = 6;
update tb_produtos set id = 40
	where id = 7;
update tb_produtos set id = 50
	where id = 8