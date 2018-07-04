public class SillyVowels {
    public static void main(String args[]) {
        String s="problem";
        String f="";
        char a='0';
        int l=0;
        for(int i=0;i<s.length();i++)
        {
            a=s.charAt(i);
            if(a==65||a==69||a==73||a==79||a==85||a==97||a==101||a==105||a==111||a==117)
            {
                l=i;
                for(int i1=i;i1<s.length();i1++)
                    f+=s.charAt(i1);
                break;
            }
        }
        for(int i2=0;i2<l;i2++)
            f+=s.charAt(i2);
        System.out.println(f+"ay");
    }
}
