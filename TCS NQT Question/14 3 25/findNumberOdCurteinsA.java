public class findNumberOdCurteinsA {

    public static void main(String arg[]){

        String str = "abaababbaabbaa";
        int n = str.length();
        int l = 4;
        int maxCount = 0;
        int count = 0;

//        String newStr = "";

        for(int i=0; i<n; i++){
//            newStr+=str.charAt(i);
//            int count = 0;
//            if(newStr.length() == l){
//                for(char curr : newStr.toCharArray()){
//                    if(curr == 'a') count++;
//                }
//                newStr = "";
//                maxCount = Math.max(maxCount, count);
//            }
            if(i % l == 0){
                maxCount = Math.max(maxCount, count);
                count=0;
            }
            if(str.charAt(i)=='a') count++;
        }

        maxCount = Math.max(maxCount, count);

        System.out.println(maxCount);
    }
}
