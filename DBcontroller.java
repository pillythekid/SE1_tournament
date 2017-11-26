import java.util.ArrayList;
import java.sql.*;
import oracle.jdbc.driver.*;

public class DBcontroller implements DBcontroller_IF {
	int TourneyNR;
//CONSTRUCTOR START
	DBcontroller (int _TourneyNR){
        TourneyNR = _TourneyNR;
        //We want to create a new entry into the Database
        try {
        	    String userName = "root";
	            String password = "root";
	            String url1="jdbc:mysql://78.104.7.159.:3306/tournament";
	            Class.forName ("com.mysql.jdbc.Driver").newInstance ();
	            conn1=DriverManager.getConnection (url1, userName, password);
	            try {
	        	 	Statement statement = connection.createStatement();
	        		query = "select gameNR from tourney where gameNR = " + TourneyNR;
	        		ResultSet result = statement.executeQuery(query);
	        		int _id = result.getInt("gameNR");
                } catch(Exception e) {
        			int _id = 0;
                }
	        if (_id == TourneyNR) {
	        		System.out.println("Game successfully logged.");
	            }
	        else {
        			String insertSql = "INSERT INTO `tourney` (`gameNR`, `clientA`, `clientB`, `winner`, `turnsToWin`) VALUES (`"+TourneyNR+"`, ``, ``, NULL, NULL)";
	            }
        } catch (Exception e) {
        		System.err.println("Fehler beim Einfuegen des Datensatzes: " + e.getMessage());
        }
    }
//CONSTRUCTOR END
//REGISTER START
    public bool registerPlayer(String _ip1, String _ip2){
        String updateSql =
                "UPDATE tourney"
                        +"SET `clientA` = `"_ip1"`, `clientB` = `"_ip2" WHERE `gameNR` == `"+TourneyNR+"`";
        try (Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(updateSql);
        } catch(Exception e) {
            System.err.println(e.getMessage());
            return 0;
        }
        return 1;
        //we have now LOGGED the new posit
    }
//REGISTER END
//FEED METHODS
    //THESE ARE TO BE USED TO FEED DATA INTO THE DB
	//MAP (only used at the beginning of the game) : INSERT ONLY
	//LOG (used once every legal turn) : INSERT ONLY
	//POS (used within LOG, updates the map after confirmation) : UPDATE ONLY
//MAP START : INSERT ONLY
	public void feedMAP(List _A, List _B, List _C, List _D, int _x, int _y, int _player){
		//map is already checked for rules in management and thus will feed the map now into the DBcontroller
		//here we break the Lists up and feed the fields one by one into the MAP table
		if (_player == 1) {
			try {
				String insertSql1 = "INSERT INTO `MAP` (`gameNR`, `nr`, `A`, `B`, `C`, `D`, `E`, `F`, `G`, `H`) "
						+ "VALUES (`"+TourneyNR+"`, `"+1+"`, `"+_A[0]+"`, `"+_A[1]+"`, `"+_A[2]+"`, `"+_A[3]+"`, `"+_A[4]+"`, `"+_A[5]+"`, `"+_A[6]+"`, `"+_A[7]+"`)";
				String insertSql2 = "INSERT INTO `MAP` (`gameNR`, `nr`, `A`, `B`, `C`, `D`, `E`, `F`, `G`, `H`) "
						+ "VALUES (`"+TourneyNR+"`, `"+2+"`, `"+_B[0]+"`, `"+_B[1]+"`, `"+_B[2]+"`, `"+_B[3]+"`, `"+_B[4]+"`, `"+_B[5]+"`, `"+_B[6]+"`, `"+_B[7]+"`)";
				String insertSql3 = "INSERT INTO `MAP` (`gameNR`, `nr`, `A`, `B`, `C`, `D`, `E`, `F`, `G`, `H`) "
						+ "VALUES (`"+TourneyNR+"`, `"+3+"`, `"+_C[0]+"`, `"+_C[1]+"`, `"+_C[2]+"`, `"+_C[3]+"`, `"+_C[4]+"`, `"+_C[5]+"`, `"+_C[6]+"`, `"+_C[7]+"`)";
				String insertSql4 = "INSERT INTO `MAP` (`gameNR`, `nr`, `A`, `B`, `C`, `D`, `E`, `F`, `G`, `H`) "
						+ "VALUES (`"+TourneyNR+"`, `"+4+"`, `"+_D[0]+"`, `"+_D[1]+"`, `"+_D[2]+"`, `"+_D[3]+"`, `"+_D[4]+"`, `"+_D[5]+"`, `"+_D[6]+"`, `"+_D[7]+"`)";			
			} catch(Exception e) {
				System.err.println("Es wurden zu wenige Felder eingetragen." + e.getMessage());
			}
			try (Statement stmt = conn.createStatement()) {
				    stmt.executeUpdate(insertSql1);
				    stmt.executeUpdate(insertSql2);
				    stmt.executeUpdate(insertSql3);
				    stmt.executeUpdate(insertSql4);
			}
		} else if (_player == 2) {
			try {
				String insertSql5 = "INSERT INTO `MAP` (`gameNR`, `nr`, `A`, `B`, `C`, `D`, `E`, `F`, `G`, `H`) "
						+ "VALUES (`"+TourneyNR+"`, `"+5+"`, `"+_A[0]+"`, `"+_A[1]+"`, `"+_A[2]+"`, `"+_A[3]+"`, `"+_A[4]+"`, `"+_A[5]+"`, `"+_A[6]+"`, `"+_A[7]+"`)";
				String insertSql6 = "INSERT INTO `MAP` (`gameNR`, `nr`, `A`, `B`, `C`, `D`, `E`, `F`, `G`, `H`) "
						+ "VALUES (`"+TourneyNR+"`, `"+6+"`, `"+_B[0]+"`, `"+_B[1]+"`, `"+_B[2]+"`, `"+_B[3]+"`, `"+_B[4]+"`, `"+_B[5]+"`, `"+_B[6]+"`, `"+_B[7]+"`)";
				String insertSql7 = "INSERT INTO `MAP` (`gameNR`, `nr`, `A`, `B`, `C`, `D`, `E`, `F`, `G`, `H`) "
						+ "VALUES (`"+TourneyNR+"`, `"+7+"`, `"+_C[0]+"`, `"+_C[1]+"`, `"+_C[2]+"`, `"+_C[3]+"`, `"+_C[4]+"`, `"+_C[5]+"`, `"+_C[6]+"`, `"+_C[7]+"`)";
				String insertSql8 = "INSERT INTO `MAP` (`gameNR`, `nr`, `A`, `B`, `C`, `D`, `E`, `F`, `G`, `H`) "
						+ "VALUES (`"+TourneyNR+"`, `"+8+"`, `"+_D[0]+"`, `"+_D[1]+"`, `"+_D[2]+"`, `"+_D[3]+"`, `"+_D[4]+"`, `"+_D[5]+"`, `"+_D[6]+"`, `"+_D[7]+"`)";			
			} catch(Exception e) {
				System.err.println("Es wurden zu wenige Felder eingetragen." + e.getMessage());
			}
			try (Statement stmt = conn.createStatement()) {
					stmt.executeUpdate(insertSql5);
					stmt.executeUpdate(insertSql6);
					stmt.executeUpdate(insertSql7);
					stmt.executeUpdate(insertSql8);
			} catch(Exception e) {
                System.err.println(e.getMessage());
            }
		} else {
			System.out.println("Spieler nicht erkannt.");
		}
	}
//MAP END : ALL CORRECT : TODO - ERROR HANDLING
//LOG START : INSERT ONLY
	public void feedLOG(int _x, int _y, int _turn){
		//pos is already checked for rules in management and thus will feed the map now into the DBcontroller
		//_x translates into A to H
		//_y translates into 1 to 8
		Char point;
		 switch (_x) {
		 case 1:point="A";
             break;
		 case 2:point="B";
             break;
		 case 3:point="C";
             break;
		 case 4:point="D";
             break;
		 case 5:point="E";
             break;
		 case 6:point="F";
             break;
		 case 7:point="G";
             break;
		 case 8:point="H";
             break;
		 }
		 //we now find out if we already have the treasure:
        //this shall be done by getting the newest of our LOG entries.
        int _inventory =0;
        String getSql = "SELECT `inventory` FROM `LOG` WHERE `gameNR` == `"+TourneyNR+"` AND `player` == `"+(_turn%2)&2==0?2:1+"` AND `turn` = (SELECT MAX(`turn`) FROM `LOG` WHERE `gameNR` == `"+TourneyNR+"` AND `player` == `"+(_turn%2)&2==0?2:1+"`)";
        try (Statement stmt = conn.createStatement()) {
            _inventory = stmt.executeUpdate(getsql);
        }catch(Exception e) {
            System.err.println(e.getMessage());
        }

        int i = _inventory != 0 ? _inventory = getpos(_x, _y) == 1 ? 1 : 0 : 0;
        String insertSql =
				"INSERT INTO `LOG` (`gameNR`, `turn`, `player`, `position`, `inventory`) "
				+ "VALUES (`"+TourneyNR+"`, `"+_turn+"`, `"+(_turn%2)&2==0?2:1+"`, `"point+_y"`, `"_inventory"`)";
        try (Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(insertSql);
        }catch(Exception e) {
            System.err.println(e.getMessage());
        }
		//we have now LOGGED the new position of the player
        //we also now know whether we have found a treasure or not, as referenced in LOG and tourney
	}
//LOG END
//POS START
	public void feedPOS (int _x, int _y, int _value) {
	    //we now feed the position of the castle/treasure
        Char point;
        switch (_x) {
            case 1:point="A";
                break;
            case 2:point="B";
                break;
            case 3:point="C";
                break;
            case 4:point="D";
                break;
            case 5:point="E";
                break;
            case 6:point="F";
                break;
            case 7:point="G";
                break;
            case 8:point="H";
                break;
        }
        int _field;
        String getSql = "SELECT `"point"` FROM MAP WHERE `gameNR` == `"+TourneyNR+"` AND `nr` == `"_y"`";
        try (Statement stmt = conn.createStatement()) {
            _field = stmt.executeUpdate(getsql);
        }catch(Exception e) {
            System.err.println(e.getMessage());
        }
        if (_value==3 && _field==1){
            String insertSql =
                    String insertSql = "UPDATE `MAP`"
                    +"SET `"point"` = `"_value"` WHERE `gameNR` == `"+TourneyNR+"` AND `nr` == `"_y"`";
        } else if (_value==4 && _field==1){
            String insertSql =
                    String insertSql = "UPDATE `MAP`"
                    +"SET `"point"` = `"_value"` WHERE `gameNR` == `"+TourneyNR+"` AND `nr` == `"_y"`";
        } else {
            try {
                if (_field != 1)
                    throw new IllegalArgumentException("Placing the " + _value == 4 ? "castle" : "treasure" + " on a " + _field == 0 ? "water" : "mountain" + " field is not permitted.");
            } catch (IllegalArgumentException e) {
                if (_field == 0 || _field ==2) {
                    System.out.println(e.getmessage());
                    }
                else {
                    System.out.println("Value incorrect");
                }
                }
            }
        }
		//update the map with the new _value
	}
