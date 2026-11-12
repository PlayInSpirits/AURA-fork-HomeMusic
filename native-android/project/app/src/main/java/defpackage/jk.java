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

    public /* synthetic */ jk(int i, Comparable comparable, Object obj) {
        this.n = i;
        this.q = obj;
        this.p = comparable;
    }

    private final void b() {
    }

    private final void f() {
    }

    @Override // defpackage.sh0
    public final void c() {
        switch (this.n) {
            case 0:
                Object obj = this.o;
                if (obj != null) {
                    try {
                        g(obj);
                    } catch (IOException unused) {
                        return;
                    }
                    break;
                }
                break;
            default:
                Object obj2 = this.o;
                if (obj2 != null) {
                    try {
                        g(obj2);
                    } catch (IOException unused2) {
                        return;
                    }
                }
                break;
        }
    }

    @Override // defpackage.sh0
    public final void cancel() {
        int i = this.n;
    }

    @Override // defpackage.sh0
    public final void d(eq3 eq3Var, rh0 rh0Var) {
        int i = this.n;
        Object obj = this.q;
        Comparable comparable = this.p;
        switch (i) {
            case 0:
                try {
                    Object objI = i((AssetManager) obj, (String) comparable);
                    this.o = objI;
                    rh0Var.f(objI);
                } catch (IOException e) {
                    if (Log.isLoggable("AssetPathFetcher", 3)) {
                        Log.d("AssetPathFetcher", "Failed to load data from asset manager", e);
                    }
                    rh0Var.b(e);
                }
                break;
            default:
                try {
                    Object objH = h((ContentResolver) obj, (Uri) comparable);
                    this.o = objH;
                    rh0Var.f(objH);
                } catch (FileNotFoundException e2) {
                    if (Log.isLoggable("LocalUriFetcher", 3)) {
                        Log.d("LocalUriFetcher", "Failed to open Uri", e2);
                    }
                    rh0Var.b(e2);
                    return;
                }
                break;
        }
    }

    @Override // defpackage.sh0
    public final int e() {
        switch (this.n) {
        }
        return 1;
    }

    public abstract void g(Object obj);

    public abstract Object h(ContentResolver contentResolver, Uri uri);

    public abstract Object i(AssetManager assetManager, String str);
}
