package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bh4 extends w0 {
    public int x;
    public int y;
    public boolean z;

    public bh4(InputStream r7, int r8) {
        super(r7, r8);
        this.y = 1;
        int r9 = 0;
        this.z = false;
        long r0 = 0;
    L3:
        int r10 = q();
        if (r10 == (-1)) goto L10;
        int r3 = r9 + 1;
        r0 = r0 | ((long) ((r10 & 127) << (r9 * 7)));
        if ((r10 & 128) == 0) goto L7;
        r9 = r3;
        goto L3
    L7:
        this.x = (int) r0;
        return;
    L10:
        mj0.i("Premature end of stream reading size");
        throw null;
    }

    @Override // java.io.InputStream
    public final int read(byte[] r11, int r12, int r13) {
        if (r13 != 0) goto L6;
        return 0;
    L6:
        if (this.z == false) goto L8;
        return -1;
    L8:
        int r0 = xa3.w(this.y);
        if (r0 == 0) goto L42;
        if (r0 == 1) goto L33;
        if (r0 != 2) goto L20;
        int r1 = f(r11, r12, r13);
        if (this.t > 0) goto L16;
        this.y = 1;
    L16:
        if (r1 <= 0) goto L19;
        return r1;
    L19:
        return read(r11, r12, r13);
    L20:
        int r10 = this.y;
        if (r10 != 1) goto L23;
        String r14 = "NO_BLOCK";
    L30:
        mj0.i("Unknown stream state ".concat(r14));
        return 0;
    L23:
        if (r10 != 2) goto L25;
        r14 = "IN_LITERAL";
        goto L30
    L25:
        if (r10 == 3) goto L27;
        r14 = "null";
        goto L30
    L27:
        r14 = "IN_BACK_REFERENCE";
        goto L30
    L33:
        int r2 = n(r11, r12, r13);
        if (this.t > 0) goto L37;
        this.y = 1;
    L37:
        if (r2 <= 0) goto L40;
        return r2;
    L40:
        return read(r11, r12, r13);
    L42:
        if (this.x != 0) goto L44;
        this.z = true;
    L98:
        return read(r11, r12, r13);
    L44:
        int r3 = q();
        if (r3 == (-1)) goto L102;
        int r6 = r3 & 3;
        hg3 r9 = this.w;
        if (r6 != 0) goto L49;
        int r4 = r3 >> 2;
        switch(r4) {
            case 60: goto L90;
            case 61: goto L89;
            case 62: goto L88;
            case 63: goto L86;
            default: goto L92;
        };
    L86:
        long r5 = gh0.k(r9, 4);
    L87:
        r4 = (int) r5;
        goto L92
    L88:
        r5 = gh0.k(r9, 3);
        goto L87
    L89:
        r5 = gh0.k(r9, 2);
        goto L87
    L90:
        r4 = q();
        if (r4 != (-1)) goto L92;
        mj0.i("Premature end of stream reading literal length");
        return 0;
    L92:
        int r7 = r4 + 1;
        if (r7 < 0) goto L100;
        this.x -= r7;
        long r8 = r7;
        if (r8 < 0) goto L99;
        this.t = r8;
        this.y = 2;
        goto L98
    L99:
        kf2.n("length must not be negative");
        return 0;
    L100:
        mj0.i("Illegal block with a negative literal size found");
        return 0;
    L49:
        if (r6 == 1) goto L71;
        if (r6 == 2) goto L62;
        if (r6 != 3) goto L98;
        int r15 = (r3 >> 2) + 1;
        if (r15 < 0) goto L61;
        this.x -= r15;
        s(((int) gh0.k(r9, 4)) & Integer.MAX_VALUE, r15);     // Catch: IllegalArgumentException -> L58
        this.y = 3;
    L58:
        e = move-exception;
        throw new IOException("Illegal block with bad offset found", e);
    L61:
        mj0.i("Illegal block with a negative match length found");
        return 0;
    L62:
        int r16 = (r3 >> 2) + 1;
        if (r16 < 0) goto L70;
        this.x -= r16;
        s((int) gh0.k(r9, 2), r16);     // Catch: IllegalArgumentException -> L67
        this.y = 3;
    L67:
        e = move-exception;
        throw new IOException("Illegal block with bad offset found", e);
    L70:
        mj0.i("Illegal block with a negative match length found");
        return 0;
    L71:
        int r17 = ((r3 >> 2) & 7) + 4;
        if (r17 < 0) goto L82;
        this.x -= r17;
        int r18 = (r3 & 224) << 3;
        int r19 = q();
        if (r19 != (-1)) goto L107;
        mj0.i("Premature end of stream reading back-reference length");
        return 0;
    L107:
        s(r18 | r19, r17);     // Catch: IllegalArgumentException -> L78
        this.y = 3;
    L78:
        e = move-exception;
        throw new IOException("Illegal block with bad offset found", e);
    L82:
        mj0.i("Illegal block with a negative match length found");
        return 0;
    L102:
        mj0.i("Premature end of stream reading block start");
        return 0;
    }
}
