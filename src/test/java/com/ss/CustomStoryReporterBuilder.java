package com.ss;

import org.jbehave.core.reporters.StoryReporter;
import org.jbehave.core.reporters.StoryReporterBuilder;

public class CustomStoryReporterBuilder extends StoryReporterBuilder {
    @Override
    public StoryReporter build(String storyPath) {
        StoryReporter delegate = super.build(storyPath);
        return new CustomStoryReporter(delegate);
    }
}
