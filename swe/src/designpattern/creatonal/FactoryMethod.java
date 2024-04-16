package designpattern.creatonal;

import java.util.Scanner;

abstract class Plan {
    protected double rate;

    abstract double getRate();

    public void calculateBill(int units) {
        System.out.println(units * rate);
    }

}

class DomesticPlan extends Plan {

    @Override
    double getRate() {
       return this.rate = 3.50;
    }
}

class CommercialPlan extends Plan {

    @Override
    double getRate() {
        return this.rate = 7.50;
    }
}

class InstitutionalPlan extends Plan {

    @Override
    double getRate() {
       return this.rate = 5.50;
    }
}

class PlanFactory {
    public Plan getPlan(String planType) {

        if(planType == null){
            return null;
        }
        else if (planType.equalsIgnoreCase("DOMESTICPLAN")) {
            return new DomesticPlan();
        }
        else if (planType.equalsIgnoreCase("COMMERCIALPLAN")) {
            return new CommercialPlan();
        }
        else if (planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {
            return new InstitutionalPlan();
        }
        return null;
    }
}

public class FactoryMethod {

    public static void main(String[] args) {
        PlanFactory planFactory = new PlanFactory();
        System.out.print("Enter the name of plan for which the bill will be generated: ");
        Scanner sc = new Scanner(System.in);
        String planType = sc.nextLine();
        System.out.print("Enter the number of units for bill will be calculated: ");
        int unit = sc.nextInt();
        Plan p = planFactory.getPlan(planType);
        System.out.println(p.getRate());
        p.calculateBill(unit);
    }
}
