public class objectClass {
    int a;
    int b;

    objectClass(int x, int y){
        a = x;
        b = y;
    }
    public void PrintArea(){
        int area = a * b;
        System.out.println(area); 
    }
    public static void main(String[] args) {
        objectClass obj1 = new objectClass(5,8);
        obj1.PrintArea();
    }
}
