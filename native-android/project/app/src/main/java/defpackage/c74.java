package defpackage;

import androidx.compose.foundation.gestures.FlingCancellationException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class c74 implements q64 {
    public final /* synthetic */ g74 a;
    public final /* synthetic */ e74 b;

    public c74(g74 g74Var, e74 e74Var) {
        this.a = g74Var;
        this.b = e74Var;
    }

    @Override // defpackage.q64
    public final float a(float f) {
        float fAbs = Math.abs(f);
        g74 g74Var = this.a;
        if (fAbs != 0.0f && !((Boolean) g74Var.h.invoke()).booleanValue()) {
            throw new FlingCancellationException();
        }
        return g74Var.e(g74Var.h(this.b.a(2, g74Var.f(g74Var.i(f)))));
    }
}
