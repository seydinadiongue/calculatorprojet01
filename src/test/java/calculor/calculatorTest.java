package calculor;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class calculatorTest {

     calculator  calculator;

     //methode qui permet d'instancier le constrcuteur

     @Before
     public void setUp() throws Exception{

         calculator=new calculator();
     }

    @Test

    //La methode de test de l'addition
    public void sub() {

        int resultat=calculator.sub(2,2);
        Assert.assertEquals(4,resultat);


    }

    @Test
    //La methode de test de la soustraction
    public void minus() {

        Assert.assertEquals(0, calculator.minus(2,2));
    }

    @Test
    //La methode de test de la multiplication
    public void multiply() {
        Assert.assertEquals(4, calculator.multiply(2,2));
    }


}