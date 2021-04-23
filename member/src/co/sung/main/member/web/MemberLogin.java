package co.sung.main.member.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.sung.main.common.Command;
import co.sung.main.member.serviceImpl.MemberDao;
import co.sung.main.member.vo.MemberVO;

public class MemberLogin implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO 로그인 처리과정
		MemberDao dao = new MemberDao();
		MemberVO vo = new MemberVO();
		vo.setMemberId(request.getParameter("memberId"));
		vo.setMemberPassword(request.getParameter("memberPassword"));
		
		vo = dao.memberLoginCheck(vo);
		
		String viewPage;
		request.setAttribute("member", vo); //권한 위임시 나를 싣고가라
		
		
		if(vo.getMemberName() != null) {
			viewPage = "member/memberLoginSuccess.jsp";
		} else {
			viewPage = "member/memberLoginFail.jsp";
		}
		
		return viewPage;
	}

}
