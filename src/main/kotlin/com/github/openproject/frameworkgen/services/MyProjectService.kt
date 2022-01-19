package com.github.openproject.frameworkgen.services

import com.intellij.openapi.project.Project
import com.github.openproject.frameworkgen.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
