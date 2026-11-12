package defpackage;

import android.content.res.Resources;
import android.util.Base64;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class di0 implements go4 {
    public final /* synthetic */ int n;

    public /* synthetic */ di0(int r1) {
        this.n = r1;
    }

    @Override // defpackage.go4
    public final Object get() {
        switch(this.n) {
            case 0: goto L26;
            case 1: goto L19;
            case 2: goto L17;
            case 3: goto L16;
            case 4: goto L11;
            case 5: goto L28;
            default: goto L5;
        };
    L11:
        Resources r9 = Resources.getSystem();
        int r2 = r9.getDisplayMetrics().widthPixels;
        r2 = r9.getDimensionPixelSize(r9.getIdentifier("config_mediaMetadataBitmapMaxSize", "dimen", "android"));     // Catch: Resources.NotFoundException -> L27
    L14:
        return Integer.valueOf(r2);
    L17:
        byte[] r10 = new byte[12];
        nm0.i.nextBytes(r10);
        return Base64.encodeToString(r10, 10);
    L19:
        Resources r11 = Resources.getSystem();
        int r12 = r11.getDimensionPixelSize(r11.getIdentifier("notification_right_icon_size", "dimen", "android"));     // Catch: Resources.NotFoundException -> L22
    L24:
        return Integer.valueOf(r12);
    L22:
        r12 = (int) (r11.getDisplayMetrics().density * 48.0f);
        goto L24
    L28:
        return Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
    L8:
        e = move-exception;
        throw new IllegalStateException(e);
    L5:
        throw new IllegalStateException();
    L16:
        return new wl0(new gj0(), 50000, 1000, 50000, 50000, 1000, true, ly3.t);
    L26:
        return wr1.M(Executors.newSingleThreadExecutor());
    }
}
