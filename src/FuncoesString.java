
public class FuncoesString {

    public static void main(String[] args) {

        String original = " tayane DA silva SOUZA ";
        
        String s1 = original.toLowerCase();
        String s2 = original.toUpperCase();
        String s3 = original.trim();
        String s4 = original.substring(8);
        String s5 = original.substring(8,10);
        String s6 = original.replace('a','x');
        String s7 = original.replace("tayane","thay");
        int i = original.indexOf("a");
        int j = original.lastIndexOf("a");
       
        System.out.println("Original: -" + original + "-" );
        System.out.println("toLowerCase: " + s1 + "-");
     
        System.out.println("\nOriginal: -" + original + "-");
        System.out.println("toUpperCase: " + s2 + "-" );
        
        System.out.println("\nOriginal: -" + original + "-" );
        System.out.println("trim: -" + s3 + "-" );//removeu os espaços dos cantos
        
        System.out.println("\nOriginal: -" + original + "-");
        System.out.println("substring(7): " + s4 + "-" );
        
        System.out.println("\nOriginal: -" + original + "-");
        System.out.println("substring(8,10): -" + s5 + "-" );
        
        
        System.out.println("\nOriginal: -" + original + "-");
        System.out.println("replace('a','x'): -" + s6 + "-" );
        
        System.out.println("\nOriginal: -" + original + "-");
        System.out.println("replace: -" + s7 + "-" );
        
        
        System.out.println("Index of 'a': " + i); 
        System.out.println("Last index of 'a': " + j);
    }

}
