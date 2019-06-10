import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer = new Printer(100, 70);

    @Test
    public void printerWillPrintIfEnoughPaper(){
        assertEquals("You have 50 paper remaining and 20 toner remaining", this.printer.print(10, 5));
    }

    @Test
    public void printerWillNotPrintIfNotEnoughPaper(){
        assertEquals("Not enough paper!", this.printer.print(10, 50));
    }
}

