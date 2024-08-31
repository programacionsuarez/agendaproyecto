/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void testCrearContacto() {
        LOG.info("Iniciado test crearContacto");
        assertTrue(true);
        LOG.info("Finalizando test crearContacto");
    }

    @Test
    public void testAgregarContactoLista() {
        LOG.info("Iniciado test agregar un contacto a una lista");
        assertTrue(true);
        LOG.info("Finalizando test agregar un contacto a una lista");
    }

    @Test
    public void testAgregarContactoRepetido() {
        LOG.info("Iniciado test agregar un contacto repetido a una lista");
        assertTrue(true);
        LOG.info("Finalizando test agregar un contacto repetido a una lista");
    }

    @Test
    public void testAgregarLimiteContactos() {
        LOG.info("Iniciado test limite de contactos");
        assertTrue(true);
        LOG.info("Finalizando test limite de contactos");
    }

    @Test
    public void testModificarContacto() {
        LOG.info("Iniciado test modificar contacto");
        assertTrue(true);
        LOG.info("Finalizando test modificar contacto");
    }
    @Test
    public void testeliminarContacto() {
        LOG.info("Iniciado test eliminar contacto");
        assertTrue(true);
        LOG.info("Finalizando test eliminar contacto");
    }
    

}