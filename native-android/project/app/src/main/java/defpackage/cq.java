package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.widget.ImageView;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cq extends Property {
    public final /* synthetic */ int a;
    public Object b;

    public cq() {
        this.a = 2;
        super(Matrix.class, "imageMatrixProperty");
        this.b = new Matrix();
    }

    @Override // android.util.Property
    public final Object get(Object r3) {
        switch(this.a) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        Matrix r2 = (Matrix) this.b;
        r2.set(((ImageView) r3).getImageMatrix());
        return r2;
    L6:
        Rect r4 = (Rect) this.b;
        ((Drawable) r3).copyBounds(r4);
        return new PointF(r4.left, r4.top);
    L8:
        ExtendedFloatingActionButton r5 = (ExtendedFloatingActionButton) r3;
        return Float.valueOf(yd.a(0.0f, 1.0f, (Color.alpha(r5.getCurrentTextColor()) / 255.0f) / Color.alpha(r5.S.getColorForState(r5.getDrawableState(), ((dq) this.b).b.S.getDefaultColor()))));
    }

    @Override // android.util.Property
    public final void set(Object r5, Object r6) {
        switch(this.a) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        ((ImageView) r5).setImageMatrix((Matrix) r6);
        return;
    L6:
        Drawable r7 = (Drawable) r5;
        PointF r8 = (PointF) r6;
        Rect r4 = (Rect) this.b;
        r7.copyBounds(r4);
        r4.offsetTo(Math.round(r8.x), Math.round(r8.y));
        r7.setBounds(r4);
        return;
    L8:
        ExtendedFloatingActionButton r9 = (ExtendedFloatingActionButton) r5;
        Float r10 = (Float) r6;
        int r11 = r9.S.getColorForState(r9.getDrawableState(), ((dq) this.b).b.S.getDefaultColor());
        ColorStateList r12 = ColorStateList.valueOf(Color.argb((int) (yd.a(0.0f, Color.alpha(r11) / 255.0f, r10.floatValue()) * 255.0f), Color.red(r11), Color.green(r11), Color.blue(r11)));
        if (r10.floatValue() != 1.0f) goto L11;
        r9.f(r9.S);
        return;
    L11:
        r9.f(r12);
    }

    public /* synthetic */ cq(Class r2, String r3) {
        this.a = 1;
        super(r2, r3);
    }

    public cq(dq r2) {
        this.a = 0;
        this.b = r2;
        super(Float.class, "LABEL_OPACITY_PROPERTY");
    }
}
