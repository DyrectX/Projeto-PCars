USE Pcars;

#item 1, criação de roles para vendedores, gerentes e setor financeiro e seus usuários. Usuários com senha criptografada com criptografia MD5.
create role vendedores;
create user 'vendedor'@'localhost' identified by 'luiza';
create user 'vendedor2'@'localhost' identified by 'davi';
grant insert, select, update on pcars.vendas to vendedores;
grant select, update on pcars.carros to vendedores;
FLUSH PRIVILEGES;

create role gerentes;
create user 'gerente'@'localhost' identified by 'emily';
create user 'gerente2'@'localhost' identified by 'ryan';
grant select, insert, update, delete on pcars.* to gerentes;
FLUSH PRIVILEGES;

create role financeiro;
create user 'financeiro'@'localhost' identified by 'felipe';
grant select on pcars.vendas to financeiro;
grant select on pcars.funcionarios to financeiro;
grant select on pcars.clientes to financeiro;
FLUSH PRIVILEGES;

update usuarios
set senha = md5('criptografia2')
where funcionario_id = 1;
update usuarios
set senha = md5('criptografia3')
where id = 2;
update usuarios
set senha = md5('criptografia4')
where id = 3;
update usuarios
set senha = md5('criptografia6')
where id = 4;
update usuarios
set senha = md5('criptografia45')
where id = 5;

#item 3 criação de trigger para criptografia de senhas de novos usuários (caso sejam inseridos) no banco de dados. Procedure para consultar dados do cliente caso necessário.
DELIMITER //
CREATE TRIGGER senha after insert
on usuarios
for each row
begin
declare senha varchar(100);
set senha = md5('2654676');
end//
DELIMITER ;

DELIMITER //
CREATE PROCEDURE dados_cliente ()
begin
  declare c_cnh varchar(50);
  declare c_nome varchar(200);
  select nome, cnh into c_nome, c_cnh
  from clientes where id = 7;
  select c_nome, c_cnh;
end//
DELIMITER ;

call dados_cliente;

#item 2 Views para consultar vendas e para o setor financeiro.
CREATE VIEW venda as
select valor_total, data_compra, forma_pagamento, cliente_id, parcelas, carro_id
from vendas;

CREATE VIEW financeiro as
select valor_total, data_compra, parcelas, forma_pagamento
from vendas
where valor_total > (select avg(valor_total) from vendas);

#item 4 índices compostos nas tabelas funcionarios e carros.
CREATE INDEX index_funcionarios ON funcionarios (nome, cpf);
CREATE INDEX index_carros ON carros (modelo, marca);


