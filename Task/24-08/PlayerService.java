package com.myproduct.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;


import com.myproduct.dao.PlayerDao;
import com.myproduct.model.Player;

public class PlayerService {

	public static void main(String[] args) {
		
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
		java.util.Date dob=null;
		try {
			dob=dateFormat.parse("06-12-1993");
		}
		catch(ParseException e){
			e.printStackTrace();
		}
		
	
		
		Player player=new Player("Jasprit", "Bumrah", dob, "Ahmedabad", "MI");
		PlayerDao dao=new PlayerDao();
		String result=dao.createPlayer(player);
		System.out.println(result);
		
		/*PlayerDao dao=new PlayerDao();
		ArrayList<Player> playerList=dao.getAllPlayers();
		for(Player p:playerList) {
			System.out.println(p);
		}*/
		
		/*PlayerDao dao=new PlayerDao();
		System.out.println(dao.getPlayerByName("Virat", "Kohli"));*/

	}

}
