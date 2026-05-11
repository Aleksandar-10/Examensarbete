import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DogCodeTest {

    DogCode dogCode = new DogCode();

    // PASSING TESTS

    @Test
    void testLabradorCode() {
        assertEquals("SK01", dogCode.getCode("labrador"));
    }

    @Test
    void testBulldogCode() {
        assertEquals("SK02", dogCode.getCode("bulldog"));
    }

    @Test
    void testBeagleCode() {
        assertEquals("SK04", dogCode.getCode("beagle"));
    }

    @Test
    void testGermanShepherdCode() {
        assertEquals("SK06", dogCode.getCode("german shepherd"));
    }

    @Test
    void testDalmatianCode() {
        assertEquals("SK08", dogCode.getCode("dalmatian"));
    }


    // FAILING TESTS (intentional)

    @Test
    void testPoodleCode() {
        assertEquals("SK03", dogCode.getCode("poodle"));
    }

    @Test
    void testRottweilerCode() {
        assertEquals("SK05", dogCode.getCode("rottweiler"));
    }

    @Test
    void testHuskyCode() {
        assertEquals("SK07", dogCode.getCode("husky"));
    }

    @Test
    void testPoodleBreed() {
        assertEquals("Poodle", dogCode.getBreed("SK03"));
    }

    @Test
    void testRottweilerBreed() {
        assertEquals("Rottweiler", dogCode.getBreed("SK05"));
    }
}