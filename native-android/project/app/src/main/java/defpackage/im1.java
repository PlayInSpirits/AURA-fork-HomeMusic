package defpackage;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class im1 extends vq {
    public int g;

    @Override // defpackage.t41
    public final void b(long r1, long r3, long r5, List r7, xj2[] r8) {
        long r2 = SystemClock.elapsedRealtime();
        if (a(this.g, r2) == true) goto L5;
        return;
    L5:
        int r4 = this.b - 1;
    L6:
        if (r4 < 0) goto L12;
        if (a(r4, r2) == false) goto L9;
        r4 = r4 - 1;
        goto L6
    L9:
        this.g = r4;
        return;
    L12:
        tb4.a();
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
