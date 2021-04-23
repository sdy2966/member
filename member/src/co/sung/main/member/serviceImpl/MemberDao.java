package co.sung.main.member.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.sung.main.common.DataSource;
import co.sung.main.member.service.MemberService;
import co.sung.main.member.vo.MemberVO;




public class MemberDao implements MemberService {
	private DataSource dataSource = DataSource.getInstance(); //데이터베이스 연결객ㅊ[
	private Connection conn; //내부에서 DB connection 유지
	private PreparedStatement psmt; //db 명령실행
	private ResultSet rs; // select 한 결과를 받기 위해
	
	@Override
	public List<MemberVO> memberSelectList() {
		List<MemberVO> list = new ArrayList<MemberVO>(); //결과를 담을 저장소
		String sql = "select * from member";
		MemberVO vo;
		 try {
			 conn = dataSource.getConnection();
			 psmt = conn.prepareStatement(sql);
			 rs = psmt.executeQuery();
			 while(rs.next()) {
				 vo = new MemberVO();
				 vo.setMemberId(rs.getString("memberid"));
				 vo.setMemberName(rs.getString("membername"));
				 vo.setMemberPassword(rs.getString("memberpassword"));
				 vo.setMemberAddress(rs.getString("memberaddress"));
				 list.add(vo);
			 }
			 
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
		}
		
		return list;
	}

	@Override
	public MemberVO memberSelect(MemberVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int memberInsert(MemberVO vo) {
		// TODO 회원입력 로직
		int n = 0;
		String sql = "insert into member values(?,?,?,?)";
		try {
			conn = dataSource.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getMemberId());
			psmt.setString(2, vo.getMemberName());
			psmt.setString(3, vo.getMemberPassword());
			psmt.setString(4, vo.getMemberAddress());
			n = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
		}
		return n;
	}

	@Override
	public int memberUpdate(MemberVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int memberDelete(MemberVO vo) {
		// TODO 회원삭제
		int n = 0;
		String sql = "delete from member where memberid = ?";
		try {
			conn = dataSource.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getMemberId());
			n = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return n;
	}
	private void close() {
		try {
			if(rs != null) rs.close();
			if(psmt != null) psmt.close();
			if(conn != null) conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