//POS END
//GET METHODS
	//MAP (only used at the beginning of the game) 
	//LOG (used only if information about player is requested) 
	//POS 
		//used once at the beginning of the game in feedLOG() for the treasures
		//used to get information about the enemies castle.
	public List<integer> getMAP(int _player){
		ArrayList<char> _map = null;
		//get the map row 1 to 4 if (_player == 1)
		//get the map row 5 to 8 if (_player == 2)
		//get the whole ass map if (_player == 0)
		//feed the contents of the map into _map (=> an array of 32 integers (1to8 = R1/5, 9to16 = R2/6, 17to24 = R3/7, 25to32 = R4/8))
		return  _map;
	}
	
	public int getLOG(int _log){
	    //
		int _pos[2];
		//select the last entry for either player 1 or 2 (_player == 1 or _player == 2)
		//get the A to H values for _pos[0]
		//get the 1 to 8 values for _pos[1]
        String getSql = "SELECT `inventory` FROM `LOG` WHERE `gameNR` == `"+TourneyNR+"` AND `player` == `"+(_turn%2)&2==0?2:1+"` AND `turn` = (SELECT MAX(`turn`) FROM `LOG` WHERE `gameNR` == `"+TourneyNR+"` AND `player` == `"+(_turn%2)&2==0?2:1+"`)";
        try (Statement stmt = conn.createStatement()) {
            _inventory = stmt.executeUpdate(getsql);
        }catch(Exception e) {
            System.err.println(e.getMessage());
        }
		return _pos;
	}
	
	public int getPOS(int _x, int _y) {
		//_x translates into A to H
		//_y translates into 1 to 8
		//get the content of the field and feed it into _value
		return _value;
	}
	
}
