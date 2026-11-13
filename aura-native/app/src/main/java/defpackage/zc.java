package defpackage;

import android.os.Looper;
import android.view.Choreographer;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class zc extends ThreadLocal {
    public final /* synthetic */ int a;

    public /* synthetic */ zc(int i) {
        this.a = i;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.a) {
            case 0:
                Choreographer choreographer = Choreographer.getInstance();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    bd bdVar = new bd(choreographer, wr1.m(myLooper));
                    return ya4.F(bdVar, bdVar.y);
                }
                kf2.o("no Looper on this thread");
                return null;
            case 1:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(ze5.b);
                return simpleDateFormat;
            case 2:
                return new Random();
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return Boolean.FALSE;
            default:
                return 0L;
        }
    }
}
