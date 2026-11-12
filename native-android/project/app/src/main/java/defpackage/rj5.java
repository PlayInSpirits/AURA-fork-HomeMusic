package defpackage;

import java.io.ByteArrayInputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class rj5 implements Iterable, Serializable {
    public static final rj5 p = null;
    public int n;
    public final byte[] o;

    static {
        p = new rj5(tj5.a);
        int r0 = oj5.a;
    }

    public rj5(byte[] r2) {
        this.n = 0;
        r2.getClass();
        this.o = r2;
    }

    public static int h(int r3, int r4, int r5) {
        int r1 = r4 - r3;
        if ((((r3 | r4) | r1) | (r5 - r4)) >= 0) goto L11;
        if (r3 < 0) goto L10;
        if (r4 >= r3) goto L9;
        kf2.h(xa3.e(r3, r4, "Beginning index larger than ending index: ", ", "));
        return 0;
    L9:
        kf2.h(xa3.e(r4, r5, "End index: ", " >= "));
        return 0;
    L10:
        kf2.h(b11.j(r3, "Beginning index: ", " < 0"));
        return 0;
    L11:
        return r1;
    }

    public static rj5 i(int r3, byte[] r4) {
        h(0, r3, r4.length);
        byte[] r2 = new byte[r3];
        System.arraycopy(r4, 0, r2, 0, r3);
        return new rj5(r2);
    }

    public byte a(int r1) {
        return this.o[r1];
    }

    public byte b(int r1) {
        return this.o[r1];
    }

    public int d() {
        return 0;
    }

    public int e() {
        return this.o.length;
    }

    public final boolean equals(Object r7) {
        if (r7 != this) goto L5;
        return true;
    L5:
        if ((r7 instanceof rj5) == true) goto L8;
    L27:
        return false;
    L8:
        if (e() != ((rj5) r7).e()) goto L27;
        if (e() != 0) goto L14;
        return true;
    L14:
        if ((r7 instanceof rj5) == false) goto L36;
        rj5 r8 = (rj5) r7;
        int r0 = this.n;
        int r2 = r8.n;
        if (r0 == 0) goto L19;
        if (r2 == 0) goto L19;
        if (r0 != r2) goto L27;
    L19:
        int r1 = e();
        if (r1 > r8.e()) goto L34;
        if (r1 > r8.e()) goto L31;
        byte[] r3 = r8.o;
        int r4 = d() + r1;
        int r5 = d();
        int r9 = r8.d();
    L24:
        if (r5 >= r4) goto L40;
        if (this.o[r5] != r3[r9]) goto L27;
        r5 = r5 + 1;
        r9 = r9 + 1;
        goto L24
    L40:
        return true;
    L31:
        kf2.n(xa3.e(r1, r8.e(), "Ran off end of other: 0, ", ", "));
        return false;
    L34:
        throw new IllegalArgumentException("Length too large: " + r1 + e());
    L36:
        return r7.equals(this);
    }

    public void f(int r2, byte[] r3) {
        System.arraycopy(this.o, 0, r3, 0, r2);
    }

    public final ByteArrayInputStream g() {
        int r1 = d();
        int r2 = e();
        return new ByteArrayInputStream(this.o, r1, r2);
    }

    public final int hashCode() {
        int r0 = this.n;
        if (r0 != 0) goto L12;
        int r1 = e();
        int r2 = d();
        byte[] r3 = tj5.a;
        int r4 = r1;
        int r5 = r2;
    L6:
        if (r5 >= (r2 + r1)) goto L8;
        r4 = (r4 * 31) + this.o[r5];
        r5 = r5 + 1;
        goto L6
    L8:
        if (r4 != 0) goto L10;
        r4 = 1;
    L10:
        this.n = r4;
        return r4;
    L12:
        return r0;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new pj5(this);
    }

    public final byte[] j() {
        int r0 = e();
        if (r0 == 0) goto L5;
        byte[] r1 = new byte[r0];
        f(r0, r1);
        return r1;
    L5:
        return tj5.a;
    }

    public final String toString() {
        Locale r0 = Locale.ROOT;
        String r1 = Integer.toHexString(System.identityHashCode(this));
        int r2 = e();
        if (e() > 50) goto L5;
        String r5 = gi1.d0(this);
    L10:
        StringBuilder r3 = new StringBuilder("<ByteString@");
        r3.append(r1);
        r3.append(" size=");
        r3.append(r2);
        r3.append(" contents=\"");
        return b11.q(r3, r5, "\">");
    L5:
        int r4 = h(0, 47, e());
        if (r4 != 0) goto L8;
        rj5 r6 = p;
    L9:
        r5 = gi1.d0(r6).concat("...");
        goto L10
    L8:
        int r7 = d();
        r6 = new qj5(this.o, r7, r4);
        goto L9
    }
}
