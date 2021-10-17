package org.jabref.preferences;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


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
        assertNotEquals(NewLineSeparator.CR, lf);
        assertNotEquals(NewLineSeparator.CR, crlf);
    }

    @Test
    public void verifyLF() {
        assertEquals(NewLineSeparator.LF, lf);
        assertNotEquals(NewLineSeparator.LF, cr);
        assertNotEquals(NewLineSeparator.LF, crlf);
    }
    @Test
    public void verifyCRLF() {
        assertEquals(NewLineSeparator.CRLF, crlf);
        assertNotEquals(NewLineSeparator.CRLF, cr);
        assertNotEquals(NewLineSeparator.CRLF, lf);
    }

    @Test
    public void verifyCRDisplayName() {
        assertEquals(NewLineSeparator.CR.getDisplayName(), crDisplayName);
        assertNotEquals(NewLineSeparator.CR.getDisplayName(), lfDisplayName);
        assertNotEquals(NewLineSeparator.CR.getDisplayName(), crlfDisplayName);
    }

    @Test
    public void verifyLFDisplayName() {
        assertEquals(NewLineSeparator.LF.getDisplayName(), lfDisplayName);
        assertNotEquals(NewLineSeparator.LF.getDisplayName(), crDisplayName);
        assertNotEquals(NewLineSeparator.LF.getDisplayName(), crlfDisplayName);
    }

    @Test
    public void verifyCRLFDisplayName() {
        assertEquals(NewLineSeparator.CRLF.getDisplayName(), crlfDisplayName);
        assertNotEquals(NewLineSeparator.CRLF.getDisplayName(), crDisplayName);
        assertNotEquals(NewLineSeparator.CRLF.getDisplayName(), lfDisplayName);
    }

    @Test
    public void verifyCRToString() {
        assertEquals(NewLineSeparator.CR.toString(), crToString);
        assertNotEquals(NewLineSeparator.CR.toString(), lfToString);
        assertNotEquals(NewLineSeparator.CR.toString(), crlfToString);
    }

    @Test
    public void verifyLFToString() {
        assertEquals(NewLineSeparator.LF.toString(), lfToString);
        assertNotEquals(NewLineSeparator.LF.toString(), crToString);
        assertNotEquals(NewLineSeparator.LF.toString(), crlfToString);
    }

    @Test
    public void verifyCRLFToString() {
        assertEquals(NewLineSeparator.CRLF.toString(), crlfToString);
        assertNotEquals(NewLineSeparator.CRLF.toString(), crToString);
        assertNotEquals(NewLineSeparator.CRLF.toString(), lfToString);
    }

    @Test
    public void verifyCRParse() {
        assertEquals(NewLineSeparator.CR, NewLineSeparator.parse(crToString));
        assertNotEquals(NewLineSeparator.CR, NewLineSeparator.parse(lfToString));
        assertNotEquals(NewLineSeparator.CR, NewLineSeparator.parse(crlfToString));
    }

    @Test
    public void verifyLFParse() {
        assertEquals(NewLineSeparator.LF, NewLineSeparator.parse(lfToString));
        assertNotEquals(NewLineSeparator.LF, NewLineSeparator.parse(crToString));
        assertNotEquals(NewLineSeparator.LF, NewLineSeparator.parse(crlfToString));
    }

    @Test
    public void verifyCRLFParse() {
        assertEquals(NewLineSeparator.CRLF, NewLineSeparator.parse(crlfToString));
        assertNotEquals(NewLineSeparator.CRLF, NewLineSeparator.parse(crToString));
        assertNotEquals(NewLineSeparator.CRLF, NewLineSeparator.parse(lfToString));
    }
}
