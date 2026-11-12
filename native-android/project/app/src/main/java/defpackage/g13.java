package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g13 {
    public static final void a(List r0, int r1) {
        int r2 = r0.size();
        if (r1 < 0) goto L7;
        if (r1 >= r2) goto L7;
        return;
    L7:
        c(r1, r2);
    }

    public static final void b(int r0, int r1, List r2) {
        if (r0 <= r1) goto L4;
        f(r0, r1);
    L4:
        if (r0 >= 0) goto L7;
        d(r0);
    L7:
        if (r1 <= r2.size()) goto L10;
        e(r1, r2.size());
        return;
    }

    private static final void c(int r4, int r5) {
        throw new IndexOutOfBoundsException(b11.n("Index ", " is out of bounds. The list has ", r4, r5, " elements."));
    }

    private static final void d(int r3) {
        throw new IndexOutOfBoundsException(b11.j(r3, "fromIndex (", ") is less than 0."));
    }

    private static final void e(int r4, int r5) {
        throw new IndexOutOfBoundsException(b11.n("toIndex (", ") is more than than the list size (", r4, r5, ")"));
    }

    private static final void f(int r4, int r5) {
        throw new IllegalArgumentException(b11.n("Indices are out of order. fromIndex (", ") is greater than toIndex (", r4, r5, ")."));
    }
}
