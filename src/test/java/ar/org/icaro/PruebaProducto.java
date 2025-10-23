import ar.org.icaro.Matematica;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PruebaProducto {
    @Test
    public static void validaProductoPositivo() {
        Matematica m = new Matematica();
        Assert.assertEquals(m.producto(2, 3), 6);

    }

}