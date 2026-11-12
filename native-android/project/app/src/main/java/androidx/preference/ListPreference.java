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

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class ListPreference extends DialogPreference {
    public CharSequence[] h0;
    public CharSequence[] i0;
    public String j0;
    public String k0;
    public boolean l0;

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bt3.e, i, 0);
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(2);
        this.h0 = textArray == null ? typedArrayObtainStyledAttributes.getTextArray(0) : textArray;
        CharSequence[] textArray2 = typedArrayObtainStyledAttributes.getTextArray(3);
        this.i0 = textArray2 == null ? typedArrayObtainStyledAttributes.getTextArray(1) : textArray2;
        if (typedArrayObtainStyledAttributes.getBoolean(4, typedArrayObtainStyledAttributes.getBoolean(4, false))) {
            if (tv1.n == null) {
                tv1.n = new tv1();
            }
            y(tv1.n);
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, bt3.g, i, 0);
        String string = typedArrayObtainStyledAttributes2.getString(33);
        this.k0 = string == null ? typedArrayObtainStyledAttributes2.getString(7) : string;
        typedArrayObtainStyledAttributes2.recycle();
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
        int iE = E(this.j0);
        if (iE < 0 || (charSequenceArr = this.h0) == null) {
            return null;
        }
        return charSequenceArr[iE];
    }

    public void G(CharSequence[] charSequenceArr) {
        this.h0 = charSequenceArr;
    }

    public final void H(String str) {
        boolean zEquals = TextUtils.equals(this.j0, str);
        if (zEquals && this.l0) {
            return;
        }
        this.j0 = str;
        this.l0 = true;
        t(str);
        if (zEquals) {
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
        CharSequence charSequenceF = F();
        CharSequence charSequenceF2 = super.f();
        String str = this.k0;
        if (str != null) {
            if (charSequenceF == null) {
                charSequenceF = "";
            }
            String str2 = String.format(str, charSequenceF);
            if (!TextUtils.equals(str2, charSequenceF2)) {
                Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
                return str2;
            }
        }
        return charSequenceF2;
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
        this(context, attributeSet, gi1.p(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }
}
