package gen;


public class Main {

    public static void main(String[] args) {
        // Collect user input as a Person object
        Person person = UserInput.collectUserInput();
//        Person prePerson = new Person("Person", "test", "2004-11-22", "M", 510, "test", "test", "testt", "Tetst", "12312312");;
        Encode encoder = new Encode();
        
        
        
        // Generate ANSI code using AnsiiGEN
        AnsiiGEN ansiiGEN = new AnsiiGEN();
        ansiiGEN.generateANSI(person);
        
        String ansi = ansiiGEN.getAnsiCode();
        
        encoder.generateBarcode(ansi);

        
        
        
        // Print the ANSI code
        System.out.println("\nGenerated ANSI Code:");
        System.out.println(ansiiGEN.getAnsiCode());
        
        
        
        
       
        
    }
}
