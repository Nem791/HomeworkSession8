import java.util.Scanner;

public class Student {
    String id;
    String name;
    double dlt;
    double dth;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap id sinh vien: ");
        this.id = sc.nextLine();
        System.out.print("Nhap ten sinh vien: ");
        this.name = sc.nextLine();
        System.out.print("Nhap diem ly thuyet: ");
        this.dlt = sc.nextDouble();
        System.out.print("Nhap diem thuc hanh: ");
        this.dth = sc.nextDouble();
    }

    public double averageScore() {
        double average = (this.dlt + this.dth) / 2;
        return average;
    }

    @Override
    public String toString() {
        return "Student: " +
                "id= " + id +
                ", name= " + name +
                ", dlt=" + dlt +
                ", dth= " + dth;
    }
}
