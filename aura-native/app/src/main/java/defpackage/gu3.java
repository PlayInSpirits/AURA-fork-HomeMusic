package defpackage;

import android.app.Application;
import app.homemusic.R;
import com.eddyizm.tempus.subsonic.base.ApiResponse;
import com.eddyizm.tempus.subsonic.models.InternetRadioStation;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class gu3 extends hd {
    public final hh3 c;
    public InternetRadioStation d;
    public boolean e;
    public final k03 f;
    public final k03 g;

    public gu3(Application application) {
        super(application);
        this.e = false;
        this.f = new k03(Boolean.FALSE);
        this.g = new k03();
        this.c = new hh3(10);
    }

    public static void c(gu3 gu3Var, ApiResponse apiResponse) {
        String str;
        gu3Var.getClass();
        if (apiResponse.getSubsonicResponse().getError() != null) {
            str = apiResponse.getSubsonicResponse().getError().getMessage();
            if ("Not implemented".equals(str)) {
                Application application = gu3Var.b;
                application.getClass();
                str = application.getString(R.string.radio_dialog_not_supported_snackbar);
            }
        } else {
            str = "Unknown server error";
        }
        gu3Var.g.k(str);
    }
}
