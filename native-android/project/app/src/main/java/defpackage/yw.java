package defpackage;

import java.io.Serializable;
import java.security.MessageDigest;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class yw implements Serializable, Comparable {
    public static final yw q = null;
    public final byte[] n;
    public transient int o;
    public transient String p;

    static {
        q = new yw(new byte[0]);
    }

    public yw(byte[] r1) {
        r1.getClass();
        this.n = r1;
    }

    public static int g(yw r1, yw r2) {
        r1.getClass();
        r2.getClass();
        return r1.f(0, r2.h());
    }

    public static int k(yw r0, yw r1) {
        r0.getClass();
        r1.getClass();
        return r0.j(r1.h());
    }

    public static /* synthetic */ yw o(yw r1, int r2, int r3, int r4) {
        if ((r4 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r3 = -1234567890;
    L9:
        return r1.n(r2, r3);
    }

    public String a() {
        byte[] r0 = d.a;
        byte[] r12 = this.n;
        r12.getClass();
        r0.getClass();
        byte[] r1 = new byte[((r12.length + 2) / 3) * 4];
        int r3 = r12.length - (r12.length % 3);
        int r4 = 0;
        int r5 = 0;
    L3:
        if (r4 >= r3) goto L5;
        byte r7 = r12[r4];
        int r8 = r4 + 2;
        byte r6 = r12[r4 + 1];
        r4 = r4 + 3;
        byte r9 = r12[r8];
        r1[r5] = r0[(r7 & 255) >> 2];
        r1[r5 + 1] = r0[((r7 & 3) << 4) | ((r6 & 255) >> 4)];
        int r10 = r5 + 3;
        r1[r5 + 2] = r0[((r6 & 15) << 2) | ((r9 & 255) >> 6)];
        r5 = r5 + 4;
        r1[r10] = r0[r9 & 63];
        goto L3
    L5:
        int r11 = r12.length - r3;
        if (r11 == 1) goto L10;
        if (r11 != 2) goto L12;
        int r13 = r4 + 1;
        byte r14 = r12[r4];
        byte r15 = r12[r13];
        r1[r5] = r0[(r14 & 255) >> 2];
        r1[r5 + 1] = r0[((r14 & 3) << 4) | ((r15 & 255) >> 4)];
        r1[r5 + 2] = r0[(r15 & 15) << 2];
        r1[r5 + 3] = 61;
    L12:
        return new String(r1, w10.a);
    L10:
        byte r16 = r12[r4];
        r1[r5] = r0[(r16 & 255) >> 2];
        r1[r5 + 1] = r0[(r16 & 3) << 4];
        r1[r5 + 2] = 61;
        r1[r5 + 3] = 61;
        goto L12
    }

    public final int b(yw r10) {
        r10.getClass();
        int r0 = d();
        int r1 = r10.d();
        int r2 = Math.min(r0, r1);
        int r4 = 0;
    L4:
        if (r4 >= r2) goto L11;
        int r7 = i(r4) & 255;
        int r8 = r10.i(r4) & 255;
        if (r7 != r8) goto L8;
        r4 = r4 + 1;
        goto L4
    L8:
        if (r7 >= r8) goto L10;
        return -1;
    L10:
        return 1;
    L11:
        if (r0 != r1) goto L13;
        return 0;
    L13:
        if (r0 >= r1) goto L15;
        return -1;
    L15:
        return 1;
    }

    public yw c(String r3) {
        MessageDigest r4 = MessageDigest.getInstance(r3);
        int r1 = d();
        r4.update(this.n, 0, r1);
        byte[] r2 = r4.digest();
        r2.getClass();
        return new yw(r2);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object r1) {
        return b((yw) r1);
    }

    public int d() {
        return this.n.length;
    }

    public String e() {
        byte[] r8 = this.n;
        char[] r0 = new char[r8.length * 2];
        int r1 = r8.length;
        int r2 = 0;
        int r3 = 0;
    L3:
        if (r2 >= r1) goto L6;
        byte r4 = r8[r2];
        int r5 = r3 + 1;
        char[] r6 = e35.d;
        r0[r3] = r6[(r4 >> 4) & 15];
        r3 = r3 + 2;
        r0[r5] = r6[r4 & 15];
        r2 = r2 + 1;
        goto L3
    L6:
        return new String(r0);
    }

    public boolean equals(Object r4) {
        if (r4 != this) goto L5;
        return true;
    L5:
        if ((r4 instanceof yw) == false) goto L12;
        yw r5 = (yw) r4;
        int r0 = r5.d();
        byte[] r3 = this.n;
        if (r0 != r3.length) goto L12;
        if (r5.l(0, 0, r3.length, r3) == false) goto L12;
        return true;
    L12:
        return false;
    }

    public int f(int r4, byte[] r5) {
        r5.getClass();
        byte[] r3 = this.n;
        int r0 = r3.length - r5.length;
        int r6 = Math.max(r4, 0);
        if (r6 <= r0) goto L5;
        return -1;
    L5:
        if (zz1.e(r6, 0, r5.length, r3, r5) == true) goto L6;
        if (r6 == r0) goto L13;
        r6 = r6 + 1;
        goto L5
    L13:
        return -1;
    L6:
        return r6;
    }

    public byte[] h() {
        return this.n;
    }

    public int hashCode() {
        int r0 = this.o;
        if (r0 == 0) goto L5;
        return r0;
    L5:
        int r1 = Arrays.hashCode(this.n);
        this.o = r1;
        return r1;
    }

    public byte i(int r1) {
        return this.n[r1];
    }

    public int j(byte[] r4) {
        r4.getClass();
        int r0 = d();
        byte[] r3 = this.n;
        int r1 = Math.min(r0, r3.length - r4.length);
    L4:
        if ((-1) >= r1) goto L9;
        if (zz1.e(r1, 0, r4.length, r3, r4) == true) goto L7;
        r1 = r1 - 1;
        goto L4
    L7:
        return r1;
    L9:
        return -1;
    }

    public boolean l(int r2, int r3, int r4, byte[] r5) {
        r5.getClass();
        if (r2 < 0) goto L13;
        byte[] r1 = this.n;
        if (r2 > (r1.length - r4)) goto L15;
        if (r3 >= 0) goto L8;
        return false;
    L8:
        if (r3 <= (r5.length - r4)) goto L10;
        return false;
    L10:
        if (zz1.e(r2, r3, r4, r1, r5) == false) goto L18;
        return true;
    L18:
        return false;
    L15:
        return false;
    L13:
        return false;
    }

    public boolean m(int r2, yw r3, int r4) {
        r3.getClass();
        return r3.l(0, r2, r4, this.n);
    }

    public yw n(int r4, int r5) {
        if (r5 != (-1234567890)) goto L6;
        r5 = d();
    L6:
        if (r4 < 0) goto L21;
        byte[] r1 = this.n;
        if (r5 <= r1.length) goto L10;
        kf2.i("endIndex > length(", r1.length, 41);
        return null;
    L10:
        if ((r5 - r4) < 0) goto L17;
        if (r4 != 0) goto L16;
        if (r5 != r1.length) goto L16;
        return this;
    L16:
        return new yw(ti.d0(r1, r4, r5));
    L17:
        kf2.n("endIndex < beginIndex");
        return null;
    L21:
        kf2.n("beginIndex < 0");
        return null;
    }

    public yw p() {
        int r0 = 0;
    L3:
        byte[] r1 = this.n;
        if (r0 >= r1.length) goto L22;
        byte r2 = r1[r0];
        if (r2 < 65) goto L21;
        if (r2 > 90) goto L21;
        byte[] r5 = Arrays.copyOf(r1, r1.length);
        int r3 = r0 + 1;
        r5[r0] = (byte) (r2 + 32);
    L12:
        if (r3 >= r5.length) goto L20;
        byte r4 = r5[r3];
        if (r4 < 65) goto L18;
        if (r4 > 90) goto L18;
        r5[r3] = (byte) (r4 + 32);
    L18:
        r3 = r3 + 1;
        goto L12
    L20:
        return new yw(r5);
    L21:
        r0 = r0 + 1;
        goto L3
    L22:
        return this;
    }

    public final String q() {
        String r0 = this.p;
        if (r0 != null) goto L6;
        byte[] r1 = h();
        r1.getClass();
        String r2 = new String(r1, w10.a);
        this.p = r2;
        return r2;
    L6:
        return r0;
    }

    public void r(tv r2, int r3) {
        r2.m78write(this.n, 0, r3);
    }

    public String toString() {
        yw r0 = this;
        byte[] r1 = r0.n;
        if (r1.length != 0) goto L6;
        return "[size=0]";
    L6:
        int r2 = r1.length;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
    L8:
        if (r4 >= r2) goto L181;
        byte r9 = r1[r4];
        int r16 = 2;
        if (r9 >= 0) goto L11;
        if ((r9 >> 5) != (-2)) goto L83;
        int r3 = r4 + 1;
        if (r2 <= r3) goto L53;
        byte r7 = r1[r3];
        if ((r7 & 192) != 128) goto L80;
        int r8 = (r7 ^ 3968) ^ (r9 << 6);
        if (r8 < 128) goto L59;
        int r10 = r6 + 1;
        if (r6 == 64) goto L181;
        if (r8 == 10) goto L73;
        if (r8 == 13) goto L73;
        if (r8 < 0) goto L69;
        if (r8 >= 32) goto L69;
    L179:
        r5 = -1;
    L69:
        if (127 > r8) goto L73;
        if (r8 < 160) goto L179;
    L73:
        if (r8 == 65533) goto L179;
        if (r8 >= 65536) goto L78;
        r16 = 1;
    L78:
        r5 = r5 + r16;
        r4 = r4 + 2;
    L79:
        r6 = r10;
        goto L8
    L59:
        if (r6 != 64) goto L179;
    L80:
        if (r6 != 64) goto L179;
    L53:
        if (r6 != 64) goto L179;
    L83:
        if ((r9 >> 4) != (-2)) goto L126;
        int r11 = r4 + 2;
        if (r2 <= r11) goto L86;
        byte r12 = r1[r4 + 1];
        if ((r12 & 192) != 128) goto L123;
        byte r13 = r1[r11];
        if ((r13 & 192) != 128) goto L121;
        int r14 = ((r13 ^ (-123008)) ^ (r12 << 6)) ^ (r9 << 12);
        if (r14 < 2048) goto L94;
        if (55296 > r14) goto L100;
        if (r14 >= 57344) goto L100;
        if (r6 != 64) goto L179;
    L100:
        r10 = r6 + 1;
        if (r6 == 64) goto L181;
        if (r14 == 10) goto L115;
        if (r14 == 13) goto L115;
        if (r14 < 0) goto L110;
        if (r14 < 32) goto L179;
    L110:
        if (127 > r14) goto L115;
        if (r14 < 160) goto L179;
    L115:
        if (r14 == 65533) goto L179;
        if (r14 >= 65536) goto L120;
        r16 = 1;
    L120:
        r5 = r5 + r16;
        r4 = r4 + 3;
        goto L79
    L94:
        if (r6 != 64) goto L179;
    L121:
        if (r6 != 64) goto L179;
    L123:
        if (r6 != 64) goto L179;
    L86:
        if (r6 != 64) goto L179;
    L126:
        if ((r9 >> 3) != (-2)) goto L177;
        int r15 = r4 + 3;
        if (r2 <= r15) goto L129;
        byte r17 = r1[r4 + 1];
        if ((r17 & 192) != 128) goto L175;
        byte r18 = r1[r4 + 2];
        if ((r18 & 192) != 128) goto L173;
        byte r19 = r1[r15];
        if ((r19 & 192) != 128) goto L171;
        int r20 = (((r19 ^ 3678080) ^ (r18 << 6)) ^ (r17 << 12)) ^ (r9 << 18);
        if (r20 > 1114111) goto L139;
        if (55296 > r20) goto L146;
        if (r20 >= 57344) goto L146;
        if (r6 != 64) goto L179;
    L146:
        if (r20 < 65536) goto L147;
        r10 = r6 + 1;
        if (r6 == 64) goto L181;
        if (r20 == 10) goto L165;
        if (r20 == 13) goto L165;
        if (r20 < 0) goto L160;
        if (r20 < 32) goto L179;
    L160:
        if (127 > r20) goto L165;
        if (r20 < 160) goto L179;
    L165:
        if (r20 == 65533) goto L179;
        if (r20 >= 65536) goto L170;
        r16 = 1;
    L170:
        r5 = r5 + r16;
        r4 = r4 + 4;
        goto L79
    L147:
        if (r6 != 64) goto L179;
    L139:
        if (r6 != 64) goto L179;
    L171:
        if (r6 != 64) goto L179;
    L173:
        if (r6 != 64) goto L179;
    L175:
        if (r6 != 64) goto L179;
    L129:
        if (r6 != 64) goto L179;
    L177:
        if (r6 != 64) goto L179;
    L11:
        int r110 = r6 + 1;
        if (r6 == 64) goto L181;
        if (r9 == 10) goto L22;
        if (r9 == 13) goto L22;
        if (r9 < 0) goto L19;
        if (r9 < 32) goto L179;
    L19:
        if (127 > r9) goto L22;
        if (r9 < 160) goto L179;
    L22:
        if (r9 == 65533) goto L179;
        if (r9 >= 65536) goto L26;
        int r21 = 1;
    L27:
        r5 = r5 + r21;
        r4 = r4 + 1;
    L28:
        r6 = r110;
        if (r4 >= r2) goto L8;
        byte r22 = r1[r4];
        if (r22 < 0) goto L8;
        r4 = r4 + 1;
        r110 = r6 + 1;
        if (r6 == 64) goto L181;
        if (r22 == 10) goto L43;
        if (r22 == 13) goto L43;
        if (r22 < 0) goto L40;
        if (r22 < 32) goto L179;
    L40:
        if (127 > r22) goto L43;
        if (r22 < 160) goto L179;
    L43:
        if (r22 == 65533) goto L179;
        if (r22 >= 65536) goto L47;
        int r23 = 1;
    L48:
        r5 = r5 + r23;
        goto L28
    L47:
        r23 = 2;
        goto L48
    L26:
        r21 = 2;
    L181:
        if (r5 == (-1)) goto L183;
        String r24 = r0.q();
        String r25 = xm4.i0(xm4.i0(xm4.i0(r24.substring(0, r5), "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
        if (r5 >= r24.length()) goto L201;
        return "[size=" + r1.length + " text=" + r25 + "…]";
    L201:
        return "[text=" + r25 + ']';
    L183:
        if (r1.length <= 64) goto L185;
        StringBuilder r26 = new StringBuilder("[size=");
        r26.append(r1.length);
        r26.append(" hex=");
        if (64 <= r1.length) goto L189;
        kf2.i("endIndex > length(", r1.length, 41);
        return null;
    L189:
        if (64 == r1.length) goto L192;
        r0 = new yw(ti.d0(r1, 0, 64));
    L192:
        r26.append(r0.e());
        r26.append("…]");
        return r26.toString();
    L185:
        return "[hex=" + r0.e() + ']';
    }
}
