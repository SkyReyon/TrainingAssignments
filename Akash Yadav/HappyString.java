public class HappyString
{
	public static void main(String[] args) {
		int a=1,b=1,c=7;
		String str =solution(a,b,c);
		System.out.println(str);
		
	}

	public static String solution(int a, int b, int c)
	{

		StringBuilder str = new StringBuilder();
		int strlen=a+b+c;
        int x=0,y=0,z=0; 
    
        for(int i=0;i<strlen;i++)    
        {
    
            if((a>=b && a>=c && x!=2)||(a>0 && (y==2||z==2)))
            {
                str.append("a");
                x++;
                y=0;
                z=0;
                a--;
            }
    
    
           else if((b>=a && b>=c && y!=2)||(b>0 && (x==2||z==2)))
           {
                str.append("b");
                y++;
                x=0;
                z=0;
                b--;
            }
    
    
            else if((c>=b && c>=a && z!=2)||(c>0 && (y==2||x==2)))
            {
                str.append("c");
                z++;
                x=0;
                y=0;        
                c--;        
            }
        }
    
    return str.toString();
  
	}
}