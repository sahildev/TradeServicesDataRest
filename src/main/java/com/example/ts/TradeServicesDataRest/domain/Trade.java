package com.example.ts.TradeServicesDataRest.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Trade {
	
	@Id
	private String tradeId;

	@Column
	private String tradename;
	
	public Trade(String tradeId, String tradeName) {
		// TODO Auto-generated constructor stub
	}

	public String getTradeId() {
		return tradeId;
	}

	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}

	public String getTradename() {
		return tradename;
	}

	public void setTradename(String tradename) {
		this.tradename = tradename;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tradeId == null) ? 0 : tradeId.hashCode());
		result = prime * result + ((tradename == null) ? 0 : tradename.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trade other = (Trade) obj;
		if (tradeId == null) {
			if (other.tradeId != null)
				return false;
		} else if (!tradeId.equals(other.tradeId))
			return false;
		if (tradename == null) {
			if (other.tradename != null)
				return false;
		} else if (!tradename.equals(other.tradename))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Trade [tradeId=" + tradeId + ", tradename=" + tradename + "]";
	}

}
