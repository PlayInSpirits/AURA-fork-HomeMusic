package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class b04 implements ta0 {
    public final mf4 a;
    public final /* synthetic */ c04 b;

    public b04(c04 c04Var, mf4 mf4Var) {
        this.b = c04Var;
        this.a = mf4Var;
    }

    @Override // defpackage.ta0
    public final void a(boolean z) {
        if (z) {
            synchronized (this.b) {
                mf4 mf4Var = this.a;
                ArrayList B = e35.B((Set) mf4Var.p);
                int size = B.size();
                int i = 0;
                while (i < size) {
                    Object obj = B.get(i);
                    i++;
                    pz3 pz3Var = (pz3) obj;
                    if (!pz3Var.d() && !pz3Var.j()) {
                        pz3Var.clear();
                        if (mf4Var.o) {
                            ((HashSet) mf4Var.q).add(pz3Var);
                        } else {
                            pz3Var.k();
                        }
                    }
                }
            }
        }
    }
}
