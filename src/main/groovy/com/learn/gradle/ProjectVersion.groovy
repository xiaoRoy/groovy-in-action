package com.learn.gradle

class ProjectVersion {

    Integer major
    Integer minor

    ProjectVersion (Integer major, Integer minor) {
        this.major = major
        this.minor = minor
    }

    void increment(Closure closure){
        closure.resolveStrategy = Closure.DELEGATE_ONLY
        closure.delegate = this
        closure()
    }
}
