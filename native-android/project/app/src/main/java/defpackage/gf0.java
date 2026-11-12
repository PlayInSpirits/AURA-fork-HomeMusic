package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import app.homemusic.R;
import com.eddyizm.tempus.ui.crash.CrashActivity;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class gf0 extends kc1 {
    public Button l0;
    public Button m0;

    public gf0() {
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater r2, ViewGroup r3, Bundle r4) {
        View r5 = r2.inflate(R.layout.fragment_crash_export, r3, false);
        this.l0 = (Button) r5.findViewById(R.id.crashExportButtonCopy);
        this.m0 = (Button) r5.findViewById(R.id.crashExportButtonShare);
        return r5;
    }

    @Override // defpackage.kc1
    public final void T(View r3, Bundle r4) {
        String r5 = ((CrashActivity) l()).N;
        final String r6 = b11.o(bu.m(Z()), "\n\n", r5);
        final int r1 = 0;
        this.l0.setOnClickListener(new ff0(this, r6, r1));
        final int r2 = 1;
        this.m0.setOnClickListener(new ff0(this, r6, r2));
    }
}
