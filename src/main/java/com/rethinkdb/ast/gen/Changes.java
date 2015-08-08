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



public class Changes extends ReqlQuery {


    public Changes(java.lang.Object arg) {
        this(new Arguments(arg), null);
    }
    public Changes(Arguments args, OptArgs optargs) {
        this(null, args, optargs);
    }
    public Changes(ReqlAst prev, Arguments args, OptArgs optargs) {
        this(prev, TermType.CHANGES, args, optargs);
    }
    protected Changes(ReqlAst previous, TermType termType, Arguments args, OptArgs optargs){
        super(previous, termType, args, optargs);
    }


    /* Static factories */
    public static Changes fromArgs(Object... args){
        return new Changes(new Arguments(args), null);
    }


}
