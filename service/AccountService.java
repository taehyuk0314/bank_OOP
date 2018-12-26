package service;

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
	public void infoAccountNujm(String accountNum,String today,int money);
	public void makeAccountNum(String accountNum);
	/*
	 * READ
	 */
	public AccountBean[] listAccountNum();
	public AccountBean findAccountNum(String accountNum);
	public int countAccount();
	public boolean existAccountNum(String name,String accountNum);
	public AccountBean findToday(String today);
	/*
	 * UPDATE
	 */
	public void depositAccount(int money);
	public void withdrawalAccount(int money);
	/*
	 * DELETE
	 */
	public void deleteAccountNum(String name,String accountNum);
}
