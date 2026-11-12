package defpackage;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public interface xs {
    ic2 g(Uri r1);

    default ic2 i(do2 r2) {
        byte[] r0 = r2.k;
        if (r0 != null) goto L5;
        Uri r3 = r2.m;
        if (r3 != null) goto L9;
        return null;
    L9:
        return g(r3);
    L5:
        return j(r0);
    }

    ic2 j(byte[] r1);
}
