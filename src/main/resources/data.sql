
INSERT INTO user_obk (user_name, password) VALUES ('test', 'test');
INSERT INTO user_obk (user_name, password) VALUES ('alice_wonder', 'alice_pass');
INSERT INTO user_obk (user_name, password) VALUES ('bob_builder', 'buildit2022');
INSERT INTO user_obk (user_name, password) VALUES ('eve_black', 'eve_2023');
INSERT INTO user_obk (user_name, password) VALUES ('frank_castle', 'punisher_pass');

INSERT INTO office (office_name, location, description, image) VALUES ('Headquarters', 'Stockholm', 'Main corporate office in Stockholm', 'https://plus.unsplash.com/premium_photo-1661931749081-23d69ddb62d1?q=80&w=1883&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D');
INSERT INTO office (office_name, location, description, image) VALUES ('Branch Gothenburg', 'Gothenburg', 'Regional office in Gothenburg', 'https://images.unsplash.com/photo-1505409859467-3a796fd5798e?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D');
INSERT INTO office (office_name, location, description, image) VALUES ('Branch Malmo', 'Malmo', 'Regional office in Malmo', 'https://images.unsplash.com/photo-1497366412874-3415097a27e7?q=80&w=2069&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D');
INSERT INTO office (office_name, location, description, image) VALUES ('Branch Uppsala', 'Uppsala', 'Satellite office in Uppsala', 'https://images.unsplash.com/photo-1655746340587-9d1aaad92b6d?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D');
INSERT INTO office (office_name, location, description, image) VALUES ('Branch Vasteras', 'Vasteras', 'Branch office in Vasteras', 'https://images.unsplash.com/photo-1685955011833-a12941e9e960?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D');
INSERT INTO office (office_name, location, description, image) VALUES ('Branch Orebro', 'Orebro', 'Office located in Orebro', 'https://plus.unsplash.com/premium_photo-1661931749081-23d69ddb62d1?q=80&w=1883&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D');
INSERT INTO office (office_name, location, description, image) VALUES ('Branch Linkoping', 'Linkoping', 'Office located in Linkoping', 'https://images.unsplash.com/photo-1578991624414-276ef23a534f?q=80&w=1927&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D');
INSERT INTO office (office_name, location, description, image) VALUES ('Branch Helsingborg', 'Helsingborg', 'Office located in Helsingborg', 'https://images.unsplash.com/photo-1531973576160-7125cd663d86?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D');
INSERT INTO office (office_name, location, description, image) VALUES ('Branch Jonkoping', 'Jonkoping', 'Office located in Jonkoping', 'https://images.unsplash.com/photo-1497366811353-6870744d04b2?q=80&w=2069&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D');
INSERT INTO office (office_name, location, description, image) VALUES ('Branch Norrkoping', 'Norrkoping', 'Office located in Norrkoping', 'https://images.unsplash.com/photo-1497366754035-f200968a6e72?q=80&w=2069&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D');

INSERT INTO booking (start_date, end_date, user_id, office_id) VALUES ('2024-01-01T09:00:00', '2024-01-01T17:00:00', 1, 1);
INSERT INTO booking (start_date, end_date, user_id, office_id) VALUES ('2024-01-02T09:00:00', '2024-01-02T17:00:00', 2, 2);
INSERT INTO booking (start_date, end_date, user_id, office_id) VALUES ('2024-01-03T09:00:00', '2024-01-03T17:00:00', 3, 3);
INSERT INTO booking (start_date, end_date, user_id, office_id) VALUES ('2024-01-04T09:00:00', '2024-01-04T17:00:00', 4, 4);
INSERT INTO booking (start_date, end_date, user_id, office_id) VALUES ('2024-01-05T09:00:00', '2024-01-05T17:00:00', 1, 5);
INSERT INTO booking (start_date, end_date, user_id, office_id) VALUES ('2024-01-06T09:00:00', '2024-01-06T17:00:00', 2, 6);
INSERT INTO booking (start_date, end_date, user_id, office_id) VALUES ('2024-01-07T09:00:00', '2024-01-07T17:00:00', 3, 7);
INSERT INTO booking (start_date, end_date, user_id, office_id) VALUES ('2024-01-08T09:00:00', '2024-01-08T17:00:00', 4, 8);
INSERT INTO booking (start_date, end_date, user_id, office_id) VALUES ('2024-01-09T09:00:00', '2024-01-09T17:00:00', 1, 9);
INSERT INTO booking (start_date, end_date, user_id, office_id) VALUES ('2024-10-10T09:00:00', '2024-11-10T18:00:00', 1, 10);

