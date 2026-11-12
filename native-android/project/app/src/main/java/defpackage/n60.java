package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
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
                Map mapC = p60Var.c();
                if (mapC != null) {
                    return mapC.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int iE = p60Var.e(entry.getKey());
                    if (iE != -1 && si0.s(p60Var.k()[iE], entry.getValue())) {
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
                Map mapC = p60Var.c();
                return mapC != null ? mapC.entrySet().iterator() : new m60(p60Var, 1);
            case 1:
                p60 p60Var2 = (p60) map;
                Map mapC2 = p60Var2.c();
                return mapC2 != null ? mapC2.keySet().iterator() : new m60(p60Var2, 0);
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
                Map mapC = p60Var.c();
                if (mapC != null) {
                    return mapC.entrySet().remove(obj);
                }
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (p60Var.g()) {
                    return false;
                }
                int iD = p60Var.d();
                Object key = entry.getKey();
                Object value = entry.getValue();
                Object obj2 = p60Var.n;
                Objects.requireNonNull(obj2);
                int iA = bu.A(key, value, iD, obj2, p60Var.i(), p60Var.j(), p60Var.k());
                if (iA == -1) {
                    return false;
                }
                p60Var.f(iA, iD);
                p60Var.s--;
                p60Var.r += 32;
                return true;
            case 1:
                p60 p60Var2 = (p60) map;
                Map mapC2 = p60Var2.c();
                if (mapC2 != null) {
                    return mapC2.keySet().remove(obj);
                }
                return p60Var2.h(obj) != p60.w;
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
