package defpackage;

import android.os.Looper;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class dm2 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ im2 o;

    public /* synthetic */ dm2(im2 im2Var, ml3 ml3Var) {
        this.n = 2;
        this.o = im2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        im2 im2Var = this.o;
        switch (i) {
            case 0:
                if (!im2Var.k && ((xk2) im2Var.i.n).e.a() == null) {
                    im2Var.e1();
                    break;
                }
                break;
            case 1:
                jj2 jj2Var = new jj2(im2Var.a, im2Var.c.a.b(), new z05(im2Var), im2Var.b.d.S0());
                im2Var.j = jj2Var;
                l93.A("MediaBrowserCompat", "Connecting to a MediaBrowserService.");
                jj2Var.a.b.connect();
                break;
            default:
                sk2 a1 = im2Var.a1();
                a1.getClass();
                rr2.w(Looper.myLooper() == a1.f.getLooper());
                qk2 qk2Var = a1.e;
                qk2Var.getClass();
                new mw1(new ab4(-6));
                qk2Var.u();
                break;
        }
    }

    public /* synthetic */ dm2(im2 im2Var, int i) {
        this.n = i;
        this.o = im2Var;
    }
}
