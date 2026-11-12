package defpackage;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h65 {
    public static String[] a(View r0) {
        return r0.getReceiveContentMimeTypes();
    }

    public static ld0 b(View r1, ld0 r2) {
        ContentInfo r0 = r2.a.t();
        Objects.requireNonNull(r0);
        ContentInfo r3 = r1.performReceiveContent(r0);
        if (r3 != null) goto L6;
        return null;
    L6:
        if (r3 != r0) goto L9;
        return r2;
    L9:
        return new ld0(new zh0(r3));
    }
}
