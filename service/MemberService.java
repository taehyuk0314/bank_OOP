package service;
import  domain.MemberBean;

/**
 * @author Kim taehyuk
 * @date 2018. 12. 26.
 * @desc 멤버기능구현
 */
public interface MemberService {
	
	/*
	 * COUNT
	 */
	public void joinMember(String name,String id,String pass,String ssn);
	/*
	 * READ   all some one cout exisd
	 */
	public MemberBean [] listMember();
	public MemberBean [] findByName(String name);
	public MemberBean findSome(String id);
	public int count();
	public boolean existMember(String id,String pass);
	/*
	 * UPDATE
	 */
	public void updatePassword(String id,String pass,String newpass);
	/*
	 * DELETE	
	 */
	public void deleteMember(String id,String pass);

}