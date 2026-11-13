package defpackage;

import android.os.Handler;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class lq3 implements ba2 {
    public static final lq3 v = new lq3();
    public int n;
    public int o;
    public Handler r;
    public boolean p = true;
    public boolean q = true;
    public final ea2 s = new ea2(this, true);
    public final jq3 t = new jq3(0, this);
    public final si1 u = new si1(17, this);

    public final void a() {
        int i = this.o + 1;
        this.o = i;
        if (i == 1) {
            if (this.p) {
                this.s.d(q92.ON_RESUME);
                this.p = false;
            } else {
                Handler handler = this.r;
                handler.getClass();
                handler.removeCallbacks(this.t);
            }
        }
    }

    @Override // defpackage.ba2
    public final ea2 h() {
        return this.s;
    }
}
