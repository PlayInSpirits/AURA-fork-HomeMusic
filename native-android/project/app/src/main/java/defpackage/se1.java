package defpackage;

import android.os.Build;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class se1 {
    public static final boolean c = false;
    public final UUID a;
    public final byte[] b;

    static {
        if ("Amazon".equals(Build.MANUFACTURER) == false) goto L9;
        String r0 = Build.MODEL;
        if ("AFTM".equals(r0) == false) goto L7;
    L8:
        boolean r1 = true;
    L10:
        c = r1;
        return;
    L7:
        if ("AFTB".equals(r0) == true) goto L8;
    L9:
        r1 = false;
        goto L10
    }

    public se1(UUID r1, byte[] r2) {
        this.a = r1;
        this.b = r2;
    }
}
