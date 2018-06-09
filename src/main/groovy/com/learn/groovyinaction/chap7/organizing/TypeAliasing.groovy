package com.learn.groovyinaction.chap7.organizing

//import com.learn.groovyinaction.chap7.organizing.thirdparty.MathLib
import com.learn.groovyinaction.chap7.organizing.fixed.MathLib
import com.learn.groovyinaction.chap7.organizing.anotherthirdparty.MathLib as IncMathLib
import com.learn.groovyinaction.chap7.organizing.thirdparty.MathLib as HaftMathLib

def mathLib = new MathLib()
assert mathLib.twice(2) == 4
assert mathLib.half(11) == 5

def haftMathLib = new HaftMathLib()
def incMathLib = new IncMathLib()
assert 3 == haftMathLib.half(incMathLib.increment(5))
