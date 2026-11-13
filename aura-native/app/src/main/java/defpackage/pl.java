package defpackage;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class pl extends ContentObserver {
    public final ContentResolver a;
    public final Uri b;
    public final /* synthetic */ ql c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pl(ql qlVar, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.c = qlVar;
        this.a = contentResolver;
        this.b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        ql qlVar = this.c;
        qlVar.a(nl.b(qlVar.a, qlVar.i, qlVar.h));
    }
}
