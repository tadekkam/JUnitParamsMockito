package org.example;

public class SalaryService {

    interface BasicSalaryService {
        double getBasicSalary();
    }

    interface SaturdayBonusService {
        double getSaturdayBonus();
    }

    static class EmployeeSalaryCalculator {
        private final BasicSalaryService basicSalaryService;
        private final SaturdayBonusService saturdayBonusService;

        public EmployeeSalaryCalculator(BasicSalaryService basicSalaryService, SaturdayBonusService saturdayBonusService) {
            this.basicSalaryService = basicSalaryService;
            this.saturdayBonusService = saturdayBonusService;
        }


        public double calculateSalary(double oneTimeBonus, int numberOfSaturdays) {
            double basicSalary = basicSalaryService.getBasicSalary();
            double saturdayBonus = saturdayBonusService.getSaturdayBonus();
            return basicSalary + oneTimeBonus + (saturdayBonus * numberOfSaturdays);
        }


    }

}
