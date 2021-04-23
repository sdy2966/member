package co.sung.main.member.web;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.sung.main.common.Command;
import co.sung.main.member.serviceImpl.MemberDao;
import co.sung.main.member.vo.MemberVO;

public class MemberList implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO 멤버리스트를 가지고 와서 보여줄 페이지로 돌려준다.
		MemberDao dao = new MemberDao();
		List<MemberVO> list = new ArrayList<MemberVO>();
		list = dao.memberSelectList();
		request.setAttribute("members", list); // 결과값을 객체에 실어보낸다
		return "member/memberList.jsp";
	}

}
