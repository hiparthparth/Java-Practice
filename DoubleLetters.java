public class DoubleLetters {
    public static void main(String args[]) {
        String s=" Doouble letterrz letters are prevalent!";
        int c=0;
        int pos=0;
        char k='0',l='0',p='0';
        boolean flag=true;
        for(int i=0;i<s.length();i++)
        {
            k=s.charAt(i);
            if(k==' ')
            {
                
                for(int i1=i+1;i1<s.length();i1++)
                {
                    if(s.charAt(i1)==' ')
                    {
                    pos=i1;
                    break;
                    }
                }
                flag=true;
                for(int i2=i+1;i2<pos;i2++)
                {
                    if(s.charAt(i2)==s.charAt(i2+1)&&flag==true)
                    {
                    c++;
                    flag=false;
                    }
                }
            }
        }
        System.out.println(c);
    }
}
