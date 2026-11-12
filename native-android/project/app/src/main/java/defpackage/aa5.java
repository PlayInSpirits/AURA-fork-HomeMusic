package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class aa5 {
    public static int f;
    public ArrayList a;
    public int b;
    public int c;
    public ArrayList d;
    public int e;

    public final void a(ArrayList r6) {
        int r0 = this.a.size();
        if (this.e == (-1)) goto L12;
        if (r0 <= 0) goto L12;
        int r1 = 0;
    L7:
        if (r1 >= r6.size()) goto L12;
        aa5 r2 = (aa5) r6.get(r1);
        if (this.e != r2.b) goto L11;
        c(this.c, r2);
    L11:
        r1 = r1 + 1;
    L12:
        if (r0 != 0) goto L18;
        r6.remove(this);
        return;
    }

    public final int b(eb2 r9, int r10) {
        ArrayList r0 = this.a;
        int r2 = 0;
        if (r0.size() != 0) goto L5;
        return 0;
    L5:
        kc0 r1 = (kc0) ((jc0) r0.get(0)).S;
        r9.t();
        r1.b(r9, false);
        int r3 = 0;
    L7:
        if (r3 >= r0.size()) goto L9;
        ((jc0) r0.get(r3)).b(r9, false);
        r3 = r3 + 1;
        goto L7
    L9:
        if (r10 != 0) goto L14;
        if (r1.y0 <= 0) goto L14;
        l93.f(r1, r9, r0, 0);
    L14:
        if (r10 == 1) goto L16;
    L31:
        r9.p();     // Catch: Exception -> L20
    L22:
        this.d = new ArrayList();
    L24:
        if (r2 >= r0.size()) goto L26;
        jc0 r4 = (jc0) r0.get(r2);
        z45 r5 = new z45(4);
        new WeakReference(r4);
        eb2.n(r4.H);
        eb2.n(r4.I);
        eb2.n(r4.J);
        eb2.n(r4.K);
        eb2.n(r4.L);
        this.d.add(r5);
        r2 = r2 + 1;
        goto L24
    L26:
        if (r10 != 0) goto L29;
        int r8 = eb2.n(r1.H);
        int r11 = eb2.n(r1.J);
        r9.t();
    L30:
        return r11 - r8;
    L29:
        r8 = eb2.n(r1.I);
        r11 = eb2.n(r1.K);
        r9.t();
    L20:
        e = move-exception;
        System.err.println(e.toString() + "\n" + Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        goto L22
    L16:
        if (r1.z0 <= 0) goto L31;
        l93.f(r1, r9, r0, 1);
        goto L31
    }

    public final void c(int r8, aa5 r9) {
        int r0 = r9.b;
        ArrayList r1 = this.a;
        int r2 = r1.size();
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L11;
        Object r4 = r1.get(r3);
        r3 = r3 + 1;
        jc0 r5 = (jc0) r4;
        ArrayList r6 = r9.a;
        if (r6.contains(r5) == true) goto L8;
        r6.add(r5);
    L8:
        if (r8 == 0) goto L9;
        r5.n0 = r0;
        goto L3
    L9:
        r5.m0 = r0;
        goto L3
    L11:
        this.e = r0;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        int r1 = this.c;
        if (r1 != 0) goto L6;
        String r2 = "Horizontal";
    L12:
        r0.append(r2);
        r0.append(" [");
        String r3 = f34.i(r0, this.b, "] <");
        ArrayList r5 = this.a;
        int r4 = r5.size();
        int r6 = 0;
    L13:
        if (r6 >= r4) goto L16;
        Object r7 = r5.get(r6);
        r6 = r6 + 1;
        StringBuilder r8 = b11.s(r3, " ");
        r8.append(((jc0) r7).g0);
        r3 = r8.toString();
        goto L13
    L16:
        return r3.concat(" >");
    L6:
        if (r1 != 1) goto L9;
        r2 = "Vertical";
        goto L12
    L9:
        if (r1 != 2) goto L11;
        r2 = "Both";
        goto L12
    L11:
        r2 = "Unknown";
        goto L12
    }
}
