package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class at implements q04, xy1 {
    public final /* synthetic */ int n = 1;
    public final Object o;
    public final Object p;

    public at(zs zsVar, Bitmap bitmap) {
        h12.f(bitmap, "Bitmap must not be null");
        this.o = bitmap;
        h12.f(zsVar, "BitmapPool must not be null");
        this.p = zsVar;
    }

    public static at c(zs zsVar, Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return new at(zsVar, bitmap);
    }

    @Override // defpackage.xy1
    public final void a() {
        switch (this.n) {
            case 0:
                ((Bitmap) this.o).prepareToDraw();
                break;
            default:
                q04 q04Var = (q04) this.p;
                if (q04Var instanceof xy1) {
                    ((xy1) q04Var).a();
                }
                break;
        }
    }

    @Override // defpackage.q04
    public final void b() {
        switch (this.n) {
            case 0:
                ((zs) this.p).d((Bitmap) this.o);
                break;
            default:
                ((q04) this.p).b();
                break;
        }
    }

    @Override // defpackage.q04
    public final int d() {
        switch (this.n) {
            case 0:
                return e35.v((Bitmap) this.o);
            default:
                return ((q04) this.p).d();
        }
    }

    @Override // defpackage.q04
    public final Class e() {
        switch (this.n) {
            case 0:
                return Bitmap.class;
            default:
                return BitmapDrawable.class;
        }
    }

    @Override // defpackage.q04
    public final Object get() {
        switch (this.n) {
            case 0:
                return (Bitmap) this.o;
            default:
                return new BitmapDrawable((Resources) this.o, (Bitmap) ((q04) this.p).get());
        }
    }

    public at(Resources resources, q04 q04Var) {
        h12.f(resources, "Argument must not be null");
        this.o = resources;
        h12.f(q04Var, "Argument must not be null");
        this.p = q04Var;
    }
}
