class Solution {
    public List<String> fizzBuzz(int n) {
        String[] array = new String[n];
        for(int i=0;i<array.length;i++){
            if((i+1)%3==0 && (i+1)%5==0){
                array[i]="FizzBuzz";
            }
            else if((i+1)%3==0){
                array[i]="Fizz";
            }
            else if((i+1)%5==0){
                array[i]="Buzz";
            }
            else{
                array[i-1]=String.valueOf(i);
            }
        }
        List<String> list = Arrays.asList(array);
        return list;
    }
}
