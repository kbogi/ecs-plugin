package com.github.kbogi.ecsplugin.services

import com.intellij.openapi.project.Project
import com.github.kbogi.ecsplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
