package defpackage;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ut0 implements jt0 {
    public final Context a;
    public final lt0 b;
    public final boolean c;
    public final dh3 d;
    public final Class e;
    public vt0 f;
    public h04 g;

    public ut0(Context context, lt0 lt0Var, boolean z, dh3 dh3Var, Class cls) {
        this.a = context;
        this.b = lt0Var;
        this.c = z;
        this.d = dh3Var;
        this.e = cls;
        lt0Var.e.add(this);
        i();
    }

    @Override // defpackage.jt0
    public final void a(lt0 lt0Var) {
        vt0 vt0Var = this.f;
        if (vt0Var != null) {
            vt0.a(vt0Var, lt0Var.l);
        }
    }

    @Override // defpackage.jt0
    public final void b(lt0 lt0Var, ns0 ns0Var) {
        la0 la0Var;
        vt0 vt0Var = this.f;
        if (vt0Var != null && (la0Var = vt0Var.n) != null) {
            int i = ns0Var.b;
            if (i == 2 || i == 5 || i == 7) {
                la0Var.n = true;
                la0Var.d();
            } else if (la0Var.o) {
                la0Var.d();
            }
        }
        vt0 vt0Var2 = this.f;
        if (vt0Var2 == null || vt0Var2.u) {
            int i2 = ns0Var.b;
            if (i2 == 2 || i2 == 5 || i2 == 7) {
                l93.q0("DownloadService", "DownloadService wasn't running. Restarting.");
                h();
            }
        }
    }

    @Override // defpackage.jt0
    public final void c() {
        i();
    }

    @Override // defpackage.jt0
    public final void d(ns0 ns0Var) {
        la0 la0Var;
        vt0 vt0Var = this.f;
        if (vt0Var == null || (la0Var = vt0Var.n) == null || !la0Var.o) {
            return;
        }
        la0Var.d();
    }

    @Override // defpackage.jt0
    public final void e() {
        vt0 vt0Var = this.f;
        if (vt0Var != null) {
            vt0Var.b();
        }
    }

    @Override // defpackage.jt0
    public final void f(lt0 lt0Var, boolean z) {
        if (z || lt0Var.i) {
            return;
        }
        vt0 vt0Var = this.f;
        if (vt0Var == null || vt0Var.u) {
            List list = lt0Var.l;
            for (int i = 0; i < list.size(); i++) {
                if (((ns0) list.get(i)).b == 0) {
                    h();
                    return;
                }
            }
        }
    }

    public final void g() {
        h04 h04Var = new h04(0);
        if (Objects.equals(this.g, h04Var)) {
            return;
        }
        dh3 dh3Var = this.d;
        dh3Var.c.cancel(dh3Var.a);
        this.g = h04Var;
    }

    public final void h() {
        Class cls = this.e;
        boolean z = this.c;
        Context context = this.a;
        if (!z) {
            try {
                context.startService(new Intent(context, (Class<?>) cls).setAction("androidx.media3.exoplayer.downloadService.action.INIT"));
                return;
            } catch (IllegalStateException unused) {
                l93.q0("DownloadService", "Failed to restart (process is idle)");
                return;
            }
        }
        try {
            Intent action = new Intent(context, (Class<?>) cls).setAction("androidx.media3.exoplayer.downloadService.action.RESTART");
            String str = f35.a;
            if (Build.VERSION.SDK_INT >= 26) {
                context.startForegroundService(action);
            } else {
                context.startService(action);
            }
        } catch (IllegalStateException unused2) {
            l93.q0("DownloadService", "Failed to restart (foreground launch restriction)");
        }
    }

    public final boolean i() {
        lt0 lt0Var = this.b;
        boolean z = lt0Var.k;
        dh3 dh3Var = this.d;
        if (dh3Var == null) {
            return !z;
        }
        if (!z) {
            g();
            return true;
        }
        h04 h04Var = (h04) lt0Var.m.d;
        int i = dh3.d;
        int i2 = h04Var.n;
        int i3 = h04Var.n;
        int i4 = i2 & i;
        if (!(i4 == i2 ? h04Var : new h04(i4)).equals(h04Var)) {
            g();
            return false;
        }
        if (Objects.equals(this.g, h04Var)) {
            return true;
        }
        String packageName = this.a.getPackageName();
        int i5 = dh3Var.a;
        ComponentName componentName = dh3Var.b;
        int i6 = i & i3;
        h04 h04Var2 = i6 == i3 ? h04Var : new h04(i6);
        if (!h04Var2.equals(h04Var)) {
            l93.q0("PlatformScheduler", "Ignoring unsupported requirements: " + (h04Var2.n ^ i3));
        }
        JobInfo.Builder builder = new JobInfo.Builder(i5, componentName);
        if ((i3 & 2) != 0) {
            builder.setRequiredNetworkType(2);
        } else if ((i3 & 1) != 0) {
            builder.setRequiredNetworkType(1);
        }
        builder.setRequiresDeviceIdle((i3 & 4) != 0);
        builder.setRequiresCharging((i3 & 8) != 0);
        if (Build.VERSION.SDK_INT >= 26 && (i3 & 16) != 0) {
            builder.setRequiresStorageNotLow(true);
        }
        builder.setPersisted(true);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("service_action", "androidx.media3.exoplayer.downloadService.action.RESTART");
        persistableBundle.putString("service_package", packageName);
        persistableBundle.putInt("requirements", i3);
        builder.setExtras(persistableBundle);
        if (dh3Var.c.schedule(builder.build()) == 1) {
            this.g = h04Var;
            return true;
        }
        l93.q0("DownloadService", "Failed to schedule restart");
        g();
        return false;
    }
}
