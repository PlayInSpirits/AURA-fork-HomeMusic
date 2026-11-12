package defpackage;

import android.os.Looper;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class y24 extends q12 {
    public final /* synthetic */ t24 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y24(String[] strArr, t24 t24Var) {
        super(strArr);
        this.b = t24Var;
    }

    @Override // defpackage.q12
    public final void a(Set set) {
        set.getClass();
        ei eiVarV = ei.V();
        jq3 jq3Var = new jq3(5, this.b);
        eiVarV.j.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            jq3Var.run();
        } else {
            eiVarV.W(jq3Var);
        }
    }
}
