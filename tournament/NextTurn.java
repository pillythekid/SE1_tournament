package tournament;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"X","Y"})
public class NextTurn extends RegisterNewPlayer {
	private String X;
	private String Y;
	
	public String getX() {
		return this.X;
	}
	public String getY() {
		return this.Y;
	}
}
