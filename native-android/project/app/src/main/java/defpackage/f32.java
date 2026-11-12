package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class f32 extends h32 implements Iterable {
    public final ArrayList n;

    public f32() {
        this.n = new ArrayList();
    }

    @Override // defpackage.h32
    public final String b() {
        ArrayList r2 = this.n;
        int r0 = r2.size();
        if (r0 == 1) goto L5;
        kf2.o(f34.f(r0, "Array must have size 1, but has size "));
        return null;
    L5:
        return ((h32) r2.get(0)).b();
    }

    public final boolean equals(Object r2) {
        if (r2 != this) goto L4;
        return true;
    L4:
        if ((r2 instanceof f32) == true) goto L6;
        return false;
    L6:
        if (((f32) r2).n.equals(this.n) == true) goto L13;
        return false;
    L13:
        return true;
    }

    public final int hashCode() {
        return this.n.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.n.iterator();
    }
}
