use db_rh;

create table tb_funcionarios(
	id bigint(5) auto_increment,
	nome varchar (20) not null,
	idade bigint (2) not null,
	salario decimal (7,2),
	filhos bigint (2),
	primary key (id)

);



