package com.bla.controller;

import java.io.UnsupportedEncodingException;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bla.frame.Biz;
import com.bla.vo.MemberVO;

@Controller
public class MemberController {

	@Resource(name = "mbiz")
	Biz<MemberVO, String> biz;

	@RequestMapping("/main.bla")
	public ModelAndView main() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("main");
		mv.addObject("centerpage", "center");
		return mv;
	}

	@RequestMapping("/login.bla")
	public String login() {
		return "user/login";
	}
	
	@RequestMapping("/failMeta.bla")
	public String failMeta() {
		return "user/failMeta";
	}
	

	@RequestMapping("/loginimpl.bla")
	public ModelAndView loginimpl(HttpServletRequest request) {
		String email = request.getParameter("email");
		String pw = request.getParameter("pw");
		String member_account = request.getParameter("member_account");
		HttpSession session = request.getSession();
		ModelAndView mv = new ModelAndView();
		ModelAndView mv2 = new ModelAndView();
		MemberVO member = null;
		
		
		try {
			member = biz.get(email);
			if(!(member.getMember_account().equals(member_account)))
			{
				mv.setViewName("main");
				mv.addObject("centerpage","user/failMeta");
				return mv;
			}
			if(member == null || !(member.getPw().equals(pw))) {
				//null�϶� ó�����ָ��
				mv.setViewName("main");
				mv.addObject("centerpage","user/fail");
//				mv.addObject("resultt", "asdf");
				return mv;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mv2.setViewName("main");
		mv2.addObject("centerpage","center");
		session.setAttribute("member_id", member.getMember_id());
		session.setAttribute("name",member.getName());
		session.setAttribute("address", member.getAddress());
		session.setAttribute("member_account", member.getMember_account());
		
		return mv2;
		
	}

	@RequestMapping("/logout.bla")
	public String logout(HttpServletRequest request) {
		HttpSession session = request.getSession();

		if (session != null) {
			session.invalidate();
		}

		ModelAndView mv = new ModelAndView();
		mv.setViewName("main");
		return "redirect:/main.st"; 
	}

	@RequestMapping("/register.bla")
	public String register() {
		return "user/register";
	}

	@RequestMapping("/idcheck.bla")
	@ResponseBody
	public void idCheck(String id,HttpServletResponse response) {
	}

	@RequestMapping("/jusoPopup.bla")
	public String jusoPopup()
	{
		return "user/jusoPopup";
	}
	
	
	@RequestMapping("/registerimpl.bla")
	@ResponseBody
	public ModelAndView registerimpl(HttpServletRequest request, HttpServletResponse response) {
		
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
		response.setContentType("text/html;charset=UTF-8");

		ModelAndView mv = new ModelAndView();
		HttpSession session = request.getSession();
		MemberVO member = new MemberVO();
		
		member.setEmail(request.getParameter("email"));
		member.setPw(request.getParameter("pw"));
		member.setName(request.getParameter("name"));
		member.setAddress(request.getParameter("address"));
		member.setPhone(request.getParameter("phone"));
		System.out.println("date : "+ request.getParameter("birth"));
		String bi = request.getParameter("birth").replace("-","").substring(2, 8);
		System.out.println("bi:"+bi);
		member.setBirth(bi);
		member.setMember_account(request.getParameter("member_account"));
		
		mv.setViewName("main");
		try {
			biz.register(member);	
			mv.addObject("centerpage", "center");
			session.setAttribute("email", member.getEmail());
			return mv;
		} catch (Exception e) {
			mv.addObject("resultt", "asdd");
			e.printStackTrace();
			return mv;
		}
		
	}

	@RequestMapping("/mypage.bla")
	public ModelAndView mypage(HttpServletRequest request) {
		//memeberid瑜� 媛��졇���꽌 �쉶�썝 �젙蹂� select�븳 �젙蹂� mv.addObject濡� 異붽�
		ModelAndView mv = new ModelAndView();
		mv.setViewName("main");
		mv.addObject("centerpage", "user/mypage");
		return mv;
	}
	
	@RequestMapping("/pwdupdateimpl.bla")
	public ModelAndView pwdupdateimpl(HttpServletRequest request,MemberVO user) {
		return null;
	}
	
	@RequestMapping("/userupdateimpl.bla")
	public ModelAndView userupdateimpl() {
		return null;
	}

}