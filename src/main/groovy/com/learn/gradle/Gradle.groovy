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

def setFullProjectVersion = { anotherProjectVersion, major, minor ->
    anotherProjectVersion.major = major
    anotherProjectVersion.minor = minor
}

def projectVersionC = initProjectVersion(1, 10)
setFullProjectVersion(projectVersionC, 2, 1)
assert projectVersionC.major == 2
assert projectVersionC.minor == 1

def projectVersionD = initProjectVersion(1, 10)
def minorVersion = { projectVersionD.minor }
assert minorVersion() == 10


Integer incrementVersion (Closure closure, Integer count) {
    closure() + count
}


def projectVersionE = initProjectVersion(1, 10)
assert incrementVersion({ projectVersionE.minor }, 2) == 12

Integer incrementVersionLastClosure (Integer count, Closure closure) {
    count + closure()
}

def projectVersionF = initProjectVersion(1, 10)
assert incrementVersionLastClosure(2) {
    projectVersionF.minor
} == 12

def projectVersionG = initProjectVersion(1, 10)
projectVersionG.increment {
    major += 1
}
assert projectVersionG.major == 2
projectVersionG.increment {
    minor += 2
}
assert projectVersionG.minor == 12


def noArgumentsClosure = { -> 'No Arguments' }
assert noArgumentsClosure() == 'No Arguments'

def returnNullClosure = { number -> println number }
assert returnNullClosure(4) == null
