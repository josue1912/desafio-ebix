create table endereco (
  id bigint not null auto_increment,
  cep varchar(100) not null,
  primary key(id)
) engine=InnoDB;

insert into endereco (id, cep) values (1, '20270021');
insert into endereco (id, cep) values (2, '23026220');
insert into endereco (id, cep) values (3, '23085570');
insert into endereco (id, cep) values (4, '20010020');
