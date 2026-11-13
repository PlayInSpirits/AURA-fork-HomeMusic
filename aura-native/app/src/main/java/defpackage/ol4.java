package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ol4 extends n2 {
    public final AtomicReference a = new AtomicReference(null);

    @Override // defpackage.n2
    public final boolean a(m2 m2Var) {
        AtomicReference atomicReference = this.a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(ya4.d);
        return true;
    }

    @Override // defpackage.n2
    public final vd0[] b(m2 m2Var) {
        this.a.set(null);
        return bu.a;
    }
}
