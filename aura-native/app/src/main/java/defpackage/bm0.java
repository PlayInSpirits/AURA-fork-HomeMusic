/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.au;
import defpackage.bi0;
import defpackage.bu4;
import defpackage.fq;
import defpackage.go4;
import defpackage.jr3;
import defpackage.n51;
import defpackage.ne4;
import defpackage.oe4;
import defpackage.pe4;
import defpackage.qe4;
import defpackage.xm;

public final class bm0
implements go4 {
    public final int n;
    public final Object o;
    public final Object p;

    public bm0(int n16, Object object, Object object2) {
        this.n = n16;
        this.o = object;
        this.p = object2;
    }

    @Override
    public final Object get() {
        int n16 = this.n;
        Object object = this.p;
        Object object2 = this.o;
        switch (n16) {
            default: {
                Object object3 = (qe4)object2;
                object = (pe4)object;
                object2 = ((pe4)object).a();
                ((oe4)object2).d = 1;
                ((oe4)object2).J = ne4.k;
                object3 = ((fq)object3).b;
                ((oe4)object2).H = new xm(qe4.h1(((pe4)object).D.get(), (pe4)object, (bu4)object3));
                ((oe4)object2).I = ((pe4)object).E;
                return new pe4((oe4)object2);
            }
            case 0: 
        }
        object2 = (au)object2;
        return new jr3((bi0)object, (n51)((au)object2).b);
    }
}

