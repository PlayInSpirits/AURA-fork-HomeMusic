package defpackage;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public interface xs {
    ic2 g(Uri uri);

    default ic2 i(do2 do2Var) {
        byte[] bArr = do2Var.k;
        if (bArr != null) {
            return j(bArr);
        }
        Uri uri = do2Var.m;
        if (uri != null) {
            return g(uri);
        }
        return null;
    }

    ic2 j(byte[] bArr);
}
