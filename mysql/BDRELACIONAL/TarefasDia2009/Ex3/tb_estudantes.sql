use db_escola;

create table tb_estudantes(
	id bigint (5) not null,
	nome varchar (30) not null,
	serie bigint (1) not null,
	idade bigint (2) not null,
	anodeconclusao bigint (4) not null,
	
    primary key(id)


);