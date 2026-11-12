package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class og4 extends y1 {
    public static final og4 o = null;
    public final Object[] n;

    static {
        o = new og4(new Object[0]);
    }

    public og4(Object[] r1) {
        this.n = r1;
    }

    @Override // defpackage.y
    public final int a() {
        return this.n.length;
    }

    @Override // defpackage.y1
    public final y1 b(int r6, Object r7) {
        Object[] r0 = this.n;
        uo.i(r6, r0.length);
        if (r6 != r0.length) goto L7;
        return d(r7);
    L7:
        if (r0.length >= 32) goto L10;
        Object[] r5 = new Object[r0.length + 1];
        ti.c0(0, r6, 6, r0, r5);
        ti.Z(r6 + 1, r6, r0.length, r0, r5);
        r5[r6] = r7;
        return new og4(r5);
    L10:
        Object[] r8 = Arrays.copyOf(r0, r0.length);
        ti.Z(r6 + 1, r6, r0.length - 1, r0, r8);
        r8[r6] = r7;
        Object[] r9 = new Object[32];
        r9[0] = r0[31];
        return new wf3(r8, r9, r0.length + 1, 0);
    }

    @Override // defpackage.y1
    public final y1 d(Object r4) {
        Object[] r3 = this.n;
        if (r3.length >= 32) goto L6;
        Object[] r0 = Arrays.copyOf(r3, r3.length + 1);
        r0[r3.length] = r4;
        return new og4(r0);
    L6:
        Object[] r1 = new Object[32];
        r1[0] = r4;
        return new wf3(r3, r1, r3.length + 1, 0);
    }

    @Override // defpackage.y1
    public final y1 e(Collection r4) {
        Object[] r0 = this.n;
        int r1 = r0.length;
        if ((r4.size() + r1) > 32) goto L10;
        int r3 = r0.length;
        Object[] r5 = Arrays.copyOf(r0, r4.size() + r3);
        int r2 = r0.length;
        Iterator r6 = r4.iterator();
    L6:
        if (r6.hasNext() == false) goto L9;
        r5[r2] = r6.next();
        r2 = r2 + 1;
        goto L6
    L9:
        return new og4(r5);
    L10:
        xf3 r7 = f();
        r7.addAll(r4);
        return r7.d();
    }

    @Override // defpackage.y1
    public final xf3 f() {
        return new xf3(this, null, this.n, 0);
    }

    @Override // defpackage.y1
    public final y1 g(x1 r10) {
        Object[] r0 = this.n;
        int r1 = r0.length;
        int r2 = r0.length;
        Object[] r6 = r0;
        int r4 = 0;
        boolean r5 = false;
    L3:
        if (r4 >= r2) goto L12;
        Object r7 = r0[r4];
        if (((Boolean) r10.invoke(r7)).booleanValue() == false) goto L8;
        if (r5 == true) goto L10;
        r6 = Arrays.copyOf(r0, r0.length);
        r5 = true;
        r1 = r4;
    L10:
        r4 = r4 + 1;
        goto L3
    L8:
        if (r5 == false) goto L10;
        r6[r1] = r7;
        r1 = r1 + 1;
        goto L10
    L12:
        if (r1 != r0.length) goto L14;
        return this;
    L14:
        if (r1 != 0) goto L18;
        return o;
    L18:
        return new og4(ti.e0(r6, 0, r1));
    }

    @Override // java.util.List
    public final Object get(int r2) {
        Object[] r1 = this.n;
        uo.e(r2, r1.length);
        return r1[r2];
    }

    @Override // defpackage.y1
    public final y1 h(int r4) {
        Object[] r3 = this.n;
        uo.e(r4, r3.length);
        if (r3.length == 1) goto L5;
        Object[] r0 = Arrays.copyOf(r3, r3.length - 1);
        ti.Z(r4, r4 + 1, r3.length, r3, r0);
        return new og4(r0);
    L5:
        return o;
    }

    @Override // defpackage.y1
    public final y1 i(int r2, Object r3) {
        Object[] r1 = this.n;
        uo.e(r2, r1.length);
        Object[] r4 = Arrays.copyOf(r1, r1.length);
        r4[r2] = r3;
        return new og4(r4);
    }

    @Override // defpackage.a1, java.util.List
    public final int indexOf(Object r1) {
        return ti.m0(this.n, r1);
    }

    @Override // defpackage.a1, java.util.List
    public final int lastIndexOf(Object r5) {
        Object[] r4 = this.n;
        if (r5 != null) goto L12;
        int r6 = r4.length - 1;
        if (r6 < 0) goto L20;
    L6:
        int r1 = r6 - 1;
        if (r4[r6] == null) goto L8;
        if (r1 < 0) goto L20;
        r6 = r1;
        goto L6
    L8:
        return r6;
    L20:
        return -1;
    L12:
        int r2 = r4.length - 1;
        if (r2 < 0) goto L20;
    L14:
        int r3 = r2 - 1;
        if (r5.equals(r4[r2]) == true) goto L16;
        if (r3 < 0) goto L20;
        r2 = r3;
        goto L14
    L16:
        return r2;
    }

    @Override // defpackage.a1, java.util.List
    public final ListIterator listIterator(int r3) {
        Object[] r2 = this.n;
        uo.i(r3, r2.length);
        return new vv(r2, r3, r2.length);
    }
}
