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



public class Ungroup extends ReqlQuery {


    public Ungroup(java.lang.Object arg) {
        this(new Arguments(arg), null);
    }
    public Ungroup(Arguments args, OptArgs optargs) {
        this(null, args, optargs);
    }
    public Ungroup(ReqlAst prev, Arguments args, OptArgs optargs) {
        this(prev, TermType.UNGROUP, args, optargs);
    }
    protected Ungroup(ReqlAst previous, TermType termType, Arguments args, OptArgs optargs){
        super(previous, termType, args, optargs);
    }


    /* Static factories */
    public static Ungroup fromArgs(Object... args){
        return new Ungroup(new Arguments(args), null);
    }


}
