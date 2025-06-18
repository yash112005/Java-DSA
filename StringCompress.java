public class StringCompress {
    public static void main(String[] args) {
        String s = "abcdabcd";
        StringBuilder str= new StringBuilder();
        int count = 1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
            }
            else{
                str.append(s.charAt(i-1)).append(count);
                count = 1;
            }
        }

        System.out.println(str);
    }
}

















