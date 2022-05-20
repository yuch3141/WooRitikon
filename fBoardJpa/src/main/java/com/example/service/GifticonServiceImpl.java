package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.normalid;
import com.example.persistence.GifticonRepository;

@Service
public class GifticonServiceImpl implements GifticonService {
	
	@Autowired
	private GifticonRepository gifticonRepo;
	
	@Override
	public void normalId(normalid vo) {
		gifticonRepo.save(vo);
	}
}
