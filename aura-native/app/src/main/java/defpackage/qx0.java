package defpackage;

import android.text.TextUtils;
import com.eddyizm.tempus.homemusic.PlayEvent;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class qx0 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public /* synthetic */ qx0(int i, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static qx0 a(String str) {
        char c;
        rr2.l(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        for (int i6 = 0; i6 < split.length; i6++) {
            String U = rr2.U(split[i6].trim());
            U.getClass();
            switch (U.hashCode()) {
                case 100571:
                    if (U.equals("end")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 3556653:
                    if (U.equals("text")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 102749521:
                    if (U.equals("layer")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 109757538:
                    if (U.equals(PlayEvent.START)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 109780401:
                    if (U.equals("style")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    i3 = i6;
                    break;
                case 1:
                    i5 = i6;
                    break;
                case 2:
                    i = i6;
                    break;
                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                    i2 = i6;
                    break;
                case 4:
                    i4 = i6;
                    break;
            }
        }
        if (i2 == -1 || i3 == -1 || i5 == -1) {
            return null;
        }
        return new qx0(i, i2, i3, i4, i5, split.length);
    }
}
