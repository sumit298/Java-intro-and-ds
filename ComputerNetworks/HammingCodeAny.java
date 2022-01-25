import java.util.Scanner;

public class HammingCodeAny {   
    public static void SenderSide(){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int count = 0;
        int codeword[] = new int[size];
        int r = 3;
        boolean resultCodeword = (int)Math.pow(2, r) >= codeword.length + r + 1;
        // System.out.println(resultCodeword);
        for(int index = 0; index< codeword.length; index++){
            if(count==0){
                codeword[index] = scan.nextInt();
                count++;
            }
            else{

                codeword[(int)Math.pow(2, count)] = scan.nextInt();
                count++;
            }
        }

        for(int index = 0; index< codeword.length; index++){

            System.out.print(codeword[index]  + " ");
        }

        
    }
    public static void main(String[] args) {
        SenderSide();
    }
}
