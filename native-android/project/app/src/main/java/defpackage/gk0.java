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
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ Object c;

    public gk0(gm2 r2, Looper r3) {
        this.a = 1;
        this.c = r2;
        super(r3);
        this.b = false;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message r23) {
        switch(this.a) {
            case 0: goto L51;
            default: goto L4;
        };
    L4:
        gm2 r6 = (gm2) this.c;
        im2 r7 = r6.e;
        if (this.b == false) goto L168;
        int r0 = r23.what;
        if (r0 != 2) goto L10;
        r6.b((ei3) r23.obj);
        return;
    L10:
        if (r0 != 8) goto L12;
        r7.a1().Y0();
        return;
    L12:
        if (r0 == 9) goto L47;
        switch(r0) {
            case 11: goto L46;
            case 12: goto L45;
            case 13: goto L16;
            default: goto L169;
        };
    L45:
        int r15 = ((Integer) r23.obj).intValue();
        hm2 r1 = r7.n;
        r7.n = new hm2((fg4) r1.d, (ei3) r1.e, (eo2) r1.f, r1.a, (CharSequence) r1.g, r1.b, r15, (Bundle) r1.h);
        r6.e();
        return;
    L46:
        r6.a(((Boolean) r23.obj).booleanValue());
        return;
    L169:
        return;
    L16:
        if (r7.l == true) goto L18;
        r7.e1();
        return;
    L18:
        hm2 r2 = r7.n;
        ei3 r10 = im2.Y0(r7.i.z());
        qu1 r3 = ((xk2) r7.i.n).e.a();
        int r4 = -1;
        if (r3 != null) goto L150;
    L26:
        int r14 = -1;
    L27:
        qu1 r5 = ((xk2) r7.i.n).e.a();
        if (r5 == null) goto L35;
        r4 = r5.V();     // Catch: Throwable -> L31 RemoteException -> L33
    L31:
        e = move-exception;
        l93.G("MediaControllerCompat", "Dead object in getShuffleMode.", e);
    L35:
        r7.n = new hm2((fg4) r2.d, r10, (eo2) r2.f, r2.a, (CharSequence) r2.g, r14, r4, (Bundle) r2.h);
        qu1 r8 = ((xk2) r7.i.n).e.a();
        if (r8 != null) goto L152;
    L43:
        boolean r9 = false;
    L44:
        r6.a(r9);
        r6.d.removeMessages(1);
        r7.b1(false, r7.n);
        return;
    L152:
        r9 = r8.Y();     // Catch: SecurityException -> L39 Throwable -> L41
    L41:
        e = move-exception;
        l93.G("MediaControllerCompat", "Dead object in isCaptioningEnabled.", e);
        goto L43
    L150:
        r14 = r3.h();     // Catch: Throwable -> L22 RemoteException -> L24
    L22:
        e = move-exception;
        l93.G("MediaControllerCompat", "Dead object in getRepeatMode.", e);
        goto L26
    L47:
        int r16 = ((Integer) r23.obj).intValue();
        hm2 r11 = r7.n;
        r7.n = new hm2((fg4) r11.d, (ei3) r11.e, (eo2) r11.f, r11.a, (CharSequence) r11.g, r16, r11.c, (Bundle) r11.h);
        r6.e();
        return;
    L168:
        return;
    L51:
        hk0 r12 = (hk0) r23.obj;
        int r13 = r23.what;     // Catch: Exception -> L68 MediaDrmCallbackException -> L70
        if (r13 == 1) goto L74;
        if (r13 != 2) goto L73;
        ik0 r17 = (ik0) this.c;     // Catch: Exception -> L68 MediaDrmCallbackException -> L70
        qm2 r18 = r17.k.e(r17.l, (k31) r12.d);     // Catch: Exception -> L68 MediaDrmCallbackException -> L70
        Object r19 = ((ik0) this.c).o;     // Catch: Exception -> L68 MediaDrmCallbackException -> L70
        monitor-enter(r19);     // Catch: Exception -> L68 MediaDrmCallbackException -> L70
        si1 r20 = ((ik0) this.c).y;     // Catch: Throwable -> L62
        if (r20 == null) goto L64;
        ed2 r21 = r18.b;     // Catch: Throwable -> L62
        if (r21 == null) goto L64;
        ((uw1) r20.o).c(new ed2(r21.a, r21.b, r21.c, r21.d, SystemClock.elapsedRealtime() - r12.c, r21.f));     // Catch: Throwable -> L62
    L64:
        monitor-exit(r19);     // Catch: Throwable -> L62
        Object r22 = r18;
    L124:
        i80 r24 = ((ik0) this.c).i;
        long r25 = r12.a;
        r24.getClass();
        monitor-enter(this);
    L129:
        th = move-exception;
        throw th;
    L127:
        if (this.b == true) goto L131;
        ((ik0) this.c).n.obtainMessage(r23.what, Pair.create(r12.d, r22)).sendToTarget();     // Catch: Throwable -> L129
    L131:
        monitor-exit(this);     // Catch: Throwable -> L129
        return;
    L62:
        th = move-exception;
        throw th;     // Catch: Exception -> L68 MediaDrmCallbackException -> L70
    L73:
        throw new RuntimeException();     // Catch: Exception -> L68 MediaDrmCallbackException -> L70
    L74:
        r22 = ((ik0) this.c).k.f((l31) r12.d);     // Catch: Exception -> L68 MediaDrmCallbackException -> L70
    L70:
        e = move-exception;
        hk0 r26 = (hk0) r23.obj;
        r22 = e;
        if (r26.b == false) goto L124;
        int r27 = r26.e + 1;
        r26.e = r27;
        ((ik0) this.c).i.getClass();
        r22 = e;
        if (r27 > 3) goto L124;
        ed2 r28 = new ed2(e.n, e.o, e.p, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - r26.c, e.q);
        if ((e.getCause() instanceof IOException) == false) goto L86;
        Throwable r29 = (IOException) e.getCause();
    L87:
        i80 r30 = ((ik0) this.c).i;
        int r31 = r26.e;
        r30.getClass();
    L89:
        if (r29 == null) goto L105;
        if ((r29 instanceof ParserException) == true) goto L104;
        if ((r29 instanceof FileNotFoundException) == true) goto L104;
        if ((r29 instanceof HttpDataSource$CleartextNotPermittedException) == true) goto L104;
        if ((r29 instanceof Loader$UnexpectedLoaderException) == true) goto L104;
        if ((r29 instanceof DataSourceException) == false) goto L103;
        if (((DataSourceException) r29).n == 2008) goto L104;
    L103:
        r29 = r29.getCause();
    L104:
        long r32 = -9223372036854775807L;
    L106:
        r22 = e;
        if (r32 == (-9223372036854775807L)) goto L124;
        monitor-enter(((ik0) this.c).o);
        si1 r33 = ((ik0) this.c).y;     // Catch: Throwable -> L137
        if (r33 == null) goto L114;
        ((uw1) r33.o).c(r28);     // Catch: Throwable -> L137
    L114:
        monitor-enter(this);
    L121:
        th = move-exception;
        throw th;
    L117:
        if (this.b == true) goto L123;
        sendMessageDelayed(Message.obtain(r23), r32);     // Catch: Throwable -> L121
        return;
    L123:
        r22 = e;
    L137:
        th = move-exception;
        throw th;
    L105:
        r32 = Math.min((r31 - 1) * 1000, SmartSession.MAX_SONGS);
        goto L106
    L86:
        r29 = new DefaultDrmSession$UnexpectedDrmSessionException(e.getCause());
    L68:
        e = move-exception;
        l93.r0("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e);
        r22 = e;
        goto L124
    }

    public gk0(ik0 r2, Looper r3) {
        this.a = 0;
        this.c = r2;
        super(r3);
    }
}
