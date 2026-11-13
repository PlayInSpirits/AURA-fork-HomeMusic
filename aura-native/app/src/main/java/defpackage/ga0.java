/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.gf1;
import defpackage.h12;
import defpackage.rf2;
import defpackage.x34;

public final class ga0
implements gf1 {
    public final int n;
    public final rf2 o;
    public final String p;

    public ga0(rf2 rf22, String string, int n16) {
        this.n = n16;
        this.o = rf22;
        this.p = string;
    }

    @Override
    public final Object invoke() {
        int n16 = this.n;
        String string = this.p;
        Object object = this.o;
        switch (n16) {
            default: {
                return ((rf2)object).b(string);
            }
            case 0: 
        }
        object = ((rf2)object).b(string);
        h12.n((x34)object, "PRAGMA query_only = 1");
        return object;
    }
}

