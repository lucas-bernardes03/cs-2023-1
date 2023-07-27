package br.com.gilmarioarantes.validacpf.model;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class ValidaCPFTeste {

    private ValidaCPF validaCPF = new ValidaCPF();

    @Test
    public void testCPFValido() {
        assertTrue(validaCPF.isCPF("12345678909"));
        assertTrue(validaCPF.isCPF("52998224725"));
    }

    @Test
    public void testCPFInvalidos() {
        assertFalse(validaCPF.isCPF("12"));
        assertFalse(validaCPF.isCPF("00000000000"));
        assertFalse(validaCPF.isCPF("11111111111"));
        assertFalse(validaCPF.isCPF("22222222222"));
        assertFalse(validaCPF.isCPF("99999999999"));
        assertFalse(validaCPF.isCPF("123"));
        assertFalse(validaCPF.isCPF("123456789012"));
        assertFalse(validaCPF.isCPF("esseeumteste"));
        assertFalse(validaCPF.isCPF("invalidCPF"));
    }

    @Test
    public void testCPFCaracteresInvalidos() {
        assertFalse(validaCPF.isCPF("123.456.789-09"));
        assertFalse(validaCPF.isCPF("123-456-787-10"));
        assertFalse(validaCPF.isCPF("940_747_189_89"));
        assertFalse(validaCPF.isCPF("123,121,121.90"));
    }

    @Test
    public void testCPFCurto() {
        assertFalse(validaCPF.isCPF("12"));
        assertFalse(validaCPF.isCPF("1234567"));
        assertFalse(validaCPF.isCPF("1234"));
        assertFalse(validaCPF.isCPF("12345678"));
    }

    @Test
    public void testCPFLongo() {
        assertFalse(validaCPF.isCPF("12345678901234"));
        assertFalse(validaCPF.isCPF("123456789101"));
        assertFalse(validaCPF.isCPF("123456789012345"));
        assertFalse(validaCPF.isCPF("1234567890123451"));
    }
}