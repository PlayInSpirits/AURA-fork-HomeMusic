package defpackage;

import android.util.SparseBooleanArray;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dr2 {
    public static final wa4 e;
    public static final mi3 f;
    public final wa4 a;
    public final mi3 b;
    public final yw1 c;
    public final yw1 d;

    static {
        HashSet hashSet = new HashSet();
        gy3 gy3Var = va4.d;
        for (int i = 0; i < gy3Var.q; i++) {
            hashSet.add(new va4(((Integer) gy3Var.get(i)).intValue()));
        }
        new wa4(hashSet);
        HashSet hashSet2 = new HashSet();
        gy3 gy3Var2 = va4.e;
        for (int i2 = 0; i2 < gy3Var2.q; i2++) {
            hashSet2.add(new va4(((Integer) gy3Var2.get(i2)).intValue()));
        }
        for (int i3 = 0; i3 < gy3Var.q; i3++) {
            hashSet2.add(new va4(((Integer) gy3Var.get(i3)).intValue()));
        }
        e = new wa4(hashSet2);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i4 : zg5.p) {
            rr2.w(!false);
            sparseBooleanArray.append(i4, true);
        }
        rr2.w(!false);
        f = new mi3(new w71(sparseBooleanArray));
    }

    public dr2(wa4 wa4Var, mi3 mi3Var, yw1 yw1Var, yw1 yw1Var2) {
        this.a = wa4Var;
        this.b = mi3Var;
        this.c = yw1Var;
        this.d = yw1Var2;
    }
}
