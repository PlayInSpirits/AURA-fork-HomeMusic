package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.eddyizm.tempus.homemusic.SmartSession;
import defpackage.hh3;
import defpackage.yy1;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements yy1 {
    @Override // defpackage.yy1
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.yy1
    public final Object b(Context context) {
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback(this) { // from class: uq3
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                (Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new lf(applicationContext, 6), new Random().nextInt(Math.max(1000, 1)) + SmartSession.MAX_SONGS);
            }
        });
        return new hh3(5);
    }
}
