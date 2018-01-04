package com.phone.jse.domain;

public class CelPhoneBean extends PhoneBean{
	protected String move;
	protected boolean portable;
	
	public void setPortable(boolean portable) {
		this.setMove((portable) ? "이동중인 " : "정지중인");
		this.portable = portable;
	}
	public void setMove(String move) {
		this.move = move;
	}
	public String getMove() {
		return move;
	}
	@Override
	public String toString() {
		return String.format("%s 상태에서 %s 전화기로 %s 에게 전화를 걸다.", move, company, call);
	}
}
