package ru.skypro;


public class Main {

    public static void main(String[] args) {
        EmployeeBook book = new EmployeeBook();
        Employee[] employee = new Employee[10];

        employee[0] = new Employee("Иванов Иван Иванович", 1, 100_000);
        System.out.println(employee[0]);
        employee[1] = new Employee("Петров Петер Петрович", 2, 80_000);
        System.out.println(employee[1]);
        employee[2] = new Employee("Смирнова Татьяна Сергеевна", 3, 90_000);
        System.out.println(employee[2]);
        employee[3] = new Employee("Потапова Светлана Виниаминовна", 4, 75_000);
        System.out.println(employee[3]);
        employee[4] = new Employee("Сидоров Антон Романович", 5, 65_000);
        System.out.println(employee[4]);
        employee[5] = new Employee("Константинов Вениамин Семенович", 1, 85_000);
        System.out.println(employee[5]);
        employee[6] = new Employee("Герасимов Инокентий Эдуардович", 2, 115_000);
        System.out.println(employee[6]);
        employee[7] = new Employee("Петрова Ольга Игоревна", 3, 95_000);
        System.out.println(employee[7]);
        employee[8] = new Employee("Опарина Кира Денисовна", 4, 90_000);
        System.out.println(employee[8]);
        employee[9] = new Employee("Глушина Тамара Ильинична", 5, 100_000);
        System.out.println(employee[9]);
        Employee person = new Employee("Краснова Тамара Петровна", 3, 120000);
        System.out.println();


        book.putEmployeeDataStorage(employee, person);//добавить сотрудника в список


        book.calculateAmountForSalariesForMonth(employee); //рассчитать сумму з/п за месяц
        System.out.println();
        System.out.println("Сумма затрат на зарплаты в месяц составляет: " + book.calculateAmountForSalariesForMonth(employee) + " рублей.");

        book.findEmployeeMinimumSalary(employee); //найти сотрудника с минимальной з/п
        System.out.println();
        System.out.println("Минимальная заработная плата сотрудника составляет: " + book.findEmployeeMinimumSalary(employee) + " рублей.");

        book.findEmployeeMaximumSalary(employee); // найти сотрудника с максимальной з/п
        System.out.println();
        System.out.println("Максимальная заработная плата сотрудника составляет: " + book.findEmployeeMaximumSalary(employee) + " рублей.");
        book.calculateAverageSalaryLevel(employee, book.calculateAmountForSalariesForMonth(employee));//рассчитать средний уровень з/п сотрдуника
        System.out.println();
        System.out.println("Средняя сумма трат за месяц составила " + book.calculateAverageSalaryLevel(employee, book.calculateAmountForSalariesForMonth(employee)) + " рублей.");
        System.out.println();
        book.giveNamesEmployees(employee); //назовите имена сотрудников
        book.indexSalary(employee); // проиндексируй з/п
        book.findEmployeeMinimumSalaryByDepartment(book.findEmployeeMaximumSalary(employee), employee, 2);//найти сотрдуника с минимальной з/п в отделе
        book.findEmployeeMaximumSalaryByDepartment(employee, 1, book.findEmployeeMinimumSalary(employee)); //найти сотрдуника с максимальной з/п в отделе
        book.findEmployeeSumSalaryByDepartment(employee, 5); // найти сумму расходов на з/п в отделе
        System.out.println("Сумма затрат на заработную плату по отделу" + " составляет " + book.findEmployeeSumSalaryByDepartment(employee, 5) + " рублей.");
        book.findEmployeeAverageSalaryByDepartment(employee, book.findEmployeeSumSalaryByDepartment(employee, 3), 3);//найти среднюю з/п по отделу
        book.indexSalaryDepartment(employee, 5, 5); //проинденксировать з/п в отделе
        book.giveNamesEmployeesDepartment(employee, 5); // назвать имена сотрудников отдела


        book.deleteEmployee(employee, "Смирнова Татьяна Сергеевна");//удалить сотрудника из списка

        book.findSalaryLessParameter(employee, 80_000);//найти всех сотрдуников, з/п которых  меньше параметра
        book.findSalaryGreaterOrEqualParameter(employee, 90_000); // найти всех сотрудников, з/п которых больше или равна параметру

        book.changeNameEmployeeAndNumberDepartment(employee, "Опарина Кира Денисовна", 100_000, 2);//изменить з/п и отдел сотрдуника
        book.getListEmployeesByDepartment(employee);//получить ФИО всех сотрудников по отделам
    }

}







