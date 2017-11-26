CREATE TABLE `tourney` (
	`gameNR`	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE,
	`player1`	INTEGER,
	`player2`	INTEGER,
	`winner`	INTEGER,
	`turnsToWin`	INTEGER
);

CREATE TABLE `LOG` (
	`gameNR`	INTEGER NOT NULL,
	`turn`	INTEGER,
	`player`	INTEGER,
	`position`	INTEGER,
	`inventory`	INTEGER,
	PRIMARY KEY(`gameNR`,`turn`)
);

CREATE TABLE `MAP` (
	`gameNR`	INTEGER NOT NULL,
	`nr`	INTEGER,
	`a`	INTEGER,
	`b`	INTEGER,
	`c`	INTEGER,
	`d`	INTEGER,
	`e`	INTEGER,
	`f`	INTEGER,
	`g`	INTEGER,
	`h`	INTEGER,
	PRIMARY KEY(`gameNR`,`nr`)
);