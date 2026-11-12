package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.a;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bt implements uw4 {
    @Override // defpackage.uw4
    public final q04 a(Context context, q04 q04Var, int i, int i2) {
        if (!e35.I(i, i2)) {
            kf2.n(b11.n("Cannot apply transformation on width: ", " or height: ", i, i2, " less than or equal to zero and not Target.SIZE_ORIGINAL"));
            return null;
        }
        zs zsVar = a.a(context).n;
        Bitmap bitmap = (Bitmap) q04Var.get();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getHeight();
        }
        Bitmap bitmapC = c(zsVar, bitmap, i, i2);
        return bitmap.equals(bitmapC) ? q04Var : at.c(zsVar, bitmapC);
    }

    public abstract Bitmap c(zs zsVar, Bitmap bitmap, int i, int i2);
}
