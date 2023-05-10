package question1;

public class Employee {
    
    String name;
    double salary;
    double bonus;
    double discount;
    double bonusOrDiscount;
    double liquidSalary;

    public Employee(String name, double salary,double discount) {
        this.name = name;
        this.salary = salary;
        this.bonus = 0;
        this.discount = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }


    public void calculate() {
        double bonusOrDiscount = 0;

    if (salary <= 1000) {
        bonusOrDiscount = salary * 0.2;
        System.out.println("Bonus:" + bonusOrDiscount);
    } else if (salary <= 2000) {
        bonusOrDiscount = salary * 0.1;
        System.out.println("Bonus:" + bonusOrDiscount);
    } else {
        bonusOrDiscount = -salary * 0.1;
        System.out.println("Discount:" + bonusOrDiscount);
    }
    liquidSalary = salary + bonusOrDiscount;
    System.out.println("Liquid Salary:" + liquidSalary);
    this.bonusOrDiscount = bonusOrDiscount;
    }

}       

