package com.learn.gradle

def initProjectVersion (major, minor) {
    new ProjectVersion(major, minor)
}

assert initProjectVersion(2, 1).class == ProjectVersion.class

def incrementMajorProjectVersion = {
    it.major++
}
def projectVersion = initProjectVersion(1, 10)
incrementMajorProjectVersion(projectVersion)
assert projectVersion.major == 2


def incrementMajorProjectVersionExplicit = { ProjectVersion version -> version.major++ }
def projectVersionB = initProjectVersion(1, 10)
incrementMajorProjectVersionExplicit(projectVersionB)
assert projectVersionB.major == 2
