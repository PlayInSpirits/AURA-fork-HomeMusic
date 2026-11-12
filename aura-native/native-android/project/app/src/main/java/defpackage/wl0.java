package defpackage;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wl0 implements cd2 {
    public static final gy3 r;
    public final bu4 a;
    public final zt4 b;
    public final gj0 c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final int l;
    public final boolean m;
    public final long n;
    public final bx1 o;
    public final ConcurrentHashMap p;
    public long q;

    static {
        vw1 vw1Var = yw1.o;
        Object[] objArr = {"file", "content", "data", "android.resource", "rawresource", "asset"};
        gh0.f(6, objArr);
        r = yw1.i(6, objArr);
    }

    public wl0(gj0 gj0Var, int i, int i2, int i3, int i4, int i5, boolean z, Map map) {
        k(1000, 0, "bufferForPlaybackMs", "0");
        k(1000, 0, "bufferForPlaybackForLocalPlaybackMs", "0");
        k(2000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        k(i5, 0, "bufferForPlaybackAfterRebufferForLocalPlaybackMs", "0");
        k(i, 1000, "minBufferMs", "bufferForPlaybackMs");
        k(i2, 1000, "minBufferForLocalPlaybackMs", "bufferForPlaybackForLocalPlaybackMs");
        k(i, 2000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        k(i2, i5, "minBufferForLocalPlaybackMs", "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        k(i3, i, "maxBufferMs", "minBufferMs");
        k(i4, i2, "maxBufferForLocalPlaybackMs", "minBufferForLocalPlaybackMs");
        k(0, 0, "backBufferDurationMs", "0");
        this.a = new bu4();
        this.b = new zt4();
        this.c = gj0Var;
        this.d = f35.Q(i);
        this.e = f35.Q(i2);
        this.f = f35.Q(i3);
        this.g = f35.Q(i4);
        long jQ = f35.Q(1000L);
        this.h = jQ;
        this.i = jQ;
        this.j = f35.Q(2000L);
        this.k = f35.Q(i5);
        this.l = -1;
        this.m = z;
        this.n = f35.Q(0L);
        this.p = new ConcurrentHashMap();
        this.o = bx1.b(map);
        this.q = -1L;
    }

    public static void k(int i, int i2, String str, String str2) {
        rr2.p(i >= i2, "%s cannot be less than %s", str, str2);
    }

    @Override // defpackage.cd2
    public final boolean a(ik3 ik3Var, cu4 cu4Var, mt2 mt2Var, long j) {
        Iterator it = this.p.values().iterator();
        while (it.hasNext()) {
            if (((vl0) it.next()).b) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.cd2
    public final void b(ik3 ik3Var) {
        m(ik3Var);
        if (this.p.isEmpty()) {
            this.q = -1L;
        }
    }

    @Override // defpackage.cd2
    public final void c(ik3 ik3Var) {
        m(ik3Var);
    }

    @Override // defpackage.cd2
    public final boolean d(ik3 ik3Var) {
        return false;
    }

    @Override // defpackage.cd2
    public final void e(ik3 ik3Var) {
        long id = Thread.currentThread().getId();
        long j = this.q;
        rr2.v("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j == -1 || j == id);
        this.q = id;
        ConcurrentHashMap concurrentHashMap = this.p;
        vl0 vl0Var = (vl0) concurrentHashMap.get(ik3Var);
        if (vl0Var == null) {
            vl0 vl0Var2 = new vl0();
            vl0Var2.a = 1;
            concurrentHashMap.put(ik3Var, vl0Var2);
        } else {
            vl0Var.a++;
        }
        vl0 vl0Var3 = (vl0) concurrentHashMap.get(ik3Var);
        vl0Var3.getClass();
        Integer num = (Integer) this.o.get(ik3Var.a);
        int iIntValue = (num == null || num.intValue() == -1) ? this.l : num.intValue();
        if (iIntValue == -1) {
            iIntValue = 13107200;
        }
        vl0Var3.c = iIntValue;
        vl0Var3.b = false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.cd2
    public final void f(bd2 bd2Var, tv4 tv4Var, t41[] t41VarArr) {
        ik3 ik3Var = bd2Var.a;
        Integer num = (Integer) this.o.get(ik3Var.a);
        int iIntValue = (num == null || num.intValue() == -1) ? this.l : num.intValue();
        vl0 vl0Var = (vl0) this.p.get(ik3Var);
        vl0Var.getClass();
        if (iIntValue == -1) {
            boolean zL = l(bd2Var);
            int length = t41VarArr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = 13107200;
                if (i < length) {
                    t41 t41Var = t41VarArr[i];
                    if (t41Var != null) {
                        switch (t41Var.c().c) {
                            case -2:
                                i3 = 0;
                                i2 += i3;
                                break;
                            case -1:
                            case 1:
                                i2 += i3;
                                break;
                            case 0:
                                i3 = 144310272;
                                i2 += i3;
                                break;
                            case 2:
                                i3 = zL ? 19660800 : 131072000;
                                i2 += i3;
                                break;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            case 5:
                            case 6:
                                i3 = 131072;
                                i2 += i3;
                                break;
                            case 4:
                                i3 = 26214400;
                                i2 += i3;
                                break;
                            default:
                                nz2.c();
                                break;
                        }
                        return;
                    }
                    i++;
                } else {
                    iIntValue = f35.j(i2, 13107200, 210239488);
                }
            }
        }
        vl0Var.c = iIntValue;
        n();
    }

    @Override // defpackage.cd2
    public final r20 g(ik3 ik3Var) {
        return new r20(this, ik3Var);
    }

    @Override // defpackage.cd2
    public final boolean h(bd2 bd2Var) {
        int i;
        ik3 ik3Var = bd2Var.a;
        long j = bd2Var.e;
        vl0 vl0Var = (vl0) this.p.get(ik3Var);
        vl0Var.getClass();
        vl0 vl0Var2 = (vl0) this.p.get(ik3Var);
        vl0Var2.getClass();
        synchronized (vl0Var2) {
            i = vl0Var2.d;
        }
        int i2 = i * this.c.o;
        vl0 vl0Var3 = (vl0) this.p.get(ik3Var);
        vl0Var3.getClass();
        boolean z = i2 >= vl0Var3.c;
        if (ik3Var.equals(ik3.d)) {
            return !z;
        }
        boolean zL = l(bd2Var);
        long jMin = zL ? this.e : this.d;
        long j2 = zL ? this.g : this.f;
        float f = bd2Var.f;
        if (f > 1.0f) {
            jMin = Math.min(f35.A(jMin, f), j2);
        }
        if (j < Math.max(jMin, 500000L)) {
            boolean z2 = (zL ? this.m : false) || !z;
            vl0Var.b = z2;
            if (!z2 && j < 500000) {
                l93.q0("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j >= j2 || z) {
            vl0Var.b = false;
        }
        return vl0Var.b;
    }

    @Override // defpackage.cd2
    public final long i(ik3 ik3Var) {
        return this.n;
    }

    @Override // defpackage.cd2
    public final boolean j(bd2 bd2Var) {
        long jMin;
        int i;
        boolean zL = l(bd2Var);
        ik3 ik3Var = bd2Var.a;
        long jE = f35.E(bd2Var.e, bd2Var.f);
        if (bd2Var.g) {
            jMin = zL ? this.k : this.j;
        } else {
            jMin = zL ? this.i : this.h;
        }
        long j = bd2Var.h;
        if (j != -9223372036854775807L) {
            jMin = Math.min(j / 2, jMin);
        }
        if (jMin <= 0 || jE >= jMin) {
            return true;
        }
        if (!(zL ? this.m : false)) {
            vl0 vl0Var = (vl0) this.p.get(ik3Var);
            vl0Var.getClass();
            synchronized (vl0Var) {
                i = vl0Var.d;
            }
            int i2 = i * this.c.o;
            vl0 vl0Var2 = (vl0) this.p.get(ik3Var);
            vl0Var2.getClass();
            if (i2 >= vl0Var2.c) {
                return true;
            }
        }
        return false;
    }

    public final boolean l(bd2 bd2Var) {
        cu4 cu4Var = bd2Var.b;
        bn2 bn2Var = cu4Var.m(cu4Var.g(bd2Var.c.a, this.b).c, this.a, 0L).b.b;
        if (bn2Var == null) {
            return false;
        }
        String scheme = bn2Var.a.getScheme();
        return TextUtils.isEmpty(scheme) || r.contains(scheme);
    }

    public final void m(ik3 ik3Var) {
        ConcurrentHashMap concurrentHashMap = this.p;
        vl0 vl0Var = (vl0) concurrentHashMap.get(ik3Var);
        if (vl0Var != null) {
            int i = vl0Var.a - 1;
            vl0Var.a = i;
            if (i == 0) {
                concurrentHashMap.remove(ik3Var);
                n();
            }
        }
    }

    public final void n() {
        boolean zIsEmpty = this.p.isEmpty();
        gj0 gj0Var = this.c;
        int i = 0;
        if (zIsEmpty) {
            synchronized (gj0Var) {
                if (gj0Var.n) {
                    gj0Var.b(0);
                }
            }
        } else {
            Iterator it = this.p.values().iterator();
            while (it.hasNext()) {
                i += ((vl0) it.next()).c;
            }
            gj0Var.b(i);
        }
    }
}
