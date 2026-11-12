package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tf3 extends l2 {
    public final /* synthetic */ int n;
    public final nf3 o;

    public /* synthetic */ tf3(nf3 nf3Var, int i) {
        this.n = i;
        this.o = nf3Var;
    }

    @Override // defpackage.y
    public final int a() {
        int i = this.n;
        nf3 nf3Var = this.o;
        switch (i) {
            case 0:
                nf3Var.getClass();
                break;
            default:
                nf3Var.getClass();
                break;
        }
        return nf3Var.o;
    }

    @Override // defpackage.y, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        int i = this.n;
        nf3 nf3Var = this.o;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = nf3Var.get(entry.getKey());
                if (obj2 != null) {
                    return obj2.equals(entry.getValue());
                }
                return entry.getValue() == null && nf3Var.containsKey(entry.getKey());
            default:
                return nf3Var.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.n) {
            case 0:
                xx4 xx4Var = this.o.n;
                yx4[] yx4VarArr = new yx4[8];
                for (int i = 0; i < 8; i++) {
                    yx4VarArr[i] = new zx4(0);
                }
                return new uf3(xx4Var, yx4VarArr);
            default:
                xx4 xx4Var2 = this.o.n;
                yx4[] yx4VarArr2 = new yx4[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    yx4VarArr2[i2] = new zx4(1);
                }
                return new uf3(xx4Var2, yx4VarArr2);
        }
    }
}
