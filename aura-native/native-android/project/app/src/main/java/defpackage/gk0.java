package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException;
import androidx.media3.exoplayer.drm.DefaultDrmSession$UnexpectedDrmSessionException;
import androidx.media3.exoplayer.drm.MediaDrmCallbackException;
import androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException;
import com.eddyizm.tempus.homemusic.SmartSession;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gk0 extends Handler {
    public final /* synthetic */ int a = 1;
    public boolean b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gk0(gm2 gm2Var, Looper looper) {
        super(looper);
        this.c = gm2Var;
        this.b = false;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Throwable defaultDrmSession$UnexpectedDrmSessionException;
        long jMin;
        Object objF;
        ed2 ed2Var;
        int iH;
        boolean zY;
        switch (this.a) {
            case 0:
                hk0 hk0Var = (hk0) message.obj;
                try {
                    int i = message.what;
                    if (i == 1) {
                        objF = ((ik0) this.c).k.f((l31) hk0Var.d);
                    } else {
                        if (i != 2) {
                            throw new RuntimeException();
                        }
                        ik0 ik0Var = (ik0) this.c;
                        qm2 qm2VarE = ik0Var.k.e(ik0Var.l, (k31) hk0Var.d);
                        synchronized (((ik0) this.c).o) {
                            try {
                                si1 si1Var = ((ik0) this.c).y;
                                if (si1Var != null && (ed2Var = qm2VarE.b) != null) {
                                    ((uw1) si1Var.o).c(new ed2(ed2Var.a, ed2Var.b, ed2Var.c, ed2Var.d, SystemClock.elapsedRealtime() - hk0Var.c, ed2Var.f));
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                        objF = qm2VarE;
                    }
                } catch (MediaDrmCallbackException e) {
                    hk0 hk0Var2 = (hk0) message.obj;
                    objF = e;
                    if (hk0Var2.b) {
                        int i2 = hk0Var2.e + 1;
                        hk0Var2.e = i2;
                        ((ik0) this.c).i.getClass();
                        if (i2 <= 3) {
                            ed2 ed2Var2 = new ed2(e.n, e.o, e.p, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - hk0Var2.c, e.q);
                            if (e.getCause() instanceof IOException) {
                                objF = e;
                                defaultDrmSession$UnexpectedDrmSessionException = (IOException) e.getCause();
                            } else {
                                objF = e;
                                defaultDrmSession$UnexpectedDrmSessionException = new DefaultDrmSession$UnexpectedDrmSessionException(e.getCause());
                            }
                            i80 i80Var = ((ik0) this.c).i;
                            int i3 = hk0Var2.e;
                            i80Var.getClass();
                            while (true) {
                                if (defaultDrmSession$UnexpectedDrmSessionException == null) {
                                    jMin = Math.min((i3 - 1) * 1000, SmartSession.MAX_SONGS);
                                } else if ((defaultDrmSession$UnexpectedDrmSessionException instanceof ParserException) || (defaultDrmSession$UnexpectedDrmSessionException instanceof FileNotFoundException) || (defaultDrmSession$UnexpectedDrmSessionException instanceof HttpDataSource$CleartextNotPermittedException) || (defaultDrmSession$UnexpectedDrmSessionException instanceof Loader$UnexpectedLoaderException) || ((defaultDrmSession$UnexpectedDrmSessionException instanceof DataSourceException) && ((DataSourceException) defaultDrmSession$UnexpectedDrmSessionException).n == 2008)) {
                                    jMin = -9223372036854775807L;
                                } else {
                                    defaultDrmSession$UnexpectedDrmSessionException = defaultDrmSession$UnexpectedDrmSessionException.getCause();
                                }
                            }
                            objF = e;
                            if (jMin != -9223372036854775807L) {
                                synchronized (((ik0) this.c).o) {
                                    si1 si1Var2 = ((ik0) this.c).y;
                                    if (si1Var2 != null) {
                                        ((uw1) si1Var2.o).c(ed2Var2);
                                    }
                                    synchronized (this) {
                                        try {
                                            if (!this.b) {
                                                sendMessageDelayed(Message.obtain(message), jMin);
                                                return;
                                            }
                                            objF = e;
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } catch (Exception e2) {
                    l93.r0("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e2);
                    objF = e2;
                }
                objF = e;
                i80 i80Var2 = ((ik0) this.c).i;
                long j = hk0Var.a;
                i80Var2.getClass();
                synchronized (this) {
                    try {
                        if (!this.b) {
                            ((ik0) this.c).n.obtainMessage(message.what, Pair.create(hk0Var.d, objF)).sendToTarget();
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                return;
            default:
                gm2 gm2Var = (gm2) this.c;
                im2 im2Var = gm2Var.e;
                if (this.b) {
                    int i4 = message.what;
                    if (i4 == 2) {
                        gm2Var.b((ei3) message.obj);
                        return;
                    }
                    if (i4 == 8) {
                        im2Var.a1().Y0();
                        return;
                    }
                    if (i4 == 9) {
                        int iIntValue = ((Integer) message.obj).intValue();
                        hm2 hm2Var = im2Var.n;
                        im2Var.n = new hm2((fg4) hm2Var.d, (ei3) hm2Var.e, (eo2) hm2Var.f, hm2Var.a, (CharSequence) hm2Var.g, iIntValue, hm2Var.c, (Bundle) hm2Var.h);
                        gm2Var.e();
                        return;
                    }
                    switch (i4) {
                        case 11:
                            gm2Var.a(((Boolean) message.obj).booleanValue());
                            return;
                        case 12:
                            int iIntValue2 = ((Integer) message.obj).intValue();
                            hm2 hm2Var2 = im2Var.n;
                            im2Var.n = new hm2((fg4) hm2Var2.d, (ei3) hm2Var2.e, (eo2) hm2Var2.f, hm2Var2.a, (CharSequence) hm2Var2.g, hm2Var2.b, iIntValue2, (Bundle) hm2Var2.h);
                            gm2Var.e();
                            return;
                        case 13:
                            if (!im2Var.l) {
                                im2Var.e1();
                                return;
                            }
                            hm2 hm2Var3 = im2Var.n;
                            ei3 ei3VarY0 = im2.Y0(im2Var.i.z());
                            qu1 qu1VarA = ((xk2) im2Var.i.n).e.a();
                            int iV = -1;
                            if (qu1VarA != null) {
                                try {
                                    iH = qu1VarA.h();
                                } catch (RemoteException | SecurityException e3) {
                                    l93.G("MediaControllerCompat", "Dead object in getRepeatMode.", e3);
                                    iH = -1;
                                }
                            } else {
                                iH = -1;
                            }
                            qu1 qu1VarA2 = ((xk2) im2Var.i.n).e.a();
                            if (qu1VarA2 != null) {
                                try {
                                    iV = qu1VarA2.V();
                                } catch (RemoteException | SecurityException e4) {
                                    l93.G("MediaControllerCompat", "Dead object in getShuffleMode.", e4);
                                }
                                break;
                            }
                            im2Var.n = new hm2((fg4) hm2Var3.d, ei3VarY0, (eo2) hm2Var3.f, hm2Var3.a, (CharSequence) hm2Var3.g, iH, iV, (Bundle) hm2Var3.h);
                            qu1 qu1VarA3 = ((xk2) im2Var.i.n).e.a();
                            if (qu1VarA3 != null) {
                                try {
                                    zY = qu1VarA3.Y();
                                } catch (RemoteException | SecurityException e5) {
                                    l93.G("MediaControllerCompat", "Dead object in isCaptioningEnabled.", e5);
                                    zY = false;
                                }
                                break;
                            } else {
                                zY = false;
                            }
                            gm2Var.a(zY);
                            gm2Var.d.removeMessages(1);
                            im2Var.b1(false, im2Var.n);
                            return;
                        default:
                            return;
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gk0(ik0 ik0Var, Looper looper) {
        super(looper);
        this.c = ik0Var;
    }
}
