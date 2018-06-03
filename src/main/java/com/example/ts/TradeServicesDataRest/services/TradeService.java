package com.example.ts.TradeServicesDataRest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ts.TradeServicesDataRest.domain.Trade;
import com.example.ts.TradeServicesDataRest.repo.TradeRepository;

@Service
public class TradeService {
	
	private TradeRepository tradeRepository;
	
	@Autowired
	public TradeService(TradeRepository tradeRepository) {
		super();
		this.tradeRepository = tradeRepository;
	}
	
	public Trade createTrade(String tradeId, String tradeName){
		if(!tradeRepository.existsById(tradeId)){
			tradeRepository.save(new Trade(tradeId, tradeName));
		}
		return null;
	}
	
	public Iterable<Trade> lookup(){
		return tradeRepository.findAll();
	}
	
	public long number(){
		return tradeRepository.count();
	}
}
