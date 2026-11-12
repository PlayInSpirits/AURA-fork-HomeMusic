package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vs implements t04 {
    public final /* synthetic */ int a;
    public final zs b;

    public vs() {
        this.a = 0;
        this.b = new pa(19);
    }

    @Override // defpackage.t04
    public final /* bridge */ /* synthetic */ boolean a(Object r1, db3 r2) {
        switch(this.a) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        vk4 r3 = (vk4) r1;
        return true;
    L7:
        i3.v(r1);
        return true;
    }

    @Override // defpackage.t04
    public final q04 b(Object r2, int r3, int r4, db3 r5) {
        switch(this.a) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        Bitmap r6 = ((vk4) r2).b();
        return at.c(this.b, r6);
    L7:
        return c(i3.d(r2), r3, r4, r5);
    }

    public at c(ImageDecoder.Source r4, int r5, int r6, db3 r7) {
        Bitmap r8 = i3.b(r4, new im0(r5, r6, r7));
        if (Log.isLoggable("BitmapImageDecoder", 2) == false) goto L6;
        Log.v("BitmapImageDecoder", "Decoded [" + r8.getWidth() + "x" + r8.getHeight() + "] for [" + r5 + "x" + r6 + "]");
    L6:
        return new at((pa) this.b, r8);
    }

    public vs(zs r2) {
        this.a = 1;
        this.b = r2;
    }
}
