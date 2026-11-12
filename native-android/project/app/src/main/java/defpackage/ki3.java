package defpackage;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ki3 {
    public final Context a;
    public final ii3 b;
    public final SparseArray c;
    public final boolean d;
    public final tn0 e;
    public final vp4 f;
    public final CopyOnWriteArraySet g;
    public final long h;
    public final f55 i;
    public tu j;
    public yp4 k;
    public Pair l;
    public int m;
    public int n;
    public long o;
    public int p;

    static {
    }

    public ki3(fi3 r7) {
        this.a = r7.a;
        this.j = new tu();
        ii3 r0 = r7.c;
        r0.getClass();
        this.b = r0;
        this.c = new SparseArray();
        vw1 r1 = yw1.o;
        gy3 r2 = gy3.r;
        this.d = r7.d;
        vp4 r3 = r7.e;
        this.f = r3;
        long r4 = r7.g;
        if (r4 == (-9223372036854775807L)) goto L5;
        long r5 = -r4;
    L6:
        this.h = r5;
        f55 r6 = r7.h;
        this.i = r6;
        this.e = new tn0(r7.b, r6, r3);
        this.g = new CopyOnWriteArraySet();
        new tb1(new sb1());
        this.o = -9223372036854775807L;
        this.p = -1;
        this.n = 0;
        return;
    L5:
        r5 = -9223372036854775807L;
        goto L6
    }
}
