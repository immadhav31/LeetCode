class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            answer.add(GenerateRows(i));
        }
        return answer;
    }
    static List<Integer> GenerateRows(int N){
        int ans = 1;
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(ans);
        for(int i=1;i<N;i++){
            ans = ans * (N-i);
            ans = ans/i;
            ansRow.add(ans);
        }
        return ansRow;
    }
}