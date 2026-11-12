package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zy1 implements b75 {
    public final z65[] a;

    public zy1(z65... z65VarArr) {
        this.a = z65VarArr;
    }

    @Override // defpackage.b75
    public final x65 b(Class cls, f03 f03Var) {
        z65 z65Var;
        i30 i30VarA = kx3.a(cls);
        z65[] z65VarArr = this.a;
        z65[] z65VarArr2 = (z65[]) Arrays.copyOf(z65VarArr, z65VarArr.length);
        int length = z65VarArr2.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z65Var = null;
                break;
            }
            z65Var = z65VarArr2[i];
            if (z65Var.a.equals(i30VarA)) {
                break;
            }
            i++;
        }
        rd1.a aVar = z65Var != null ? new rd1.a() : null;
        if (aVar != null) {
            return aVar;
        }
        kf2.e(xa3.g("No initializer set for given class ", i30VarA.b()));
        return null;
    }
}
