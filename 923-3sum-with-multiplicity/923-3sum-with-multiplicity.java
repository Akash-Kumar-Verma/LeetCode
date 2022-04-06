class Solution {
   public int threeSumMulti(int[] arr, int target) {
        int mod = 1000000007;
        long result = 0;
        long a[] = new long[101];
        for (int i : arr) a[i]++;

        for (int i = 0; i <= 100; i++) {
            for (int j = i; j < 101; j++) {
                int k = target - i - j;
                if (k < 0 || k > 100) continue;
                if (i == j && j == k) {
                    result += ((a[i] * (a[i] - 1) * (a[i] - 2)) / 6);
                } else if (i == j && j != k) {
                    result += ((a[i] * (a[i] - 1)) / 2) * a[k];
                } else if(i<j && j<k){
                    result += ((a[i] * (a[j]) * (a[k])));
                }
            }
        }
        return(int)(result%mod);
    }
}