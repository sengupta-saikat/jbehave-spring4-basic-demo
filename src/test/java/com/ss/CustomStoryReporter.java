package com.ss;

import org.jbehave.core.model.*;
import org.jbehave.core.reporters.StoryReporter;

import java.util.List;
import java.util.Map;

public class CustomStoryReporter implements StoryReporter {

    private StoryReporter delegate;

    public CustomStoryReporter(StoryReporter delegate) {
        this.delegate = delegate;
    }

    @Override
    public void storyNotAllowed(Story story, String filter) {

    }

    @Override
    public void storyCancelled(Story story, StoryDuration storyDuration) {

    }

    @Override
    public void beforeStory(Story story, boolean givenStory) {
        delegate.beforeStory(story, givenStory);
    }

    @Override
    public void afterStory(boolean givenOrRestartingStory) {

    }

    @Override
    public void narrative(Narrative narrative) {

    }

    @Override
    public void lifecyle(Lifecycle lifecycle) {

    }

    @Override
    public void scenarioNotAllowed(Scenario scenario, String filter) {

    }

    @Override
    public void beforeScenario(Scenario scenario) {

    }

    @Override
    public void beforeScenario(String scenarioTitle) {

    }

    @Override
    public void scenarioMeta(Meta meta) {

    }

    @Override
    public void afterScenario() {

    }

    @Override
    public void beforeGivenStories() {

    }

    @Override
    public void givenStories(GivenStories givenStories) {

    }

    @Override
    public void givenStories(List<String> storyPaths) {

    }

    @Override
    public void afterGivenStories() {

    }

    @Override
    public void beforeExamples(List<String> steps, ExamplesTable table) {

    }

    @Override
    public void example(Map<String, String> tableRow) {

    }

    @Override
    public void afterExamples() {

    }

    @Override
    public void beforeStep(String step) {

    }

    @Override
    public void successful(String step) {

    }

    @Override
    public void ignorable(String step) {

    }

    @Override
    public void comment(String step) {

    }

    @Override
    public void pending(String step) {

    }

    @Override
    public void notPerformed(String step) {

    }

    @Override
    public void failed(String step, Throwable cause) {

    }

    @Override
    public void failedOutcomes(String step, OutcomesTable table) {

    }

    @Override
    public void restarted(String step, Throwable cause) {

    }

    @Override
    public void restartedStory(Story story, Throwable cause) {

    }

    @Override
    public void dryRun() {

    }

    @Override
    public void pendingMethods(List<String> methods) {

    }
}
