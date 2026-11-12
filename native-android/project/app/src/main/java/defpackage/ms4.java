package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ms4 {
    public final ls4 a;
    public final fd b;
    public final long c;
    public final float d;
    public final float e;
    public final ArrayList f;

    public ms4(ls4 r2, fd r3, long r4) {
        this.a = r2;
        this.b = r3;
        this.c = r4;
        ArrayList r5 = (ArrayList) r3.e;
        float r6 = 0.0f;
        if (r5.isEmpty() == false) goto L5;
        float r7 = 0.0f;
    L6:
        this.d = r7;
        if (r5.isEmpty() == true) goto L10;
        od3 r8 = (od3) q40.C0(r5);
        ks4 r9 = r8.a.d;
        r6 = (r9.c(r9.f - 1) + 0.0f) + r8.f;
    L10:
        this.e = r6;
        this.f = (ArrayList) r3.d;
        return;
    L5:
        r7 = ((od3) r5.get(0)).a.d.c(0) + 0.0f;
        goto L6
    }

    public final int a(int r2) {
        fd r1 = this.b;
        ArrayList r0 = (ArrayList) r1.e;
        if (r2 < ((he) ((bq4) r1.c).n).o.length()) goto L5;
        int r3 = gb.E(r0);
    L8:
        od3 r4 = (od3) r0.get(r3);
        ic r5 = r4.a;
        int r6 = r4.a(r2);
        return r5.d.f(r6) + r4.d;
    L5:
        if (r2 >= 0) goto L7;
        r3 = 0;
        goto L8
    L7:
        r3 = rr2.C(r0, r2);
        goto L8
    }

    public final int b(float r9) {
        ArrayList r8 = (ArrayList) this.b.e;
        int r2 = 0;
        if (r9 > 0.0f) goto L6;
        int r1 = 0;
    L23:
        od3 r10 = (od3) r8.get(r1);
        int r3 = r10.c;
        int r4 = r10.d;
        if ((r3 - r10.b) != 0) goto L26;
        return r4;
    L26:
        ic r5 = r10.a;
        float r11 = r9 - r10.f;
        ks4 r12 = r5.d;
        int r13 = (int) (r11 - 0.0f);
        int r0 = r12.f;
        if (r0 <= 0) goto L33;
        r2 = r12.e.getLineForVertical(r13 - r12.g);
        int r14 = r0 - 1;
        if (r2 <= r14) goto L33;
        r2 = r14;
    L33:
        return r2 + r4;
    L6:
        if (r9 < ((od3) q40.C0(r8)).g) goto L8;
        r1 = r8.size() - 1;
        goto L23
    L8:
        int r6 = r8.size() - 1;
        int r7 = 0;
    L9:
        if (r7 > r6) goto L22;
        int r15 = (r7 + r6) >>> 1;
        od3 r16 = (od3) r8.get(r15);
        if (r16.f <= r9) goto L14;
        byte r17 = 1;
    L17:
        if (r17 < 0) goto L18;
        if (r17 <= 0) goto L21;
        r6 = r15 - 1;
        goto L9
    L21:
        r1 = r15;
        goto L23
    L18:
        r7 = r15 + 1;
        goto L9
    L14:
        if (r16.g > r9) goto L16;
        r17 = -1;
        goto L17
    L16:
        r17 = 0;
        goto L17
    L22:
        r1 = -(r7 + 1);
        goto L23
    }

    public final int c(int r3) {
        fd r2 = this.b;
        r2.c(r3);
        ArrayList r4 = (ArrayList) r2.e;
        od3 r5 = (od3) r4.get(rr2.D(r4, r3));
        ic r0 = r5.a;
        int r6 = r3 - r5.d;
        return r0.d.e.getLineStart(r6) + r5.b;
    }

    public final float d(int r3) {
        fd r2 = this.b;
        r2.c(r3);
        ArrayList r4 = (ArrayList) r2.e;
        od3 r5 = (od3) r4.get(rr2.D(r4, r3));
        ic r0 = r5.a;
        int r6 = r3 - r5.d;
        return r0.d.g(r6) + r5.f;
    }

    public final o04 e(int r4) {
        fd r3 = this.b;
        he r0 = (he) ((bq4) r3.c).n;
        if (r4 >= 0) goto L5;
    L7:
        dz1.a("offset(" + r4 + ") is out of bounds [0, " + r0.o.length() + "]");
    L8:
        int r1 = ((he) ((bq4) r3.c).n).o.length();
        ArrayList r5 = (ArrayList) r3.e;
        if (r4 != r1) goto L11;
        int r2 = gb.E(r5);
    L12:
        od3 r6 = (od3) r5.get(r2);
        ic r7 = r6.a;
        int r8 = r6.a(r4);
        ks4 r9 = r7.d;
        if (r9.e.getParagraphDirection(r9.f(r8)) != 1) goto L17;
        return o04.n;
    L17:
        return o04.o;
    L11:
        r2 = rr2.C(r5, r4);
        goto L12
    L5:
        if (r4 > r0.o.length()) goto L7;
        goto L7
    }

    public final boolean equals(Object r7) {
        if (this != r7) goto L5;
        return true;
    L5:
        if ((r7 instanceof ms4) == false) goto L25;
        ms4 r8 = (ms4) r7;
        ls4 r0 = r8.a;
        if (h12.c(this.a, r0) == false) goto L25;
        if (this.b == r8.b) goto L14;
        return false;
    L14:
        if (n02.a(this.c, r8.c) == false) goto L25;
        if (this.d != r8.d) goto L25;
        if (this.e != r8.e) goto L25;
        if (h12.c(this.f, r8.f) == false) goto L25;
        return true;
    L25:
        return false;
    }

    public final int hashCode() {
        int r0 = this.a.hashCode() * 31;
        int r1 = b11.d(b11.d(xa3.b((this.b.hashCode() + r0) * 31, 31, this.c), this.d, 31), this.e, 31);
        return this.f.hashCode() + r1;
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.a + ", multiParagraph=" + this.b + ", size=" + n02.b(this.c) + ", firstBaseline=" + this.d + ", lastBaseline=" + this.e + ", placeholderRects=" + this.f + ")";
    }
}
