package com.it.demo;

public class studentTest {
    public static void main(String[] args) {
        Student [] stu = new Student[3];

        Student stu1 = new Student("张三",18,1001);
        Student stu2 = new Student("李四",18,1002);
        Student stu3 = new Student("王五",18,1003);
        stu[0] = stu1;
        stu[1] = stu2;
        stu[2] = stu3;
        Student stu4 = new Student("赵六",18,1004);
        /*boolean flag = exists(stu,stu4.getId());
            if(flag){
                if (getCount(stu) != stu.length){
                    stu[getCount(stu)] = stu4;
                    printStu(stu);
                }else {
                   Student[] newStu = creatNewarr(stu);
                   newStu[getCount(stu)] = stu4;
                    printStu(newStu);
                }
            }else {
                System.out.println("该学号已存在");
            }*/


           /* int index = getIndex(stu,1003);
            if(index >= 0){
                stu[index] = null;
                printStu(stu);
            }else {
                System.out.println("该学号不存在");
            }*/


            int index1 = getIndex(stu,1003);
            if(index1 >= 0){
                int newAge = stu[index1].getAge() + 1;
                stu[index1].setAge(newAge);
            }else {
                System.out.println("该学号不存在");
            }
            printStu(stu);


    }

    public static boolean exists(Student [] stu,int id){
        boolean flag = true;
        for (int i = 0; i < stu.length; i++) {
            if(stu[i] != null){
                if(stu[i].getId() == id){
                    System.out.println("该学号已存在");
                    flag = false;
                }
            }
        }
        return flag;
    }


    public static int getCount(Student[] stu){
        int count = 0;
        for (int i = 0; i < stu.length; i++) {
            if(stu[i] != null){
                count++;
            }
        }
        return count;
    }


    public static Student[] creatNewarr(Student[] stu){
        Student[] newStu = new Student[stu.length + 1];
        for (int i = 0; i < stu.length; i++) {
                newStu[i] = stu[i];
        }
        return newStu;
    }


    public static void printStu(Student[] stu){
        for (int i = 0; i < stu.length; i++) {
            if(stu[i] != null){
                System.out.println(stu[i].getName() + " " + stu[i].getAge() + " " + stu[i].getId());
            }
        }
    }

    public static int getIndex(Student[] stu,int id){

        for (int i = 0; i < stu.length; i++) {
            if(stu[i] != null){
                int sid = stu[i].getId();
                if (sid == id){
                    return i;
                }
            }
        }
        return -1;
    }



   /* public static boolean findId(Student[] stu,int id){
        for (int i = 0; i < stu.length; i++) {
            if(stu[i] != null){
                if(stu[i].getId() == id){
                    return true;
                }
            }
        }
        return false;
    }*/


}
