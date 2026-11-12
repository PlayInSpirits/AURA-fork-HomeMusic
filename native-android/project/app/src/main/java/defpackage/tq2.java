package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tq2 extends wq2 {
    public final ArrayList w;
    public final oi x;

    public tq2(vq2 vq2Var, String str, String str2) {
        super(vq2Var, str, str2, false);
        this.w = new ArrayList();
        this.x = new oi(0);
    }

    public final boolean m() {
        yq2.b();
        ui1 ui1VarC = yq2.c();
        ui1VarC.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = ui1VarC.i.values().iterator();
        if (it.hasNext()) {
            throw xa3.d(it);
        }
        return arrayList.contains(this);
    }

    public final boolean n(wq2 wq2Var) {
        mq2 mq2Var = (mq2) this.x.get(wq2Var.c);
        return mq2Var != null && mq2Var.d;
    }

    public final void o(Collection collection) {
        this.v.clear();
        ArrayList arrayList = this.w;
        arrayList.clear();
        oi oiVar = this.x;
        oiVar.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            mq2 mq2Var = (mq2) it.next();
            wq2 wq2VarA = this.a.a(mq2Var.a.d());
            if (wq2VarA != null) {
                arrayList.add(wq2VarA);
                oiVar.put(wq2VarA.c, mq2Var);
                int i = mq2Var.b;
                if (i == 2 || i == 3) {
                    this.v.add(wq2VarA);
                }
            }
        }
        yq2.c().a.b(259, this);
    }
}
