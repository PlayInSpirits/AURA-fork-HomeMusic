package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class i44 implements Iterable {
    public f44 n;
    public f44 o;
    public final WeakHashMap p;
    public int q;

    public i44() {
        this.p = new WeakHashMap();
        this.q = 0;
    }

    public final Object a(Object r3, Object r4) {
        f44 r0 = this.n;
    L3:
        if (r0 == null) goto L8;
        if (r0.n.equals(r3) == true) goto L8;
        r0 = r0.p;
    L8:
        if (r0 != null) goto L10;
        f44 r1 = new f44(r3, r4);
        this.q++;
        f44 r5 = this.o;
        if (r5 != null) goto L14;
        this.n = r1;
        this.o = r1;
        return null;
    L14:
        r5.p = r1;
        r1.q = r5;
        this.o = r1;
        return null;
    L10:
        return r0.o;
    }

    public final Object b(Object r4) {
        f44 r0 = this.n;
    L3:
        if (r0 == null) goto L9;
        if (r0.n.equals(r4) == true) goto L9;
        r0 = r0.p;
    L9:
        if (r0 != null) goto L11;
        return null;
    L11:
        this.q--;
        WeakHashMap r1 = this.p;
        if (r1.isEmpty() == true) goto L17;
        Iterator r2 = r1.keySet().iterator();
    L15:
        if (r2.hasNext() == false) goto L17;
        ((h44) r2.next()).a(r0);
    L17:
        f44 r3 = r0.q;
        f44 r5 = r0.p;
        if (r3 == null) goto L20;
        r3.p = r5;
    L21:
        f44 r6 = r0.p;
        if (r6 == null) goto L24;
        r6.q = r3;
    L25:
        r0.p = null;
        r0.q = null;
        return r0.o;
    L24:
        this.o = r3;
        goto L25
    L20:
        this.n = r5;
        goto L21
    }

    public final boolean equals(Object r6) {
        if (r6 != this) goto L6;
        return true;
    L6:
        if ((r6 instanceof i44) == true) goto L8;
        return false;
    L8:
        i44 r7 = (i44) r6;
        if (this.q == r7.q) goto L11;
        return false;
    L11:
        Iterator r5 = iterator();
        Iterator r8 = r7.iterator();
    L12:
        e44 r1 = (e44) r5;
        if (r1.hasNext() == false) goto L24;
        e44 r3 = (e44) r8;
        if (r3.hasNext() == false) goto L24;
        Map.Entry r2 = (Map.Entry) r1.next();
        Object r4 = r3.next();
        if (r2 != null) goto L19;
        if (r4 == null) goto L19;
    L22:
        return false;
    L19:
        if (r2 == null) goto L12;
        if (r2.equals(r4) == true) goto L12;
    L24:
        if (r1.hasNext() == false) goto L26;
    L28:
        return false;
    L26:
        if (((e44) r8).hasNext() == true) goto L28;
        return true;
    }

    public final int hashCode() {
        Iterator r3 = iterator();
        int r0 = 0;
    L3:
        e44 r1 = (e44) r3;
        if (r1.hasNext() == false) goto L6;
        r0 = r0 + ((Map.Entry) r1.next()).hashCode();
        goto L3
    L6:
        return r0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        f44 r1 = this.n;
        f44 r2 = this.o;
        e44 r0 = new e44();
        r0.n = r2;
        r0.o = r1;
        this.p.put(r0, Boolean.FALSE);
        return r0;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("[");
        Iterator r3 = iterator();
    L3:
        e44 r1 = (e44) r3;
        if (r1.hasNext() == false) goto L8;
        r0.append(((Map.Entry) r1.next()).toString());
        if (r1.hasNext() == false) goto L3;
        r0.append(", ");
        goto L3
    L8:
        r0.append("]");
        return r0.toString();
    }
}
