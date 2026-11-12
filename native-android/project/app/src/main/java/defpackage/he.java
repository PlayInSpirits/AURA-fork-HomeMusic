package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class he implements CharSequence {
    public final List n;
    public final String o;
    public final ArrayList p;
    public final ArrayList q;

    static {
        xc5 r0 = s54.a;
    }

    public he(List r8, String r9) {
        this.n = r8;
        this.o = r9;
        if (r8 == null) goto L17;
        int r0 = r8.size();
        int r1 = 0;
        ArrayList r2 = null;
        ArrayList r3 = null;
    L5:
        if (r1 >= r0) goto L18;
        ge r4 = (ge) r8.get(r1);
        Object r5 = r4.a;
        if ((r5 instanceof ij4) == false) goto L12;
        if (r2 != null) goto L10;
        r2 = new ArrayList();
    L10:
        r2.add(r4);
    L16:
        r1 = r1 + 1;
        goto L5
    L12:
        if ((r5 instanceof sd3) == false) goto L16;
        if (r3 != null) goto L15;
        r3 = new ArrayList();
    L15:
        r3.add(r4);
    L18:
        this.p = r2;
        this.q = r3;
        if (r3 == null) goto L21;
        List r7 = q40.K0(r3, new ca1(10));
    L22:
        if (r7 != null) goto L24;
        return;
    L24:
        if (r7.isEmpty() == true) goto L53;
        int r10 = ((ge) q40.w0(r7)).c;
        h03 r6 = c02.a;
        int r11 = 1;
        h03 r12 = new h03(1);
        r12.a(r10);
        int r13 = r7.size();
    L27:
        if (r11 >= r13) goto L54;
        ge r14 = (ge) r7.get(r11);
    L29:
        int r15 = r12.b;
        if (r15 == 0) goto L41;
        if (r15 == 0) goto L39;
        int r16 = r12.a[r15 - 1];
        if (r14.b < r16) goto L35;
        r12.c(r15 - 1);
        goto L29
    L35:
        int r17 = r14.c;
        if (r17 <= r16) goto L41;
        dz1.a("Paragraph overlap not allowed, end " + r17 + " should be less than or equal to " + r16);
        goto L41
    L39:
        kf2.m("IntList is empty.");
        throw null;
    L41:
        r12.a(r14.c);
        r11 = r11 + 1;
        goto L27
    L54:
        return;
    L53:
        return;
    L21:
        r7 = null;
        goto L22
    L17:
        r2 = null;
        r3 = null;
        goto L18
    }

    @Override // java.lang.CharSequence
    public final char charAt(int r1) {
        return this.o.charAt(r1);
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof he) == true) goto L8;
        return false;
    L8:
        he r6 = (he) r5;
        String r1 = r6.o;
        if (h12.c(this.o, r1) == true) goto L12;
        return false;
    L12:
        if (h12.c(this.n, r6.n) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public final int hashCode() {
        int r0 = this.o.hashCode() * 31;
        List r1 = this.n;
        if (r1 == null) goto L5;
        int r2 = r1.hashCode();
    L7:
        return r0 + r2;
    L5:
        r2 = 0;
        goto L7
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.o.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int r10, int r11) {
        if (r10 <= r11) goto L6;
        dz1.a("start (" + r10 + ") should be less or equal to end (" + r11 + ")");
    L6:
        String r2 = this.o;
        if (r10 == 0) goto L9;
    L11:
        String r3 = r2.substring(r10, r11);
        int r4 = ie.a;
        if (r10 <= r11) goto L15;
        dz1.a("start (" + r10 + ") should be less than or equal to end (" + r11 + ")");
    L15:
        List r9 = this.n;
        if (r9 == null) goto L26;
        ArrayList r0 = new ArrayList(r9.size());
        int r1 = r9.size();
        int r5 = 0;
    L19:
        if (r5 >= r1) goto L25;
        ge r6 = (ge) r9.get(r5);
        int r7 = r6.b;
        int r8 = r6.c;
        if (ie.a(r10, r11, r7, r8) == false) goto L23;
        r0.add(new ge(Math.max(r10, r6.b) - r10, Math.min(r11, r8) - r10, r6.a, r6.d));
    L23:
        r5 = r5 + 1;
        goto L19
    L25:
        if (r0.isEmpty() == true) goto L26;
    L28:
        return new he(r0, r3);
    L26:
        r0 = null;
        goto L28
    L9:
        if (r11 != r2.length()) goto L11;
        return this;
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.o;
    }

    public /* synthetic */ he(String r2) {
        this(r2, u01.n);
    }

    public he(String r2, List r3) {
        if (r3.isEmpty() == false) goto L5;
        r3 = null;
    L5:
        this(r3, r2);
    }
}
