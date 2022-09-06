package src.Homework;

public class homework12 {
    public static void main(String[] args) {
        try {
            System.out.println(test.reverse("abcdef",-3,4));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class test {
    public static String reverse(String str,int start,int end){
        if(!(str!=null && start >0 && end > start && end<str.length()))
            throw new RuntimeException("参数不正确");

        char []chars = str.toCharArray();
        char []chars1 = chars.clone();
        for (int i = start,j = end; i <= end; i++,j--) {
            chars[i] = chars1[j];
        }
        str =String.valueOf(chars);
        return str;
    }
}