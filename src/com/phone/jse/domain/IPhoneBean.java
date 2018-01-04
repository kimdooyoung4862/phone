package com.phone.jse.domain;


public class IPhoneBean extends CelPhoneBean{
	protected String data;
	private final static String KIND = "스마트폰", BRAND = "아이폰";
	
	public void setData(String data) {
		this.data = data;
	}
	public void setData (String name, String data) {
		super.setCompany(BRAND);
		super.setPortable(true);
		super.setCall(name);
		this.data = data;
	}
	public String getData() {
		return data;
	}
	@Override
	public String toString() {
		return String.format("%s이기 때문에 %s 상태에서 %s 으로 %s에게 데이터를 써서 %s 이라고 문자를 보냄", 
				KIND, move, BRAND, call, data);
	}
	//[7인치] 화면사이즈로 [이동] 상태에서 [갤럭시] 으로 [홍길동]에게 데이터를 써서
	//[안녕] 이라고 문자를 보냄
}
