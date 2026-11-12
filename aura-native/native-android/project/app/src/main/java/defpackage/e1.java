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
    public final /* synthetic */ int n = 3;
    public final Iterator o;
    public Object p;
    public final Object q;

    public e1(m1 m1Var) {
        this.q = m1Var;
        Collection collection = m1Var.o;
        this.p = collection;
        this.o = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public boolean a() {
        Iterator it = this.o;
        while (this.p == null) {
            try {
                if (!it.hasNext()) {
                    return false;
                }
                this.p = it.next();
            } catch (ServiceConfigurationError e) {
                if (!(e.getCause() instanceof SecurityException)) {
                    throw e;
                }
            }
        }
        return true;
    }

    public void b() {
        m1 m1Var = (m1) this.q;
        m1Var.b();
        if (m1Var.o == ((Collection) this.p)) {
            return;
        }
        kf2.c();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.n) {
            case 0:
                return this.o.hasNext();
            case 1:
                return this.o.hasNext();
            case 2:
                b();
                return this.o.hasNext();
            default:
                return a();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.n;
        Object obj = this.q;
        Iterator it = this.o;
        switch (i) {
            case 0:
                Map.Entry entry = (Map.Entry) it.next();
                this.p = (Collection) entry.getValue();
                return ((f1) obj).a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) it.next();
                this.p = entry2;
                return entry2.getKey();
            case 2:
                b();
                return it.next();
            default:
                if (!a()) {
                    kf2.m("No more elements for service ".concat(((Class) obj).getName()));
                    return null;
                }
                Object obj2 = this.p;
                this.p = null;
                return obj2;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.n;
        Iterator it = this.o;
        Object obj = this.q;
        switch (i) {
            case 0:
                rr2.v("no calls to next() since the last call to remove()", ((Collection) this.p) != null);
                it.remove();
                ((f1) obj).q.s -= ((Collection) this.p).size();
                ((Collection) this.p).clear();
                this.p = null;
                return;
            case 1:
                rr2.v("no calls to next() since the last call to remove()", ((Map.Entry) this.p) != null);
                Collection collection = (Collection) ((Map.Entry) this.p).getValue();
                it.remove();
                ((g1) obj).o.s -= collection.size();
                collection.clear();
                this.p = null;
                return;
            case 2:
                it.remove();
                m1 m1Var = (m1) obj;
                m1Var.r.s--;
                m1Var.d();
                return;
            default:
                throw new UnsupportedOperationException("service=".concat(((Class) obj).getName()));
        }
    }

    public e1() {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        this.q = k90.class;
        this.o = ServiceLoader.load(k90.class, systemClassLoader).iterator();
        this.p = null;
    }

    public e1(o1 o1Var, ListIterator listIterator) {
        this.q = o1Var;
        this.p = o1Var.o;
        this.o = listIterator;
    }

    public e1(g1 g1Var, Iterator it) {
        this.o = it;
        this.q = g1Var;
    }

    public e1(f1 f1Var) {
        this.q = f1Var;
        this.o = f1Var.p.entrySet().iterator();
    }
}
