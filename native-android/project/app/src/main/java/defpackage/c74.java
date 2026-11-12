package defpackage;

import androidx.compose.foundation.gestures.FlingCancellationException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class c74 implements q64 {
    public final /* synthetic */ g74 a;
    public final /* synthetic */ e74 b;

    public c74(g74 r1, e74 r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // defpackage.q64
    public final float a(float r5) {
        float r0 = Math.abs(r5);
        g74 r1 = this.a;
        if (r0 != 0.0f) goto L6;
    L7:
        long r2 = r1.f(r1.i(r5));
        return r1.e(r1.h(this.b.a(2, r2)));
    L6:
        if (((Boolean) r1.h.invoke()).booleanValue() == true) goto L7;
        throw new FlingCancellationException();
    }
}
