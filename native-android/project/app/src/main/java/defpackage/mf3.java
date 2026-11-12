package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mf3 extends nf3 implements c90 {
    public static final mf3 q = new mf3(xx4.e, 0);

    public final mf3 b(qr3 qr3Var, j35 j35Var) {
        x7 x7VarU = this.n.u(qr3Var, qr3Var.hashCode(), j35Var, 0);
        return x7VarU == null ? this : new mf3((xx4) x7VarU.p, this.o + x7VarU.o);
    }

    @Override // defpackage.nf3, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof qr3) {
            return super.containsKey((qr3) obj);
        }
        return false;
    }

    @Override // defpackage.nf3, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof j35) {
            return super.containsValue((j35) obj);
        }
        return false;
    }

    @Override // defpackage.nf3, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof qr3) {
            return (j35) super.get((qr3) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof qr3) ? obj2 : (j35) super.getOrDefault((qr3) obj, (j35) obj2);
    }
}
