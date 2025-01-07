public class LargestString{
    public static void main(String args[]){
        String fruits[] = {"mango","orange","vanilla", "banana", "apple"};
        LargestString(fruits);
    }

    static void LargestString(String fruits[]){
        String large = fruits[0];
        for(int i=1; i<fruits.length; i++){
            if(large.compareTo(fruits[i]) < 0){
                large = fruits[i];
            }
        }
        System.out.println("Largest String is: "+ large);
    }
}
// Time Complexity: Due to CompareTo method
// it compare each character so
// TC : O(x*n)