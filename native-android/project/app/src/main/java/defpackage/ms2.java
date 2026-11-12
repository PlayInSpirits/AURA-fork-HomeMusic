package defpackage;

import android.media.session.MediaSessionManager;
import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ms2 {
    public final os2 a;

    public ms2(MediaSessionManager.RemoteUserInfo r4) {
        String r0 = sr0.o(r4);
        if (r0 != null) goto L5;
        nz2.n("package shouldn't be null");
        throw null;
    L5:
        if (TextUtils.isEmpty(r0) == true) goto L8;
        this.a = new ns2(sr0.o(r4), sr0.b(r4), sr0.u(r4));
        return;
    L8:
        kf2.n("packageName should be nonempty");
        throw null;
    }

    public final boolean equals(Object r2) {
        if (this != r2) goto L6;
        return true;
    L6:
        if ((r2 instanceof ms2) == true) goto L9;
        return false;
    L9:
        os2 r3 = ((ms2) r2).a;
        return this.a.equals(r3);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public ms2(String r3, int r4, int r5) {
        if (r3 != null) goto L5;
        nz2.n("package shouldn't be null");
        throw null;
    L5:
        if (TextUtils.isEmpty(r3) == false) goto L7;
        kf2.n("packageName should be nonempty");
        throw null;
    L7:
        if (Build.VERSION.SDK_INT < 28) goto L10;
        this.a = new ns2(r3, r4, r5);
        return;
    L10:
        this.a = new os2(r3, r4, r5);
    }
}
