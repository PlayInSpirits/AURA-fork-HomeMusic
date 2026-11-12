package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class zw2 extends Handler {
    public final /* synthetic */ int a;

    public zw2(Looper r1, int r2) {
        this.a = r2;
        switch(r2) {
            case 4: goto L6;
            default: goto L4;
        };
    L4:
        super(r1);
        Looper.getMainLooper();
        return;
    L6:
        super(r1);
        Looper.getMainLooper();
    }

    @Override // android.os.Handler
    public void handleMessage(Message r4) {
        switch(this.a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        super.handleMessage(r4);
        return;
    L6:
        yw2 r3 = (yw2) r4.obj;
        int r5 = r4.what;
        if (r5 != 1) goto L9;
        qk r6 = r3.a;
        Object r7 = r3.b[0];
        if (r6.q.get() == false) goto L42;
        CountDownLatch r8 = r6.s;
        og5 r0 = r6.t;     // Catch: Throwable -> L19
        if (r0.h != r6) goto L18;
        SystemClock.uptimeMillis();     // Catch: Throwable -> L19
        r0.h = null;     // Catch: Throwable -> L19
        r0.b();     // Catch: Throwable -> L19
    L18:
        r8.countDown();
    L37:
        r6.p = 3;
        return;
    L19:
        th = move-exception;
        r8.countDown();
        throw th;
    L42:
        og5 r1 = r6.t;     // Catch: Throwable -> L39
        if (r1.g == r6) goto L28;
        if (r1.h != r6) goto L36;
        SystemClock.uptimeMillis();     // Catch: Throwable -> L39
        r1.h = null;     // Catch: Throwable -> L39
        r1.b();     // Catch: Throwable -> L39
    L36:
        r6.s.countDown();
        goto L37
    L28:
        if (r1.c == true) goto L36;
        SystemClock.uptimeMillis();     // Catch: Throwable -> L39
        r1.g = null;     // Catch: Throwable -> L39
        ld2 r2 = r1.a;     // Catch: Throwable -> L39
        if (r2 == null) goto L36;
        if (Looper.myLooper() != Looper.getMainLooper()) goto L35;
        r2.k(r7);     // Catch: Throwable -> L39
        goto L36
    L35:
        r2.i(r7);     // Catch: Throwable -> L39
    L39:
        th = move-exception;
        r6.s.countDown();
        throw th;
    L9:
        if (r5 != 2) goto L46;
        qk r9 = r3.a;
        return;
    }

    public /* synthetic */ zw2(Looper r1, int r2, boolean r3) {
        this.a = r2;
        super(r1);
    }

    public /* synthetic */ zw2(Looper r1, Handler.Callback r2, int r3) {
        this.a = r3;
        super(r1, r2);
    }

    public /* synthetic */ zw2() {
        this.a = 1;
    }
}
