class Solution {
    public static ArrayList<Integer> alternateSort(int[] arr) {

        // Your code goes here
        int n=arr.length;
        Arrays.sort(arr);
        ArrayList<Integer> arrayList = new ArrayList<>();
        int j=n-1;
        for(int i=0;i<(n+1)/2;i++){
            if(j>i){
                arrayList.add(arr[j--]);
            }
            arrayList.add(arr[i]);
        }
        return arrayList;
    }
}
