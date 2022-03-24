import java.util.Arrays;

public class _2114_Maximum_Number_of_Words_Found_in_Sentences {
    public static int wordCount(String sentence) {
        int count = 0;
        char ch[] = new char[sentence.length()];
        for (int i = 0; i < sentence.length(); i++) {
            ch[i] = sentence.charAt(i);
            if ((i > 0 && ch[i] != ' ' && ch[i - 1] == ' ') || (ch[0] != ' ' && i == 0)) {
                count++;
            }
        }

        return count;

    }

    public static int mostWordsFound(String[] sentences) {
        int count[] = new int[sentences.length];
        int newCount = 0;
        for (int i = 0; i < sentences.length; i++) {
            count[i] = wordCount(sentences[i]);
        }
        newCount = largest(count);

        return newCount;
    }

    public static int largest(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    public static void main(String[] args) {
        String sentence[] = {"w jrpihe zsyqn l dxchifbxlasaehj","nmmfrwyl jscqyxk a xfibiooix xolyqfdspkliyejsnksfewbjom","xnleojowaxwpyogyrayfgyuzhgtdzrsyococuqexggigtberizdzlyrdsfvryiynhg","krpwiazoulcixkkeyogizvicdkbrsiiuhizhkxdpssynfzuigvcbovm","rgmz rgztiup wqnvbucfqcyjivvoeedyxvjsmtqwpqpxmzdupfyfeewxegrlbjtsjkusyektigr","o lgsbechr lqcgfiat pkqdutzrq iveyv iqzgvyddyoqqmqerbmkxlbtmdtkinlk","hrvh efqvjilibdqxjlpmanmogiossjyxepotezo","qstd zui nbbohtuk","qsdrerdzjvhxjqchvuewevyzlkyydpeeblpc"};
        int result = mostWordsFound(sentence);
        System.out.println();
        System.out.println(result);

    }
}
