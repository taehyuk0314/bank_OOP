package service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import domain.AccountBean;
import domain.MemberBean;

public class AccountServiceImpl implements AccountService{
	private ArrayList<AccountBean> list;
	
	public AccountServiceImpl() {
		list = new ArrayList<>();
	}
	/*
	 * CREATE
	 */
	@Override
	public void infoAccountNum(int money) {
		AccountBean accountBean = new AccountBean();
		accountBean.setAccountNum(makeAccountNum());
		accountBean.setMoney(money);
		accountBean.setToday(findToday());
		list.add(accountBean);
	}
	@Override
	public String makeAccountNum() {
		String res ="";
		Random random = new Random();
		for(int i =0;i<8;i++) {
			if(i!=3) {
				res += random.nextInt(10);
			}else {
			 res += random.nextInt(10)+"-";
			}
		}
		return res;
	}
	/*
	 * READ
	 */
	@Override
	public ArrayList<AccountBean> listAccountNum() {
		return list;
	}

	@Override
	public AccountBean findAccountNum(String accountNum) {
		AccountBean account = new AccountBean();
		for(int i =0; i<list.size();i++) {
			if(list.get(i).getAccountNum().equals(accountNum)) {
				account = list.get(i);
				break;
			}
		}
		return account;
	}

	@Override
	public int countAccount() {
		return list.size();
	}

	@Override
	public boolean existAccountNum(String accountNum) {
		boolean ok = false;
		for(int i =0; i<list.size();i++) {
			if(list.get(i).getAccountNum().equals(accountNum)) {
				ok =true;
				break;
			}
		}
		return ok;
	}

	@Override
	public String findToday() {
		Date date = new Date();
		SimpleDateFormat jdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return  jdf.format(date);
	}
/*
 * UPDATE
 */
	@Override
	public void depositAccount(String accountNum,int money) {
		for(int i =0;i<list.size();i++) {
			if(list.get(i).getAccountNum().equals(accountNum)) {
				if(money>0) {}
					list.get(i).setMoney(list.get(i).getMoney() + money);
					break;
			}
		}
	}
	@Override
	public void withdrawalAccount(int money) {
		// TODO Auto-generated method stub
		
	}
/*
 * DELETE
 */
	@Override
	public void deleteAccountNum(String accountNum) {
		// TODO Auto-generated method stub
		
	}


}
