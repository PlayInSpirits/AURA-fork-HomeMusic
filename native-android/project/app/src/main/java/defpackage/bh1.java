package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bh1 implements Iterator, x32 {
    public final /* synthetic */ int n;
    public int o;
    public Object p;
    public final Object q;

    public bh1(z03 r3) {
        this.n = 2;
        this.q = r3;
        this.o = -1;
        this.p = si0.C(new y03(r3, this, null));
    }

    public void a() {
        int r0 = this.o;
        tq4 r1 = (tq4) this.q;
        if (r0 != (-2)) goto L5;
        Object r2 = ((gf1) r1.b).invoke();
    L6:
        this.p = r2;
        if (r2 != null) goto L9;
        int r3 = 0;
    L10:
        this.o = r3;
        return;
    L9:
        r3 = 1;
        goto L10
    L5:
        if1 r4 = r1.c;
        Object r5 = this.p;
        r5.getClass();
        r2 = r4.invoke(r5);
        goto L6
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int r0 = this.n;
        Object r1 = this.q;
        switch(r0) {
            case 0: goto L25;
            case 1: goto L23;
            case 2: goto L21;
            case 3: goto L17;
            default: goto L4;
        };
    L4:
        fn4 r2 = (fn4) r1;
        Iterator r3 = (Iterator) this.p;
    L6:
        if (this.o >= r2.b) goto L11;
        if (r3.hasNext() == false) goto L11;
        r3.next();
        this.o++;
    L11:
        if (this.o < r2.c) goto L13;
        return false;
    L13:
        if (r3.hasNext() == true) goto L15;
        return false;
    L15:
        return true;
    L17:
        if (this.o < ((Map) r1).size()) goto L19;
        return false;
    L19:
        return true;
    L21:
        return ((ba4) this.p).hasNext();
    L23:
        return ((ba4) this.p).hasNext();
    L25:
        if (this.o >= 0) goto L28;
        a();
    L28:
        if (this.o == 1) goto L30;
        return false;
    L30:
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int r0 = this.n;
        Object r1 = this.q;
        Object r2 = null;
        switch(r0) {
            case 0: goto L29;
            case 1: goto L27;
            case 2: goto L25;
            case 3: goto L16;
            default: goto L4;
        };
    L4:
        fn4 r3 = (fn4) r1;
        Iterator r4 = (Iterator) this.p;
    L6:
        if (this.o >= r3.b) goto L10;
        if (r4.hasNext() == false) goto L10;
        r4.next();
        this.o++;
    L10:
        int r5 = this.o;
        if (r5 >= r3.c) goto L13;
        this.o = r5 + 1;
        return r4.next();
    L13:
        tb4.k();
        return null;
    L16:
        if (hasNext() == false) goto L22;
        r2 = this.p;
        this.o++;
        Object r6 = ((Map) r1).get(r2);
        if (r6 == null) goto L21;
        this.p = ((ob2) r6).b;
    L23:
        return r2;
    L21:
        throw new ConcurrentModificationException("Hash code of an element (" + r2 + ") has changed after it was added to the persistent set.");
    L22:
        tb4.k();
        goto L23
    L25:
        return ((ba4) this.p).next();
    L27:
        return ((ba4) this.p).next();
    L29:
        if (this.o >= 0) goto L32;
        a();
    L32:
        if (this.o == 0) goto L34;
        Object r7 = this.p;
        r7.getClass();
        this.o = -1;
        return r7;
    L34:
        tb4.k();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        int r0 = this.n;
        Object r1 = this.q;
        switch(r0) {
            case 0: goto L17;
            case 1: goto L12;
            case 2: goto L8;
            case 3: goto L7;
            default: goto L5;
        };
    L8:
        int r2 = this.o;
        if (r2 == (-1)) goto L18;
        ((z03) r1).o.m(r2);
        this.o = -1;
        return;
    L18:
        return;
    L12:
        int r3 = this.o;
        if (r3 == (-1)) goto L19;
        ((t03) r1).o.h(r3);
        this.o = -1;
        return;
    L19:
        return;
    L5:
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    L7:
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    L17:
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public bh1(fn4 r2) {
        this.n = 4;
        this.q = r2;
        this.p = r2.a.iterator();
    }

    public bh1(tq4 r2) {
        this.n = 0;
        this.q = r2;
        this.o = -2;
    }

    public bh1(Object r2, Map r3) {
        this.n = 3;
        this.p = r2;
        this.q = r3;
    }

    public bh1(t03 r3) {
        this.n = 1;
        this.q = r3;
        this.o = -1;
        this.p = si0.C(new s03(r3, this, null));
    }
}
