package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class nw3 extends ViewGroup.MarginLayoutParams {
    public cx3 a;
    public final Rect b;
    public boolean c;
    public boolean d;

    public nw3(Context r1, AttributeSet r2) {
        super(r1, r2);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public nw3(int r1, int r2) {
        super(r1, r2);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public nw3(ViewGroup.MarginLayoutParams r1) {
        super(r1);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public nw3(ViewGroup.LayoutParams r1) {
        super(r1);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public nw3(nw3 r1) {
        super(r1);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }
}
