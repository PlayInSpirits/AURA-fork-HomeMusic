/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.widget.PopupWindow;
import defpackage.eu3;

public final class yt3
implements PopupWindow.OnDismissListener {
    public final eu3 n;

    public yt3(eu3 eu32) {
        this.n = eu32;
    }

    @Override
    public final void onDismiss() {
        this.n.I0 = null;
    }
}

