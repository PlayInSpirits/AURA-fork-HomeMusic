package defpackage;

import androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class e40 extends be5 {
    public final long l;
    public final long m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final ArrayList r;
    public final bu4 s;
    public d40 t;
    public ClippingMediaSource$IllegalClippingException u;
    public long v;
    public long w;

    public e40(c40 c40Var) {
        super(c40Var.a);
        this.l = c40Var.b;
        this.m = c40Var.c;
        this.n = c40Var.d;
        this.o = c40Var.e;
        this.p = c40Var.f;
        this.q = c40Var.g;
        this.r = new ArrayList();
        this.s = new bu4();
    }

    @Override // defpackage.be5
    public final void A(cu4 cu4Var) {
        if (this.u != null) {
            return;
        }
        D(cu4Var);
    }

    public final void D(cu4 cu4Var) {
        long j;
        long j2;
        long j3;
        bu4 bu4Var = this.s;
        cu4Var.n(0, bu4Var);
        long j4 = bu4Var.o;
        d40 d40Var = this.t;
        long j5 = this.m;
        ArrayList arrayList = this.r;
        if (d40Var == null || arrayList.isEmpty() || this.o) {
            boolean z = this.p;
            j = this.l;
            if (z) {
                long j6 = bu4Var.k;
                j += j6;
                j2 = j6 + j5;
            } else {
                j2 = j5;
            }
            this.v = j4 + j;
            this.w = j5 != Long.MIN_VALUE ? j4 + j2 : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                b40 b40Var = (b40) arrayList.get(i);
                long j7 = this.v;
                long j8 = this.w;
                b40Var.s = j7;
                b40Var.t = j8;
            }
            j3 = j2;
        } else {
            j = this.v - j4;
            j3 = j5 != Long.MIN_VALUE ? this.w - j4 : Long.MIN_VALUE;
        }
        try {
            d40 d40Var2 = new d40(cu4Var, j, j3, this.q);
            this.t = d40Var2;
            m(d40Var2);
        } catch (ClippingMediaSource$IllegalClippingException e) {
            this.u = e;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((b40) arrayList.get(i2)).u = this.u;
            }
        }
    }

    @Override // defpackage.be5, defpackage.bq
    public final boolean a(gn2 gn2Var) {
        bq bqVar = this.k;
        return bqVar.h().e.equals(gn2Var.e) && bqVar.a(gn2Var);
    }

    @Override // defpackage.be5, defpackage.bq
    public final no2 b(mt2 mt2Var, n9 n9Var, long j) {
        b40 b40Var = new b40(this.k.b(mt2Var, n9Var, j), this.n, this.v, this.w);
        this.r.add(b40Var);
        return b40Var;
    }

    @Override // defpackage.p80, defpackage.bq
    public final void j() throws ClippingMediaSource$IllegalClippingException {
        ClippingMediaSource$IllegalClippingException clippingMediaSource$IllegalClippingException = this.u;
        if (clippingMediaSource$IllegalClippingException != null) {
            throw clippingMediaSource$IllegalClippingException;
        }
        super.j();
    }

    @Override // defpackage.be5, defpackage.bq
    public final void n(no2 no2Var) {
        ArrayList arrayList = this.r;
        rr2.w(arrayList.remove(no2Var));
        this.k.n(((b40) no2Var).n);
        if (!arrayList.isEmpty() || this.o) {
            return;
        }
        d40 d40Var = this.t;
        d40Var.getClass();
        D(d40Var.e);
    }

    @Override // defpackage.p80, defpackage.bq
    public final void p() {
        super.p();
        this.u = null;
        this.t = null;
    }
}
