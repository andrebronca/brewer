CREATE TABLE cerveja (
	id bigint(20) primary key auto_increment,
	sku varchar(50) not null,
	nome varchar(80) not null,
	descricao text not null,
	valor decimal(10, 2) not null,
	teor_alcoolico decimal(10, 2) not null,
	comissao decimal(10, 2) not null,
	sabor varchar(50) not null,
	origem varchar(50) not null,
	id_estilo bigint(20) not null,
	foreign key (id_estilo) references estilo(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into estilo (nome) values('Amber Lager');
insert into estilo (nome) values('Dark Lager');
insert into estilo (nome) values('Pale Lager');
insert into estilo (nome) values('Pilsner');