package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class d3 extends b3 {
    public static d3 e;
    public static final o04 f = null;
    public static final o04 g = null;
    public ms4 c;
    public i94 d;

    static {
        f = o04.o;
        g = o04.n;
    }

    @Override // defpackage.b3
    public final int[] f(int r6) {
        if (j().length() > 0) goto L6;
    L41:
        return null;
    L6:
        if (r6 >= j().length()) goto L41;
        i94 r0 = this.d;     // Catch: IllegalStateException -> L42
        if (r0 == null) goto L39;
        wv3 r1 = r0.g();     // Catch: IllegalStateException -> L42
        int r2 = Math.round(r1.d - r1.b);     // Catch: IllegalStateException -> L42
        if (r6 > 0) goto L14;
        r6 = 0;
    L14:
        ms4 r3 = this.c;
        if (r3 == null) goto L37;
        int r4 = r3.a(r6);
        ms4 r5 = this.c;
        if (r5 == null) goto L35;
        float r7 = r5.d(r4) + r2;
        ms4 r8 = this.c;
        if (r8 == null) goto L33;
        float r9 = r8.d(r8.b.b - 1);
        ms4 r10 = this.c;
        if (r7 >= r9) goto L27;
        if (r10 == null) goto L25;
        int r11 = r10.b(r7);
    L30:
        return i(r6, o(r11 - 1, g) + 1);
    L25:
        h12.Q("layoutResult");
        throw null;
    L27:
        if (r10 == null) goto L31;
        r11 = r10.b.b;
        goto L30
    L31:
        h12.Q("layoutResult");
        throw null;
    L33:
        h12.Q("layoutResult");
        throw null;
    L35:
        h12.Q("layoutResult");
        throw null;
    L37:
        h12.Q("layoutResult");
        throw null;
    L39:
        h12.Q("node");     // Catch: IllegalStateException -> L42
        throw null;     // Catch: IllegalStateException -> L42
    }

    @Override // defpackage.b3
    public final int[] m(int r6) {
        if (j().length() > 0) goto L5;
        return null;
    L5:
        if (r6 > 0) goto L39;
        return null;
    L39:
        i94 r0 = this.d;     // Catch: IllegalStateException -> L38
        if (r0 == null) goto L36;
        wv3 r1 = r0.g();     // Catch: IllegalStateException -> L38
        int r2 = Math.round(r1.d - r1.b);     // Catch: IllegalStateException -> L38
        int r3 = j().length();
        if (r3 > r6) goto L14;
        r6 = r3;
    L14:
        ms4 r4 = this.c;
        if (r4 == null) goto L34;
        int r5 = r4.a(r6);
        ms4 r7 = this.c;
        if (r7 == null) goto L32;
        float r8 = r7.d(r5) - r2;
        if (r8 <= 0.0f) goto L25;
        ms4 r9 = this.c;
        if (r9 == null) goto L23;
        int r10 = r9.b(r8);
    L27:
        if (r6 != j().length()) goto L31;
        if (r10 >= r5) goto L31;
        r10 = r10 + 1;
    L31:
        return i(o(r10, f), r6);
    L23:
        h12.Q("layoutResult");
        throw null;
    L25:
        r10 = 0;
        goto L27
    L32:
        h12.Q("layoutResult");
        throw null;
    L34:
        h12.Q("layoutResult");
        throw null;
    L36:
        h12.Q("node");     // Catch: IllegalStateException -> L38
        throw null;     // Catch: IllegalStateException -> L38
    L38:
        return null;
    }

    public final int o(int r5, o04 r6) {
        ms4 r0 = this.c;
        if (r0 == null) goto L20;
        int r1 = r0.c(r5);
        ms4 r3 = this.c;
        if (r3 == null) goto L18;
        o04 r2 = r3.e(r1);
        ms4 r4 = this.c;
        if (r6 == r2) goto L13;
        if (r4 != null) goto L10;
        h12.Q("layoutResult");
        throw null;
    L10:
        return r4.c(r5);
    L13:
        if (r4 == null) goto L16;
        fd r7 = r4.b;
        r7.c(r5);
        ArrayList r8 = (ArrayList) r7.e;
        od3 r9 = (od3) r8.get(rr2.D(r8, r5));
        ic r10 = r9.a;
        return (r10.d.e(r5 - r9.d) + r9.b) - 1;
    L16:
        h12.Q("layoutResult");
        throw null;
    L18:
        h12.Q("layoutResult");
        throw null;
    L20:
        h12.Q("layoutResult");
        throw null;
    }
}
