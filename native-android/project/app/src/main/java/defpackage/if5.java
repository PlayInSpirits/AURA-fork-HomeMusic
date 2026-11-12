package defpackage;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class if5 {
    public static final Set b = Collections.newSetFromMap(new WeakHashMap());
    public final dj1 a;

    public if5(dj1 dj1Var) {
        this.a = dj1Var;
    }

    public final wg5 a(wg5 wg5Var) {
        boolean z = true;
        if (!wg5Var.i && !((Boolean) BasePendingResult.j.get()).booleanValue()) {
            z = false;
        }
        wg5Var.i = z;
        dj1 dj1Var = this.a;
        ij1 ij1Var = dj1Var.j;
        ij1Var.getClass();
        pf5 pf5Var = new pf5(new vf5(wg5Var), ij1Var.v.get(), dj1Var);
        zw2 zw2Var = ij1Var.A;
        zw2Var.sendMessage(zw2Var.obtainMessage(4, pf5Var));
        return wg5Var;
    }
}
