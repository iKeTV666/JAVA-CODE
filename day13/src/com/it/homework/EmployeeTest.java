package com.it.homework;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("001","张三","员工");
        e1.work();
        Teacher t1 = new Teacher("002","李四","教师");
        t1.work();
        Lecturer l1 = new Lecturer("003","王五","讲师");
        l1.work();
        Tutor t2 = new Tutor("004","赵六","辅导");
        t2.work();
        AdminStaff a1 = new AdminStaff("005","王二","行政");
        a1.work();
        Maintainer m1 = new Maintainer("006","麻子","维护");
        m1.work();
        Buyer b1 = new Buyer("007","张三","购买");
        b1.work();
    }
}
