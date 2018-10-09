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

	// 경매 등록 페이지 넘기기
	@RequestMapping("/createAuction.bla")
	public ModelAndView createAuction() {
		return null;
	}

	// 경매 등록 실시
	@RequestMapping("/createAuctionimpl.bla")
	public String createAuctionimpl(AuctionVO auction, HttpServletRequest request) {
		return null;
	}

	// 옥션 상세 페이지 넘기기
	@RequestMapping("/auctiondetail.bla")
	public ModelAndView auctiondetail(HttpServletRequest request, Map<String, String> map) {
		String auctionId = request.getParameter("auctionid");// list로 받아온 객체의 auctionid를 저장시켜서 넘겨 받아서 select해온다.

		ModelAndView mv = new ModelAndView();
		mv.setViewName("main");
		try {

			mv.addObject("centerpage", "auction/detail");
		} catch (Exception e) {
			e.printStackTrace();
			mv.addObject("centerpage", "auction/detail");
		}
		return mv;
	}

	// 각종 카테고리 리스트 뿌려주기/////////////////////////////////
	@RequestMapping("/clothing.bla")
	public ModelAndView clothing(HttpServletRequest request) {
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
	public ModelAndView beauty(HttpServletRequest request) {
		String category = request.getParameter("category");
		ArrayList<AuctionVO> list = null;

		ModelAndView mv = new ModelAndView();
		mv.setViewName("main");

		try {
			mv.addObject("list", list);
			mv.addObject("centerpage", "auction/category/beauty");
		} catch (Exception e) {
			e.printStackTrace();
			mv.addObject("centerpage", "auction/category/beauty");
		}

		return mv;
	}

	@RequestMapping("/sports.bla")
	public ModelAndView sports(HttpServletRequest request) {
		String category = request.getParameter("category");
		ArrayList<AuctionVO> list = null;

		ModelAndView mv = new ModelAndView();
		mv.setViewName("main");

		try {
			mv.addObject("list", list);
			mv.addObject("centerpage", "auction/category/sports");
		} catch (Exception e) {
			e.printStackTrace();
			mv.addObject("centerpage", "auction/category/sports");
		}

		return mv;
	}

	@RequestMapping("/digital.bla")
	@ResponseBody
	public ModelAndView digital(HttpServletRequest request) {
		String category = request.getParameter("category");
		ArrayList<AuctionVO> list = null;

		ModelAndView mv = new ModelAndView();
		mv.setViewName("main");

		try {
			mv.addObject("list", list);
			mv.addObject("centerpage", "auction/category/digital");
		} catch (Exception e) {
			e.printStackTrace();
			mv.addObject("centerpage", "auction/category/digital");
		}

		return mv;
	}

	@RequestMapping("/furniture.bla")
	public ModelAndView furniture(HttpServletRequest request) {
		String category = request.getParameter("category");
		ArrayList<AuctionVO> list = null;

		ModelAndView mv = new ModelAndView();
		mv.setViewName("main");

		try {
			mv.addObject("list", list);
			mv.addObject("centerpage", "auction/category/furniture");
		} catch (Exception e) {
			e.printStackTrace();
			mv.addObject("centerpage", "auction/category/furniture");
		}

		return mv;
	}

	@RequestMapping("/etc.bla")
	public ModelAndView etc(HttpServletRequest request) {
		String category = request.getParameter("category");
		ArrayList<AuctionVO> list = null;

		ModelAndView mv = new ModelAndView();
		mv.setViewName("main");

		try {
			mv.addObject("list", list);
			mv.addObject("centerpage", "auction/category/etc");
		} catch (Exception e) {
			e.printStackTrace();
			mv.addObject("centerpage", "auction/category/etc");
		}

		return mv;
	}

	// 옥션 정보 수정하기 단, auction_status가 입찰 전일 경우에만!
	@RequestMapping("/updateAuctionimpl.bla")
	public ModelAndView updateAuctionimpl(AuctionVO auction, HttpServletRequest request) {
		return null;
	}

	// 입찰할 때 Bidding 정보 INSERT
	@RequestMapping("/biddingimpl.bla")
	public String biddingimpl(HttpServletRequest request) {
		return null;
	}

	// 내가 입찰한 list SELECT
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

	// 낙찰 됬을 때 실행하는 함수
	@RequestMapping("/successfulbiddingimpl.bla")
	public String successfulbiddingimpl(HttpServletRequest request) {
		return null;
	}

	// 낙찰이 완료되고 물품을 보냈을 때 택배 운송장 번호를 입력.
	@RequestMapping("/deliveryimpl.bla")
	public String deliveryimpl() {
		return null;
	}

	// 최고 입찰자가 바꼈을 때 환불해 주기 위함
	@RequestMapping("/failbiddingimpl.bla")
	public String failbiddingimpl(HttpServletRequest request) {
		return null;
	}

	// 판매자 정보의 페이지 넘기기
	@RequestMapping("/sellerinfo.bla")
	public String sellerinfo(HttpServletResponse response) {
		return null;
	}

	// 회원 등급?
	@RequestMapping("/rateimpl.bla")
	public String rateimpl(HttpServletRequest request) {
		return null;
	}

	// 검색창에서 검색한 결과를 내보내는 함수
	@RequestMapping("/searchimpl.bla")
	public String searchimpl(HttpServletRequest request) {
		return null;
	}

	// 마지막에 낙찰 되었을 때 점검하는 함수
	@RequestMapping("/crosscheck.bla")
	public String crosscheck() {// db의 정보와 smartcontract log를 비교
		return null;
	}

}