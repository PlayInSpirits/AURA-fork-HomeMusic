package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.InputStream;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class a14 implements vw2 {
    public final /* synthetic */ int a;
    public final Resources b;

    public /* synthetic */ a14(Resources resources, int i) {
        this.a = i;
        this.b = resources;
    }

    @Override // defpackage.vw2
    public final uw2 a(na4 na4Var) {
        int i = this.a;
        Resources resources = this.b;
        switch (i) {
            case 0:
                return new lk(resources, na4Var.f(Uri.class, AssetFileDescriptor.class));
            case 1:
                return new lk(resources, na4Var.f(Uri.class, InputStream.class));
            default:
                return new lk(resources, l15.b);
        }
    }
}
