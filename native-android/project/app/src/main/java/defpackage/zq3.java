package defpackage;

import android.net.Uri;
import androidx.media3.common.PriorityTaskManager$PriorityTooLowException;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zq3 implements du0 {
    public final Executor a;
    public final ii0 b;
    public final lx c;
    public final ux d;
    public kt0 e;
    public volatile yq3 f;
    public volatile boolean g;

    public zq3(gn2 r14, kx r15, Executor r16, long r17, long r19) {
        r16.getClass();
        this.a = r16;
        bn2 r18 = r14.b;
        r18.getClass();
        Map r6 = Collections.EMPTY_MAP;
        Uri r1 = r18.a;
        String r11 = r18.f;
        rr2.s(r1, "The uri must be set.");
        ii0 r0 = new ii0(r1, 0, 1, null, r6, r17, r19, r11, 4);
        this.b = r0;
        lx r110 = r15.b();
        this.c = r110;
        this.d = new ux(r110, r0, null, new ss2(9, this));
    }

    @Override // defpackage.du0
    public final void a(kt0 r3) {
        this.e = r3;
        boolean r4 = false;
    L3:
        if (r4 == true) goto L23;
    L9:
        th = move-exception;
        yq3 r2 = this.f;
        r2.getClass();
        r2.a();
        throw th;
    L5:
        if (this.g == true) goto L23;
        this.f = new yq3(this);     // Catch: Throwable -> L9
        this.a.execute(this.f);     // Catch: Throwable -> L9
        this.f.get();     // Catch: Throwable -> L9 ExecutionException -> L11
    L8:
        r4 = true;
    L11:
        e = move-exception;
        Throwable r0 = e.getCause();     // Catch: Throwable -> L9
        r0.getClass();     // Catch: Throwable -> L9
        if ((r0 instanceof PriorityTaskManager$PriorityTooLowException) == true) goto L3;
        if ((r0 instanceof IOException) == true) goto L20;
        String r5 = f35.a;     // Catch: Throwable -> L9
        throw r0;     // Catch: Throwable -> L9
    L20:
        throw ((IOException) r0);     // Catch: Throwable -> L9
    L23:
        yq3 r6 = this.f;
        r6.getClass();
        r6.a();
    }

    @Override // defpackage.du0
    public final void cancel() {
        this.g = true;
        yq3 r1 = this.f;
        if (r1 == null) goto L6;
        r1.cancel(true);
        return;
    }

    @Override // defpackage.du0
    public final void remove() {
        lx r0 = this.c;
        r0.n.m(r0.r.d(this.b));
    }
}
