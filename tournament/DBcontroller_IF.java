package tournament;

import java.util.*;

public interface DBcontroller_IF {

	public boolean registerPlayer (int _mtrnr1, int _mtrnr2);
	
	public void feedMAP(List _A, List _B, List _C, List _D, int _x, int _y, int _player);
	
	public void feedLOG(int _x, int _y, int _turn);
	
	public void feedPOS (int _x, int _y, int _value);
	
	public List<Integer> getMAP(int _player);
	
	public int getLOG(boolean _log, int _turn);
	
	public int getPOS(int _x, int _y);

}
