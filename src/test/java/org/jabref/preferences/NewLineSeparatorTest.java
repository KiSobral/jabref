package org.jabref.preferences;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class NewLineSeparatorTest {
    private final NewLineSeparator cr = NewLineSeparator.CR;
    private final NewLineSeparator lf = NewLineSeparator.LF;
    private final NewLineSeparator crlf = NewLineSeparator.CRLF;

    private final String crDisplayName = "CR (\"\\r\")";
    private final String lfDisplayName = "LF (\"\\n\")";
    private final String crlfDisplayName = "CR/LF (\"\\r\\n\")";

    private final String crToString = "\r";
    private final String lfToString = "\n";
    private final String crlfToString = "\r\n";

    @Test
    public void verifyCR() {
        assertEquals(NewLineSeparator.CR, cr);
    }

    @Test
    public void verifyLF() {
        assertEquals(NewLineSeparator.LF, lf);
    }
    @Test
    public void verifyCRLF() {
        assertEquals(NewLineSeparator.CRLF, crlf);
    }

    @Test
    public void verifyCRDisplayName() {
        assertEquals(NewLineSeparator.CR.getDisplayName(), crDisplayName);
    }

    @Test
    public void verifyLFDisplayName() {
        assertEquals(NewLineSeparator.LF.getDisplayName(), lfDisplayName);
    }

    @Test
    public void verifyCRLFDisplayName() {
        assertEquals(NewLineSeparator.CRLF.getDisplayName(), crlfDisplayName);
    }

    @Test
    public void verifyCRToString() {
        assertEquals(NewLineSeparator.CR.toString(), crToString);
    }

    @Test
    public void verifyLFToString() {
        assertEquals(NewLineSeparator.LF.toString(), lfToString);
    }

    @Test
    public void verifyCRLFToString() {
        assertEquals(NewLineSeparator.CRLF.toString(), crlfToString);
    }

    @Test
    public void verifyCRParse() {
        assertEquals(NewLineSeparator.CR, NewLineSeparator.parse(crToString));
    }

    @Test
    public void verifyLFParse() {
        assertEquals(NewLineSeparator.LF, NewLineSeparator.parse(lfToString));
    }

    @Test
    public void verifyCRLFParse() {
        assertEquals(NewLineSeparator.CRLF, NewLineSeparator.parse(crlfToString));
    }
}
