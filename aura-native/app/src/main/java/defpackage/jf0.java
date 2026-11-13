package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import app.homemusic.R;
import com.eddyizm.tempus.ui.crash.CrashActivity;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class jf0 extends kc1 {
    public TextView l0;

    @Override // defpackage.kc1
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(app.homemusic.R.layout.fragment_crash_logs, viewGroup, false);
        this.l0 = (TextView) inflate.findViewById(app.homemusic.R.id.crashLogsText);
        return inflate;
    }

    @Override // defpackage.kc1
    public final void T(View view, Bundle bundle) {
        this.l0.setText(((CrashActivity) e()).N);
    }
}
