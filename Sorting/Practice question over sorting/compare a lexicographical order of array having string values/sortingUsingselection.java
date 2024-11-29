
public class sortingUsingselection{
    public static String[] Lexixo(String Fruits[]){

        for(int i = 0; i < Fruits.length; i++) {
            int Small = i;
            for (int j = i+1; j < Fruits.length; j++) {
                if(Fruits[j].compareTo(Fruits[Small]) < 0){     // compare to is string method if the vale get small small than arr[small] return negative value
                    Small = j;
                }
            }
            String temp = Fruits[Small];
            Fruits[Small] = Fruits[i];
            Fruits[i] = temp;
        }
        return Fruits;
    }

    public static void main(String arg[]){
        String Fruits[] ={ "Mango", "Graps", "Orange", "Papaya"};
        Lexixo(Fruits);
        for(String val : Fruits){
            System.out.print(val+" ");
        }
    }
}