/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.cx2;
import defpackage.fu;
import defpackage.fz1;
import defpackage.if1;
import defpackage.nc3;
import defpackage.w82;
import defpackage.x82;

public final class u82
implements if1 {
    public final int n;
    public final x82 o;

    public u82(x82 x822, int n16) {
        this.n = n16;
        this.o = x822;
    }

    @Override
    public final Object invoke(Object object) {
        int n16;
        block6: {
            int n17 = this.n;
            Object object2 = this.o;
            switch (n17) {
                default: {
                    n16 = (Integer)object;
                    object = (nc3)((x82)object2).B.invoke();
                    if (n16 < 0 || n16 >= ((nc3)object).b()) {
                        n17 = ((nc3)object).b();
                        object = new StringBuilder("Can't scroll to index ");
                        ((StringBuilder)object).append(n16);
                        ((StringBuilder)object).append(", it is out of bounds [0, ");
                        ((StringBuilder)object).append(n17);
                        ((StringBuilder)object).append(")");
                        fz1.a(((StringBuilder)object).toString());
                    }
                    fu.G(((cx2)object2).e0(), null, null, new w82(object2, n16, null, 0), 3);
                    return Boolean.TRUE;
                }
                case 0: 
            }
            object2 = (nc3)((x82)object2).B.invoke();
            n17 = ((nc3)object2).b();
            for (n16 = 0; n16 < n17; ++n16) {
                if (!((nc3)object2).c(n16).equals(object)) {
                    continue;
                }
                break block6;
            }
            n16 = -1;
        }
        return n16;
    }
}

