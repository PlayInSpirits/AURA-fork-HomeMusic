package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lb2 extends AbstractSet {
    public final /* synthetic */ int n;
    public final /* synthetic */ nb2 o;

    public /* synthetic */ lb2(nb2 nb2Var, int i) {
        this.n = i;
        this.o = nb2Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.n;
        nb2 nb2Var = this.o;
        switch (i) {
            case 0:
                nb2Var.clear();
                break;
            default:
                nb2Var.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        mb2 mb2VarA;
        int i = this.n;
        nb2 nb2Var = this.o;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                mb2 mb2Var = null;
                if (key != null) {
                    try {
                        mb2VarA = nb2Var.a(key, false);
                    } catch (ClassCastException unused) {
                        mb2VarA = null;
                    }
                    break;
                } else {
                    mb2VarA = null;
                }
                if (mb2VarA != null && Objects.equals(mb2VarA.u, entry.getValue())) {
                    mb2Var = mb2VarA;
                }
                return mb2Var != null;
            default:
                return nb2Var.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.n;
        nb2 nb2Var = this.o;
        switch (i) {
            case 0:
                return new kb2(nb2Var, 0);
            default:
                return new kb2(nb2Var, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        mb2 mb2VarA;
        int i = this.n;
        mb2 mb2VarA2 = null;
        nb2 nb2Var = this.o;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                if (key != null) {
                    try {
                        mb2VarA = nb2Var.a(key, false);
                    } catch (ClassCastException unused) {
                        mb2VarA = null;
                    }
                    break;
                } else {
                    mb2VarA = null;
                }
                if (mb2VarA != null && Objects.equals(mb2VarA.u, entry.getValue())) {
                    mb2VarA2 = mb2VarA;
                }
                if (mb2VarA2 == null) {
                    return false;
                }
                nb2Var.c(mb2VarA2, true);
                return true;
            default:
                if (obj != null) {
                    try {
                        mb2VarA2 = nb2Var.a(obj, false);
                        break;
                    } catch (ClassCastException unused2) {
                    }
                }
                if (mb2VarA2 != null) {
                    nb2Var.c(mb2VarA2, true);
                }
                return mb2VarA2 != null;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.n;
        nb2 nb2Var = this.o;
        switch (i) {
            case 0:
                break;
        }
        return nb2Var.q;
    }
}
