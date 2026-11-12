package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class f32 extends h32 implements Iterable {
    public final ArrayList n = new ArrayList();

    @Override // defpackage.h32
    public final String b() {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        if (size == 1) {
            return ((h32) arrayList.get(0)).b();
        }
        kf2.o(f34.f(size, "Array must have size 1, but has size "));
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof f32) && ((f32) obj).n.equals(this.n);
        }
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
