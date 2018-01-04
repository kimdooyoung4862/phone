package com.phone.jse.domain;

import javax.swing.JOptionPane;


public class PhoneController {
	public static void main(String[] args) {
		PhoneBean phone = null;
		CelPhoneBean celPhone = null;
		IPhoneBean iPhone = null;
		AndroidPhoneBean android = null;
		while(true) {
			switch(JOptionPane.showInputDialog(" 0.종료 1.일반전화 2.핸드폰 3.아이폰 4.안드로이드폰")) {
			case "0" :		
				JOptionPane.showMessageDialog(null, "종료");
				return;
			case "1" :
				// 어디제품? -> 금성 전화기
				// 누구에게 겁니까? -> 홍길동
				// [금성전화기] 로, [홍길동]에게 전화를 걸다
				phone = new PhoneBean();
				phone.setCompany(JOptionPane.showInputDialog("어디 제품?"));
				phone.setCall(JOptionPane.showInputDialog("이름입력"));
				JOptionPane.showMessageDialog(null, phone.toString());
				break;
			case "2" :
				celPhone = new CelPhoneBean();
				celPhone.setMove((JOptionPane.showInputDialog("핸드폰 맞습니까? \n"
						+ "(맞으면 y , 틀리면 n)").equals("y")) ? "이동중인 " : "정지중인 ");
				celPhone.setCompany(JOptionPane.showInputDialog("어디제품입니까?"));
				celPhone.setCall(JOptionPane.showInputDialog("이름입력"));
				JOptionPane.showMessageDialog(null, celPhone.toString());
				// 휴대폰 맞습니까? (맞으면1, 틀리면 0)
				// 어디제품? -> 노키아
				// 누구에게 겁니까?
				// [정지] 상태에서 [노키아] 전화기로, [홍길동]에게 전화를 걸다
				break;
			case "3" :
				iPhone = new IPhoneBean();
				iPhone.setData(JOptionPane.showInputDialog("이름입력"),JOptionPane.showInputDialog("보낼문자입력해주세요"));
				JOptionPane.showMessageDialog(null, iPhone.toString());
				break;
			case "4" :
				android = new AndroidPhoneBean();
				android.setData(JOptionPane.showInputDialog("이름입력"),JOptionPane.showInputDialog("보낼문자입력해주세요"));
				JOptionPane.showMessageDialog(null, android.toString());
				
			}
		}
	}
}
