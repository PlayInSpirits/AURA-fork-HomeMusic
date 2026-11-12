package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bh1 implements Iterator, x32 {
    public final /* synthetic */ int n;
    public int o;
    public Object p;
    public final Object q;

    public bh1(z03 z03Var) {
        this.n = 2;
        this.q = z03Var;
        this.o = -1;
        this.p = si0.C(new y03(z03Var, this, null));
    }

    public void a() {
        Object objInvoke;
        int i = this.o;
        tq4 tq4Var = (tq4) this.q;
        if (i == -2) {
            objInvoke = ((gf1) tq4Var.b).invoke();
        } else {
            if1 if1Var = tq4Var.c;
            Object obj = this.p;
            obj.getClass();
            objInvoke = if1Var.invoke(obj);
        }
        this.p = objInvoke;
        this.o = objInvoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.n;
        Object obj = this.q;
        switch (i) {
            case 0:
                if (this.o < 0) {
                    a();
                }
                return this.o == 1;
            case 1:
                return ((ba4) this.p).hasNext();
            case 2:
                return ((ba4) this.p).hasNext();
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return this.o < ((Map) obj).size();
            default:
                fn4 fn4Var = (fn4) obj;
                Iterator it = (Iterator) this.p;
                while (this.o < fn4Var.b && it.hasNext()) {
                    it.next();
                    this.o++;
                }
                return this.o < fn4Var.c && it.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.n;
        Object obj = this.q;
        Object obj2 = null;
        switch (i) {
            case 0:
                if (this.o < 0) {
                    a();
                }
                if (this.o == 0) {
                    tb4.k();
                    return null;
                }
                Object obj3 = this.p;
                obj3.getClass();
                this.o = -1;
                return obj3;
            case 1:
                return ((ba4) this.p).next();
            case 2:
                return ((ba4) this.p).next();
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                if (hasNext()) {
                    obj2 = this.p;
                    this.o++;
                    Object obj4 = ((Map) obj).get(obj2);
                    if (obj4 == null) {
                        throw new ConcurrentModificationException("Hash code of an element (" + obj2 + ") has changed after it was added to the persistent set.");
                    }
                    this.p = ((ob2) obj4).b;
                } else {
                    tb4.k();
                }
                return obj2;
            default:
                fn4 fn4Var = (fn4) obj;
                Iterator it = (Iterator) this.p;
                while (this.o < fn4Var.b && it.hasNext()) {
                    it.next();
                    this.o++;
                }
                int i2 = this.o;
                if (i2 < fn4Var.c) {
                    this.o = i2 + 1;
                    return it.next();
                }
                tb4.k();
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.n;
        Object obj = this.q;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                int i2 = this.o;
                if (i2 != -1) {
                    ((t03) obj).o.h(i2);
                    this.o = -1;
                    return;
                }
                return;
            case 2:
                int i3 = this.o;
                if (i3 != -1) {
                    ((z03) obj).o.m(i3);
                    this.o = -1;
                    return;
                }
                return;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public bh1(fn4 fn4Var) {
        this.n = 4;
        this.q = fn4Var;
        this.p = fn4Var.a.iterator();
    }

    public bh1(tq4 tq4Var) {
        this.n = 0;
        this.q = tq4Var;
        this.o = -2;
    }

    public bh1(Object obj, Map map) {
        this.n = 3;
        this.p = obj;
        this.q = map;
    }

    public bh1(t03 t03Var) {
        this.n = 1;
        this.q = t03Var;
        this.o = -1;
        this.p = si0.C(new s03(t03Var, this, null));
    }
}
