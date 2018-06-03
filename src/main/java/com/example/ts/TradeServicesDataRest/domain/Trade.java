package com.example.ts.TradeServicesDataRest.domain;

import javax.persistence.Column;
import javax.persistence.Id;

public class Trade {
	
	@Id
	private String tradeId;
	
	@Column
	private String tradename;
	
	public Trade(String tradeId, String tradeName) {
		// TODO Auto-generated constructor stub
	}

}
