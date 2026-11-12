package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tl1 implements Iterable, x32 {
    public final String[] n;

    public tl1(String[] r1) {
        r1.getClass();
        this.n = r1;
    }

    public final String a(String r4) {
        String[] r3 = this.n;
        r3.getClass();
        int r0 = r3.length - 2;
        int r1 = q05.n(r0, 0, -2);
        if (r1 <= r0) goto L5;
        return null;
    L5:
        if (r4.equalsIgnoreCase(r3[r0]) == true) goto L7;
        if (r0 == r1) goto L14;
        r0 = r0 - 2;
        goto L5
    L14:
        return null;
    L7:
        return r3[r0 + 1];
    }

    public final String b(int r3) {
        String r2 = (String) ti.k0(r3 * 2, this.n);
        if (r2 == null) goto L6;
        return r2;
    L6:
        throw new IndexOutOfBoundsException("name[" + r3 + ']');
    }

    public final sl1 d() {
        sl1 r0 = new sl1();
        ArrayList r1 = r0.a;
        r1.getClass();
        String[] r2 = this.n;
        r2.getClass();
        List r3 = Arrays.asList(r2);
        r3.getClass();
        r1.addAll(r3);
        return r0;
    }

    public final String e(int r3) {
        String r2 = (String) ti.k0((r3 * 2) + 1, this.n);
        if (r2 == null) goto L6;
        return r2;
    L6:
        throw new IndexOutOfBoundsException("value[" + r3 + ']');
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof tl1) == false) goto L8;
        String[] r3 = ((tl1) r2).n;
        if (Arrays.equals(this.n, r3) == false) goto L10;
        return true;
    L10:
        return false;
    L8:
        return false;
    }

    public final List f(String r6) {
        r6.getClass();
        int r0 = size();
        List r1 = null;
        int r2 = 0;
        ArrayList r3 = null;
    L3:
        if (r2 >= r0) goto L10;
        if (r6.equalsIgnoreCase(b(r2)) == false) goto L9;
        if (r3 != null) goto L8;
        r3 = new ArrayList(2);
    L8:
        r3.add(e(r2));
    L9:
        r2 = r2 + 1;
        goto L3
    L10:
        if (r3 == null) goto L12;
        r1 = q40.Q0(r3);
    L12:
        if (r1 == null) goto L14;
        return r1;
    L14:
        return u01.n;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.n);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int r0 = size();
        kd3[] r1 = new kd3[r0];
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L6;
        r1[r2] = new kd3(b(r2), e(r2));
        r2 = r2 + 1;
        goto L3
    L6:
        return new x0(r1);
    }

    public final int size() {
        return this.n.length / 2;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        int r1 = size();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L9;
        String r3 = b(r2);
        String r4 = e(r2);
        r0.append(r3);
        r0.append(": ");
        if (xe5.l(r3) == false) goto L7;
        r4 = "██";
    L7:
        r0.append(r4);
        r0.append("\n");
        r2 = r2 + 1;
        goto L3
    L9:
        return r0.toString();
    }
}
