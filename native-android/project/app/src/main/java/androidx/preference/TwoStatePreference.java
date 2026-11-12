package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.widget.TextView;
import defpackage.zy4;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class TwoStatePreference extends Preference {
    public boolean b0;
    public CharSequence c0;
    public CharSequence d0;
    public boolean e0;
    public boolean f0;

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // androidx.preference.Preference
    public final boolean B() {
        boolean z = this.f0;
        boolean z2 = this.b0;
        if (!z) {
            z2 = !z2;
        }
        return z2 || super.B();
    }

    public final void E(boolean z) {
        boolean z2 = this.b0 != z;
        if (z2 || !this.e0) {
            this.b0 = z;
            this.e0 = true;
            if (C()) {
                boolean z3 = !z;
                if (C()) {
                    z3 = this.o.d().getBoolean(this.y, z3);
                }
                if (z != z3) {
                    SharedPreferences.Editor editorC = this.o.c();
                    editorC.putBoolean(this.y, z);
                    if (!this.o.a) {
                        editorC.apply();
                    }
                }
            }
            if (z2) {
                i(B());
                h();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0030  */
    /* JADX WARN: Code duplicated, block: B:20:0x003a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
    public final void F(View view) {
        boolean z;
        int i;
        CharSequence charSequenceF;
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            if (!this.b0 || TextUtils.isEmpty(this.c0)) {
                if (this.b0 || TextUtils.isEmpty(this.d0)) {
                    z = true;
                } else {
                    textView.setText(this.d0);
                }
                if (z) {
                    charSequenceF = f();
                    if (!TextUtils.isEmpty(charSequenceF)) {
                        textView.setText(charSequenceF);
                        z = false;
                    }
                }
                i = z ? 8 : 0;
                if (i != textView.getVisibility()) {
                    textView.setVisibility(i);
                }
            }
            textView.setText(this.c0);
            z = false;
            if (z) {
                charSequenceF = f();
                if (!TextUtils.isEmpty(charSequenceF)) {
                    textView.setText(charSequenceF);
                    z = false;
                }
            }
            if (z) {
            }
            if (i != textView.getVisibility()) {
                textView.setVisibility(i);
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void m() {
        boolean z = !this.b0;
        if (a(Boolean.valueOf(z))) {
            E(z);
        }
    }

    @Override // androidx.preference.Preference
    public final Object o(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    @Override // androidx.preference.Preference
    public final void p(Parcelable parcelable) {
        if (!parcelable.getClass().equals(zy4.class)) {
            super.p(parcelable);
            return;
        }
        zy4 zy4Var = (zy4) parcelable;
        super.p(zy4Var.getSuperState());
        E(zy4Var.n);
    }

    @Override // androidx.preference.Preference
    public final Parcelable q() {
        super.q();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.F) {
            return absSavedState;
        }
        zy4 zy4Var = new zy4();
        zy4Var.n = this.b0;
        return zy4Var;
    }

    @Override // androidx.preference.Preference
    public final void r(Object obj) {
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (C()) {
            zBooleanValue = this.o.d().getBoolean(this.y, zBooleanValue);
        }
        E(zBooleanValue);
    }
}
