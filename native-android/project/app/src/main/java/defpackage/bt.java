package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.a;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bt implements uw4 {
    @Override // defpackage.uw4
    public final q04 a(Context r3, q04 r4, int r5, int r6) {
        if (e35.I(r5, r6) == false) goto L14;
        zs r7 = a.a(r3).n;
        Bitmap r0 = (Bitmap) r4.get();
        if (r5 != Integer.MIN_VALUE) goto L7;
        r5 = r0.getWidth();
    L7:
        if (r6 != Integer.MIN_VALUE) goto L9;
        r6 = r0.getHeight();
    L9:
        Bitmap r2 = c(r7, r0, r5, r6);
        if (r0.equals(r2) == false) goto L13;
        return r4;
    L13:
        return at.c(r7, r2);
    L14:
        kf2.n(b11.n("Cannot apply transformation on width: ", " or height: ", r5, r6, " less than or equal to zero and not Target.SIZE_ORIGINAL"));
        return null;
    }

    public abstract Bitmap c(zs r1, Bitmap r2, int r3, int r4);
}
