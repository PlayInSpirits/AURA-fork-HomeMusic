package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class g13 {
    public static final void a(List list, int i) {
        int size = list.size();
        if (i < 0 || i >= size) {
            c(i, size);
        }
    }

    public static final void b(int i, int i2, List list) {
        if (i > i2) {
            f(i, i2);
        }
        if (i < 0) {
            d(i);
        }
        if (i2 > list.size()) {
            e(i2, list.size());
        }
    }

    private static final void c(int i, int i2) {
        throw new IndexOutOfBoundsException(b11.n("Index ", " is out of bounds. The list has ", i, i2, " elements."));
    }

    private static final void d(int i) {
        throw new IndexOutOfBoundsException(b11.j(i, "fromIndex (", ") is less than 0."));
    }

    private static final void e(int i, int i2) {
        throw new IndexOutOfBoundsException(b11.n("toIndex (", ") is more than than the list size (", i, i2, ")"));
    }

    private static final void f(int i, int i2) {
        throw new IllegalArgumentException(b11.n("Indices are out of order. fromIndex (", ") is greater than toIndex (", i, i2, ")."));
    }
}
