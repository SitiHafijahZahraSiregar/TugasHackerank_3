import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String str1 = input.nextLine();
        String str2 = input.nextLine();
        int angka = str1.indexOf(str2);
        if(angka >= 0){
            System.out.println("Ya");
        }else{
            System.out.println("Tidak");
        }
        input.close();
    }
}
