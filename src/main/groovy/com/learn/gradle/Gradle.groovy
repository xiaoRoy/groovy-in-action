package com.learn.gradle

def initProjectVersion(major, minor){
    new ProjectVersion(major, minor)
}

assert initProjectVersion(2, 1).class == ProjectVersion.class

def incrementMajorProjectVersion = {
    it.major ++
}
def projectVersion = initProjectVersion(1, 10)
incrementMajorProjectVersion(projectVersion)
assert projectVersion.major == 2
