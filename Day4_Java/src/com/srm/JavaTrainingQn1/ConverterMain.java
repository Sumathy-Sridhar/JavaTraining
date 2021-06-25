package com.srm.JavaTrainingQn1;

import Currency.CurrencyConverter;
import Distance.DistanceConverter;
import Time.TimeConverter;

public class ConverterMain {

	public static void main(String[] args) {
	CurrencyConverter iu=new CurrencyConverter();
	iu.getValue();
	iu.InrToUsedConverter();
	System.out.println();
	DistanceConverter mk=new DistanceConverter();
	mk.getValue();
	mk.MtrToKmConverter();
	System.out.println();
	TimeConverter tc=new TimeConverter();
	tc.getValue();
	tc.HrsToMin();
	}

}
