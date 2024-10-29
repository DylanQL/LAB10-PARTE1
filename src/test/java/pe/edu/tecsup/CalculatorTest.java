package pe.edu.tecsup;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
class CalculatorTest {

    private static final Logger log = LogManager.getLogger(CalculatorTest.class);


    @BeforeAll
    static void initAll() {
        Configurator.setRootLevel(org.apache.logging.log4j.Level.INFO);
        log.info("initAll()....!");
    }


    @AfterAll
    static void finishAll() {
        log.info("finishAll()....!");
    }


    @BeforeEach
    void beforeTest() {
        log.info("beforeTest()....!");
    }


    @AfterEach
    void afterTest() {
        log.info("afterTest()....!");
    }


    @Test
    void sub() {

        log.info("sub()....!");

        final int EXPECTED = 1;


        // process
        Calculator app = new Calculator();
        int actual = app.sub(4, 3);


        //validate
        assertEquals(EXPECTED, actual);

    }

    @Test
    void add() {

        log.info("add()....!");

        final int EXPECTED = 7;


        // process
        Calculator app = new Calculator();
        int actual = app.add(4, 3);


        //validate
        assertEquals(EXPECTED, actual);

}

    @Test
    void multi() {
        log.info("multi()....!");

        final int EXPECTED = 6;
        //process
        Calculator app = new Calculator();
        int actual = app.multi(2, 3);
        //validate
        assertEquals(EXPECTED, actual);

    }

    @Test
    void div() {
        log.info("div()....!");

        final int EXPECTED = 12;
        //process
        Calculator app = new Calculator();
        int actual = app.div(24, 2);
        //validate
        assertEquals(EXPECTED, actual);



    }
}
