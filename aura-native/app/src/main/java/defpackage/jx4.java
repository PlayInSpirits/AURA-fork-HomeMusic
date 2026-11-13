/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.er1;
import defpackage.ex4;
import defpackage.z53;

public abstract class jx4
implements Cloneable {
    public ex4 n = z53.o;

    public final jx4 a() {
        try {
            jx4 jx42 = (jx4)super.clone();
            return jx42;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            er1.m(cloneNotSupportedException);
            return null;
        }
    }

    public final Object clone() {
        return this.a();
    }

    public boolean equals(Object object) {
        if (object instanceof jx4) {
            object = (jx4)object;
            return this.n.equals(((jx4)object).n);
        }
        return false;
    }
}

