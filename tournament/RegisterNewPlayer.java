package tournament;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"name","mtrnr"})
public class RegisterNewPlayer {
	private  String name;
	private  String mtrnr;
	
	public  String getName() {
		return this.name;
	}
	public String getMtrnr() {
		return this.mtrnr;
	}
}

