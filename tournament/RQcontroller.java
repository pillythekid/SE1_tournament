package tournament;

import java.io.*;
import javax.xml.bind.*;


//@XmlType(propOrder = {"X","Y"})
public class RQcontroller implements RQcontroller_IF {
	private final static String req_NextTurn = "./NextTurnRequest.xml";
	private final static String req_RegisterNewPlayer = "./RegisterNewPlayerRequest.xml";
	private final static String req_SendMap = "./SendMaprequest.xml";
	private final static String req_PlayerData = "./PlayerDataRequest.xml";
	public static void main(String[] args) {	
		boolean b_NextTurn = false;
		boolean b_RegisterNewPlayer = false;
		boolean b_SendMap = false;
		boolean b_PlayerData = false;
			try {
				if (b_RegisterNewPlayer) {
					JAXBContext context;
					context = JAXBContext.newInstance(RegisterNewPlayer.class);
					Unmarshaller um = context.createUnmarshaller();
					RegisterNewPlayer player = 
							(RegisterNewPlayer) um.unmarshal(new FileReader(req_RegisterNewPlayer));
					@SuppressWarnings("unused")
					String name = player.getName();
					@SuppressWarnings("unused")
					String mtrnr = player.getMtrnr();
				} else if (b_SendMap) {
					JAXBContext context;
					context = JAXBContext.newInstance(SendMap.class);
					Unmarshaller um = context.createUnmarshaller();
					SendMap map = 
							(SendMap) um.unmarshal(new FileReader(req_SendMap));
					@SuppressWarnings("unused")
					String map1 = map.getmap1();
					@SuppressWarnings("unused")
					String map2 = map.getmap2();
					@SuppressWarnings("unused")
					String map3 = map.getmap3();
					@SuppressWarnings("unused")
					String map4 = map.getmap4();
				} else if (b_NextTurn) {
					JAXBContext context;
					context = JAXBContext.newInstance(NextTurn.class);
					Unmarshaller um = context.createUnmarshaller();
					NextTurn turn = 
							(NextTurn) um.unmarshal(new FileReader(req_NextTurn));
					@SuppressWarnings("unused")
					String X = turn.getX();
					@SuppressWarnings("unused")
					String Y = turn.getY();
				} else if (b_PlayerData) {
					JAXBContext context;
					context = JAXBContext.newInstance(PlayerData.class);
					Unmarshaller um = context.createUnmarshaller();
					PlayerData data = 
							(PlayerData) um.unmarshal(new FileReader(req_PlayerData));
					@SuppressWarnings("unused")
					String name = data.getinfo();
				}
				
			} catch (JAXBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}	
}