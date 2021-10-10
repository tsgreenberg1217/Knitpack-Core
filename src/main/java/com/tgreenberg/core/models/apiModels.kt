package com.tgreenberg.core.models

data class ProjectTxt(
    val name: String, val steps: List<String>, val level: String
)

data class UIKnittingProject(
    var name: String = "",
    var notes: String = "",
    var description:String = "",
    var pattern: String = "",
    var yarn:String = "",
    var needles:String = ""
)