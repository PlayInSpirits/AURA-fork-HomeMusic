package defpackage;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v40 extends u40 {
    public static void n0(Iterable r1, AbstractCollection r2) {
        r2.getClass();
        r1.getClass();
        if ((r1 instanceof Collection) == false) goto L6;
        r2.addAll((Collection) r1);
        return;
    L6:
        Iterator r3 = r1.iterator();
    L8:
        if (r3.hasNext() == false) goto L10;
        r2.add(r3.next());
        goto L8
    }

    public static final boolean o0(Iterable r2, if1 r3, boolean r4) {
        Iterator r5 = r2.iterator();
        boolean r0 = false;
    L4:
        if (r5.hasNext() == false) goto L8;
        if (((Boolean) r3.invoke(r5.next())).booleanValue() != r4) goto L4;
        r5.remove();
        r0 = true;
        goto L4
    L8:
        return r0;
    }

    public static boolean p0(List r7, if1 r8) {
        r7.getClass();
        if ((r7 instanceof RandomAccess) == false) goto L5;
        int r0 = r7.size() - 1;
        if (r0 < 0) goto L24;
        int r3 = 0;
        int r4 = 0;
    L16:
        Object r5 = r7.get(r3);
        if (((Boolean) r8.invoke(r5)).booleanValue() == true) goto L22;
        if (r4 == r3) goto L21;
        r7.set(r4, r5);
    L21:
        r4 = r4 + 1;
    L22:
        if (r3 == r0) goto L26;
        r3 = r3 + 1;
    L26:
        if (r4 >= r7.size()) goto L33;
        int r9 = r7.size() - 1;
        if (r4 > r9) goto L32;
    L29:
        r7.remove(r9);
        if (r9 == r4) goto L32;
        r9 = r9 - 1;
    L32:
        return true;
    L33:
        return false;
    L24:
        r4 = 0;
        goto L26
    L5:
        if ((r7 instanceof x32) == false) goto L12;
        if ((r7 instanceof y32) == true) goto L12;
        jz4.M(r7, "kotlin.collections.MutableIterable");
        throw null;
    L12:
        return o0(r7, r8, true);
    }

    public static Object q0(List r1) {
        r1.getClass();
        if (r1.isEmpty() == false) goto L5;
        kf2.m("List is empty.");
        return null;
    L5:
        return r1.remove(r1.size() - 1);
    }

    public static Object r0(AbstractList r1) {
        r1.getClass();
        if (r1.isEmpty() == false) goto L7;
        return null;
    L7:
        return r1.remove(r1.size() - 1);
    }
}
