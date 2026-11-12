package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class o60 extends r1 {
    public final Object n;
    public int o;
    public final /* synthetic */ p60 p;

    public o60(p60 p60Var, int i) {
        this.p = p60Var;
        Object obj = p60.w;
        this.n = p60Var.j()[i];
        this.o = i;
    }

    public final void a() {
        int i = this.o;
        Object obj = this.n;
        p60 p60Var = this.p;
        if (i != -1 && i < p60Var.size()) {
            if (si0.s(obj, p60Var.j()[this.o])) {
                return;
            }
        }
        Object obj2 = p60.w;
        this.o = p60Var.e(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.n;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        p60 p60Var = this.p;
        Map mapC = p60Var.c();
        if (mapC != null) {
            return mapC.get(this.n);
        }
        a();
        int i = this.o;
        if (i == -1) {
            return null;
        }
        return p60Var.k()[i];
    }

    @Override // defpackage.r1, java.util.Map.Entry
    public final Object setValue(Object obj) {
        p60 p60Var = this.p;
        Map mapC = p60Var.c();
        Object obj2 = this.n;
        if (mapC != null) {
            return mapC.put(obj2, obj);
        }
        a();
        int i = this.o;
        if (i == -1) {
            p60Var.put(obj2, obj);
            return null;
        }
        Object obj3 = p60Var.k()[i];
        p60Var.k()[this.o] = obj;
        return obj3;
    }
}
