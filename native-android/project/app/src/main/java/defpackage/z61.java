package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class z61 {
    public final String a;
    public final HashMap b;

    public z61(String r2) {
        this.b = new HashMap();
        this.a = r2;
    }

    public final File a(Uri r6) {
        String r0 = r6.getEncodedPath();
        int r1 = r0.indexOf(47, 1);
        if (r1 == (-1)) goto L17;
        String r3 = Uri.decode(r0.substring(1, r1));
        String r2 = Uri.decode(r0.substring(r1 + 1));
        File r5 = (File) this.b.get(r3);
        if (r5 == null) goto L15;
        File r7 = new File(r5, r2);
        File r8 = r7.getCanonicalFile();     // Catch: IOException -> L13
        String r4 = r8.getPath();
        String r9 = r5.getPath();
        if (a71.a(r4).startsWith(a71.a(r9).concat("/")) == false) goto L12;
        return r8;
    L12:
        throw new SecurityException("Resolved path jumped beyond configured root");
    L13:
        mj0.l(r7, "Failed to resolve canonical path for ");
        return null;
    L15:
        mj0.l(r6, "Unable to find configured root for ");
        return null;
    L17:
        mj0.l(r6, "Unable to find path from root: ");
        return null;
    }
}
