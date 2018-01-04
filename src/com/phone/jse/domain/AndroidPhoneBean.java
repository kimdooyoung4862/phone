package com.phone.jse.domain;

public class AndroidPhoneBean extends IPhoneBean{
	public static String BRAND = "갤럭시 노트";
	private String size;
	
	@Override
	public void setData (String name, String data) {
		super.setCompany(BRAND);
		super.setPortable(true);
		super.setCall(name);
		setSize("7인치");
		this.data = data;
	}
	
	public void setSize(String size) {
		this.size = size;
	}
	public String getSize() {
		return size;
	}
	@Override
	public String toString() {		
		return String.format("%s 화면사이즈로 %s 상태에서 %s 로 %s 에게 데이터를 써서 %s 이라고 문자를보냄", 
				size, move, BRAND, call, data);
	}
}
//[7인치] 화면사이즈로 [이동] 상태에서 [갤럭시] 으로 [홍길동]에게 데이터를 써서
//[안녕] 이라고 문자를 보냄