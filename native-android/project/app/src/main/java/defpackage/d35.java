package defpackage;

import java.io.File;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d35 {
    public static final Charset a = null;

    static {
        a = Charset.forName("US-ASCII");
        Charset.forName("UTF-8");
    }

    public static void a(File r4) {
        File[] r0 = r4.listFiles();
        if (r0 == null) goto L14;
        int r5 = r0.length;
        int r1 = 0;
    L5:
        if (r1 >= r5) goto L18;
        File r2 = r0[r1];
        if (r2.isDirectory() == false) goto L10;
        a(r2);
    L10:
        if (r2.delete() == false) goto L12;
        r1 = r1 + 1;
        goto L5
    L12:
        tb4.d(r2, "failed to delete file: ");
        return;
    L18:
        return;
    L14:
        tb4.d(r4, "not a readable directory: ");
    }
}
