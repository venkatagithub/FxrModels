package com.cibc.fxr.marketrates;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DdsBasisPoints implements Serializable {

	private static final long serialVersionUID = 4018003384113811723L;
	
	@JsonProperty("ric")
	private String ric;
	
	@JsonProperty("bid")
	private BigDecimal bid;
	
	@JsonProperty("ask")
	private BigDecimal ask;
	
	@JsonProperty("dt")
	private String dataDatetime;
	
	public String getRic() {
		return ric;
	}
	public void setRic(String ric) {
		this.ric = ric;
	}
	public BigDecimal getBid() {
		return bid;
	}
	public void setBid(BigDecimal bid) {
		this.bid = bid;
	}
	public BigDecimal getAsk() {
		return ask;
	}
	public void setAsk(BigDecimal ask) {
		this.ask = ask;
	}
	public String getDataDatetime() {
		return dataDatetime;
	}
	public void setDataDatetime(String datetime) {
		this.dataDatetime = datetime;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ric == null) ? 0 : ric.hashCode());
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
		DdsBasisPoints other = (DdsBasisPoints) obj;
		if (ric == null) {
			if (other.ric != null)
				return false;
		} else if (!ric.equals(other.ric))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("{ \"ric\" : ");
		if (ric == null) {
			sb.append("null");
		} else {
			sb.append("\"");
			sb.append(ric);
			sb.append("\"");
		}
		sb.append(", \"bid\" : ");
		sb.append(bid);
		sb.append(", \"ask\" : ");
		sb.append(ask);
		sb.append(", \"dt\" : ");
		if (dataDatetime == null) {
			sb.append("null");
		} else {
			sb.append("\"");
			sb.append(dataDatetime);
			sb.append("\"");
		}
		sb.append(" }");
		return sb.toString();
	}

}