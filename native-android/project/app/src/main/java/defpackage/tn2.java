package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.session.MediaLibraryService;
import com.eddyizm.tempus.homemusic.a;
import com.eddyizm.tempus.service.MediaService;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tn2 {
    public static final ab4 H = new ab4(1);
    public static final go4 I = au0.L(new di0(4));
    public final yw1 A;
    public final Bundle B;
    public final kn2 C;
    public final pq D;
    public final nl1 E;
    public final nl1 F;
    public final int G;
    public final Object a = new Object();
    public final Uri b;
    public final wr2 c;
    public final cj2 d;
    public final pq e;
    public final MediaService f;
    public final kt2 g;
    public final ls2 h;
    public final String i;
    public final cb4 j;
    public final kn2 k;
    public final Handler l;
    public final x7 m;
    public final sr2 n;
    public final Handler o;
    public final boolean p;
    public final yw1 q;
    public lk3 r;
    public al3 s;
    public final PendingIntent t;
    public xr2 u;
    public rm2 v;
    public pn2 w;
    public boolean x;
    public boolean y;
    public final yw1 z;

    public tn2(kn2 kn2Var, MediaService mediaService, ExoPlayer exoPlayer, PendingIntent pendingIntent, yw1 yw1Var, yw1 yw1Var2, yw1 yw1Var3, pq pqVar, Bundle bundle, Bundle bundle2, x7 x7Var) {
        l93.K("MediaSessionImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.9.2] [" + f35.a + "]");
        this.k = kn2Var;
        this.f = mediaService;
        this.i = "";
        this.t = pendingIntent;
        this.z = yw1Var;
        this.A = yw1Var2;
        this.q = yw1Var3;
        this.e = pqVar;
        this.B = bundle2;
        this.m = x7Var;
        this.p = true;
        kt2 kt2Var = new kt2(this);
        this.g = kt2Var;
        this.o = new Handler(Looper.getMainLooper());
        Looper looper = ((i41) exoPlayer).u;
        Handler handler = new Handler(looper);
        this.l = handler;
        this.r = lk3.H;
        this.c = new wr2(this, looper);
        this.d = new cj2(this, looper);
        Uri uriBuild = new Uri.Builder().scheme(tn2.class.getName()).appendPath("").appendPath(String.valueOf(SystemClock.elapsedRealtime())).build();
        this.b = uriBuild;
        ls2 ls2Var = new ls2(this, uriBuild, handler, bundle, yw1Var, yw1Var2, dr2.e, dr2.f, bundle2);
        this.h = ls2Var;
        this.j = new cb4(Process.myUid(), 1009002300, 8, mediaService.getPackageName(), kt2Var, bundle, ((kr2) ls2Var.m.o).c.o);
        al3 al3Var = new al3(exoPlayer);
        this.s = al3Var;
        f35.W(handler, new ws1(28, this, al3Var));
        this.n = new sr2(this, 2);
        f35.W(handler, new sr2(this, 3));
        this.C = kn2Var;
        this.D = pqVar;
        this.G = 2;
        this.E = new nl1();
        this.F = new nl1();
    }

    public static Object E(Future future) {
        rr2.w(future.isDone());
        try {
            return future.get();
        } catch (InterruptedException | CancellationException | ExecutionException e) {
            l93.r0("MediaSessionImpl", "Library operation failed", e);
            return null;
        }
    }

    public static void G(int i, m92 m92Var) {
        if (m92Var.a == 0) {
            yw1 yw1Var = (yw1) m92Var.c;
            yw1Var.getClass();
            if (yw1Var.size() <= i) {
                return;
            }
            nz2.d(yw1Var.size(), i, ", pageSize=", "Invalid size=");
        }
    }

    public static void a(tn2 tn2Var) {
        synchronized (tn2Var.a) {
            try {
                if (tn2Var.x) {
                    return;
                }
                za4 za4VarX0 = tn2Var.s.X0();
                if (!tn2Var.c.hasMessages(1) && ju2.a(za4VarX0, tn2Var.r.c)) {
                    na4 na4Var = tn2Var.g.f;
                    yw1 yw1VarU = na4Var.u();
                    for (int i = 0; i < yw1VarU.size(); i++) {
                        fr2 fr2Var = (fr2) yw1VarU.get(i);
                        na4Var.A(fr2Var);
                        tn2Var.e(fr2Var, new tr2(za4VarX0, na4Var.H(fr2Var, 16), na4Var.H(fr2Var, 17), fr2Var));
                    }
                    try {
                        tn2Var.h.i.B(0, za4VarX0, true, true, 0);
                    } catch (RemoteException e) {
                        l93.G("MediaSessionImpl", "Exception in using media1 API", e);
                    }
                }
                tn2Var.C();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void b(tn2 tn2Var, Runnable runnable) {
        f35.W(tn2Var.l, runnable);
    }

    public static boolean m(fr2 fr2Var) {
        return fr2Var != null && Objects.equals(fr2Var.a.a.a, "com.android.systemui");
    }

    public final void A() {
        String str;
        StringBuilder sb = new StringBuilder("Release ");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" [AndroidXMedia3/1.9.2] [");
        sb.append(f35.a);
        sb.append("] [");
        HashSet hashSet = hn2.a;
        synchronized (hn2.class) {
            str = hn2.b;
        }
        sb.append(str);
        sb.append("]");
        l93.K("MediaSessionImpl", sb.toString());
        synchronized (this.a) {
            try {
                if (this.x) {
                    return;
                }
                this.x = true;
                cj2 cj2Var = this.d;
                qo2 qo2Var = (qo2) cj2Var.b;
                if (qo2Var != null) {
                    cj2Var.removeCallbacks(qo2Var);
                    cj2Var.b = null;
                }
                this.l.removeCallbacksAndMessages(null);
                int i = 0;
                try {
                    f35.W(this.l, new sr2(this, i));
                } catch (Exception e) {
                    l93.r0("MediaSessionImpl", "Exception thrown while closing", e);
                }
                ls2 ls2Var = this.h;
                ComponentName componentName = ls2Var.o;
                tn2 tn2Var = ls2Var.g;
                qr2 qr2Var = ls2Var.m;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 < 31) {
                    if (componentName == null) {
                        ((kr2) qr2Var.o).a.setMediaButtonReceiver(null);
                    } else {
                        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON", tn2Var.b);
                        intent.setComponent(componentName);
                        ((kr2) qr2Var.o).a.setMediaButtonReceiver(PendingIntent.getBroadcast(tn2Var.f, 0, intent, ls2.A));
                    }
                }
                v9 v9Var = ls2Var.n;
                if (v9Var != null) {
                    tn2Var.f.unregisterReceiver(v9Var);
                }
                w9 w9Var = ls2Var.l;
                if (w9Var != null && !w9Var.f.getAndSet(true)) {
                    w9Var.c.execute(new u9(w9Var, 0));
                }
                kr2 kr2Var = (kr2) qr2Var.o;
                MediaSession mediaSession = kr2Var.a;
                kr2Var.f.kill();
                if (i2 == 27) {
                    try {
                        Field declaredField = mediaSession.getClass().getDeclaredField("mCallback");
                        declaredField.setAccessible(true);
                        Handler handler = (Handler) declaredField.get(mediaSession);
                        if (handler != null) {
                            handler.removeCallbacksAndMessages(null);
                        }
                    } catch (Exception e2) {
                        l93.r0("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e2);
                    }
                }
                mediaSession.setCallback(null);
                kr2Var.b.e.clear();
                mediaSession.release();
                kt2 kt2Var = this.g;
                Set set = kt2Var.g;
                na4 na4Var = kt2Var.f;
                yw1 yw1VarU = na4Var.u();
                int size = yw1VarU.size();
                while (i < size) {
                    Object obj = yw1VarU.get(i);
                    i++;
                    fr2 fr2Var = (fr2) obj;
                    na4Var.N(fr2Var);
                    er2 er2Var = fr2Var.d;
                    if (er2Var != null) {
                        er2Var.c();
                    }
                }
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    er2 er2Var2 = ((fr2) it.next()).d;
                    if (er2Var2 != null) {
                        er2Var2.c();
                    }
                }
                set.clear();
                kt2Var.e.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final fr2 B(fr2 fr2Var) {
        if (!this.y || !m(fr2Var)) {
            return fr2Var;
        }
        fr2 fr2VarG = g();
        fr2VarG.getClass();
        return fr2VarG;
    }

    public final void C() {
        this.l.removeCallbacks(this.n);
    }

    public final void D(al3 al3Var, al3 al3Var2) {
        ls2 ls2Var = this.h;
        this.s = al3Var2;
        if (al3Var != null) {
            xr2 xr2Var = this.u;
            xr2Var.getClass();
            al3Var.r0(xr2Var);
        }
        xr2 xr2Var2 = new xr2(this, al3Var2);
        al3Var2.v(xr2Var2);
        this.u = xr2Var2;
        try {
            ls2Var.i.p(0, al3Var, al3Var2);
        } catch (RemoteException e) {
            l93.G("MediaSessionImpl", "Exception in using media1 API", e);
        }
        if (al3Var == null) {
            ((kr2) ls2Var.m.o).a.setActive(true);
        }
        this.r = new lk3(al3Var2.U(), 0, al3Var2.X0(), al3Var2.W0(), al3Var2.W0(), 0, al3Var2.i(), al3Var2.h(), al3Var2.D0(), al3Var2.z(), al3Var2.Z0(), 0, al3Var2.S0(18) ? al3Var2.g0() : do2.K, al3Var2.S0(22) ? al3Var2.B() : 1.0f, 1.0f, al3Var2.S0(21) ? al3Var2.D() : il.i, 0, al3Var2.S0(28) ? al3Var2.i0() : jg0.d, al3Var2.F(), al3Var2.S0(23) ? al3Var2.j() : 0, al3Var2.b1(), al3Var2.q(), 1, al3Var2.v0(), al3Var2.g(), al3Var2.h0(), al3Var2.f(), al3Var2.a1(), al3Var2.O0(), al3Var2.X(), al3Var2.u(), al3Var2.S0(30) ? al3Var2.e0() : jw4.b, al3Var2.E0());
        h(al3Var2.o());
    }

    public final void F() {
        if (Looper.myLooper() == this.l.getLooper()) {
            return;
        }
        kf2.o("Player callback method is called from a wrong thread. See javadoc of MediaSession for details.");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0049  */
    /* JADX WARN: Code duplicated, block: B:25:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0065  */
    /* JADX WARN: Code duplicated, block: B:30:0x006d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0074  */
    public final boolean c(KeyEvent keyEvent, boolean z, boolean z2) {
        y90 y90Var;
        fr2 fr2VarG = this.k.a.g();
        fr2VarG.getClass();
        int keyCode = keyEvent.getKeyCode();
        if ((keyCode == 85 || keyCode == 79) && z) {
            keyCode = 87;
        }
        int i = 1;
        if (keyCode == 79) {
            if (!this.s.q()) {
                y90Var = new y90(this, fr2VarG, 7);
            } else {
                y90Var = new y90(this, fr2VarG, 8);
            }
        } else if (keyCode == 126) {
            y90Var = new y90(this, fr2VarG, 9);
        } else if (keyCode == 127) {
            y90Var = new y90(this, fr2VarG, i);
        } else if (keyCode == 272) {
            y90Var = new y90(this, fr2VarG, 2);
        } else if (keyCode != 273) {
            switch (keyCode) {
                case 85:
                    if (!this.s.q()) {
                        y90Var = new y90(this, fr2VarG, 8);
                    } else {
                        y90Var = new y90(this, fr2VarG, 7);
                    }
                    break;
                case 86:
                    y90Var = new y90(this, fr2VarG, 6);
                    break;
                case 87:
                    y90Var = new y90(this, fr2VarG, 2);
                    break;
                case 88:
                    y90Var = new y90(this, fr2VarG, 3);
                    break;
                case 89:
                    y90Var = new y90(this, fr2VarG, 5);
                    break;
                case 90:
                    y90Var = new y90(this, fr2VarG, 4);
                    break;
                default:
                    return false;
            }
        } else {
            y90Var = new y90(this, fr2VarG, 3);
        }
        f35.W(this.l, new b41(this, z2, fr2VarG, y90Var, 3));
        return true;
    }

    public final ic2 d(fr2 fr2Var, yr2 yr2Var) {
        int i;
        ic2 mw1Var;
        kt2 kt2Var = this.g;
        try {
            yk ykVarC = kt2Var.f.C(fr2Var);
            if (ykVarC != null) {
                ea4 ea4VarJ = ykVarC.j(H);
                i = ea4VarJ.u;
                mw1Var = ea4VarJ;
            } else {
                if (!j(fr2Var)) {
                    return new mw1(new ab4(-100));
                }
                i = 0;
                mw1Var = new mw1(new ab4(0));
            }
            er2 er2Var = fr2Var.d;
            if (er2Var != null) {
                yr2Var.f(er2Var, i);
            }
            return mw1Var;
        } catch (DeadObjectException unused) {
            kt2Var.f.N(fr2Var);
            return new mw1(new ab4(-100));
        } catch (RemoteException e) {
            l93.r0("MediaSessionImpl", "Exception in " + fr2Var, e);
            return new mw1(new ab4(-1));
        }
    }

    public final void e(fr2 fr2Var, yr2 yr2Var) {
        int iS;
        kt2 kt2Var = this.g;
        try {
            yk ykVarC = kt2Var.f.C(fr2Var);
            if (ykVarC != null) {
                iS = ykVarC.s();
            } else if (!j(fr2Var)) {
                return;
            } else {
                iS = 0;
            }
            er2 er2Var = fr2Var.d;
            if (er2Var != null) {
                yr2Var.f(er2Var, iS);
            }
        } catch (DeadObjectException unused) {
            kt2Var.f.N(fr2Var);
        } catch (RemoteException e) {
            l93.r0("MediaSessionImpl", "Exception in " + fr2Var, e);
        }
    }

    public final void f(yr2 yr2Var) {
        pn2 pn2Var;
        yw1 yw1VarU = this.g.f.u();
        for (int i = 0; i < yw1VarU.size(); i++) {
            e((fr2) yw1VarU.get(i), yr2Var);
        }
        try {
            yr2Var.f(this.h.i, 0);
        } catch (RemoteException e) {
            l93.G("MediaSessionImpl", "Exception in using media1 API", e);
        }
        synchronized (this.a) {
            pn2Var = this.w;
        }
        if (pn2Var != null) {
            try {
                yr2Var.f(pn2Var.y, 0);
            } catch (RemoteException e2) {
                l93.G("MediaSessionImpl", "Exception in using media1 API", e2);
            }
        }
    }

    public final fr2 g() {
        yw1 yw1VarU = this.g.f.u();
        for (int i = 0; i < yw1VarU.size(); i++) {
            fr2 fr2Var = (fr2) yw1VarU.get(i);
            if (k(fr2Var)) {
                return fr2Var;
            }
        }
        return null;
    }

    public final void h(mi3 mi3Var) {
        this.c.a(false, false);
        f(new km2(mi3Var));
        try {
            lr0 lr0Var = this.h.i;
            hp0 hp0Var = this.r.s;
            lr0Var.j();
        } catch (RemoteException e) {
            l93.G("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    public final void i(fr2 fr2Var, boolean z) {
        if (u()) {
            int i = 0;
            boolean z2 = this.s.S0(16) && this.s.a() != null;
            boolean z3 = this.s.S0(31) || this.s.S0(20);
            fr2 fr2VarB = B(fr2Var);
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            rr2.w(!false);
            sparseBooleanArray.append(1, true);
            rr2.w(true);
            mi3 mi3Var = new mi3(new w71(sparseBooleanArray));
            if (z2 || !z3) {
                if (!z2) {
                    l93.q0("MediaSessionImpl", "Play requested without current MediaItem, but playback resumption prevented by missing available commands");
                }
                f35.I(this.s);
                if (z) {
                    v(fr2VarB, mi3Var);
                    return;
                }
                return;
            }
            this.e.getClass();
            UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
            lw1 lw1Var = new lw1();
            lw1Var.m(unsupportedOperationException);
            lw1Var.f(new lg1(i, lw1Var, new ll(this, fr2VarB, z, mi3Var)), new rn2(this, 2));
        }
    }

    public final boolean j(fr2 fr2Var) {
        pn2 pn2Var;
        if (this.g.f.F(fr2Var) || this.h.f.F(fr2Var)) {
            return true;
        }
        synchronized (this.a) {
            pn2Var = this.w;
        }
        return pn2Var != null && pn2Var.x.F(fr2Var);
    }

    public final boolean k(fr2 fr2Var) {
        return Objects.equals(fr2Var.a.a.a, this.f.getPackageName()) && fr2Var.b != 0 && new Bundle(fr2Var.e).getBoolean("androidx.media3.session.MediaNotificationManager", false);
    }

    public final boolean l() {
        boolean z;
        synchronized (this.a) {
            z = this.x;
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0045 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0047  */
    public final void n(fr2 fr2Var, m92 m92Var) {
        int i = this.G;
        if (i == 0 || fr2Var.b != 0) {
            return;
        }
        int i2 = m92Var.a;
        ls2 ls2Var = this.h;
        if (i2 == -102 || i2 == -105) {
            boolean z = i == 1;
            ls2Var.getClass();
            jn2 jn2Var = m92Var.e;
            xa4 xa4Var = m92Var.f;
            int iG = f92.g(i2);
            bk bkVar = ls2Var.u;
            if (bkVar == null || bkVar.o != iG) {
                String str = xa4Var != null ? xa4Var.b : "no error message provided";
                Bundle bundle = Bundle.EMPTY;
                if (jn2Var != null) {
                    Bundle bundle2 = jn2Var.a;
                    if (bundle2.containsKey("android.media.extras.ERROR_RESOLUTION_ACTION_INTENT")) {
                        bundle = bundle2;
                    } else if (xa4Var != null) {
                        bundle = xa4Var.c;
                    }
                } else if (xa4Var != null) {
                    bundle = xa4Var.c;
                }
                ls2Var.u = new bk(z, iG, str, bundle);
                ls2Var.P(ls2Var.g.s);
            }
        }
        if (i2 != 0 || ls2Var.u == null) {
            return;
        }
        ls2Var.u = null;
        ls2Var.P(ls2Var.g.s);
    }

    public final mw1 o(fr2 fr2Var, List list) {
        return this.e.d(this.k, B(fr2Var), list);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0075  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d6  */
    public final dr2 p(fr2 fr2Var) {
        dr2 dr2Var;
        yw1 yw1VarK;
        yw1 yw1VarK2 = null;
        if (this.y && m(fr2Var)) {
            ls2 ls2Var = this.h;
            ls2Var.getClass();
            wa4 wa4Var = dr2.e;
            wa4 wa4Var2 = ls2Var.y;
            wa4Var2.getClass();
            mi3 mi3Var = ls2Var.z;
            mi3Var.getClass();
            if (ls2Var.x.isEmpty()) {
                yw1 yw1Var = ls2Var.w;
                yw1VarK2 = yw1Var == null ? null : yw1.k(yw1Var);
                yw1VarK = null;
            } else {
                yw1 yw1Var2 = ls2Var.x;
                yw1VarK = yw1Var2 == null ? null : yw1.k(yw1Var2);
            }
            return new dr2(wa4Var2, mi3Var, yw1VarK2, yw1VarK);
        }
        pq pqVar = this.e;
        kn2 kn2Var = this.k;
        pqVar.getClass();
        kn2Var.getClass();
        int i = 1;
        if (pqVar.p == null || kn2Var.b(fr2Var)) {
            Log.d("BaseSessionCallback", "onConnect: remove and add listener");
            if (pqVar.p != null) {
                kn2Var.a().r0(pqVar.o);
            }
            pqVar.p = kn2Var;
            kn2Var.a().v(pqVar.o);
            n61.e = new mq(pqVar, i);
        } else {
            kn2Var.a.getClass();
            if (fr2Var.a.a.a.equals("com.google.android.projection.gearhead")) {
                Log.d("BaseSessionCallback", "onConnect: remove and add listener");
                if (pqVar.p != null) {
                    kn2Var.a().r0(pqVar.o);
                }
                pqVar.p = kn2Var;
                kn2Var.a().v(pqVar.o);
                n61.e = new mq(pqVar, i);
            }
        }
        int i2 = 0;
        if (kn2Var.a.k(fr2Var) || kn2Var.b(fr2Var)) {
            mi3 mi3Var2 = dr2.f;
            wa4 wa4Var3 = pqVar.s;
            wa4Var3.getClass();
            qi3 qi3VarA = kn2Var.a();
            qi3VarA.getClass();
            dr2Var = new dr2(wa4Var3, mi3Var2, null, yw1.k(pqVar.a(qi3VarA, false)));
        } else {
            kn2Var.a.getClass();
            if (fr2Var.a.a.a.equals("com.google.android.projection.gearhead")) {
                mi3 mi3Var3 = dr2.f;
                wa4 wa4Var4 = pqVar.s;
                wa4Var4.getClass();
                qi3 qi3VarA2 = kn2Var.a();
                qi3VarA2.getClass();
                dr2Var = new dr2(wa4Var4, mi3Var3, null, yw1.k(pqVar.a(qi3VarA2, false)));
            } else {
                wa4 wa4Var5 = dr2.e;
                wa4Var5.getClass();
                HashSet hashSet = new HashSet(wa4Var5.a);
                hashSet.add(new va4("com.eddyizm.tempus.PLAY_NEXT_FIXUP", Bundle.EMPTY));
                dr2Var = new dr2(new wa4(hashSet), dr2.f, null, null);
            }
        }
        if (k(fr2Var)) {
            this.y = true;
            yw1 yw1Var3 = dr2Var.d;
            if (yw1Var3 == null) {
                yw1Var3 = this.k.a.A;
            }
            boolean zIsEmpty = yw1Var3.isEmpty();
            ls2 ls2Var2 = this.h;
            if (zIsEmpty) {
                yw1 yw1Var4 = dr2Var.c;
                if (yw1Var4 == null) {
                    yw1Var4 = this.k.a.z;
                }
                ls2Var2.w = yw1Var4;
            } else {
                ls2Var2.x = yw1Var3;
                ls2Var2.O();
            }
            ls2 ls2Var3 = this.h;
            wa4 wa4Var6 = dr2Var.a;
            mi3 mi3Var4 = dr2Var.b;
            i = ls2Var3.z.a(17) == mi3Var4.a(17) ? 0 : 1;
            ls2Var3.y = wa4Var6;
            ls2Var3.z = mi3Var4;
            if (!ls2Var3.x.isEmpty()) {
                ls2Var3.O();
            }
            tn2 tn2Var = ls2Var3.g;
            if (i != 0) {
                f35.W(tn2Var.l, new ds2(ls2Var3, tn2Var.s, i2));
                return dr2Var;
            }
            ls2Var3.P(tn2Var.s);
        }
        return dr2Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005b, code lost:
    
        if (r11.equals("android.media3.session.demo.REPEAT_ONE") == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0065, code lost:
    
        if (r11.equals("android.media3.session.demo.REPEAT_OFF") == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006f, code lost:
    
        if (r11.equals("android.media3.session.demo.REPEAT_ALL") == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0073, code lost:
    
        r10 = r9.a().h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007b, code lost:
    
        if (r10 == 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007d, code lost:
    
        if (r10 == 1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007f, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0081, code lost:
    
        r4 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0082, code lost:
    
        r9.a().p0(r4);
        r0.f(r9, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0096, code lost:
    
        return new defpackage.mw1(new defpackage.ab4(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d2, code lost:
    
        if (r11.equals("android.media3.session.demo.HEART_OFF") == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0165, code lost:
    
        if (r11.equals("android.media3.session.demo.HEART_ON") == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0168, code lost:
    
        r11 = r9.a();
        r11.getClass();
        r11 = defpackage.pq.c(r11);
        r0.f(r9, true);
        r12 = new defpackage.vl1(!r11);
        r11 = r9.a().a();
        r11.getClass();
        r11 = r11.a;
        r11.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0190, code lost:
    
        return r0.e(r9, r10, r11, r12);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ic2 q(fr2 fr2Var, va4 va4Var, Bundle bundle) {
        fr2 fr2VarB = B(fr2Var);
        pq pqVar = this.e;
        pqVar.getClass();
        MediaService mediaService = pqVar.b;
        kn2 kn2Var = this.k;
        kn2Var.getClass();
        fr2VarB.getClass();
        bundle.getClass();
        String str = va4Var.b;
        Log.d("BaseSessionCallback", "onCustomCommand: " + str);
        int i = 1;
        int i2 = 0;
        switch (str.hashCode()) {
            case -1023607354:
                if (str.equals("com.eddyizm.tempus.PLAY_NEXT_FIXUP")) {
                    mediaService.a(bundle.getInt("play_next_insert_pos", -1), bundle.getInt("play_next_count", 0), bundle.getInt("play_next_target_count", -1));
                    return new mw1(new ab4(0));
                }
                return new mw1(new ab4(new xa4(-6, str)));
            case -395959765:
                break;
            case 192214611:
                if (str.equals("android.media3.session.demo.INSTANT_MIX_ON")) {
                    if (bo2.c.get() || !ud3.T()) {
                        Log.d("BaseSessionCallback", "onCustomCommand: onInstantMix not usable");
                    } else {
                        Log.d("BaseSessionCallback", "onCustomCommand: start onInstantMix");
                        k6 k6Var = new k6(11, pqVar, kn2Var);
                        qi3 qi3VarA = kn2Var.a();
                        qi3VarA.getClass();
                        gn2 gn2VarA = qi3VarA.a();
                        int iO0 = qi3VarA.o0();
                        int iQ0 = qi3VarA.Q0();
                        int i3 = iQ0 - 1;
                        if (iO0 >= 0 && iO0 < i3) {
                            Log.d("BaseMediaService", "onInstantMix: remove range from " + iO0 + " to " + i3);
                            bo2.k(mediaService, iO0 + 1, iQ0);
                        }
                        Log.d("BaseMediaService", "onInstantMix: start Continuous Play with " + gn2VarA);
                        bo2.c(gn2VarA, mediaService, new vp(k6Var, i2));
                    }
                    pqVar.f(kn2Var, false);
                    return new mw1(new ab4(0));
                }
                return new mw1(new ab4(new xa4(-6, str)));
            case 610148995:
                break;
            case 758402520:
                if (str.equals("android.media3.session.demo.SHUFFLE_ON")) {
                    qi3 qi3VarH = a.h();
                    if (qi3VarH == null || a.b == null) {
                        kn2Var.a().s(true);
                    } else {
                        io1.b.post(new at1(qi3VarH, i2));
                    }
                    pqVar.f(kn2Var, false);
                    return new mw1(new ab4(0));
                }
                return new mw1(new ab4(new xa4(-6, str)));
            case 935679408:
                break;
            case 935692670:
                break;
            case 935692917:
                break;
            case 2035641462:
                if (str.equals("android.media3.session.demo.SHUFFLE_OFF")) {
                    kn2Var.a().s(false);
                    pqVar.f(kn2Var, false);
                    return new mw1(new ab4(0));
                }
                return new mw1(new ab4(new xa4(-6, str)));
            default:
                return new mw1(new ab4(new xa4(-6, str)));
        }
    }

    public final ic2 r(fr2 fr2Var, String str, int i, jn2 jn2Var) {
        boolean zEquals = Objects.equals(str, "androidx.media3.session.recent.root");
        int i2 = 0;
        pq pqVar = this.D;
        if (!zEquals) {
            B(fr2Var);
            pqVar.getClass();
            mw1 mw1Var = new mw1(m92.b(-6));
            mw1Var.f(new qn2(this, mw1Var, fr2Var, i, 0), new rn2(this, i2));
            return mw1Var;
        }
        if (this.h.o == null) {
            return new mw1(m92.b(-6));
        }
        if (this.s.g() == 1) {
            lb4 lb4Var = new lb4();
            if (this.y) {
                g().getClass();
            }
            pqVar.getClass();
            UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
            lw1 lw1Var = new lw1();
            lw1Var.m(unsupportedOperationException);
            lw1Var.f(new lg1(i2, lw1Var, new gp3(14, lb4Var, jn2Var)), gq0.n);
            return lb4Var;
        }
        um2 um2Var = new um2();
        vw1 vw1Var = yw1.o;
        gy3 gy3Var = gy3.r;
        List list = Collections.EMPTY_LIST;
        gy3 gy3Var2 = gy3.r;
        zm2 zm2Var = new zm2();
        cn2 cn2Var = cn2.d;
        co2 co2Var = new co2();
        co2Var.q = Boolean.FALSE;
        co2Var.r = Boolean.TRUE;
        return new mw1(m92.c(yw1.o(new gn2("androidx.media3.session.recent.item", new wm2(um2Var), null, new an2(zm2Var), new do2(co2Var), cn2Var)), jn2Var));
    }

    public final mw1 s(fr2 fr2Var, jn2 jn2Var) {
        if (jn2Var == null || !jn2Var.b || !m(fr2Var)) {
            B(fr2Var);
            this.D.getClass();
            return new mw1(m92.b(-6));
        }
        if (this.h.o == null) {
            return new mw1(m92.b(-6));
        }
        um2 um2Var = new um2();
        vw1 vw1Var = yw1.o;
        gy3 gy3Var = gy3.r;
        List list = Collections.EMPTY_LIST;
        gy3 gy3Var2 = gy3.r;
        zm2 zm2Var = new zm2();
        cn2 cn2Var = cn2.d;
        co2 co2Var = new co2();
        co2Var.q = Boolean.TRUE;
        co2Var.r = Boolean.FALSE;
        gn2 gn2Var = new gn2("androidx.media3.session.recent.root", new wm2(um2Var), null, new an2(zm2Var), new do2(co2Var), cn2Var);
        m92.d(gn2Var);
        return new mw1(new m92(0, SystemClock.elapsedRealtime(), jn2Var, null, gn2Var, 2));
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:67:0x00fa  */
    public final boolean t(fr2 fr2Var, Intent intent) {
        boolean z;
        ls2 ls2Var;
        int i = fr2Var.b;
        Bundle extras = intent.getExtras();
        qo2 qo2Var = null;
        KeyEvent keyEvent = (extras == null || !extras.containsKey("android.intent.extra.KEY_EVENT")) ? null : (KeyEvent) extras.getParcelable("android.intent.extra.KEY_EVENT");
        ComponentName component = intent.getComponent();
        if (Objects.equals(intent.getAction(), "android.intent.action.MEDIA_BUTTON")) {
            MediaService mediaService = this.f;
            if ((component == null || Objects.equals(component.getPackageName(), mediaService.getPackageName())) && keyEvent != null) {
                F();
                this.e.getClass();
                int i2 = 1;
                if (keyEvent.getAction() != 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode != 79 && keyCode != 126 && keyCode != 127 && keyCode != 272 && keyCode != 273) {
                        switch (keyCode) {
                        }
                    }
                    return true;
                }
                int keyCode2 = keyEvent.getKeyCode();
                boolean zHasSystemFeature = mediaService.getPackageManager().hasSystemFeature("android.software.leanback");
                cj2 cj2Var = this.d;
                if (keyCode2 == 79 || keyCode2 == 85) {
                    if (!zHasSystemFeature && i == 0 && keyEvent.getRepeatCount() == 0) {
                        qo2 qo2Var2 = (qo2) cj2Var.b;
                        if (qo2Var2 == null) {
                            qo2 qo2Var3 = new qo2(cj2Var, fr2Var, keyEvent, i2);
                            cj2Var.b = qo2Var3;
                            cj2Var.postDelayed(qo2Var3, ViewConfiguration.getDoubleTapTimeout());
                            return true;
                        }
                        if (qo2Var2 != null) {
                            cj2Var.removeCallbacks(qo2Var2);
                            cj2Var.b = null;
                        }
                        z = true;
                    } else {
                        qo2 qo2Var4 = (qo2) cj2Var.b;
                        if (qo2Var4 != null) {
                            cj2Var.removeCallbacks(qo2Var4);
                            qo2 qo2Var5 = (qo2) cj2Var.b;
                            cj2Var.b = null;
                            qo2Var = qo2Var5;
                        }
                        if (qo2Var != null) {
                            f35.W(cj2Var, qo2Var);
                        }
                    }
                    if (!this.y) {
                        boolean booleanExtra = intent.getBooleanExtra("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", false);
                        if (keyEvent.getRepeatCount() <= 0 || c(keyEvent, z, booleanExtra)) {
                            return true;
                        }
                    } else {
                        ls2Var = this.h;
                        if ((keyCode2 != 85 || keyCode2 == 79) && z) {
                            ls2Var.z();
                            return true;
                        }
                        if (i != 0) {
                            ((xk2) ((wo0) ls2Var.m.p).n).a.dispatchMediaButtonEvent(keyEvent);
                            return true;
                        }
                    }
                } else {
                    qo2 qo2Var6 = (qo2) cj2Var.b;
                    if (qo2Var6 != null) {
                        cj2Var.removeCallbacks(qo2Var6);
                        qo2 qo2Var7 = (qo2) cj2Var.b;
                        cj2Var.b = null;
                        qo2Var = qo2Var7;
                    }
                    if (qo2Var != null) {
                        f35.W(cj2Var, qo2Var);
                    }
                }
                z = false;
                if (!this.y) {
                    boolean booleanExtra2 = intent.getBooleanExtra("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", false);
                    if (keyEvent.getRepeatCount() <= 0) {
                    }
                    return true;
                }
                ls2Var = this.h;
                if (keyCode2 != 85) {
                    ls2Var.z();
                    return true;
                }
                ls2Var.z();
                return true;
                if (i != 0) {
                    ((xk2) ((wo0) ls2Var.m.p).n).a.dispatchMediaButtonEvent(keyEvent);
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean u() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            lb4 lb4Var = new lb4();
            this.o.post(new ws1(29, this, lb4Var));
            try {
                return ((Boolean) lb4Var.get()).booleanValue();
            } catch (InterruptedException | ExecutionException e) {
                throw new IllegalStateException(e);
            }
        }
        rm2 rm2Var = this.v;
        if (rm2Var != null) {
            MediaLibraryService mediaLibraryService = (MediaLibraryService) rm2Var.o;
            int i = Build.VERSION.SDK_INT;
            if (i >= 31 && i < 33) {
                int i2 = MediaLibraryService.t;
                if (!mediaLibraryService.d().x) {
                    return mediaLibraryService.k(this.k, true);
                }
            }
        }
        return true;
    }

    public final void v(fr2 fr2Var, mi3 mi3Var) {
        fr2 fr2VarB = B(fr2Var);
        this.e.getClass();
        kn2 kn2Var = this.k;
        kn2Var.getClass();
        fr2VarB.getClass();
        mi3Var.getClass();
        w71 w71Var = mi3Var.a;
        if (!w71Var.a(9, 8, 7, 6) || w71Var.a(1, 3)) {
            return;
        }
        qi3 qi3VarA = kn2Var.a();
        qi3VarA.getClass();
        if (qi3VarA.a() == null || qi3VarA.q()) {
            return;
        }
        if (qi3VarA.g() == 1) {
            qi3VarA.b();
        }
        qi3VarA.m0();
    }

    public final mw1 w(fr2 fr2Var) {
        B(fr2Var);
        this.D.getClass();
        mw1 mw1Var = new mw1(m92.b(-6));
        mw1Var.f(new sn2(this, mw1Var, fr2Var, 1), new rn2(this, 0));
        return mw1Var;
    }

    public final lb4 x(fr2 fr2Var, List list, final int i, final long j) {
        fr2 fr2VarB = B(fr2Var);
        pq pqVar = this.e;
        pqVar.getClass();
        return f35.h0(pqVar.d(this.k, fr2VarB, list), new mk() { // from class: cr2
            @Override // defpackage.mk
            public final ic2 apply(Object obj) {
                return new mw1(new gr2((List) obj, i, j));
            }
        });
    }

    public final lb4 y(fr2 fr2Var, String str, jn2 jn2Var) {
        er2 er2Var = fr2Var.d;
        er2Var.getClass();
        this.F.j(er2Var, str);
        this.E.j(str, fr2Var);
        fr2 fr2VarB = B(fr2Var);
        this.D.getClass();
        lb4 lb4VarH0 = f35.h0(new mw1(m92.b(-6)), new dg0(fr2VarB, this.C, str, jn2Var, 5));
        lb4VarH0.f(new t6(this, lb4VarH0, fr2Var, str, 16), new rn2(this, 1));
        return lb4VarH0;
    }

    public final mw1 z(fr2 fr2Var, String str) {
        B(fr2Var);
        this.D.getClass();
        mw1 mw1Var = new mw1(new m92(0, SystemClock.elapsedRealtime(), null, null, null, 1));
        mw1Var.f(new v6(this, fr2Var, str, 28), new rn2(this, 0));
        return mw1Var;
    }
}
