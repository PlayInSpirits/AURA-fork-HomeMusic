package defpackage;

import android.os.Bundle;
import androidx.preference.ListPreference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class ec2 extends ip3 {
    public int J0;
    public CharSequence[] K0;
    public CharSequence[] L0;

    public ec2() {
    }

    @Override // defpackage.ip3, defpackage.pp0, defpackage.kc1
    public final void F(Bundle r3) {
        super.F(r3);
        if (r3 != null) goto L12;
        ListPreference r4 = (ListPreference) n0();
        if (r4.h0 != null) goto L7;
    L10:
        kf2.o("ListPreference requires an entries array and an entryValues array.");
        return;
    L7:
        if (r4.i0 == null) goto L10;
        this.J0 = r4.E(r4.j0);
        this.K0 = r4.h0;
        this.L0 = r4.i0;
        return;
    L12:
        this.J0 = r3.getInt("ListPreferenceDialogFragment.index", 0);
        this.K0 = r3.getCharSequenceArray("ListPreferenceDialogFragment.entries");
        this.L0 = r3.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
    }

    @Override // defpackage.ip3, defpackage.pp0, defpackage.kc1
    public final void Q(Bundle r3) {
        super.Q(r3);
        r3.putInt("ListPreferenceDialogFragment.index", this.J0);
        r3.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.K0);
        r3.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.L0);
    }

    @Override // defpackage.ip3
    public final void p0(boolean r2) {
        if (r2 == false) goto L9;
        int r3 = this.J0;
        if (r3 < 0) goto L10;
        String r4 = this.L0[r3].toString();
        ListPreference r1 = (ListPreference) n0();
        if (r1.a(r4) == false) goto L11;
        r1.H(r4);
        return;
    L11:
        return;
    L10:
        return;
    }

    @Override // defpackage.ip3
    public final void q0(e9 r4) {
        r4.g(this.K0, this.J0, new dc2(this));
        r4.f(null, null);
    }
}
