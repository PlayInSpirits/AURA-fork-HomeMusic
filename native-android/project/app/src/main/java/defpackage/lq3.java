package defpackage;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lq3 implements ba2 {
    public static final lq3 v = null;
    public int n;
    public int o;
    public boolean p;
    public boolean q;
    public Handler r;
    public final ea2 s;
    public final jq3 t;
    public final si1 u;

    static {
        v = new lq3();
    }

    public lq3() {
        this.p = true;
        this.q = true;
        this.s = new ea2(this, true);
        this.t = new jq3(0, this);
        this.u = new si1(17, this);
    }

    public final void a() {
        int r0 = this.o + 1;
        this.o = r0;
        if (r0 == 1) goto L5;
        return;
    L5:
        if (this.p == false) goto L8;
        this.s.d(q92.ON_RESUME);
        this.p = false;
        return;
    L8:
        Handler r1 = this.r;
        r1.getClass();
        r1.removeCallbacks(this.t);
    }

    @Override // defpackage.ba2
    public final ea2 h() {
        return this.s;
    }
}
