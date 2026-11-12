package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetManager;
import android.net.Uri;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jk implements sh0 {
    public final /* synthetic */ int n;
    public Object o;
    public final Comparable p;
    public final Object q;

    public /* synthetic */ jk(int r1, Comparable r2, Object r3) {
        this.n = r1;
        this.q = r3;
        this.p = r2;
    }

    private final void b() {
    }

    private final void f() {
    }

    @Override // defpackage.sh0
    public final void c() {
        switch(this.n) {
            case 0: goto L8;
            default: goto L4;
        };
    L4:
        Object r0 = this.o;
        if (r0 == null) goto L19;
        g(r0);     // Catch: IOException -> L13
        return;
    L20:
        return;
    L19:
        return;
    L8:
        Object r1 = this.o;
        if (r1 == null) goto L21;
        g(r1);     // Catch: IOException -> L14
        return;
    L22:
        return;
    }

    @Override // defpackage.sh0
    public final void cancel() {
        int r0 = this.n;
    }

    @Override // defpackage.sh0
    public final void d(eq3 r4, rh0 r5) {
        int r6 = this.n;
        Object r1 = this.q;
        Comparable r2 = this.p;
        switch(r6) {
            case 0: goto L20;
            default: goto L22;
        };
    L20:
        Object r7 = i((AssetManager) r1, (String) r2);     // Catch: IOException -> L14
        this.o = r7;     // Catch: IOException -> L14
        r5.f(r7);     // Catch: IOException -> L14
        return;
    L14:
        e = move-exception;
        if (Log.isLoggable("AssetPathFetcher", 3) == false) goto L18;
        Log.d("AssetPathFetcher", "Failed to load data from asset manager", e);
    L18:
        r5.b(e);
        return;
    L22:
        ContentResolver r3 = (ContentResolver) r1;     // Catch: FileNotFoundException -> L6
        Object r8 = h(r3, (Uri) r2);     // Catch: FileNotFoundException -> L6
        this.o = r8;     // Catch: FileNotFoundException -> L6
        r5.f(r8);     // Catch: FileNotFoundException -> L6
        return;
    L6:
        e = move-exception;
        if (Log.isLoggable("LocalUriFetcher", 3) == false) goto L10;
        Log.d("LocalUriFetcher", "Failed to open Uri", e);
    L10:
        r5.b(e);
    }

    @Override // defpackage.sh0
    public final int e() {
        switch(this.n) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        return 1;
    L6:
        return 1;
    }

    public abstract void g(Object r1);

    public abstract Object h(ContentResolver r1, Uri r2);

    public abstract Object i(AssetManager r1, String r2);
}
