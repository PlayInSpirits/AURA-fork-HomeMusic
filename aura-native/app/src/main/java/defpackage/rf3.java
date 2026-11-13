/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.ay4;
import defpackage.b45;
import defpackage.d45;
import defpackage.lf3;
import defpackage.pf3;
import defpackage.x32;
import defpackage.yx4;
import java.util.Iterator;
import java.util.Map;

public final class rf3
implements Iterator,
x32 {
    public final int n;
    public final Iterator o;

    public rf3(b45 b452) {
        this.n = 1;
        this.o = b452.w.iterator();
    }

    public rf3(lf3 lf32) {
        this.n = 0;
        yx4[] yx4Array = new yx4[8];
        for (int i16 = 0; i16 < 8; ++i16) {
            yx4Array[i16] = new ay4(this);
        }
        this.o = new pf3(lf32, yx4Array);
    }

    @Override
    public final boolean hasNext() {
        switch (this.n) {
            default: {
                return this.o.hasNext();
            }
            case 0: 
        }
        return ((pf3)this.o).p;
    }

    public final Object next() {
        switch (this.n) {
            default: {
                return (d45)this.o.next();
            }
            case 0: 
        }
        return (Map.Entry)((pf3)this.o).next();
    }

    @Override
    public final void remove() {
        switch (this.n) {
            default: {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
            case 0: 
        }
        ((pf3)this.o).remove();
    }
}

