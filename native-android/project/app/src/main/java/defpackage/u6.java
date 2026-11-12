package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import com.eddyizm.tempus.homemusic.HubException;
import com.eddyizm.tempus.homemusic.WaveSession;
import com.eddyizm.tempus.homemusic.a;
import com.eddyizm.tempus.homemusic.b;
import com.eddyizm.tempus.service.MediaService;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u6 implements Runnable {
    public final /* synthetic */ int n;

    public /* synthetic */ u6(int r1) {
        this.n = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = 3;
        int r1 = 2;
        int r2 = 6;
        long r3 = 0;
        int r5 = 4;
        vz r6 = null;
        int r7 = 0;
        switch(this.n) {
            case 0: goto L204;
            case 1: goto L185;
            case 2: goto L128;
            case 3: goto L238;
            case 4: goto L117;
            case 5: goto L47;
            case 6: goto L42;
            case 7: goto L40;
            case 8: goto L38;
            case 9: goto L36;
            case 10: goto L34;
            case 11: goto L32;
            case 12: goto L30;
            case 13: goto L23;
            case 14: goto L18;
            case 15: goto L14;
            case 16: goto L10;
            default: goto L4;
        };
    L4:
        MediaService r15 = is3.c;
        if (r15 == null) goto L293;
        qi3 r4 = r15.b();
        if (r4 == null) goto L294;
        is3.a(r4, r15);
        return;
    L294:
        return;
    L293:
        return;
    L10:
        yr1 r16 = xt1.b;
        if (r16 == null) goto L295;
        r16.invoke();
        return;
    L295:
        return;
    L14:
        yr1 r17 = xt1.f;
        if (r17 == null) goto L296;
        r17.invoke();
        return;
    L296:
        return;
    L18:
        WaveSession r18 = b.b;
        if (r18 == null) goto L297;
        r18.setFailures(0);
        b.c();
        return;
    L297:
        return;
    L23:
        WaveSession r19 = b.b;
        if (r19 == null) goto L299;
        b.d = SystemClock.elapsedRealtime();
        if (r19.getInFlight() == true) goto L298;
        b.c();
        return;
    L298:
        return;
    L299:
        return;
    L30:
        b.c = null;
        b.c();
        return;
    L32:
        a.c = null;
        a.b();
        return;
    L34:
        rs1 r110 = rs1.a;
        rs1.e();
        return;
    L36:
        rs1 r111 = rs1.a;
        rs1.h();
        return;
    L38:
        rs1 r112 = rs1.a;
        rs1.k(0);
        return;
    L40:
        rs1 r113 = rs1.a;
        rs1.e();
        return;
    L42:
        Context r114 = xr1.d;
        if (r114 == null) goto L300;
        io1.a.execute(new lf(r114, r5));
        return;
    L300:
        return;
    L47:
        boolean r115 = xr1.a;
        long r10 = 5000;
    L49:
        if (xr1.a == false) goto L301;
        rr1.h();     // Catch: Exception -> L106
        String r8 = rr1.c();     // Catch: Exception -> L106
        nz3 r9 = new nz3();     // Catch: Exception -> L106
        r9.d(r8 + "/api/events");     // Catch: Exception -> L106
        r9.a("Accept", "text/event-stream");     // Catch: Exception -> L106
        oz3 r12 = new oz3(r9);     // Catch: Exception -> L106
        o83 r11 = (o83) xr1.e.getValue();     // Catch: Exception -> L106
        r11.getClass();     // Catch: Exception -> L106
        bv3 r13 = new bv3(r11, r12);     // Catch: Exception -> L106
        xr1.b = r13;     // Catch: Exception -> L106
        k14 r14 = r13.c();     // Catch: Exception -> L106
    L101:
        th = th;
    L226:
        throw th;     // Catch: Throwable -> L103
    L103:
        th = move-exception;
        q05.h(r14, th);     // Catch: Exception -> L106
        throw th;     // Catch: Exception -> L106
    L52:
        if (r14.C == false) goto L100;
        Log.d("HubEvents", "Listening to " + r8 + "/api/events");     // Catch: Throwable -> L70
        Handler r20 = io1.b;     // Catch: Throwable -> L70
        u6 r116 = xr1.f;     // Catch: Throwable -> L70
        r20.removeCallbacks(r116);     // Catch: Throwable -> L70
        r20.postDelayed(r116, 3000);     // Catch: Throwable -> L70
        n14 r21 = r14.t;     // Catch: Throwable -> L70
        if (r21 == null) goto L232;
        fw r22 = r21.source();     // Catch: Throwable -> L70
        if (r22 == null) goto L232;
    L58:
        String r117 = "message";
    L60:
        if (xr1.a == false) goto L232;
        String r118 = r22.o();     // Catch: Throwable -> L70
        if (r118 == null) goto L232;
        if (r118.length() == 0) goto L58;
        if (xm4.k0(r118, "event:", false) == true) goto L69;
        if (xm4.k0(r118, "data:", false) == false) goto L60;
        int r119 = r117.hashCode();     // Catch: Throwable -> L70
        if (r119 != 166208699) goto L77;
        if (r117.equals("library") == false) goto L60;
    L90:
        Log.d("HubEvents", "Event: " + r117);     // Catch: Throwable -> L70
        if (r117.equals("library") == false) goto L93;
        k03 r120 = wn1.a;     // Catch: Throwable -> L70
        io1.b.post(new u6(r5));     // Catch: Throwable -> L70
    L93:
        Handler r121 = io1.b;     // Catch: Throwable -> L70
        u6 r122 = xr1.f;     // Catch: Throwable -> L70
        r121.removeCallbacks(r122);     // Catch: Throwable -> L70
        r121.postDelayed(r122, 3000);     // Catch: Throwable -> L70
        goto L60
    L77:
        if (r119 != 1427818632) goto L79;
        if (r117.equals("download") == true) goto L90;
    L79:
        if (r119 != 1429828318) goto L60;
        if (r117.equals("assistant") == false) goto L60;
    L69:
        r117 = qm4.K0(r118.substring(6)).toString();     // Catch: Throwable -> L70
    L232:
        r14.close();     // Catch: Exception -> L97
        r10 = 5000;
    L111:
        if (xr1.a == false) goto L303;
        Thread.sleep(r10);     // Catch: InterruptedException -> L215
        r10 = r10 * 2;
        if (r10 <= 60000) goto L49;
        r10 = 60000;
    L116:
        return;
    L303:
        return;
    L97:
        e = e;
        r10 = 5000;
    L108:
        if (xr1.a == false) goto L302;
        Log.d("HubEvents", "Event stream dropped: " + e.getMessage());
        rr1.m();
        goto L111
    L302:
        return;
    L70:
        th = th;
        r10 = 5000;
        goto L226
    L100:
        throw rr1.i(r14);     // Catch: Throwable -> L101
    L106:
        e = e;
        goto L108
    L301:
        return;
    L117:
        k03 r123 = wn1.a;
        Long r23 = (Long) r123.d();
        if (r23 == null) goto L120;
        r3 = r23.longValue();
    L120:
        r123.k(Long.valueOf(r3 + 1));
        return;
    L128:
        b00 r124 = b00.a;
        monitor-enter(r124);
        b00.i = false;     // Catch: Throwable -> L182
        monitor-exit(r124);
    L132:
        kd3 r24 = b00.b();
        if (r24 == null) goto L307;
        String r25 = (String) r24.n;
        zz r26 = (zz) b00.e.getValue();
        r26.getClass();
        r25.getClass();
        wz r27 = r26.a;
        monitor-enter(r27);
        Iterator r28 = r27.c.iterator();     // Catch: Throwable -> L143
    L139:
        if (r28.hasNext() == false) goto L145;
        Object r29 = r28.next();     // Catch: Throwable -> L143
        if (h12.c(((vz) r29).a, r25) == false) goto L139;
    L146:
        vz r30 = (vz) r29;     // Catch: Throwable -> L143
        monitor-exit(r27);
        if (r30 != null) goto L240;
        yz r31 = new yz(xz.n, r6, r2);
    L165:
        vz r32 = r31.b;
        int r33 = r31.a.ordinal();
        if (r33 == 0) goto L308;
        if (r33 == 1) goto L178;
        if (r33 != 2) goto L170;
        if (r32 == null) goto L177;
        io1.b.post(new k6(14, r25, r32));
        goto L132
    L177:
        kf2.o("Required value was null.");
        return;
    L170:
        if (r33 != 3) goto L174;
        if (r32 == null) goto L173;
        io1.b.post(new v6(r25, r32, r31, 5));
        goto L132
    L173:
        kf2.o("Required value was null.");
        return;
    L174:
        er1.n();
        return;
    L178:
        r124.d(30000);
        return;
    L308:
        return;
    L240:
        r26.b.invoke(r30);     // Catch: HubException -> L152 Exception -> L154
        r26.a.b(r30);     // Catch: HubException -> L152 Exception -> L154
        r31 = new yz(xz.p, r30, r5);     // Catch: HubException -> L152 Exception -> L154
        goto L165
    L152:
        e = move-exception;
        int r34 = e.n;
        if (400 <= r34) goto L158;
    L164:
        r31 = new yz(xz.o, r6, r2);
        goto L165
    L158:
        if (r34 >= 500) goto L164;
        if (gb.P(new Integer[]{401, 403, 408, 429}).contains(Integer.valueOf(e.n)) == true) goto L164;
        r26.a.b(r30);     // Catch: IOException -> L163
        r31 = new yz(xz.q, r30, e);     // Catch: IOException -> L163
    L163:
        r31 = new yz(xz.o, r6, r2);
    L154:
        r31 = new yz(xz.o, r6, r2);
        goto L165
    L145:
        r29 = null;
    L143:
        th = move-exception;
        throw th;
    L307:
        return;
    L182:
        th = move-exception;
        throw th;
    L185:
        q03 r125 = ra.X0;
        monitor-enter(r125);
        int r35 = Build.VERSION.SDK_INT;     // Catch: Throwable -> L194
        Object[] r36 = r125.a;
        int r37 = r125.b;
        if (r35 >= 30) goto L197;
    L190:
        if (r7 >= r37) goto L200;
        ra r38 = (ra) r36[r7];     // Catch: Throwable -> L194
        boolean r39 = r38.getShowLayoutBounds();     // Catch: Throwable -> L194
        Class r40 = ra.U0;     // Catch: Throwable -> L194
        r38.setShowLayoutBounds(te5.v());     // Catch: Throwable -> L194
        if (r39 == r38.getShowLayoutBounds()) goto L196;
        r38.post(new ia(r38, r1));     // Catch: Throwable -> L194
    L196:
        r7 = r7 + 1;     // Catch: Throwable -> L194
    L200:
        monitor-exit(r125);
        return;
    L197:
        if (r7 >= r37) goto L200;
        ra r41 = (ra) r36[r7];     // Catch: Throwable -> L194
        r41.post(new ia(r41, r0));     // Catch: Throwable -> L194
        r7 = r7 + 1;
    L194:
        th = move-exception;
        throw th;
    L204:
        AtomicBoolean r126 = x6.a;
        x6.a();     // Catch: Throwable -> L207 Exception -> L209
    L206:
        r126.set(false);
        return;
    L207:
        th = move-exception;
        r126.set(false);
        throw th;
    L209:
        e = move-exception;
        x6.b.set(false);     // Catch: Throwable -> L207
        Log.w("AlbumArtistBackfill", "Album artist backfill failed", e);     // Catch: Throwable -> L207
        goto L206
    L238:
        g51.h();     // Catch: Throwable -> L125
        g51.g();
        return;
    L125:
        th = move-exception;
        g51.g();
        throw th;
    }
}
