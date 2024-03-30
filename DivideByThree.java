
public class DivideByThree {
    public static void main(String[] args) {
        String inputNumber = "3635883959606670431112222".trim();
        int sum=0;
        for(int i=0;i<inputNumber.length();i++){
            sum+=inputNumber.charAt(i)-'0';

        }
        if(sum%3==0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
