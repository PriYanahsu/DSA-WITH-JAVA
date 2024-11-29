public class Problems{

    public static Fraction add (Fraction f1, Fraction f2){
        int numerator = f1.num*f2.deno + f1.deno*f2.num;
        int denomenator = f1.deno*f2.deno;
        Fraction f3 = new Fraction(numerator, denomenator);
        return f3;
    }

    public static int gcd(int num, int deno){
        int min = Math.min(num, deno);
        for (int i = min; i > 1; i--) {
            if(num%i == 0 && deno%i == 0){
                return i;
            }
        }
        return min;
    }

    public static class Fraction{

        int num;
        int deno;

        public Fraction(int num, int deno){
            this.num = num;
            this.deno = deno;
            Simplify();
        }

        public void Simplify(){

            int hcf = gcd(num, deno);
            num /= hcf;
            deno /= hcf;
        }
    }

    public static void main(String args[]){

        Fraction F1 = new Fraction(21,28);
        System.out.println(F1.num +"/"+ F1.deno);

        Fraction F2 = new Fraction(7,5);
        System.out.println(F2.num +"/"+ F2.deno);

        Fraction F3 = add(F1,F2);
        System.out.println(F3.num +"/"+ F3.deno);
    }
}