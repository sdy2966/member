package co.sung.main.member.service;

import java.util.List;


import co.sung.main.member.vo.MemberVO;

public interface MemberService {
	List<MemberVO> memberSelectList(); //전체 리스트
	MemberVO memberSelect(MemberVO vo);//한명 정보를 불러올 전달인자
	int memberInsert(MemberVO vo); //멤버 삽입
	int memberUpdate(MemberVO vo); //멤버 수정
	int memberDelete(MemberVO vo); //멤버 삭제
}
