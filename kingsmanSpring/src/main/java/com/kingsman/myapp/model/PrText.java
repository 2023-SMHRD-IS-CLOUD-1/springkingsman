package com.kingsman.myapp.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PrText {

	private int PR_INDEX;
	private String PR_QUESTION;
	private String PR_TEXT;
	private String PR_ID;
	private String PR_PRODUCT;
	private String PR_NAME;
	private String PR_CATEGORY;
	private String PR_WEATHER;
	private String PR_SEASON;
	private Date PR_DATE;
	
	@Override
    public String toString() {
        return "PrText{" +
                "name='" + PR_NAME + '\'' +
                ", PR_QUESTION='" + PR_QUESTION + '\'' +
                ", PR_TEXT'"+PR_TEXT+'\''+
                ", product='" + PR_PRODUCT + '\'' +
                '}';
    }
	
}
