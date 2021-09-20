use db_ecommerce;

create table tb_produtos(
	id bigint(5) auto_increment,
	nome varchar (30) not null,
	marca varchar (15) not null,
    lancamento date not null,
	preco decimal (7,2) not null, 
	primary key (id)

);


