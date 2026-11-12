package defpackage;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.os.Bundle;
import android.webkit.WebView;
import app.homemusic.R;
import com.eddyizm.tempus.homemusic.HubFragment;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b41 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    public /* synthetic */ b41(Object r1, Object r2, Object r3, boolean r4, int r5) {
        this.n = r5;
        this.p = r1;
        this.q = r2;
        this.r = r3;
        this.o = r4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.n) {
            case 0: goto L40;
            case 1: goto L16;
            case 2: goto L14;
            case 3: goto L9;
            default: goto L4;
        };
    L4:
        mm3 r0 = (mm3) this.p;
        boolean r3 = this.o;
        String r4 = (String) this.q;
        String r7 = (String) this.r;
        qp4 r1 = r0.d;
        if (r3 == false) goto L7;
        xl.E((s24) r1.a, false, true, new ps0(4, r4, r7));
        return;
    L7:
        r1.o(r4, r7);
        return;
    L9:
        tn2 r2 = (tn2) this.p;
        boolean r5 = this.o;
        fr2 r6 = (fr2) this.q;
        Runnable r8 = (Runnable) this.r;
        if (r5 == false) goto L12;
        r2.d(r6, new cn(new va4("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", Bundle.EMPTY)));
    L12:
        r8.run();
        r2.g.f.s(r6);
        return;
    L14:
        ((lo2) this.p).e((kn2) this.q, (rm2) this.r, this.o);
        return;
    L16:
        HubFragment r9 = (HubFragment) this.p;
        Serializable r10 = (Serializable) this.q;
        String r11 = (String) this.r;
        boolean r12 = this.o;
        if (r9.l0 != null) goto L20;
        return;
    L20:
        if ((r10 instanceof s14) == true) goto L33;
        String r13 = (String) r10;
        WebView r14 = r9.n0;
        if (r14 == null) goto L33;
        if (r12 == false) goto L26;
    L32:
        hw.i = r13;
        r14.loadUrl(r13 + "/?embedded=1#" + r11);
        goto L33
    L26:
        if (h12.c(hw.i, r13) == false) goto L32;
        String r15 = r14.getUrl();
        if (r15 == null) goto L32;
        if (xm4.k0(r15, r13, false) != true) goto L32;
        r9.m0(false);
        r9.i0(r11);
    L33:
        Throwable r16 = bb3.a(r10);
        if (r16 == null) goto L59;
        r9.m0(false);
        String r17 = r16.getMessage();
        if (r17 != null) goto L38;
        r17 = r9.s(R.string.homemusic_hub_unreachable);
        r17.getClass();
    L38:
        r9.k0(r17);
        return;
    L59:
        return;
    L40:
        Context r18 = (Context) this.p;
        boolean r19 = this.o;
        i41 r20 = (i41) this.q;
        ik3 r21 = (ik3) this.r;
        MediaMetricsManager r22 = fo2.b(r18.getSystemService("media_metrics"));
        if (r22 != null) goto L43;
        ho2 r23 = null;
    L44:
        if (r23 != null) goto L46;
        l93.q0("ExoPlayerImpl", "MediaMetricsService unavailable.");
        return;
    L46:
        if (r19 == false) goto L48;
        nj0 r24 = r20.t;
        r24.getClass();
        r24.s.a(r23);
    L48:
        LogSessionId r25 = fo2.a(r23.d);
        monitor-enter(r21);
        rm2 r26 = r21.b;     // Catch: Throwable -> L53
        r26.getClass();     // Catch: Throwable -> L53
        LogSessionId r27 = (LogSessionId) r26.o;     // Catch: Throwable -> L53
        go2.d();     // Catch: Throwable -> L53
        rr2.w(go2.w(r27));     // Catch: Throwable -> L53
        r26.o = r25;     // Catch: Throwable -> L53
        monitor-exit(r21);
        return;
    L53:
        th = move-exception;
        throw th;
    L43:
        r23 = new ho2(r18, fo2.j(r22));
        goto L44
    }

    public /* synthetic */ b41(Object r1, boolean r2, Object r3, Object r4, int r5) {
        this.n = r5;
        this.p = r1;
        this.o = r2;
        this.q = r3;
        this.r = r4;
    }
}
