package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u1 implements qz2 {
    public transient Collection n;
    public transient Set o;
    public transient Collection p;
    public transient Map q;

    public u1() {
    }

    @Override // defpackage.qz2
    public Collection a() {
        Collection r0 = this.n;
        if (r0 != null) goto L6;
        Collection r1 = f();
        this.n = r1;
        return r1;
    L6:
        return r0;
    }

    @Override // defpackage.qz2
    public Map b() {
        Map r0 = this.q;
        if (r0 != null) goto L6;
        Map r1 = e();
        this.q = r1;
        return r1;
    L6:
        return r0;
    }

    public final boolean c(Object r1, Object r2) {
        Collection r0 = (Collection) b().get(r1);
        if (r0 != null) goto L5;
        return false;
    L5:
        if (r0.contains(r2) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public boolean d(Object r2) {
        Iterator r1 = b().values().iterator();
    L4:
        if (r1.hasNext() == false) goto L9;
        if (((Collection) r1.next()).contains(r2) == false) goto L4;
        return true;
    L9:
        return false;
    }

    public abstract Map e();

    public boolean equals(Object r2) {
        if (r2 != this) goto L6;
        return true;
    L6:
        if ((r2 instanceof qz2) == true) goto L8;
        return false;
    L8:
        return b().equals(((qz2) r2).b());
    }

    public abstract Collection f();

    public abstract Set g();

    public abstract Iterator h();

    public final int hashCode() {
        return b().hashCode();
    }

    @Override // defpackage.qz2
    public Set keySet() {
        Set r0 = this.o;
        if (r0 != null) goto L6;
        Set r1 = g();
        this.o = r1;
        return r1;
    L6:
        return r0;
    }

    @Override // defpackage.qz2
    public boolean remove(Object r1, Object r2) {
        Collection r0 = (Collection) b().get(r1);
        if (r0 != null) goto L5;
        return false;
    L5:
        if (r0.remove(r2) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public final String toString() {
        return b().toString();
    }
}
