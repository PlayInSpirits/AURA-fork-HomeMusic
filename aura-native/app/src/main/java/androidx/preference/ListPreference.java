package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import app.homemusic.R;
import defpackage.bt3;
import defpackage.cc2;
import defpackage.ep3;
import defpackage.gi1;
import defpackage.tv1;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class ListPreference extends DialogPreference {
    public CharSequence[] h0;
    public CharSequence[] i0;
    public String j0;
    public String k0;
    public boolean l0;

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bt3.e, i, 0);
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(2);
        this.h0 = textArray == null ? obtainStyledAttributes.getTextArray(0) : textArray;
        CharSequence[] textArray2 = obtainStyledAttributes.getTextArray(3);
        this.i0 = textArray2 == null ? obtainStyledAttributes.getTextArray(1) : textArray2;
        if (obtainStyledAttributes.getBoolean(4, obtainStyledAttributes.getBoolean(4, false))) {
            if (tv1.n == null) {
                tv1.n = new tv1();
            }
            y(tv1.n);
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, bt3.g, i, 0);
        String string = obtainStyledAttributes2.getString(33);
        this.k0 = string == null ? obtainStyledAttributes2.getString(7) : string;
        obtainStyledAttributes2.recycle();
    }

    public final int E(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.i0) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (TextUtils.equals(this.i0[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    public final CharSequence F() {
        CharSequence[] charSequenceArr;
        int E = E(this.j0);
        if (E < 0 || (charSequenceArr = this.h0) == null) {
            return null;
        }
        return charSequenceArr[E];
    }

    public void G(CharSequence[] charSequenceArr) {
        this.h0 = charSequenceArr;
    }

    public final void H(String str) {
        boolean equals = TextUtils.equals(this.j0, str);
        if (equals && this.l0) {
            return;
        }
        this.j0 = str;
        this.l0 = true;
        t(str);
        if (equals) {
            return;
        }
        h();
    }

    @Override // androidx.preference.Preference
    public final CharSequence f() {
        ep3 ep3Var = this.Z;
        if (ep3Var != null) {
            return ep3Var.r(this);
        }
        CharSequence F = F();
        CharSequence f = super.f();
        String str = this.k0;
        if (str != null) {
            if (F == null) {
                F = "";
            }
            String format = String.format(str, F);
            if (!TextUtils.equals(format, f)) {
                Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
                return format;
            }
        }
        return f;
    }

    @Override // androidx.preference.Preference
    public final Object o(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // androidx.preference.Preference
    public final void p(Parcelable parcelable) {
        if (!parcelable.getClass().equals(cc2.class)) {
            super.p(parcelable);
            return;
        }
        cc2 cc2Var = (cc2) parcelable;
        super.p(cc2Var.getSuperState());
        H(cc2Var.n);
    }

    @Override // androidx.preference.Preference
    public final Parcelable q() {
        super.q();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.F) {
            return absSavedState;
        }
        cc2 cc2Var = new cc2();
        cc2Var.n = this.j0;
        return cc2Var;
    }

    @Override // androidx.preference.Preference
    public final void r(Object obj) {
        H(e((String) obj));
    }

    @Override // androidx.preference.Preference
    public final void x(CharSequence charSequence) {
        super.x(charSequence);
        if (charSequence == null) {
            this.k0 = null;
        } else {
            this.k0 = charSequence.toString();
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, gi1.p(context, app.homemusic.R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }
}
