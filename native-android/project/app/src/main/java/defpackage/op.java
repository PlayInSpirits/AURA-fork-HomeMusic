package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class op {
    public static final mp d = null;
    public final lp a;
    public final Character b;
    public volatile op c;

    static {
        new np("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new np("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new op("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new op("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        d = new mp(new lp("base16()", new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}));
    }

    public op(lp r3, Character r4) {
        this.a = r3;
        if (r4 == null) goto L9;
        char r0 = r4.charValue();
        byte[] r5 = r3.g;
        if (r0 >= r5.length) goto L9;
        if (r5[r0] == (-1)) goto L9;
        boolean r6 = false;
    L10:
        rr2.o(r6, "Padding character %s was already in alphabet", r4);
        this.b = r4;
        return;
    L9:
        r6 = true;
        goto L10
    }

    public final void a(StringBuilder r10, byte[] r11, int r12, int r13) {
        rr2.u(r12, r12 + r13, r11.length);
        lp r0 = this.a;
        int r1 = r0.f;
        int r2 = r0.d;
        int r3 = 0;
        if (r13 > r1) goto L5;
        boolean r4 = true;
    L6:
        rr2.l(r4);
        long r5 = 0;
        int r6 = 0;
    L8:
        if (r6 >= r13) goto L10;
        r5 = (r5 | ((long) (r11[r12 + r6] & 255))) << 8;
        r6 = r6 + 1;
        goto L8
    L10:
        int r14 = ((r13 + 1) * 8) - r2;
    L12:
        if (r3 >= (r13 * 8)) goto L14;
        r10.append(r0.b[((int) (r5 >>> (r14 - r3))) & r0.c]);
        r3 = r3 + r2;
        goto L12
    L14:
        Character r9 = this.b;
        if (r9 != null) goto L17;
        return;
    L17:
        if (r3 >= (r0.f * 8)) goto L23;
        r10.append(r9.charValue());
        r3 = r3 + r2;
        goto L17
    L23:
        return;
    L5:
        r4 = false;
        goto L6
    }

    public void b(StringBuilder r5, byte[] r6, int r7) {
        int r1 = 0;
        rr2.u(0, r7, r6.length);
    L3:
        if (r1 >= r7) goto L5;
        lp r0 = this.a;
        a(r5, r6, r1, Math.min(r0.f, r7 - r1));
        r1 = r1 + r0.f;
        goto L3
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof op) == false) goto L10;
        op r5 = (op) r4;
        if (this.a.equals(r5.a) == false) goto L10;
        if (Objects.equals(this.b, r5.b) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public final int hashCode() {
        int r0 = this.a.hashCode();
        return Objects.hashCode(this.b) ^ r0;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("BaseEncoding.");
        lp r1 = this.a;
        r0.append(r1);
        if ((8 % r1.d) == 0) goto L9;
        Character r3 = this.b;
        if (r3 != null) goto L7;
        r0.append(".omitPadding()");
        goto L9
    L7:
        r0.append(".withPadChar('");
        r0.append(r3);
        r0.append("')");
    L9:
        return r0.toString();
    }

    public op(String r3, String r4) {
        this(new lp(r3, r4.toCharArray()), '=');
    }
}
