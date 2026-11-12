package defpackage;

import android.util.Pair;
import androidx.media3.common.ParserException;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class d95 implements k51 {
    public m51 a;
    public wv4 b;
    public int c;
    public long d;
    public b95 e;
    public int f;
    public long g;

    static {
    }

    public d95() {
        this.c = 0;
        this.d = -1;
        this.f = -1;
        this.g = -1;
    }

    @Override // defpackage.k51
    public final void a() {
    }

    @Override // defpackage.k51
    public final int b(l51 r21, t71 r22) {
        this.b.getClass();
        String r2 = f35.a;
        int r3 = this.c;
        int r4 = 4;
        boolean r5 = true;
        if (r3 == 0) goto L96;
        long r9 = -1;
        if (r3 != 1) goto L7;
        be3 r6 = new be3(8);
        dd2 r7 = dd2.a(r21, r6);
        if (r7.a == 1685272116) goto L92;
        r21.k();
    L93:
        this.d = r9;
        this.c = 2;
        return 0;
    L92:
        r21.g(8);
        r6.N(0);
        r21.n(r6.a, 0, 8);
        r9 = r6.p();
        r21.l(((int) r7.b) + 8);
        goto L93
    L7:
        if (r3 == 2) goto L32;
        if (r3 == 3) goto L20;
        if (r3 == 4) goto L11;
        tb4.a();
        return 0;
    L11:
        if (this.g != (-1)) goto L14;
        r5 = false;
    L14:
        rr2.w(r5);
        long r8 = this.g - r21.getPosition();
        b95 r0 = this.e;
        r0.getClass();
        if (r0.b(r21, r8) == false) goto L17;
        return -1;
    L17:
        return 0;
    L20:
        r21.k();
        dd2 r10 = uo.T(1684108385, r21, new be3(8));
        r21.l(8);
        Pair r11 = Pair.create(Long.valueOf(r21.getPosition()), Long.valueOf(r10.b));
        this.f = ((Long) r11.first).intValue();
        long r12 = ((Long) r11.second).longValue();
        long r13 = this.d;
        if (r13 != (-1)) goto L23;
    L25:
        this.g = ((long) this.f) + r12;
        long r1 = r21.getLength();
        if (r1 != (-1)) goto L28;
    L30:
        b95 r14 = this.e;
        r14.getClass();
        r14.c(this.f, this.g);
        this.c = 4;
        return 0;
    L28:
        if (this.g <= r1) goto L30;
        l93.q0("WavExtractor", "Data exceeds input length: " + this.g + ", " + r1);
        this.g = r1;
        goto L30
    L23:
        if (r12 != 4294967295L) goto L25;
        r12 = r13;
        goto L25
    L32:
        be3 r15 = new be3(16);
        long r16 = uo.T(1718449184, r21, r15).b;
        if (r16 < 16) goto L35;
        boolean r17 = true;
    L36:
        rr2.w(r17);
        r21.n(r15.a, 0, 16);
        r15.N(0);
        int r18 = r15.t();
        int r19 = r15.t();
        int r110 = r15.s();
        r15.s();
        int r111 = r15.t();
        int r20 = r15.t();
        int r23 = ((int) r16) - 16;
        if (r23 <= 0) goto L65;
        byte[] r24 = new byte[r23];
        r21.n(r24, 0, r23);
        if (r18 == 65534) goto L41;
    L66:
        r21.l((int) (r21.f() - r21.getPosition()));
        uu r25 = new uu();
        r25.n = r19;
        r25.o = r110;
        r25.p = r111;
        r25.q = r20;
        r25.r = r24;
        if (r18 != 17) goto L70;
        this.e = new a95(this.a, this.b, r25);
    L85:
        this.c = 3;
        return 0;
    L70:
        if (r18 != 6) goto L73;
        this.e = new c95(this.a, this.b, r25, "audio/g711-alaw", -1);
        goto L85
    L73:
        if (r18 != 7) goto L75;
        this.e = new c95(this.a, this.b, r25, "audio/g711-mlaw", -1);
        goto L85
    L75:
        if (r18 == 1) goto L82;
        if (r18 == 3) goto L80;
        if (r18 == 65534) goto L82;
    L78:
        int r112 = 0;
    L83:
        if (r112 == 0) goto L88;
        this.e = new c95(this.a, this.b, r25, "audio/raw", r112);
        goto L85
    L88:
        throw ParserException.c("Unsupported WAV format type: " + r18);
    L80:
        if (r20 != 32) goto L78;
    L81:
        r112 = r4;
    L82:
        r4 = f35.C(r20, ByteOrder.LITTLE_ENDIAN);
        goto L81
    L41:
        if (r23 != 24) goto L66;
        be3 r26 = new be3(r24);
        r26.t();
        int r27 = r26.t();
        if (r27 == 0) goto L48;
        if (r27 == r20) goto L48;
        throw ParserException.c("validBits ( " + r27 + ")  != bitsPerSample( " + r20 + ") are not supported");
    L48:
        int r28 = r26.s();
        if ((r28 >> 18) != 0) goto L64;
        if (r28 != 0) goto L52;
    L56:
        r18 = r26.t();
        byte[] r113 = new byte[14];
        r26.k(r113, 0, 14);
        if (Arrays.equals(r113, uo.s) == true) goto L66;
        if (Arrays.equals(r113, uo.t) == true) goto L66;
        throw ParserException.c("invalid wav format extension guid");
    L52:
        if (Integer.bitCount(r28) == r19) goto L56;
        throw ParserException.c("invalid number of channels (" + Integer.bitCount(r28) + ") in channel mask " + r28);
    L64:
        throw ParserException.c("invalid channel mask " + r28);
    L65:
        r24 = f35.b;
        goto L66
    L35:
        r17 = false;
        goto L36
    L96:
        if (r21.getPosition() != 0) goto L98;
        boolean r29 = true;
    L99:
        rr2.w(r29);
        int r30 = this.f;
        if (r30 == (-1)) goto L104;
        r21.l(r30);
        this.c = 4;
        return 0;
    L104:
        if (uo.g(r21) == false) goto L108;
        r21.l((int) (r21.f() - r21.getPosition()));
        this.c = 1;
        return 0;
    L108:
        throw ParserException.a(null, "Unsupported or unrecognized wav file type.");
    L98:
        r29 = false;
        goto L99
    }

    @Override // defpackage.k51
    public final boolean c(l51 r1) {
        return uo.g(r1);
    }

    @Override // defpackage.k51
    public final void d(long r3, long r5) {
        if (r3 != 0) goto L5;
        int r4 = 0;
    L6:
        this.c = r4;
        b95 r2 = this.e;
        if (r2 == null) goto L10;
        r2.a(r5);
        return;
    L10:
        return;
    L5:
        r4 = 4;
        goto L6
    }

    @Override // defpackage.k51
    public final void f(m51 r3) {
        this.a = r3;
        this.b = r3.t(0, 1);
        r3.p();
    }
}
