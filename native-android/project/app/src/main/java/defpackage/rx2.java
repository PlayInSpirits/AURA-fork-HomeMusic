package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rx2 implements qx2 {
    public final Context n;
    public td0 o;
    public final vd3 p;
    public sk4 q;

    public rx2(Context r2) {
        this.n = r2;
        this.p = new vd3(1.0f);
    }

    @Override // defpackage.ne0
    public final ne0 J(ne0 r1) {
        return ya4.F(this, r1);
    }

    @Override // defpackage.ne0
    public final le0 K(me0 r1) {
        return ya4.r(this, r1);
    }

    @Override // defpackage.ne0
    public final Object s(wf1 r1, Object r2) {
        return r1.invoke(r2, this);
    }

    @Override // defpackage.ne0
    public final ne0 u(me0 r1) {
        return ya4.C(this, r1);
    }

    @Override // defpackage.qx2
    public final float v() {
        if (this.q != null) goto L21;
        Context r6 = this.n;
        w03 r8 = ic5.a;
        monitor-enter(r8);
        Object r0 = r8.g(r6);     // Catch: Throwable -> L9
        vd0 r9 = null;
        if (r0 != null) goto L11;
        ContentResolver r2 = r6.getContentResolver();     // Catch: Throwable -> L9
        Uri r3 = Settings.Global.getUriFor("animator_duration_scale");     // Catch: Throwable -> L9
        aw r5 = su3.a(-1, 6, null);     // Catch: Throwable -> L9
        hc5 r1 = new hc5(r2, r3, new ng0(r5, wr1.m(Looper.getMainLooper())), r5, r6, null);     // Catch: Throwable -> L9
        gc0 r4 = new gc0(1, r1);     // Catch: Throwable -> L9
        fo4 r7 = new fo4(null);     // Catch: Throwable -> L9
        rm0 r10 = rr0.a;     // Catch: Throwable -> L9
        r0 = ya4.L(r4, new td0(ya4.F(r7, uf2.a)), new il4(), Float.valueOf(Settings.Global.getFloat(r6.getContentResolver(), "animator_duration_scale", 1.0f)));     // Catch: Throwable -> L9
        r8.l(r6, r0);     // Catch: Throwable -> L9
    L11:
        ll4 r11 = (ll4) r0;     // Catch: Throwable -> L9
        monitor-exit(r8);
        float r12 = ((Number) r11.getValue()).floatValue();
        this.p.h(r12);
        td0 r13 = this.o;
        if (r13 == null) goto L16;
        this.q = fu.G(r13, null, null, new p(r11, this, r9, 11), 3);
        goto L21
    L16:
        kf2.o("MotionDurationScale scale factor requested before recomposer loop start");
        return 0.0f;
    L9:
        th = move-exception;
        throw th;
    L21:
        return this.p.g();
    }
}
