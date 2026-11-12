package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qi5 extends gi5 {
    public static final Object[] v = null;
    public static final qi5 w = null;
    public final transient Object[] q;
    public final transient int r;
    public final transient Object[] s;
    public final transient int t;
    public final transient int u;

    static {
        Object[] r5 = new Object[0];
        v = r5;
        w = new qi5(0, 0, 0, r5, r5);
    }

    public qi5(int r1, int r2, int r3, Object[] r4, Object[] r5) {
        this.q = r4;
        this.r = r1;
        this.s = r5;
        this.t = r2;
        this.u = r3;
    }

    @Override // defpackage.wh5
    public final int a(Object[] r3) {
        Object[] r0 = this.q;
        int r2 = this.u;
        System.arraycopy(r0, 0, r3, 0, r2);
        return r2;
    }

    @Override // defpackage.wh5
    public final int b() {
        return this.u;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object r6) {
        if (r6 == null) goto L15;
        Object[] r0 = this.s;
        if (r0.length == 0) goto L19;
        int r1 = (int) (((long) Integer.rotateLeft((int) (((long) r6.hashCode()) * (-862048943)), 15)) * 461845907);
    L7:
        int r2 = r1 & this.t;
        Object r3 = r0[r2];
        if (r3 == null) goto L20;
        if (r3.equals(r6) == true) goto L12;
        r1 = r2 + 1;
        goto L7
    L12:
        return true;
    L20:
        return false;
    L19:
        return false;
    L15:
        return false;
    }

    @Override // defpackage.wh5
    public final int d() {
        return 0;
    }

    @Override // defpackage.wh5
    public final o15 e() {
        return i().k(0);
    }

    @Override // defpackage.wh5
    public final Object[] f() {
        return this.q;
    }

    @Override // defpackage.gi5, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.r;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return i().k(0);
    }

    @Override // defpackage.gi5
    public final ei5 j() {
        Object[] r0 = this.q;
        return ei5.i(this.u, r0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.u;
    }
}
