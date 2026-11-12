package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ew2 implements Handler.Callback {
    public final dw2 n;
    public bq o;
    public no2 p;
    public cu4 q;
    public boolean r;
    public final /* synthetic */ fw2 s;

    public ew2(fw2 r1) {
        this.s = r1;
        this.n = new dw2(this);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message r6) {
        if (this.r == false) goto L5;
        return true;
    L5:
        int r0 = r6.what;
        if (r0 == 1) goto L52;
        if (r0 != 2) goto L9;
        no2 r7 = this.p;     // Catch: IOException -> L38
        if (r7 != null) goto L40;
        bq r8 = this.o;     // Catch: IOException -> L38
        r8.getClass();     // Catch: IOException -> L38
        r8.j();     // Catch: IOException -> L38
    L41:
        this.s.c.h(2, 100);     // Catch: IOException -> L38
        return true;
    L40:
        r7.h();     // Catch: IOException -> L38
    L38:
        e = move-exception;
        hw2 r1 = this.s.e.a;
        monitor-enter(r1.p);
        lb4 r2 = r1.r;     // Catch: Throwable -> L49
        r2.getClass();     // Catch: Throwable -> L49
        r2.m(e);     // Catch: Throwable -> L49
        this.s.a();
        return true;
    L49:
        th = move-exception;
        throw th;
    L9:
        if (r0 != 3) goto L11;
        no2 r5 = this.p;
        r5.getClass();
        od2 r9 = new od2();
        r9.a = 0;
        r5.o(new pd2(r9));
        return true;
    L11:
        if (r0 == 4) goto L15;
        return false;
    L15:
        if (this.p == null) goto L17;
        bq r10 = this.o;
        r10.getClass();
        r10.n(this.p);
    L17:
        bq r11 = this.o;
        if (r11 == null) goto L20;
        r11.o(this.n);
    L20:
        this.s.c.e();
        gw2 r12 = fw2.g;
        monitor-enter(r12);
        int r3 = r12.c - 1;     // Catch: Throwable -> L25
        r12.c = r3;     // Catch: Throwable -> L25
        if (r3 != 0) goto L27;
        HandlerThread r4 = r12.b;     // Catch: Throwable -> L25
        r4.getClass();     // Catch: Throwable -> L25
        r4.quit();     // Catch: Throwable -> L25
        r12.b = null;     // Catch: Throwable -> L25
        r12.a.clear();     // Catch: Throwable -> L25
    L28:
        monitor-exit(r12);
        this.r = true;
        return true;
    L27:
        r12.a();     // Catch: Throwable -> L25
    L25:
        th = move-exception;
        throw th;
    L52:
        gn2 r13 = (gn2) r6.obj;
        bq r14 = this.s.a.d(r13);
        this.o = r14;
        r14.k(this.n, null, ik3.c);
        this.s.c.g(2);
        return true;
    }
}
