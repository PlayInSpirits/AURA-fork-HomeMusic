package defpackage;

import android.os.Bundle;
import androidx.preference.ListPreference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class ec2 extends ip3 {
    public int J0;
    public CharSequence[] K0;
    public CharSequence[] L0;

    @Override // defpackage.ip3, defpackage.pp0, defpackage.kc1
    public final void F(Bundle bundle) {
        super.F(bundle);
        if (bundle != null) {
            this.J0 = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.K0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.L0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        ListPreference listPreference = (ListPreference) n0();
        if (listPreference.h0 == null || listPreference.i0 == null) {
            kf2.o("ListPreference requires an entries array and an entryValues array.");
            return;
        }
        this.J0 = listPreference.E(listPreference.j0);
        this.K0 = listPreference.h0;
        this.L0 = listPreference.i0;
    }

    @Override // defpackage.ip3, defpackage.pp0, defpackage.kc1
    public final void Q(Bundle bundle) {
        super.Q(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.J0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.K0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.L0);
    }

    @Override // defpackage.ip3
    public final void p0(boolean z) {
        int i;
        if (!z || (i = this.J0) < 0) {
            return;
        }
        String string = this.L0[i].toString();
        ListPreference listPreference = (ListPreference) n0();
        if (listPreference.a(string)) {
            listPreference.H(string);
        }
    }

    @Override // defpackage.ip3
    public final void q0(e9 e9Var) {
        e9Var.g(this.K0, this.J0, new dc2(this));
        e9Var.f(null, null);
    }
}
