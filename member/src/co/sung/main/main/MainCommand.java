package co.sung.main.main;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.sung.main.common.Command;



public class MainCommand implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO main.jsp를 돌려준다
		return "main/main.jsp";
	}

}
