package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import app.homemusic.R;
import defpackage.bt3;
import defpackage.ec2;
import defpackage.gi1;
import defpackage.gz2;
import defpackage.jz0;
import defpackage.kc1;
import defpackage.kp3;
import defpackage.nz2;
import defpackage.pp0;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class DialogPreference extends Preference {
    public final CharSequence b0;
    public final String c0;
    public final Drawable d0;
    public final String e0;
    public final String f0;
    public final int g0;

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bt3.c, i, 0);
        String string = typedArrayObtainStyledAttributes.getString(9);
        string = string == null ? typedArrayObtainStyledAttributes.getString(0) : string;
        this.b0 = string;
        if (string == null) {
            this.b0 = this.u;
        }
        String string2 = typedArrayObtainStyledAttributes.getString(8);
        this.c0 = string2 == null ? typedArrayObtainStyledAttributes.getString(1) : string2;
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(6);
        this.d0 = drawable == null ? typedArrayObtainStyledAttributes.getDrawable(2) : drawable;
        String string3 = typedArrayObtainStyledAttributes.getString(11);
        this.e0 = string3 == null ? typedArrayObtainStyledAttributes.getString(3) : string3;
        String string4 = typedArrayObtainStyledAttributes.getString(10);
        this.f0 = string4 == null ? typedArrayObtainStyledAttributes.getString(4) : string4;
        this.g0 = typedArrayObtainStyledAttributes.getResourceId(7, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public void m() {
        pp0 gz2Var;
        kp3 kp3Var = (kp3) this.o.i;
        if (kp3Var != null) {
            for (kc1 kc1Var = kp3Var; kc1Var != null; kc1Var = kc1Var.I) {
            }
            if (kp3Var.q().D("androidx.preference.PreferenceFragment.DIALOG") != null) {
                return;
            }
            if (this instanceof EditTextPreference) {
                String str = this.y;
                gz2Var = new jz0();
                Bundle bundle = new Bundle(1);
                bundle.putString("key", str);
                gz2Var.c0(bundle);
            } else if (this instanceof ListPreference) {
                String str2 = this.y;
                gz2Var = new ec2();
                Bundle bundle2 = new Bundle(1);
                bundle2.putString("key", str2);
                gz2Var.c0(bundle2);
            } else {
                if (!(this instanceof MultiSelectListPreference)) {
                    nz2.t(getClass().getSimpleName(), ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.", "Cannot display dialog for an unknown Preference type: ");
                    return;
                }
                String str3 = this.y;
                gz2Var = new gz2();
                Bundle bundle3 = new Bundle(1);
                bundle3.putString("key", str3);
                gz2Var.c0(bundle3);
            }
            gz2Var.f0(kp3Var);
            gz2Var.m0(kp3Var.q(), "androidx.preference.PreferenceFragment.DIALOG");
        }
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, gi1.p(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }
}
