package de.ketarion.sfgdi.controllers;

import de.ketarion.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedContollerTest {


    SetterInjectedContoller controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedContoller();
        controller.setGreetingService(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }


}