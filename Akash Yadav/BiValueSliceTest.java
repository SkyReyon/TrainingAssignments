import java.util.*;
class BiValueSliceTest{
	public static void main(String[] args) 
	{
		int[] A={5,4,4,5,0,12};
		System.out.println(solution(A));
	}

	public static int solution(int[] A) 
	{
		ArrayList<Integer> l = new ArrayList<Integer>();
		int temp =0,i=0;
		int[] B = new int[2];
		B[0]=-1;B[1]=-1;
		
		for(;i<A.length;i++) 
		{
			if(B[0]==-1) 
			{
				B[0] = A[i];
			}

			else if(B[1]==-1) 
			{
				B[1] = A[i];
			}

			else 
			{

				if(B[0]!=A[i] && B[1]!=A[i]) 
				{
					l.add(i-temp);
					temp = i-1;
					int k = A[i-1];
					if(B[0]!=k) B[0]=A[i];
					else B[1]=A[i];
				}
			}
		}

		l.add(i-temp);
		return Collections.max(l);
	}

}