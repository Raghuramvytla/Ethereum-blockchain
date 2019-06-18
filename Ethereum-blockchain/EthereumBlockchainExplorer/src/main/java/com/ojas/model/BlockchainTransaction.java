package com.ojas.model;

public class BlockchainTransaction {
	private String id;
	private int fromId;
	private int toId;
	private Long value;

	public int getFromId() {
		return fromId;
	}

	public void setFromId(int fromId) {
		this.fromId = fromId;
	}

	public int getToId() {
		return toId;
	}

	public void setToId(int toId) {
		this.toId = toId;
	}

	public Long getValue() {
		return value;
	}

	public void setValue(Long value) {
		this.value = value;
	}

	public void setAccepted(boolean b) {
		// TODO Auto-generated method stub

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	

}
