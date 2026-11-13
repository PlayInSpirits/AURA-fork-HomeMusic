package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class tk5 {
    public static final Object g = new Object();
    public static tk5 h;
    public static HandlerThread i;
    public final HashMap a = new HashMap();
    public final Context b;
    public volatile zw2 c;
    public final fz0 d;
    public final long e;
    public final long f;

    public tk5(Context context, Looper looper) {
        ai1 ai1Var = new ai1(2, this);
        this.b = context.getApplicationContext();
        zw2 zw2Var = new zw2(looper, ai1Var, 4);
        Looper.getMainLooper();
        this.c = zw2Var;
        if (fz0.N == null) {
            synchronized (fz0.M) {
                try {
                    if (fz0.N == null) {
                        fz0.N = new fz0();
                    }
                } finally {
                }
            }
        }
        fz0 fz0Var = fz0.N;
        ji2.m(fz0Var);
        this.d = fz0Var;
        this.e = 5000L;
        this.f = 300000L;
    }

    public final void a(String str, ServiceConnection serviceConnection, boolean z) {
        nk5 nk5Var = new nk5(str, z);
        ji2.n(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.a) {
            try {
                pk5 pk5Var = (pk5) this.a.get(nk5Var);
                if (pk5Var == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(nk5Var.toString()));
                }
                if (!pk5Var.n.containsKey(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(nk5Var.toString()));
                }
                pk5Var.n.remove(serviceConnection);
                if (pk5Var.n.isEmpty()) {
                    this.c.sendMessageDelayed(this.c.obtainMessage(0, nk5Var), this.e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b(nk5 nk5Var, wi5 wi5Var, String str) {
        boolean z;
        synchronized (this.a) {
            try {
                pk5 pk5Var = (pk5) this.a.get(nk5Var);
                if (pk5Var == null) {
                    pk5Var = new pk5(this, nk5Var);
                    pk5Var.n.put(wi5Var, wi5Var);
                    pk5Var.a(str, null);
                    this.a.put(nk5Var, pk5Var);
                } else {
                    this.c.removeMessages(0, nk5Var);
                    if (pk5Var.n.containsKey(wi5Var)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(nk5Var.toString()));
                    }
                    pk5Var.n.put(wi5Var, wi5Var);
                    int i2 = pk5Var.o;
                    if (i2 == 1) {
                        wi5Var.onServiceConnected(pk5Var.s, pk5Var.q);
                    } else if (i2 == 2) {
                        pk5Var.a(str, null);
                    }
                }
                z = pk5Var.p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }
}
