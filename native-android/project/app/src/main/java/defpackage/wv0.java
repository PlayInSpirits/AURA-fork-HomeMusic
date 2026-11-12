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

    public wv0(uw4 r1, boolean r2) {
        this.b = r1;
        this.c = r2;
    }

    @Override // defpackage.uw4
    public final q04 a(Context r3, q04 r4, int r5, int r6) {
        zs r0 = a.a(r3).n;
        Drawable r1 = (Drawable) r4.get();
        at r2 = vv0.a(r0, r1, r5, r6);
        if (r2 == null) goto L5;
        q04 r7 = this.b.a(r3, r2, r5, r6);
        if (r7.equals(r2) == false) goto L14;
        r7.b();
        return r4;
    L14:
        return new at(r3.getResources(), r7);
    L5:
        if (this.c == true) goto L7;
        return r4;
    L7:
        nz2.A(r1, " to a Bitmap", "Unable to convert ");
        return null;
    }

    @Override // defpackage.f42
    public final void b(MessageDigest r1) {
        this.b.b(r1);
    }

    @Override // defpackage.f42
    public final boolean equals(Object r2) {
        if ((r2 instanceof wv0) == true) goto L5;
        return false;
    L5:
        return this.b.equals(((wv0) r2).b);
    }

    @Override // defpackage.f42
    public final int hashCode() {
        return this.b.hashCode();
    }
}
