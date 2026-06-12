class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int[] arr=new int[2*nums.length];
        int idx=0;
        for(int i=0;i<2;i++){
            for(int num : nums ){
                arr[idx++] =num;
            }
        }return arr;

    }
}