/**
 * Created by Fabian on 02/06/2017.
 */
public class Main {

    private static String PATTERN_EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    private static String[] emails;

    public static void main(String[] args) {

        setEmails();

        for ( String s : emails ) {
            if( validarEmail( s ) ){
                System.out.println( "La direccion: " + s + " , es correcta");
            }else{
                System.out.println( "La direccion: " + s + " , es incorrecta");
            }
        }
    }

    private static boolean validarEmail( String email ) {

        if( email.matches( PATTERN_EMAIL ) ){
            return true;
        }
        return false;
    }

    private static void setEmails() {
        emails = new String[] { "test@example.com",
                "test-101@example.com", "test.101@yahoo.com",
                "test101@example.com", "test_101@example.com",
                "test-101@test.net", "test.100@example.com.au", "test@e.com",
                "test@1.com", "test@example.com.com", "test+101@example.com",
                "101@example.com", "test-101@example-test.com", "example", "example@.com.com",
                "exampel101@test.a", "exampel101@.com", ".example@test.com",
                "example**()@test.com", "example@%*.com",
                "example..101@test.com", "example.@test.com",
                "test@example_101.com", "example@test@test.com",
                "example@test.com.a5" };
    }
}
