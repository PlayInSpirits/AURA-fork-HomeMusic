package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import app.homemusic.R;
import defpackage.bt3;
import defpackage.ez2;
import defpackage.gi1;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {
    public final CharSequence[] h0;
    public final CharSequence[] i0;
    public final HashSet j0;

    /* JADX WARN: Illegal instructions before constructor call */
    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        int iP = gi1.p(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle);
        super(context, attributeSet, iP);
        this.j0 = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bt3.f, iP, 0);
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(2);
        this.h0 = textArray == null ? typedArrayObtainStyledAttributes.getTextArray(0) : textArray;
        CharSequence[] textArray2 = typedArrayObtainStyledAttributes.getTextArray(3);
        this.i0 = textArray2 == null ? typedArrayObtainStyledAttributes.getTextArray(1) : textArray2;
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void E(Set set) {
        HashSet hashSet = this.j0;
        hashSet.clear();
        hashSet.addAll(set);
        if (C()) {
            if (!set.equals(C() ? this.o.d().getStringSet(this.y, null) : null)) {
                SharedPreferences.Editor editorC = this.o.c();
                editorC.putStringSet(this.y, set);
                if (!this.o.a) {
                    editorC.apply();
                }
            }
        }
        h();
    }

    @Override // androidx.preference.Preference
    public final Object o(TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    @Override // androidx.preference.Preference
    public final void p(Parcelable parcelable) {
        if (!parcelable.getClass().equals(ez2.class)) {
            super.p(parcelable);
            return;
        }
        ez2 ez2Var = (ez2) parcelable;
        super.p(ez2Var.getSuperState());
        E(ez2Var.n);
    }

    @Override // androidx.preference.Preference
    public final Parcelable q() {
        super.q();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.F) {
            return absSavedState;
        }
        ez2 ez2Var = new ez2();
        ez2Var.n = this.j0;
        return ez2Var;
    }

    @Override // androidx.preference.Preference
    public final void r(Object obj) {
        Set<String> stringSet = (Set) obj;
        if (C()) {
            stringSet = this.o.d().getStringSet(this.y, stringSet);
        }
        E(stringSet);
    }
}
