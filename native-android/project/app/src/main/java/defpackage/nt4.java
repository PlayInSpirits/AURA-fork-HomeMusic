package defpackage;

import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class nt4 {
    public static final long a = 0;

    static {
        long r0 = Looper.getMainLooper().getThread().getId();     // Catch: Exception -> L4
    L5:
        a = r0;
        return;
    L4:
        r0 = -1;
        goto L5
    }
}
