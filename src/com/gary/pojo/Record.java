package com.gary.pojo;

public class Record {
	private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private String piece;

	public String getPiece() {
		return piece;
	}

	public void setPiece(String piece) {
		this.piece = piece;
	}

	@Override
	public String toString() {
		return "Record [id=" + id + ", piece=" + piece + "]";
	}
}
