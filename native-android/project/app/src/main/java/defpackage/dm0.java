package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dm0 implements lt2 {
    public final au a;
    public final bi0 b;
    public om0 c;
    public final long d;
    public final long e;
    public final long f;
    public final float g;
    public final float h;
    public boolean i;

    public dm0(bi0 bi0Var, n51 n51Var) {
        this.b = bi0Var;
        om0 om0Var = new om0(1);
        this.c = om0Var;
        au auVar = new au(n51Var, om0Var);
        this.a = auVar;
        if (bi0Var != ((bi0) auVar.e)) {
            auVar.e = bi0Var;
            ((HashMap) auVar.c).clear();
            ((HashMap) auVar.d).clear();
        }
        this.d = -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.f = -9223372036854775807L;
        this.g = -3.4028235E38f;
        this.h = -3.4028235E38f;
        this.i = true;
    }

    public static lt2 f(Class cls, bi0 bi0Var) {
        try {
            return (lt2) cls.getConstructor(bi0.class).newInstance(bi0Var);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // defpackage.lt2
    public final void a(om0 om0Var) {
        this.c = om0Var;
        au auVar = this.a;
        auVar.f = om0Var;
        ((n51) auVar.b).a(om0Var);
        Iterator it = ((HashMap) auVar.d).values().iterator();
        while (it.hasNext()) {
            ((lt2) it.next()).a(om0Var);
        }
    }

    @Override // defpackage.lt2
    public final void b() {
        au auVar = this.a;
        auVar.getClass();
        ((n51) auVar.b).b();
    }

    @Override // defpackage.lt2
    public final void c(boolean z) {
        this.i = z;
        au auVar = this.a;
        auVar.a = z;
        ((n51) auVar.b).d(z);
        Iterator it = ((HashMap) auVar.d).values().iterator();
        while (it.hasNext()) {
            ((lt2) it.next()).c(z);
        }
    }

    @Override // defpackage.lt2
    public final bq d(gn2 gn2Var) {
        ww0 ww0VarA;
        gn2 gn2VarA = gn2Var;
        gn2VarA.b.getClass();
        String scheme = gn2VarA.b.a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        boolean zEquals = Objects.equals(gn2VarA.b.b, "application/x-image-uri");
        bn2 bn2Var = gn2VarA.b;
        if (zEquals) {
            long j = bn2Var.h;
            String str = f35.a;
            throw null;
        }
        int iJ = f35.J(bn2Var.a, bn2Var.b);
        if (gn2VarA.b.h != -9223372036854775807L) {
            n51 n51Var = (n51) this.a.b;
            if (n51Var instanceof sk0) {
                sk0 sk0Var = (sk0) n51Var;
                synchronized (sk0Var) {
                    sk0Var.f = 1;
                }
            }
            n51 n51Var2 = (n51) this.a.b;
            if (n51Var2 instanceof sk0) {
                sk0 sk0Var2 = (sk0) n51Var2;
                synchronized (sk0Var2) {
                    sk0Var2.g = 1;
                }
            }
        }
        try {
            lt2 lt2VarC = this.a.c(iJ);
            zm2 zm2VarA = gn2VarA.c.a();
            an2 an2Var = gn2VarA.c;
            if (an2Var.a == -9223372036854775807L) {
                zm2VarA.a = this.d;
            }
            if (an2Var.d == -3.4028235E38f) {
                zm2VarA.d = this.g;
            }
            if (an2Var.e == -3.4028235E38f) {
                zm2VarA.e = this.h;
            }
            if (an2Var.b == -9223372036854775807L) {
                zm2VarA.b = this.e;
            }
            if (an2Var.c == -9223372036854775807L) {
                zm2VarA.c = this.f;
            }
            an2 an2Var2 = new an2(zm2VarA);
            if (!an2Var2.equals(gn2VarA.c)) {
                tm2 tm2VarA = gn2VarA.a();
                tm2VarA.l = an2Var2.a();
                gn2VarA = tm2VarA.a();
            }
            bq bqVarD = lt2VarC.d(gn2VarA);
            yw1 yw1Var = gn2VarA.b.g;
            if (!yw1Var.isEmpty()) {
                bq[] bqVarArr = new bq[yw1Var.size() + 1];
                bqVarArr[0] = bqVarD;
                for (int i = 0; i < yw1Var.size(); i++) {
                    if (this.i) {
                        sb1 sb1Var = new sb1();
                        sb1Var.m = lw2.m(((fn2) yw1Var.get(i)).b);
                        sb1Var.d = ((fn2) yw1Var.get(i)).c;
                        sb1Var.e = ((fn2) yw1Var.get(i)).d;
                        sb1Var.f = ((fn2) yw1Var.get(i)).e;
                        sb1Var.b = ((fn2) yw1Var.get(i)).f;
                        sb1Var.a = ((fn2) yw1Var.get(i)).g;
                        final tb1 tb1Var = new tb1(sb1Var);
                        n51 n51Var3 = new n51() { // from class: zl0
                            @Override // defpackage.n51
                            public final k51[] c() {
                                dm0 dm0Var = this.b;
                                om0 om0Var = dm0Var.c;
                                tb1 tb1Var2 = tb1Var;
                                return new k51[]{om0Var.n(tb1Var2) ? new un4(dm0Var.c.C(tb1Var2)) : new cm0(tb1Var2)};
                            }
                        };
                        bi0 bi0Var = this.b;
                        ss2 ss2Var = new ss2(10, n51Var3);
                        Object obj = new Object();
                        i80 i80Var = new i80(28);
                        if (this.c.n(tb1Var)) {
                            sb1 sb1VarA = tb1Var.a();
                            sb1VarA.m = lw2.m("application/x-media3-cues");
                            sb1VarA.j = tb1Var.n;
                            sb1VarA.K = this.c.R(tb1Var);
                            tb1Var = new tb1(sb1VarA);
                        }
                        tb1 tb1Var2 = tb1Var;
                        int i2 = i + 1;
                        String string = ((fn2) yw1Var.get(i)).a.toString();
                        um2 um2Var = new um2();
                        xm2 xm2Var = new xm2();
                        List list = Collections.EMPTY_LIST;
                        gy3 gy3Var = gy3.r;
                        zm2 zm2Var = new zm2();
                        cn2 cn2Var = cn2.d;
                        Uri uri = string == null ? null : Uri.parse(string);
                        rr2.w(((Uri) xm2Var.e) == null || ((UUID) xm2Var.d) != null);
                        bn2 bn2Var2 = uri != null ? new bn2(uri, null, ((UUID) xm2Var.d) != null ? new ym2(xm2Var) : null, null, list, null, gy3Var, -9223372036854775807L) : null;
                        gn2 gn2Var2 = new gn2("", new wm2(um2Var), bn2Var2, new an2(zm2Var), do2.K, cn2Var);
                        bn2Var2.getClass();
                        gn2Var2.b.getClass();
                        ym2 ym2Var = gn2Var2.b.c;
                        if (ym2Var == null) {
                            ww0VarA = ww0.a;
                        } else {
                            synchronized (obj) {
                                try {
                                    ww0VarA = !ym2Var.equals(null) ? yc5.a(ym2Var) : null;
                                    ww0VarA.getClass();
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        bqVarArr[i2] = new kr3(gn2Var2, bi0Var, ss2Var, ww0VarA, i80Var, 1048576, tb1Var2);
                    } else {
                        bi0 bi0Var2 = this.b;
                        bi0Var2.getClass();
                        bqVarArr[i + 1] = new hf4((fn2) yw1Var.get(i), bi0Var2, new i80(28));
                    }
                }
                bqVarD = new ov2(bqVarArr);
            }
            wm2 wm2Var = gn2VarA.e;
            if (wm2Var.b != 0 || wm2Var.d != Long.MIN_VALUE || wm2Var.f) {
                c40 c40Var = new c40(bqVarD);
                long j2 = wm2Var.b;
                rr2.l(j2 >= 0);
                rr2.w(!c40Var.h);
                c40Var.b = j2;
                long j3 = wm2Var.d;
                rr2.w(!c40Var.h);
                c40Var.c = j3;
                boolean z = !wm2Var.g;
                rr2.w(!c40Var.h);
                c40Var.d = z;
                boolean z2 = wm2Var.e;
                rr2.w(!c40Var.h);
                c40Var.e = z2;
                boolean z3 = wm2Var.f;
                rr2.w(!c40Var.h);
                c40Var.f = z3;
                boolean z4 = wm2Var.h;
                rr2.w(!c40Var.h);
                c40Var.g = z4;
                c40Var.h = true;
                bqVarD = new e40(c40Var);
            }
            gn2VarA.b.getClass();
            if (gn2VarA.b.d == null) {
                return bqVarD;
            }
            l93.q0("DMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
            return bqVarD;
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // defpackage.lt2
    public final lt2 e(yc5 yc5Var) {
        rr2.s(yc5Var, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        au auVar = this.a;
        auVar.g = yc5Var;
        Iterator it = ((HashMap) auVar.d).values().iterator();
        while (it.hasNext()) {
            ((lt2) it.next()).e(yc5Var);
        }
        return this;
    }

    public dm0(Context context, sk0 sk0Var) {
        this(new rf2(context), sk0Var);
    }
}
