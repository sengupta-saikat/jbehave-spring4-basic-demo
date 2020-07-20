package com.ss;

import org.jbehave.core.model.Scenario;
import org.jbehave.core.model.Story;
import org.jbehave.core.reporters.StoryReporter;

public abstract class CustomStoryReporter implements StoryReporter {

    private StoryReporter delegate;

    public CustomStoryReporter(StoryReporter delegate) {
        this.delegate = delegate;
    }

    @Override
    public void beforeStory(Story story, boolean givenStory) {

    }

    @Override
    public void beforeScenario(Scenario scenario) {

    }

    @Override
    public void beforeStep(String step) {

    }
}
