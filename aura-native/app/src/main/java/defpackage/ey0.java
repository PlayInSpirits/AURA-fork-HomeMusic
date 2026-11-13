/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.d64;
import defpackage.tu4;
import java.util.function.Function;

public final class ey0
implements Function {
    public final int a;
    public final Function b;

    public ey0(Function function, int n16) {
        this.a = n16;
        this.b = function;
    }

    public final Object apply(Object object) {
        int n16 = this.a;
        Function function = this.b;
        object = (d64)object;
        switch (n16) {
            default: {
                return ((tu4)function.apply(object)).b;
            }
            case 0: 
        }
        return ((tu4)function.apply(object)).a;
    }
}

