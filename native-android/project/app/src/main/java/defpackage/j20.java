package defpackage;

import android.content.Context;
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

    public j20(Chip r1, Chip r2) {
        this.D = r1;
        super(r2);
    }

    @Override // defpackage.z41
    public final int n(float r2, float r3) {
        Rect r0 = Chip.K;
        Chip r1 = this.D;
        if (r1.d() == true) goto L5;
        return 0;
    L5:
        if (Chip.a(r1).contains(r2, r3) == false) goto L10;
        return 1;
    L10:
        return 0;
    }

    @Override // defpackage.z41
    public final void o(ArrayList r2) {
        r2.add(0);
        Rect r0 = Chip.K;
        Chip r1 = this.D;
        if (r1.d() == false) goto L12;
        k20 r3 = r1.r;
        if (r3 != null) goto L7;
        return;
    L7:
        if (r3.X == true) goto L9;
        return;
    L9:
        if (r1.u == null) goto L15;
        r2.add(1);
        return;
    L15:
        return;
    }

    @Override // defpackage.z41
    public final boolean s(int r2, int r3, Bundle r4) {
        boolean r0 = false;
        if (r3 != 16) goto L16;
        Chip r1 = this.D;
        if (r2 != 0) goto L9;
        return r1.performClick();
    L9:
        if (r2 != 1) goto L16;
        r1.playSoundEffect(0);
        View.OnClickListener r5 = r1.u;
        if (r5 == null) goto L14;
        r5.onClick(r1);
        r0 = true;
    L14:
        if (r1.G == false) goto L16;
        r1.F.x(1, 1);
    L16:
        return r0;
    }

    @Override // defpackage.z41
    public final void t(v3 r3) {
        AccessibilityNodeInfo r0 = r3.a;
        Chip r2 = this.D;
        k20 r1 = r2.r;
        if (r1 != null) goto L5;
    L7:
        boolean r4 = false;
    L8:
        r0.setCheckable(r4);
        r0.setClickable(r2.isClickable());
        r3.i(r2.getAccessibilityClassName());
        r3.n(r2.getText());
        return;
    L5:
        if (r1.d0 == false) goto L7;
        r4 = true;
        goto L8
    }

    @Override // defpackage.z41
    public final void u(int r5, v3 r6) {
        AccessibilityNodeInfo r0 = r6.a;
        CharSequence r2 = "";
        if (r5 != 1) goto L13;
        Chip r4 = this.D;
        CharSequence r7 = r4.getCloseIconContentDescription();
        if (r7 == null) goto L7;
        r0.setContentDescription(r7);
    L11:
        r0.setBoundsInParent(Chip.b(r4));
        r6.b(o3.g);
        r0.setEnabled(r4.isEnabled());
        return;
    L7:
        CharSequence r8 = r4.getText();
        Context r1 = r4.getContext();
        if (TextUtils.isEmpty(r8) == true) goto L10;
        r2 = r8;
    L10:
        r0.setContentDescription(r1.getString(R.string.mtrl_chip_close_icon_content_description, new Object[]{r2}).trim());
        goto L11
    L13:
        r0.setContentDescription("");
        r0.setBoundsInParent(Chip.K);
    }

    @Override // defpackage.z41
    public final void v(int r2, boolean r3) {
        if (r2 != 1) goto L6;
        Chip r1 = this.D;
        r1.A = r3;
        r1.refreshDrawableState();
        return;
    }
}
