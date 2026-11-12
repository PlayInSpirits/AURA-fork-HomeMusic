package defpackage;

import android.content.DialogInterface;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wr implements DialogInterface.OnClickListener {
    public final /* synthetic */ int n;

    private final void a(DialogInterface dialogInterface, int i) {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.n) {
            case 0:
                xa3.t("battery_optimization", false);
                break;
            case 1:
                dialogInterface.cancel();
                break;
            case 2:
                dialogInterface.cancel();
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                break;
            case 4:
                dialogInterface.cancel();
                break;
            case 5:
                dialogInterface.cancel();
                break;
            case 6:
                dialogInterface.cancel();
                break;
            case 7:
                dialogInterface.cancel();
                break;
            case 8:
                dialogInterface.cancel();
                break;
            case 9:
                dialogInterface.cancel();
                break;
            case 10:
                dialogInterface.cancel();
                break;
            case 11:
                dialogInterface.cancel();
                break;
            case 12:
                dialogInterface.cancel();
                break;
            case 13:
                dialogInterface.cancel();
                break;
            case 14:
                dialogInterface.cancel();
                break;
            default:
                dialogInterface.cancel();
                break;
        }
    }
}
