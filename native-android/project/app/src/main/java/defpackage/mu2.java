package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mu2 {
    public static final int e = 0;
    public final Context a;
    public final ActivityManager b;
    public final si1 c;
    public final float d;

    static {
        if (Build.VERSION.SDK_INT >= 26) goto L5;
        int r0 = 4;
    L6:
        e = r0;
        return;
    L5:
        r0 = 1;
        goto L6
    }

    public mu2(Context r4) {
        this.d = e;
        this.a = r4;
        ActivityManager r0 = (ActivityManager) r4.getSystemService("activity");
        this.b = r0;
        this.c = new si1(10, r4.getResources().getDisplayMetrics());
        if (Build.VERSION.SDK_INT >= 26) goto L5;
        return;
    L5:
        if (r0.isLowRamDevice() == false) goto L9;
        this.d = 0.0f;
        return;
    }
}
