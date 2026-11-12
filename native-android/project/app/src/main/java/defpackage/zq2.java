package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.eddyizm.tempus.homemusic.PlayEvent;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zq2 implements yj2 {
    public long n;
    public long o;
    public boolean p;
    public final Object q;
    public Object r;

    public zq2(qa1 r3) {
        this.q = new Handler(Looper.getMainLooper());
        this.r = r3;
    }

    public void a(long r9) {
        if (this.p == false) goto L10;
        oh3 r0 = (oh3) this.r;
        if (r0 == null) goto L10;
        long r1 = r0.g;
        long r3 = r9 - this.o;
        if (r3 >= 0) goto L9;
        r3 = 0;
    L9:
        r0.g = r1 + r3;
    L10:
        this.o = r9;
    }

    public void b(long r4, long r6, boolean r8) {
        a(r6);
        if (r4 >= 0) goto L5;
        r4 = 0;
    L5:
        this.n = r4;
        this.o = r6;
        this.p = r8;
    }

    public void c(String r18, Long r19, long r20, boolean r22, String r23) {
        oh3 r3 = (oh3) this.r;
        if (r3 != null) goto L5;
        return;
    L5:
        if (r19 != null) goto L7;
    L9:
        long r4 = e(r20);
    L10:
        a(r20);
        long r6 = r3.b;
        if (r22 == false) goto L13;
    L18:
        boolean r11 = true;
    L19:
        if (r22 == true) goto L21;
    L23:
        this.r = null;
        this.p = false;
        lc r0 = (lc) this.q;
        if (r23 != null) goto L28;
        if (r11 == false) goto L27;
        String r7 = PlayEvent.FINISH;
    L29:
        r0.d(r7, r3, Long.valueOf(r4), Long.valueOf(r20));
        return;
    L27:
        r7 = PlayEvent.SKIP;
        goto L29
    L28:
        r7 = r23;
        goto L29
    L21:
        if (r6 <= 0) goto L23;
        r4 = r6;
        goto L23
    L13:
        if (r6 > 0) goto L15;
    L17:
        r11 = false;
        goto L19
    L15:
        if (r4 < (r6 * 0.9d)) goto L17;
    L7:
        if (h12.c(r18, r3.a) == false) goto L9;
        r4 = r19.longValue();
        goto L10
    }

    @Override // defpackage.yj2
    public void d(qh3 r3) {
        if (this.p == false) goto L5;
        f(j());
    L5:
        this.r = r3;
    }

    public long e(long r6) {
        if (this.p == false) goto L6;
        long r7 = r6 - this.o;
        if (r7 < 0) goto L6;
    L7:
        long r3 = this.n + r7;
        oh3 r5 = (oh3) this.r;
        if (r5 == null) goto L10;
        long r8 = r5.b;
    L12:
        if (r8 > 0) goto L14;
    L16:
        return r3;
    L14:
        if (r3 <= r8) goto L16;
        return r8;
    L10:
        r8 = 0;
    L6:
        r7 = 0;
        goto L7
    }

    public void f(long r1) {
        this.n = r1;
        if (this.p == false) goto L6;
        ((vp4) this.q).getClass();
        this.o = SystemClock.elapsedRealtime();
        return;
    }

    public void g() {
        if (this.p == true) goto L6;
        ((vp4) this.q).getClass();
        this.o = SystemClock.elapsedRealtime();
        this.p = true;
        return;
    }

    @Override // defpackage.yj2
    public qh3 i() {
        return (qh3) this.r;
    }

    @Override // defpackage.yj2
    public long j() {
        long r0 = this.n;
        if (this.p == false) goto L10;
        ((vp4) this.q).getClass();
        long r2 = SystemClock.elapsedRealtime() - this.o;
        qh3 r6 = (qh3) this.r;
        if (r6.a != 1.0f) goto L9;
        long r3 = f35.Q(r2);
    L8:
        return r3 + r0;
    L9:
        r3 = r2 * ((long) r6.c);
        goto L8
    L10:
        return r0;
    }

    public zq2(vp4 r1) {
        this.q = r1;
        this.r = qh3.d;
    }

    public zq2(lc r1) {
        this.q = r1;
    }
}
