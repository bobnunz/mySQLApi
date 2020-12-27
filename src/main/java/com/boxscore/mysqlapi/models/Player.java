package com.boxscore.mysqlapi.models;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the players database table.
 * 
 */
@Entity
@Table(name="players")
@NamedQuery(name="Player.findAll", query="SELECT p FROM Player p")
public class Player implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idplayers;

	private String playernamefull;

	private String playernamelast;

	private String pos;

	private String rd;

	private String relrid;

	private int rid;

	private String team;

	private int year;

	//bi-directional many-to-many association to Round
	@ManyToMany(mappedBy="players")
	private List<Round> rounds;

	public Player() {
	}

	public int getIdplayers() {
		return this.idplayers;
	}

	public void setIdplayers(int idplayers) {
		this.idplayers = idplayers;
	}

	public String getPlayernamefull() {
		return this.playernamefull;
	}

	public void setPlayernamefull(String playernamefull) {
		this.playernamefull = playernamefull;
	}

	public String getPlayernamelast() {
		return this.playernamelast;
	}

	public void setPlayernamelast(String playernamelast) {
		this.playernamelast = playernamelast;
	}

	public String getPos() {
		return this.pos;
	}

	public void setPos(String pos) {
		this.pos = pos;
	}

	public String getRd() {
		return this.rd;
	}

	public void setRd(String rd) {
		this.rd = rd;
	}

	public String getRelrid() {
		return this.relrid;
	}

	public void setRelrid(String relrid) {
		this.relrid = relrid;
	}

	public int getRid() {
		return this.rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public String getTeam() {
		return this.team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public List<Round> getRounds() {
		return this.rounds;
	}

	public void setRounds(List<Round> rounds) {
		this.rounds = rounds;
	}

}