package com.learn.gradle

def initProjectVersion(major, minor){
    new ProjectVersion(major, minor)
}

assert initProjectVersion(2, 1).class == ProjectVersion.class
