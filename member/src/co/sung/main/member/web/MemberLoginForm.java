package co.sung.main.member.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.sung.main.common.Command;

public class MemberLoginForm implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO 로그인 폼 호출 
//		return "member/memberLoginForm.jsp";
		return "member/memberList.jsp";
	}

}
