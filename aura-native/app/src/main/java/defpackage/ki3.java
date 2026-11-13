package defpackage;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
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
    public tu j = new tu();
    public yp4 k;
    public Pair l;
    public int m;
    public int n;
    public long o;
    public int p;

    public ki3(fi3 fi3Var) {
        this.a = fi3Var.a;
        ii3 ii3Var = fi3Var.c;
        ii3Var.getClass();
        this.b = ii3Var;
        this.c = new SparseArray();
        vw1 vw1Var = yw1.o;
        gy3 gy3Var = gy3.r;
        this.d = fi3Var.d;
        vp4 vp4Var = fi3Var.e;
        this.f = vp4Var;
        long j = fi3Var.g;
        this.h = j != -9223372036854775807L ? -j : -9223372036854775807L;
        f55 f55Var = fi3Var.h;
        this.i = f55Var;
        this.e = new tn0(fi3Var.b, f55Var, vp4Var);
        this.g = new CopyOnWriteArraySet();
        new tb1(new sb1());
        this.o = -9223372036854775807L;
        this.p = -1;
        this.n = 0;
    }
}
