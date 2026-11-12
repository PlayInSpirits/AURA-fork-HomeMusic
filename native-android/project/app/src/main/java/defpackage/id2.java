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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public id2(i61 i61Var, Looper looper, jd2 jd2Var, hd2 hd2Var, int i, long j) {
        super(looper);
        this.w = i61Var;
        this.o = jd2Var;
        this.q = hd2Var;
        this.n = i;
        this.p = j;
    }

    public final void a(boolean z) {
        this.v = z;
        this.r = null;
        if (hasMessages(1)) {
            this.u = true;
            removeMessages(1);
            if (!z) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.u = true;
                    this.o.b();
                    Thread thread = this.t;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z) {
            this.w.p = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            hd2 hd2Var = this.q;
            hd2Var.getClass();
            hd2Var.b(this.o, jElapsedRealtime, jElapsedRealtime - this.p, true);
            this.q = null;
        }
    }

    public final void b() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.p;
        hd2 hd2Var = this.q;
        hd2Var.getClass();
        hd2Var.j(this.o, jElapsedRealtime, j, this.s);
        this.r = null;
        i61 i61Var = this.w;
        ty3 ty3Var = (ty3) i61Var.o;
        id2 id2Var = (id2) i61Var.p;
        id2Var.getClass();
        ty3Var.execute(id2Var);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.v) {
            return;
        }
        int i = message.what;
        if (i == 1) {
            b();
            return;
        }
        if (i == 4) {
            throw ((Error) message.obj);
        }
        this.w.p = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.p;
        hd2 hd2Var = this.q;
        hd2Var.getClass();
        if (this.u) {
            hd2Var.b(this.o, jElapsedRealtime, j, false);
            return;
        }
        int i2 = message.what;
        if (i2 == 2) {
            try {
                hd2Var.g(this.o, jElapsedRealtime, j);
                return;
            } catch (RuntimeException e) {
                l93.G("LoadTask", "Unexpected exception handling load completed", e);
                this.w.q = new Loader$UnexpectedLoaderException(e);
                return;
            }
        }
        if (i2 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.r = iOException;
        int i3 = this.s + 1;
        this.s = i3;
        dd2 dd2VarS = hd2Var.s(this.o, jElapsedRealtime, j, iOException, i3);
        int i4 = dd2VarS.a;
        if (i4 == 3) {
            this.w.q = this.r;
            return;
        }
        if (i4 != 2) {
            if (i4 == 1) {
                this.s = 1;
            }
            long jMin = dd2VarS.b;
            if (jMin == -9223372036854775807L) {
                jMin = Math.min((this.s - 1) * 1000, SmartSession.MAX_SONGS);
            }
            i61 i61Var = this.w;
            rr2.w(((id2) i61Var.p) == null);
            i61Var.p = this;
            if (jMin > 0) {
                sendEmptyMessageDelayed(1, jMin);
            } else {
                b();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = this.u;
                this.t = Thread.currentThread();
            }
            if (!z) {
                Trace.beginSection("load:".concat(this.o.getClass().getSimpleName()));
                try {
                    this.o.a();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.t = null;
                Thread.interrupted();
            }
            if (this.v) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e) {
            if (this.v) {
                return;
            }
            obtainMessage(3, e).sendToTarget();
        } catch (Exception e2) {
            if (this.v) {
                return;
            }
            l93.G("LoadTask", "Unexpected exception loading stream", e2);
            obtainMessage(3, new Loader$UnexpectedLoaderException(e2)).sendToTarget();
        } catch (OutOfMemoryError e3) {
            if (this.v) {
                return;
            }
            l93.G("LoadTask", "OutOfMemory error loading stream", e3);
            obtainMessage(3, new Loader$UnexpectedLoaderException(e3)).sendToTarget();
        } catch (Error e4) {
            if (!this.v) {
                l93.G("LoadTask", "Unexpected error loading stream", e4);
                obtainMessage(4, e4).sendToTarget();
            }
            throw e4;
        }
    }
}
