package defpackage;

import android.view.View;
import com.eddyizm.tempus.App;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class io0 implements View.OnClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ f9 o;

    public /* synthetic */ io0(f9 f9Var, int i) {
        this.n = i;
        this.o = f9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.n) {
            case 0:
                this.o.dismiss();
                break;
            case 1:
                App.b().getClass();
                App.c().edit().putLong("server_unreachable", System.currentTimeMillis()).apply();
                this.o.dismiss();
                break;
            case 2:
                ud3.z0(true);
                this.o.dismiss();
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                App.b().getClass();
                App.c().edit().putBoolean("sync_starred_artists_for_offline_use", true).apply();
                this.o.dismiss();
                break;
            default:
                ud3.A0(true);
                this.o.dismiss();
                break;
        }
    }
}
