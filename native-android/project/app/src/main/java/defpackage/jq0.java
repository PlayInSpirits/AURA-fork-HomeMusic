package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import java.io.InputStream;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jq0 implements vw2 {
    public final /* synthetic */ int a;
    public final Context b;

    public /* synthetic */ jq0(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // defpackage.vw2
    public final uw2 a(na4 na4Var) {
        int i = this.a;
        Context context = this.b;
        switch (i) {
            case 0:
                return new lk(context, this);
            case 1:
                return new lk(context, this);
            case 2:
                return new lk(context, this);
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return new du2(context, 0);
            case 4:
                return new du2(context, 1);
            case 5:
                return new du2(context, 2);
            case 6:
                return new lk(context, na4Var.f(Integer.class, AssetFileDescriptor.class));
            default:
                return new lk(context, na4Var.f(Integer.class, InputStream.class));
        }
    }
}
