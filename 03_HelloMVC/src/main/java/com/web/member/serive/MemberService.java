package com.web.member.serive;

import static com.web.common.SessionTemplate.getSession;

import org.apache.ibatis.session.SqlSession;

import com.web.member.dao.MemberDao;
import com.web.member.dto.Member;
public class MemberService {
	private MemberDao dao = new MemberDao();
	
	public Member selectMemberById(String userId) {
		SqlSession session = getSession();
		Member m=dao.selectMemberById(session,userId);
		session.close();
		return m;
	}
}
