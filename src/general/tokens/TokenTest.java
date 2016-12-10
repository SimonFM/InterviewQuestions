package general.tokens;

/**
 * Created by simon on 10/12/2016.
 */
public class TokenTest {

    public static void main(String[] args){
        Token token = new Token("Hello My,name:is;Simon.Markham?");
        token.generateTokens();
        Token token1 = new Token("Hello My name is;Simon.Markham?");
        token1.generateTokens();
    }
}
