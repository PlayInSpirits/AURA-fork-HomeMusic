package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m91 implements Iterable {
    public final bb3 n;

    public m91(Iterable r2) {
        r2.getClass();
        this.n = new zp3(r2);
    }

    public final String toString() {
        Iterator r3 = ((Iterable) this.n.b(this)).iterator();
        StringBuilder r0 = new StringBuilder("[");
        boolean r1 = true;
    L4:
        if (r3.hasNext() == false) goto L8;
        if (r1 == true) goto L7;
        r0.append(", ");
    L7:
        r0.append(r3.next());
        r1 = false;
        goto L4
    L8:
        r0.append(']');
        return r0.toString();
    }

    public m91() {
        this.n = l.n;
    }
}
