package ru.llalive.gwttestapp.client;

import java.util.Date;

public class Contract {

	private int id;
	private Date createdAt;
	private Client client;
	private double bounty;

	public Contract() {
	}

	public Contract(int id, Date date, Client client, double bounty) {
		this.id = id;
		this.createdAt = date;
		this.client = client;
		this.bounty = bounty;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public double getBounty() {
		return bounty;
	}

	public void setBounty(double bounty) {
		this.bounty = bounty;
	}
}
