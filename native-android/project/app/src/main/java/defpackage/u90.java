package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.http2.ConnectionShutdownException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class u90 implements r02 {
    public static final u90 b = null;
    public final /* synthetic */ int a;

    static {
        b = new u90(0);
    }

    public /* synthetic */ u90(int r1) {
        this.a = r1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v3, types: [j14, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v4, types: [j14] */
    @Override // defpackage.r02
    public final k14 a(ev3 r18) {
        boolean r2 = true;
        String r4 = null;
        switch(this.a) {
            case 0: goto L100;
            default: goto L4;
        };
    L4:
        y10 r8 = r18.d;
        r8.getClass();
        bv3 r0 = (bv3) r8.d;
        r21 r9 = (r21) r8.f;
        oz3 r1 = r18.e;
        tz3 r10 = r1.d;
        long r11 = System.currentTimeMillis();
        r9.b(r1);     // Catch: IOException -> L47
        ?? r13 = gb.T(r1.b);     // Catch: IOException -> L13
        if (r13 == 0) goto L37;
        if (r10 == null) goto L37;
        if ("100-continue".equalsIgnoreCase(r1.c.a("Expect")) == true) goto L143;
        r13 = 0;
    L19:
        if (r13 == 0) goto L21;
        r0.f(r8, true, false, null);     // Catch: IOException -> L24
        if (r8.e().l != null) goto L34;
        r2 = false;
    L34:
        if (r2 == true) goto L39;
        r9.h().a();     // Catch: IOException -> L24
    L39:
        if (r10 != null) goto L41;
    L145:
        r9.c();     // Catch: IOException -> L44
    L43:
        IOException r3 = null;
        ?? r14 = r13;
    L55:
        if (r14 == 0) goto L135;
    L59:
        r14.a = r1;     // Catch: IOException -> L57
        r14.e = r8.e().g;     // Catch: IOException -> L57
        r14.k = r11;     // Catch: IOException -> L57
        r14.l = System.currentTimeMillis();     // Catch: IOException -> L57
        k14 r5 = r14.a();     // Catch: IOException -> L57
        int r12 = r5.q;     // Catch: IOException -> L57
        if (r12 != 100) goto L63;
    L66:
        j14 r6 = r8.j(false);     // Catch: IOException -> L57
        r6.getClass();     // Catch: IOException -> L57
        r6.a = r1;     // Catch: IOException -> L57
        r6.e = r8.e().g;     // Catch: IOException -> L57
        r6.k = r11;     // Catch: IOException -> L57
        r6.l = System.currentTimeMillis();     // Catch: IOException -> L57
        r5 = r6.a();     // Catch: IOException -> L57
        r12 = r5.q;     // Catch: IOException -> L57
    L67:
        j14 r7 = r5.f();     // Catch: IOException -> L57
        String r15 = r5.s.a("Content-Type");     // Catch: IOException -> L91
        if (r15 != null) goto L71;
        String r16 = null;
    L72:
        long r17 = r9.d(r5);     // Catch: IOException -> L91
        r7.g = new fv3(r16, r17, new xu3(new p21(r8, r9.a(r5), r17)), 0);     // Catch: IOException -> L57
        k14 r19 = r7.a();     // Catch: IOException -> L57
        oz3 r20 = r19.n;     // Catch: IOException -> L57
        r20.getClass();     // Catch: IOException -> L57
        if ("close".equalsIgnoreCase(r20.c.a("Connection")) == true) goto L81;
        String r21 = r19.s.a("Connection");     // Catch: IOException -> L57
        if (r21 == null) goto L80;
        r4 = r21;
    L80:
        if ("close".equalsIgnoreCase(r4) == true) goto L81;
    L83:
        if (r12 == 204) goto L87;
        if (r12 == 205) goto L87;
    L88:
        return r19;
    L87:
        if (r19.t.contentLength() <= 0) goto L88;
        throw new ProtocolException("HTTP " + r12 + " had non-zero Content-Length: " + r19.t.contentLength());     // Catch: IOException -> L57
    L81:
        r9.h().a();     // Catch: IOException -> L57
        goto L83
    L71:
        r16 = r15;
    L91:
        e = move-exception;
        r8.l(e);     // Catch: IOException -> L57
        throw e;     // Catch: IOException -> L57
    L57:
        e = move-exception;
        if (r3 == null) goto L97;
        j51.d(r3, e);
        throw r3;
    L97:
        throw e;
    L63:
        if (102 > r12) goto L67;
        if (r12 >= 200) goto L67;
    L135:
        r14 = r8.j(false);     // Catch: IOException -> L57
        r14.getClass();     // Catch: IOException -> L57
        goto L59
    L44:
        e = move-exception;
        r8.l(e);     // Catch: IOException -> L24
        throw e;     // Catch: IOException -> L24
    L41:
        if (r10.isDuplex() == true) goto L43;
    L21:
        if (r10.isDuplex() == true) goto L141;
        wu3 r22 = new wu3(r8.c(r1, false));     // Catch: IOException -> L24
        r10.writeTo(r22);     // Catch: IOException -> L24
        r22.close();     // Catch: IOException -> L24
        goto L39
    L141:
        r9.g();     // Catch: IOException -> L26
        r10.writeTo(new wu3(r8.c(r1, true)));     // Catch: IOException -> L24
        goto L39
    L26:
        e = move-exception;
        r8.l(e);     // Catch: IOException -> L24
        throw e;     // Catch: IOException -> L24
    L143:
        r9.g();     // Catch: IOException -> L15
        r13 = r8.j(true);     // Catch: IOException -> L13
        goto L19
    L15:
        e = move-exception;
        r8.l(e);     // Catch: IOException -> L13
        throw e;     // Catch: IOException -> L13
    L37:
        r0.f(r8, true, false, null);     // Catch: IOException -> L13
        r13 = 0;
    L24:
        e = e;
        ?? r110 = r13;
    L51:
        if ((e instanceof ConnectionShutdownException) == false) goto L53;
        throw e;
    L53:
        if (r8.c == false) goto L98;
        r3 = e;
        r14 = r110;
        goto L55
    L98:
        throw e;
    L47:
        e = move-exception;
        r8.l(e);     // Catch: IOException -> L13
        throw e;     // Catch: IOException -> L13
    L13:
        e = e;
        r110 = 0;
        goto L51
    L100:
        bv3 r23 = r18.a;
        monitor-enter(r23);
    L127:
        th = move-exception;
        throw th;
    L103:
        if (r23.z == false) goto L132;
        if (r23.y == true) goto L130;
        if (r23.x == true) goto L126;
        monitor-exit(r23);
        s21 r24 = r23.t;
        r24.getClass();
        cv3 r25 = r24.a();
        o83 r26 = r23.n;
        r25.getClass();
        r26.getClass();
        int r27 = r18.g;
        Socket r28 = r25.f;
        r28.getClass();
        fw r111 = r25.i;
        r111.getClass();
        ew r112 = r25.j;
        r112.getClass();
        rq1 r113 = r25.l;
        if (r113 == null) goto L112;
        r21 r29 = new sq1(r26, r25, r18, r113);
    L113:
        y10 r30 = new y10(r23, r24, r29);
        r23.w = r30;
        r23.B = r30;
        monitor-enter(r23);
        r23.x = true;     // Catch: Throwable -> L122
        r23.y = true;     // Catch: Throwable -> L122
        monitor-exit(r23);
        if (r23.A == false) goto L150;
        mj0.i("Canceled");
        return null;
    L150:
        return ev3.a(r18, 0, r30, null, 61).b(r18.e);
    L122:
        th = move-exception;
        throw th;
    L112:
        r28.setSoTimeout(r27);
        fu4 r31 = r111.timeout();
        long r114 = r27;
        TimeUnit r32 = TimeUnit.MILLISECONDS;
        r31.g(r114, r32);
        r112.timeout().g(r18.h, r32);
        r29 = new hq1(r26, r25, r111, r112);
        goto L113
    L126:
        throw new IllegalStateException("Check failed.");     // Catch: Throwable -> L127
    L130:
        throw new IllegalStateException("Check failed.");     // Catch: Throwable -> L127
    L132:
        throw new IllegalStateException("released");     // Catch: Throwable -> L127
    }
}
