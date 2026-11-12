package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vy0 {
    public final Context a;
    public final int b;
    public long c;
    public EdgeEffect d;
    public EdgeEffect e;
    public EdgeEffect f;
    public EdgeEffect g;
    public EdgeEffect h;
    public EdgeEffect i;
    public EdgeEffect j;
    public EdgeEffect k;

    public vy0(Context r1, int r2) {
        this.a = r1;
        this.b = r2;
        this.c = 0;
    }

    public static boolean f(EdgeEffect r0) {
        if (r0 != null) goto L6;
        return false;
    L6:
        return !r0.isFinished();
    }

    public static boolean g(EdgeEffect r4) {
        boolean r0 = false;
        if (r4 != null) goto L6;
        return false;
    L6:
        if (Build.VERSION.SDK_INT < 31) goto L8;
        float r5 = qe.b(r4);
    L10:
        if (r5 != 0.0f) goto L13;
        r0 = true;
    L13:
        return !r0;
    L8:
        r5 = 0.0f;
        goto L10
    }

    public final EdgeEffect a(hb3 r7) {
        int r0 = Build.VERSION.SDK_INT;
        Context r2 = this.a;
        if (r0 < 31) goto L5;
        EdgeEffect r1 = qe.a(r2);
    L6:
        r1.setColor(this.b);
        if (n02.a(this.c, 0) == true) goto L13;
        long r3 = this.c;
        if (r7 != hb3.n) goto L12;
        r1.setSize((int) (r3 >> 32), (int) (r3 & 4294967295L));
        return r1;
    L12:
        r1.setSize((int) (4294967295L & r3), (int) (r3 >> 32));
    L13:
        return r1;
    L5:
        r1 = new aj1(r2);
        goto L6
    }

    public final EdgeEffect b() {
        EdgeEffect r0 = this.e;
        if (r0 != null) goto L6;
        EdgeEffect r1 = a(hb3.n);
        this.e = r1;
        return r1;
    L6:
        return r0;
    }

    public final EdgeEffect c() {
        EdgeEffect r0 = this.f;
        if (r0 != null) goto L6;
        EdgeEffect r1 = a(hb3.o);
        this.f = r1;
        return r1;
    L6:
        return r0;
    }

    public final EdgeEffect d() {
        EdgeEffect r0 = this.g;
        if (r0 != null) goto L6;
        EdgeEffect r1 = a(hb3.o);
        this.g = r1;
        return r1;
    L6:
        return r0;
    }

    public final EdgeEffect e() {
        EdgeEffect r0 = this.d;
        if (r0 != null) goto L6;
        EdgeEffect r1 = a(hb3.n);
        this.d = r1;
        return r1;
    L6:
        return r0;
    }
}
