package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import app.homemusic.R;
import com.google.android.material.slider.Slider;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sq extends z41 {
    public final Slider D;
    public final Rect E;

    public sq(Slider r2) {
        super(r2);
        this.E = new Rect();
        this.D = r2;
    }

    @Override // defpackage.z41
    public final int n(float r5, float r6) {
        int r0 = 0;
    L3:
        Slider r1 = this.D;
        if (r0 >= r1.getValues().size()) goto L9;
        Rect r2 = this.E;
        r1.t(r0, r2);
        if (r2.contains((int) r5, (int) r6) == true) goto L7;
        r0 = r0 + 1;
        goto L3
    L7:
        return r0;
    L9:
        return -1;
    }

    @Override // defpackage.z41
    public final void o(ArrayList r3) {
        int r0 = 0;
    L4:
        if (r0 >= this.D.getValues().size()) goto L6;
        r3.add(Integer.valueOf(r0));
        r0 = r0 + 1;
        goto L4
    }

    @Override // defpackage.z41
    public final boolean s(int r7, int r8, Bundle r9) {
        Slider r0 = this.D;
        if (r0.isEnabled() == true) goto L6;
        return false;
    L6:
        if (r8 == 4096) goto L19;
        if (r8 == 8192) goto L19;
        if (r8 != 16908349) goto L40;
        if (r9 != null) goto L13;
        return false;
    L13:
        if (r9.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE") == true) goto L16;
        return false;
    L16:
        if (r0.r(r7, r9.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) == false) goto L37;
        r0.u();
        r0.postInvalidate();
        p(r7);
        return true;
    L37:
        return false;
    L40:
        return false;
    L19:
        float r10 = r0.e0;
        if (r10 != 0.0f) goto L22;
        r10 = 1.0f;
    L22:
        float r1 = (r0.a0 - r0.W) / r10;
        if (r1 <= 20.0f) goto L26;
        r10 = r10 * Math.round(r1 / 20.0f);
    L26:
        if (r8 != 8192) goto L29;
        r10 = -r10;
    L29:
        if (r0.j() == false) goto L32;
        r10 = -r10;
    L32:
        if (r0.r(r7, su3.k(r0.getValues().get(r7).floatValue() + r10, r0.getValueFrom(), r0.getValueTo())) == false) goto L38;
        r0.u();
        r0.postInvalidate();
        p(r7);
        return true;
    L38:
        return false;
    }

    @Override // defpackage.z41
    public final void u(int r8, v3 r9) {
        AccessibilityNodeInfo r0 = r9.a;
        r9.b(o3.t);
        Slider r1 = this.D;
        List<Float> r2 = r1.getValues();
        float r3 = r2.get(r8).floatValue();
        float r4 = r1.getValueFrom();
        float r5 = r1.getValueTo();
        if (r1.isEnabled() == true) goto L5;
    L10:
        r0.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, r4, r5, r3));
        r9.i(SeekBar.class.getName());
        StringBuilder r10 = new StringBuilder();
        if (r1.getContentDescription() == null) goto L13;
        r10.append(r1.getContentDescription());
        r10.append(",");
    L13:
        String r6 = r1.e(r3);
        String r7 = r1.getContext().getString(R.string.material_slider_value);
        if (r2.size() > 1) goto L16;
    L22:
        Locale r11 = Locale.US;
        r10.append(r7 + ", " + r6);
        r0.setContentDescription(r10.toString());
        Rect r12 = this.E;
        r1.t(r8, r12);
        r0.setBoundsInParent(r12);
        return;
    L16:
        if (r8 != (r1.getValues().size() - 1)) goto L19;
        String r13 = r1.getContext().getString(R.string.material_slider_range_end);
    L18:
        r7 = r13;
        goto L22
    L19:
        if (r8 != 0) goto L21;
        r13 = r1.getContext().getString(R.string.material_slider_range_start);
        goto L18
    L21:
        r13 = "";
        goto L18
    L5:
        if (r3 <= r4) goto L8;
        r9.a(8192);
    L8:
        if (r3 >= r5) goto L10;
        r9.a(4096);
        goto L10
    }
}
