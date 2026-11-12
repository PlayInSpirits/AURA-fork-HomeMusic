package defpackage;

import android.os.Bundle;
import androidx.preference.MultiSelectListPreference;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class gz2 extends ip3 {
    public final HashSet J0;
    public boolean K0;
    public CharSequence[] L0;
    public CharSequence[] M0;

    public gz2() {
        this.J0 = new HashSet();
    }

    @Override // defpackage.ip3, defpackage.pp0, defpackage.kc1
    public final void F(Bundle r5) {
        super.F(r5);
        HashSet r1 = this.J0;
        if (r5 != null) goto L11;
        MultiSelectListPreference r6 = (MultiSelectListPreference) n0();
        CharSequence[] r2 = r6.h0;
        CharSequence[] r3 = r6.i0;
        if (r2 == null) goto L9;
        if (r3 == null) goto L9;
        r1.clear();
        r1.addAll(r6.j0);
        this.K0 = false;
        this.L0 = r6.h0;
        this.M0 = r3;
        return;
    L9:
        kf2.o("MultiSelectListPreference requires an entries array and an entryValues array.");
        return;
    L11:
        r1.clear();
        r1.addAll(r5.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
        this.K0 = r5.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
        this.L0 = r5.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
        this.M0 = r5.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
    }

    @Override // defpackage.ip3, defpackage.pp0, defpackage.kc1
    public final void Q(Bundle r3) {
        super.Q(r3);
        r3.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList(this.J0));
        r3.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.K0);
        r3.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.L0);
        r3.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.M0);
    }

    @Override // defpackage.ip3
    public final void p0(boolean r3) {
        if (r3 == true) goto L4;
    L8:
        this.K0 = false;
        return;
    L4:
        if (this.K0 == false) goto L8;
        MultiSelectListPreference r4 = (MultiSelectListPreference) n0();
        HashSet r0 = this.J0;
        if (r4.a(r0) == false) goto L8;
        r4.E(r0);
        goto L8
    }

    @Override // defpackage.ip3
    public final void q0(e9 r6) {
        int r0 = this.M0.length;
        boolean[] r1 = new boolean[r0];
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L5;
        String r3 = this.M0[r2].toString();
        r1[r2] = this.J0.contains(r3);
        r2 = r2 + 1;
        goto L3
    L5:
        CharSequence[] r4 = this.L0;
        fz2 r5 = new fz2(this);
        a9 r7 = r6.a;
        r7.p = r4;
        r7.x = r5;
        r7.t = r1;
        r7.u = true;
    }
}
