package androidx.preference;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import app.homemusic.R;
import defpackage.gi1;
import defpackage.rp3;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, gi1.p(context, R.attr.preferenceCategoryStyle, android.R.attr.preferenceCategoryStyle), 0);
    }

    @Override // androidx.preference.Preference
    public final boolean B() {
        return !super.g();
    }

    @Override // androidx.preference.Preference
    public final boolean g() {
        return false;
    }

    @Override // androidx.preference.Preference
    public void l(rp3 rp3Var) {
        super.l(rp3Var);
        if (Build.VERSION.SDK_INT >= 28) {
            rp3Var.a.setAccessibilityHeading(true);
        }
    }
}
