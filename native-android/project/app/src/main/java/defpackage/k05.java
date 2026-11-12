package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class k05 {
    public static final ThreadLocal d = null;
    public final int a;
    public final na4 b;
    public volatile int c;

    static {
        d = new ThreadLocal();
    }

    public k05(na4 r2, int r3) {
        this.c = 0;
        this.b = r2;
        this.a = r3;
    }

    public final int a(int r3) {
        vv2 r2 = b();
        int r0 = r2.a(16);
        if (r0 == 0) goto L6;
        ByteBuffer r1 = (ByteBuffer) r2.q;
        int r4 = r0 + r2.n;
        int r5 = r3 * 4;
        return r1.getInt(r5 + ((r1.getInt(r4) + r4) + 4));
    L6:
        return 0;
    }

    public final vv2 b() {
        ThreadLocal r0 = d;
        vv2 r1 = (vv2) r0.get();
        if (r1 != null) goto L5;
        r1 = new vv2();
        r0.set(r1);
    L5:
        wv2 r2 = (wv2) this.b.n;
        int r3 = r2.a(6);
        if (r3 == 0) goto L12;
        int r4 = r3 + r2.n;
        int r5 = (((ByteBuffer) r2.q).getInt(r4) + r4) + 4;
        int r6 = (this.a * 4) + r5;
        int r7 = ((ByteBuffer) r2.q).getInt(r6) + r6;
        ByteBuffer r8 = (ByteBuffer) r2.q;
        r1.q = r8;
        if (r8 == null) goto L11;
        r1.n = r7;
        int r9 = r7 - r8.getInt(r7);
        r1.o = r9;
        r1.p = ((ByteBuffer) r1.q).getShort(r9);
        return r1;
    L11:
        r1.n = 0;
        r1.o = 0;
        r1.p = 0;
    L12:
        return r1;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append(super.toString());
        r0.append(", id:");
        vv2 r1 = b();
        int r2 = r1.a(4);
        int r3 = 0;
        if (r2 == 0) goto L5;
        int r4 = ((ByteBuffer) r1.q).getInt(r2 + r1.n);
    L6:
        r0.append(Integer.toHexString(r4));
        r0.append(", codepoints:");
        vv2 r5 = b();
        int r6 = r5.a(16);
        if (r6 == 0) goto L9;
        int r7 = r6 + r5.n;
        int r8 = ((ByteBuffer) r5.q).getInt(((ByteBuffer) r5.q).getInt(r7) + r7);
    L10:
        if (r3 >= r8) goto L13;
        r0.append(Integer.toHexString(a(r3)));
        r0.append(" ");
        r3 = r3 + 1;
        goto L10
    L13:
        return r0.toString();
    L9:
        r8 = 0;
        goto L10
    L5:
        r4 = 0;
        goto L6
    }
}
