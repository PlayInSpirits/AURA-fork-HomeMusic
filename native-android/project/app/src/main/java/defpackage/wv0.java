package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.a;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wv0 implements uw4 {
    public final uw4 b;
    public final boolean c;

    public wv0(uw4 uw4Var, boolean z) {
        this.b = uw4Var;
        this.c = z;
    }

    @Override // defpackage.uw4
    public final q04 a(Context context, q04 q04Var, int i, int i2) {
        zs zsVar = a.a(context).n;
        Drawable drawable = (Drawable) q04Var.get();
        at atVarA = vv0.a(zsVar, drawable, i, i2);
        if (atVarA == null) {
            if (!this.c) {
                return q04Var;
            }
            nz2.A(drawable, " to a Bitmap", "Unable to convert ");
            return null;
        }
        q04 q04VarA = this.b.a(context, atVarA, i, i2);
        if (!q04VarA.equals(atVarA)) {
            return new at(context.getResources(), q04VarA);
        }
        q04VarA.b();
        return q04Var;
    }

    @Override // defpackage.f42
    public final void b(MessageDigest messageDigest) {
        this.b.b(messageDigest);
    }

    @Override // defpackage.f42
    public final boolean equals(Object obj) {
        if (obj instanceof wv0) {
            return this.b.equals(((wv0) obj).b);
        }
        return false;
    }

    @Override // defpackage.f42
    public final int hashCode() {
        return this.b.hashCode();
    }
}
