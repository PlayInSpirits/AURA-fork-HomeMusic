package defpackage;

import android.content.Context;
import java.io.File;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sd0 implements pi1 {
    public final Object n;
    public volatile Object o;

    public sd0() {
        this.n = new CopyOnWriteArraySet();
    }

    public wq0 a() {
        if (((wq0) this.o) == null) {
            synchronized (this) {
                try {
                    if (((wq0) this.o) == null) {
                        e20 e20Var = (e20) this.n;
                        rm3 rm3Var = (rm3) e20Var.p;
                        String str = (String) rm3Var.o;
                        File cacheDir = ((Context) rm3Var.n).getCacheDir();
                        lr0 lr0Var = null;
                        File file = cacheDir == null ? null : new File(cacheDir, str);
                        if (file != null && (file.isDirectory() || file.mkdirs())) {
                            long j = e20Var.o;
                            lr0Var = new lr0();
                            lr0Var.q = new rm3(7);
                            lr0Var.p = file;
                            lr0Var.n = j;
                            lr0Var.o = new qr2(17);
                        }
                        this.o = lr0Var;
                    }
                    if (((wq0) this.o) == null) {
                        this.o = new om0(6);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (wq0) this.o;
    }

    @Override // defpackage.pi1
    public Object get() {
        if (this.o == null) {
            synchronized (this) {
                try {
                    if (this.o == null) {
                        Object obj = ((pi1) this.n).get();
                        h12.f(obj, "Argument must not be null");
                        this.o = obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.o;
    }

    public /* synthetic */ sd0(Object obj) {
        this.n = obj;
    }
}
