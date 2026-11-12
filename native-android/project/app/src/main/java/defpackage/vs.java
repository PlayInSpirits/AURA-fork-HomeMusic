package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;

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
    public final /* bridge */ /* synthetic */ boolean a(Object obj, db3 db3Var) {
        switch (this.a) {
            case 0:
                i3.v(obj);
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
                return c(i3.d(obj), i, i2, db3Var);
            default:
                return at.c(this.b, ((vk4) obj).b());
        }
    }

    public at c(ImageDecoder.Source source, int i, int i2, db3 db3Var) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new im0(i, i2, db3Var));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + bitmapDecodeBitmap.getWidth() + "x" + bitmapDecodeBitmap.getHeight() + "] for [" + i + "x" + i2 + "]");
        }
        return new at((pa) this.b, bitmapDecodeBitmap);
    }

    public vs(zs zsVar) {
        this.a = 1;
        this.b = zsVar;
    }
}
