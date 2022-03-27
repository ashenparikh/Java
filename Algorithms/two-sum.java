class Solution {
    public int[] twoSum(int[] nums, int target) {
         HashMap<Integer,Integer> map = new HashMap<>();
        //Below is statically defined array list
       //  Arraylist[] array = new Arraylist();
       //Below is statically defined list of arrays
        //  List<ArrayList<Integer>> a = new ArrayList<>();
         for (int i=0; i< nums.length; i++) {
             int compliment = target - nums[i];
             if (map.containsKey(compliment)) {
                // ArrayList<Integer> al1 = new ArrayList<Integer>();
                 return new int[] {map.get(compliment), i};
             }
             map.put(nums[i],i);            
         }
         return null;
     }
 }
 
 
 // ArrayList array = new ArrayList();
 // array.add(new ArrayList());
 // array.add(new ArrayList());
 // ((ArrayList)array.get(0)).add(new ArrayList());