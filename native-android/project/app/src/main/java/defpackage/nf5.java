package defpackage;

import android.os.SystemClock;
import com.eddyizm.tempus.homemusic.SmartSession;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.a;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nf5 implements b93 {
    public final ij1 n;
    public final int o;
    public final ve p;
    public final long q;
    public final long r;

    public nf5(ij1 r1, int r2, ve r3, long r4, long r6) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
        this.q = r4;
        this.r = r6;
    }

    public static pa0 b(gf5 r4, a r5, int r6) {
        jk5 r7 = r5.H;
        if (r7 != null) goto L5;
        pa0 r8 = null;
    L6:
        if (r8 != null) goto L8;
    L28:
        return null;
    L8:
        if (r8.o == false) goto L28;
        int[] r1 = r8.q;
        int r2 = 0;
        if (r1 != null) goto L21;
        int[] r3 = r8.s;
        if (r3 == null) goto L25;
    L15:
        if (r2 >= r3.length) goto L25;
        if (r3[r2] == r6) goto L28;
        r2 = r2 + 1;
    L25:
        if (r4.p >= r8.r) goto L28;
        return r8;
    L21:
        if (r2 >= r1.length) goto L28;
        if (r1[r2] == r6) goto L25;
        r2 = r2 + 1;
        goto L21
    L5:
        r8 = r7.q;
        goto L6
    }

    @Override // defpackage.b93
    public final void a(jw r27) {
        long r2 = this.q;
        ij1 r4 = this.n;
        if (r4.b() == false) goto L63;
        e34 r5 = (e34) d34.E().o;
        if (r5 != null) goto L8;
    L9:
        gf5 r6 = (gf5) r4.w.get(this.p);
        if (r6 == null) goto L60;
        me r7 = r6.f;
        if ((r7 instanceof a) == false) goto L61;
        a r8 = (a) r7;
        boolean r11 = true;
        int r12 = 0;
        if (r2 <= 0) goto L16;
        boolean r13 = true;
    L17:
        int r14 = r8.C;
        if (r5 == null) goto L32;
        r13 = r13 & r5.p;
        int r15 = r5.q;
        int r9 = r5.r;
        int r10 = r5.n;
        if (r8.H != null) goto L22;
    L31:
        int r16 = r15;
        int r17 = -1;
        if (r27.p() == false) goto L37;
        int r18 = 0;
    L48:
        if (r13 == false) goto L51;
        long r19 = this.r;
        long r110 = System.currentTimeMillis();
        r17 = (int) (SystemClock.elapsedRealtime() - r19);
        long r111 = r2;
        long r20 = r110;
    L52:
        of5 r112 = new of5(new iw2(this.o, r12, r18, r111, r20, null, null, r14, r17), r10, r16, r9);
        zw2 r1 = r4.A;
        r1.sendMessage(r1.obtainMessage(18, r112));
        return;
    L51:
        r111 = 0;
        r20 = 0;
        goto L52
    L37:
        Object r21 = r27.o;
        monitor-enter(r21);
        Exception r3 = (Exception) r27.r;     // Catch: Throwable -> L54
        monitor-exit(r21);     // Catch: Throwable -> L54
        if ((r3 instanceof ApiException) == false) goto L47;
        Status r22 = ((ApiException) r3).n;
        r12 = r22.n;
        ka0 r23 = r22.q;
        if (r23 != null) goto L46;
    L45:
        r18 = -1;
        goto L48
    L46:
        r18 = r23.o;
        goto L48
    L47:
        r12 = 101;
    L54:
        th = move-exception;
        throw th;
    L22:
        if (r8.c0() == true) goto L31;
        pa0 r24 = b(r6, r8, this.o);
        if (r24 != null) goto L26;
        return;
    L26:
        if (r24.p == false) goto L29;
        if (r2 <= 0) goto L29;
    L30:
        r9 = r24.r;
        r13 = r11;
    L29:
        r11 = false;
        goto L30
    L32:
        r15 = SmartSession.MAX_SONGS;
        r9 = 100;
        r10 = 0;
        goto L31
    L16:
        r13 = false;
        goto L17
    L61:
        return;
    L60:
        return;
    L8:
        if (r5.o == true) goto L9;
        return;
    }
}
