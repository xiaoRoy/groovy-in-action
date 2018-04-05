package com.learn.groovyinaction.chap3

import java.awt.Point
import java.awt.Rectangle

int secondsPerYear = 24 * 60 * 60 * 365
secondsPerYear.toString()

assert "abc" - "a" == "bc"

Point topLeft = new Point(0, 0)
Point botRight = [100, 100]
Point center = [x:50, y:50]
assert botRight instanceof Point
assert center instanceof Point

def rect = new Rectangle()
rect.location = [0, 0]
rect.size = [width:100, height:100]
