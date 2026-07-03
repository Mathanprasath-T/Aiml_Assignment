class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> characters=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3!=0 && i%5!=0){
                characters.add(String.valueOf(i));
            }
             else if(i%3==0 && i%5==0){
                characters.add("FizzBuzz");
            }
            else if(i%3==0){
                characters.add("Fizz");
            }
            else if(i%5==0){
                characters.add("Buzz");
            }
           
            else{
                characters.add("Invalid");
            }
        }return characters;
    }
}