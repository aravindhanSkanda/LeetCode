class Solution {
    public int[] decode(int[] encoded) {
        int x=getXORforFirstNNos(encoded.length+1);
        int [] per= new int[encoded.length+1];
        per[0]=x;
        
        int j=1;
        while(j<encoded.length)
        {
            per[0]=per[0]^encoded[j];
            //System.out.println(per[0]+":"+j);
            j+=2;
        }
        
        int i=1;
        while(i<per.length)
        {
            per[i]=per[i-1]^encoded[i-1];  
            i++;
        }
        return per;
    }
    
    private int getXORforFirstNNos(int n)

    {
        if(n%4==1)
        {
            return 1;
        }
        else if(n%4==2)
        {
            return n+1;
        }
        else if(n%4==3)
        {
            return 0;
        }
        else
        {
            return n;
        }
    }
}