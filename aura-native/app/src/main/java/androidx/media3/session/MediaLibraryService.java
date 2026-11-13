package androidx.media3.session;

import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import defpackage.au0;
import defpackage.bk;
import defpackage.f35;
import defpackage.fr2;
import defpackage.go2;
import defpackage.gy3;
import defpackage.io2;
import defpackage.ju1;
import defpackage.kn2;
import defpackage.kr2;
import defpackage.l93;
import defpackage.lo2;
import defpackage.ms2;
import defpackage.oi;
import defpackage.pn2;
import defpackage.pr2;
import defpackage.ps2;
import defpackage.qa1;
import defpackage.qs2;
import defpackage.rk2;
import defpackage.rr2;
import defpackage.sk2;
import defpackage.t6;
import defpackage.tn2;
import defpackage.ur2;
import defpackage.vl2;
import defpackage.vw1;
import defpackage.x7;
import defpackage.yl0;
import defpackage.yw1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class MediaLibraryService extends Service {
    public static final /* synthetic */ int t = 0;
    public qs2 p;
    public lo2 q;
    public x7 r;
    public final Object n = new Object();
    public final Handler o = new Handler(Looper.getMainLooper());
    public final oi s = new oi(0);

    public final void c(kn2 kn2Var) {
        kn2 kn2Var2;
        int i;
        boolean z = true;
        rr2.k("session is already released", !kn2Var.a.l());
        synchronized (this.n) {
            kn2Var2 = (kn2) this.s.get(kn2Var.a.i);
            i = 0;
            if (kn2Var2 != null && kn2Var2 != kn2Var) {
                z = false;
            }
            rr2.k("Session ID should be unique", z);
            this.s.put(kn2Var.a.i, kn2Var);
        }
        if (kn2Var2 == null) {
            f35.W(this.o, new ps2(this, kn2Var, i));
        }
    }

    public final lo2 d() {
        if (this.q == null) {
            rr2.s(getBaseContext(), "Accessing service context before onCreate()");
            bk bkVar = new bk(getApplicationContext());
            rr2.w(!bkVar.p);
            yl0 yl0Var = new yl0(bkVar);
            bkVar.p = true;
            if (this.r == null) {
                this.r = new x7(this);
            }
            this.q = new lo2(this, yl0Var, this.r);
        }
        return this.q;
    }

    public final ArrayList e() {
        ArrayList arrayList;
        synchronized (this.n) {
            arrayList = new ArrayList(this.s.values());
        }
        return arrayList;
    }

    public final boolean f(kn2 kn2Var) {
        boolean containsKey;
        synchronized (this.n) {
            containsKey = this.s.containsKey(kn2Var.a.i);
        }
        return containsKey;
    }

    public final IBinder g(Intent intent) {
        String action;
        kn2 i;
        pn2 pn2Var;
        if (intent == null || (action = intent.getAction()) == null) {
            return null;
        }
        if (action.equals("androidx.media3.session.MediaSessionService")) {
            qs2 qs2Var = this.p;
            qs2Var.getClass();
            return qs2Var;
        }
        if (!action.equals("android.media.browse.MediaBrowserService") || (i = i(new fr2(new ms2("android.media.session.MediaController", -1, -1), 0, 0, false, null, Bundle.EMPTY))) == null) {
            return null;
        }
        c(i);
        tn2 tn2Var = i.a;
        synchronized (tn2Var.a) {
            try {
                if (tn2Var.w == null) {
                    pr2 pr2Var = ((kr2) tn2Var.h.m.o).c;
                    pn2 pn2Var2 = new pn2(tn2Var);
                    pn2Var2.c(pr2Var);
                    tn2Var.w = pn2Var2;
                }
                pn2Var = tn2Var.w;
            } catch (Throwable th) {
                throw th;
            }
        }
        return pn2Var.onBind(new Intent("android.media.browse.MediaBrowserService"));
    }

    public abstract kn2 h(fr2 fr2Var);

    public /* bridge */ kn2 i(fr2 fr2Var) {
        return h(fr2Var);
    }

    public final void j(kn2 kn2Var, boolean z) {
        yw1 yw1Var;
        lo2 d = d();
        if (!d.n.f(kn2Var) || !d.d(kn2Var)) {
            d.n.stopForeground(1);
            d.x = false;
            if (d.w != null) {
                d.p.b.cancel(null, 1001);
                d.v++;
                d.w = null;
                return;
            }
            return;
        }
        int i = d.v + 1;
        d.v = i;
        sk2 b = d.b(kn2Var);
        b.getClass();
        b.c1();
        rk2 rk2Var = b.d;
        if (rk2Var.Y()) {
            yw1Var = rk2Var.Q0();
        } else {
            vw1 vw1Var = yw1.o;
            yw1Var = gy3.r;
        }
        f35.W(new Handler(kn2Var.a().U0()), new io2(d, kn2Var, yw1Var, new vl2(d, i, kn2Var, 2), z, 0));
    }

    public final boolean k(kn2 kn2Var, boolean z) {
        try {
            j(kn2Var, d().c(z));
            return true;
        } catch (IllegalStateException e) {
            if (Build.VERSION.SDK_INT < 31 || !go2.y(e)) {
                throw e;
            }
            l93.G("MSessionService", "Failed to start foreground", e);
            this.o.post(new qa1(21, this));
            return false;
        }
    }

    public final void l(kn2 kn2Var) {
        synchronized (this.n) {
            rr2.k("session not found", this.s.containsKey(kn2Var.a.i));
            this.s.remove(kn2Var.a.i);
        }
        f35.W(this.o, new ps2(this, kn2Var, 1));
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        if (intent == null) {
            return null;
        }
        if (!"androidx.media3.session.MediaLibraryService".equals(intent.getAction())) {
            return g(intent);
        }
        qs2 qs2Var = this.p;
        qs2Var.getClass();
        return qs2Var;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.p = new qs2(this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        lo2 lo2Var = this.q;
        if (lo2Var != null) {
            lo2Var.a();
        }
        qs2 qs2Var = this.p;
        if (qs2Var != null) {
            qs2Var.e.clear();
            qs2Var.f.removeCallbacksAndMessages(null);
            Set set = qs2Var.g;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                au0.k((ju1) it.next());
            }
            set.clear();
            this.p = null;
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        kn2 kn2Var;
        kn2 kn2Var2;
        if (intent != null) {
            if (this.r == null) {
                this.r = new x7(this);
            }
            x7 x7Var = this.r;
            Uri data = intent.getData();
            if (data != null) {
                synchronized (kn2.b) {
                    try {
                        Iterator it = kn2.c.values().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                kn2Var2 = null;
                                break;
                            }
                            kn2Var2 = (kn2) it.next();
                            if (Objects.equals(kn2Var2.a.b, data)) {
                            }
                        }
                    } finally {
                    }
                }
                kn2Var = kn2Var2;
            } else {
                kn2Var = null;
            }
            x7Var.getClass();
            if ("android.intent.action.MEDIA_BUTTON".equals(intent.getAction())) {
                if (kn2Var == null) {
                    kn2Var = i(new fr2(new ms2("android.media.session.MediaController", -1, -1), 0, 0, false, null, Bundle.EMPTY));
                    if (kn2Var != null) {
                        c(kn2Var);
                    }
                }
                tn2 tn2Var = kn2Var.a;
                tn2Var.l.post(new ur2(2, tn2Var, intent));
                return 1;
            }
            if (kn2Var != null && "androidx.media3.session.CUSTOM_NOTIFICATION_ACTION".equals(intent.getAction())) {
                Bundle extras = intent.getExtras();
                Object obj = extras != null ? extras.get("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION") : null;
                String str = obj instanceof String ? (String) obj : null;
                if (str != null) {
                    Bundle extras2 = intent.getExtras();
                    Object obj2 = extras2 != null ? extras2.get("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION_EXTRAS") : null;
                    Bundle bundle = obj2 instanceof Bundle ? (Bundle) obj2 : Bundle.EMPTY;
                    lo2 d = d();
                    sk2 b = d.b(kn2Var);
                    if (b != null) {
                        f35.W(new Handler(kn2Var.a().U0()), new t6(d, kn2Var, str, bundle, b));
                    }
                }
            }
        }
        return 1;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        if (d().x) {
            ArrayList e = e();
            for (int i = 0; i < e.size(); i++) {
                if (((kn2) e.get(i)).a().h0()) {
                    return;
                }
            }
        }
        d().a();
        ArrayList e2 = e();
        for (int i2 = 0; i2 < e2.size(); i2++) {
            ((kn2) e2.get(i2)).a().V(false);
        }
        stopSelf();
    }
}
