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

    public /* synthetic */ x10(TwoStatePreference twoStatePreference, int i) {
        this.a = i;
        this.b = twoStatePreference;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.a;
        TwoStatePreference twoStatePreference = this.b;
        switch (i) {
            case 0:
                CheckBoxPreference checkBoxPreference = (CheckBoxPreference) twoStatePreference;
                if (!checkBoxPreference.a(Boolean.valueOf(z))) {
                    compoundButton.setChecked(!z);
                } else {
                    checkBoxPreference.E(z);
                }
                break;
            case 1:
                SwitchPreference switchPreference = (SwitchPreference) twoStatePreference;
                if (!switchPreference.a(Boolean.valueOf(z))) {
                    compoundButton.setChecked(!z);
                } else {
                    switchPreference.E(z);
                }
                break;
            default:
                SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) twoStatePreference;
                if (!switchPreferenceCompat.a(Boolean.valueOf(z))) {
                    compoundButton.setChecked(!z);
                } else {
                    switchPreferenceCompat.E(z);
                }
                break;
        }
    }
}
