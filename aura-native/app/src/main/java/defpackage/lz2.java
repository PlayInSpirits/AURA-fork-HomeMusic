package defpackage;

import android.content.Context;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class lz2 implements uw4 {
    public final List b;

    public lz2(uw4... uw4VarArr) {
        if (uw4VarArr.length != 0) {
            this.b = Arrays.asList(uw4VarArr);
        } else {
            kf2.n("MultiTransformation must contain at least one Transformation");
            throw null;
        }
    }

    @Override // defpackage.uw4
    public final q04 a(Context context, q04 q04Var, int i, int i2) {
        Iterator it = this.b.iterator();
        q04 q04Var2 = q04Var;
        while (it.hasNext()) {
            q04 a = ((uw4) it.next()).a(context, q04Var2, i, i2);
            if (q04Var2 != null && !q04Var2.equals(q04Var) && !q04Var2.equals(a)) {
                q04Var2.b();
            }
            q04Var2 = a;
        }
        return q04Var2;
    }

    @Override // defpackage.f42
    public final void b(MessageDigest messageDigest) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((uw4) it.next()).b(messageDigest);
        }
    }

    @Override // defpackage.f42
    public final boolean equals(Object obj) {
        if (obj instanceof lz2) {
            return this.b.equals(((lz2) obj).b);
        }
        return false;
    }

    @Override // defpackage.f42
    public final int hashCode() {
        return this.b.hashCode();
    }
}
