package com.learn.groovyinaction.chap7

class FieldShowcase {
    /*
    * without modifier compiler error
    * */
    public fieldWithPublicModifier
    String typedField
    def untypedField
    protected fieldWithProtectedModifier
    private Date assignedField = new Date()
    static Integer ID

    def run(){
        def localUntypedVar = 1
        int localTypedVar = 1
        def localVarWithoutAssignment
    }
}
