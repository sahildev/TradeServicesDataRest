package com.example.ts.TradeServicesDataRest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ts.TradeServicesDataRest.domain.Orders;
import com.example.ts.TradeServicesDataRest.domain.Region;
import com.example.ts.TradeServicesDataRest.domain.Side;
import com.example.ts.TradeServicesDataRest.domain.Trade;
import com.example.ts.TradeServicesDataRest.repo.OrderRepository;
import com.example.ts.TradeServicesDataRest.repo.TradeRepository;

@Service
public class OrderService {
	
	private TradeRepository tradeRepository;
	private OrderRepository orderRepository;
	
	@Autowired
	public OrderService(TradeRepository tradeRepository, OrderRepository orderRepository) {
		super();
		this.tradeRepository = tradeRepository;
		this.orderRepository = orderRepository;
	}
	
	public Orders createOrder(int orderId, String securityName, Integer price, String description, Side side, Region region,
			Trade trade){
		if(!orderRepository.existsById(orderId)){
			orderRepository.save(new Orders(orderId, securityName,price, description, side, region, trade));
		}
		return null;
	}
	
	public Iterable<Orders> lookup(){
		return orderRepository.findAll();
	}

}
