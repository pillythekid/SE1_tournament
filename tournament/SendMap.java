package tournament;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"map1","map2","map3","map4"})
public class SendMap {
	private String map1;
	private String map2;
	private String map3;
	private String map4;
	
	public String getmap1() {
		return this.map1;
	}
	public  String getmap2() {
		return this.map2;
	}
	public  String getmap3() {
		return this.map3;
	}
	public  String getmap4() {
		return this.map4;
	}
}
