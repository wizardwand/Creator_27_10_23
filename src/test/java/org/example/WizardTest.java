package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WizardTest {

    @Test
    public void test_wizard_shirish_glasgow(){
        Wizard shirish = new Wizard("shirish", "glasgow");
        assertEquals("shirish", shirish.getName());
        assertEquals("glasgow",shirish.getAddress());
    }
}