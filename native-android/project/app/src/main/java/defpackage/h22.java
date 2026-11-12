package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class h22 extends o15 {
    public int o;
    public Object p;
    public final /* synthetic */ int q;
    public final Iterator r;
    public final /* synthetic */ Object s;

    public h22(gb4 r2) {
        this.q = 1;
        this.s = r2;
        this();
        this.r = r2.n.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.o == 4) goto L5;
        boolean r0 = true;
    L6:
        rr2.w(r0);
        int r1 = xa3.w(this.o);
        if (r1 != 0) goto L9;
        return true;
    L9:
        if (r1 == 2) goto L28;
        this.o = 4;
        int r2 = this.q;
        Object r3 = null;
        Object r4 = this.s;
        Iterator r5 = this.r;
        switch(r2) {
            case 0: goto L19;
            default: goto L13;
        };
    L13:
        if (r5.hasNext() == false) goto L17;
        Object r6 = r5.next();
        if (((gb4) r4).o.contains(r6) == false) goto L13;
    L16:
        r3 = r6;
    L24:
        this.p = r3;
        if (this.o == 3) goto L28;
        this.o = 1;
        return true;
    L17:
        this.o = 3;
    L19:
        if (r5.hasNext() == false) goto L23;
        r6 = r5.next();
        if (((ro3) r4).apply(r6) == false) goto L19;
    L23:
        this.o = 3;
    L28:
        return false;
    L5:
        r0 = false;
        goto L6
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext() == false) goto L6;
        this.o = 2;
        Object r0 = this.p;
        this.p = null;
        return r0;
    L6:
        tb4.k();
        return null;
    }

    public h22(Iterator r2, ro3 r3) {
        this.q = 0;
        this.r = r2;
        this.s = r3;
        this();
    }

    public h22() {
        super(0);
        this.o = 2;
    }
}
