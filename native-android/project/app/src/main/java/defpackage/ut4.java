package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ut4 {
    public static ut4 k;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public boolean j;

    public static ut4 c() {
        if (k != null) goto L6;
        k = new ut4();
    L6:
        return k;
    }

    public final void a(Context r6) {
        DisplayMetrics r7 = r6.getResources().getDisplayMetrics();
        float r0 = r7.widthPixels;
        float r8 = r7.heightPixels;
        int r1 = Math.max(2, Math.min(3, ud3.I()));
        this.d = Math.max(2, Math.round(r0 / (Math.round(Math.min(r0, r8) / r1) - 10)));
        if (r1 != 3) goto L5;
        this.e = 15;
    L14:
        this.i = true;
        return;
    L5:
        if (r1 != 4) goto L7;
        this.e = 10;
        goto L14
    L7:
        if (r1 == 5) goto L11;
        if (r1 == 6) goto L10;
        this.e = 20;
        goto L14
    L10:
        this.e = 2;
        goto L14
    L11:
        this.e = 6;
        goto L14
    }

    public final void b(Context r6) {
        DisplayMetrics r7 = r6.getResources().getDisplayMetrics();
        float r0 = r7.widthPixels;
        float r8 = r7.heightPixels;
        int r1 = Math.max(2, Math.min(6, ud3.I()));
        int r9 = Math.round(Math.min(r0, r8) / r1) - 10;
        this.a = r9;
        this.b = Math.max(2, Math.round(r0 / r9));
        if (r1 != 3) goto L5;
        this.c = 15;
    L14:
        this.h = true;
        return;
    L5:
        if (r1 != 4) goto L7;
        this.c = 10;
        goto L14
    L7:
        if (r1 == 5) goto L11;
        if (r1 == 6) goto L10;
        this.c = 20;
        goto L14
    L10:
        this.c = 2;
        goto L14
    L11:
        this.c = 6;
        goto L14
    }

    public final int d(Context r2) {
        if (this.h == true) goto L6;
        b(r2);
    L6:
        return this.a;
    }
}
