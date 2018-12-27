package service;

import domain.MemberBean;

public class MemberServiceImpl implements MemberService{
	private MemberBean[] members;
	private int count;
	public MemberServiceImpl() {
		members = new MemberBean[10];
		count = 0;
	}
	@Override
	public void joinMember(String name, String id, String pass, String ssn) {
		MemberBean bean = new MemberBean();
		bean.setName(name);
		bean.setId(id);
		bean.setPass(pass);
		bean.setSsn(ssn);
		members[count] = bean;
		count++;
	}

	@Override
	public MemberBean[] listMember() {
		return members;
	}

	@Override
	public MemberBean[] findByName(String name) {
		int j =0;
		for(int i =0;i<count;i++) {
			if(members[i].getName().equals(name)) {
				j++;
			}
		}
		MemberBean[] beans = new MemberBean[count];
		j=0;
		for(int i =0;i<count;i++) {
			if(members[i].getName().equals(name)) {
				beans[j] = members[i];
				j++;
			}
		}
		return beans;
	}

	@Override
	public MemberBean findSome(String id) {
		MemberBean bean = new MemberBean();
		for(int i =0;i<count;i++){
			if(members[i].getId().equals(id)) {
				 bean = members[i];
				break;
			}
		}
		return bean;
	}

	@Override
	public int count() {
		return count;
	}

	@Override
	public boolean existMember(String id, String pass) {
		boolean ok = false;
		for(int i =0; i<count;i++) {
			if(members[i].getId().equals(id)&&
			members[i].getPass().equals(pass)){
				ok =true;
				break;
			}
		}
		return ok;
	}

	@Override
	public void updatePassword(String id, String pass, String newpass) {
		MemberBean bean = new MemberBean();
		for(int i =0; i<count;i++) {
			if(existMember(id, newpass)) {
				bean.setPass(newpass);
				break;
			}
		}
	}

	@Override
	public void deleteMember(String id, String pass) {
		for(int i = 0; i<count;i++) {
			if(existMember(id, pass)) {
				members[i] = members[count-1];
				members[count-1] =null;
				count--;
			}
		}
	}

}
