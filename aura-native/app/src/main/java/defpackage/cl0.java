/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.ro3;
import java.util.Map;

public final class cl0
implements ro3 {
    public final int n;

    public cl0(int n16) {
        this.n = n16;
    }

    @Override
    public final boolean apply(Object object) {
        switch (this.n) {
            default: {
                boolean bl5 = (String)object != null;
                return bl5;
            }
            case 0: 
        }
        boolean bl6 = ((Map.Entry)object).getKey() != null;
        return bl6;
    }
}

