package ru.skypro;

public class EmployeeBook {

    private Employee[] employee;


    Employee[] putEmployeeDataStorage(Employee[] employee, Employee person) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                employee[i] = person;
                System.out.println("Добавили в список нового сотрудника: " + employee[i]);
                System.out.println();
                break;
            }
        }
        return employee;
    }

    int calculateAmountForSalariesForMonth(Employee[] employee) {
        int sum = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            } else {
                sum = sum + employee[i].getSalaryEmployer();
            }
        }
        return sum;
    }

    int findEmployeeMinimumSalary(Employee[] employee) {
        int min = employee[0].getSalaryEmployer();
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            } else {
                if (employee[i].getSalaryEmployer() < min) {
                    min = employee[i].getSalaryEmployer();
                }
            }
        }
        return min;
    }

    int findEmployeeMaximumSalary(Employee[] employee) {
        int max = employee[0].getSalaryEmployer();
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            } else {
                if (employee[i].getSalaryEmployer() > max) {
                    max = employee[i].getSalaryEmployer();
                }
            }
        }
        return max;
    }

    long calculateAverageSalaryLevel(Employee[] employee, int sum) {
        long averageSum = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            } else {
                averageSum = (long) sum / employee.length;
            }

        }
        return averageSum;
    }

    String giveNamesEmployees(Employee[] employee) {
        String name = null;
        int count = 1;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            } else {
                name = employee[i].getNameEmployee();
                System.out.println("ФИО сотрудника №" + count + ": " + name + ".");
                count++;
            }
        }
        System.out.println();
        return name;
    }

    int indexSalary(Employee[] employee) {
        int index = 0;
        double percent = 2.51;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            } else {
                index = (int) (employee[i].getSalaryEmployer() * percent) / 100;
                index = employee[i].getSalaryEmployer() + index;
                employee[i].setSalaryEmployer(index);
                System.out.println("Заработная плата после индексации составит: " + employee[i].getSalaryEmployer() + " рублей.");
            }
        }
        System.out.println();
        return index;

    }

    int findEmployeeMinimumSalaryByDepartment(int max, Employee[] employee, int numberDepartment) {
        int min = max;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            } else {
                if (employee[i].getNumberDepartment() == numberDepartment && employee[i].getSalaryEmployer() < min) {
                    min = employee[i].getSalaryEmployer();
                }
            }
        }
        System.out.println("Минимальная заработная плата по отделу №" + numberDepartment + " составляет " + min + " рублей.");
        System.out.println();
        return min;

    }

    int findEmployeeMaximumSalaryByDepartment(Employee[] employee, int numberDepartment, int min) {
        int max = min;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            } else {
                if (employee[i].getNumberDepartment() == numberDepartment && employee[i].getSalaryEmployer() > max) {
                    max = employee[i].getSalaryEmployer();
                }
            }
        }
        System.out.println("Максимальная заработная плата по отделу №" + numberDepartment + " составляет " + max + " рублей.");
        System.out.println();
        return max;
    }

    int findEmployeeSumSalaryByDepartment(Employee[] employee, int numberDepartment) {
        int sum = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            } else {
                if (employee[i].getNumberDepartment() == numberDepartment) {
                    sum = sum + employee[i].getSalaryEmployer();
                }
            }
        }
        return sum;
    }

    void findEmployeeAverageSalaryByDepartment(Employee[] employee, int sum, int numberDepartment) {
        int averageSalary = 0;
        int count = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            } else {
                if (employee[i].getNumberDepartment() == numberDepartment) {
                    count = employee[i].getNumberDepartment();
                    averageSalary = sum / count;
                }
            }
        }
        System.out.println();
        System.out.println("Средняя сумма затрат на заработную плату по отделу №" + numberDepartment + " составляет " + averageSalary + " рублей.");
        System.out.println();
    }

    int indexSalaryDepartment(Employee[] employee, int numberDepartment, int index) {
        int indexSalary = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            } else {
                if (employee[i].getNumberDepartment() == numberDepartment) {
                    indexSalary = (int) (employee[i].getSalaryEmployer() * index) / 100;
                    indexSalary = employee[i].getSalaryEmployer() + indexSalary;
                    employee[i].setSalaryEmployer(indexSalary);
                    System.out.println("Заработная плата в отделе №" + numberDepartment + ", " + "сотрудник: " + employee[i].getNameEmployee()
                            + ", после индексации составит: " + employee[i].getSalaryEmployer() + " рублей.");
                }
            }
        }
        System.out.println();
        return index;
    }

    public static void giveNamesEmployeesDepartment(Employee[] employee, int numberDepartment) {
        String name;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            } else {
                if (employee[i].getNumberDepartment() == numberDepartment) {
                    name = employee[i].getNameEmployee();
                    System.out.println("ФИО сотрудника: " + name + ", " + "размер заработной платы: " + employee[i].getSalaryEmployer() + ".");
                }
            }
        }
        System.out.println();
    }

    void findSalaryLessParameter(Employee[] employee, int parameter) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            } else {
                if (employee[i].getSalaryEmployer() < parameter) {
                    System.out.println("Сотрудник, зарплата которого меньше параметра - " + "Id " + employee[i].getId() + " " + employee[i].getNameEmployee()
                            + " " + employee[i].getSalaryEmployer());
                }
            }
        }
        System.out.println();

    }

    void findSalaryGreaterOrEqualParameter(Employee[] employee, int parameter) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            } else {
                if (employee[i].getSalaryEmployer() >= parameter) {
                    System.out.println("Сотрудник, зарплата которого больше или равна параметру имеет следующие данные: " +
                            "Id: " + employee[i].getId() + ", " + employee[i].getNameEmployee()
                            + ", заработная плата: " + employee[i].getSalaryEmployer() + " рублей.");
                }
            }
        }
        System.out.println();

    }

    Employee[] deleteEmployee(Employee[] employees, String nameEmployee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getNameEmployee() == nameEmployee) {
                employees[i] = null;
                System.out.println(employees[i]);
            }

        }
        return employees;

    }


    void changeNameEmployeeAndNumberDepartment(Employee[] employees, String nameEmployee, int newSalaryEmployer, int NewNumberDepartment) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            } else {
                if (employees[i].getNameEmployee() == nameEmployee) {
                    employees[i].setSalaryEmployer(newSalaryEmployer);
                    employees[i].setNumberDepartment(NewNumberDepartment);
                    System.out.println("Заработная плата сотрудника: " + employees[i].getNameEmployee() + ", теперь составляет: " +
                            employees[i].getSalaryEmployer() + " рублей," + "сотрудник переведен в отдел № " + employees[i].getNumberDepartment() + ".");
                }
            }

        }
        System.out.println();
    }

    void getListEmployeesByDepartment(Employee[] employees) {
        int numberDepartment = 1;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            } else {
                if (numberDepartment <= 5) {
                    giveNamesEmployeesDepartment(employees, numberDepartment);
                    numberDepartment++;
                }
            }
        }
    }


}



