package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class z61 {
    public final String a;
    public final HashMap b = new HashMap();

    public z61(String str) {
        this.a = str;
    }

    public final File a(Uri uri) {
        String encodedPath = uri.getEncodedPath();
        int indexOf = encodedPath.indexOf(47, 1);
        if (indexOf == -1) {
            mj0.l(uri, "Unable to find path from root: ");
            return null;
        }
        String decode = Uri.decode(encodedPath.substring(1, indexOf));
        String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
        File file = (File) this.b.get(decode);
        if (file == null) {
            mj0.l(uri, "Unable to find configured root for ");
            return null;
        }
        File file2 = new File(file, decode2);
        try {
            File canonicalFile = file2.getCanonicalFile();
            if (a71.a(canonicalFile.getPath()).startsWith(a71.a(file.getPath()).concat("/"))) {
                return canonicalFile;
            }
            throw new SecurityException("Resolved path jumped beyond configured root");
        } catch (IOException unused) {
            mj0.l(file2, "Failed to resolve canonical path for ");
            return null;
        }
    }
}
