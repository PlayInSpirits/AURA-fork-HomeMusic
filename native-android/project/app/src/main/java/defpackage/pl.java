package defpackage;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pl extends ContentObserver {
    public final ContentResolver a;
    public final Uri b;
    public final /* synthetic */ ql c;

    public pl(ql r1, Handler r2, ContentResolver r3, Uri r4) {
        this.c = r1;
        super(r2);
        this.a = r3;
        this.b = r4;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean r3) {
        ql r2 = this.c;
        r2.a(nl.b(r2.a, r2.i, r2.h));
    }
}
