public class Capitalize {
    public static void main(String args[]) {
        String inst="This is a sentence";
        String fina="";
        inst=" "+inst;
        char i='0';
        char i2='0';
        int i3=0;
        for(int con=0; con<inst.length();con++)
        {
            i=inst.charAt(con);
            if(con<=22)
            i2=inst.charAt(con+1);
            if(i==' ')
            {
                if(i2>='a' && i2 <='z')
                {
                    i2-=32;
                    fina+=i2;
                    con++;
                }
            }
            else if(i2==' ')
            fina+=i+" ";
            else
            fina+=i;
        }
        System.out.println(fina);
    }
}
