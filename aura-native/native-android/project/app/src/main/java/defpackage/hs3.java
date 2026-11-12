package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hs3 implements uw2 {
    public final Context a;
    public final uw2 b;
    public final uw2 c;
    public final Class d;

    public hs3(Context context, uw2 uw2Var, uw2 uw2Var2, Class cls) {
        this.a = context.getApplicationContext();
        this.b = uw2Var;
        this.c = uw2Var2;
        this.d = cls;
    }

    @Override // defpackage.uw2
    public final boolean a(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && hw.s((Uri) obj);
    }

    @Override // defpackage.uw2
    public final tw2 b(Object obj, int i, int i2, db3 db3Var) {
        Uri uri = (Uri) obj;
        return new tw2(new s73(uri), new gs3(this.a, this.b, this.c, uri, i, i2, db3Var, this.d));
    }
}
