package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class at implements q04, xy1 {
    public final /* synthetic */ int n;
    public final Object o;
    public final Object p;

    public at(zs r2, Bitmap r3) {
        this.n = 0;
        h12.f(r3, "Bitmap must not be null");
        this.o = r3;
        h12.f(r2, "BitmapPool must not be null");
        this.p = r2;
    }

    public static at c(zs r1, Bitmap r2) {
        if (r2 != null) goto L6;
        return null;
    L6:
        return new at(r1, r2);
    }

    @Override // defpackage.xy1
    public final void a() {
        switch(this.n) {
            case 0: goto L8;
            default: goto L4;
        };
    L4:
        q04 r1 = (q04) this.p;
        if ((r1 instanceof xy1) == false) goto L10;
        ((xy1) r1).a();
        return;
    L10:
        return;
    L8:
        ((Bitmap) this.o).prepareToDraw();
    }

    @Override // defpackage.q04
    public final void b() {
        switch(this.n) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((q04) this.p).b();
        return;
    L6:
        ((zs) this.p).d((Bitmap) this.o);
    }

    @Override // defpackage.q04
    public final int d() {
        switch(this.n) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return ((q04) this.p).d();
    L7:
        return e35.v((Bitmap) this.o);
    }

    @Override // defpackage.q04
    public final Class e() {
        switch(this.n) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        return BitmapDrawable.class;
    L6:
        return Bitmap.class;
    }

    @Override // defpackage.q04
    public final Object get() {
        switch(this.n) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return new BitmapDrawable((Resources) this.o, (Bitmap) ((q04) this.p).get());
    L7:
        return (Bitmap) this.o;
    }

    public at(Resources r2, q04 r3) {
        this.n = 1;
        h12.f(r2, "Argument must not be null");
        this.o = r2;
        h12.f(r3, "Argument must not be null");
        this.p = r3;
    }
}
