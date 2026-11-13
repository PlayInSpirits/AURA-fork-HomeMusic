/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.os.Bundle;
import android.webkit.WebView;
import com.eddyizm.tempus.homemusic.HubFragment;
import defpackage.bb3;
import defpackage.cn;
import defpackage.fo2;
import defpackage.fr2;
import defpackage.go2;
import defpackage.h12;
import defpackage.ho2;
import defpackage.hw;
import defpackage.i41;
import defpackage.ik3;
import defpackage.kn2;
import defpackage.l93;
import defpackage.lo2;
import defpackage.mm3;
import defpackage.nj0;
import defpackage.ps0;
import defpackage.qp4;
import defpackage.rm2;
import defpackage.rr2;
import defpackage.s14;
import defpackage.s24;
import defpackage.tn2;
import defpackage.va4;
import defpackage.xl;
import defpackage.xm4;
import java.io.Serializable;

public final class b41
implements Runnable {
    public final int n;
    public final boolean o;
    public final Object p;
    public final Object q;
    public final Object r;

    public b41(Object object, Object object2, Object object3, boolean bl5, int n16) {
        this.n = n16;
        this.p = object;
        this.q = object2;
        this.r = object3;
        this.o = bl5;
    }

    public b41(Object object, boolean bl5, Object object2, Object object3, int n16) {
        this.n = n16;
        this.p = object;
        this.o = bl5;
        this.q = object2;
        this.r = object3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        switch (this.n) {
            default: {
                Object object = (mm3)this.p;
                boolean bl5 = this.o;
                String string = (String)this.q;
                String string2 = (String)this.r;
                object = ((mm3)object).d;
                if (bl5) {
                    xl.E((s24)((qp4)object).a, false, true, new ps0(4, string, string2));
                    return;
                }
                ((qp4)object).o(string, string2);
                return;
            }
            case 3: {
                tn2 tn22 = (tn2)this.p;
                boolean bl6 = this.o;
                fr2 fr22 = (fr2)this.q;
                Runnable runnable = (Runnable)this.r;
                if (bl6) {
                    tn22.d(fr22, new cn(new va4("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", Bundle.EMPTY)));
                }
                runnable.run();
                tn22.g.f.s(fr22);
                return;
            }
            case 2: {
                ((lo2)this.p).e((kn2)this.q, (rm2)this.r, this.o);
                return;
            }
            case 1: {
                String string;
                HubFragment hubFragment = (HubFragment)this.p;
                Object object = (Serializable)this.q;
                String string3 = (String)this.r;
                boolean bl7 = this.o;
                if (hubFragment.l0 == null) {
                    return;
                }
                if (!(object instanceof s14)) {
                    string = (String)object;
                    WebView webView = hubFragment.n0;
                    if (webView != null) {
                        CharSequence charSequence;
                        if (!bl7 && h12.c(hw.i, string) && (charSequence = webView.getUrl()) != null && xm4.k0((String)charSequence, string, false)) {
                            hubFragment.m0(false);
                            hubFragment.i0(string3);
                        } else {
                            hw.i = string;
                            charSequence = new StringBuilder();
                            ((StringBuilder)charSequence).append(string);
                            ((StringBuilder)charSequence).append("/?embedded=1#");
                            ((StringBuilder)charSequence).append(string3);
                            webView.loadUrl(((StringBuilder)charSequence).toString());
                        }
                    }
                }
                if ((object = bb3.a(object)) == null) return;
                hubFragment.m0(false);
                string = ((Throwable)object).getMessage();
                object = string;
                if (string == null) {
                    object = hubFragment.s(2131952053);
                    object.getClass();
                }
                hubFragment.k0((String)object);
                return;
            }
            case 0: 
        }
        Object object = (Context)this.p;
        boolean bl8 = this.o;
        Object object2 = (i41)this.q;
        ik3 ik32 = (ik3)this.r;
        Object object3 = fo2.b(((Context)object).getSystemService("media_metrics"));
        object = object3 == null ? null : new ho2((Context)object, fo2.j((MediaMetricsManager)object3));
        if (object == null) {
            l93.q0("ExoPlayerImpl", "MediaMetricsService unavailable.");
            return;
        }
        if (bl8) {
            object2 = ((i41)object2).t;
            object2.getClass();
            ((nj0)object2).s.a(object);
        }
        object3 = fo2.a(((ho2)object).d);
        synchronized (ik32) {
            object2 = ik32.b;
            object2.getClass();
            object = (LogSessionId)((rm2)object2).o;
            go2.d();
            rr2.w(go2.w((LogSessionId)object));
            ((rm2)object2).o = object3;
            return;
        }
    }
}

