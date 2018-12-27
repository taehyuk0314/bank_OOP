package controller;

import javax.swing.JOptionPane;

import domain.AdminBean;
import service.AdminService;
import service.AdminServiceImpl;

public class AdminController {
	public static void main(String[] args) {
		AdminBean admin = null;
		AdminService adminService = new AdminServiceImpl();
		while(true) {
			switch (JOptionPane.showInputDialog("0.종료")) {
			case "0":
				JOptionPane.showMessageDialog(null, "종료");
				return;
			case"1":
				adminService.createAdmin(JOptionPane.showInputDialog("이름"),
						JOptionPane.showInputDialog("비밀번호"),
						JOptionPane.showInputDialog("관리자"));
				break;
			case"2":
				JOptionPane.showMessageDialog(null, adminService.list());
			}
		}
	}
}
