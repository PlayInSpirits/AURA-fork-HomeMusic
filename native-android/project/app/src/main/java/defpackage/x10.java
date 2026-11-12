package defpackage;

import android.widget.CompoundButton;
import androidx.preference.CheckBoxPreference;
import androidx.preference.SwitchPreference;
import androidx.preference.SwitchPreferenceCompat;
import androidx.preference.TwoStatePreference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class x10 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ TwoStatePreference b;

    public /* synthetic */ x10(TwoStatePreference r1, int r2) {
        this.a = r2;
        this.b = r1;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton r2, boolean r3) {
        int r0 = this.a;
        TwoStatePreference r1 = this.b;
        switch(r0) {
            case 0: goto L14;
            case 1: goto L9;
            default: goto L4;
        };
    L4:
        SwitchPreferenceCompat r4 = (SwitchPreferenceCompat) r1;
        if (r4.a(Boolean.valueOf(r3)) == true) goto L7;
        r2.setChecked(!r3);
        return;
    L7:
        r4.E(r3);
        return;
    L9:
        SwitchPreference r5 = (SwitchPreference) r1;
        if (r5.a(Boolean.valueOf(r3)) == true) goto L12;
        r2.setChecked(!r3);
        return;
    L12:
        r5.E(r3);
        return;
    L14:
        CheckBoxPreference r6 = (CheckBoxPreference) r1;
        if (r6.a(Boolean.valueOf(r3)) == true) goto L17;
        r2.setChecked(!r3);
        return;
    L17:
        r6.E(r3);
    }
}
