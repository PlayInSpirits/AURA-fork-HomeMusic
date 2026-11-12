package defpackage;

import java.io.File;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ge3 implements Comparable {
    public static final String o = null;
    public final yw n;

    static {
        String r0 = File.separator;
        r0.getClass();
        o = r0;
    }

    public ge3(yw r1) {
        r1.getClass();
        this.n = r1;
    }

    public final ArrayList a() {
        ArrayList r0 = new ArrayList();
        int r1 = f.a(this);
        yw r7 = this.n;
        if (r1 != (-1)) goto L6;
        r1 = 0;
    L10:
        int r2 = r7.d();
        int r4 = r1;
    L11:
        if (r1 >= r2) goto L19;
        if (r7.i(r1) != 47) goto L15;
    L16:
        r0.add(r7.n(r4, r1));
        r4 = r1 + 1;
    L17:
        r1 = r1 + 1;
        goto L11
    L15:
        if (r7.i(r1) != 92) goto L17;
    L19:
        if (r4 >= r7.d()) goto L21;
        r0.add(r7.n(r4, r7.d()));
    L21:
        return r0;
    L6:
        if (r1 >= r7.d()) goto L10;
        if (r7.i(r1) != 92) goto L10;
        r1 = r1 + 1;
        goto L10
    }

    public final ge3 b() {
        yw r0 = f.d;
        yw r1 = this.n;
        if (h12.c(r1, r0) == true) goto L52;
        yw r2 = f.a;
        if (h12.c(r1, r2) == true) goto L54;
        yw r3 = f.b;
        if (h12.c(r1, r3) == true) goto L55;
        yw r4 = f.e;
        r1.getClass();
        r4.getClass();
        int r5 = r1.d();
        byte[] r6 = r4.n;
        if (r1.m(r5 - r6.length, r4, r6.length) == true) goto L11;
    L19:
        int r7 = yw.k(r1, r2);
        if (r7 != (-1)) goto L24;
        r7 = yw.k(r1, r3);
    L24:
        if (r7 == 2) goto L26;
    L32:
        if (r7 != 1) goto L36;
        r3.getClass();
        if (r1.m(0, r3, r3.d()) == false) goto L36;
        return null;
    L36:
        if (r7 == (-1)) goto L38;
    L44:
        if (r7 == (-1)) goto L46;
        if (r7 != 0) goto L51;
        return new ge3(yw.o(r1, 0, 1, 1));
    L51:
        return new ge3(yw.o(r1, 0, r7, 1));
    L46:
        return new ge3(r0);
    L38:
        if (e() == null) goto L44;
        if (r1.d() != 2) goto L43;
        return null;
    L43:
        return new ge3(yw.o(r1, 0, 2, 1));
    L26:
        if (e() == null) goto L32;
        if (r1.d() != 3) goto L31;
        return null;
    L31:
        return new ge3(yw.o(r1, 0, 3, 1));
    L11:
        if (r1.d() != 2) goto L14;
        return null;
    L14:
        if (r1.m(r1.d() - 3, r2, 1) == false) goto L17;
        return null;
    L17:
        if (r1.m(r1.d() - 3, r3, 1) == false) goto L19;
        return null;
    L55:
        return null;
    L54:
        return null;
    L52:
        return null;
    }

    public final ge3 c(ge3 r13) {
        r13.getClass();
        yw r0 = r13.n;
        int r1 = f.a(this);
        yw r2 = this.n;
        if (r1 != (-1)) goto L5;
        ge3 r6 = null;
    L6:
        int r3 = f.a(r13);
        if (r3 != (-1)) goto L9;
        ge3 r7 = null;
    L11:
        if (h12.c(r6, r7) == false) goto L39;
        ArrayList r4 = a();
        ArrayList r8 = r13.a();
        int r9 = Math.min(r4.size(), r8.size());
        int r10 = 0;
    L13:
        if (r10 >= r9) goto L17;
        if (h12.c(r4.get(r10), r8.get(r10)) == false) goto L17;
        r10 = r10 + 1;
    L17:
        if (r10 != r9) goto L23;
        if (r2.d() != r0.d()) goto L23;
        return tv1.z(".");
    L23:
        if (r8.subList(r10, r8.size()).indexOf(f.e) != (-1)) goto L37;
        tv r5 = new tv();
        yw r14 = f.c(r13);
        if (r14 != null) goto L29;
        r14 = f.c(this);
        if (r14 != null) goto L29;
        r14 = f.f(o);
    L29:
        int r12 = r8.size();
        int r11 = r10;
    L30:
        if (r11 >= r12) goto L32;
        r5.X(f.e);
        r5.X(r14);
        r11 = r11 + 1;
        goto L30
    L32:
        int r15 = r4.size();
    L33:
        if (r10 >= r15) goto L36;
        r5.X((yw) r4.get(r10));
        r5.X(r14);
        r10 = r10 + 1;
        goto L33
    L36:
        return f.d(r5, false);
    L37:
        nz2.v("Impossible relative path to resolve: ", this, " and ", r13);
        return null;
    L39:
        nz2.v("Paths of different roots cannot be relative to each other: ", this, " and ", r13);
        return null;
    L9:
        r7 = new ge3(r0.n(0, r3));
        goto L11
    L5:
        r6 = new ge3(r2.n(0, r1));
        goto L6
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object r1) {
        ge3 r2 = (ge3) r1;
        r2.getClass();
        return this.n.b(r2.n);
    }

    public final ge3 d(String r2) {
        r2.getClass();
        tv r0 = new tv();
        r0.d0(r2);
        return f.b(this, f.d(r0, false), false);
    }

    public final Character e() {
        yw r0 = f.a;
        yw r2 = this.n;
        if (yw.g(r2, r0) == (-1)) goto L6;
        return null;
    L6:
        if (r2.d() >= 2) goto L9;
        return null;
    L9:
        if (r2.i(1) != 58) goto L27;
        char r3 = (char) r2.i(0);
        if ('a' > r3) goto L17;
        if (r3 >= '{') goto L17;
    L21:
        return Character.valueOf(r3);
    L17:
        if ('A' <= r3) goto L19;
        return null;
    L19:
        if (r3 < '[') goto L21;
        return null;
    L27:
        return null;
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof ge3) == true) goto L5;
        return false;
    L5:
        if (h12.c(((ge3) r2).n, this.n) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public final int hashCode() {
        return this.n.hashCode();
    }

    public final File toFile() {
        return new File(this.n.q());
    }

    public final String toString() {
        return this.n.q();
    }
}
