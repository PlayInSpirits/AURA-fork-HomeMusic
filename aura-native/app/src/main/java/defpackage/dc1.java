package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class dc1 extends r5 {
    public final /* synthetic */ AtomicReference a;

    public dc1(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    @Override // defpackage.r5
    public final void a(Object obj) {
        r5 r5Var = (r5) this.a.get();
        if (r5Var != null) {
            r5Var.a(obj);
        } else {
            kf2.o("Operation cannot be started before fragment is in created state");
        }
    }
}
