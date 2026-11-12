package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rd0 extends tz3 {
    public final /* synthetic */ int a = 0;
    public final hu2 b;
    public final Object c;
    public final Comparable d;

    public rd0(ContentResolver contentResolver, Uri uri, String str) {
        hu2 hu2VarA;
        uri.getClass();
        this.c = contentResolver;
        this.d = uri;
        try {
            hu2VarA = ve5.a(str);
        } catch (IllegalArgumentException unused) {
            hu2VarA = null;
        }
        this.b = hu2VarA;
    }

    @Override // defpackage.tz3
    public final long contentLength() {
        switch (this.a) {
            case 0:
                return -1L;
            default:
                Long l = (Long) ((b71) this.c).g((ge3) this.d).e;
                if (l != null) {
                    return l.longValue();
                }
                return -1L;
        }
    }

    @Override // defpackage.tz3
    public final hu2 contentType() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b;
    }

    @Override // defpackage.tz3
    public final void writeTo(ew ewVar) throws IOException {
        int i = this.a;
        Comparable comparable = this.d;
        Object obj = this.c;
        ewVar.getClass();
        switch (i) {
            case 0:
                InputStream inputStreamOpenInputStream = ((ContentResolver) obj).openInputStream((Uri) comparable);
                if (inputStreamOpenInputStream == null) {
                    mj0.i("Не удалось открыть файл");
                    return;
                }
                Logger logger = p83.a;
                tk tkVar = new tk(1, inputStreamOpenInputStream, new fu4());
                try {
                    ewVar.p(tkVar);
                    tkVar.close();
                    return;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        q05.h(tkVar, th);
                        throw th2;
                    }
                }
            default:
                ej4 ej4VarK = ((b71) obj).k((ge3) comparable);
                try {
                    ewVar.p(ej4VarK);
                    ej4VarK.close();
                    return;
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        q05.h(ej4VarK, th3);
                        throw th4;
                    }
                }
        }
    }

    public rd0(ge3 ge3Var, b71 b71Var, hu2 hu2Var) {
        this.b = hu2Var;
        this.c = b71Var;
        this.d = ge3Var;
    }
}
