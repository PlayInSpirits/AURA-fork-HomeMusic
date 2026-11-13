package defpackage;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class k15 implements vw2 {
    public static final k15 b = new k15(0);
    public final /* synthetic */ int a;

    public /* synthetic */ k15(int i) {
        this.a = i;
    }

    @Override // defpackage.vw2
    public final uw2 a(na4 na4Var) {
        int i = 0;
        switch (this.a) {
            case 0:
                return l15.b;
            case 1:
                return new mw(i, new pa(21));
            case 2:
                return new mw(i, new pa(22));
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return new l15(1);
            case 4:
                return new pm4(na4Var.f(Uri.class, AssetFileDescriptor.class), 0);
            case 5:
                return new pm4(na4Var.f(Uri.class, ParcelFileDescriptor.class), 0);
            case 6:
                return new pm4(na4Var.f(Uri.class, InputStream.class), 0);
            case 7:
                return new pm4(na4Var.f(qi1.class, InputStream.class), 1);
            default:
                return new x25(na4Var.f(qi1.class, InputStream.class));
        }
    }
}
