package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ol4 extends n2 {
    public final AtomicReference a;

    public ol4() {
        this.a = new AtomicReference(null);
    }

    @Override // defpackage.n2
    public final boolean a(m2 r1) {
        nl4 r2 = (nl4) r1;
        AtomicReference r0 = this.a;
        if (r0.get() == null) goto L6;
        return false;
    L6:
        r0.set(ya4.d);
        return true;
    }

    @Override // defpackage.n2
    public final vd0[] b(m2 r1) {
        nl4 r2 = (nl4) r1;
        this.a.set(null);
        return bu.a;
    }
}
