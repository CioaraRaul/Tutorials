package ro.uoradea;

//Create a Generic class which accepts String and Integer datatype at a time.
// Create a object for the same. Pass in 30 and "I love Generic types" has parameters.
// print the both in next next line

// Create a generic class here.
class Generic<I,S>{
    private I a;
    private S b;

    public Generic(I a, S b){
        this.a = a;
        this.b = b;
    }

    public I getA(){
        return a;
    }

    public S getB(){
        return b;}


}

public class GenericClass {

    public static void main(String[] args) {

        // Your code goes here
        Generic<Integer, String> test = new Generic (30, "I love Generic types");
        System.out.println(test.getA());
        System.out.println(test.getB());

    }

}