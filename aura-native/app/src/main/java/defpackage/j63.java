package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class j63 extends d0 implements s22 {
    public j63(defpackage.me0 a0) {
        super(a0);
    }

    public static final j63 o = new j63(fz0.h0);

    @Override // defpackage.s22
    public final as0 M(if1 if1Var) {
        return k63.n;
    }

    @Override // defpackage.s22
    public final Object R(wd0 wd0Var) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // defpackage.s22
    public final as0 T(boolean z, boolean z2, q qVar) {
        return k63.n;
    }

    @Override // defpackage.s22
    public final boolean b() {
        return true;
    }

    @Override // defpackage.s22
    public final boolean isCancelled() {
        return false;
    }

    @Override // defpackage.s22
    public final c20 j(a32 a32Var) {
        return k63.n;
    }

    @Override // defpackage.s22
    public final CancellationException q() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // defpackage.s22
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // defpackage.s22
    public final void f(CancellationException cancellationException) {
    }
}
