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
    public final /* synthetic */ int a = 2;
    public Object b;

    public cq() {
        super(Matrix.class, "imageMatrixProperty");
        this.b = new Matrix();
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.a) {
            case 0:
                ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) obj;
                return Float.valueOf(yd.a(0.0f, 1.0f, (Color.alpha(extendedFloatingActionButton.getCurrentTextColor()) / 255.0f) / Color.alpha(extendedFloatingActionButton.S.getColorForState(extendedFloatingActionButton.getDrawableState(), ((dq) this.b).b.S.getDefaultColor()))));
            case 1:
                Rect rect = (Rect) this.b;
                ((Drawable) obj).copyBounds(rect);
                return new PointF(rect.left, rect.top);
            default:
                Matrix matrix = (Matrix) this.b;
                matrix.set(((ImageView) obj).getImageMatrix());
                return matrix;
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) obj;
                Float f = (Float) obj2;
                int colorForState = extendedFloatingActionButton.S.getColorForState(extendedFloatingActionButton.getDrawableState(), ((dq) this.b).b.S.getDefaultColor());
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(Color.argb((int) (yd.a(0.0f, Color.alpha(colorForState) / 255.0f, f.floatValue()) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
                if (f.floatValue() != 1.0f) {
                    extendedFloatingActionButton.f(colorStateListValueOf);
                } else {
                    extendedFloatingActionButton.f(extendedFloatingActionButton.S);
                }
                break;
            case 1:
                Drawable drawable = (Drawable) obj;
                PointF pointF = (PointF) obj2;
                Rect rect = (Rect) this.b;
                drawable.copyBounds(rect);
                rect.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
                drawable.setBounds(rect);
                break;
            default:
                ((ImageView) obj).setImageMatrix((Matrix) obj2);
                break;
        }
    }

    public /* synthetic */ cq(Class cls, String str) {
        super(cls, str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cq(dq dqVar) {
        super(Float.class, "LABEL_OPACITY_PROPERTY");
        this.b = dqVar;
    }
}
