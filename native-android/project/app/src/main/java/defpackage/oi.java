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

    public oi(oi oiVar) {
        super(0);
        g(oiVar);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        n60 n60Var = this.q;
        if (n60Var != null) {
            return n60Var;
        }
        n60 n60Var2 = new n60(this, 2);
        this.q = n60Var2;
        return n60Var2;
    }

    public final boolean k(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public final Set keySet() {
        li liVar = this.r;
        if (liVar != null) {
            return liVar;
        }
        li liVar2 = new li(this);
        this.r = liVar2;
        return liVar2;
    }

    public final boolean l(Collection collection) {
        int i = this.p;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.p;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.p);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        ni niVar = this.s;
        if (niVar != null) {
            return niVar;
        }
        ni niVar2 = new ni(this);
        this.s = niVar2;
        return niVar2;
    }
}
