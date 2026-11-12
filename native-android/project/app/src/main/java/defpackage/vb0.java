package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vb0 {
    public static final SparseIntArray n = null;
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public int h;
    public float i;
    public float j;
    public float k;
    public boolean l;
    public float m;

    static {
        SparseIntArray r0 = new SparseIntArray();
        n = r0;
        r0.append(6, 1);
        r0.append(7, 2);
        r0.append(8, 3);
        r0.append(4, 4);
        r0.append(5, 5);
        r0.append(0, 6);
        r0.append(1, 7);
        r0.append(2, 8);
        r0.append(3, 9);
        r0.append(9, 10);
        r0.append(10, 11);
        r0.append(11, 12);
    }

    public final void a(Context r4, AttributeSet r5) {
        TypedArray r6 = r4.obtainStyledAttributes(r5, kt3.i);
        int r7 = r6.getIndexCount();
        int r0 = 0;
    L3:
        if (r0 >= r7) goto L20;
        int r1 = r6.getIndex(r0);
        switch(n.get(r1)) {
            case 1: goto L18;
            case 2: goto L17;
            case 3: goto L16;
            case 4: goto L15;
            case 5: goto L14;
            case 6: goto L13;
            case 7: goto L12;
            case 8: goto L11;
            case 9: goto L10;
            case 10: goto L9;
            case 11: goto L8;
            case 12: goto L7;
            default: goto L19;
        };
    L7:
        this.h = wb0.g(r6, r1, this.h);
        goto L19
    L8:
        this.l = true;
        this.m = r6.getDimension(r1, this.m);
        goto L19
    L9:
        this.k = r6.getDimension(r1, this.k);
        goto L19
    L10:
        this.j = r6.getDimension(r1, this.j);
        goto L19
    L11:
        this.i = r6.getDimension(r1, this.i);
        goto L19
    L12:
        this.g = r6.getDimension(r1, this.g);
        goto L19
    L13:
        this.f = r6.getDimension(r1, this.f);
        goto L19
    L14:
        this.e = r6.getFloat(r1, this.e);
        goto L19
    L15:
        this.d = r6.getFloat(r1, this.d);
        goto L19
    L16:
        this.c = r6.getFloat(r1, this.c);
        goto L19
    L17:
        this.b = r6.getFloat(r1, this.b);
        goto L19
    L18:
        this.a = r6.getFloat(r1, this.a);
    L19:
        r0 = r0 + 1;
        goto L3
    L20:
        r6.recycle();
    }
}
