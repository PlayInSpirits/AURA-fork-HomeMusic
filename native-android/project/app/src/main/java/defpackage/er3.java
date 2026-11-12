package defpackage;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class er3 implements jd2 {
    public final Uri a;
    public final yl4 b;
    public final z05 c;
    public final hr3 d;
    public final q90 e;
    public volatile boolean g;
    public long i;
    public ii0 j;
    public wv4 k;
    public boolean l;
    public final /* synthetic */ hr3 m;
    public final t71 f = new t71();
    public boolean h = true;

    public er3(hr3 hr3Var, Uri uri, ci0 ci0Var, z05 z05Var, hr3 hr3Var2, q90 q90Var) {
        this.m = hr3Var;
        this.a = uri;
        this.b = new yl4(ci0Var);
        this.c = z05Var;
        this.d = hr3Var2;
        this.e = q90Var;
        ed2.g.getAndIncrement();
        this.j = c(null, 0L);
    }

    @Override // defpackage.jd2
    public final void a() {
        ci0 gv1Var;
        k51 k51Var;
        int i;
        int iB = 0;
        String str = null;
        while (iB == 0 && !this.g) {
            try {
                long j = this.f.a;
                ii0 ii0VarC = c(str, j);
                this.j = ii0VarC;
                long jB = this.b.b(ii0VarC);
                if (this.g) {
                    if (iB != 1 && this.c.g() != -1) {
                        this.f.a = this.c.g();
                    }
                    fu.k(this.b);
                    return;
                }
                List list = (List) this.b.n.j().get("ETag");
                str = (list == null || list.isEmpty()) ? null : (String) list.get(0);
                if (jB != -1) {
                    jB += j;
                    hr3 hr3Var = this.m;
                    hr3Var.E.post(new ar3(hr3Var, 0));
                }
                long j2 = jB;
                this.m.G = iv1.d(this.b.n.j());
                yl4 yl4Var = this.b;
                iv1 iv1Var = this.m.G;
                if (iv1Var == null || (i = iv1Var.f) == -1) {
                    gv1Var = yl4Var;
                } else {
                    gv1Var = new gv1(yl4Var, i, this);
                    wv4 wv4VarD = this.m.D(new gr3(0, true));
                    this.k = wv4VarD;
                    wv4VarD.g(hr3.f0);
                }
                this.c.h(gv1Var, this.a, this.b.n.j(), j, j2, this.d);
                if (this.m.G != null && (k51Var = (k51) this.c.p) != null && (k51Var instanceof ky2)) {
                    ((ky2) k51Var).s = true;
                }
                if (this.h) {
                    z05 z05Var = this.c;
                    long j3 = this.i;
                    k51 k51Var2 = (k51) z05Var.p;
                    k51Var2.getClass();
                    k51Var2.d(j, j3);
                    this.h = false;
                }
                while (iB == 0 && !this.g) {
                    try {
                        this.e.a();
                        z05 z05Var2 = this.c;
                        t71 t71Var = this.f;
                        k51 k51Var3 = (k51) z05Var2.p;
                        k51Var3.getClass();
                        rk0 rk0Var = (rk0) z05Var2.q;
                        rk0Var.getClass();
                        iB = k51Var3.b(rk0Var, t71Var);
                        long jG = this.c.g();
                        if (jG > this.m.w + j) {
                            q90 q90Var = this.e;
                            synchronized (q90Var) {
                                q90Var.b = false;
                            }
                            hr3 hr3Var2 = this.m;
                            hr3Var2.E.post(hr3Var2.D);
                            j = jG;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (iB == 1) {
                    iB = 0;
                } else if (this.c.g() != -1) {
                    this.f.a = this.c.g();
                }
                fu.k(this.b);
            } catch (Throwable th) {
                if (iB != 1 && this.c.g() != -1) {
                    this.f.a = this.c.g();
                }
                fu.k(this.b);
                throw th;
            }
        }
    }

    @Override // defpackage.jd2
    public final void b() {
        this.g = true;
    }

    public final ii0 c(String str, long j) {
        Map mapF = hr3.e0;
        if (str != null && !str.startsWith("W/")) {
            ue1 ue1VarA = bx1.a();
            ue1VarA.y(mapF.entrySet());
            ue1VarA.x("If-Range", str);
            mapF = ue1VarA.f();
        }
        Map map = Collections.EMPTY_MAP;
        String str2 = this.m.v;
        Uri uri = this.a;
        rr2.s(uri, "The uri must be set.");
        return new ii0(uri, 0L, 1, null, mapF, j, -1L, str2, 6);
    }
}
