package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fs3 implements vw2 {
    public final Context a;
    public final Class b;

    public fs3(Context r1, Class r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // defpackage.vw2
    public final uw2 a(na4 r5) {
        Class r2 = this.b;
        uw2 r1 = r5.f(File.class, r2);
        uw2 r6 = r5.f(Uri.class, r2);
        return new hs3(this.a, r1, r6, r2);
    }
}
