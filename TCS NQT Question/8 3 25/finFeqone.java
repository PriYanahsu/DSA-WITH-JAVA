public class finFeqone {

    public static void main(String arg[]){
        String str = "priaanshuoiwiewp99855wasjjkl";

        findFreq(str);
    }

    private static void findFreq(String str) {

        int [] arr = new int [256];

        for(char c : str.toCharArray()){
            arr[c]++;
        }

        for(int i=0; i<256; i++){
            if(arr[i]>0){
                System.out.println((char)i + " -> " + arr[i]);
            }
        }
    }
}
