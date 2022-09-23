class Solution {
    public int singleNumber(int[] nums) {
        HashMap <Integer, Integer>map= new HashMap();
        for(int num:nums)
        {
        if(!map.containsKey(num))
        {
          map.put(num, 0);   
        }
         map.put(num, map.get(num)+1);   
        }
        
        Iterator <Integer> it = map.keySet().iterator();       //keyset is a method  
while(it.hasNext())  
{  
int key=(int)it.next();  
if(map.get(key)!=3)
{
    return key;
}
 
}  
        return 0;
    }
}