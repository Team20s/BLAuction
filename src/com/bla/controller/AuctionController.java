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

	// 寃쎈ℓ �깮�꽦 �럹�씠吏� �씠�룞
	@RequestMapping("/createAuction.bla")
	public ModelAndView createAuction() {
		return null;
	}

	// 寃쎈ℓ �깮�꽦
	@RequestMapping("/createAuctionimpl.bla")
	public String createAuctionimpl(AuctionVO auction, HttpServletRequest request) {
		return null;
	}

	// 寃쎈ℓ �긽�꽭 �럹�씠吏�
	@RequestMapping("/AuctionVOdetail.bla")
	public ModelAndView Auctiondetail(HttpServletRequest request, Map<String, String> map) {
		return null;
	}

	// 移댄뀒怨좊━ 蹂� 由ъ뒪�듃 �븿�닔/////////////////////////////////
	@RequestMapping("/clothing.bla")
	public ModelAndView clothing(HttpServletRequest request) {
		System.out.println("clothing..");
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

	// �엯李� �쟾 寃쎈ℓ瑜� 痍⑥냼�븷 �닔 �엳�뒗�뜲, auction_status瑜� 蹂�寃쏀븯湲� �쐞�븿.
	@RequestMapping("/updateAuctionVOimpl.bla")
	public ModelAndView updateAuctionVOimpl(AuctionVO auction, HttpServletRequest request) {
		return null;
	}

	// �엯李곗쓣 �븷�븣 Bidding �뀒�씠釉붿뿉 INSERT
	@RequestMapping("/biddingimpl.bla")
	public String biddingimpl(HttpServletRequest request) {
		return null;
	}

	// �궡媛� �엯李고븳 臾쇳뭹 由ъ뒪�듃瑜� SELECT
	@RequestMapping("/mybiddinglist.bla")
	public String mybiddinglist() {
		return null;
	}

	// �궡媛� �삱由� 寃쎈ℓ 由ъ뒪�듃 SELECT
	@RequestMapping("/myauctionlist.bla")
	public String myauctionlist() {
		return null;
	}

	// �궡媛� �굺李고븳 臾쇳뭹 由ъ뒪�듃 SELECT
	@RequestMapping("/mysuccessbidlist.bla")
	public String mysuccessbidlist() {
		return null;
	}

	// �궡媛� �굺李곕맟�쓣 �븣
	@RequestMapping("/successfulbiddingimpl.bla")
	public String successfulbiddingimpl(HttpServletRequest request) {
		return null;
	}

	// �뙋留ㅼ옄媛� �깮諛� �슫�넚�쓣 蹂대궡怨� �슫�넚�옣 踰덊샇瑜� �엯�젰�뻽�쓣 �븣 �떎�뻾�맖.
	@RequestMapping("/deliveryimpl.bla")
	public String deliveryimpl() {
		return null;
	}

	// 理쒓퀬 �엯李곗옄媛� 諛붽펷�쓣 寃쎌슦 �솚遺덊빐二쇰뒗 �븿�닔
	@RequestMapping("/failbiddingimpl.bla")
	public String failbiddingimpl(HttpServletRequest request) {
		return null;
	}

	// �뙋留ㅼ옄�쓽 �젙蹂� select
	@RequestMapping("/sellerinfo.bla")
	public String sellerinfo(HttpServletResponse response) {
		return null;
	}

	// �쉶�썝 �벑湲�?
	@RequestMapping("/rateimpl.bla")
	public String rateimpl(HttpServletRequest request) {
		return null;
	}

	// 寃쎈ℓ 李얜뒗 �븿�닔
	@RequestMapping("/searchimpl.bla")
	public String searchimpl(HttpServletRequest request) {
		return null;
	}

	// �굺李� 寃�利�
	@RequestMapping("/crosscheck.bla")
	public String crosscheck() {// db �궡�슜怨� smartcontract log瑜� 鍮꾧탳
		return null;
	}

}