package com.adient.iris.cucumber.stepdefs;

import com.adient.iris.IrisApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = IrisApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
