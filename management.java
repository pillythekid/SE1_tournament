import java.util.ArrayList;

public class management {
	
	DBcontroller sqlFEED;
	ArrayList[][] _map;
	String _player1;
	String _player2;
	
	management(int _game){
		sqlFEED = new DBcontroller(_game);
		_map = null;
		_player1 = null;
		_player2 = null;

	}
	public boolean registerPlayer(String _player){
		_player1==null ? _player1=_player : _player2==null ? _player2=_player : return 0;
		return 1;
	}
	public List <integer> MAPPER (){
		//writes the whole map into _map
		ArrayList<int> _mapList = sqlFEED.getMAP(0);
	}
}
