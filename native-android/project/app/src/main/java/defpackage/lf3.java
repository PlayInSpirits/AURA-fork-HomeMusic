package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lf3 extends AbstractMap implements Map, a42 {
    public tv1 n;
    public xx4 o;
    public Object p;
    public int q;
    public int r;
    public mf3 s;

    public lf3(mf3 r2) {
        this.n = new tv1();
        this.o = r2.n;
        this.r = r2.o;
        this.s = r2;
    }

    public final mf3 a() {
        xx4 r0 = this.o;
        mf3 r1 = this.s;
        if (r0 == r1.n) goto L6;
        this.n = new tv1();
        r1 = new mf3(this.o, this.r);
    L6:
        this.s = r1;
        return r1;
    }

    public final boolean b(Object r3) {
        xx4 r2 = this.o;
        if (r3 == null) goto L5;
        int r1 = r3.hashCode();
    L7:
        return r2.d(r1, 0, r3);
    L5:
        r1 = 0;
        goto L7
    }

    public final Object c(Object r3) {
        xx4 r2 = this.o;
        if (r3 == null) goto L5;
        int r1 = r3.hashCode();
    L7:
        return r2.g(r1, 0, r3);
    L5:
        r1 = 0;
        goto L7
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.o = xx4.e;
        e(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object r2) {
        if ((r2 instanceof qr3) == true) goto L7;
        return false;
    L7:
        return b((qr3) r2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object r2) {
        if ((r2 instanceof j35) == true) goto L7;
        return false;
    L7:
        return super.containsValue((j35) r2);
    }

    public final Object d(Object r4) {
        this.p = null;
        xx4 r0 = this.o;
        if (r4 == null) goto L5;
        int r2 = r4.hashCode();
    L6:
        xx4 r5 = r0.n(r2, r4, 0, this);
        if (r5 != null) goto L9;
        r5 = xx4.e;
    L9:
        this.o = r5;
        return this.p;
    L5:
        r2 = 0;
        goto L6
    }

    public final void e(int r1) {
        this.r = r1;
        this.q++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new qf3(0, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object r2) {
        if ((r2 instanceof qr3) == true) goto L7;
        return null;
    L7:
        return (j35) c((qr3) r2);
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object r2, Object r3) {
        if ((r2 instanceof qr3) == true) goto L6;
        return r3;
    L6:
        return (j35) super.getOrDefault((qr3) r2, (j35) r3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new qf3(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object r8, Object r9) {
        this.p = null;
        xx4 r1 = this.o;
        if (r8 == null) goto L6;
        int r0 = r8.hashCode();
    L7:
        this.o = r1.l(r0, r8, r9, 0, this);
        return this.p;
    L6:
        r0 = 0;
        goto L7
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map r6) {
        nf3 r1 = null;
        if ((r6 instanceof nf3) == false) goto L5;
        nf3 r0 = (nf3) r6;
    L6:
        if (r0 == null) goto L8;
        r1 = r0;
    L14:
        if (r1 == null) goto L19;
        no0 r7 = new no0();
        r7.a = 0;
        int r2 = this.r;
        xx4 r3 = this.o;
        xx4 r4 = r1.n;
        r4.getClass();
        this.o = r3.m(r4, 0, r7, this);
        int r5 = (r1.o + r2) - r7.a;
        if (r2 == r5) goto L21;
        e(r5);
        return;
    L21:
        return;
    L19:
        super.putAll(r6);
        return;
    L8:
        if ((r6 instanceof lf3) == false) goto L10;
        lf3 r8 = (lf3) r6;
    L11:
        if (r8 == null) goto L14;
        r1 = r8.a();
        goto L14
    L10:
        r8 = null;
        goto L11
    L5:
        r0 = null;
        goto L6
    }

    @Override // java.util.Map
    public final boolean remove(Object r9, Object r10) {
        int r0 = this.r;
        xx4 r1 = this.o;
        if (r9 == null) goto L5;
        int r2 = r9.hashCode();
    L6:
        xx4 r8 = r1.o(r2, r9, r10, 0, this);
        if (r8 != null) goto L9;
        r8 = xx4.e;
    L9:
        this.o = r8;
        if (r0 == this.r) goto L13;
        return true;
    L13:
        return false;
    L5:
        r2 = 0;
        goto L6
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.r;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new cg2(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object r2) {
        if ((r2 instanceof qr3) == true) goto L7;
        return null;
    L7:
        return (j35) d((qr3) r2);
    }
}
