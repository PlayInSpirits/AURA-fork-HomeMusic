package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nb0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final int e;

    public nb0(Context r7, XmlResourceParser r8) {
        this.a = Float.NaN;
        this.b = Float.NaN;
        this.c = Float.NaN;
        this.d = Float.NaN;
        this.e = -1;
        TypedArray r9 = r7.obtainStyledAttributes(Xml.asAttributeSet(r8), kt3.j);
        int r0 = r9.getIndexCount();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L23;
        int r2 = r9.getIndex(r1);
        if (r2 != 0) goto L10;
        int r3 = r9.getResourceId(r2, this.e);
        this.e = r3;
        String r4 = r7.getResources().getResourceTypeName(r3);
        r7.getResources().getResourceName(r3);
        if ("layout".equals(r4) == false) goto L22;
        new wb0().b((ConstraintLayout) LayoutInflater.from(r7).inflate(r3, null));
    L22:
        r1 = r1 + 1;
        goto L3
    L10:
        if (r2 != 1) goto L13;
        this.d = r9.getDimension(r2, this.d);
        goto L22
    L13:
        if (r2 != 2) goto L16;
        this.b = r9.getDimension(r2, this.b);
        goto L22
    L16:
        if (r2 != 3) goto L19;
        this.c = r9.getDimension(r2, this.c);
        goto L22
    L19:
        if (r2 != 4) goto L21;
        this.a = r9.getDimension(r2, this.a);
        goto L22
    L21:
        Log.v("ConstraintLayoutStates", "Unknown tag");
        goto L22
    L23:
        r9.recycle();
    }
}
