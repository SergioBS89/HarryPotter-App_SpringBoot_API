----VERY IMPORTANT PUT ALL REGISTERS IN THE CORRECT ORDER
----Main Page world
--insert into world (wizards, mortifagos, creatures, material_magic) VALUES ('http://localhost:8080/wizards', 'http://localhost:8080/mortifagos', 'http://localhost:8080/creatures', 'http://localhost:8080/material_magic')
--
----Creatures
--insert into creatures (raze, picture) values ('http://localhost:8080/pet', 'imagen general')
--
--
----Houses
--insert into house (name) VALUES ('Gryffindor');
--insert into house (name) VALUES ('Slitheryn');
--insert into house (name) VALUES ('Huffelpuff');
--insert into house (name) VALUES ('Ravenclaw');
--
----Mortifagos (initializing class)
--insert into mortifagos (leader) VALUES ('Lord Voldemort');
--
----Wizards
--insert into wizard (name, house, wizards_house) values ('Harry Potter','http://localhost:8080/house/1', 1);
--insert into wizard (name, house, wizards_house) values ('Ron Wesley','http://localhost:8080/house/1', 1);
--insert into wizard (name, house, wizards_house) values ('Draco Malfoy','http://localhost:8080/house/2', 2);
--                      ----Wizards mortifagos-----
--insert into wizard (name, house, wizards_house, wizards_mortifagos) values ('Lucius Malfoy','http://localhost:8080/house/2',2, 1);
--insert into wizard (name, house, wizards_house, wizards_mortifagos) values ('Lucius Malfoy','http://localhost:8080/house/2',2, 1);
--
----Material Magic
--insert into material_magic (wanders, brooms, special_objects) values ('http://localhost:8080/wander','http://localhost:8080/broom','http://localhost:8080/special_objects');
--
--
----Pets
--insert into pet (pet_raze,name) values ('Aves rapaces nocturnas', 'Lechuzas');
--insert into pet (pet_raze,name) values ('Aves rapaces nocturnas', 'Buhos');
--
--
----Wanders
--insert into wander (name) values ('roble')
--insert into wander (name) values ('Varita de la muerte')
--
----Brooms
--insert into broom (name) values ('Saeta')
--insert into broom (name) values ('Nimbus 4000')
--
----Special objects
--insert into special_objects(id) values (1)
--
--
----Hollows
--insert into horocruxes (name, secret_hollows) values ('Espada gryfindor', 1)
--insert into horocruxes (name, secret_hollows) values ('Tiara', 1)
--
----Reliques of death
--insert into reliques (name, special_reliques) values('Capa invisible', 1)
--insert into reliques (name, special_reliques) values('Varita de sauco', 1)
--insert into reliques (name, special_reliques) values('Piedra filosofal', 1)
--
--
--
--
--
--









--insert into wizard_house (house_id, wizard_id) values (1, 1);
--insert into wizard_house (house_id, wizard_id) values (2, 1);

--insert into wizard_house (house_id, wizard_id) values (2, 1);
--insert into wizard_house (house_id, wizard_id) values (1, 2)
--insert into house (name, wizards_house) VALUES ('Gryffindor',2)
--insert into house (name,color, picture, wizards_house) VALUES ('Slytherin', 'green', 'http://....',2)


