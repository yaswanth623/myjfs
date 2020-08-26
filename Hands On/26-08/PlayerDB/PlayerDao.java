package com.myplayer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

import com.myplayer.dbutil.DBConnection;
import com.myplayer.model.Player;



public class PlayerDao {
	
	public String Pid(String fname,String lname){
		
		String a1="";
		char[] arr1=fname.toCharArray();
		for(int i=0; i<2; i++) {
			a1=a1+arr1[i];
		}
		String a2="";
		char[] arr2=lname.toCharArray();
		for(int i=0; i<2; i++) {
			a2=a2+arr2[i];
		}
		String name= a1+a2;
		StringBuilder sb1=new StringBuilder(name);
		try {
			Connection connection=DBConnection.getConnect();
			String sl="select myseq.nextVal from dual";
			PreparedStatement ps=connection.prepareStatement(sl);
			ResultSet r=ps.executeQuery();
			int nextSeq;
			
			if(r.next()) {
				nextSeq = r.getInt(1); 
		
			
			if(nextSeq>0 && nextSeq<10) {
				sb1.append("00"+nextSeq);
			}
			else if (nextSeq>9 && nextSeq<100) {
				sb1.append("0"+nextSeq);
			}
			else if(nextSeq==100) {
				sb1.append(nextSeq);
			}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return sb1.toString();
	}
	

	public ArrayList<Player> getAllPlayers(){
		try {
			Connection connection=DBConnection.getConnect();
			String sql="select * from player";
			PreparedStatement stat=connection.prepareStatement(sql);
			ArrayList<Player> playerList=new ArrayList<>();
			
			ResultSet rs=stat.executeQuery();
			if(rs.next()) {
				do {
					String playerId=rs.getString(1);
					String fName=rs.getString(2);
					String lName=rs.getString(3);
					Date dob=rs.getDate(4);
					String place=rs.getString(5);
					String team=rs.getString(6);
					
					Player player=new Player(playerId, fName, lName, dob, place, team);
					playerList.add(player);
				}
				while(rs.next());
			}
			return playerList;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public int deletePlayerByName(String fName,String lName) {
		try {
			Connection connection=DBConnection.getConnect();
			String sql="delete from player where fname=? and lname=?";
			PreparedStatement stat=connection.prepareStatement(sql);
			
			stat.setString(1, fName);
			stat.setString(2, lName);
			int res=stat.executeUpdate();
			if(res>0) {
				return res;
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return 0;
	}
	
	public Player getPlayerByName(String firstName,String lastName) {
		try {
			Connection connection=DBConnection.getConnect();
			String sql="select * from player where fname=? and lname=?";
			PreparedStatement stat=connection.prepareStatement(sql);
			
			stat.setString(1, firstName);
			stat.setString(2, lastName);
			
			ResultSet rs=stat.executeQuery();
			if(rs.next()) {
				String playerId=rs.getString(1);
				String fName=rs.getString(2);
				String lName=rs.getString(3);
				Date dob=rs.getDate(4);
				String place=rs.getString(5);
				String team=rs.getString(6);
				
				Player player=new Player(playerId, fName, lName, dob, place, team);
				return player;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public String createPlayer(Player player) {
		try {
			
			Connection connection=DBConnection.getConnect();
			String sql="insert into player values(?,?,?,?,?,?)";
			PreparedStatement stat=connection.prepareStatement(sql);
			
			
			
			stat.setString(1, Pid(player.getfName(), player.getlName()));
			stat.setString(2, player.getfName());
			stat.setString(3, player.getlName());
			
			java.util.Date dob=player.getDob();
			java.sql.Date sqlDob=new java.sql.Date(dob.getTime());
			stat.setDate(4, sqlDob);
			
			stat.setString(5, player.getPlace());
			stat.setString(6, player.getTeam());
			
			int res=stat.executeUpdate();
			if(res>0)
				return "Player Created";
			else
				return "Player cannot be created";
		}
		catch(Exception e) {
			e.printStackTrace();
			return "Exception";
		}
	}
}
