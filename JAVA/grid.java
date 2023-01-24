public class grid {
    public static void main(String[] args) {
       int[][] input = {{3, 3}, {6, 5}, {15, 15}};
       for (int[] num : input) {
          Instant start = Instant.now();
          int result = new grid().numberOfPaths(num[0], num[1]);
          Instant finish = Instant.now();
          long timeElapsed = Duration.between(start, finish).toMillis();
          System.out.println("Total Number of paths for grid(" + num[0]+","+num[1] + ") = " + result + ",Total time taken = " + timeElapsed);
       }
    }   
    public int numberOfPaths(int m, int n){
       int[][] dp = new int[m][n];
       dp[0][0] = 1;
       for(int i=0; i<m; i++){
          for(int j=0; j<n; j++){
              if(i+1 < m){
                 dp[i+1][j] += dp[i][j];
              }
              if(j+1 < n){
                 dp[i][j+1] += dp[i][j];
              }
          }
       }
       return dp[m-1][n-1];   
    }
 }