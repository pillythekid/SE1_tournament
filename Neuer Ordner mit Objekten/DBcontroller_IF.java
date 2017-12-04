package tournament;

import java.util.*;

public interface DBcontroller_IF {

	public bool registerPlayer(int _ip1, int _ip2);
	
	public void feedMAP(List _A, List _B, List _C, List _D, int _x, int _y, int _player);
	
	public void feedLOG(int _x, int _y, int _turn);
	
	public void feedPOS (int _x, int _y, int _value);
	
	public List<integer> getMAP(int _player);
	
	public int getLOG(boolean _log, int _turn);
	
	public int getPOS(int _x, int _y);

}
