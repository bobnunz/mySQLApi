package com.boxscore.mysqlapi.models;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the rounds database table.
 * 
 */
@Entity
@Table(name="rounds")
@NamedQuery(name="Round.findAll", query="SELECT r FROM Round r")
public class Round implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idrounds;

	private String rd;

	private int roundnum;

	private int roundorder;

	private String team;

	private int year;

	//bi-directional many-to-many association to Player
	@ManyToMany
	@JoinTable(
		name="playersrounds"
		, joinColumns={
			@JoinColumn(name="idrounds")
			}
		, inverseJoinColumns={
			@JoinColumn(name="idplayers")
			}
		)
	private List<Player> players;

	public Round() {
	}

	public int getIdrounds() {
		return this.idrounds;
	}

	public void setIdrounds(int idrounds) {
		this.idrounds = idrounds;
	}

	public String getRd() {
		return this.rd;
	}

	public void setRd(String rd) {
		this.rd = rd;
	}

	public int getRoundnum() {
		return this.roundnum;
	}

	public void setRoundnum(int roundnum) {
		this.roundnum = roundnum;
	}

	public int getRoundorder() {
		return this.roundorder;
	}

	public void setRoundorder(int roundorder) {
		this.roundorder = roundorder;
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

	public List<Player> getPlayers() {
		return this.players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

}