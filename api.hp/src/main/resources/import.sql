--VERY IMPORTANT PUT ALL REGISTERS IN THE CORRECT ORDER

insert into world (id) values (1)
--Houses
insert into house (name) VALUES ('Gryffindor');
insert into house (name) VALUES ('Slitheryn');
insert into house (name) VALUES ('Huffelpuff');
insert into house (name) VALUES ('Ravenclaw');

--Wizards
insert into wizard (name, house, wizards_house) values ('Harry Potter','http://localhost:8080/house/1', 1);
--insert into wizard (name, wizards_house) values ('Ron Wesley', 1);
insert into wizard (name, wizards_house) values ('Draco Malfoy', 2);

--Material
insert into material_magic (pets, wanders, brooms, secrets) values ('http://localhost:8080/pet','http://localhost:8080/wander','http://localhost:8080/broom','http://localhost:8080/secret');


--Pets
insert into pet (name) values ('lechuza');
insert into pet (name) values ('lechuza');
insert into pet (name) values ('lechuza');
insert into pet (name) values ('lechuza');

--Wanders
insert into wander (name) values ('roble')
insert into wander (name) values ('Varita de la muerte')

--Brooms
insert into broom (name) values ('Saeta')
insert into broom (name) values ('Nimbus 4000')

--Secrets
insert into secret(id) values (1)


--Hollows
insert into horocruxes (name, secret_hollows) values ('Espada gryfindor', 1)
insert into horocruxes (name, secret_hollows) values ('Tiara', 1)

--Reliques of death
insert into reliques (name, secret_reliques) values('Capa invisible', 1)
insert into reliques (name, secret_reliques) values('Varita de sauco', 1)
insert into reliques (name, secret_reliques) values('Piedra filosofal', 1)











--insert into wizard_house (house_id, wizard_id) values (1, 1);
--insert into wizard_house (house_id, wizard_id) values (2, 1);

--insert into wizard_house (house_id, wizard_id) values (2, 1);
--insert into wizard_house (house_id, wizard_id) values (1, 2)
--insert into house (name, wizards_house) VALUES ('Gryffindor',2)
--insert into house (name,color, picture, wizards_house) VALUES ('Slytherin', 'green', 'http://....',2)


