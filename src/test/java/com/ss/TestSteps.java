package com.ss;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestSteps {

    @Autowired
    private AppService service;

    private int result;
    private int x;

    @Given("a variable x with value $value")
    public void givenXValue(@Named("value") int val) {
        this.x = val;
    }

    @When("I multiply x by $value")
    public void whenMultiplyXBy(@Named("value") int val) {
        result = this.service.multiply(this.x, val);
    }

    @Then("result should equal $value")
    public void thenXShouldBe(@Named("value") int val) {
        if (val != this.result)
            throw new RuntimeException("result is " + result + ", but should be " + val);
    }
}
