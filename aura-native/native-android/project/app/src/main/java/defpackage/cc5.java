package defpackage;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cc5 implements bc5 {
    public final po0 b;

    public cc5() {
        this.b = Build.VERSION.SDK_INT >= 34 ? qo0.n : fz0.V;
        gb.d(1, 2, 4, 8, 16, 32, 64, 128);
    }
}
