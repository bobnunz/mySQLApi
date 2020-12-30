package com.boxscore.mysqlapi.dtos;

import com.boxscore.mysqlapi.models.Player;

public class PlayerResponse {
	
	private int idplayers;

	private String playernamefull;

	private String playernamelast;

	private String pos;

	private String rd;

	private String relrid;

	private int rid;

	private String team;

	private int year;
	
	private String[] rounds= {"",""};

	public PlayerResponse(int idplayers, String playernamefull, String playernamelast, String pos, String rd,
			String relrid, int rid, String team, int year, String[] rounds) {
		super();
		this.idplayers = idplayers;
		this.playernamefull = playernamefull;
		this.playernamelast = playernamelast;
		this.pos = pos;
		this.rd = rd;
		this.relrid = relrid;
		this.rid = rid;
		this.team = team;
		this.year = year;
		this.rounds = rounds;
	}

	public PlayerResponse(Player player) {
		super();
		this.idplayers = player.getIdplayers();
		this.playernamefull = player.getPlayernamefull();
		this.playernamelast = player.getPlayernamelast();
		this.pos = player.getPos();
		this.rd = player.getRd();
		this.relrid = player.getRelrid();
		this.rid = player.getRid();
		this.team = player.getTeam();
		this.year = player.getYear();
		this.rounds[0] = player.getRounds().get(0).getRd();
	}

	public int getIdplayers() {
		return idplayers;
	}

	public void setIdplayers(int idplayers) {
		this.idplayers = idplayers;
	}

	public String getPlayernamefull() {
		return playernamefull;
	}

	public void setPlayernamefull(String playernamefull) {
		this.playernamefull = playernamefull;
	}

	public String getPlayernamelast() {
		return playernamelast;
	}

	public void setPlayernamelast(String playernamelast) {
		this.playernamelast = playernamelast;
	}

	public String getPos() {
		return pos;
	}

	public void setPos(String pos) {
		this.pos = pos;
	}

	public String getRd() {
		return rd;
	}

	public void setRd(String rd) {
		this.rd = rd;
	}

	public String getRelrid() {
		return relrid;
	}

	public void setRelrid(String relrid) {
		this.relrid = relrid;
	}

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String[] getRounds() {
		return rounds;
	}

	public void setRounds(String round1, String round2) {
		this.rounds[0] = round1;
		this.rounds[1] = round2;
	}


}
