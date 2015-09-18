package net.avenwu.gradle.demo

import org.gradle.api.Plugin
import org.gradle.api.Project

class GradlePlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.task("Hello") << {
            println("Hello from Gradle plugin")
        }
    }
}