// import java.util.Random;
import java.util.Scanner;

public class HammingCodeNew {
    public static int BinaryToInteger(String msg)
    {
        int size=0, pow=0;
        char ch;
        for (int i = 0; i < msg.length() ; i++) {
            ch=msg.charAt(i);
            if(ch=='1'){
                size += Math.pow(2,pow);
            }
            pow++;
        }
        return size;
    }

    public static char getParity(int loc, String data){
        int parity=0;
        
        System.out.print("\n P" + loc + " : ");
        for (int i = loc; i <= data.length(); i+=loc) {
            for (int j = 1; j <= loc && i<=data.length(); j++) {
                System.out.print(data.charAt(i-1) + " ");
                if (data.charAt(i-1)=='1') {
                    parity++;
                }
                i++;
            }
        }
        System.out.println("| "+ parity + " = "+parity%2);

        if(parity%2==0){
            return '0';
        }
        else{
            return '1';
        }
    }

    public static String generateCodeword(String dw) { 
        int m=0, r=0, index=dw.length();
        String cw = new String();
        String pw = new String();
        boolean found=false;
        
        m = dw.length();
        while(!(Math.pow(2, r)>=m+r+1)){
            r++;
        }
        System.out.println(" No of parity bits : "+r+"\n");

        int arr[]=new int[r];
        for (int i = 0; i < r; i++) {
            arr[i] =  (int)Math.pow(2, i);
        }
        
        for (int i = 0; i < m+r; i++) {
            for (int j : arr) {
                if (j-1==i) {
                    pw += '_';
                    found = true;
                    break;
                }
            }
            if(!found){
                pw += dw.charAt(--index);
            }
            found=false;
        }
        
        System.out.println(" Calculating Parity Bits......");
        for (int i = 0; i < pw.length(); i++) {
            if(pw.charAt(i)=='_'){
                cw = (char)getParity(i+1, pw)  + cw;
            }else{
                cw = pw.charAt(i) + cw;
            }
        }

        System.out.print("\n Code Word : ");
        for (char c : cw.toCharArray()) {
            System.out.print(c + " ");
        }

        return cw;
    }
    
    public static String sender(){
        Scanner sc = new Scanner(System.in);
        String dataword = new String();
        String cw;

        /* DATAWORD INPUT FROM USER */
        do{
            System.out.print("\n Enter a dataword : ");
            dataword = sc.nextLine();
            if(dataword.length()<7){
                System.out.println("\n Dataword cannot be of less than 8 bits !! ");
            }
        }while(dataword.length()<7);

        System.out.println("\n =================================================");
        System.out.println("                 SENDER SIDE");
        System.out.println(" -------------------------------------------------");
        cw = generateCodeword(dataword);
        System.out.println("\n =================================================");
        return cw;
    }

    public static void reciever(String codeword) {
        int m=codeword.length(), r=1, index=0, err_loc=-1;
        Scanner sc = new Scanner(System.in);
        boolean found=false, iserror=false;
        String data = new String();
        String rev_cw = new String();
        String word = codeword;
        String binary_str = "";

        while(Math.pow(2, r)<=m+r){
            r++;
        }

        int arr[]=new int[r];
        char err[]=new char[r];

        for (int i = 0; i < r; i++) {
            arr[i]=  (int)Math.pow(2, i);
        }

        System.out.println("\n\n\n =================================================");
        System.out.println("               RECEIVER SIDE");
        System.out.println(" -------------------------------------------------");
        /*====================================================================================================*/
        /* GENERATING ERROR BASED ON CONDITION */
        for (int i = codeword.length()-1; i >=0 ; i--) {
            data+=codeword.charAt(i);
        }

        codeword = "";
        iserror=true;
        System.out.print("\nEnter position to generate error : ");
        err_loc = sc.nextInt();
        // err_loc=5;
        System.out.println("\n Generating error at position number "+err_loc+".");

        for(int i=0; i<data.length(); i++){
            if(i+1==err_loc){
                if(data.charAt(i)=='1'){
                    codeword += '0';
                }
                else{
                    codeword += '1';
                }
            }
            else{
                codeword += data.charAt(i);
            }

        }
        System.out.print("\n Code Word with having ERROR is : ");
        for (int i = codeword.length()-1; i >=0 ; i--) {
            System.out.print(codeword.charAt(i) + " ");
        }
        System.out.println();
        data=codeword;
        
        for (int i = 1; i <= codeword.length(); i++) {
            for (int ch : arr) {
                if( ch==i ){
                    found=true;
                    err[index++] = (char)getParity(i, data);
                    break;
                }
            }
        }

        for (char c : err) {
            binary_str += c;
        }
        err_loc = BinaryToInteger(binary_str);
        
        if(iserror)
            System.out.println("\n Error at bit position "+err_loc);

        data=codeword;
        codeword="";
        for (int i = 0; i < data.length(); i++) {
            if( i+1==err_loc ){
                if( data.charAt(i)=='1' ){
                    codeword = '0' + codeword;
                }
                else{
                    codeword = '1' + codeword;
                }
            }
            else{
                codeword = data.charAt(i) + codeword;
            }
        }

        System.out.print("\n Received Code Word is : ");
        for (char c : codeword.toCharArray()) {
            System.out.print(c+" ");
        }
        System.out.println("\n =================================================");
    }
    
    public static void main(String[] args) {
       String codeword = new String();
        codeword = sender();
        reciever(codeword);
    }
}



