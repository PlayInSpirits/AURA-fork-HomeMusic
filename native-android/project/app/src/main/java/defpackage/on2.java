package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class on2 implements er2 {
    public final ms2 o;
    public final /* synthetic */ pn2 q;
    public final Object n = new Object();
    public final ArrayList p = new ArrayList();

    public on2(pn2 pn2Var, ms2 ms2Var) {
        this.q = pn2Var;
        this.o = ms2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof on2) {
            return Objects.equals(this.o, ((on2) obj).o);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.o);
    }

    @Override // defpackage.er2
    public final void z(int i, String str, jn2 jn2Var) {
        Bundle bundle = jn2Var != null ? jn2Var.a : null;
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        Bundle bundle2 = bundle;
        ms2 ms2Var = this.o;
        if (ms2Var == null) {
            kf2.n("remoteUserInfo cannot be null in notifyChildrenChanged");
            return;
        }
        if (str == null) {
            kf2.n("parentId cannot be null in notifyChildrenChanged");
        } else {
            if (bundle2 == null) {
                kf2.n("options cannot be null in notifyChildrenChanged");
                return;
            }
            bq4 bq4Var = this.q.n;
            bq4Var.getClass();
            ((pn2) bq4Var.q).t.post(new sz(bq4Var, ms2Var, str, bundle2, 1));
        }
    }
}
