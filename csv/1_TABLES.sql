create table champs
(
	id int auto_increment,
	constraint champs_pk
		primary key (id),
	name TEXT not null,
	origin_1 TEXT not null,
	origin_2 TEXT null,
	class_1 TEXT not null,
	class_2 TEXT null,
	tier int not null
);

create table origins
(
	id int auto_increment,
	constraint origins_pk
		primary key (id),
	name TEXT not null,
	weight float not null,
	treshold_1 int not null,
	treshold_2 int null,
	treshold_3 int null
);

create table classes
(
	id int auto_increment,
	constraint classes_pk
		primary key (id),
	name TEXT not null,
	weight float not null,
	treshold_1 int not null,
	treshold_2 int null,
	treshold_3 int null
);