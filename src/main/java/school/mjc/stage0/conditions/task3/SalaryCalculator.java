package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {

        salary = 5000;
        float cleanSalary;

        if (salary <= 10000){

             cleanSalary = salary - (salary * 15 / 100);
            System.out.println(cleanSalary);
        } else if (10000 < salary && salary <= 20000) {

            cleanSalary = salary - (salary * 18 / 100);

            System.out.println(cleanSalary);

    } else if (salary > 20000) {

            cleanSalary = salary - (salary * 20 / 100);
            System.out.println(cleanSalary);

        } else {
            System.out.println("wrong input!");
        }

    }}
