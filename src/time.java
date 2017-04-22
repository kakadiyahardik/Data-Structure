import java.util.Scanner;

public class time {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		long str=System.currentTimeMillis();
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] genes = new String[n];
        for(int genes_i=0; genes_i < n; genes_i++){
            genes[genes_i] = sc.next();
        }
        int[] health = new int[n];
        for(int health_i=0; health_i < n; health_i++){
            health[health_i] = sc.nextInt();
        }
        int s = sc.nextInt();
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        int ans;
        for(int a0 = 0; a0 < s; a0++)
        {
            ans=0;
            int first = sc.nextInt();
            int last = sc.nextInt();
            String d = sc.next();
           
            int i=0,j=1;
            for(int p=0;p<d.length();p++)
            {
                for(int q=p;q<d.length();q++)
                {
                    
                    String tmp=d.substring(p,q+1);   
                
                    for(int k=first;k<=last;k++)
                    {
                        if(genes[k].equals(tmp))
                        {
                            ans+=health[k];
                            j++;
                          
                        }

                    }
                }
            }
            
            if(min>ans)
            {
                min=ans;
            }
            if(max<ans)
                max=ans;
           //System.out.println(ans);
            //System.out.println(tmp.substring(3,4));
        }
        System.out.println(min+" "+max);
		long e=System.currentTimeMillis();
		System.out.println(e-str);

	}

}
