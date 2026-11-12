package defpackage;

import android.os.RemoteException;
import androidx.media3.common.PlaybackException;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xr2 implements oi3 {
    public final WeakReference n;
    public final WeakReference o;

    public xr2(tn2 tn2Var, al3 al3Var) {
        this.n = new WeakReference(tn2Var);
        this.o = new WeakReference(al3Var);
    }

    @Override // defpackage.oi3
    public final void A(jw4 jw4Var) {
        tn2 tn2VarC = c();
        if (tn2VarC == null) {
            return;
        }
        tn2VarC.F();
        if (((al3) this.o.get()) == null) {
            return;
        }
        tn2VarC.r = tn2VarC.r.b(jw4Var);
        tn2VarC.c.a(true, false);
        tn2VarC.f(new er1(27));
    }

    @Override // defpackage.oi3
    public final void C(int i, boolean z) {
        tn2 tn2VarC = c();
        if (tn2VarC == null) {
            return;
        }
        tn2VarC.F();
        if (((al3) this.o.get()) == null) {
            return;
        }
        tn2VarC.r = tn2VarC.r.c(i, z);
        tn2VarC.c.a(true, true);
        try {
            is2 is2Var = ((ls2) tn2VarC.h.i.r).p;
            if (is2Var != null) {
                if (z) {
                    i = 0;
                }
                is2Var.d = i;
                is2Var.a().setCurrentVolume(i);
            }
        } catch (RemoteException e) {
            l93.G("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.oi3
    public final void E(long j) {
        tn2 tn2VarC = c();
        if (tn2VarC == null) {
            return;
        }
        tn2VarC.F();
        if (((al3) this.o.get()) == null) {
            return;
        }
        lk3 lk3Var = tn2VarC.r;
        PlaybackException playbackException = lk3Var.a;
        int i = lk3Var.b;
        za4 za4Var = lk3Var.c;
        pi3 pi3Var = lk3Var.d;
        pi3 pi3Var2 = lk3Var.e;
        int i2 = lk3Var.f;
        qh3 qh3Var = lk3Var.g;
        int i3 = lk3Var.h;
        boolean z = lk3Var.i;
        cu4 cu4Var = lk3Var.j;
        int i4 = lk3Var.k;
        s55 s55Var = lk3Var.l;
        do2 do2Var = lk3Var.m;
        float f = lk3Var.n;
        float f2 = lk3Var.o;
        int i5 = lk3Var.p;
        il ilVar = lk3Var.q;
        jg0 jg0Var = lk3Var.r;
        hp0 hp0Var = lk3Var.s;
        int i6 = lk3Var.t;
        boolean z2 = lk3Var.u;
        boolean z3 = lk3Var.v;
        int i7 = lk3Var.w;
        boolean z4 = lk3Var.x;
        boolean z5 = lk3Var.y;
        int i8 = lk3Var.z;
        int i9 = lk3Var.A;
        do2 do2Var2 = lk3Var.B;
        long j2 = lk3Var.D;
        long j3 = lk3Var.E;
        jw4 jw4Var = lk3Var.F;
        cw4 cw4Var = lk3Var.G;
        rr2.w(cu4Var.p() || za4Var.a.b < cu4Var.o());
        tn2VarC.r = new lk3(playbackException, i, za4Var, pi3Var, pi3Var2, i2, qh3Var, i3, z, s55Var, cu4Var, i4, do2Var, f, f2, ilVar, i5, jg0Var, hp0Var, i6, z2, z3, i7, i8, i9, z4, z5, do2Var2, j, j2, j3, jw4Var, cw4Var);
        tn2VarC.c.a(true, true);
        try {
            tn2VarC.h.i.getClass();
        } catch (RemoteException e) {
            l93.G("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.oi3
    public final void F(do2 do2Var) {
        tn2 tn2VarC = c();
        if (tn2VarC == null) {
            return;
        }
        tn2VarC.F();
        if (((al3) this.o.get()) == null) {
            return;
        }
        lk3 lk3Var = tn2VarC.r;
        PlaybackException playbackException = lk3Var.a;
        int i = lk3Var.b;
        za4 za4Var = lk3Var.c;
        pi3 pi3Var = lk3Var.d;
        pi3 pi3Var2 = lk3Var.e;
        int i2 = lk3Var.f;
        qh3 qh3Var = lk3Var.g;
        int i3 = lk3Var.h;
        boolean z = lk3Var.i;
        cu4 cu4Var = lk3Var.j;
        int i4 = lk3Var.k;
        s55 s55Var = lk3Var.l;
        do2 do2Var2 = lk3Var.m;
        float f = lk3Var.n;
        float f2 = lk3Var.o;
        int i5 = lk3Var.p;
        il ilVar = lk3Var.q;
        jg0 jg0Var = lk3Var.r;
        hp0 hp0Var = lk3Var.s;
        int i6 = lk3Var.t;
        boolean z2 = lk3Var.u;
        boolean z3 = lk3Var.v;
        int i7 = lk3Var.w;
        boolean z4 = lk3Var.x;
        boolean z5 = lk3Var.y;
        int i8 = lk3Var.z;
        int i9 = lk3Var.A;
        long j = lk3Var.C;
        long j2 = lk3Var.D;
        long j3 = lk3Var.E;
        jw4 jw4Var = lk3Var.F;
        cw4 cw4Var = lk3Var.G;
        rr2.w(cu4Var.p() || za4Var.a.b < cu4Var.o());
        tn2VarC.r = new lk3(playbackException, i, za4Var, pi3Var, pi3Var2, i2, qh3Var, i3, z, s55Var, cu4Var, i4, do2Var2, f, f2, ilVar, i5, jg0Var, hp0Var, i6, z2, z3, i7, i8, i9, z4, z5, do2Var, j, j2, j3, jw4Var, cw4Var);
        tn2VarC.c.a(true, true);
        try {
            tn2VarC.h.i.x();
        } catch (RemoteException e) {
            l93.G("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.oi3
    public final void G(do2 do2Var) {
        tn2 tn2VarC = c();
        if (tn2VarC == null) {
            return;
        }
        tn2VarC.F();
        tn2VarC.r = tn2VarC.r.g(do2Var);
        tn2VarC.c.a(true, true);
        try {
            tn2VarC.h.i.q(do2Var);
        } catch (RemoteException e) {
            l93.G("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.oi3
    public final void H(long j) {
        tn2 tn2VarC = c();
        if (tn2VarC == null) {
            return;
        }
        tn2VarC.F();
        if (((al3) this.o.get()) == null) {
            return;
        }
        lk3 lk3Var = tn2VarC.r;
        PlaybackException playbackException = lk3Var.a;
        int i = lk3Var.b;
        za4 za4Var = lk3Var.c;
        pi3 pi3Var = lk3Var.d;
        pi3 pi3Var2 = lk3Var.e;
        int i2 = lk3Var.f;
        qh3 qh3Var = lk3Var.g;
        int i3 = lk3Var.h;
        boolean z = lk3Var.i;
        cu4 cu4Var = lk3Var.j;
        int i4 = lk3Var.k;
        s55 s55Var = lk3Var.l;
        do2 do2Var = lk3Var.m;
        float f = lk3Var.n;
        float f2 = lk3Var.o;
        int i5 = lk3Var.p;
        il ilVar = lk3Var.q;
        jg0 jg0Var = lk3Var.r;
        hp0 hp0Var = lk3Var.s;
        int i6 = lk3Var.t;
        boolean z2 = lk3Var.u;
        boolean z3 = lk3Var.v;
        int i7 = lk3Var.w;
        boolean z4 = lk3Var.x;
        boolean z5 = lk3Var.y;
        int i8 = lk3Var.z;
        int i9 = lk3Var.A;
        do2 do2Var2 = lk3Var.B;
        long j2 = lk3Var.C;
        long j3 = lk3Var.E;
        jw4 jw4Var = lk3Var.F;
        cw4 cw4Var = lk3Var.G;
        rr2.w(cu4Var.p() || za4Var.a.b < cu4Var.o());
        tn2VarC.r = new lk3(playbackException, i, za4Var, pi3Var, pi3Var2, i2, qh3Var, i3, z, s55Var, cu4Var, i4, do2Var, f, f2, ilVar, i5, jg0Var, hp0Var, i6, z2, z3, i7, i8, i9, z4, z5, do2Var2, j2, j, j3, jw4Var, cw4Var);
        tn2VarC.c.a(true, true);
        try {
            tn2VarC.h.i.getClass();
        } catch (RemoteException e) {
            l93.G("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.oi3
    public final void I(cu4 cu4Var, int i) {
        tn2 tn2VarC = c();
        if (tn2VarC == null) {
            return;
        }
        tn2VarC.F();
        al3 al3Var = (al3) this.o.get();
        if (al3Var == null) {
            return;
        }
        tn2VarC.r = tn2VarC.r.n(cu4Var, al3Var.X0(), i);
        tn2VarC.c.a(false, true);
        try {
            tn2VarC.h.i.w(cu4Var);
        } catch (RemoteException e) {
            l93.G("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.oi3
    public final void J() {
        tn2 tn2VarC = c();
        if (tn2VarC == null) {
            return;
        }
        tn2VarC.F();
        na4 na4Var = tn2VarC.g.f;
        yw1 yw1VarU = na4Var.u();
        for (int i = 0; i < yw1VarU.size(); i++) {
            fr2 fr2Var = (fr2) yw1VarU.get(i);
            na4Var.A(fr2Var);
            tn2VarC.e(fr2Var, new er1(29));
        }
    }

    @Override // defpackage.oi3
    public final void N(qh3 qh3Var) {
        tn2 tn2VarC = c();
        if (tn2VarC == null) {
            return;
        }
        tn2VarC.F();
        if (((al3) this.o.get()) == null) {
            return;
        }
        tn2VarC.r = tn2VarC.r.e(qh3Var);
        tn2VarC.c.a(true, true);
        try {
            ls2 ls2Var = (ls2) tn2VarC.h.i.r;
            ls2Var.P(ls2Var.g.s);
        } catch (RemoteException e) {
            l93.G("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.oi3
    public final void O(mi3 mi3Var) {
        tn2 tn2VarC = c();
        if (tn2VarC == null) {
            return;
        }
        tn2VarC.F();
        if (((al3) this.o.get()) == null) {
            return;
        }
        tn2VarC.h(mi3Var);
    }

    @Override // defpackage.oi3
    public final void Q(hp0 hp0Var) {
        tn2 tn2VarC = c();
        if (tn2VarC == null) {
            return;
        }
        tn2VarC.F();
        if (((al3) this.o.get()) == null) {
            return;
        }
        lk3 lk3Var = tn2VarC.r;
        PlaybackException playbackException = lk3Var.a;
        int i = lk3Var.b;
        za4 za4Var = lk3Var.c;
        pi3 pi3Var = lk3Var.d;
        pi3 pi3Var2 = lk3Var.e;
        int i2 = lk3Var.f;
        qh3 qh3Var = lk3Var.g;
        int i3 = lk3Var.h;
        boolean z = lk3Var.i;
        cu4 cu4Var = lk3Var.j;
        int i4 = lk3Var.k;
        s55 s55Var = lk3Var.l;
        do2 do2Var = lk3Var.m;
        float f = lk3Var.n;
        float f2 = lk3Var.o;
        int i5 = lk3Var.p;
        il ilVar = lk3Var.q;
        jg0 jg0Var = lk3Var.r;
        int i6 = lk3Var.t;
        boolean z2 = lk3Var.u;
        boolean z3 = lk3Var.v;
        int i7 = lk3Var.w;
        boolean z4 = lk3Var.x;
        boolean z5 = lk3Var.y;
        int i8 = lk3Var.z;
        int i9 = lk3Var.A;
        do2 do2Var2 = lk3Var.B;
        long j = lk3Var.C;
        long j2 = lk3Var.D;
        long j3 = lk3Var.E;
        jw4 jw4Var = lk3Var.F;
        cw4 cw4Var = lk3Var.G;
        rr2.w(cu4Var.p() || za4Var.a.b < cu4Var.o());
        tn2VarC.r = new lk3(playbackException, i, za4Var, pi3Var, pi3Var2, i2, qh3Var, i3, z, s55Var, cu4Var, i4, do2Var, f, f2, ilVar, i5, jg0Var, hp0Var, i6, z2, z3, i7, i8, i9, z4, z5, do2Var2, j, j2, j3, jw4Var, cw4Var);
        tn2VarC.c.a(true, true);
        try {
            tn2VarC.h.i.j();
        } catch (RemoteException e) {
            l93.G("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.oi3
    public final void R(long j) {
        tn2 tn2VarC = c();
        if (tn2VarC == null) {
            return;
        }
        tn2VarC.F();
        if (((al3) this.o.get()) == null) {
            return;
        }
        lk3 lk3Var = tn2VarC.r;
        PlaybackException playbackException = lk3Var.a;
        int i = lk3Var.b;
        za4 za4Var = lk3Var.c;
        pi3 pi3Var = lk3Var.d;
        pi3 pi3Var2 = lk3Var.e;
        int i2 = lk3Var.f;
        qh3 qh3Var = lk3Var.g;
        int i3 = lk3Var.h;
        boolean z = lk3Var.i;
        cu4 cu4Var = lk3Var.j;
        int i4 = lk3Var.k;
        s55 s55Var = lk3Var.l;
        do2 do2Var = lk3Var.m;
        float f = lk3Var.n;
        float f2 = lk3Var.o;
        int i5 = lk3Var.p;
        il ilVar = lk3Var.q;
        jg0 jg0Var = lk3Var.r;
        hp0 hp0Var = lk3Var.s;
        int i6 = lk3Var.t;
        boolean z2 = lk3Var.u;
        boolean z3 = lk3Var.v;
        int i7 = lk3Var.w;
        boolean z4 = lk3Var.x;
        boolean z5 = lk3Var.y;
        int i8 = lk3Var.z;
        int i9 = lk3Var.A;
        do2 do2Var2 = lk3Var.B;
        long j2 = lk3Var.C;
        long j3 = lk3Var.D;
        jw4 jw4Var = lk3Var.F;
        cw4 cw4Var = lk3Var.G;
        rr2.w(cu4Var.p() || za4Var.a.b < cu4Var.o());
        tn2VarC.r = new lk3(playbackException, i, za4Var, pi3Var, pi3Var2, i2, qh3Var, i3, z, s55Var, cu4Var, i4, do2Var, f, f2, ilVar, i5, jg0Var, hp0Var, i6, z2, z3, i7, i8, i9, z4, z5, do2Var2, j2, j3, j, jw4Var, cw4Var);
        tn2VarC.c.a(true, true);
    }

    @Override // defpackage.oi3
    public final void S(PlaybackException playbackException) {
        tn2 tn2VarC = c();
        if (tn2VarC == null) {
            return;
        }
        tn2VarC.F();
        if (((al3) this.o.get()) == null) {
            return;
        }
        lk3 lk3Var = tn2VarC.r;
        int i = lk3Var.b;
        za4 za4Var = lk3Var.c;
        pi3 pi3Var = lk3Var.d;
        pi3 pi3Var2 = lk3Var.e;
        int i2 = lk3Var.f;
        qh3 qh3Var = lk3Var.g;
        int i3 = lk3Var.h;
        boolean z = lk3Var.i;
        cu4 cu4Var = lk3Var.j;
        int i4 = lk3Var.k;
        s55 s55Var = lk3Var.l;
        do2 do2Var = lk3Var.m;
        float f = lk3Var.n;
        float f2 = lk3Var.o;
        int i5 = lk3Var.p;
        il ilVar = lk3Var.q;
        jg0 jg0Var = lk3Var.r;
        hp0 hp0Var = lk3Var.s;
        int i6 = lk3Var.t;
        boolean z2 = lk3Var.u;
        boolean z3 = lk3Var.v;
        int i7 = lk3Var.w;
        boolean z4 = lk3Var.x;
        boolean z5 = lk3Var.y;
        int i8 = lk3Var.z;
        int i9 = lk3Var.A;
        do2 do2Var2 = lk3Var.B;
        long j = lk3Var.C;
        long j2 = lk3Var.D;
        long j3 = lk3Var.E;
        jw4 jw4Var = lk3Var.F;
        cw4 cw4Var = lk3Var.G;
        rr2.w(cu4Var.p() || za4Var.a.b < cu4Var.o());
        tn2VarC.r = new lk3(playbackException, i, za4Var, pi3Var, pi3Var2, i2, qh3Var, i3, z, s55Var, cu4Var, i4, do2Var, f, f2, ilVar, i5, jg0Var, hp0Var, i6, z2, z3, i7, i8, i9, z4, z5, do2Var2, j, j2, j3, jw4Var, cw4Var);
        tn2VarC.c.a(true, true);
        try {
            ls2 ls2Var = (ls2) tn2VarC.h.i.r;
            ls2Var.P(ls2Var.g.s);
        } catch (RemoteException e) {
            l93.G("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.oi3
    public final void T(int i, int i2) {
        tn2 tn2VarC = c();
        if (tn2VarC == null) {
            return;
        }
        tn2VarC.F();
        if (((al3) this.o.get()) == null) {
            return;
        }
        tn2VarC.f(new v31(i, i2, 3));
    }

    @Override // defpackage.oi3
    public final void V(boolean z) {
        tn2 tn2VarC = c();
        if (tn2VarC == null) {
            return;
        }
        tn2VarC.F();
        if (((al3) this.o.get()) == null) {
            return;
        }
        lk3 lk3Var = tn2VarC.r;
        PlaybackException playbackException = lk3Var.a;
        int i = lk3Var.b;
        za4 za4Var = lk3Var.c;
        pi3 pi3Var = lk3Var.d;
        pi3 pi3Var2 = lk3Var.e;
        int i2 = lk3Var.f;
        qh3 qh3Var = lk3Var.g;
        int i3 = lk3Var.h;
        boolean z2 = lk3Var.i;
        cu4 cu4Var = lk3Var.j;
        int i4 = lk3Var.k;
        s55 s55Var = lk3Var.l;
        do2 do2Var = lk3Var.m;
        float f = lk3Var.n;
        float f2 = lk3Var.o;
        int i5 = lk3Var.p;
        il ilVar = lk3Var.q;
        jg0 jg0Var = lk3Var.r;
        hp0 hp0Var = lk3Var.s;
        int i6 = lk3Var.t;
        boolean z3 = lk3Var.u;
        boolean z4 = lk3Var.v;
        int i7 = lk3Var.w;
        boolean z5 = lk3Var.y;
        int i8 = lk3Var.z;
        int i9 = lk3Var.A;
        do2 do2Var2 = lk3Var.B;
        long j = lk3Var.C;
        long j2 = lk3Var.D;
        long j3 = lk3Var.E;
        jw4 jw4Var = lk3Var.F;
        cw4 cw4Var = lk3Var.G;
        rr2.w(cu4Var.p() || za4Var.a.b < cu4Var.o());
        tn2VarC.r = new lk3(playbackException, i, za4Var, pi3Var, pi3Var2, i2, qh3Var, i3, z2, s55Var, cu4Var, i4, do2Var, f, f2, ilVar, i5, jg0Var, hp0Var, i6, z3, z4, i7, i8, i9, z, z5, do2Var2, j, j2, j3, jw4Var, cw4Var);
        tn2VarC.c.a(true, true);
        try {
            ls2 ls2Var = (ls2) tn2VarC.h.i.r;
            ls2Var.P(ls2Var.g.s);
        } catch (RemoteException e) {
            l93.G("MediaSessionImpl", "Exception in using media1 API", e);
        }
        tn2VarC.C();
    }

    @Override // defpackage.oi3
    public final void a(s55 s55Var) {
        tn2 tn2VarC = c();
        if (tn2VarC == null) {
            return;
        }
        tn2VarC.F();
        lk3 lk3Var = tn2VarC.r;
        PlaybackException playbackException = lk3Var.a;
        int i = lk3Var.b;
        za4 za4Var = lk3Var.c;
        pi3 pi3Var = lk3Var.d;
        pi3 pi3Var2 = lk3Var.e;
        int i2 = lk3Var.f;
        qh3 qh3Var = lk3Var.g;
        int i3 = lk3Var.h;
        boolean z = lk3Var.i;
        cu4 cu4Var = lk3Var.j;
        int i4 = lk3Var.k;
        do2 do2Var = lk3Var.m;
        float f = lk3Var.n;
        float f2 = lk3Var.o;
        int i5 = lk3Var.p;
        il ilVar = lk3Var.q;
        jg0 jg0Var = lk3Var.r;
        hp0 hp0Var = lk3Var.s;
        int i6 = lk3Var.t;
        boolean z2 = lk3Var.u;
        boolean z3 = lk3Var.v;
        int i7 = lk3Var.w;
        boolean z4 = lk3Var.x;
        boolean z5 = lk3Var.y;
        int i8 = lk3Var.z;
        int i9 = lk3Var.A;
        do2 do2Var2 = lk3Var.B;
        long j = lk3Var.C;
        long j2 = lk3Var.D;
        long j3 = lk3Var.E;
        jw4 jw4Var = lk3Var.F;
        cw4 cw4Var = lk3Var.G;
        rr2.w(cu4Var.p() || za4Var.a.b < cu4Var.o());
        tn2VarC.r = new lk3(playbackException, i, za4Var, pi3Var, pi3Var2, i2, qh3Var, i3, z, s55Var, cu4Var, i4, do2Var, f, f2, ilVar, i5, jg0Var, hp0Var, i6, z2, z3, i7, i8, i9, z4, z5, do2Var2, j, j2, j3, jw4Var, cw4Var);
        tn2VarC.c.a(true, true);
        try {
            tn2VarC.h.i.getClass();
        } catch (RemoteException e) {
            l93.G("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.oi3
    public final void b(int i) {
        tn2 tn2VarC = c();
        if (tn2VarC == null) {
            return;
        }
        tn2VarC.F();
        if (((al3) this.o.get()) == null) {
            return;
        }
        lk3 lk3Var = tn2VarC.r;
        PlaybackException playbackException = lk3Var.a;
        int i2 = lk3Var.b;
        za4 za4Var = lk3Var.c;
        pi3 pi3Var = lk3Var.d;
        pi3 pi3Var2 = lk3Var.e;
        int i3 = lk3Var.f;
        qh3 qh3Var = lk3Var.g;
        int i4 = lk3Var.h;
        boolean z = lk3Var.i;
        cu4 cu4Var = lk3Var.j;
        int i5 = lk3Var.k;
        s55 s55Var = lk3Var.l;
        do2 do2Var = lk3Var.m;
        float f = lk3Var.n;
        float f2 = lk3Var.o;
        il ilVar = lk3Var.q;
        jg0 jg0Var = lk3Var.r;
        hp0 hp0Var = lk3Var.s;
        int i6 = lk3Var.t;
        boolean z2 = lk3Var.u;
        boolean z3 = lk3Var.v;
        int i7 = lk3Var.w;
        boolean z4 = lk3Var.x;
        boolean z5 = lk3Var.y;
        int i8 = lk3Var.z;
        int i9 = lk3Var.A;
        do2 do2Var2 = lk3Var.B;
        long j = lk3Var.C;
        long j2 = lk3Var.D;
        long j3 = lk3Var.E;
        jw4 jw4Var = lk3Var.F;
        cw4 cw4Var = lk3Var.G;
        rr2.w(cu4Var.p() || za4Var.a.b < cu4Var.o());
        tn2VarC.r = new lk3(playbackException, i2, za4Var, pi3Var, pi3Var2, i3, qh3Var, i4, z, s55Var, cu4Var, i5, do2Var, f, f2, ilVar, i, jg0Var, hp0Var, i6, z2, z3, i7, i8, i9, z4, z5, do2Var2, j, j2, j3, jw4Var, cw4Var);
        tn2VarC.c.a(true, true);
        try {
            tn2VarC.h.i.getClass();
        } catch (RemoteException e) {
            l93.G("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    public final tn2 c() {
        return (tn2) this.n.get();
    }

    @Override // defpackage.oi3
    public final void e(jg0 jg0Var) {
        tn2 tn2VarC = c();
        if (tn2VarC == null) {
            return;
        }
        tn2VarC.F();
        if (((al3) this.o.get()) == null) {
            return;
        }
        lk3 lk3Var = tn2VarC.r;
        PlaybackException playbackException = lk3Var.a;
        int i = lk3Var.b;
        za4 za4Var = lk3Var.c;
        pi3 pi3Var = lk3Var.d;
        pi3 pi3Var2 = lk3Var.e;
        int i2 = lk3Var.f;
        qh3 qh3Var = lk3Var.g;
        int i3 = lk3Var.h;
        boolean z = lk3Var.i;
        cu4 cu4Var = lk3Var.j;
        int i4 = lk3Var.k;
        s55 s55Var = lk3Var.l;
        do2 do2Var = lk3Var.m;
        float f = lk3Var.n;
        float f2 = lk3Var.o;
        int i5 = lk3Var.p;
        il ilVar = lk3Var.q;
        hp0 hp0Var = lk3Var.s;
        int i6 = lk3Var.t;
        boolean z2 = lk3Var.u;
        boolean z3 = lk3Var.v;
        int i7 = lk3Var.w;
        boolean z4 = lk3Var.x;
        boolean z5 = lk3Var.y;
        int i8 = lk3Var.z;
        int i9 = lk3Var.A;
        do2 do2Var2 = lk3Var.B;
        long j = lk3Var.C;
        long j2 = lk3Var.D;
        long j3 = lk3Var.E;
        jw4 jw4Var = lk3Var.F;
        cw4 cw4Var = lk3Var.G;
        rr2.w(cu4Var.p() || za4Var.a.b < cu4Var.o());
        tn2VarC.r = new lk3(playbackException, i, za4Var, pi3Var, pi3Var2, i2, qh3Var, i3, z, s55Var, cu4Var, i4, do2Var, f, f2, ilVar, i5, jg0Var, hp0Var, i6, z2, z3, i7, i8, i9, z4, z5, do2Var2, j, j2, j3, jw4Var, cw4Var);
        tn2VarC.c.a(true, true);
    }

    @Override // defpackage.oi3
    public final void f(int i) {
        tn2 tn2VarC = c();
        if (tn2VarC == null) {
            return;
        }
        tn2VarC.F();
        if (((al3) this.o.get()) == null) {
            return;
        }
        tn2VarC.r = tn2VarC.r.i(i);
        tn2VarC.c.a(true, true);
        try {
            tn2VarC.h.i.s(i);
        } catch (RemoteException e) {
            l93.G("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.oi3
    public final void g(int i) {
        tn2 tn2VarC = c();
        if (tn2VarC == null) {
            return;
        }
        tn2VarC.F();
        if (((al3) this.o.get()) == null) {
            return;
        }
        lk3 lk3Var = tn2VarC.r;
        tn2VarC.r = lk3Var.d(lk3Var.w, i, lk3Var.v);
        tn2VarC.c.a(true, true);
        try {
            ls2 ls2Var = (ls2) tn2VarC.h.i.r;
            ls2Var.P(ls2Var.g.s);
        } catch (RemoteException e) {
            l93.G("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.oi3
    public final void k(pi3 pi3Var, pi3 pi3Var2, int i) {
        tn2 tn2VarC = c();
        if (tn2VarC == null) {
            return;
        }
        tn2VarC.F();
        if (((al3) this.o.get()) == null) {
            return;
        }
        tn2VarC.r = tn2VarC.r.h(pi3Var, pi3Var2, i);
        tn2VarC.c.a(true, true);
        try {
            ls2 ls2Var = (ls2) tn2VarC.h.i.r;
            ls2Var.P(ls2Var.g.s);
        } catch (RemoteException e) {
            l93.G("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.oi3
    public final void n(il ilVar) {
        tn2 tn2VarC = c();
        if (tn2VarC == null) {
            return;
        }
        tn2VarC.F();
        if (((al3) this.o.get()) == null) {
            return;
        }
        tn2VarC.r = tn2VarC.r.a(ilVar);
        tn2VarC.c.a(true, true);
        try {
            ls2 ls2Var = (ls2) tn2VarC.h.i.r;
            if (ls2Var.g.s.F().a == 0) {
                ((kr2) ls2Var.m.o).a.setPlaybackToLocal(ilVar.c());
            }
        } catch (RemoteException e) {
            l93.G("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.oi3
    public final void o(cw4 cw4Var) {
        tn2 tn2VarC = c();
        if (tn2VarC == null) {
            return;
        }
        tn2VarC.F();
        if (((al3) this.o.get()) == null) {
            return;
        }
        tn2VarC.r = tn2VarC.r.o(cw4Var);
        tn2VarC.c.a(true, true);
        tn2VarC.f(new er1(28));
    }

    @Override // defpackage.oi3
    public final void q(boolean z) {
        tn2 tn2VarC = c();
        if (tn2VarC == null) {
            return;
        }
        tn2VarC.F();
        if (((al3) this.o.get()) == null) {
            return;
        }
        lk3 lk3Var = tn2VarC.r;
        PlaybackException playbackException = lk3Var.a;
        int i = lk3Var.b;
        za4 za4Var = lk3Var.c;
        pi3 pi3Var = lk3Var.d;
        pi3 pi3Var2 = lk3Var.e;
        int i2 = lk3Var.f;
        qh3 qh3Var = lk3Var.g;
        int i3 = lk3Var.h;
        boolean z2 = lk3Var.i;
        cu4 cu4Var = lk3Var.j;
        int i4 = lk3Var.k;
        s55 s55Var = lk3Var.l;
        do2 do2Var = lk3Var.m;
        float f = lk3Var.n;
        float f2 = lk3Var.o;
        int i5 = lk3Var.p;
        il ilVar = lk3Var.q;
        jg0 jg0Var = lk3Var.r;
        hp0 hp0Var = lk3Var.s;
        int i6 = lk3Var.t;
        boolean z3 = lk3Var.u;
        boolean z4 = lk3Var.v;
        int i7 = lk3Var.w;
        boolean z5 = lk3Var.x;
        int i8 = lk3Var.z;
        int i9 = lk3Var.A;
        do2 do2Var2 = lk3Var.B;
        long j = lk3Var.C;
        long j2 = lk3Var.D;
        long j3 = lk3Var.E;
        jw4 jw4Var = lk3Var.F;
        cw4 cw4Var = lk3Var.G;
        rr2.w(cu4Var.p() || za4Var.a.b < cu4Var.o());
        tn2VarC.r = new lk3(playbackException, i, za4Var, pi3Var, pi3Var2, i2, qh3Var, i3, z2, s55Var, cu4Var, i4, do2Var, f, f2, ilVar, i5, jg0Var, hp0Var, i6, z3, z4, i7, i8, i9, z5, z, do2Var2, j, j2, j3, jw4Var, cw4Var);
        tn2VarC.c.a(true, true);
        try {
            tn2VarC.h.i.getClass();
        } catch (RemoteException e) {
            l93.G("MediaSessionImpl", "Exception in using media1 API", e);
        }
        tn2VarC.C();
    }

    @Override // defpackage.oi3
    public final void r(int i, boolean z) {
        tn2 tn2VarC = c();
        if (tn2VarC == null) {
            return;
        }
        tn2VarC.F();
        if (((al3) this.o.get()) == null) {
            return;
        }
        lk3 lk3Var = tn2VarC.r;
        tn2VarC.r = lk3Var.d(i, lk3Var.z, z);
        tn2VarC.c.a(true, true);
        try {
            ls2 ls2Var = (ls2) tn2VarC.h.i.r;
            ls2Var.P(ls2Var.g.s);
        } catch (RemoteException e) {
            l93.G("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.oi3
    public final void s(float f) {
        tn2 tn2VarC = c();
        if (tn2VarC == null) {
            return;
        }
        tn2VarC.F();
        tn2VarC.r = tn2VarC.r.p(f);
        tn2VarC.c.a(true, true);
        try {
            tn2VarC.h.i.getClass();
        } catch (RemoteException e) {
            l93.G("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.oi3
    public final void t(int i, gn2 gn2Var) {
        tn2 tn2VarC = c();
        if (tn2VarC == null) {
            return;
        }
        tn2VarC.F();
        if (((al3) this.o.get()) == null) {
            return;
        }
        lk3 lk3Var = tn2VarC.r;
        PlaybackException playbackException = lk3Var.a;
        za4 za4Var = lk3Var.c;
        pi3 pi3Var = lk3Var.d;
        pi3 pi3Var2 = lk3Var.e;
        int i2 = lk3Var.f;
        qh3 qh3Var = lk3Var.g;
        int i3 = lk3Var.h;
        boolean z = lk3Var.i;
        cu4 cu4Var = lk3Var.j;
        int i4 = lk3Var.k;
        s55 s55Var = lk3Var.l;
        do2 do2Var = lk3Var.m;
        float f = lk3Var.n;
        float f2 = lk3Var.o;
        int i5 = lk3Var.p;
        il ilVar = lk3Var.q;
        jg0 jg0Var = lk3Var.r;
        hp0 hp0Var = lk3Var.s;
        int i6 = lk3Var.t;
        boolean z2 = lk3Var.u;
        boolean z3 = lk3Var.v;
        int i7 = lk3Var.w;
        boolean z4 = lk3Var.x;
        boolean z5 = lk3Var.y;
        int i8 = lk3Var.z;
        int i9 = lk3Var.A;
        do2 do2Var2 = lk3Var.B;
        long j = lk3Var.C;
        long j2 = lk3Var.D;
        long j3 = lk3Var.E;
        jw4 jw4Var = lk3Var.F;
        cw4 cw4Var = lk3Var.G;
        rr2.w(cu4Var.p() || za4Var.a.b < cu4Var.o());
        tn2VarC.r = new lk3(playbackException, i, za4Var, pi3Var, pi3Var2, i2, qh3Var, i3, z, s55Var, cu4Var, i4, do2Var, f, f2, ilVar, i5, jg0Var, hp0Var, i6, z2, z3, i7, i8, i9, z4, z5, do2Var2, j, j2, j3, jw4Var, cw4Var);
        tn2VarC.c.a(true, true);
        try {
            tn2VarC.h.i.n(gn2Var);
        } catch (RemoteException e) {
            l93.G("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.oi3
    public final void v(int i) {
        tn2 tn2VarC = c();
        if (tn2VarC == null) {
            return;
        }
        tn2VarC.F();
        al3 al3Var = (al3) this.o.get();
        if (al3Var == null) {
            return;
        }
        tn2VarC.r = tn2VarC.r.f(i, al3Var.U());
        tn2VarC.c.a(true, true);
        try {
            lr0 lr0Var = tn2VarC.h.i;
            al3Var.U();
            ls2 ls2Var = (ls2) lr0Var.r;
            ls2Var.P(ls2Var.g.s);
        } catch (RemoteException e) {
            l93.G("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.oi3
    public final void x(boolean z) {
        tn2 tn2VarC = c();
        if (tn2VarC == null) {
            return;
        }
        tn2VarC.F();
        if (((al3) this.o.get()) == null) {
            return;
        }
        tn2VarC.r = tn2VarC.r.k(z);
        tn2VarC.c.a(true, true);
        try {
            tn2VarC.h.i.u(z);
        } catch (RemoteException e) {
            l93.G("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }
}
