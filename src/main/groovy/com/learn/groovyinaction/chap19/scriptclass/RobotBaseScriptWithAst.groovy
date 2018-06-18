package com.learn.groovyinaction.chap19.scriptclass

import com.learn.groovyinaction.chap19.Robot

abstract class RobotBaseScriptWithAst extends Script{

    @Delegate @Lazy Robot robot = this.binding.robot
}
