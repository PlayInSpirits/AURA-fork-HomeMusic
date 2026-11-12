package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.internal.a;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class fh5 {
    public Boolean a;
    public boolean b;
    public final /* synthetic */ a c;
    public final int d;
    public final Bundle e;
    public final /* synthetic */ a f;

    public fh5(a r2, int r3, Bundle r4) {
        this.f = r2;
        Boolean r0 = Boolean.TRUE;
        this.c = r2;
        this.a = r0;
        this.b = false;
        this.d = r3;
        this.e = r4;
    }

    public abstract void a(ka0 r1);

    public abstract boolean b();

    public final void c() {
        monitor-enter(this);
        this.a = null;     // Catch: Throwable -> L14
        monitor-exit(this);     // Catch: Throwable -> L14
        ArrayList r0 = this.c.x;
        monitor-enter(r0);
        this.c.x.remove(this);     // Catch: Throwable -> L11
        monitor-exit(r0);     // Catch: Throwable -> L11
        return;
    L11:
        th = move-exception;
        throw th;
    L14:
        th = move-exception;
        throw th;
    }
}
