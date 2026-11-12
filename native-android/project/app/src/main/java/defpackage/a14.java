package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class a14 implements vw2 {
    public final /* synthetic */ int a;
    public final Resources b;

    public /* synthetic */ a14(Resources r1, int r2) {
        this.a = r2;
        this.b = r1;
    }

    @Override // defpackage.vw2
    public final uw2 a(na4 r4) {
        int r0 = this.a;
        Resources r3 = this.b;
        switch(r0) {
            case 0: goto L9;
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return new lk(r3, l15.b);
    L7:
        return new lk(r3, r4.f(Uri.class, InputStream.class));
    L9:
        return new lk(r3, r4.f(Uri.class, AssetFileDescriptor.class));
    }
}
