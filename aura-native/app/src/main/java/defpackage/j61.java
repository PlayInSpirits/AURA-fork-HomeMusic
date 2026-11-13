/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.mt1;
import defpackage.nt1;
import java.util.function.BiFunction;

public final class j61
implements BiFunction {
    public final int a;

    public j61(int n16) {
        this.a = n16;
    }

    public final Object apply(Object object, Object object2) {
        switch (this.a) {
            default: {
                return (Integer)nt1.n.invoke(object, object2);
            }
            case 1: {
                return (Integer)mt1.n.invoke(object, object2);
            }
            case 0: 
        }
        object = (Boolean)object;
        object2 = (Boolean)object2;
        boolean bl5 = ((Boolean)object).booleanValue() || ((Boolean)object2).booleanValue();
        return bl5;
    }
}

