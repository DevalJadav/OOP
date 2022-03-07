import java.util.*;

class emp {
    int no;
    String name;

    void getData(int N, String n) {
        no = N;
        name = n;
    }
    emp() {
        //Using user input
        int N;
        String n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your No. : ");
        N = sc.nextInt();

        System.out.println("Enter Your Name : ");
        n = sc.next();
        sc.close();
        getData(N, n);
    }

    void display() {
        System.out.println("No. : " +no);
        System.out.println("Name : " +name);
    }
}

class empDemo {
    public static void main(String[] args) {
        emp e1 = new emp();
        e1.display();
    }
}