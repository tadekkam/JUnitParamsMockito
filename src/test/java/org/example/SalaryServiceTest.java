package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class SalaryServiceTest {

    @Test
    void testCalculateSalary() {

        SalaryService.BasicSalaryService basicSalaryService = mock(SalaryService.BasicSalaryService.class);
        when(basicSalaryService.getBasicSalary()).thenReturn(3000.0);

        SalaryService.SaturdayBonusService saturdayBonusService = mock(SalaryService.SaturdayBonusService.class);
        when(saturdayBonusService.getSaturdayBonus()).thenReturn(100.0);

        SalaryService.EmployeeSalaryCalculator salary = new SalaryService.EmployeeSalaryCalculator(basicSalaryService, saturdayBonusService);

        Assertions.assertEquals(3500, salary.calculateSalary(100, 4));
    }

  
}