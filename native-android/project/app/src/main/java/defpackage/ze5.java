package defpackage;

import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ze5 {
    public static final tl1 a = null;
    public static final TimeZone b = null;
    public static final String c = null;

    static {
        a = xe5.c;
        TimeZone r0 = TimeZone.getTimeZone("GMT");
        r0.getClass();
        b = r0;
        String r1 = qm4.z0(o83.class.getName(), "okhttp3.");
        if (qm4.p0(r1, "Client") == false) goto L5;
        r1 = r1.substring(0, r1.length() - 6);
    L5:
        c = r1;
    }

    public static final boolean a(gr1 r2, gr1 r3) {
        r2.getClass();
        r3.getClass();
        if (h12.c(r2.d, r3.d) == true) goto L5;
        return false;
    L5:
        if (r2.e == r3.e) goto L7;
        return false;
    L7:
        if (h12.c(r2.a, r3.a) == false) goto L13;
        return true;
    L13:
        return false;
    }

    public static final int b(long r7, TimeUnit r9) {
        r9.getClass();
        if (r7 < 0) goto L16;
        long r8 = r9.toMillis(r7);
        if (r8 <= 2147483647L) goto L7;
        kf2.e("timeout".concat(" too large"));
        return 0;
    L7:
        if (r8 != 0) goto L13;
        if (r7 <= 0) goto L13;
        kf2.e("timeout".concat(" too small"));
        return 0;
    L13:
        return (int) r8;
    L16:
        nz2.f("timeout".concat(" < 0"));
        return 0;
    }

    public static final void c(Socket r2) {
        r2.getClass();
        r2.close();     // Catch: Exception -> L12 RuntimeException -> L5 AssertionError -> L10
        return;
    L10:
        e = move-exception;
        throw e;
    L5:
        e = move-exception;
        if (h12.c(e.getMessage(), "bio == null") == false) goto L9;
        return;
    L9:
        throw e;
    }

    public static final String d(String r2, Object... r3) {
        Locale r0 = Locale.US;
        Object[] r4 = Arrays.copyOf(r3, r3.length);
        return String.format(r0, r2, Arrays.copyOf(r4, r4.length));
    }

    public static final long e(k14 r3) {
        String r4 = r3.s.a("Content-Length");
        if (r4 == null) goto L10;
        byte[] r2 = xe5.a;
        return Long.parseLong(r4);
    L11:
        return -1;
    L10:
        return -1;
    }

    public static final List f(Object... r1) {
        Object[] r2 = (Object[]) r1.clone();
        List r3 = Collections.unmodifiableList(gb.P(Arrays.copyOf(r2, r2.length)));
        r3.getClass();
        return r3;
    }

    public static final Charset g(fw r1, Charset r2) {
        r1.getClass();
        r2.getClass();
        int r3 = r1.m(xe5.b);
        if (r3 == (-1)) goto L29;
        if (r3 == 0) goto L28;
        if (r3 == 1) goto L26;
        if (r3 == 2) goto L24;
        if (r3 != 3) goto L12;
        Charset r4 = w10.a;
        Charset r5 = w10.e;
        if (r5 != null) goto L31;
        Charset r6 = Charset.forName("UTF-32BE");
        r6.getClass();
        w10.e = r6;
        return r6;
    L31:
        return r5;
    L12:
        if (r3 != 4) goto L18;
        Charset r7 = w10.a;
        Charset r8 = w10.d;
        if (r8 != null) goto L30;
        Charset r9 = Charset.forName("UTF-32LE");
        r9.getClass();
        w10.d = r9;
        return r9;
    L30:
        return r8;
    L18:
        throw new AssertionError();
    L24:
        return w10.c;
    L26:
        return w10.b;
    L28:
        return w10.a;
    L29:
        return r2;
    }

    public static final boolean h(ej4 r12, int r13) {
        TimeUnit r0 = TimeUnit.MILLISECONDS;
        r0.getClass();
        long r1 = System.nanoTime();
        if (r12.timeout().e() == false) goto L5;
        long r6 = r12.timeout().c() - r1;
    L6:
        r12.timeout().d(Math.min(r6, r0.toNanos(r13)) + r1);
        tv r14 = new tv();     // Catch: Throwable -> L12 InterruptedIOException -> L25
    L9:
        if (r12.read(r14, 8192) == (-1)) goto L15;
        r14.b();     // Catch: Throwable -> L12 InterruptedIOException -> L25
        goto L26
    L15:
        if (r6 != Long.MAX_VALUE) goto L18;
        r12.timeout().a();
        return true;
    L18:
        r12.timeout().d(r1 + r6);
        return true;
    L12:
        th = move-exception;
        if (r6 != Long.MAX_VALUE) goto L23;
        r12.timeout().a();
    L24:
        throw th;
    L23:
        r12.timeout().d(r1 + r6);
    L26:
        if (r6 != Long.MAX_VALUE) goto L28;
        r12.timeout().a();
        return false;
    L28:
        r12.timeout().d(r1 + r6);
        return false;
    L5:
        r6 = Long.MAX_VALUE;
        goto L6
    }

    public static final tl1 i(List r3) {
        ArrayList r0 = new ArrayList(20);
        Iterator r4 = r3.iterator();
    L4:
        if (r4.hasNext() == false) goto L7;
        pl1 r1 = (pl1) r4.next();
        yw r2 = r1.a;
        yw r5 = r1.b;
        String r6 = r2.q();
        String r7 = r5.q();
        r0.add(r6);
        r0.add(qm4.K0(r7).toString());
        goto L4
    L7:
        return new tl1((String[]) r0.toArray(new String[0]));
    }

    public static final String j(gr1 r4, boolean r5) {
        r4.getClass();
        int r0 = r4.e;
        String r1 = r4.d;
        if (qm4.o0(r1, ":") == false) goto L5;
        r1 = "[" + r1 + ']';
    L5:
        if (r5 == true) goto L17;
        String r6 = r4.a;
        r6.getClass();
        if (r6.equals("http") == false) goto L10;
        int r7 = 80;
    L13:
        if (r0 != r7) goto L17;
        return r1;
    L10:
        if (r6.equals("https") == false) goto L12;
        r7 = 443;
        goto L13
    L12:
        r7 = -1;
    L17:
        return r1 + ':' + r0;
    }

    public static final List k(List r1) {
        r1.getClass();
        List r2 = Collections.unmodifiableList(new ArrayList(r1));
        r2.getClass();
        return r2;
    }
}
