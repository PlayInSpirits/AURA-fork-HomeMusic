package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import app.homemusic.R;
import com.eddyizm.tempus.ui.crash.CrashActivity;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class jf0 extends kc1 {
    public TextView l0;

    public jf0() {
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater r2, ViewGroup r3, Bundle r4) {
        View r5 = r2.inflate(R.layout.fragment_crash_logs, r3, false);
        this.l0 = (TextView) r5.findViewById(R.id.crashLogsText);
        return r5;
    }

    @Override // defpackage.kc1
    public final void T(View r1, Bundle r2) {
        String r3 = ((CrashActivity) l()).N;
        this.l0.setText(r3);
    }
}
