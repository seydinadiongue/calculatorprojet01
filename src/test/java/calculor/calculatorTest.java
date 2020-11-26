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
    @Test
    public void divide() {
        int result= (int) calculator.divide(6,3);
        Assert.assertEquals(2,result);
    }
    // @Test(expected = ArithmeticException.class)
    // public void divideWiththrowExeption() {
    //    calculator.divide(6,0);
    //}

    @Test
    public void min() {
        int min=calculator.min(10,20);
        if (min !=10) Assert.fail();
    }

    @Test
    public void max() {
        int max=calculator.max(2000,-2000);
        Assert.assertEquals(2000,max);




    }
    @Test
    public void minElement() {
         int tab[]={
              1,4,7,9
         };
         int a=calculator.minElement(tab);
         Assert.assertEquals(1,a);

    }

    @Test
    public void maxElement() {
        int tab[]={
                1,4,7,9
        };
        int a=calculator.maxElement (tab);
        Assert.assertEquals(9,a);

    }

    }