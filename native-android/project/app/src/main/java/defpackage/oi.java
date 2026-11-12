package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class oi extends yd4 implements Map {
    public n60 q;
    public li r;
    public ni s;

    public oi(oi r2) {
        super(0);
        g(r2);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        n60 r0 = this.q;
        if (r0 != null) goto L6;
        n60 r1 = new n60(this, 2);
        this.q = r1;
        return r1;
    L6:
        return r0;
    }

    public final boolean k(Collection r2) {
        Iterator r3 = r2.iterator();
    L4:
        if (r3.hasNext() == false) goto L9;
        if (super.containsKey(r3.next()) == true) goto L4;
        return false;
    L9:
        return true;
    }

    @Override // java.util.Map
    public final Set keySet() {
        li r0 = this.r;
        if (r0 != null) goto L6;
        li r1 = new li(this);
        this.r = r1;
        return r1;
    L6:
        return r0;
    }

    public final boolean l(Collection r3) {
        int r0 = this.p;
        Iterator r4 = r3.iterator();
    L4:
        if (r4.hasNext() == false) goto L7;
        super.remove(r4.next());
        goto L4
    L7:
        if (r0 == this.p) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // java.util.Map
    public final void putAll(Map r3) {
        int r0 = this.p;
        b(r3.size() + r0);
        Iterator r4 = r3.entrySet().iterator();
    L4:
        if (r4.hasNext() == false) goto L6;
        Map.Entry r1 = (Map.Entry) r4.next();
        put(r1.getKey(), r1.getValue());
        goto L4
    }

    @Override // java.util.Map
    public final Collection values() {
        ni r0 = this.s;
        if (r0 != null) goto L6;
        ni r1 = new ni(this);
        this.s = r1;
        return r1;
    L6:
        return r0;
    }
}
