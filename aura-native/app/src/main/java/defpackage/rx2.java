package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class rx2 implements qx2 {
    public final Context n;
    public td0 o;
    public final vd3 p = new vd3(1.0f);
    public sk4 q;

    public rx2(Context context) {
        this.n = context;
    }

    @Override // defpackage.ne0
    public final ne0 J(ne0 ne0Var) {
        return ya4.F(this, ne0Var);
    }

    @Override // defpackage.ne0
    public final le0 K(me0 me0Var) {
        return ya4.r(this, me0Var);
    }

    @Override // defpackage.ne0
    public final Object s(wf1 wf1Var, Object obj) {
        return wf1Var.invoke(obj, this);
    }

    @Override // defpackage.ne0
    public final ne0 u(me0 me0Var) {
        return ya4.C(this, me0Var);
    }

    @Override // defpackage.qx2
    public final float v() {
        vd0 vd0Var;
        ll4 ll4Var;
        if (this.q == null) {
            Context context = this.n;
            w03 w03Var = ic5.a;
            synchronized (w03Var) {
                try {
                    Object g = w03Var.g(context);
                    vd0Var = null;
                    if (g == null) {
                        ContentResolver contentResolver = context.getContentResolver();
                        Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                        aw a = su3.a(-1, 6, null);
                        gc0 gc0Var = new gc0(1, new hc5(contentResolver, uriFor, new ng0(a, wr1.m(Looper.getMainLooper())), a, context, null));
                        fo4 fo4Var = new fo4(null);
                        rm0 rm0Var = rr0.a;
                        g = ya4.L(gc0Var, new td0(ya4.F(fo4Var, uf2.a)), new il4(), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                        w03Var.l(context, g);
                    }
                    ll4Var = (ll4) g;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.p.h(((Number) ll4Var.getValue()).floatValue());
            td0 td0Var = this.o;
            if (td0Var == null) {
                kf2.o("MotionDurationScale scale factor requested before recomposer loop start");
                return 0.0f;
            }
            this.q = fu.G(td0Var, null, null, new p(ll4Var, this, vd0Var, 11), 3);
        }
        return this.p.g();
    }
}
