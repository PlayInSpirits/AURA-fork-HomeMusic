package defpackage;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.os.Bundle;
import android.webkit.WebView;
import app.homemusic.R;
import com.eddyizm.tempus.homemusic.HubFragment;
import java.io.Serializable;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b41 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    public /* synthetic */ b41(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.n = i;
        this.p = obj;
        this.q = obj2;
        this.r = obj3;
        this.o = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String url;
        switch (this.n) {
            case 0:
                Context context = (Context) this.p;
                boolean z = this.o;
                i41 i41Var = (i41) this.q;
                ik3 ik3Var = (ik3) this.r;
                MediaMetricsManager mediaMetricsManagerB = fo2.b(context.getSystemService("media_metrics"));
                ho2 ho2Var = mediaMetricsManagerB == null ? null : new ho2(context, mediaMetricsManagerB.createPlaybackSession());
                if (ho2Var == null) {
                    l93.q0("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    return;
                }
                if (z) {
                    nj0 nj0Var = i41Var.t;
                    nj0Var.getClass();
                    nj0Var.s.a(ho2Var);
                }
                LogSessionId sessionId = ho2Var.d.getSessionId();
                synchronized (ik3Var) {
                    rm2 rm2Var = ik3Var.b;
                    rm2Var.getClass();
                    LogSessionId logSessionId = (LogSessionId) rm2Var.o;
                    LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
                    rr2.w(logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE));
                    rm2Var.o = sessionId;
                }
                return;
            case 1:
                HubFragment hubFragment = (HubFragment) this.p;
                Serializable serializable = (Serializable) this.q;
                String str = (String) this.r;
                boolean z2 = this.o;
                if (hubFragment.l0 == null) {
                    return;
                }
                if (!(serializable instanceof s14)) {
                    String str2 = (String) serializable;
                    WebView webView = hubFragment.n0;
                    if (webView != null) {
                        if (z2 || !h12.c(hw.i, str2) || (url = webView.getUrl()) == null || !xm4.k0(url, str2, false)) {
                            hw.i = str2;
                            webView.loadUrl(str2 + "/?embedded=1#" + str);
                        } else {
                            hubFragment.m0(false);
                            hubFragment.i0(str);
                        }
                    }
                }
                Throwable thA = bb3.a(serializable);
                if (thA != null) {
                    hubFragment.m0(false);
                    String message = thA.getMessage();
                    if (message == null) {
                        message = hubFragment.s(R.string.homemusic_hub_unreachable);
                        message.getClass();
                    }
                    hubFragment.k0(message);
                    return;
                }
                return;
            case 2:
                ((lo2) this.p).e((kn2) this.q, (rm2) this.r, this.o);
                return;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                tn2 tn2Var = (tn2) this.p;
                boolean z3 = this.o;
                fr2 fr2Var = (fr2) this.q;
                Runnable runnable = (Runnable) this.r;
                if (z3) {
                    tn2Var.d(fr2Var, new cn(new va4("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", Bundle.EMPTY)));
                }
                runnable.run();
                tn2Var.g.f.s(fr2Var);
                return;
            default:
                mm3 mm3Var = (mm3) this.p;
                boolean z4 = this.o;
                String str3 = (String) this.q;
                String str4 = (String) this.r;
                qp4 qp4Var = mm3Var.d;
                if (z4) {
                    xl.E((s24) qp4Var.a, false, true, new ps0(4, str3, str4));
                    return;
                } else {
                    qp4Var.o(str3, str4);
                    return;
                }
        }
    }

    public /* synthetic */ b41(Object obj, boolean z, Object obj2, Object obj3, int i) {
        this.n = i;
        this.p = obj;
        this.o = z;
        this.q = obj2;
        this.r = obj3;
    }
}
