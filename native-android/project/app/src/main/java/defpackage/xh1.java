package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.a;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xh1 implements uw4 {
    public final uw4 b;

    public xh1(uw4 r2) {
        h12.f(r2, "Argument must not be null");
        this.b = r2;
    }

    @Override // defpackage.uw4
    public final q04 a(Context r5, q04 r6, int r7, int r8) {
        vh1 r0 = (vh1) r6.get();
        at r3 = new at(a.a(r5).n, ((bi1) r0.n.b).l);
        uw4 r4 = this.b;
        q04 r9 = r4.a(r5, r3, r7, r8);
        if (r3 == r9) goto L5;
        r3.b();
    L5:
        Bitmap r10 = (Bitmap) r9.get();
        ((bi1) r0.n.b).c(r4, r10);
        return r6;
    }

    @Override // defpackage.f42
    public final void b(MessageDigest r1) {
        this.b.b(r1);
    }

    @Override // defpackage.f42
    public final boolean equals(Object r2) {
        if ((r2 instanceof xh1) == true) goto L5;
        return false;
    L5:
        return this.b.equals(((xh1) r2).b);
    }

    @Override // defpackage.f42
    public final int hashCode() {
        return this.b.hashCode();
    }
}
