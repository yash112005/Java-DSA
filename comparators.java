import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//class Student implements Comparable<Student>{
//    int age;
//    String name;
//    public Student(int age,String name){
//        this.age= age;
//        this.name  = name;
//    }
//    public String toString(){
//        return age + " " + name;
//    }
//    public int compareTo(Student s){
//        return this.age-s.age;
//    }
//
//
//}

class Students{
    int rollno;
    int age;
    String name;
    public Students(int rollno,int age,String name){
        this.rollno = rollno;
        this.age = age;
        this.name = name;
    }
    public String toString(){
        return rollno + " " + age + " "+ name;
    }
}
 class Sortname implements Comparator<Students> {
    public int compare(Students s1,Students s2){
        return s1.name.compareTo(s2.name);
    }
}
class Sortrollno implements Comparator<Students> {
    public int compare(Students s1, Students s2) {
        return Integer.compare(s1.rollno, s2.rollno);
    }
}

class Sortage implements Comparator<Students> {
    public int compare(Students s1, Students s2) {
        return Integer.compare(s1.age, s2.age);
    }
}


class Comparators {
    public static void main(String[] args) {

//        ArrayList<Student> list = new ArrayList<>();
//        list.add(new Student(15,"mohan"));
//        list.add(new Student(14,"aryan"));
//        list.add(new Student(12,"vivan"));
//        Collections.sort(list);
//        for(Student s : list){
//            System.out.println(s.toString());
//        }


//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(6);
//        list.add(5);
//        list.add(9);
//        list.add(3);
//        System.out.println("Array list : " + list);
//        Collections.sort(list);
//        System.out.print("after sorting : " + list);

        ArrayList<Students>lists = new ArrayList<>();
        lists.add(new Students(1,16,"mohan"));
        lists.add(new Students(2,14,"rohit"));
        lists.add(new Students(3,10,"vivan"));
        System.out.println("-----sort by name-----");
        Collections.sort(lists,new Sortname());
        for(Students s : lists){
            System.out.println(s);
        }
        System.out.println();
        System.out.println("----sort by roll no-----");
        Collections.sort(lists,new Sortrollno());
        for(Students s : lists){
            System.out.println(s);
        }
        System.out.println();
        System.out.println("----sort by age-----");
        Collections.sort(lists,new Sortage());
        for(Students s : lists){
            System.out.println(s);
        }





    }
}