package com.cldsantos2105.dto;

import com.cldsantos2105.model.ShopReport;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShopReportDTO {
	    
    private String identifier;
    
    private Integer amount;
	
    public static ShopReportDTO convert(ShopReport shopReport) {
    	ShopReportDTO shopDTO = new ShopReportDTO();
    	shopDTO.setIdentifier(shopReport.getIdentifier());
    	shopDTO.setAmount(shopReport.getAmount());
    	return shopDTO;
    }

}
