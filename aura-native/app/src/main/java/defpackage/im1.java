package defpackage;

import android.os.SystemClock;
import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class im1 extends vq {
    public im1(int a0, defpackage.sv4 a1, int[] a2) {
        super(a0, a1, a2);
    }

    public int g;

    @Override // defpackage.t41
    public final void b(long j, long j2, long j3, List list, xj2[] xj2VarArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (a(this.g, elapsedRealtime)) {
            for (int i = this.b - 1; i >= 0; i--) {
                if (!a(i, elapsedRealtime)) {
                    this.g = i;
                    return;
                }
            }
            tb4.a();
        }
    }

    @Override // defpackage.t41
    public final int d() {
        return this.g;
    }

    @Override // defpackage.t41
    public final int n() {
        return 0;
    }

    @Override // defpackage.t41
    public final Object q() {
        return null;
    }
}
