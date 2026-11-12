package defpackage;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hk2 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public hk2(boolean r1, boolean r2, String r3) {
        this.a = r3;
        this.b = r1;
        this.c = r2;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L17:
        return false;
    L8:
        if (r5.getClass() != hk2.class) goto L17;
        hk2 r6 = (hk2) r5;
        if (TextUtils.equals(this.a, r6.a) == false) goto L17;
        if (this.b != r6.b) goto L17;
        if (this.c != r6.c) goto L17;
        return true;
    }

    public final int hashCode() {
        int r0 = f34.e(this.a, 31, 31);
        int r3 = 1237;
        if (this.b == false) goto L5;
        int r2 = 1231;
    L6:
        int r1 = (r0 + r2) * 31;
        if (this.c == false) goto L10;
        r3 = 1231;
    L10:
        return r1 + r3;
    L5:
        r2 = 1237;
        goto L6
    }
}
