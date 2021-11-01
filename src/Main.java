public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.input();
        System.out.println(student1.toString());
        System.out.println("Diem trung binh: " + student1.averageScore());
    }
}
