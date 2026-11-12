package defpackage;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class im1 extends vq {
    public int g;

    @Override // defpackage.t41
    public final void b(long j, long j2, long j3, List list, xj2[] xj2VarArr) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (a(this.g, jElapsedRealtime)) {
            for (int i = this.b - 1; i >= 0; i--) {
                if (!a(i, jElapsedRealtime)) {
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
