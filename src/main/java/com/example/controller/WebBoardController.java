package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.domain.WebBoard;
import com.example.persistence.WebBoardRepository;
import com.example.vo.PageMaker;
import com.example.vo.PageVO;

import lombok.extern.java.Log;

@Controller
@RequestMapping("/board")
@Log
public class WebBoardController {
	
	@Autowired
	private WebBoardRepository repo;
	
	@GetMapping("/list")
	public String list2(PageVO vo, Model model){
		log.info("list.jsp called...");
		log.info("PageVO = " + vo);
		return "jsp/board/list";
	}

}