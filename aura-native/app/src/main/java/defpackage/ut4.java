package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ut4 {
    public ut4() {
        super();
    }

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
        if (k == null) {
            k = new ut4();
        }
        return k;
    }

    public final void a(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        float f = displayMetrics.widthPixels;
        float f2 = displayMetrics.heightPixels;
        int max = Math.max(2, Math.min(3, ud3.I()));
        this.d = Math.max(2, Math.round(f / (Math.round(Math.min(f, f2) / max) - 10)));
        if (max == 3) {
            this.e = 15;
        } else if (max == 4) {
            this.e = 10;
        } else if (max == 5) {
            this.e = 6;
        } else if (max != 6) {
            this.e = 20;
        } else {
            this.e = 2;
        }
        this.i = true;
    }

    public final void b(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        float f = displayMetrics.widthPixels;
        float f2 = displayMetrics.heightPixels;
        int max = Math.max(2, Math.min(6, ud3.I()));
        int round = Math.round(Math.min(f, f2) / max) - 10;
        this.a = round;
        this.b = Math.max(2, Math.round(f / round));
        if (max == 3) {
            this.c = 15;
        } else if (max == 4) {
            this.c = 10;
        } else if (max == 5) {
            this.c = 6;
        } else if (max != 6) {
            this.c = 20;
        } else {
            this.c = 2;
        }
        this.h = true;
    }

    public final int d(Context context) {
        if (!this.h) {
            b(context);
        }
        return this.a;
    }
}
