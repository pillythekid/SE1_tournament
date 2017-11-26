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
	FOREIGN KEY (`gameNR`) REFERENCES `tourney` (`gameNR`),
	PRIMARY KEY(`gameNR`,`turn`)
);

CREATE TABLE `MAP` (
	`gameNR`	INTEGER NOT NULL,
	`nr`	INTEGER,
	`A`	INTEGER,
	`B`	INTEGER,
	`C`	INTEGER,
	`D`	INTEGER,
	`E`	INTEGER,
	`F`	INTEGER,
	`G`	INTEGER,
	`H`	INTEGER,
	FOREIGN KEY (`gameNR`) REFERENCES `tourney` (`gameNR`),
	PRIMARY KEY(`gameNR`,`nr`)
);