package domain;

public class AccountBean {
	private String accountNum,today;
	private int money;
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public String getAccountNum() {
		return accountNum;
	}
	public void setToday(String today) {
		this.today = today;
	}
	public String getToday() {
		return today;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getMoney() {
		return money;
	}
	@Override
	public String toString() {
		return String.format("계좌번호는:%s\n"
				+ "만든날짜는:%s\n"
				+ "잔액%s\n", accountNum,today,money);
	}
}
