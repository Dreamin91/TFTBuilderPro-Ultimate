INSERT INTO defaultdb.champs (id, name, origin_1, origin_2, class_1, class_2, tier) VALUES (1, 'Aatrox', 'Demon', null, 'Bladedmaster', null, 3);
INSERT INTO defaultdb.champs (id, name, origin_1, origin_2, class_1, class_2, tier) VALUES (2, 'ChoGath', 'Void', null, 'Brawler', null, 4);
INSERT INTO defaultdb.champs (id, name, origin_1, origin_2, class_1, class_2, tier) VALUES (3, 'Evelynn', 'Demon', null, 'Assassin', null, 3);
INSERT INTO defaultdb.champs (id, name, origin_1, origin_2, class_1, class_2, tier) VALUES (4, 'Kassadin', 'Void', null, 'Sorcerer', null, 1);
INSERT INTO defaultdb.champs (id, name, origin_1, origin_2, class_1, class_2, tier) VALUES (5, 'Zed', 'Ninja', null, 'Assassin', null, 2);
INSERT INTO defaultdb.champs (id, name, origin_1, origin_2, class_1, class_2, tier) VALUES (6, 'KhaZix', 'Void', null, 'Assassin', null, 1);
INSERT INTO defaultdb.champs (id, name, origin_1, origin_2, class_1, class_2, tier) VALUES (7, 'Elise', 'Demon', null, 'Shapeshifter', null, 1);
INSERT INTO defaultdb.champs (id, name, origin_1, origin_2, class_1, class_2, tier) VALUES (8, 'Nidalee', 'Wild', null, 'Shapeshifter', null, 1);
INSERT INTO defaultdb.champs (id, name, origin_1, origin_2, class_1, class_2, tier) VALUES (9, 'Gnar', 'Wild', 'Yordle', 'Shapeshifter', null, 4);
INSERT INTO defaultdb.champs (id, name, origin_1, origin_2, class_1, class_2, tier) VALUES (10, 'Shyvana', 'Dragon', null, 'Shapeshifter', null, 3);
INSERT INTO defaultdb.champs (id, name, origin_1, origin_2, class_1, class_2, tier) VALUES (11, 'Swain', 'Imperial', 'Demon', 'Shapeshifter', null, 5);

INSERT INTO defaultdb.origins (id, name, weight, treshold_1, treshold_2, treshold_3) VALUES (1, 'Demon', 5.4, 2, 4, 6);
INSERT INTO defaultdb.origins (id, name, weight, treshold_1, treshold_2, treshold_3) VALUES (2, 'Void', 4.2, 3, null, null);
INSERT INTO defaultdb.origins (id, name, weight, treshold_1, treshold_2, treshold_3) VALUES (3, 'Ninja', 2.2, 1, 4, null);
INSERT INTO defaultdb.origins (id, name, weight, treshold_1, treshold_2, treshold_3) VALUES (4, 'Wild', 2.6, 2, 4, null);
INSERT INTO defaultdb.origins (id, name, weight, treshold_1, treshold_2, treshold_3) VALUES (5, 'Yordle', 4.4, 3, 6, null);
INSERT INTO defaultdb.origins (id, name, weight, treshold_1, treshold_2, treshold_3) VALUES (6, 'Dragon', 5.2, 2, null, null);
INSERT INTO defaultdb.origins (id, name, weight, treshold_1, treshold_2, treshold_3) VALUES (7, 'Imperial', 4.6, 2, 4, null);

INSERT INTO defaultdb.classes (id, name, weight, treshold_1, treshold_2, treshold_3) VALUES (1, 'Blademaster', 2.2, 3, 6, 9);
INSERT INTO defaultdb.classes (id, name, weight, treshold_1, treshold_2, treshold_3) VALUES (2, 'Assassin', 3.4, 3, 6, 9);
INSERT INTO defaultdb.classes (id, name, weight, treshold_1, treshold_2, treshold_3) VALUES (3, 'Brawler', 1, 2, 4, 6);
INSERT INTO defaultdb.classes (id, name, weight, treshold_1, treshold_2, treshold_3) VALUES (4, 'Sorcerer', 2.8, 3, 6, 9);
INSERT INTO defaultdb.classes (id, name, weight, treshold_1, treshold_2, treshold_3) VALUES (5, 'Shapeshifter', 5, 3, 6, null);