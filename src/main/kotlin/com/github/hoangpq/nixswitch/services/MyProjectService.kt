package com.github.hoangpq.nixswitch.services

import com.intellij.openapi.project.Project
import com.github.hoangpq.nixswitch.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
