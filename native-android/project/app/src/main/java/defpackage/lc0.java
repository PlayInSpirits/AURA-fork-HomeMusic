package defpackage;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lc0 {
    public final Uri a;
    public final boolean b;

    public lc0(boolean r1, Uri r2) {
        this.a = r2;
        this.b = r1;
    }

    public final boolean equals(Object r3) {
        if (this == r3) goto L21;
        if (r3 == null) goto L6;
        Class<?> r0 = r3.getClass();
    L8:
        if (lc0.class.equals(r0) == false) goto L19;
        r3.getClass();
        lc0 r4 = (lc0) r3;
        if (this.a.equals(r4.a) == true) goto L14;
        return false;
    L14:
        if (this.b == r4.b) goto L17;
        return false;
    L17:
        return true;
    L19:
        return false;
    L6:
        r0 = null;
        goto L8
    L21:
        return true;
    }

    public final int hashCode() {
        int r0 = this.a.hashCode() * 31;
        return Boolean.hashCode(this.b) + r0;
    }
}
