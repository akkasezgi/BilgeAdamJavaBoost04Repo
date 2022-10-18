package com.bilgeadam.boost.week08.lesson003.factorypattern;

public class PlanFactory {

	public Plan getPlan(String planType) {
		if(planType == null) {
			return null;
		}
		if (planType.equalsIgnoreCase("DOMESTICPLAN")) {
			return new DomesticPlan();
		}else if (planType.equalsIgnoreCase("COMMERCIALPLAN")) {
				return new CommercialPlan();
			}else if (planType.equalsIgnoreCase("INSTUTIONALPLAN")) {
				return new InstutionalPlan();
			}
			return null;
		
	}
}
