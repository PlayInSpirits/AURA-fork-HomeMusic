package androidx.media3.exoplayer;

import android.os.Build;
import androidx.media3.exoplayer.image.ImageOutput;
import defpackage.f35;
import defpackage.qi3;
import defpackage.rr2;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public interface ExoPlayer extends qi3 {
    int a = getDefaultBufferSize();

    static int getDefaultBufferSize() {
        String str = f35.a;
        String strU = rr2.U(Build.DEVICE);
        return (strU.contains("emulator") || strU.contains("emu64a") || strU.contains("emu64x") || strU.contains("generic")) ? 30000 : 10000;
    }

    boolean isScrubbingModeEnabled();

    void setImageOutput(ImageOutput imageOutput);

    void setScrubbingModeEnabled(boolean z);
}
