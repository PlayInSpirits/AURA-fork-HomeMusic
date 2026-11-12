package defpackage;

import android.app.Application;
import app.homemusic.R;
import com.eddyizm.tempus.subsonic.base.ApiResponse;
import com.eddyizm.tempus.subsonic.models.InternetRadioStation;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class gu3 extends hd {
    public final hh3 c;
    public InternetRadioStation d;
    public boolean e;
    public final k03 f;
    public final k03 g;

    public gu3(Application r2) {
        super(r2);
        this.e = false;
        this.f = new k03(Boolean.FALSE);
        this.g = new k03();
        this.c = new hh3(10);
    }

    public static void c(gu3 r1, ApiResponse r2) {
        r1.getClass();
        if (r2.getSubsonicResponse().getError() == null) goto L7;
        String r3 = r2.getSubsonicResponse().getError().getMessage();
        if ("Not implemented".equals(r3) == false) goto L8;
        Application r4 = r1.b;
        r4.getClass();
        r3 = r4.getString(R.string.radio_dialog_not_supported_snackbar);
    L8:
        r1.g.k(r3);
        return;
    L7:
        r3 = "Unknown server error";
        goto L8
    }
}
