package tournament;

import javax.xml.parsers.*;

//@XmlType(propOrder = {"X","Y"})
public class RQcontroller implements RQcontroller_IF {
	
	
	public static void main(String[] args) {
		DocumentBuilderFactory  builderFactory = DocumentBuilderFactory.newInstance();
		hdfg
	}
	
	private management _mngr;
	
	RQcontroller(){
		_mngr = new management;
	}
	
	@XmlElement(name = "X");
	@XmlElement(name = "Y");

	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlRootElement()
	class RegisterNewPlayer{
		@XmlElement(name = "name");
		@XmlElement(name = "mtrnr");
		private String _name;
		private String _mtrnr;
		_mngr.registerPLayer(String _name, String _mtrnr);
	}
	
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlRootElement()
	class PlayerData {
		_mngr.PdataAccess(String _name, String _mtrnr);
	} 
	
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlRootElement()
	class NextTurn {
		_mngr.checkPos(int _x, int _y);
	}
	
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlRootElement()
	class SendMap {
		_mngr.checkMap(String _map1, String _map2, String _map3, String _map4);
	}
}
