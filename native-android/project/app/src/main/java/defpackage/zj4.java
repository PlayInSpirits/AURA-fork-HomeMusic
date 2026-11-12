package defpackage;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zj4 {
    public static final xx0 n = null;
    public static final xx0 o = null;
    public static final xx0 p = null;
    public static final xx0 q = null;
    public static final xx0 r = null;
    public static final xx0 s = null;
    public float a;
    public float b;
    public boolean c;
    public final gp0 d;
    public final fp0 e;
    public boolean f;
    public long g;
    public final float h;
    public final ArrayList i;
    public final ArrayList j;
    public ak4 k;
    public float l;
    public boolean m;

    static {
        n = new xx0();
        o = new xx0();
        p = new xx0();
        q = new xx0();
        r = new xx0();
        s = new xx0();
    }

    public zj4(gp0 r6) {
        fp0 r0 = gp0.D;
        this.a = 0.0f;
        this.b = Float.MAX_VALUE;
        this.c = false;
        this.f = false;
        this.g = 0;
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.d = r6;
        this.e = r0;
        if (r0 != p) goto L5;
    L19:
        this.h = 0.1f;
    L20:
        this.k = null;
        this.l = Float.MAX_VALUE;
        this.m = false;
        return;
    L5:
        if (r0 == q) goto L19;
        if (r0 == r) goto L19;
        if (r0 != s) goto L13;
        this.h = 0.00390625f;
        goto L20
    L13:
        if (r0 != n) goto L15;
    L18:
        this.h = 0.00390625f;
        goto L20
    L15:
        if (r0 == o) goto L18;
        this.h = 1.0f;
        goto L20
    }

    public final void a(float r3) {
        this.e.getClass();
        gp0 r0 = this.d;
        r0.B = r3 / 10000.0f;
        r0.invalidateSelf();
        int r4 = 0;
    L3:
        ArrayList r1 = this.j;
        if (r4 >= r1.size()) goto L10;
        if (r1.get(r4) != null) goto L8;
        r4 = r4 + 1;
        goto L3
    L8:
        r1.get(r4).getClass();
        kf2.k();
        return;
    L10:
        int r2 = r1.size() - 1;
    L11:
        if (r2 < 0) goto L16;
        if (r1.get(r2) != null) goto L15;
        r1.remove(r2);
    L15:
        r2 = r2 - 1;
        goto L11
    }

    public final void b() {
        if (this.k.b > 0.0d) goto L5;
        er1.l("Spring animations can only come to an end when there is damping");
        return;
    L5:
        if (Looper.myLooper() != Looper.getMainLooper()) goto L11;
        if (this.f == false) goto L14;
        this.m = true;
        return;
    L14:
        return;
    L11:
        throw new AndroidRuntimeException("Animations may only be started on the main thread");
    }
}
