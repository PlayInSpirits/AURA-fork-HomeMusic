package defpackage;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ut0 implements jt0 {
    public final Context a;
    public final lt0 b;
    public final boolean c;
    public final dh3 d;
    public final Class e;
    public vt0 f;
    public h04 g;

    public ut0(Context r1, lt0 r2, boolean r3, dh3 r4, Class r5) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
        r2.e.add(this);
        i();
    }

    @Override // defpackage.jt0
    public final void a(lt0 r1) {
        vt0 r0 = this.f;
        if (r0 == null) goto L6;
        vt0.a(r0, r1.l);
        return;
    }

    @Override // defpackage.jt0
    public final void b(lt0 r5, ns0 r6) {
        vt0 r7 = this.f;
        if (r7 == null) goto L15;
        la0 r8 = r7.n;
        if (r8 == null) goto L15;
        int r3 = r6.b;
        if (r3 == 2) goto L14;
        if (r3 == 5) goto L14;
        if (r3 == 7) goto L14;
        if (r8.o == false) goto L15;
        r8.d();
    L14:
        r8.n = true;
        r8.d();
    L15:
        vt0 r9 = this.f;
        if (r9 != null) goto L18;
    L21:
        int r10 = r6.b;
        if (r10 == 2) goto L27;
        if (r10 == 5) goto L27;
        if (r10 == 7) goto L27;
        return;
    L27:
        l93.q0("DownloadService", "DownloadService wasn't running. Restarting.");
        h();
        return;
    L18:
        if (r9.u == true) goto L21;
    }

    @Override // defpackage.jt0
    public final void c() {
        i();
    }

    @Override // defpackage.jt0
    public final void d(ns0 r1) {
        vt0 r0 = this.f;
        if (r0 == null) goto L10;
        la0 r2 = r0.n;
        if (r2 != null) goto L7;
        return;
    L7:
        if (r2.o == false) goto L12;
        r2.d();
        return;
    L12:
        return;
    }

    @Override // defpackage.jt0
    public final void e() {
        vt0 r0 = this.f;
        if (r0 == null) goto L6;
        r0.b();
        return;
    }

    @Override // defpackage.jt0
    public final void f(lt0 r2, boolean r3) {
        if (r3 == false) goto L4;
        return;
    L4:
        if (r2.i == true) goto L22;
        vt0 r4 = this.f;
        if (r4 != null) goto L8;
    L11:
        List r5 = r2.l;
        int r6 = 0;
    L13:
        if (r6 >= r5.size()) goto L23;
        if (((ns0) r5.get(r6)).b == 0) goto L16;
        r6 = r6 + 1;
        goto L13
    L16:
        h();
        return;
    L23:
        return;
    L8:
        if (r4.u == true) goto L11;
        return;
    }

    public final void g() {
        h04 r0 = new h04(0);
        if (Objects.equals(this.g, r0) == true) goto L6;
        dh3 r1 = this.d;
        r1.c.cancel(r1.a);
        this.g = r0;
        return;
    }

    public final void h() {
        Class r1 = this.e;
        boolean r2 = this.c;
        Context r4 = this.a;
        if (r2 == false) goto L16;
        Intent r3 = new Intent(r4, r1).setAction("androidx.media3.exoplayer.downloadService.action.RESTART");     // Catch: IllegalStateException -> L10
        String r5 = f35.a;     // Catch: IllegalStateException -> L10
        if (Build.VERSION.SDK_INT < 26) goto L8;
        rg3.a(r4, r3);     // Catch: IllegalStateException -> L10
        return;
    L8:
        r4.startService(r3);     // Catch: IllegalStateException -> L10
        return;
    L10:
        l93.q0("DownloadService", "Failed to restart (foreground launch restriction)");
        return;
    L16:
        r4.startService(new Intent(r4, r1).setAction("androidx.media3.exoplayer.downloadService.action.INIT"));     // Catch: IllegalStateException -> L13
        return;
    L13:
        l93.q0("DownloadService", "Failed to restart (process is idle)");
    }

    public final boolean i() {
        lt0 r0 = this.b;
        boolean r1 = r0.k;
        dh3 r3 = this.d;
        if (r3 == null) goto L5;
        if (r1 == true) goto L9;
        g();
        return true;
    L9:
        h04 r2 = (h04) r0.m.d;
        int r4 = dh3.d;
        int r5 = r2.n;
        int r6 = r2.n;
        int r7 = r5 & r4;
        if (r7 != r5) goto L12;
        h04 r8 = r2;
    L14:
        if (r8.equals(r2) == true) goto L18;
        g();
        return false;
    L18:
        if (Objects.equals(this.g, r2) == false) goto L20;
        return true;
    L20:
        String r9 = this.a.getPackageName();
        int r10 = r3.a;
        ComponentName r11 = r3.b;
        int r12 = r4 & r6;
        if (r12 != r6) goto L23;
        h04 r13 = r2;
    L25:
        if (r13.equals(r2) == true) goto L27;
        l93.q0("PlatformScheduler", "Ignoring unsupported requirements: " + (r13.n ^ r6));
    L27:
        JobInfo.Builder r14 = new JobInfo.Builder(r10, r11);
        if ((r6 & 2) == 0) goto L31;
        r14.setRequiredNetworkType(2);
    L34:
        if ((r6 & 4) == 0) goto L36;
        boolean r15 = true;
    L37:
        r14.setRequiresDeviceIdle(r15);
        if ((r6 & 8) == 0) goto L40;
        boolean r16 = true;
    L41:
        r14.setRequiresCharging(r16);
        if (Build.VERSION.SDK_INT >= 26) goto L44;
    L46:
        r14.setPersisted(true);
        PersistableBundle r17 = new PersistableBundle();
        r17.putString("service_action", "androidx.media3.exoplayer.downloadService.action.RESTART");
        r17.putString("service_package", r9);
        r17.putInt("requirements", r6);
        r14.setExtras(r17);
        if (r3.c.schedule(r14.build()) != 1) goto L50;
        this.g = r2;
        return true;
    L50:
        l93.q0("DownloadService", "Failed to schedule restart");
        g();
        return false;
    L44:
        if ((r6 & 16) == 0) goto L46;
        rg3.h(r14);
        goto L46
    L40:
        r16 = false;
        goto L41
    L36:
        r15 = false;
        goto L37
    L31:
        if ((r6 & 1) == 0) goto L34;
        r14.setRequiredNetworkType(1);
        goto L34
    L23:
        r13 = new h04(r12);
        goto L25
    L12:
        r8 = new h04(r7);
        goto L14
    L5:
        return !r1;
    }
}
