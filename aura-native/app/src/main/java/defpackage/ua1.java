package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ua1 implements xc0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ua1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.xc0
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                va1 va1Var = (va1) obj;
                if (va1Var == null) {
                    va1Var = new va1(-3);
                }
                ((wo0) this.b).H(va1Var);
                return;
            default:
                va1 va1Var2 = (va1) obj;
                synchronized (wa1.c) {
                    try {
                        yd4 yd4Var = wa1.d;
                        ArrayList arrayList = (ArrayList) yd4Var.get((String) this.b);
                        if (arrayList == null) {
                            return;
                        }
                        yd4Var.remove((String) this.b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((xc0) arrayList.get(i)).accept(va1Var2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
