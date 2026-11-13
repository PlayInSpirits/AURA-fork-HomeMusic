package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class n60 extends AbstractSet {
    public final /* synthetic */ int n;
    public final /* synthetic */ Map o;

    public /* synthetic */ n60(Map map, int i) {
        this.n = i;
        this.o = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        int i = this.n;
        Map map = this.o;
        switch (i) {
            case 0:
                ((p60) map).clear();
                break;
            case 1:
                ((p60) map).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        int i = this.n;
        Map map = this.o;
        switch (i) {
            case 0:
                p60 p60Var = (p60) map;
                Map c = p60Var.c();
                if (c != null) {
                    return c.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int e = p60Var.e(entry.getKey());
                    if (e != -1 && si0.s(p60Var.k()[e], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            case 1:
                return ((p60) map).containsKey(obj);
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.n;
        Map map = this.o;
        switch (i) {
            case 0:
                p60 p60Var = (p60) map;
                Map c = p60Var.c();
                return c != null ? c.entrySet().iterator() : new m60(p60Var, 1);
            case 1:
                p60 p60Var2 = (p60) map;
                Map c2 = p60Var2.c();
                return c2 != null ? c2.keySet().iterator() : new m60(p60Var2, 0);
            default:
                return new mi((oi) map);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int i = this.n;
        Map map = this.o;
        switch (i) {
            case 0:
                p60 p60Var = (p60) map;
                Map c = p60Var.c();
                if (c != null) {
                    return c.entrySet().remove(obj);
                }
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (p60Var.g()) {
                    return false;
                }
                int d = p60Var.d();
                Object key = entry.getKey();
                Object value = entry.getValue();
                Object obj2 = p60Var.n;
                Objects.requireNonNull(obj2);
                int A = bu.A(key, value, d, obj2, p60Var.i(), p60Var.j(), p60Var.k());
                if (A == -1) {
                    return false;
                }
                p60Var.f(A, d);
                p60Var.s--;
                p60Var.r += 32;
                return true;
            case 1:
                p60 p60Var2 = (p60) map;
                Map c2 = p60Var2.c();
                return c2 != null ? c2.keySet().remove(obj) : p60Var2.h(obj) != p60.w;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.n;
        Map map = this.o;
        switch (i) {
            case 0:
                return ((p60) map).size();
            case 1:
                return ((p60) map).size();
            default:
                return ((oi) map).p;
        }
    }
}
