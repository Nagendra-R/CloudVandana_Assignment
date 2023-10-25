package CloudVandana;

public class Pangram {
    public static void  main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwxyz";
        int[] arr= new int[26];
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>=97 && str.charAt(i)<=122) {
                arr[str.charAt(i) - 97] = 1;
            }
        }
        int a=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==0){
                System.out.println("NOt a panagram");
                a=1;
                break;
            }
        }
        if(a==0){
            System.out.println("YES, It's a panagram");
        }

    }
}
