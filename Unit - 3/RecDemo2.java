class rectangle2 {
    float lenght, width;    
}

class RecDemo2 {
    public static void main(String[] args) {
        rectangle2 r1=new rectangle2();
        r1.lenght = 34.5f;
        r1.width = 78.4f;
        System.out.println("Length = " +r1.lenght);
        System.out.println("Width = " +r1.width);


        rectangle2 r2=new rectangle2();
        r2.lenght = 50.0f;
        r2.width = 100.0f;
        System.out.println("Length = " +r2.lenght);
        System.out.println("Width = " +r2.width);
    }
}