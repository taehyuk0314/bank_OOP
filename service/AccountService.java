package service;

import java.util.ArrayList;

import domain.AccountBean;
/**
 * @author Kim taehyuk
 * @date 2018. 12. 26.
 * @desc 은행계좌 구현객체
 */
public interface AccountService {
	/*
	 * CREATE
	 */
	public void infoAccountNum(int money);
	public String makeAccountNum();
	/*
	 * READ
	 */
	public ArrayList<AccountBean> listAccountNum();
	public AccountBean findAccountNum(String accountNum);
	public int countAccount();
	public boolean existAccountNum(String accountNum);
	public String findToday();
	/*
	 * UPDATE
	 */
	public void depositAccount(String accountNum,int money);
	public void withdrawalAccount(int money);
	/*
	 * DELETE
	 */
	public void deleteAccountNum(String accountNum);
}
