package okhttp3.internal.publicsuffix;

import defpackage.aa4;
import defpackage.b11;
import defpackage.b71;
import defpackage.fa4;
import defpackage.fx0;
import defpackage.gb;
import defpackage.ge3;
import defpackage.gx0;
import defpackage.h12;
import defpackage.kf2;
import defpackage.nz2;
import defpackage.q05;
import defpackage.q40;
import defpackage.qg3;
import defpackage.qm4;
import defpackage.tk1;
import defpackage.tv1;
import defpackage.u01;
import defpackage.w10;
import defpackage.w40;
import defpackage.xu3;
import defpackage.y04;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final ge3 g = null;
    public static final byte[] h = null;
    public static final List i = null;
    public static final b j = null;
    public final ge3 a;
    public final b71 b;
    public final AtomicBoolean c;
    public final CountDownLatch d;
    public byte[] e;
    public byte[] f;

    static {
        String r0 = ge3.o;
        g = tv1.z("/okhttp3/internal/publicsuffix/" + b.class.getSimpleName() + ".gz");
        h = new byte[]{42};
        i = gb.O("*");
        j = new b();
    }

    public b() {
        y04 r0 = b71.b;
        ge3 r1 = g;
        r1.getClass();
        r0.getClass();
        this.a = r1;
        this.b = r0;
        this.c = new AtomicBoolean(false);
        this.d = new CountDownLatch(1);
    }

    public static List c(String r4) {
        int r2 = 0;
        List r5 = qm4.D0(r4, new char[]{'.'});
        if (h12.c(q40.C0(r5), "") == false) goto L10;
        int r1 = r5.size() - 1;
        if (r1 < 0) goto L9;
        r2 = r1;
    L9:
        return q40.L0(r5, r2);
    L10:
        return r5;
    }

    public final String a(String r14) {
        String r0 = IDN.toUnicode(r14);
        r0.getClass();
        List r1 = c(r0);
        List r2 = u01.n;
        if (this.c.get() == false) goto L5;
    L104:
        this.d.await();     // Catch: InterruptedException -> L23
    L25:
        if (this.e == null) goto L102;
        int r3 = r1.size();
        byte[][] r6 = new byte[r3][];
        int r7 = 0;
    L27:
        if (r7 >= r3) goto L29;
        byte[] r8 = ((String) r1.get(r7)).getBytes(w10.a);
        r8.getClass();
        r6[r7] = r8;
        r7 = r7 + 1;
        goto L27
    L29:
        int r9 = 0;
    L31:
        if (r9 >= r3) goto L40;
        byte[] r10 = this.e;
        if (r10 == null) goto L38;
        String r11 = a.a(r10, r6, r9);
        if (r11 != null) goto L41;
        r9 = r9 + 1;
    L41:
        if (r3 <= 1) goto L52;
        byte[][] r12 = (byte[][]) r6.clone();
        int r13 = r12.length - 1;
        int r15 = 0;
    L43:
        if (r15 >= r13) goto L52;
        r12[r15] = h;
        byte[] r16 = this.e;
        if (r16 == null) goto L50;
        String r17 = a.a(r16, r12, r15);
        if (r17 != null) goto L53;
        r15 = r15 + 1;
    L53:
        if (r17 == null) goto L64;
        int r4 = r3 - 1;
        int r18 = 0;
    L55:
        if (r18 >= r4) goto L64;
        byte[] r19 = this.f;
        if (r19 == null) goto L62;
        String r20 = a.a(r19, r6, r18);
        if (r20 != null) goto L66;
        r18 = r18 + 1;
    L66:
        if (r20 == null) goto L68;
        List r110 = qm4.D0("!".concat(r20), new char[]{'.'});
    L81:
        if (r1.size() != r110.size()) goto L86;
        if (((String) r110.get(0)).charAt(0) == '!') goto L86;
        return null;
    L86:
        if (((String) r110.get(0)).charAt(0) != '!') goto L89;
        int r5 = r1.size();
        int r111 = r110.size();
    L88:
        int r21 = r5 - r111;
        aa4 r112 = new w40(0, c(r14));
        if (r21 < 0) goto L100;
        if (r21 == 0) goto L99;
        if ((r112 instanceof gx0) == false) goto L97;
        r112 = ((gx0) r112).b(r21);
        goto L99
    L97:
        r112 = new fx0(r112, r21, 0);
    L99:
        return fa4.d0(r112, ".", null, 62);
    L100:
        kf2.e(b11.j(r21, "Requested element count ", " is less than zero."));
        return null;
    L89:
        r5 = r1.size();
        r111 = r110.size() + 1;
        goto L88
    L68:
        if (r11 != null) goto L71;
        if (r17 != null) goto L71;
        r110 = i;
    L71:
        if (r11 == null) goto L73;
        List r22 = qm4.D0(r11, new char[]{'.'});
    L74:
        if (r17 == null) goto L77;
        r2 = qm4.D0(r17, new char[]{'.'});
    L77:
        if (r22.size() <= r2.size()) goto L79;
        r110 = r22;
        goto L81
    L79:
        r110 = r2;
        goto L81
    L73:
        r22 = r2;
        goto L74
    L62:
        h12.Q("publicSuffixExceptionListBytes");
        throw null;
    L64:
        r20 = null;
        goto L66
    L50:
        h12.Q("publicSuffixListBytes");
        throw null;
    L52:
        r17 = null;
        goto L53
    L38:
        h12.Q("publicSuffixListBytes");
        throw null;
    L40:
        r11 = null;
        goto L41
    L102:
        nz2.z(g, " resource from the classpath.", "Unable to load ");
        return null;
    L23:
        Thread.currentThread().interrupt();
        goto L25
    L5:
        if (this.c.compareAndSet(false, true) == false) goto L104;
        boolean r23 = false;
    L106:
        b();     // Catch: Throwable -> L10 IOException -> L12 InterruptedIOException -> L16
    L8:
        if (r23 == false) goto L25;
    L9:
        Thread.currentThread().interrupt();
    L10:
        th = move-exception;
        if (r23 == false) goto L20;
        Thread.currentThread().interrupt();
    L20:
        throw th;
    L16:
        Thread.interrupted();     // Catch: Throwable -> L10
        r23 = true;
    L12:
        e = move-exception;
        qg3 r24 = qg3.a;     // Catch: Throwable -> L10
        qg3.a.getClass();     // Catch: Throwable -> L10
        qg3.i("Failed to read public suffix list", 5, e);     // Catch: Throwable -> L10
        if (r23 == false) goto L25;
        goto L25
    }

    public final void b() {
        xu3 r1 = new xu3(new tk1(this.b.k(this.a)));     // Catch: Throwable -> L10
        long r2 = r1.readInt();     // Catch: Throwable -> L15
        r1.P(r2);     // Catch: Throwable -> L15
        byte[] r0 = r1.o.F(r2);     // Catch: Throwable -> L15
        long r3 = r1.readInt();     // Catch: Throwable -> L15
        r1.P(r3);     // Catch: Throwable -> L15
        byte[] r4 = r1.o.F(r3);     // Catch: Throwable -> L15
        r1.close();     // Catch: Throwable -> L10
        monitor-enter(this);     // Catch: Throwable -> L10
        this.e = r0;     // Catch: Throwable -> L12
        this.f = r4;     // Catch: Throwable -> L12
        monitor-exit(this);     // Catch: Throwable -> L10
        this.d.countDown();
        return;
    L12:
        th = move-exception;
        throw th;     // Catch: Throwable -> L10
    L15:
        th = move-exception;
        throw th;     // Catch: Throwable -> L17
    L17:
        th = move-exception;
        q05.h(r1, th);     // Catch: Throwable -> L10
        throw th;     // Catch: Throwable -> L10
    L10:
        th = move-exception;
        this.d.countDown();
        throw th;
    }
}
