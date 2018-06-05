package com.example.ts.TradeServicesDataRest.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.ts.TradeServicesDataRest.domain.Trade;

public interface TradeRepository extends CrudRepository<Trade,String>{
	
	List<Trade> findByTradeName(@Param("tradeName") String tradeName);
}
