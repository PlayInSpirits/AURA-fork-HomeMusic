package defpackage;

import android.util.SparseArray;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tw3 {
    public SparseArray a;
    public int b;
    public Set c;

    public final sw3 a(int i) {
        SparseArray sparseArray = this.a;
        sw3 sw3Var = (sw3) sparseArray.get(i);
        if (sw3Var != null) {
            return sw3Var;
        }
        sw3 sw3Var2 = new sw3();
        sparseArray.put(i, sw3Var2);
        return sw3Var2;
    }
}
