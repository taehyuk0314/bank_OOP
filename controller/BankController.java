package controller;

import javax.swing.JOptionPane;

import domain.AccountBean;
import domain.MemberBean;
import service.AccountService;
import service.AccountServiceImpl;
import service.MemberService;
import service.MemberServiceImpl;

public class BankController {
	public void start() {
		MemberBean mem = null;
		AccountBean ac = null;
		MemberService memberService  = new MemberServiceImpl();
		AccountService accountService = new AccountServiceImpl();
		while(true) {
			switch (JOptionPane.showInputDialog("0.종료\n"
					+ "1.회원가입\n"
					+ "2.회원리스트\n"
					+ "3.회원찾기\n"
					+ "4.회원수\n"
					+ "5.로그인\n"
					+ "6.비밀번호변경\n"
					+ "7.회원탈퇴\n"
					+ "8.회원찾기\n"
					+ "9.계좌생성\n"
					+ "10.계좌리스트\n"
					+ "11.계좌로그인\n"
					+ "12.계좌찾기"
					+ "13.입금")) {
			case "0":
				JOptionPane.showMessageDialog(null, "종료");
				return;
			case"1":
				memberService.joinMember(JOptionPane.showInputDialog("이름"),
						JOptionPane.showInputDialog("아이디"),
						JOptionPane.showInputDialog("비밀번호"),
						JOptionPane.showInputDialog("주민등록번호"));
				break;
			case"2":
				JOptionPane.showMessageDialog(null, memberService.listMember());
				break;
			case"3":
				JOptionPane.showMessageDialog(null, memberService.findSome(JOptionPane.showInputDialog("찾으실 아이디입력")));
				break;
			case"4":
				JOptionPane.showMessageDialog(null, memberService.count()+"명");
				break;
			case"5":
				JOptionPane.showMessageDialog(null, memberService.existMember(JOptionPane.showInputDialog("아이디입력"), 
						JOptionPane.showInputDialog("비밀번호입력")) ? "로그인 성공" : "로그인실패");
				break;
			case"6":
				memberService.updatePassword(JOptionPane.showInputDialog("기존아이디"),
						JOptionPane.showInputDialog("기존비밀번호"),
						JOptionPane.showInputDialog("바꾸실비밀번호"));
				break;
			case"7":
				memberService.deleteMember(JOptionPane.showInputDialog("아이디 입력"),
						JOptionPane.showInputDialog("비밀번호입력"));
				break;
			case"8":
				JOptionPane.showMessageDialog(null,memberService.findByName(JOptionPane.showInputDialog("찾으실 아이디를 입력하세요")) );
				break;
			case"9":
				accountService.infoAccountNum(0);
				break;
			case"10":
				JOptionPane.showMessageDialog(null, accountService.listAccountNum());
				break;
			case"11":
				JOptionPane.showMessageDialog(null, accountService.existAccountNum(JOptionPane.showInputDialog("계좌번호입력"))? "로그인완료" : "로그인실패");
				break;
			case"12":
				JOptionPane.showMessageDialog(null, accountService.findAccountNum(JOptionPane.showInputDialog("계좌입력")));
				break;
			case"13":
				accountService.depositAccount(JOptionPane.showInputDialog("계좌번호"),
						Integer.parseInt(JOptionPane.showInputDialog("입금금액")));
				break;
			}
		}
	}
}
