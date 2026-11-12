package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ig4 implements w80, Iterable, x32 {
    public int[] n;
    public int o;
    public Object[] p;
    public int q;
    public int r;
    public final Object s;
    public boolean t;
    public int u;
    public ArrayList v;
    public HashMap w;
    public i03 x;

    public ig4() {
        this.n = new int[0];
        this.p = new Object[0];
        this.s = new Object();
        this.v = new ArrayList();
    }

    public final int a(mg1 r1) {
        if (this.t == false) goto L6;
        l80.a("Use active SlotWriter to determine anchor location instead");
    L6:
        if (r1.a() == true) goto L9;
        oo3.a("Anchor refers to a group that was removed");
    L9:
        return r1.a;
    }

    public final void b() {
        this.w = new HashMap();
    }

    public final hg4 d() {
        if (this.t == true) goto L6;
        this.r++;
        return new hg4(this);
    L6:
        kf2.o("Cannot read while a writer is pending");
        return null;
    }

    public final lg4 e() {
        if (this.t == false) goto L6;
        l80.a("Cannot start a writer when another writer is pending");
    L6:
        if (this.r <= 0) goto L9;
        l80.a("Cannot start a writer when a reader is pending");
    L9:
        this.t = true;
        this.u++;
        return new lg4(this);
    }

    public final boolean f(mg1 r4) {
        if (r4.a() == false) goto L10;
        int r0 = kg4.e(this.v, r4.a, this.o);
        if (r0 >= 0) goto L7;
        return false;
    L7:
        if (h12.c(this.v.get(r0), r4) == false) goto L13;
        return true;
    L13:
        return false;
    L10:
        return false;
    }

    public final tg1 g(int r4) {
        HashMap r0 = this.w;
        if (r0 != null) goto L5;
    L17:
        return null;
    L5:
        if (this.t == false) goto L7;
        l80.a("use active SlotWriter to crate an anchor for location instead");
    L7:
        if (r4 < 0) goto L13;
        int r2 = this.o;
        if (r4 >= r2) goto L13;
        ArrayList r3 = this.v;
        int r5 = kg4.e(r3, r4, r2);
        if (r5 < 0) goto L13;
        mg1 r6 = (mg1) r3.get(r5);
    L14:
        if (r6 == null) goto L17;
        return (tg1) r0.get(r6);
    L13:
        r6 = null;
        goto L14
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ik1(this, 0, this.o);
    }
}
