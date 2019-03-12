package com.cibc.fxr.communication.enums;

import java.io.Serializable;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum PnLCcy   implements Serializable{
	
	WC("Withdrawal CCY", "Base"),  // Withdrawal CCY changed to Base Ccy 
	FC("Foreign CCY", "Priced");   // Foreign CCY changed to Price Ccy

	private String text;
	private String label;

	private static final Map<String, PnLCcy> pnlCcyTextMap;

	static {
		pnlCcyTextMap = new HashMap<String, PnLCcy>();
		for (PnLCcy type : EnumSet.allOf(PnLCcy.class)) {
			pnlCcyTextMap.put(type.getText(), type);
		}
	}

	private PnLCcy(String text, String label) {
		this.text = text;
		this.label = label;
	}

	public static PnLCcy get(String code) {
		PnLCcy type = pnlCcyTextMap.get(code);
		return type;
	}

	public boolean equals(PnLCcy t) {
		if (t == null || !(t instanceof PnLCcy))
			return false;

		return getText() == t.getText();
	}

	public boolean notEquals(PnLCcy t) {
		return !equals(t);
	}


	public String getText() {
		return text;
	}
	
	public String getLabel() {
		return label;
	}


}
