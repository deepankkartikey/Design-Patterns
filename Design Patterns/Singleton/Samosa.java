class Samosa {

    private static Samosa samosa;

    // private constructor - avoids creating new object
    private Samosa(){
    }

    // static method - so method can be accessed directly by class
    public static Samosa getSamosa(){
        // create object of class only once
        if(samosa == null){
            samosa = new Samosa();
        }
        return samosa;
    }
}
