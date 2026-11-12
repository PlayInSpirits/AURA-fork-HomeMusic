package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class u61 implements t04 {
    public final /* synthetic */ int a;

    public /* synthetic */ u61(int r1) {
        this.a = r1;
    }

    @Override // defpackage.t04
    public final /* bridge */ /* synthetic */ boolean a(Object r1, db3 r2) {
        switch(this.a) {
            case 0: goto L8;
            case 1: goto L7;
            default: goto L4;
        };
    L4:
        Drawable r3 = (Drawable) r1;
        return true;
    L7:
        Bitmap r4 = (Bitmap) r1;
        return true;
    L8:
        File r5 = (File) r1;
        return true;
    }

    @Override // defpackage.t04
    public final q04 b(Object r1, int r2, int r3, db3 r4) {
        switch(this.a) {
            case 0: goto L12;
            case 1: goto L10;
            default: goto L4;
        };
    L4:
        Drawable r5 = (Drawable) r1;
        if (r5 != null) goto L13;
        return null;
    L13:
        return new wh1(r5, 1);
    L10:
        return new ld(3, (Bitmap) r1);
    L12:
        return new ld((File) r1);
    }
}
