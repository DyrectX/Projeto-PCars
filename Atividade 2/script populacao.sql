USE Pcars;
INSERT INTO funcionarios(id, nome, cpf, cargo, salario)
values  (1, 'Emily Almeida Correia', '381.838.261-13', 'Gerente', 4500.00),
        (2, 'Ryan Pinto Rodrigues', '957.103.195-03', 'Gerente', 4500.00),
        (3, 'Felipe Ribeiro Alves', '659.963.158-40', 'Setor Financeiro', 3500.00),
        (4, 'Luiza Carvalho Correia', '441.678.056-77', 'Vendedor', 3500.00),
        (5, 'Davi Costa Carvalho', '962.595.417-16', 'Vendedor', 3500.00),
        (6, 'Diogo Alves Pereira', '623.371.832-54', 'Limpeza', 2500.00);

INSERT INTO clientes
        (id, nome, CPF, CNH, endereco)
values
        (1, 'Luiz Santos Barbosa', '755.570.248-75', '40612724043', 'Rua Mércia Moreira, 9911, Apto. 590 - São João da Baliza, RO / 49290-339'),
        (2, 'Letícia Ferreira Souza', '617.494.475-17', '85819508353', 'Travessa Valentina Franco, 326, Sala 7 - Brasília, AC / 62891-230'),
        (3, 'Clara Dias Correia', '736.858.312-75', '87787308684', 'Avenida Liz Braga, 7286, Sala 13 - Arari, MS / 26076-603'),
        (4, 'Nicole Cardoso Barros', '458.869.311-55', '12506471520', 'Alameda Bernardo Souza, 5876, Sala A - Vila Boa, AC / 79159-693'),
        (5, 'Lara Barros Gomes', '425.121.082-44', '67167130364', 'Alameda Danilo Xavier, 79, Bloco C, Apto. 71 - São Francisco do Conde, AM / 76662-210'),
        (6, 'Vinícius Lima Martins', '174.517.790-68', '55861407800', 'Avenida Alessandra Melo, 56, Apto. 20 - Tio Hugo, CE / 96805-442'),
        (7, 'Yasmin Costa Castro', '729.008.476-48', '73636240652', 'Marginal Ricardo Macedo, 2, Bloco A, Apto. 34 - Caiçara do Rio do Vento, MT / 85528-244'),
        (8, 'Daniel Alves Araujo', '926.485.825-33', '59486556502', 'Rua Vitor Santos, 81, Apto. 670 - Acarapé, ES / 10520-931'),
        (9, 'Gabrielle Melo Ferreira', '833.120.401-83', '19043669818', 'Rodovia Sirineu Saraiva, 981, Sala B - Ji-Paraná, RR / 84939-425'),
        (10, 'Leonardo Ferreira Goncalves', '262.648.233-17', '47026619587', 'Travessa Pedro Albuquerque, 223, Sala 10 - Pedro Afonso, AC / 21280-422');

INSERT INTO carros
        (id, modelo, placa, marca, valor_venda)
values(1, '2008 Citroen C8', 'MYE-4178', 'Citroen',48000.00),
        (2, '2004 Dodge Ram', 'NEQ-0505','Ram', 32000.00),
        (3, '1995 Land Rover Discovery', 'JLZ-0448','Land Rover',80000.00),
        (4, '2008 Seat Ibiza', 'HRT-6940','Seat',60000.00),
        (5, '2010 Ford Flex', 'JSA-7553','Ford',14000.00),
        (6, '2010 Mini Cooper Clubman', 'BGW-3555','Mini',50000.00),
        (7, '1996 Holden Statesman', 'HRW-5199','Holden',65000.00),
        (8, '2003 Toyota Avalon', 'IWH-4746','Toyota',24000.00),
        (9, '2004 Isuzu VehiCross', 'EGY-8496','Isuzu',77500.00),
        (10, '1998 Audi AL2', 'JNR-5402','Audi',40000.00),
        (11, '2004 Honda Element', 'MUX-7592','Honda',30000.00),
        (12, '2010 Toyota Yaris', 'KFZ-0373','Toyota',17500.00),
        (13, '1995 Chrysler Voyager', 'HOP-5925','Chrysler',80000.00),
        (14, '1999 Land Rover Discovery', 'HPJ-7707','Land Rover',36000.00),
        (15, '2010 Maybach 57', 'AHC-0243','Maybach',24000.00),
        (16, '2000 Audi Steppenwolf', 'MQH-0961','Audi', 60000.00),
        (17, '2001 Suzuki EV Sport', 'IFB-1615','Suzuki',36000.00),
        (18, '2015 Dodge SRT Viper', 'AXR-5588','Dodge',102000.00),
        (19, '2009 Mazda B4000', 'MMS-2313','Mazda',40000.00),
        (20, '2012 Ford Shelby GT500', 'MNZ-2372','Ford',24000.00);

INSERT INTO vendas
        (id, forma_pagamento, valor, parcelas, valor_total, data_compra, carro_id, funcionario_id, cliente_id)
values(1, 'Débito', 60000.00, 0, 60000.00, '2021-07-25', 4, 4 , 4),
        (2, 'débito', 65000.00, 0, 65000.00, '2021-02-03', 7, 4, 5),
        (3, 'crédito', 500.00, 72, 36000.00, '2021-04-02', 17, 5, 6),
        (4, 'débito', 1000.00, 30, 30000.00, '2021-04-09', 11, 4, 9),
        (5, 'crédito', 2000.00, 12, 24000.00, '2022-02-17', 8, 5, 3),
        (6, 'débito', 2100.00, 10, 24000.00, '2021-12-23', 20, 4, 4),
        (7, 'crédito', 3500.00, 5, 17500.00, '2022-03-24', 12, 5, 7),
        (8, 'crédito', 200.00, 72, 14000.00, '2022-04-17', 5, 5, 8),
        (9, 'débito', 1000.00, 40, 40000.00, '2021-12-29', 10, 4, 10),
        (10, 'crédito', 1500.00, 24, 36000.00, '2021-02-15', 14, 5, 10),
        (11, 'débito', 20000.00, 2, 40000.00, '2021-04-18', 19, 5, 5),
        (12, 'crédito', 50000.00, 0, 50000.00, '2022-04-04', 6, 5, 3),
        (13, 'crédito', 6000.00, 17, 102000.00, '2022-04-08', 18, 4, 2),
        (14, 'crédito', 80000.00, 0, 80000.00, '2021-04-20', 3, 5, 8),
        (15, 'débito', 20000.00, 4, 80000.00, '2021-11-08', 13, 5, 8),
        (16, 'crédito', 15500.00, 5, 77500.00, '2021-09-03', 9, 4, 1),
        (17, 'crédito', 4000.00, 6, 24000.00, '2021-10-30', 15, 4, 6),
        (18, 'crédito', 12000.00, 4, 48000.00, '2022-02-21', 1, 4, 3);

INSERT INTO usuarios(id, login, senha, funcionario_id)
values(1, 'Emily', 'Q7QhsYH2sJ', 1),
        (2, 'Ryan', 'yfx8r21fcX', 2),
        (3, 'Luiza', '4FYBn5OiYQ', 4),
        (4, 'Davi', 'H6UfX80C01', 5),
        (5, 'Felipe', 'B1ugj41zuH', 3);



      
      

      
   

