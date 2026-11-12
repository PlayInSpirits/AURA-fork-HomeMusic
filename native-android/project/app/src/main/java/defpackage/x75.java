package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class x75 {
    public static Integer d;
    public final View a;
    public final ArrayList b;
    public ah0 c;

    public x75(ImageView r2) {
        this.b = new ArrayList();
        this.a = r2;
    }

    public final int a(int r2, int r3, int r4) {
        int r0 = r3 - r4;
        if (r0 <= 0) goto L5;
        return r0;
    L5:
        int r5 = r2 - r4;
        if (r5 <= 0) goto L8;
        return r5;
    L8:
        View r1 = this.a;
        if (r1.isLayoutRequested() == false) goto L11;
        return 0;
    L11:
        if (r3 == (-2)) goto L13;
        return 0;
    L13:
        if (Log.isLoggable("ViewTarget", 4) == false) goto L15;
        Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
    L15:
        Context r6 = r1.getContext();
        if (d != null) goto L19;
        WindowManager r7 = (WindowManager) r6.getSystemService("window");
        h12.f(r7, "Argument must not be null");
        Display r8 = r7.getDefaultDisplay();
        Point r9 = new Point();
        r8.getSize(r9);
        d = Integer.valueOf(Math.max(r9.x, r9.y));
    L19:
        return d.intValue();
    }
}
