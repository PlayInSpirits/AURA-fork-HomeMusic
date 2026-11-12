package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException;
import com.eddyizm.tempus.homemusic.SmartSession;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class id2 extends Handler implements Runnable {
    public final int n;
    public final jd2 o;
    public final long p;
    public hd2 q;
    public IOException r;
    public int s;
    public Thread t;
    public boolean u;
    public volatile boolean v;
    public final /* synthetic */ i61 w;

    public id2(i61 r1, Looper r2, jd2 r3, hd2 r4, int r5, long r6) {
        this.w = r1;
        super(r2);
        this.o = r3;
        this.q = r4;
        this.n = r5;
        this.p = r6;
    }

    public final void a(boolean r9) {
        this.v = r9;
        this.r = null;
        if (hasMessages(1) == false) goto L7;
        this.u = true;
        removeMessages(1);
        if (r9 == true) goto L14;
        sendEmptyMessage(2);
    L14:
        if (r9 == false) goto L21;
        this.w.p = null;
        long r3 = SystemClock.elapsedRealtime();
        hd2 r1 = this.q;
        r1.getClass();
        r1.b(this.o, r3, r3 - this.p, true);
        this.q = null;
        return;
    L21:
        return;
    L7:
        monitor-enter(this);
        this.u = true;     // Catch: Throwable -> L11
        this.o.b();     // Catch: Throwable -> L11
        Thread r2 = this.t;     // Catch: Throwable -> L11
        if (r2 == null) goto L13;
        r2.interrupt();     // Catch: Throwable -> L11
    L13:
        monitor-exit(this);     // Catch: Throwable -> L11
    L11:
        th = move-exception;
        throw th;
    }

    public final void b() {
        long r2 = SystemClock.elapsedRealtime();
        long r4 = r2 - this.p;
        hd2 r0 = this.q;
        r0.getClass();
        r0.j(this.o, r2, r4, this.s);
        this.r = null;
        i61 r7 = this.w;
        ty3 r1 = (ty3) r7.o;
        id2 r8 = (id2) r7.p;
        r8.getClass();
        r1.execute(r8);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message r13) {
        if (this.v == true) goto L51;
        int r0 = r13.what;
        if (r0 != 1) goto L10;
        b();
        return;
    L10:
        if (r0 == 4) goto L47;
        this.w.p = null;
        long r5 = SystemClock.elapsedRealtime();
        long r7 = r5 - this.p;
        hd2 r3 = this.q;
        r3.getClass();
        if (this.u == false) goto L15;
        r3.b(this.o, r5, r7, false);
        return;
    L15:
        int r1 = r13.what;
        if (r1 != 2) goto L18;
        r3.g(this.o, r5, r7);     // Catch: RuntimeException -> L43
        return;
    L43:
        e = move-exception;
        l93.G("LoadTask", "Unexpected exception handling load completed", e);
        this.w.q = new Loader$UnexpectedLoaderException(e);
        return;
    L18:
        if (r1 != 3) goto L52;
        IOException r9 = (IOException) r13.obj;
        this.r = r9;
        int r10 = this.s + 1;
        this.s = r10;
        dd2 r14 = r3.s(this.o, r5, r7, r9, r10);
        int r2 = r14.a;
        if (r2 != 3) goto L24;
        this.w.q = this.r;
        return;
    L24:
        if (r2 == 2) goto L50;
        if (r2 != 1) goto L27;
        this.s = 1;
    L27:
        long r4 = r14.b;
        if (r4 != (-9223372036854775807L)) goto L31;
        r4 = Math.min((this.s - 1) * 1000, SmartSession.MAX_SONGS);
    L31:
        i61 r15 = this.w;
        if (((id2) r15.p) != null) goto L34;
        boolean r6 = true;
    L35:
        rr2.w(r6);
        r15.p = this;
        if (r4 <= 0) goto L39;
        sendEmptyMessageDelayed(1, r4);
        return;
    L39:
        b();
        return;
    L34:
        r6 = false;
        goto L35
    L50:
        return;
    L52:
        return;
    L47:
        throw ((Error) r13.obj);
    }

    @Override // java.lang.Runnable
    public final void run() {
        monitor-enter(this);     // Catch: Error -> L10 OutOfMemoryError -> L12 Exception -> L14 IOException -> L16
        boolean r2 = this.u;     // Catch: Throwable -> L32
        this.t = Thread.currentThread();     // Catch: Throwable -> L32
        monitor-exit(this);     // Catch: Throwable -> L32
        if (r2 == true) goto L21;
        Trace.beginSection("load:".concat(this.o.getClass().getSimpleName()));     // Catch: Error -> L10 OutOfMemoryError -> L12 Exception -> L14 IOException -> L16
        this.o.a();     // Catch: Throwable -> L18
        Trace.endSection();     // Catch: Error -> L10 OutOfMemoryError -> L12 Exception -> L14 IOException -> L16
    L18:
        th = move-exception;
        Trace.endSection();     // Catch: Error -> L10 OutOfMemoryError -> L12 Exception -> L14 IOException -> L16
        throw th;     // Catch: Error -> L10 OutOfMemoryError -> L12 Exception -> L14 IOException -> L16
    L21:
        monitor-enter(this);     // Catch: Error -> L10 OutOfMemoryError -> L12 Exception -> L14 IOException -> L16
        this.t = null;     // Catch: Throwable -> L29
        Thread.interrupted();     // Catch: Throwable -> L29
        monitor-exit(this);     // Catch: Throwable -> L29
        if (this.v == true) goto L56;
        sendEmptyMessage(2);     // Catch: Error -> L10 OutOfMemoryError -> L12 Exception -> L14 IOException -> L16
        return;
    L56:
        return;
    L29:
        th = move-exception;
        throw th;     // Catch: Error -> L10 OutOfMemoryError -> L12 Exception -> L14 IOException -> L16
    L32:
        th = move-exception;
        throw th;     // Catch: Error -> L10 OutOfMemoryError -> L12 Exception -> L14 IOException -> L16
    L16:
        e = move-exception;
        if (this.v == true) goto L61;
        obtainMessage(3, e).sendToTarget();
        return;
    L61:
        return;
    L14:
        e = move-exception;
        if (this.v == true) goto L59;
        l93.G("LoadTask", "Unexpected exception loading stream", e);
        obtainMessage(3, new Loader$UnexpectedLoaderException(e)).sendToTarget();
        return;
    L59:
        return;
    L12:
        e = move-exception;
        if (this.v == true) goto L57;
        l93.G("LoadTask", "OutOfMemory error loading stream", e);
        obtainMessage(3, new Loader$UnexpectedLoaderException(e)).sendToTarget();
        return;
    L57:
        return;
    L10:
        e = move-exception;
        if (this.v == true) goto L38;
        l93.G("LoadTask", "Unexpected error loading stream", e);
        obtainMessage(4, e).sendToTarget();
    L38:
        throw e;
    }
}
