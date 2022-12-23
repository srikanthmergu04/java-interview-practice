package practice;

import org.junit.Test;
import org.junit.Assert;

public class JavaPracticeTest {

    @Test
    public void testMaxRepeating(){

       // JavaPractice.mostRepeating("")

        Assert.assertEquals(JavaPractice.mostRepeating("testing"),'t');
        Assert.assertEquals(JavaPractice.mostRepeating("tester"),'t');
        Assert.assertEquals(JavaPractice.mostRepeating("I am a tester"),'a');
        Assert.assertEquals(JavaPractice.mostRepeating("black tee shirt"),'t');

    }

}
