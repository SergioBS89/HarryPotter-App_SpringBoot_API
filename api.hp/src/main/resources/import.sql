--VERY IMPORTANT PUT ALL REGISTERS IN THE CORRECT ORDER
--Houses
insert into house (name) VALUES ('Gryffindor');
insert into house (name) VALUES ('Slitheryn');
insert into house (name) VALUES ('Huffelpuff');
insert into house (name) VALUES ('Ravenclaw');

--Wizards
insert into wizard (name, wander,house, wizards_house) values ('Harry Potter','http://localhost:8080/material','http://localhost:8080/house/1', 1);
--insert into wizard (name, wizards_house) values ('Ron Wesley', 1);
--insert into wizard (name, wizards_house) values ('Draco Malfoy', 2);

--Material
insert into material_magic (id, use) values (1, 'School');
insert into material_magic (id, use) values (2, 'Magic world');
insert into material_magic (id, use) values (3, 'As unique');

--Pets
insert into pet (name, material_pet) values ('lechuza', 1);

--Wanders
insert into wander (name, material_wander) values ('roble', 1)
insert into wander (name, material_wander) values ('Varita de la muerte',3 )

--Brooms
insert into broom (name, material_broom) values ('Saeta', 1)
insert into broom (name, material_broom) values ('Nimbus 4000', 2)











--insert into wizard_house (house_id, wizard_id) values (1, 1);
--insert into wizard_house (house_id, wizard_id) values (2, 1);

--insert into wizard_house (house_id, wizard_id) values (2, 1);
--insert into wizard_house (house_id, wizard_id) values (1, 2)
--insert into house (name, wizards_house) VALUES ('Gryffindor',2)
--insert into house (name,color, picture, wizards_house) VALUES ('Slytherin', 'green', 'http://....',2)


