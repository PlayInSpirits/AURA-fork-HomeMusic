package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fs3 implements vw2 {
    public final Context a;
    public final Class b;

    public fs3(Context context, Class cls) {
        this.a = context;
        this.b = cls;
    }

    @Override // defpackage.vw2
    public final uw2 a(na4 na4Var) {
        Class cls = this.b;
        return new hs3(this.a, na4Var.f(File.class, cls), na4Var.f(Uri.class, cls), cls);
    }
}
