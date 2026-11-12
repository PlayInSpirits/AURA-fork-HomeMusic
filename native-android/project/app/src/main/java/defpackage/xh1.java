package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.a;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xh1 implements uw4 {
    public final uw4 b;

    public xh1(uw4 uw4Var) {
        h12.f(uw4Var, "Argument must not be null");
        this.b = uw4Var;
    }

    @Override // defpackage.uw4
    public final q04 a(Context context, q04 q04Var, int i, int i2) {
        vh1 vh1Var = (vh1) q04Var.get();
        at atVar = new at(a.a(context).n, ((bi1) vh1Var.n.b).l);
        uw4 uw4Var = this.b;
        q04 q04VarA = uw4Var.a(context, atVar, i, i2);
        if (atVar != q04VarA) {
            atVar.b();
        }
        ((bi1) vh1Var.n.b).c(uw4Var, (Bitmap) q04VarA.get());
        return q04Var;
    }

    @Override // defpackage.f42
    public final void b(MessageDigest messageDigest) {
        this.b.b(messageDigest);
    }

    @Override // defpackage.f42
    public final boolean equals(Object obj) {
        if (obj instanceof xh1) {
            return this.b.equals(((xh1) obj).b);
        }
        return false;
    }

    @Override // defpackage.f42
    public final int hashCode() {
        return this.b.hashCode();
    }
}
