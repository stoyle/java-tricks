package no.stoyle.strange;


public class NoNPE {
	
    static int fubar = 42;

    NoNPE getFoo() {
        return null;    
    }

    public static void main(String args[]) {
    	NoNPE foo = new NoNPE();
        System.out.println(foo.getFoo().fubar);
    }

}
