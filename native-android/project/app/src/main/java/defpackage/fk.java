package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fk extends jk {
    public final /* synthetic */ int r;

    public /* synthetic */ fk(ContentResolver r1, Uri r2, int r3) {
        this.r = r3;
        super(1, r2, r1);
    }

    @Override // defpackage.sh0
    public final Class a() {
        switch(this.r) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        return ParcelFileDescriptor.class;
    L6:
        return AssetFileDescriptor.class;
    }

    @Override // defpackage.jk
    public final void g(Object r1) {
        switch(this.r) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((ParcelFileDescriptor) r1).close();
        return;
    L6:
        ((AssetFileDescriptor) r1).close();
    }

    @Override // defpackage.jk
    public final Object h(ContentResolver r4, Uri r5) {
        switch(this.r) {
            case 0: goto L9;
            default: goto L4;
        };
    L4:
        AssetFileDescriptor r3 = r4.openAssetFileDescriptor(r5, "r");
        if (r3 != null) goto L14;
        mj0.k(r5, "FileDescriptor is null for: ");
        return null;
    L14:
        return r3.getParcelFileDescriptor();
    L9:
        AssetFileDescriptor r6 = r4.openAssetFileDescriptor(r5, "r");
        if (r6 != null) goto L15;
        mj0.k(r5, "FileDescriptor is null for: ");
        return null;
    L15:
        return r6;
    }
}
