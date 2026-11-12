package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import app.homemusic.R;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class j20 extends z41 {
    public final /* synthetic */ Chip D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j20(Chip chip, Chip chip2) {
        super(chip2);
        this.D = chip;
    }

    @Override // defpackage.z41
    public final int n(float f, float f2) {
        Rect rect = Chip.K;
        Chip chip = this.D;
        return (chip.d() && chip.getCloseIconTouchBounds().contains(f, f2)) ? 1 : 0;
    }

    @Override // defpackage.z41
    public final void o(ArrayList arrayList) {
        k20 k20Var;
        arrayList.add(0);
        Rect rect = Chip.K;
        Chip chip = this.D;
        if (!chip.d() || (k20Var = chip.r) == null || !k20Var.X || chip.u == null) {
            return;
        }
        arrayList.add(1);
    }

    @Override // defpackage.z41
    public final boolean s(int i, int i2, Bundle bundle) {
        boolean z = false;
        if (i2 == 16) {
            Chip chip = this.D;
            if (i == 0) {
                return chip.performClick();
            }
            if (i == 1) {
                chip.playSoundEffect(0);
                View.OnClickListener onClickListener = chip.u;
                if (onClickListener != null) {
                    onClickListener.onClick(chip);
                    z = true;
                }
                if (chip.G) {
                    chip.F.x(1, 1);
                }
            }
        }
        return z;
    }

    @Override // defpackage.z41
    public final void t(v3 v3Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = v3Var.a;
        Chip chip = this.D;
        k20 k20Var = chip.r;
        accessibilityNodeInfo.setCheckable(k20Var != null && k20Var.d0);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        v3Var.i(chip.getAccessibilityClassName());
        v3Var.n(chip.getText());
    }

    @Override // defpackage.z41
    public final void u(int i, v3 v3Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = v3Var.a;
        if (i != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.K);
            return;
        }
        Chip chip = this.D;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfo.setContentDescription(chip.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
        v3Var.b(o3.g);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
    }

    @Override // defpackage.z41
    public final void v(int i, boolean z) {
        if (i == 1) {
            Chip chip = this.D;
            chip.A = z;
            chip.refreshDrawableState();
        }
    }
}
