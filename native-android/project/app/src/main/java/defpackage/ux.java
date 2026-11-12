package defpackage;

import java.io.InterruptedIOException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ux {
    public final lx a;
    public final se4 b;
    public final ii0 c;
    public final String d;
    public final byte[] e;
    public final tx f;
    public long g;
    public long h;
    public long i;
    public volatile boolean j;

    public ux(lx r2, ii0 r3, byte[] r4, tx r5) {
        this.a = r2;
        this.b = r2.n;
        this.c = r3;
        if (r4 != null) goto L5;
        r4 = new byte[131072];
    L5:
        this.e = r4;
        this.f = r5;
        this.d = r2.r.d(r3);
        this.g = r3.f;
    }

    public final void a() {
        if (this.j == true) goto L115;
        se4 r2 = this.b;
        String r7 = this.d;
        ii0 r1 = this.c;
        this.i = r2.g(r1.f, r1.g, r7);
        long r3 = r1.g;
        long r4 = -1;
        if (r3 == (-1)) goto L7;
        this.h = r1.f + r3;
    L11:
        tx r6 = this.f;
        if (r6 == null) goto L18;
        long r5 = this.h;
        if (r5 != (-1)) goto L16;
        long r8 = -1;
    L17:
        r6.b(r8, this.i, 0);
        goto L18
    L16:
        r8 = r5 - this.c.f;
    L18:
        long r9 = this.h;
        if (r9 == r4) goto L25;
        if (this.g < r9) goto L25;
        return;
    L25:
        if (this.j == true) goto L113;
        long r10 = this.h;
        if (r10 != r4) goto L29;
        long r12 = Long.MAX_VALUE;
    L30:
        long r11 = this.b.h(this.g, r12, this.d);
        if (r11 <= 0) goto L33;
        this.g += r11;
        long r19 = r4;
    L111:
        r4 = r19;
        goto L18
    L33:
        long r13 = -r11;
        if (r13 != Long.MAX_VALUE) goto L36;
        r13 = r4;
    L36:
        long r14 = this.g;
        lx r15 = this.a;
        boolean r16 = true;
        int r17 = 0;
        if ((r14 + r13) != this.h) goto L39;
    L42:
        boolean r18 = true;
    L44:
        if (r13 == r4) goto L49;
        hi0 r110 = r1.a();
        r110.f = r14;
        r110.g = r13;
        long r20 = r15.b(r110.a());     // Catch: Exception -> L48
    L50:
        if (r16 == false) goto L52;
    L61:
        if (r18 == true) goto L63;
    L75:
        int r21 = 0;
        int r22 = 0;
    L77:
        if (r21 == (-1)) goto L95;
        if (this.j == true) goto L94;
        byte[] r23 = this.e;     // Catch: Exception -> L91
        r21 = r15.read(r23, r17, r23.length);     // Catch: Exception -> L91
        if (r21 == (-1)) goto L77;
        long r111 = r21;
        long r112 = this.i + r111;     // Catch: Exception -> L91
        this.i = r112;     // Catch: Exception -> L91
        tx r113 = this.f;     // Catch: Exception -> L91
        if (r113 == null) goto L89;
        long r114 = r4;
        long r24 = this.h;     // Catch: Exception -> L91
        if (r24 != r114) goto L87;
        long r115 = r114;
    L88:
        r113.b(r115, r112, r111);     // Catch: Exception -> L91
    L90:
        r22 = r22 + r21;     // Catch: Exception -> L91
        r4 = r114;
        r17 = 0;
        goto L77
    L87:
        r113 = r113;
        r115 = r24 - this.c.f;     // Catch: Exception -> L91
        goto L88
    L89:
        r114 = r4;
        goto L90
    L94:
        throw new InterruptedIOException();     // Catch: Exception -> L91
    L91:
        e = move-exception;
        fu.k(r15);
        throw e;
    L95:
        r19 = r4;
        if (r18 == false) goto L110;
        long r25 = ((long) r22) + r14;     // Catch: Exception -> L91
        if (this.h == r25) goto L110;
        this.h = r25;     // Catch: Exception -> L91
        tx r26 = this.f;     // Catch: Exception -> L91
        if (r26 == null) goto L110;
        if (r25 != r19) goto L105;
        long r116 = r19;
    L106:
        r26.b(r116, this.i, 0);     // Catch: Exception -> L91
        goto L110
    L105:
        r116 = r25 - this.c.f;     // Catch: Exception -> L91
    L110:
        r15.close();
        this.g = r14 + ((long) r22);
        goto L111
    L63:
        if (r20 == r4) goto L75;
        long r27 = r20 + r14;
        if (this.h == r27) goto L75;
        this.h = r27;     // Catch: Exception -> L91
        tx r117 = this.f;     // Catch: Exception -> L91
        if (r117 == null) goto L75;
        if (r27 != r4) goto L73;
        long r118 = r4;
    L74:
        r117.b(r118, this.i, 0);     // Catch: Exception -> L91
        goto L75
    L73:
        r118 = r27 - this.c.f;     // Catch: Exception -> L91
        goto L74
    L52:
        if (this.j == true) goto L60;
        hi0 r28 = r1.a();
        r28.f = r14;
        r28.g = r4;
        r20 = r15.b(r28.a());     // Catch: Exception -> L56
    L56:
        e = move-exception;
        fu.k(r15);
        throw e;
    L60:
        throw new InterruptedIOException();
    L48:
        fu.k(r15);
    L49:
        r20 = r4;
        r16 = false;
        goto L50
    L39:
        if (r13 == r4) goto L42;
        r18 = false;
        goto L44
    L29:
        r12 = r10 - this.g;
        goto L30
    L113:
        throw new InterruptedIOException();
    L7:
        long r29 = nd0.a(this.b.i(this.d));
        if (r29 != (-1)) goto L10;
        r29 = -1;
    L10:
        this.h = r29;
        goto L11
    L115:
        throw new InterruptedIOException();
    }
}
