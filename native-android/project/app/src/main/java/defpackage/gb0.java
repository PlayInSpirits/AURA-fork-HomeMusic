package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gb0 implements aa4 {
    public final AtomicReference a;

    public gb0(aa4 r2) {
        this.a = new AtomicReference(r2);
    }

    @Override // defpackage.aa4
    public final Iterator iterator() {
        aa4 r1 = (aa4) this.a.getAndSet(null);
        if (r1 != null) goto L5;
        kf2.o("This sequence can be consumed only once.");
        return null;
    L5:
        return r1.iterator();
    }
}
