package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class m91 implements Iterable {
    public final bb3 n;

    public m91(Iterable iterable) {
        iterable.getClass();
        this.n = new zp3(iterable);
    }

    public final String toString() {
        Iterator it = ((Iterable) this.n.b(this)).iterator();
        StringBuilder sb = new StringBuilder("[");
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(it.next());
            z = false;
        }
        sb.append(']');
        return sb.toString();
    }

    public m91() {
        this.n = l.n;
    }
}
