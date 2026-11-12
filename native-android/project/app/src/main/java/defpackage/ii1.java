package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ii1 extends ContextWrapper {
    public static final ch1 k = null;
    public final qj0 a;
    public final sd0 b;
    public final tv1 c;
    public final fi1 d;
    public final List e;
    public final oi f;
    public final i11 g;
    public final d34 h;
    public final int i;
    public g04 j;

    static {
        k = new ch1();
    }

    public ii1(Context r1, qj0 r2, ll r3, tv1 r4, fi1 r5, oi r6, List r7, i11 r8, d34 r9, int r10) {
        super(r1.getApplicationContext());
        this.a = r2;
        this.c = r4;
        this.d = r5;
        this.e = r7;
        this.f = r6;
        this.g = r8;
        this.h = r9;
        this.i = r10;
        this.b = new sd0(r3);
    }

    public final ey3 a() {
        return (ey3) this.b.get();
    }
}
