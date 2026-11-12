package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.InputStream;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rd0 extends tz3 {
    public final /* synthetic */ int a;
    public final hu2 b;
    public final Object c;
    public final Comparable d;

    public rd0(ContentResolver r2, Uri r3, String r4) {
        this.a = 0;
        r3.getClass();
        this.c = r2;
        this.d = r3;
        hu2 r5 = ve5.a(r4);     // Catch: IllegalArgumentException -> L5
    L6:
        this.b = r5;
        return;
    L5:
        r5 = null;
        goto L6
    }

    @Override // defpackage.tz3
    public final long contentLength() {
        switch(this.a) {
            case 0: goto L8;
            default: goto L4;
        };
    L4:
        Long r3 = (Long) ((b71) this.c).g((ge3) this.d).e;
        if (r3 != null) goto L7;
        return -1;
    L7:
        return r3.longValue();
    L8:
        return -1;
    }

    @Override // defpackage.tz3
    public final hu2 contentType() {
        switch(this.a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return this.b;
    L7:
        return this.b;
    }

    @Override // defpackage.tz3
    public final void writeTo(ew r4) {
        int r0 = this.a;
        Comparable r1 = this.d;
        Object r3 = this.c;
        r4.getClass();
        switch(r0) {
            case 0: goto L13;
            default: goto L4;
        };
    L4:
        ej4 r5 = ((b71) r3).k((ge3) r1);
        r4.p(r5);     // Catch: Throwable -> L8
        r5.close();
        return;
    L8:
        th = move-exception;
        throw th;     // Catch: Throwable -> L10
    L10:
        th = move-exception;
        q05.h(r5, th);
        throw th;
    L13:
        InputStream r6 = ((ContentResolver) r3).openInputStream((Uri) r1);
        if (r6 == null) goto L23;
        Logger r2 = p83.a;
        int r7 = 1;
        tk r8 = new tk(r7, r6, new fu4());
        r4.p(r8);     // Catch: Throwable -> L18
        r8.close();
        return;
    L18:
        th = move-exception;
        throw th;     // Catch: Throwable -> L20
    L20:
        th = move-exception;
        q05.h(r8, th);
        throw th;
    L23:
        mj0.i("Не удалось открыть файл");
    }

    public rd0(ge3 r2, b71 r3, hu2 r4) {
        this.a = 1;
        this.b = r4;
        this.c = r3;
        this.d = r2;
    }
}
