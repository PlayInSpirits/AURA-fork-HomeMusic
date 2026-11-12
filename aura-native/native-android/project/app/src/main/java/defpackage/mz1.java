package defpackage;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mz1 implements nz1 {
    public final InputContentInfo n;

    public mz1(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.n = new InputContentInfo(uri, clipDescription, uri2);
    }

    @Override // defpackage.nz1
    public final Uri a() {
        return this.n.getContentUri();
    }

    @Override // defpackage.nz1
    public final void b() {
        this.n.requestPermission();
    }

    @Override // defpackage.nz1
    public final Uri c() {
        return this.n.getLinkUri();
    }

    @Override // defpackage.nz1
    public final Object d() {
        return this.n;
    }

    @Override // defpackage.nz1
    public final ClipDescription getDescription() {
        return this.n.getDescription();
    }

    public mz1(Object obj) {
        this.n = (InputContentInfo) obj;
    }
}
