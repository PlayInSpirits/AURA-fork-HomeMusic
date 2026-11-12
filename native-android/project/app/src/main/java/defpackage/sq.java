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

    public sq(Slider slider) {
        super(slider);
        this.E = new Rect();
        this.D = slider;
    }

    @Override // defpackage.z41
    public final int n(float f, float f2) {
        int i = 0;
        while (true) {
            Slider slider = this.D;
            if (i >= slider.getValues().size()) {
                return -1;
            }
            Rect rect = this.E;
            slider.t(i, rect);
            if (rect.contains((int) f, (int) f2)) {
                return i;
            }
            i++;
        }
    }

    @Override // defpackage.z41
    public final void o(ArrayList arrayList) {
        for (int i = 0; i < this.D.getValues().size(); i++) {
            arrayList.add(Integer.valueOf(i));
        }
    }

    @Override // defpackage.z41
    public final boolean s(int i, int i2, Bundle bundle) {
        Slider slider = this.D;
        if (!slider.isEnabled()) {
            return false;
        }
        if (i2 != 4096 && i2 != 8192) {
            if (i2 != 16908349 || bundle == null || !bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE") || !slider.r(i, bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"))) {
                return false;
            }
            slider.u();
            slider.postInvalidate();
            p(i);
            return true;
        }
        float fRound = slider.e0;
        if (fRound == 0.0f) {
            fRound = 1.0f;
        }
        float f = (slider.a0 - slider.W) / fRound;
        if (f > 20.0f) {
            fRound *= Math.round(f / 20.0f);
        }
        if (i2 == 8192) {
            fRound = -fRound;
        }
        if (slider.j()) {
            fRound = -fRound;
        }
        if (!slider.r(i, su3.k(slider.getValues().get(i).floatValue() + fRound, slider.getValueFrom(), slider.getValueTo()))) {
            return false;
        }
        slider.u();
        slider.postInvalidate();
        p(i);
        return true;
    }

    @Override // defpackage.z41
    public final void u(int i, v3 v3Var) {
        String string;
        AccessibilityNodeInfo accessibilityNodeInfo = v3Var.a;
        v3Var.b(o3.t);
        Slider slider = this.D;
        List<Float> values = slider.getValues();
        float fFloatValue = values.get(i).floatValue();
        float valueFrom = slider.getValueFrom();
        float valueTo = slider.getValueTo();
        if (slider.isEnabled()) {
            if (fFloatValue > valueFrom) {
                v3Var.a(8192);
            }
            if (fFloatValue < valueTo) {
                v3Var.a(4096);
            }
        }
        accessibilityNodeInfo.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, valueFrom, valueTo, fFloatValue));
        v3Var.i(SeekBar.class.getName());
        StringBuilder sb = new StringBuilder();
        if (slider.getContentDescription() != null) {
            sb.append(slider.getContentDescription());
            sb.append(",");
        }
        String strE = slider.e(fFloatValue);
        String string2 = slider.getContext().getString(R.string.material_slider_value);
        if (values.size() > 1) {
            if (i == slider.getValues().size() - 1) {
                string = slider.getContext().getString(R.string.material_slider_range_end);
            } else {
                string = i == 0 ? slider.getContext().getString(R.string.material_slider_range_start) : "";
            }
            string2 = string;
        }
        Locale locale = Locale.US;
        sb.append(string2 + ", " + strE);
        accessibilityNodeInfo.setContentDescription(sb.toString());
        Rect rect = this.E;
        slider.t(i, rect);
        accessibilityNodeInfo.setBoundsInParent(rect);
    }
}
