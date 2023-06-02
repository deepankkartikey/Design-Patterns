public class SingletonExample {
    public static void main(String[] args) {

        // Lazy Initialization - Lazy way to crete Singleton object
        // object only gets created when getSamosa() is called
        // NOT THREAD-SAFE - make getSamosa() synchronized or add a synchronized block to the method
        // say 2 threads T1, T2 work on Samosa class
        // both will create a new instance and return different objects
        Samosa samosa1 = Samosa.getSamosa();
        System.out.println("Samosa1: " + samosa1.hashCode());
        Samosa samosa2 = Samosa.getSamosa();
        System.out.println("Samosa2: " + samosa2.hashCode());

        // Eager Initialization - Object gets created EVEN IF getJalebi() is not called
        // OBJECT CREATION HAPPENS AT CLASS LOADING itself !!!
        // NOT GOOD FOR HUGE PROJECTS
        // Objects get created even when they are not needed
        Jalebi jalebi1 = Jalebi.getJalebi();
        System.out.println("Jalebi1: " + jalebi1.hashCode());
        Jalebi jalebi2 = Jalebi.getJalebi();
        System.out.println("Jalebi2: " + jalebi2.hashCode());
    }
}
