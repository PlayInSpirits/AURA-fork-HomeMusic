package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class nw3 extends ViewGroup.MarginLayoutParams {
    public cx3 a;
    public final Rect b;
    public boolean c;
    public boolean d;

    public nw3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public nw3(int i, int i2) {
        super(i, i2);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public nw3(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public nw3(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public nw3(nw3 nw3Var) {
        super((ViewGroup.LayoutParams) nw3Var);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }
}
