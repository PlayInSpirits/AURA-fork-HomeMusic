package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tb0 {
    public static final SparseIntArray j = null;
    public int a;
    public int b;
    public int c;
    public float d;
    public float e;
    public float f;
    public int g;
    public String h;
    public int i;

    static {
        SparseIntArray r0 = new SparseIntArray();
        j = r0;
        r0.append(3, 1);
        r0.append(5, 2);
        r0.append(9, 3);
        r0.append(2, 4);
        r0.append(1, 5);
        r0.append(0, 6);
        r0.append(4, 7);
        r0.append(8, 8);
        r0.append(7, 9);
        r0.append(6, 10);
    }

    public final void a(Context r8, AttributeSet r9) {
        TypedArray r10 = r8.obtainStyledAttributes(r9, kt3.f);
        int r11 = r10.getIndexCount();
        int r1 = 0;
    L3:
        if (r1 >= r11) goto L28;
        int r2 = r10.getIndex(r1);
        switch(j.get(r2)) {
            case 1: goto L26;
            case 2: goto L25;
            case 3: goto L22;
            case 4: goto L20;
            case 5: goto L19;
            case 6: goto L18;
            case 7: goto L17;
            case 8: goto L16;
            case 9: goto L15;
            case 10: goto L7;
            default: goto L27;
        };
    L7:
        int r3 = r10.peekValue(r2).type;
        if (r3 != 1) goto L10;
        this.i = r10.getResourceId(r2, -1);
        goto L27
    L10:
        if (r3 != 3) goto L14;
        String r4 = r10.getString(r2);
        this.h = r4;
        if (r4.indexOf("/") <= 0) goto L27;
        this.i = r10.getResourceId(r2, -1);
        goto L27
    L14:
        r10.getInteger(r2, this.i);
        goto L27
    L15:
        this.f = r10.getFloat(r2, this.f);
        goto L27
    L16:
        this.g = r10.getInteger(r2, this.g);
        goto L27
    L17:
        this.d = r10.getFloat(r2, this.d);
        goto L27
    L18:
        this.b = r10.getInteger(r2, this.b);
        goto L27
    L19:
        this.a = wb0.g(r10, r2, this.a);
        goto L27
    L20:
        r10.getInt(r2, 0);
        goto L27
    L25:
        this.c = r10.getInt(r2, this.c);
        goto L27
    L26:
        this.e = r10.getFloat(r2, this.e);
        goto L27
    L22:
        if (r10.peekValue(r2).type != 3) goto L24;
        r10.getString(r2);
        goto L27
    L24:
        String r5 = xl.d[r10.getInteger(r2, 0)];
    L27:
        r1 = r1 + 1;
        goto L3
    L28:
        r10.recycle();
    }
}
