/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.cy2;
import defpackage.fx3;
import defpackage.g74;
import defpackage.gx3;
import defpackage.h12;
import defpackage.hy2;
import defpackage.if1;
import defpackage.ir2;
import defpackage.jx3;
import defpackage.m45;
import defpackage.rf2;

public final class ey2
implements if1 {
    public final hy2 n;
    public final jx3 o;
    public final gx3 p;
    public final g74 q;
    public final fx3 r;

    public ey2(hy2 hy22, jx3 jx32, gx3 gx32, g74 g742, fx3 fx32) {
        this.n = hy22;
        this.o = jx32;
        this.p = gx32;
        this.q = g742;
        this.r = fx32;
    }

    @Override
    public final Object invoke(Object object) {
        float f16 = ((Float)object).floatValue();
        Object object2 = this.n;
        object = hy2.I(((hy2)object2).g);
        boolean bl5 = true;
        if (object != null) {
            float f17;
            object2 = (rf2)((ir2)object2).e;
            long l16 = ((cy2)object).b;
            long l17 = ((cy2)object).a;
            ((m45)((rf2)object2).n).a(l16, Float.intBitsToFloat((int)(l17 >> 32)));
            ((m45)((rf2)object2).o).a(l16, Float.intBitsToFloat((int)(l17 & 0xFFFFFFFFL)));
            object2 = this.o;
            cy2 cy22 = ((cy2)((jx3)object2).n).a((cy2)object);
            ((jx3)object2).n = cy22;
            l16 = cy22.a;
            object2 = this.q;
            this.p.n = f17 = ((g74)object2).j(((g74)object2).f(l16));
            boolean bl6 = h12.b(f17 - f16);
            this.r.n = bl6 ^ true;
        }
        if (object == null) {
            bl5 = false;
        }
        return bl5;
    }
}

