package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import app.homemusic.R;
import defpackage.gi1;
import defpackage.kc1;
import defpackage.kp3;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {
    public final boolean j0;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, gi1.p(context, app.homemusic.R.attr.preferenceScreenStyle, android.R.attr.preferenceScreenStyle), 0);
        this.j0 = true;
    }

    @Override // androidx.preference.Preference
    public final void m() {
        kc1 kc1Var;
        if (this.z != null || this.A != null || this.d0.size() == 0 || (kc1Var = (kp3) this.o.j) == null) {
            return;
        }
        for (kc1Var = (kp3) this.o.j; kc1Var != null; kc1Var = kc1Var.I) {
        }
    }
}
