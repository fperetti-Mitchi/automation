import ar.org.icaro.Matematica;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PruebaSuma {
    @Test
    public static void validaSumaCero() {
        Matematica m = new Matematica();
        Assert.assertEquals(m.suma(0, 0), 0);

    }

    @Test
    public static void validaSumaPositiva() {
        Matematica m = new Matematica();
        Assert.assertEquals(m.suma(5, 5), 10);

    }

}