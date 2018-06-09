package com.learn.groovyinaction.chap7.organizing.fixed

import com.learn.groovyinaction.chap7.organizing.thirdparty.MathLib as OriginMathLib

class MathLib extends OriginMathLib{
    @Override
    Integer twice (Integer value) {
        value * 2
    }
}
