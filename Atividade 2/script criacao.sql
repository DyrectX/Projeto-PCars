CREATE DATABASE PCars;

USE PCars;

CREATE TABLE funcionarios(
id int unsigned auto_increment not null primary key,
nome varchar(45) not null,
cpf varchar(45) not null,
cargo varchar(45) not null,
salario decimal(10,2) not null
);

CREATE TABLE usuarios(
id int unsigned auto_increment not null primary key,
login varchar(80) not null,
senha varchar(50) not null,
funcionario_id int unsigned not null,
foreign key (funcionario_id) references funcionarios(id)
);

CREATE TABLE clientes (
id int unsigned auto_increment not null primary key,
nome varchar(100) not null,
CPF varchar(45) not null,
CNH varchar(45) not null,
endereco varchar(100) not null
);

CREATE TABLE carros(
id int unsigned auto_increment not null primary key,
modelo varchar(45) not null,
placa varchar(10) not null,
marca varchar(45) not null,
valor_venda decimal (10,2) not null
);

CREATE TABLE vendas (
id int unsigned auto_increment not null primary key,
forma_pagamento varchar(45) not null,
valor decimal(10,2) not null,
parcelas int not null default 0,
valor_total decimal(10,2),
data_compra date not null,
carro_id int unsigned not null,
funcionario_id int unsigned not null,
cliente_id int unsigned not null,
FOREIGN KEY (carro_id) references carros(id),
foreign key (funcionario_id) references funcionarios(id),
foreign key (cliente_id) references clientes(id)
);


