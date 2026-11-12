package defpackage;

import android.app.Application;
import com.eddyizm.tempus.App;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class n92 extends hd {
    public final om0 c;
    public final rv2 d;
    public final pa e;
    public final y41 f;
    public final mm3 g;
    public final k03 h;
    public final k03 i;
    public final k03 j;
    public final k03 k;
    public final k03 l;
    public String m;
    public int n;

    public n92(Application r2) {
        super(r2);
        this.h = new k03(null);
        new k03(null);
        this.i = new k03(null);
        this.j = new k03(null);
        this.k = new k03(null);
        this.l = new k03(null);
        this.m = ud3.k();
        this.n = 0;
        this.c = new om0(5);
        this.d = new rv2(27);
        this.e = new pa(12);
        this.f = new y41(18);
        this.g = new mm3();
    }

    public final boolean c() {
        String r0 = ud3.k();
        if (Objects.equals(r0, this.m) == false) goto L6;
        return false;
    L6:
        this.m = r0;
        this.n++;
        this.j.k(null);
        this.k.k(null);
        return true;
    }

    public final void d(le1 r6) {
        this.d.getClass();
        rv2.m("random", 10, null, null).e(r6, new mp1(this, this.n, this.j, 1));
    }

    public final void e(le1 r6) {
        pa r0 = this.e;
        r0.getClass();
        k03 r1 = new k03();
        App.f(false).c().j().enqueue(new qr2(3, r0, r1));
        r1.e(r6, new mp1(this, this.n, this.k, 1));
    }

    public final void f(le1 r4) {
        k03 r0 = this.g.d(10, true);
        k03 r3 = this.i;
        Objects.requireNonNull(r3);
        r0.e(r4, new g7(r3, 0));
    }
}
