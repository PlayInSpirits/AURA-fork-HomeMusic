package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class df5 extends LifecycleCallback implements DialogInterface.OnCancelListener {
    public volatile boolean o;
    public final AtomicReference p;
    public final zw2 q;
    public final ej1 r;
    public final qi s;
    public final ij1 t;

    public df5(x92 r5, ij1 r6) {
        ej1 r0 = ej1.c;
        super(r5);
        this.p = new AtomicReference(null);
        this.q = new zw2(Looper.getMainLooper(), 2);
        this.r = r0;
        this.s = new qi(0);
        this.t = r6;
        r5.g(this);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void b(int r7, int r8, Intent r9) {
        AtomicReference r0 = this.p;
        eg5 r1 = (eg5) r0.get();
        ij1 r3 = this.t;
        if (r7 == 1) goto L17;
        if (r7 != 2) goto L27;
        Activity r10 = a();
        int r11 = fj1.a;
        int r6 = this.r.b(r10, r11);
        if (r6 != 0) goto L11;
        r0.set(null);
        zw2 r12 = r3.A;
        r12.sendMessage(r12.obtainMessage(3));
        return;
    L11:
        if (r1 != null) goto L13;
        return;
    L13:
        if (r1.b.o != 18) goto L27;
        if (r6 != 18) goto L27;
        return;
    L27:
        if (r1 == null) goto L32;
        ka0 r13 = r1.b;
        int r14 = r1.a;
        r0.set(null);
        r3.g(r13, r14);
        return;
    L32:
        return;
    L17:
        if (r8 != (-1)) goto L20;
        r0.set(null);
        zw2 r15 = r3.A;
        r15.sendMessage(r15.obtainMessage(3));
        return;
    L20:
        if (r8 != 0) goto L27;
        if (r1 == null) goto L31;
        int r16 = 13;
        if (r9 == null) goto L25;
        r16 = r9.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
    L25:
        ka0 r17 = new ka0(1, r16, null, r1.b.toString());
        int r18 = r1.a;
        r0.set(null);
        r3.g(r17, r18);
        return;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void c(Bundle r4) {
        if (r4 != null) goto L4;
        return;
    L4:
        if (r4.getBoolean("resolving_error", false) == false) goto L6;
        eg5 r1 = new eg5(new ka0(r4.getInt("failed_status"), (PendingIntent) r4.getParcelable("failed_resolution")), r4.getInt("failed_client_id", -1));
    L7:
        this.p.set(r1);
        return;
    L6:
        r1 = null;
        goto L7
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void d() {
        if (this.s.isEmpty() == true) goto L6;
        this.t.a(this);
        return;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void e(Bundle r4) {
        eg5 r3 = (eg5) this.p.get();
        if (r3 != null) goto L5;
        return;
    L5:
        ka0 r0 = r3.b;
        r4.putBoolean("resolving_error", true);
        r4.putInt("failed_client_id", r3.a);
        r4.putInt("failed_status", r0.o);
        r4.putParcelable("failed_resolution", r0.p);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void f() {
        this.o = true;
        if (this.s.isEmpty() == true) goto L6;
        this.t.a(this);
        return;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void g() {
        this.o = false;
        ij1 r0 = this.t;
        r0.getClass();
        Object r1 = ij1.E;
        monitor-enter(r1);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (r0.x != this) goto L9;
        r0.x = null;     // Catch: Throwable -> L7
        r0.y.clear();     // Catch: Throwable -> L7
    L9:
        monitor-exit(r1);     // Catch: Throwable -> L7
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface r4) {
        ka0 r5 = new ka0(13, null);
        AtomicReference r0 = this.p;
        eg5 r2 = (eg5) r0.get();
        if (r2 != null) goto L5;
        int r3 = -1;
    L6:
        r0.set(null);
        this.t.g(r5, r3);
        return;
    L5:
        r3 = r2.a;
        goto L6
    }
}
