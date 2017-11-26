import java.util.*;

public interface DBcontroller_IF {

	public bool registerPlayer(String _ip1, String _ip2);
	
	public void feedMAP(List _A, List _B, List _C, List _D, int _x, int _y, int _player);
	
	public void feedLOG(int _x, int _y, int _turn);
	
	public List<integer> getMap(int _player);
	
	public int getLOG(int _player);

}
