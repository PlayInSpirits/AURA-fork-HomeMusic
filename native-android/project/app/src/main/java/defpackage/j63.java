package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class j63 extends d0 implements s22 {
    public static final j63 o = null;

    static {
        o = new j63(fz0.h0);
    }

    @Override // defpackage.s22
    public final as0 M(if1 r1) {
        return k63.n;
    }

    @Override // defpackage.s22
    public final Object R(wd0 r1) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // defpackage.s22
    public final as0 T(boolean r1, boolean r2, q r3) {
        return k63.n;
    }

    @Override // defpackage.s22
    public final boolean b() {
        return true;
    }

    @Override // defpackage.s22
    public final void f(CancellationException r1) {
    }

    @Override // defpackage.s22
    public final boolean isCancelled() {
        return false;
    }

    @Override // defpackage.s22
    public final c20 j(a32 r1) {
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
}
