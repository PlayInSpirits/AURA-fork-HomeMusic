package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import app.homemusic.R;
import defpackage.dx0;
import defpackage.rp3;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class DropDownPreference extends ListPreference {
    public final ArrayAdapter m0;
    public Spinner n0;
    public final dx0 o0;

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.dropdownPreferenceStyle);
        this.o0 = new dx0(0, this);
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, android.R.layout.simple_spinner_dropdown_item);
        this.m0 = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = this.h0;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.ListPreference
    public final void G(CharSequence[] charSequenceArr) {
        this.h0 = charSequenceArr;
        ArrayAdapter arrayAdapter = this.m0;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr2 = this.h0;
        if (charSequenceArr2 != null) {
            for (CharSequence charSequence : charSequenceArr2) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void h() {
        super.h();
        ArrayAdapter arrayAdapter = this.m0;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.Preference
    public final void l(rp3 rp3Var) {
        int length;
        Spinner spinner = (Spinner) rp3Var.a.findViewById(R.id.spinner);
        this.n0 = spinner;
        spinner.setAdapter((SpinnerAdapter) this.m0);
        this.n0.setOnItemSelectedListener(this.o0);
        Spinner spinner2 = this.n0;
        String str = this.j0;
        CharSequence[] charSequenceArr = this.i0;
        if (str == null || charSequenceArr == null) {
            length = -1;
        } else {
            length = charSequenceArr.length - 1;
            while (length >= 0) {
                if (!TextUtils.equals(charSequenceArr[length].toString(), str)) {
                    length--;
                }
            }
            length = -1;
        }
        spinner2.setSelection(length);
        super.l(rp3Var);
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    public final void m() {
        this.n0.performClick();
    }
}
