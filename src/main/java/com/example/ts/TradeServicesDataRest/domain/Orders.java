package com.example.ts.TradeServicesDataRest.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Orders {
	@Id
	private int orderId;
	
	@Column
	private String securityName;
	
	@Column
    private Integer price;
	
	@Column(length = 2000)
	private String description;
	
	@Column
    private Side side;

    @Column
    private Region region;
    
    @ManyToOne
    private Trade trade;

	public Orders(int orderId, String securityName, Integer price, String description, Side side, Region region,
			Trade trade) {
		super();
		this.orderId = orderId;
		this.securityName = securityName;
		this.price = price;
		this.description = description;
		this.side = side;
		this.region = region;
		this.trade = trade;
	}

}
