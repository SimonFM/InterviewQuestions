package general.tokens;

/**
 * Created by simon on 10/12/2016.
 */
public class Token {
    private String token;
    private String regex = "[ ,\\t\\:\\.\\;]";

    public Token(String token){
        this.token = token;
    }

    void generateTokens(){
        String[] tokens = token.split(regex);

        for(String t : tokens){
            System.out.println(t);
        }

    }
}
