package com.KoreaIT.java.JDBCAM.session;

import com.KoreaIT.java.JDBCAM.dto.Member;

public class Session {

	public Member loginedMember;
	public int loginedMemberId;

	public Session() {
		loginedMemberId = -1;
	}

	public Member getLoginedMember() {
		return loginedMember;
	}

	public void setLoginedMember(Member loginedMember) {
		this.loginedMember = loginedMember;
	}

	public int getLoginedMemberId() {
		return loginedMemberId;
	}

	public void setLoginedMemberId(int loginedMemberId) {
		this.loginedMemberId = loginedMemberId;
	}

	public void login(Member member) {
		loginedMember = member;
		loginedMemberId = member.getId();
	}

	public void logout() {
		loginedMember = null;
		loginedMemberId = -1;
		System.out.println("로그아웃 됨");
	}

	public boolean isLogined() {
		return loginedMemberId != -1;
	}

}