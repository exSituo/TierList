BEGIN TRANSACTION;

DROP TABLE IF EXISTS animes;  
DROP TABLE IF EXISTS users;  
DROP TABLE IF EXISTS tiers;  

CREATE TABLE IF NOT EXISTS "users" (
	"id_user"	INTEGER UNIQUE,
	"user"	TEXT,
	"keyword"	TEXT UNIQUE,
	PRIMARY KEY("id_user")
);
CREATE TABLE IF NOT EXISTS "tiers" (
	"id_tier"	INTEGER UNIQUE,
	"userid"	INTEGER,
	"niveau"	INTEGER,
	"id_anime"	INTEGER,
	PRIMARY KEY("id_tier")
);
CREATE TABLE IF NOT EXISTS "animes" (
	"id_anim"	INTEGER UNIQUE,
	"nom"	TEXT,
	"logo"	TEXT,
	PRIMARY KEY("id_anim")
);
INSERT INTO "tiers" VALUES (1,1,1,1);
INSERT INTO "tiers" VALUES (2,1,1,2);
INSERT INTO "tiers" VALUES (3,1,2,3);
INSERT INTO "animes" VALUES (1,'SNK',NULL);
INSERT INTO "animes" VALUES (2,'FairyTail',NULL);
INSERT INTO "animes" VALUES (3,'Death Node',NULL);
INSERT INTO "animes" VALUES (4,'Sakugan',NULL);
INSERT INTO "animes" VALUES (5,'Naruto',NULL);
INSERT INTO "animes" VALUES (6,'One Piece',NULL);
INSERT INTO "animes" VALUES (7,'Spy X Family',NULL);
INSERT INTO "animes" VALUES (8,'Last Hero Inuyashiki',NULL);
INSERT INTO "animes" VALUES (9,'Made In Abyss',NULL);
COMMIT;

