package com.bla.controller;

import java.util.ArrayList;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bla.frame.Biz;
import com.bla.vo.AuctionVO;

@Controller
public class AuctionController {
	@Resource(name = "mbiz")
	Biz<AuctionVO, String> biz;

	// 경매 생성 페이지 이동
	@RequestMapping("/createAuction.bla")
	public ModelAndView createAuction() {
		return null;
	}

	// 경매 생성
	@RequestMapping("/createAuctionimpl.bla")
	public String createAuctionimpl(AuctionVO auction, HttpServletRequest request) {
		return null;
	}

	// 경매 상세 페이지
	@RequestMapping("/AuctionVOdetail.bla")
	public ModelAndView Auctiondetail(HttpServletRequest request, Map<String, String> map) {
		return null;
	}

	// 카테고리 별 리스트 함수/////////////////////////////////
	@RequestMapping("/clothing.bla")
	@ResponseBody
	public ModelAndView lifelist(HttpServletRequest request) {
		String category = request.getParameter("category");
		ArrayList<AuctionVO> list = null;

		ModelAndView mv = new ModelAndView();
		mv.setViewName("main");

		try {

			mv.addObject("centerpage", "auction/category/clothing");
		} catch (Exception e) {
			e.printStackTrace();
			mv.addObject("centerpage", "auction/category/clothing");
		}

		return mv;
	}

	@RequestMapping("/beauty.bla")
	@ResponseBody
	public ModelAndView fashionlist(HttpServletRequest request) {
		String category = request.getParameter("category");
		ArrayList<AuctionVO> list = null;

		ModelAndView mv = new ModelAndView();
		mv.setViewName("main");

		try {
			mv.addObject("list",list);
			mv.addObject("centerpage", "auction/category/beauty");
		} catch (Exception e) {
			e.printStackTrace();
			mv.addObject("centerpage", "auction/category/beauty");
		}

		return mv;
	}

	@RequestMapping("/sports.bla")
	@ResponseBody
	public ModelAndView sportslist(HttpServletRequest request) {
		String category = request.getParameter("category");
		ArrayList<AuctionVO> list = null;

		ModelAndView mv = new ModelAndView();
		mv.setViewName("main");

		try {
			mv.addObject("list",list);
			mv.addObject("centerpage", "auction/category/sports");
		} catch (Exception e) {
			e.printStackTrace();
			mv.addObject("centerpage", "auction/category/sports");
		}

		return mv;
	}

	@RequestMapping("/digital.bla")
	@ResponseBody
	public ModelAndView digitallist(HttpServletRequest request) {
		String category = request.getParameter("category");
		ArrayList<AuctionVO> list = null;

		ModelAndView mv = new ModelAndView();
		mv.setViewName("main");

		try {
			mv.addObject("list",list);
			mv.addObject("centerpage", "auction/category/digital");
		} catch (Exception e) {
			e.printStackTrace();
			mv.addObject("centerpage", "auction/category/digital");
		}

		return mv;
	}

	@RequestMapping("/furniture.bla")
	@ResponseBody
	public ModelAndView beautylist(HttpServletRequest request) {
		String category = request.getParameter("category");
		ArrayList<AuctionVO> list = null;

		ModelAndView mv = new ModelAndView();
		mv.setViewName("main");

		try {
			mv.addObject("list",list);
			mv.addObject("centerpage", "auction/category/furniture");
		} catch (Exception e) {
			e.printStackTrace();
			mv.addObject("centerpage", "auction/category/furniture");
		}

		return mv;
	}

	@RequestMapping("/etc.bla")
	@ResponseBody
	public ModelAndView etclist(HttpServletRequest request) {
		String category = request.getParameter("category");
		ArrayList<AuctionVO> list = null;

		ModelAndView mv = new ModelAndView();
		mv.setViewName("main");

		try {
			mv.addObject("list",list);
			mv.addObject("centerpage", "auction/category/etc");
		} catch (Exception e) {
			e.printStackTrace();
			mv.addObject("centerpage", "auction/category/etc");
		}

		return mv;
	}

	// 입찰 전 경매를 취소할 수 있는데, auction_status를 변경하기 위함.
	@RequestMapping("/updateAuctionVOimpl.bla")
	public ModelAndView updateAuctionVOimpl(AuctionVO auction, HttpServletRequest request) {
		return null;
	}

	// 입찰을 할때 Bidding 테이블에 INSERT
	@RequestMapping("/biddingimpl.bla")
	public String biddingimpl(HttpServletRequest request) {
		return null;
	}

	// 내가 입찰한 물품 리스트를 SELECT
	@RequestMapping("/mybiddinglist.bla")
	public String mybiddinglist() {
		return null;
	}

	// 내가 올린 경매 리스트 SELECT
	@RequestMapping("/myauctionlist.bla")
	public String myauctionlist() {
		return null;
	}

	// 내가 낙찰한 물품 리스트 SELECT
	@RequestMapping("/mysuccessbidlist.bla")
	public String mysuccessbidlist() {
		return null;
	}

	// 내가 낙찰됬을 때
	@RequestMapping("/successfulbiddingimpl.bla")
	public String successfulbiddingimpl(HttpServletRequest request) {
		return null;
	}

	// 판매자가 택배 운송을 보내고 운송장 번호를 입력했을 때 실행됨.
	@RequestMapping("/deliveryimpl.bla")
	public String deliveryimpl() {
		return null;
	}

	// 최고 입찰자가 바꼈을 경우 환불해주는 함수
	@RequestMapping("/failbiddingimpl.bla")
	public String failbiddingimpl(HttpServletRequest request) {
		return null;
	}

	// 판매자의 정보 select
	@RequestMapping("/sellerinfo.bla")
	public String sellerinfo(HttpServletResponse response) {
		return null;
	}

	// 회원 등급?
	@RequestMapping("/rateimpl.bla")
	public String rateimpl(HttpServletRequest request) {
		return null;
	}

	// 경매 찾는 함수
	@RequestMapping("/searchimpl.bla")
	public String searchimpl(HttpServletRequest request) {
		return null;
	}

	// 낙찰 검증
	@RequestMapping("/crosscheck.bla")
	public String crosscheck() {// db 내용과 smartcontract log를 비교
		return null;
	}

}