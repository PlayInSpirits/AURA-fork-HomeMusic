package defpackage;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mn1 {
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public mn1(int r1, int r2, String r3, String r4, String r5, String r6) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
        this.f = r6;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L23:
        return false;
    L8:
        if (mn1.class != r5.getClass()) goto L23;
        mn1 r6 = (mn1) r5;
        if (this.a != r6.a) goto L23;
        if (this.b != r6.b) goto L23;
        if (TextUtils.equals(this.c, r6.c) == false) goto L23;
        if (TextUtils.equals(this.d, r6.d) == false) goto L23;
        if (TextUtils.equals(this.e, r6.e) == false) goto L23;
        if (TextUtils.equals(this.f, r6.f) == false) goto L23;
        return true;
    }

    public final int hashCode() {
        int r0 = ((this.a * 31) + this.b) * 31;
        int r1 = 0;
        String r2 = this.c;
        if (r2 == null) goto L5;
        int r3 = r2.hashCode();
    L6:
        int r4 = (r0 + r3) * 31;
        String r5 = this.d;
        if (r5 == null) goto L9;
        int r6 = r5.hashCode();
    L10:
        int r7 = (r4 + r6) * 31;
        String r8 = this.e;
        if (r8 == null) goto L13;
        int r9 = r8.hashCode();
    L14:
        int r10 = (r7 + r9) * 31;
        String r11 = this.f;
        if (r11 == null) goto L18;
        r1 = r11.hashCode();
    L18:
        return r10 + r1;
    L13:
        r9 = 0;
        goto L14
    L9:
        r6 = 0;
        goto L10
    L5:
        r3 = 0;
        goto L6
    }
}
