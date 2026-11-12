package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qf3 extends w1 {
    public final /* synthetic */ int n;
    public final lf3 o;

    public /* synthetic */ qf3(int i, lf3 lf3Var) {
        this.n = i;
        this.o = lf3Var;
    }

    @Override // defpackage.w1
    public final int a() {
        switch (this.n) {
            case 0:
                break;
        }
        return this.o.r;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.n) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.n) {
            case 0:
                this.o.clear();
                break;
            default:
                this.o.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.n) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                lf3 lf3Var = this.o;
                Object obj2 = lf3Var.get(key);
                if (obj2 != null) {
                    return obj2.equals(entry.getValue());
                }
                return entry.getValue() == null && lf3Var.containsKey(entry.getKey());
            default:
                return this.o.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.n) {
            case 0:
                return new rf3(this.o);
            default:
                yx4[] yx4VarArr = new yx4[8];
                for (int i = 0; i < 8; i++) {
                    yx4VarArr[i] = new zx4(1);
                }
                return new sf3(this.o, yx4VarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.n) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.o.remove(entry.getKey(), entry.getValue());
            default:
                lf3 lf3Var = this.o;
                if (!lf3Var.containsKey(obj)) {
                    return false;
                }
                lf3Var.remove(obj);
                return true;
        }
    }
}
