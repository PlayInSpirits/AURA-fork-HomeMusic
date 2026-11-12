package defpackage;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gw {
    public static final /* synthetic */ int a = 0;

    static {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 < 30) goto L5;
        p3.b(30);
    L5:
        if (r0 < 30) goto L7;
        p3.b(31);
    L7:
        if (r0 < 30) goto L9;
        p3.b(33);
    L9:
        if (r0 < 30) goto L12;
        p3.b(1000000);
        return;
    }
}
