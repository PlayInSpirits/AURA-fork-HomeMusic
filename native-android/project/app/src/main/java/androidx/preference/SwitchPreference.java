package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.Switch;
import app.homemusic.R;
import defpackage.bt3;
import defpackage.gi1;
import defpackage.rp3;
import defpackage.x10;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {
    public final x10 g0;
    public final String h0;
    public final String i0;

    /* JADX WARN: Illegal instructions before constructor call */
    public SwitchPreference(Context context, AttributeSet attributeSet) {
        int iP = gi1.p(context, R.attr.switchPreferenceStyle, android.R.attr.switchPreferenceStyle);
        super(context, attributeSet, iP);
        this.g0 = new x10(this, 1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bt3.l, iP, 0);
        String string = typedArrayObtainStyledAttributes.getString(7);
        this.c0 = string == null ? typedArrayObtainStyledAttributes.getString(0) : string;
        if (this.b0) {
            h();
        }
        String string2 = typedArrayObtainStyledAttributes.getString(6);
        this.d0 = string2 == null ? typedArrayObtainStyledAttributes.getString(1) : string2;
        if (!this.b0) {
            h();
        }
        String string3 = typedArrayObtainStyledAttributes.getString(9);
        this.h0 = string3 == null ? typedArrayObtainStyledAttributes.getString(3) : string3;
        h();
        String string4 = typedArrayObtainStyledAttributes.getString(8);
        this.i0 = string4 == null ? typedArrayObtainStyledAttributes.getString(4) : string4;
        h();
        this.f0 = typedArrayObtainStyledAttributes.getBoolean(5, typedArrayObtainStyledAttributes.getBoolean(2, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void G(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.b0);
        }
        if (z) {
            Switch r4 = (Switch) view;
            r4.setTextOn(this.h0);
            r4.setTextOff(this.i0);
            r4.setOnCheckedChangeListener(this.g0);
        }
    }

    @Override // androidx.preference.Preference
    public final void l(rp3 rp3Var) {
        super.l(rp3Var);
        G(rp3Var.s(android.R.id.switch_widget));
        F(rp3Var.s(android.R.id.summary));
    }

    @Override // androidx.preference.Preference
    public final void s(View view) {
        super.s(view);
        if (((AccessibilityManager) this.n.getSystemService("accessibility")).isEnabled()) {
            G(view.findViewById(android.R.id.switch_widget));
            F(view.findViewById(android.R.id.summary));
        }
    }
}
