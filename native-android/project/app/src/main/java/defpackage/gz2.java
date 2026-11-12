package defpackage;

import android.os.Bundle;
import androidx.preference.MultiSelectListPreference;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class gz2 extends ip3 {
    public final HashSet J0 = new HashSet();
    public boolean K0;
    public CharSequence[] L0;
    public CharSequence[] M0;

    @Override // defpackage.ip3, defpackage.pp0, defpackage.kc1
    public final void F(Bundle bundle) {
        super.F(bundle);
        HashSet hashSet = this.J0;
        if (bundle != null) {
            hashSet.clear();
            hashSet.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.K0 = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.L0 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
            this.M0 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
            return;
        }
        MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) n0();
        CharSequence[] charSequenceArr = multiSelectListPreference.h0;
        CharSequence[] charSequenceArr2 = multiSelectListPreference.i0;
        if (charSequenceArr == null || charSequenceArr2 == null) {
            kf2.o("MultiSelectListPreference requires an entries array and an entryValues array.");
            return;
        }
        hashSet.clear();
        hashSet.addAll(multiSelectListPreference.j0);
        this.K0 = false;
        this.L0 = multiSelectListPreference.h0;
        this.M0 = charSequenceArr2;
    }

    @Override // defpackage.ip3, defpackage.pp0, defpackage.kc1
    public final void Q(Bundle bundle) {
        super.Q(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.J0));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.K0);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.L0);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.M0);
    }

    @Override // defpackage.ip3
    public final void p0(boolean z) {
        if (z && this.K0) {
            MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) n0();
            HashSet hashSet = this.J0;
            if (multiSelectListPreference.a(hashSet)) {
                multiSelectListPreference.E(hashSet);
            }
        }
        this.K0 = false;
    }

    @Override // defpackage.ip3
    public final void q0(e9 e9Var) {
        int length = this.M0.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.J0.contains(this.M0[i].toString());
        }
        CharSequence[] charSequenceArr = this.L0;
        fz2 fz2Var = new fz2(this);
        a9 a9Var = e9Var.a;
        a9Var.p = charSequenceArr;
        a9Var.x = fz2Var;
        a9Var.t = zArr;
        a9Var.u = true;
    }
}
