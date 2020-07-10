public class ReduceTo1
{
	public static void main(String[] args) {
		String s="1101";
		System.out.println(solution(s));
	}

	public static int solution(String s)
	{
		Integer num=Integer.parseInt(s,2);
		int c=0;
		while(num!=1)
		{
			if(num%2==0)
			{
				c++;
				num=num/2;				
			}
			else if(num==1)
			{
				break;
			}
			else
			{
				c++;
				num=num+1;
			}
		}
		return c;
    }
}