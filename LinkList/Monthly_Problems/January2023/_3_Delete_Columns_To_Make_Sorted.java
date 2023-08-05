package Monthly_Problems.January2023;

public class _3_Delete_Columns_To_Make_Sorted {
    public static int minDeletionSize(String strs[]){
        int count = 0;
        for(int i=0; i<strs[0].length(); i++){
            for(int j=0; j<strs.length-1; j++){
                if(strs[j].charAt(i) > strs[j+1].charAt(i)){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String strs[] = {"cba","daf","ghi"};
        System.out.println(minDeletionSize(strs));
    }
}
