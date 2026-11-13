package defpackage;

import android.content.res.Resources;
import android.util.Base64;
import java.util.concurrent.Executors;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class di0 implements go4 {
    public final /* synthetic */ int n;

    public /* synthetic */ di0(int i) {
        this.n = i;
    }

    @Override // defpackage.go4
    public final Object get() {
        int i;
        switch (this.n) {
            case 0:
                return wr1.M(Executors.newSingleThreadExecutor());
            case 1:
                Resources system = Resources.getSystem();
                try {
                    i = system.getDimensionPixelSize(system.getIdentifier("notification_right_icon_size", "dimen", "android"));
                } catch (Resources.NotFoundException unused) {
                    i = (int) (system.getDisplayMetrics().density * 48.0f);
                }
                return Integer.valueOf(i);
            case 2:
                byte[] bArr = new byte[12];
                nm0.i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return new wl0(new gj0(), 50000, 1000, 50000, 50000, 1000, true, ly3.t);
            case 4:
                Resources system2 = Resources.getSystem();
                int i2 = system2.getDisplayMetrics().widthPixels;
                try {
                    i2 = system2.getDimensionPixelSize(system2.getIdentifier("config_mediaMetadataBitmapMaxSize", "dimen", "android"));
                } catch (Resources.NotFoundException unused2) {
                }
                return Integer.valueOf(i2);
            case 5:
                try {
                    return Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            default:
                throw new IllegalStateException();
        }
    }
}
