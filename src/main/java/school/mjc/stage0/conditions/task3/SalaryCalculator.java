package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public static void calculateSalary(int salary) {

        float cleanSalary;

        if (0 < salary && salary <= 10000){

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

    }
    public static void main(String[] args) {
        calculateSalary(5000);
        calculateSalary(15000);
        calculateSalary(35000);
        calculateSalary(-1);
    }
}
