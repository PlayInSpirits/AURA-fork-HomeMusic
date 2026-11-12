package defpackage;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class k15 implements vw2 {
    public static final k15 b = null;
    public final /* synthetic */ int a;

    static {
        b = new k15(0);
    }

    public /* synthetic */ k15(int r1) {
        this.a = r1;
    }

    @Override // defpackage.vw2
    public final uw2 a(na4 r6) {
        int r4 = 0;
        switch(this.a) {
            case 0: goto L21;
            case 1: goto L19;
            case 2: goto L17;
            case 3: goto L15;
            case 4: goto L13;
            case 5: goto L11;
            case 6: goto L9;
            case 7: goto L7;
            default: goto L5;
        };
    L5:
        return new x25(r6.f(qi1.class, InputStream.class));
    L7:
        return new pm4(r6.f(qi1.class, InputStream.class), 1);
    L9:
        return new pm4(r6.f(Uri.class, InputStream.class), 0);
    L11:
        return new pm4(r6.f(Uri.class, ParcelFileDescriptor.class), 0);
    L13:
        return new pm4(r6.f(Uri.class, AssetFileDescriptor.class), 0);
    L15:
        return new l15(1);
    L17:
        return new mw(r4, new pa(22));
    L19:
        return new mw(r4, new pa(21));
    L21:
        return l15.b;
    }
}
