package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.normalid;
import com.example.service.GifticonService;

@Controller
@RequestMapping("/Main")
public class GifticonController {
	static final Logger logger = LoggerFactory.getLogger(GifticonController.class);
	
	@Autowired
	private GifticonService gifticonService;
	
	@RequestMapping("/{step}")
	public void viewPage(@PathVariable String step) {
		//return "/board/" + step;
	}
	
	@RequestMapping("/normalId")
	public void normalId(normalid vo) {
		logger.info("일반회원 가입");
		
		gifticonService.normalId(vo);
	} 
	
	@RequestMapping("/sellerId")
	public void sellerId() {
		logger.info("일반회원 가입");
	} 
}
