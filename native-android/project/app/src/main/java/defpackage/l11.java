package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class l11 implements Iterable {
    public final ArrayList n;

    public l11(ArrayList arrayList) {
        this.n = arrayList;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.n.iterator();
    }
}
