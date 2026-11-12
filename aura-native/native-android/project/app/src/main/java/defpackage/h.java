package defpackage;

import com.eddyizm.tempus.homemusic.WaveRetry;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    public final String a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(int i) {
        this("androidx.credentials.TYPE_ABORT_ERROR");
        switch (i) {
            case 1:
                this("androidx.credentials.TYPE_CONSTRAINT_ERROR");
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                this("androidx.credentials.TYPE_DATA_ERROR");
                break;
            case 4:
                this("androidx.credentials.TYPE_ENCODING_ERROR");
                break;
            case 10:
                this("androidx.credentials.TYPE_INVALID_STATE_ERROR");
                break;
            case 12:
                this("androidx.credentials.TYPE_NETWORK_ERROR");
                break;
            case 14:
                this("androidx.credentials.TYPE_NOT_ALLOWED_ERROR");
                break;
            case WaveRetry.MAX_FAILURES /* 16 */:
                this("androidx.credentials.TYPE_NOT_READABLE_ERROR");
                break;
            case 17:
                this("androidx.credentials.TYPE_NOT_SUPPORTED_ERROR");
                break;
            case 22:
                this("androidx.credentials.TYPE_SECURITY_ERROR");
                break;
            case 24:
                this("androidx.credentials.TYPE_TIMEOUT_ERROR");
                break;
            case 26:
                this("androidx.credentials.TYPE_UNKNOWN_ERROR");
                break;
            default:
                break;
        }
    }

    public h(String str) {
        this.a = str;
    }
}
