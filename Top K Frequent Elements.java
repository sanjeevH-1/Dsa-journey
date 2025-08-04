
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i : nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
                
            }
            else{
                map.put(i,1);
            }
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());

        list.sort((a,b) -> b.getValue() - a.getValue()); 

        int arr[] = new int[k];
        for(int i=0;i<k;i++){
            arr[i]=list.get(i).getKey();
        }
        return arr;

        // List<Integer> list = new ArrayList<>(map.values());
        // //list = map.values();
        // Collections.sort(list);
        // int[] array = new int[k];
        // for( int i= 0;i<k;i++){
        //     array[i] = list.get(list.size()-i-1);
        // }

        // return array;


    }
}
