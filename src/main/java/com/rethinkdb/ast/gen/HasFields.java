// Autogenerated by metajava.py.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../../../../templates/AstSubclass.java
package com.rethinkdb.ast.gen;

import java.util.Optional;
import com.rethinkdb.ast.ReqlAst;
import com.rethinkdb.ast.helper.Arguments;
import com.rethinkdb.ast.helper.OptArgs;
import com.rethinkdb.proto.TermType;



public class HasFields extends ReqlQuery {


    public HasFields(java.lang.Object arg) {
        this(new Arguments(arg), null);
    }
    public HasFields(Arguments args, OptArgs optargs) {
        this(null, args, optargs);
    }
    public HasFields(ReqlAst prev, Arguments args, OptArgs optargs) {
        this(prev, TermType.HAS_FIELDS, args, optargs);
    }
    protected HasFields(ReqlAst previous, TermType termType, Arguments args, OptArgs optargs){
        super(previous, termType, args, optargs);
    }


    /* Static factories */
    public static HasFields fromArgs(Object... args){
        return new HasFields(new Arguments(args), null);
    }


}
