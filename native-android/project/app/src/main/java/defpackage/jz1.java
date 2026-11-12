package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jz1 {
    public final /* synthetic */ int a;
    public final rp1 b;
    public final rp1 c;
    public final rp1 d;
    public final rp1 e;
    public final Serializable f;

    /* JADX WARN: Multi-variable type inference failed */
    public jz1(jz1[] r6) {
        final int r0 = 0;
        this.a = 0;
        this.f = r6;
        int r7 = r6.length;
        final rp1[] r1 = new rp1[r7];
        int r2 = 0;
    L3:
        if (r2 >= r7) goto L5;
        r1[r2] = ((jz1[]) this.f)[r2].b();
        r2 = r2 + 1;
        goto L3
    L5:
        final int r3 = 1;
        this.b = new rp1(1, new v45(r1, r3));
        int r8 = ((jz1[]) this.f).length;
        final rp1[] r4 = new rp1[r8];
        int r5 = 0;
    L6:
        if (r5 >= r8) goto L8;
        r4[r5] = ((jz1[]) this.f)[r5].d();
        r5 = r5 + 1;
        goto L6
    L8:
        this.c = new rp1(0, new qp1(r4, r3));
        int r9 = ((jz1[]) this.f).length;
        final rp1[] r10 = new rp1[r9];
        int r11 = 0;
    L9:
        if (r11 >= r9) goto L11;
        r10[r11] = ((jz1[]) this.f)[r11].c();
        r11 = r11 + 1;
        goto L9
    L11:
        this.d = new rp1(1, new v45(r10, r0));
        int r12 = ((jz1[]) this.f).length;
        final rp1[] r13 = new rp1[r12];
        int r14 = 0;
    L12:
        if (r14 >= r12) goto L14;
        r13[r14] = ((jz1[]) this.f)[r14].a();
        r14 = r14 + 1;
        goto L12
    L14:
        this.e = new rp1(0, new qp1(r13, r0));
    }

    public final rp1 a() {
        int r0 = this.a;
        return this.e;
    }

    public final rp1 b() {
        int r0 = this.a;
        return this.b;
    }

    public final rp1 c() {
        int r0 = this.a;
        return this.d;
    }

    public final rp1 d() {
        int r0 = this.a;
        return this.c;
    }

    public final String toString() {
        int r0 = this.a;
        Object r2 = this.f;
        switch(r0) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return xa3.h("RectRulers(", (String) r2, ")");
    L7:
        return ti.n0(57, (jz1[]) r2);
    }

    public jz1(String r4) {
        this.a = 1;
        this.f = r4;
        this.b = new rp1(1, null);
        this.c = new rp1(0, null);
        this.d = new rp1(1, null);
        this.e = new rp1(0, null);
    }
}
