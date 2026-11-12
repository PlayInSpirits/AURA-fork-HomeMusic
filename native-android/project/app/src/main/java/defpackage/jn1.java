package defpackage;

import java.io.EOFException;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jn1 implements wv4 {
    public static final tb1 f = null;
    public static final tb1 g = null;
    public final wv4 a;
    public final tb1 b;
    public tb1 c;
    public byte[] d;
    public int e;

    static {
        sb1 r0 = new sb1();
        r0.m = lw2.m("application/id3");
        f = new tb1(r0);
        sb1 r1 = new sb1();
        r1.m = lw2.m("application/x-emsg");
        g = new tb1(r1);
    }

    public jn1(wv4 r1, int r2) {
        this.a = r1;
        if (r2 != 1) goto L5;
        this.b = f;
    L10:
        this.d = new byte[0];
        this.e = 0;
        return;
    L5:
        if (r2 != 3) goto L7;
        this.b = g;
        goto L10
    L7:
        kf2.n(f34.f(r2, "Unknown metadataType: "));
        throw null;
    }

    @Override // defpackage.wv4
    public final void a(long r4, int r6, int r7, int r8, vv4 r9) {
        this.c.getClass();
        int r0 = this.e - r8;
        be3 r1 = new be3(Arrays.copyOfRange(this.d, r0 - r7, r0));
        byte[] r10 = this.d;
        System.arraycopy(r10, r0, r10, 0, r8);
        this.e = r8;
        String r11 = this.c.n;
        tb1 r12 = this.b;
        String r2 = r12.n;
        String r13 = r12.n;
        if (Objects.equals(r11, r2) == false) goto L6;
    L12:
        int r14 = r1.a();
        wv4 r3 = this.a;
        r3.e(r14, r1);
        r3.a(r4, r6, r14, 0, r9);
        return;
    L6:
        if ("application/x-emsg".equals(this.c.n) == false) goto L16;
        m21 r15 = wh.O(r1);
        tb1 r5 = r15.a();
        if (r5 != null) goto L10;
    L14:
        l93.q0("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + r13 + " but actual wrapped format: " + r15.a());
        return;
    L10:
        if (Objects.equals(r13, r5.n) == false) goto L14;
        byte[] r16 = r15.c();
        r16.getClass();
        r1 = new be3(r16);
        goto L12
    L16:
        l93.q0("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.c.n);
    }

    @Override // defpackage.wv4
    public final void b(be3 r3, int r4, int r5) {
        int r6 = this.e + r4;
        byte[] r0 = this.d;
        if (r0.length >= r6) goto L5;
        this.d = Arrays.copyOf(r0, (r6 / 2) + r6);
    L5:
        r3.k(this.d, this.e, r4);
        this.e += r4;
    }

    @Override // defpackage.wv4
    public final int c(wh0 r4, int r5, boolean r6) {
        int r0 = this.e + r5;
        byte[] r1 = this.d;
        if (r1.length >= r0) goto L5;
        this.d = Arrays.copyOf(r1, (r0 / 2) + r0);
    L5:
        int r7 = r4.read(this.d, this.e, r5);
        if (r7 != (-1)) goto L11;
        if (r6 == false) goto L10;
        return -1;
    L10:
        throw new EOFException();
    L11:
        this.e += r7;
        return r7;
    }

    @Override // defpackage.wv4
    public final void g(tb1 r1) {
        this.c = r1;
        this.a.g(this.b);
    }
}
