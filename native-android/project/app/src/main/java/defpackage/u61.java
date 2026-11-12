package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class u61 implements t04 {
    public final /* synthetic */ int a;

    public /* synthetic */ u61(int i) {
        this.a = i;
    }

    @Override // defpackage.t04
    public final /* bridge */ /* synthetic */ boolean a(Object obj, db3 db3Var) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            default:
                break;
        }
        return true;
    }

    @Override // defpackage.t04
    public final q04 b(Object obj, int i, int i2, db3 db3Var) {
        switch (this.a) {
            case 0:
                return new ld((File) obj);
            case 1:
                return new ld(3, (Bitmap) obj);
            default:
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    return new wh1(drawable, 1);
                }
                return null;
        }
    }
}
