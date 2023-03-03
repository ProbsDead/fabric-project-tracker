DROP TABLE IF EXISTS yarn CASCADE;
DROP TABLE IF EXISTS needle CASCADE;
DROP TABLE IF EXISTS active_project;

CREATE TABLE yarn(
	yarn_id serial,
	general_color varchar(50) NOT NULL,
	manufacturer_color varchar(50) NULL,
	weight varchar(20) NOT NULL,
	grams int,
	in_use BOOLEAN,
	
	CONSTRAINT PK_yarn PRIMARY KEY (yarn_id)
);

CREATE TABLE needle(
	needle_id serial,
	material varchar(50) NULL,
	size_mm numeric (3,2),
	size_us int NOT NULL,
	is_round boolean,
	in_use boolean,
	knit_or_crochet varchar(20) NOT NULL,
	
	CONSTRAINT PK_needle PRIMARY KEY (needle_id)
);

CREATE TABLE active_project(
	yarn_id int NOT NULL,
	needle_id int,
	pattern_name varchar(100),
	project_name varchar(100) NOT NULL,
	start_date date,
	completed boolean NOT NULL,
	end_date date,
	
	CONSTRAINT FK_active_project_yarn FOREIGN KEY (yarn_id) REFERENCES yarn (yarn_id),
	CONSTRAINT FK_active_project_needle FOREIGN KEY (needle_id) REFERENCES needle (needle_id)
);


