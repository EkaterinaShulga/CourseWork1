package ru.skypro;

public class Employee {
    private String nameEmployee;
    private int salaryEmployer;
    private int numberDepartment;
    static int count = 1;
    private int id;

    public Employee(String nameEmployee, int numberDepartment, int salaryEmployer){
        this.nameEmployee = nameEmployee;
        this.numberDepartment = numberDepartment;
        this.salaryEmployer = salaryEmployer;
        this.id = getCount();
        count++;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public int getNumberDepartment() {
        return numberDepartment;
    }

    public int getSalaryEmployer() {
        return salaryEmployer;
    }

    public static int getCount() {
        return count;
    }

    public int getId() {
        return id;
    }

    public void setNumberDepartment(int numberDepartment) {
        this.numberDepartment = numberDepartment;
    }

    public void setSalaryEmployer(int salaryEmployer) {
        this.salaryEmployer = salaryEmployer;


    }
    @Override
    public String toString() {
        return "Сотрудник: " +   getNameEmployee()  + " работает в отделе №" +  getNumberDepartment() + ", размер его заработной платы составляет " +
                getSalaryEmployer() + ", номер id " +  getId() + ".";
    }

}
