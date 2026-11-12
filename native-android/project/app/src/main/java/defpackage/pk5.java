package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pk5 implements ServiceConnection {
    public final HashMap n = new HashMap();
    public int o = 2;
    public boolean p;
    public IBinder q;
    public final nk5 r;
    public ComponentName s;
    public final /* synthetic */ tk5 t;

    public pk5(tk5 tk5Var, nk5 nk5Var) {
        this.t = tk5Var;
        this.r = nk5Var;
    }

    public final void a(String str, Executor executor) {
        this.o = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            tk5 tk5Var = this.t;
            fz0 fz0Var = tk5Var.d;
            Context context = tk5Var.b;
            boolean zQ = fz0Var.q(context, str, this.r.a(context), this, executor);
            this.p = zQ;
            if (zQ) {
                this.t.c.sendMessageDelayed(this.t.c.obtainMessage(1, this.r), this.t.f);
            } else {
                this.o = 2;
                try {
                    tk5 tk5Var2 = this.t;
                    tk5Var2.d.o(tk5Var2.b, this);
                } catch (IllegalArgumentException unused) {
                }
            }
        } finally {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.t.a) {
            try {
                this.t.c.removeMessages(1, this.r);
                this.q = iBinder;
                this.s = componentName;
                Iterator it = this.n.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.o = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.t.a) {
            try {
                this.t.c.removeMessages(1, this.r);
                this.q = null;
                this.s = componentName;
                Iterator it = this.n.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.o = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
