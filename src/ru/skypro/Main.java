package ru.skypro;


public class Main {

    public static void main(String[] args) {
        Employee[] employee = new Employee[10];

        Employee person1 = new Employee("Иванов Иван Иванович", 1, 100_000);
        Employee person2 = new Employee("Петров Петер Петрович", 2, 80_000);
        Employee person3 = new Employee("Смирнова Татьяна Сергеевна", 3, 90_000);
        Employee person4 = new Employee("Потапова Светлана Виниаминовна", 4, 75_000);
        Employee person5 = new Employee("Сидоров Антон Романович", 5, 65_000);
        Employee person6 = new Employee("Константинов Вениамин Семенович", 1, 85_000);
        Employee person7 = new Employee("Герасимов Инокентий Эдуардович", 2, 115_000);
        Employee person8 = new Employee("Петрова Ольга Игоревна", 3, 95_000);
        Employee person9 = new Employee("Опарина Кира Денисовна", 4, 90_000);
        Employee person10 = new Employee("Глушина Тамара Ильинична", 5, 100_000);

        putEmployeeDataStorage(employee, person1);//добавить сотрудника в список
        putEmployeeDataStorage(employee, person2);
        putEmployeeDataStorage(employee, person3);
        putEmployeeDataStorage(employee, person4);
        putEmployeeDataStorage(employee, person5);
        putEmployeeDataStorage(employee, person6);
        putEmployeeDataStorage(employee, person7);
        putEmployeeDataStorage(employee, person8);
        putEmployeeDataStorage(employee, person9);
        putEmployeeDataStorage(employee, person10);

        calculateAmountForSalariesForMonth(employee); //рассчитать сумму з/п за месяц
        System.out.println();
        System.out.println("Сумма затрат на зарплаты в месяц составляет: " + calculateAmountForSalariesForMonth(employee) + " рублей.");

        findEmployeeMinimumSalary(employee); //найти сотрудника с минимальной з/п
        System.out.println();
        System.out.println("Минимальная заработная плата сотрудника составляет: " + findEmployeeMinimumSalary(employee) + " рублей.");

        findEmployeeMaximumSalary(employee); // найти сотрудника с максимальной з/п
        System.out.println();
        System.out.println("Максимальная заработная плата сотрудника составляет: " + findEmployeeMaximumSalary(employee) + " рублей.");
        calculateAverageSalaryLevel(employee, calculateAmountForSalariesForMonth(employee));//рассчитать средний уровень з/п сотрдуника
        System.out.println();
        System.out.println("Средняя сумма трат за месяц составила " + calculateAverageSalaryLevel(employee,calculateAmountForSalariesForMonth(employee) ) + " рублей.");
        System.out.println();
        giveNamesEmployees(employee); //назовите имена сотрудников
        indexSalary(employee); // проиндексируй з/п
        findEmployeeMinimumSalaryByDepartment(findEmployeeMaximumSalary(employee), employee,2);//найти сотрдуника с минимальной з/п в отделе
        findEmployeeMaximumSalaryByDepartment(employee, 1, findEmployeeMinimumSalary(employee)); //найти сотрдуника с максимальной з/п в отделе
        findEmployeeSumSalaryByDepartment(employee, 5); // найти сумму расходов на з/п в отделе
        System.out.println("Сумма затрат на заработную плату по отделу" + " составляет " + findEmployeeSumSalaryByDepartment(employee, 5) + " рублей.");
        findEmployeeAverageSalaryByDepartment(employee, findEmployeeSumSalaryByDepartment(employee, 3), 3);//найти среднюю з/п по отделу
        indexSalaryDepartment(employee, 5, 5); //проинденксировать з/п в отделе
        giveNamesEmployeesDepartment(employee,5); // назвать имена сотрудников отдела
        findSalaryLessParameter(employee, 80_000);//найти всех сотрдуников, з/п которых  меньше параметра
        findSalaryGreaterOrEqualParameter(employee, 90_000); // найти всех сотрудников, з/п которых больше или равна параметру

    }
    public static Employee[] putEmployeeDataStorage(Employee[] employee, Employee person) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                employee[i] = person;
                System.out.println(employee[i]);
                break;
            }
        }
        return employee;
    }

    public static int calculateAmountForSalariesForMonth(Employee[] employee) {
        int sum = 0;
        for (int i = 0; i < employee.length; i++) {
            sum = sum + employee[i].getSalaryEmployer();
        }
        return sum;
    }

    public static int findEmployeeMinimumSalary(Employee[] employee) {
        int min = employee[0].getSalaryEmployer();
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalaryEmployer() < min) {
                min = employee[i].getSalaryEmployer();
            }
        }
        return min;
    }

   public static int findEmployeeMaximumSalary(Employee[] employee) {
        int max = employee[0].getSalaryEmployer();
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalaryEmployer() > max) {
                max = employee[i].getSalaryEmployer();
            }
        }
        return max;
    }

   public static long calculateAverageSalaryLevel(Employee[] employee, int sum) {
        long averageSum = 0;
        for (int i = 0; i < employee.length; i++) {
            averageSum = (long) sum / employee.length;
        }
        return averageSum;
    }

    public static String giveNamesEmployees(Employee[] employee) {
        String name = null;
        int count = 1;
        for (int i = 0; i < employee.length; i++) {
            name = employee[i].getNameEmployee();
            System.out.println("ФИО сотрудника №" + count + ": " + name + ".");
            count++;
        }
        System.out.println();
        return name;
    }

   public static int indexSalary(Employee[] employee) {
        int index = 0;
        double percent = 2.51;
        for (int i = 0; i < employee.length; i++) {
                index = (int) (employee[i].getSalaryEmployer() * percent) / 100;
                index = employee[i].getSalaryEmployer() + index;
                employee[i].setSalaryEmployer(index);
                System.out.println("Заработная плата после индексации составит: " + employee[i].getSalaryEmployer() + " рублей.");
        }
        System.out.println();
        return index;

    }

    public static int findEmployeeMinimumSalaryByDepartment(int max, Employee[] employee, int numberDepartment) {
        int min=max;
        for (int i = 0; i < employee.length; i++) {
            if(employee[i].getNumberDepartment() == numberDepartment && employee[i].getSalaryEmployer() < min) {
                 min = employee[i].getSalaryEmployer();
                }
            }System.out.println("Минимальная заработная плата по отделу №" + numberDepartment + " составляет " + min + " рублей.");
        System.out.println();
             return min;

        }

    public static int findEmployeeMaximumSalaryByDepartment(Employee[] employee, int numberDepartment,  int min) {
      int max = min;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getNumberDepartment() == numberDepartment && employee[i].getSalaryEmployer() > max) {
                    max = employee[i].getSalaryEmployer();
                }
            }
        System.out.println("Максимальная заработная плата по отделу №" + numberDepartment + " составляет " + max + " рублей.");
        System.out.println();
        return max;
        }

   public static int findEmployeeSumSalaryByDepartment(Employee[] employee, int numberDepartment) {
        int sum = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getNumberDepartment() == numberDepartment) {
                sum = sum + employee[i].getSalaryEmployer();
            }
        }
        return sum;
    }

   public static void findEmployeeAverageSalaryByDepartment(Employee[] employee, int sum, int numberDepartment) {
        int averageSalary = 0;
        int count = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getNumberDepartment() == numberDepartment) {
                count = employee[i].getNumberDepartment();
                averageSalary = sum / count;
            }
        }
        System.out.println();
        System.out.println("Средняя сумма затрат на заработную плату по отделу №" + numberDepartment + " составляет " + averageSalary + " рублей.");
       System.out.println();
    }

   public static int indexSalaryDepartment(Employee[] employee, int numberDepartment, int index) {
        int indexSalary = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getNumberDepartment() == numberDepartment) {
                indexSalary = (int) (employee[i].getSalaryEmployer() * index) / 100;
                indexSalary = employee[i].getSalaryEmployer() + indexSalary;
                employee[i].setSalaryEmployer(indexSalary);
                System.out.println("Заработная плата в отделе №" + numberDepartment + ", " + "сотрудник: " + employee[i].getNameEmployee()
                        + ", после индексации составит: " + employee[i].getSalaryEmployer() + " рублей.");
            }
        }
        System.out.println();
        return index;
    }

       public static void giveNamesEmployeesDepartment(Employee[] employee, int numberDepartment) {
            String name;
            for (int i = 0; i < employee.length; i++) {
                if (employee[i].getNumberDepartment() == numberDepartment) {
                    name = employee[i].getNameEmployee();
                    System.out.println("ФИО сотрудника: "  + name + ", " + "размер заработной платы: " + employee[i].getSalaryEmployer() +  ".");
                }
            }
            System.out.println();
        }

   public static void findSalaryLessParameter(Employee[] employee, int parameter){
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalaryEmployer() <  parameter) {
                System.out.println("Сотрудник, зарплата которого меньше параметра - " + "Id " + employee[i].getId() + " " + employee[i].getNameEmployee()
                        + " " + employee[i].getSalaryEmployer() );
            }
    }
        System.out.println();

    }

    public  static void findSalaryGreaterOrEqualParameter(Employee[] employee, int parameter){
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalaryEmployer() >=  parameter) {
                System.out.println("Сотрудник, зарплата которого больше или равна параметру имеет следующие данные: " +
                        "Id: " + employee[i].getId() + ", " + employee[i].getNameEmployee()
                        + ", заработная плата: " + employee[i].getSalaryEmployer() + " рублей." );
            }
        }

    }
    }







