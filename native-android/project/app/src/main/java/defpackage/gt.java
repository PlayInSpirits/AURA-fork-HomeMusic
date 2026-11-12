package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gt extends w0 {
    public int x;
    public int y;

    public gt(InputStream r2) {
        super(r2, 65536);
        this.y = 1;
    }

    @Override // java.io.InputStream
    public final int read(byte[] r18, int r19, int r20) {
        if (r20 != 0) goto L6;
        return 0;
    L6:
        int r0 = xa3.w(this.y);
        if (r0 != 0) goto L9;
        long r15 = 0;
        int r1 = q();
        if (r1 == (-1)) goto L94;
        this.x = r1 & 15;
        long r5 = (r1 & 240) >> 4;
        if (r5 != 15) goto L81;
        long r10 = 0;
    L74:
        int r2 = q();
        if (r2 == (-1)) goto L79;
        r10 = r10 + ((long) r2);
        if (r2 == 255) goto L74;
        r5 = r5 + r10;
        goto L81
    L79:
        mj0.i("Premature end of stream while parsing length");
        return 0;
    L81:
        if (r5 < 0) goto L93;
        if (r5 < 0) goto L92;
        this.t = r5;
        this.y = 2;
    L84:
        int r3 = n(r18, r19, r20);
        if (this.t > r15) goto L88;
        this.y = 3;
    L88:
        if (r3 <= 0) goto L91;
        return r3;
    L91:
        return read(r18, r19, r20);
    L92:
        kf2.n("length must not be negative");
        return 0;
    L93:
        mj0.i("Illegal block with a negative literal size found");
        return 0;
    L94:
        mj0.i("Premature end of stream while looking for next block");
        return 0;
    L9:
        if (r0 == 1) goto L68;
        if (r0 == 2) goto L97;
        if (r0 == 3) goto L33;
        if (r0 != 4) goto L14;
        return -1;
    L14:
        int r4 = this.y;
        if (r4 != 1) goto L17;
        String r6 = "NO_BLOCK";
    L30:
        mj0.i("Unknown stream state ".concat(r6));
        return 0;
    L17:
        if (r4 != 2) goto L19;
        r6 = "IN_LITERAL";
        goto L30
    L19:
        if (r4 != 3) goto L21;
        r6 = "LOOKING_FOR_BACK_REFERENCE";
        goto L30
    L21:
        if (r4 != 4) goto L23;
        r6 = "IN_BACK_REFERENCE";
        goto L30
    L23:
        if (r4 == 5) goto L25;
        r6 = "null";
        goto L30
    L25:
        r6 = "EOF";
        goto L30
    L33:
        long r16 = 0;
    L50:
        int r7 = f(r18, r19, r20);
        if (this.t > r16) goto L54;
        this.y = 1;
    L54:
        if (r7 <= 0) goto L57;
        return r7;
    L57:
        return read(r18, r19, r20);
    L97:
        int r8 = (int) gh0.k(this.w, 2);
        int r9 = this.x;
        long r11 = r9;
        if (r9 != 15) goto L44;
        long r13 = 0;
    L38:
        int r12 = q();
        if (r12 == (-1)) goto L43;
        r16 = 0;
        r13 = r13 + ((long) r12);
        if (r12 == 255) goto L38;
        r11 = r11 + r13;
    L46:
        if (r11 >= r16) goto L95;
        mj0.i("Illegal block with a negative match length found");
        return 0;
    L95:
        s(r8, r11 + 4);     // Catch: IllegalArgumentException -> L58
        this.y = 4;
    L58:
        e = move-exception;
        throw new IOException("Illegal block with bad offset found", e);
    L43:
        mj0.i("Premature end of stream while parsing length");
        return 0;
    L44:
        r16 = 0;
    L62:
        e = move-exception;
        if (this.x != 0) goto L67;
        this.y = 5;
        return -1;
    L67:
        throw e;
    L68:
        r15 = 0;
        goto L84
    }
}
