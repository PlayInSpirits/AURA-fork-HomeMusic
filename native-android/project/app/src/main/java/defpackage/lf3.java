package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lf3 extends AbstractMap implements Map, a42 {
    public tv1 n = new tv1();
    public xx4 o;
    public Object p;
    public int q;
    public int r;
    public mf3 s;

    public lf3(mf3 mf3Var) {
        this.o = mf3Var.n;
        this.r = mf3Var.o;
        this.s = mf3Var;
    }

    public final mf3 a() {
        xx4 xx4Var = this.o;
        mf3 mf3Var = this.s;
        if (xx4Var != mf3Var.n) {
            this.n = new tv1();
            mf3Var = new mf3(this.o, this.r);
        }
        this.s = mf3Var;
        return mf3Var;
    }

    public final boolean b(Object obj) {
        return this.o.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    public final Object c(Object obj) {
        return this.o.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.o = xx4.e;
        e(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof qr3) {
            return b((qr3) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof j35) {
            return super.containsValue((j35) obj);
        }
        return false;
    }

    public final Object d(Object obj) {
        this.p = null;
        xx4 xx4VarN = this.o.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (xx4VarN == null) {
            xx4VarN = xx4.e;
        }
        this.o = xx4VarN;
        return this.p;
    }

    public final void e(int i) {
        this.r = i;
        this.q++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new qf3(0, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof qr3) {
            return (j35) c((qr3) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof qr3) ? obj2 : (j35) super.getOrDefault((qr3) obj, (j35) obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new qf3(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.p = null;
        this.o = this.o.l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.p;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        nf3 nf3VarA = null;
        nf3 nf3Var = map instanceof nf3 ? (nf3) map : null;
        if (nf3Var == null) {
            lf3 lf3Var = map instanceof lf3 ? (lf3) map : null;
            if (lf3Var != null) {
                nf3VarA = lf3Var.a();
            }
        } else {
            nf3VarA = nf3Var;
        }
        if (nf3VarA == null) {
            super.putAll(map);
            return;
        }
        no0 no0Var = new no0();
        no0Var.a = 0;
        int i = this.r;
        xx4 xx4Var = this.o;
        xx4 xx4Var2 = nf3VarA.n;
        xx4Var2.getClass();
        this.o = xx4Var.m(xx4Var2, 0, no0Var, this);
        int i2 = (nf3VarA.o + i) - no0Var.a;
        if (i != i2) {
            e(i2);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i = this.r;
        xx4 xx4VarO = this.o.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (xx4VarO == null) {
            xx4VarO = xx4.e;
        }
        this.o = xx4VarO;
        return i != this.r;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.r;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new cg2(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof qr3) {
            return (j35) d((qr3) obj);
        }
        return null;
    }
}
