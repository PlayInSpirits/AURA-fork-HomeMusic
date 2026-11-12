package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import java.util.Arrays;
import java.util.WeakHashMap;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class r00 extends Property {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r00(Class cls, String str, int i) {
        super(cls, str);
        this.a = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return null;
            case 4:
                return null;
            case 5:
                return Float.valueOf(((a30) obj).i);
            case 6:
                return Float.valueOf(((a30) obj).j);
            case 7:
                return Float.valueOf(((cw0) obj).b());
            case 8:
                return Float.valueOf(((View) obj).getLayoutParams().width);
            case 9:
                return Float.valueOf(((View) obj).getLayoutParams().height);
            case 10:
                WeakHashMap weakHashMap = j65.a;
                return Float.valueOf(((View) obj).getPaddingStart());
            case 11:
                WeakHashMap weakHashMap2 = j65.a;
                return Float.valueOf(((View) obj).getPaddingEnd());
            case 12:
                return Float.valueOf(((va2) obj).i);
            case 13:
                return Float.valueOf(((xa2) obj).j);
            case 14:
                return Float.valueOf(((SwitchCompat) obj).M);
            case 15:
                return Float.valueOf(d85.a.D((View) obj));
            default:
                WeakHashMap weakHashMap3 = j65.a;
                return ((View) obj).getClipBounds();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        boolean z = false;
        switch (this.a) {
            case 0:
                u00 u00Var = (u00) obj;
                PointF pointF = (PointF) obj2;
                u00Var.getClass();
                u00Var.a = Math.round(pointF.x);
                int iRound = Math.round(pointF.y);
                u00Var.b = iRound;
                int i = u00Var.f + 1;
                u00Var.f = i;
                if (i == u00Var.g) {
                    d85.a(u00Var.e, u00Var.a, iRound, u00Var.c, u00Var.d);
                    u00Var.f = 0;
                    u00Var.g = 0;
                }
                break;
            case 1:
                u00 u00Var2 = (u00) obj;
                PointF pointF2 = (PointF) obj2;
                u00Var2.getClass();
                u00Var2.c = Math.round(pointF2.x);
                int iRound2 = Math.round(pointF2.y);
                u00Var2.d = iRound2;
                int i2 = u00Var2.g + 1;
                u00Var2.g = i2;
                if (u00Var2.f == i2) {
                    d85.a(u00Var2.e, u00Var2.a, u00Var2.b, u00Var2.c, iRound2);
                    u00Var2.f = 0;
                    u00Var2.g = 0;
                }
                break;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                d85.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                d85.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int iRound3 = Math.round(pointF5.x);
                int iRound4 = Math.round(pointF5.y);
                d85.a(view3, iRound3, iRound4, view3.getWidth() + iRound3, view3.getHeight() + iRound4);
                break;
            case 5:
                a30 a30Var = (a30) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                a30Var.i = fFloatValue;
                int i3 = (int) (5400.0f * fFloatValue);
                a61 a61Var = a30Var.f;
                float[] fArr = (float[]) a30Var.b;
                float f = fFloatValue * 1520.0f;
                fArr[0] = (-20.0f) + f;
                fArr[1] = f;
                for (int i4 = 0; i4 < 4; i4++) {
                    fArr[1] = (a61Var.getInterpolation((i3 - a30.l[i4]) / 667.0f) * 250.0f) + fArr[1];
                    fArr[0] = (a61Var.getInterpolation((i3 - a30.m[i4]) / 667.0f) * 250.0f) + fArr[0];
                }
                float f2 = fArr[0];
                float f3 = fArr[1];
                float f4 = ((f3 - f2) * a30Var.j) + f2;
                fArr[0] = f4;
                fArr[0] = f4 / 360.0f;
                fArr[1] = f3 / 360.0f;
                g30 g30Var = a30Var.g;
                int i5 = 0;
                while (i5 < 4) {
                    float f5 = (i3 - a30.n[i5]) / 333.0f;
                    if (f5 >= 0.0f && f5 <= 1.0f) {
                        int i6 = i5 + a30Var.h;
                        int[] iArr = g30Var.c;
                        int length = i6 % iArr.length;
                        int length2 = (length + 1) % iArr.length;
                        int iL = g12.l(iArr[length], ((sx1) a30Var.a).w);
                        int iL2 = g12.l(g30Var.c[length2], ((sx1) a30Var.a).w);
                        float interpolation = a61Var.getInterpolation(f5);
                        int[] iArr2 = (int[]) a30Var.c;
                        Integer numValueOf = Integer.valueOf(iL);
                        Integer numValueOf2 = Integer.valueOf(iL2);
                        int iIntValue = numValueOf.intValue();
                        float f6 = ((iIntValue >> 24) & 255) / 255.0f;
                        int iIntValue2 = numValueOf2.intValue();
                        float f7 = ((iIntValue2 >> 24) & 255) / 255.0f;
                        boolean z2 = z;
                        float fPow = (float) Math.pow(((iIntValue >> 16) & 255) / 255.0f, 2.2d);
                        float fPow2 = (float) Math.pow(((iIntValue >> 8) & 255) / 255.0f, 2.2d);
                        float fPow3 = (float) Math.pow((iIntValue & 255) / 255.0f, 2.2d);
                        float fPow4 = (float) Math.pow(((iIntValue2 >> 16) & 255) / 255.0f, 2.2d);
                        float fPow5 = (float) Math.pow(((iIntValue2 >> 8) & 255) / 255.0f, 2.2d);
                        float fPow6 = (float) Math.pow((iIntValue2 & 255) / 255.0f, 2.2d);
                        float fA = xa3.a(f7, f6, interpolation, f6);
                        float fA2 = xa3.a(fPow4, fPow, interpolation, fPow);
                        float fA3 = xa3.a(fPow5, fPow2, interpolation, fPow2);
                        float fA4 = xa3.a(fPow6, fPow3, interpolation, fPow3);
                        float fPow7 = ((float) Math.pow(fA2, 0.45454545454545453d)) * 255.0f;
                        float fPow8 = ((float) Math.pow(fA3, 0.45454545454545453d)) * 255.0f;
                        iArr2[z2 ? 1 : 0] = Integer.valueOf(Math.round(((float) Math.pow(fA4, 0.45454545454545453d)) * 255.0f) | (Math.round(fPow7) << 16) | (Math.round(fA * 255.0f) << 24) | (Math.round(fPow8) << 8)).intValue();
                        ((sx1) a30Var.a).invalidateSelf();
                    } else {
                        i5++;
                        z = z;
                    }
                    break;
                }
                ((sx1) a30Var.a).invalidateSelf();
                break;
            case 6:
                ((a30) obj).j = ((Float) obj2).floatValue();
                break;
            case 7:
                cw0 cw0Var = (cw0) obj;
                float fFloatValue2 = ((Float) obj2).floatValue();
                if (cw0Var.u != fFloatValue2) {
                    cw0Var.u = fFloatValue2;
                    cw0Var.invalidateSelf();
                }
                break;
            case 8:
                View view4 = (View) obj;
                view4.getLayoutParams().width = ((Float) obj2).intValue();
                view4.requestLayout();
                break;
            case 9:
                View view5 = (View) obj;
                view5.getLayoutParams().height = ((Float) obj2).intValue();
                view5.requestLayout();
                break;
            case 10:
                View view6 = (View) obj;
                int iIntValue3 = ((Float) obj2).intValue();
                int paddingTop = view6.getPaddingTop();
                WeakHashMap weakHashMap = j65.a;
                view6.setPaddingRelative(iIntValue3, paddingTop, view6.getPaddingEnd(), view6.getPaddingBottom());
                break;
            case 11:
                View view7 = (View) obj;
                WeakHashMap weakHashMap2 = j65.a;
                view7.setPaddingRelative(view7.getPaddingStart(), view7.getPaddingTop(), ((Float) obj2).intValue(), view7.getPaddingBottom());
                break;
            case 12:
                va2 va2Var = (va2) obj;
                float fFloatValue3 = ((Float) obj2).floatValue();
                va2Var.i = fFloatValue3;
                int i7 = (int) (fFloatValue3 * 333.0f);
                float[] fArr2 = (float[]) va2Var.b;
                fArr2[0] = 0.0f;
                float f8 = i7 / 667.0f;
                a61 a61Var2 = va2Var.e;
                float interpolation2 = a61Var2.getInterpolation(f8);
                fArr2[2] = interpolation2;
                fArr2[1] = interpolation2;
                float interpolation3 = a61Var2.getInterpolation(f8 + 0.49925038f);
                fArr2[4] = interpolation3;
                fArr2[3] = interpolation3;
                fArr2[5] = 1.0f;
                if (va2Var.h && interpolation3 < 1.0f) {
                    int[] iArr3 = (int[]) va2Var.c;
                    iArr3[2] = iArr3[1];
                    iArr3[1] = iArr3[0];
                    iArr3[0] = g12.l(va2Var.f.c[va2Var.g], ((sx1) va2Var.a).w);
                    va2Var.h = false;
                }
                ((sx1) va2Var.a).invalidateSelf();
                break;
            case 13:
                xa2 xa2Var = (xa2) obj;
                float fFloatValue4 = ((Float) obj2).floatValue();
                xa2Var.j = fFloatValue4;
                int i8 = (int) (fFloatValue4 * 1800.0f);
                for (int i9 = 0; i9 < 4; i9++) {
                    ((float[]) xa2Var.b)[i9] = Math.max(0.0f, Math.min(1.0f, xa2Var.f[i9].getInterpolation((i8 - xa2.m[i9]) / xa2.l[i9])));
                }
                if (xa2Var.i) {
                    Arrays.fill((int[]) xa2Var.c, g12.l(xa2Var.g.c[xa2Var.h], ((sx1) xa2Var.a).w));
                    xa2Var.i = false;
                }
                ((sx1) xa2Var.a).invalidateSelf();
                break;
            case 14:
                ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
                break;
            case 15:
                d85.a.R((View) obj, ((Float) obj2).floatValue());
                break;
            default:
                WeakHashMap weakHashMap3 = j65.a;
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
