package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import app.homemusic.R;
import defpackage.bt3;
import defpackage.gi1;
import defpackage.gz0;
import defpackage.iz0;
import defpackage.om0;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {
    public String h0;
    public gz0 i0;

    /* JADX WARN: Illegal instructions before constructor call */
    public EditTextPreference(Context context, AttributeSet attributeSet) {
        int iP = gi1.p(context, R.attr.editTextPreferenceStyle, android.R.attr.editTextPreferenceStyle);
        super(context, attributeSet, iP);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bt3.d, iP, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(0, typedArrayObtainStyledAttributes.getBoolean(0, false))) {
            if (om0.o == null) {
                om0.o = new om0(19);
            }
            y(om0.o);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final boolean B() {
        return TextUtils.isEmpty(this.h0) || super.B();
    }

    public final void E(String str) {
        boolean zB = B();
        this.h0 = str;
        t(str);
        boolean zB2 = B();
        if (zB2 != zB) {
            i(zB2);
        }
        h();
    }

    @Override // androidx.preference.Preference
    public final Object o(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // androidx.preference.Preference
    public final void p(Parcelable parcelable) {
        if (!parcelable.getClass().equals(iz0.class)) {
            super.p(parcelable);
            return;
        }
        iz0 iz0Var = (iz0) parcelable;
        super.p(iz0Var.getSuperState());
        E(iz0Var.n);
    }

    @Override // androidx.preference.Preference
    public final Parcelable q() {
        super.q();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.F) {
            return absSavedState;
        }
        iz0 iz0Var = new iz0();
        iz0Var.n = this.h0;
        return iz0Var;
    }

    @Override // androidx.preference.Preference
    public final void r(Object obj) {
        E(e((String) obj));
    }
}
