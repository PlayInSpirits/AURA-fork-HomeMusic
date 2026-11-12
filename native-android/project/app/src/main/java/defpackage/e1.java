package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class e1 implements Iterator {
    public final /* synthetic */ int n;
    public final Iterator o;
    public Object p;
    public final Object q;

    public e1(m1 r2) {
        this.n = 2;
        this.q = r2;
        Collection r3 = r2.o;
        this.p = r3;
        if ((r3 instanceof List) == false) goto L5;
        Iterator r4 = ((List) r3).listIterator();
    L6:
        this.o = r4;
        return;
    L5:
        r4 = r3.iterator();
        goto L6
    }

    public boolean a() {
        Iterator r0 = this.o;
    L4:
        if (this.p != null) goto L16;
    L11:
        e = move-exception;
        if ((e.getCause() instanceof SecurityException) == true) goto L4;
        throw e;
    L6:
        if (r0.hasNext() == false) goto L7;
        this.p = r0.next();     // Catch: ServiceConfigurationError -> L11
        goto L4
    L7:
        return false;
    L16:
        return true;
    }

    public void b() {
        m1 r0 = (m1) this.q;
        r0.b();
        if (r0.o != ((Collection) this.p)) goto L5;
        return;
    L5:
        kf2.c();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch(this.n) {
            case 0: goto L11;
            case 1: goto L9;
            case 2: goto L6;
            default: goto L5;
        };
    L6:
        b();
        return this.o.hasNext();
    L5:
        return a();
    L9:
        return this.o.hasNext();
    L11:
        return this.o.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int r0 = this.n;
        Object r1 = this.q;
        Iterator r2 = this.o;
        switch(r0) {
            case 0: goto L13;
            case 1: goto L11;
            case 2: goto L9;
            default: goto L5;
        };
    L9:
        b();
        return r2.next();
    L11:
        Map.Entry r3 = (Map.Entry) r2.next();
        this.p = r3;
        return r3.getKey();
    L13:
        Map.Entry r4 = (Map.Entry) r2.next();
        this.p = (Collection) r4.getValue();
        return ((f1) r1).a(r4);
    L5:
        if (a() == false) goto L7;
        Object r5 = this.p;
        this.p = null;
        return r5;
    L7:
        kf2.m("No more elements for service ".concat(((Class) r1).getName()));
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        int r0 = this.n;
        boolean r3 = false;
        Iterator r5 = this.o;
        Object r6 = this.q;
        switch(r0) {
            case 0: goto L14;
            case 1: goto L9;
            case 2: goto L6;
            default: goto L5;
        };
    L6:
        r5.remove();
        m1 r7 = (m1) r6;
        r7.r.s--;
        r7.d();
        return;
    L5:
        throw new UnsupportedOperationException("service=".concat(((Class) r6).getName()));
    L9:
        if (((Map.Entry) this.p) == null) goto L11;
        r3 = true;
    L11:
        rr2.v("no calls to next() since the last call to remove()", r3);
        Collection r1 = (Collection) ((Map.Entry) this.p).getValue();
        r5.remove();
        q1 r2 = ((g1) r6).o;
        r2.s -= r1.size();
        r1.clear();
        this.p = null;
        return;
    L14:
        if (((Collection) this.p) == null) goto L16;
        r3 = true;
    L16:
        rr2.v("no calls to next() since the last call to remove()", r3);
        r5.remove();
        q1 r4 = ((f1) r6).q;
        r4.s -= ((Collection) this.p).size();
        ((Collection) this.p).clear();
        this.p = null;
    }

    public e1() {
        this.n = 3;
        ClassLoader r0 = ClassLoader.getSystemClassLoader();
        this.q = k90.class;
        this.o = ServiceLoader.load(k90.class, r0).iterator();
        this.p = null;
    }

    public e1(o1 r2, ListIterator r3) {
        this.n = 2;
        this.q = r2;
        this.p = r2.o;
        this.o = r3;
    }

    public e1(g1 r2, Iterator r3) {
        this.n = 1;
        this.o = r3;
        this.q = r2;
    }

    public e1(f1 r2) {
        this.n = 0;
        this.q = r2;
        this.o = r2.p.entrySet().iterator();
    }
}
