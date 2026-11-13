package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class x94 extends u84 {
    public final /* synthetic */ AtomicReferenceArray g;

    public x94(long j, x94 x94Var, int i) {
        super(j, x94Var, i);
        this.g = new AtomicReferenceArray(w94.f);
    }

    @Override // defpackage.u84
    public final int k() {
        return w94.f;
    }

    @Override // defpackage.u84
    public final void l(int i, ne0 ne0Var) {
        this.g.set(i, w94.e);
        m();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.e + ", hashCode=" + hashCode() + ']';
    }
}
