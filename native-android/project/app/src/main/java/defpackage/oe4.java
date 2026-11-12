package defpackage;

import androidx.media3.common.PlaybackException;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class oe4 {
    public xm G;
    public xm H;
    public xm I;
    public xm J;
    public boolean K;
    public int L;
    public long M;
    public mi3 a = mi3.b;
    public boolean b = false;
    public int c = 1;
    public int d = 1;
    public int e = 0;
    public PlaybackException f = null;
    public int g = 0;
    public boolean h = false;
    public long i = 5000;
    public long j = 15000;
    public long k = 3000;
    public qh3 l = qh3.d;
    public cw4 m = cw4.J;
    public il n = il.i;
    public float o = 1.0f;
    public float p = 1.0f;
    public s55 q = s55.d;
    public jg0 r = jg0.d;
    public hp0 s = hp0.e;
    public int t = 0;
    public pf4 u = pf4.c;
    public qv2 v = new qv2(-9223372036854775807L, new pv2[0]);
    public yw1 w = gy3.r;
    public cu4 x = cu4.a;
    public jw4 y = null;
    public do2 z = null;
    public do2 A = do2.K;
    public int B = -1;
    public int C = -1;
    public int D = -1;
    public Long E = null;
    public ne4 F = new xm(-9223372036854775807L);

    public oe4() {
        xm xmVar = ne4.k;
        this.G = xmVar;
        this.H = new xm(-9223372036854775807L);
        this.I = xmVar;
        this.J = xmVar;
        this.K = false;
        this.L = 5;
        this.M = 0L;
    }

    public final void a() {
        this.C = -1;
        this.D = -1;
    }

    public final void b(ArrayList arrayList) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < arrayList.size(); i++) {
            rr2.k("Duplicate MediaItemData UID in playlist", hashSet.add(((he4) arrayList.get(i)).a));
        }
        this.w = yw1.k(arrayList);
        this.x = new le4(this.w);
        this.y = null;
        this.z = null;
    }

    public final void c(float f) {
        rr2.l(f >= 0.0f && f <= 1.0f);
        this.p = f != 0.0f ? f : this.o;
        this.o = f;
    }
}
