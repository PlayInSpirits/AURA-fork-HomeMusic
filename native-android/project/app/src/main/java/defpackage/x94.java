package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class x94 extends u84 {
    public final /* synthetic */ AtomicReferenceArray g;

    public x94(long r1, x94 r3, int r4) {
        super(r1, r3, r4);
        this.g = new AtomicReferenceArray(w94.f);
    }

    @Override // defpackage.u84
    public final int k() {
        return w94.f;
    }

    @Override // defpackage.u84
    public final void l(int r2, ne0 r3) {
        f01 r4 = w94.e;
        this.g.set(r2, r4);
        m();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.e + ", hashCode=" + hashCode() + ']';
    }
}
