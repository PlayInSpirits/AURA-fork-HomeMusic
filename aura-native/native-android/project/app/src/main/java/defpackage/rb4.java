package defpackage;

import androidx.preference.Preference;
import androidx.preference.SwitchPreference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rb4 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ Preference o;

    public /* synthetic */ rb4(Preference preference, int i) {
        this.n = i;
        this.o = preference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        Preference preference = this.o;
        switch (i) {
            case 0:
                ((SwitchPreference) preference).E(false);
                break;
            case 1:
                ((SwitchPreference) preference).E(false);
                break;
            default:
                ((SwitchPreference) preference).E(false);
                break;
        }
    }
}
