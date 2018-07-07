package com.learn.groovyinaction.chap19.scriptclass

abstract class CaseRobotBaseScript extends Script{

    @Override
    def invokeMethod(String methodName, args){
        getBinding().robot."${methodName.toLowerCase()}" (*args)
    }
}
