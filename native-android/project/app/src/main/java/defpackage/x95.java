package defpackage;

import android.text.TextUtils;
import androidx.media3.common.ParserException;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class x95 implements k51 {
    public static final Pattern i = null;
    public static final Pattern j = null;
    public final String a;
    public final iu4 b;
    public final be3 c;
    public final xn4 d;
    public final boolean e;
    public m51 f;
    public byte[] g;
    public int h;

    static {
        i = Pattern.compile("LOCAL:([^,]+)");
        j = Pattern.compile("MPEGTS:(-?\\d+)");
    }

    public x95(String r1, iu4 r2, xn4 r3, boolean r4) {
        this.a = r1;
        this.b = r2;
        this.c = new be3();
        this.g = new byte[1024];
        this.d = r3;
        this.e = r4;
    }

    @Override // defpackage.k51
    public final void a() {
    }

    @Override // defpackage.k51
    public final int b(l51 r18, t71 r19) {
        this.f.getClass();
        int r1 = (int) r18.getLength();
        int r2 = this.h;
        byte[] r3 = this.g;
        if (r2 != r3.length) goto L8;
        if (r1 == (-1)) goto L6;
        int r4 = r1;
    L7:
        this.g = Arrays.copyOf(r3, (r4 * 3) / 2);
        goto L8
    L6:
        r4 = r3.length;
    L8:
        byte[] r5 = this.g;
        int r6 = this.h;
        int r7 = r18.read(r5, r6, r5.length - r6);
        if (r7 == (-1)) goto L15;
        int r8 = this.h + r7;
        this.h = r8;
        if (r1 == (-1)) goto L13;
        if (r8 == r1) goto L15;
        return 0;
    L13:
        return 0;
    L15:
        be3 r9 = new be3(this.g);
        y95.d(r9);
        String r10 = r9.n(StandardCharsets.UTF_8);
        long r11 = 0;
        long r12 = 0;
    L16:
        Matcher r13 = null;
        if (TextUtils.isEmpty(r10) == true) goto L30;
        if (r10.startsWith("X-TIMESTAMP-MAP") == false) goto L29;
        Matcher r14 = i.matcher(r10);
        if (r14.find() == false) goto L28;
        Matcher r15 = j.matcher(r10);
        if (r15.find() == false) goto L26;
        String r16 = r14.group(1);
        r16.getClass();
        r12 = y95.c(r16);
        String r17 = r15.group(1);
        r17.getClass();
        long r110 = Long.parseLong(r17);
        String r20 = f35.a;
        r11 = f35.a0(r110, 1000000, 90000, RoundingMode.DOWN);
        goto L29
    L26:
        throw ParserException.a(null, "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(r10));
    L28:
        throw ParserException.a(null, "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(r10));
    L29:
        r10 = r9.n(StandardCharsets.UTF_8);
    L30:
        String r21 = r9.n(StandardCharsets.UTF_8);
        if (r21 == null) goto L42;
        if (y95.a.matcher(r21).matches() == true) goto L34;
        Matcher r22 = w95.a.matcher(r21);
        if (r22.matches() == false) goto L30;
        r13 = r22;
    L34:
        String r23 = r9.n(StandardCharsets.UTF_8);
        if (r23 == null) goto L30;
        if (r23.isEmpty() == true) goto L30;
    L42:
        if (r13 != null) goto L45;
        g(0);
        return -1;
    L45:
        String r24 = r13.group(1);
        r24.getClass();
        long r25 = y95.c(r24);
        String r26 = f35.a;
        long r27 = this.b.b(f35.a0((r11 + r25) - r12, 90000, 1000000, RoundingMode.DOWN) % 8589934592L);
        wv4 r28 = g(r27 - r25);
        byte[] r29 = this.g;
        int r30 = this.h;
        be3 r31 = this.c;
        r31.L(r30, r29);
        r28.e(this.h, r31);
        r28.a(r27, 1, this.h, 0, null);
        return -1;
    }

    @Override // defpackage.k51
    public final boolean c(l51 r6) {
        rk0 r7 = (rk0) r6;
        r7.e(this.g, 0, 6, false);
        byte[] r0 = this.g;
        be3 r3 = this.c;
        r3.L(6, r0);
        if (y95.a(r3) == false) goto L6;
        return true;
    L6:
        r7.e(this.g, 6, 3, false);
        r3.L(9, this.g);
        return y95.a(r3);
    }

    @Override // defpackage.k51
    public final void d(long r1, long r3) {
        throw new IllegalStateException();
    }

    @Override // defpackage.k51
    public final void f(m51 r3) {
        if (this.e == false) goto L5;
        r3 = new ll(r3, this.d);
    L5:
        this.f = r3;
        r3.w(new bo(-9223372036854775807L));
    }

    public final wv4 g(long r4) {
        wv4 r0 = this.f.t(0, 3);
        sb1 r1 = new sb1();
        r1.m = lw2.m("text/vtt");
        r1.d = this.a;
        r1.r = r4;
        f34.l(r1, r0);
        this.f.p();
        return r0;
    }
}
