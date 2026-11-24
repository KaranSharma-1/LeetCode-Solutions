class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int x:nums1){
            list.add(x);
        }
        for(int y:nums2){
            list.add(y);
        }
        Collections.sort(list);
        int s=0;
        int e=list.size();
        int mid=(s+e)/2;
        if(list.size()%2!=0){
            return list.get(mid);
        }
        return ((double)list.get(mid-1)+list.get(mid))/2;
    }
}