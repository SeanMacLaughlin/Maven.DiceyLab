import org.junit.Test;
import org.junit.Assert;

public class BinsTest {

        @Test
        public void binsTest() {
        // Given
        Bins myBin = new Bins(2,12);

        // When
        Integer actual = myBin.getBins(2);
        Integer expected = 0;
        // Then
        Assert.assertEquals(expected, actual);
    }
    @Test
            public void binsAddTest() {
            // Given
            Bins myBin = new Bins(2, 12);
            // When
                myBin.incrementBin(2);
                Integer expected = 1;
                Integer actual = myBin.getBins(2);
            //Then
            Assert.assertEquals(expected, actual);

    }

        @Test
        public void binsAddTest2() {
                // Given
                Bins myBin = new Bins(2, 12);
                // When
                myBin.incrementBin(2);
                myBin.incrementBin(2);
                Integer expectedValue = 2;
                Integer actualValue = myBin.getBins(2);
                //Then
                Assert.assertEquals(expectedValue, actualValue);
        }
}
