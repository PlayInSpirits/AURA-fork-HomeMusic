package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ug1 implements gf1 {
    public final /* synthetic */ vg1 n;

    public ug1(vg1 r1) {
        this.n = r1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [i42, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v3, types: [q03] */
    /* JADX WARN: Type inference failed for: r9v2, types: [q03] */
    @Override // defpackage.gf1
    public final Object invoke() {
        ArrayList r11 = this.n.a;
        w03 r1 = new w03(r11.size());
        int r0 = r11.size();
        int r3 = 0;
    L3:
        if (r3 >= r0) goto L26;
        ?? r4 = (i42) r11.get(r3);
        Object r5 = r4.b;
        int r6 = r4.a;
        if (r5 == null) goto L7;
        Object r7 = new b32(Integer.valueOf(r6), r4.b);
    L8:
        int r8 = r1.f(r7);
        if (r8 >= 0) goto L11;
        boolean r9 = true;
    L12:
        if (r9 == false) goto L14;
        Object r10 = null;
    L15:
        if (r10 != null) goto L18;
    L21:
        if (r9 == false) goto L23;
        int r12 = ~r8;
        r1.b[r12] = r7;
        r1.c[r12] = r4;
    L24:
        r3 = r3 + 1;
        goto L3
    L23:
        r1.c[r8] = r4;
        goto L24
    L18:
        if ((r10 instanceof q03) == false) goto L20;
        ?? r13 = (q03) r10;
        r13.a(r4);
        r4 = r13;
        goto L21
    L20:
        Object[] r14 = t73.a;
        ?? r15 = new q03(2);
        r15.a(r10);
        r15.a(r4);
        r4 = r15;
        goto L21
    L14:
        r10 = r1.c[r8];
        goto L15
    L11:
        r9 = false;
        goto L12
    L7:
        r7 = Integer.valueOf(r6);
        goto L8
    L26:
        return new mz2(r1);
    }
}
