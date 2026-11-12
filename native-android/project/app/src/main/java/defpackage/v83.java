package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v83 {
    public boolean b;
    public final ArrayList a = new ArrayList();
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();

    public v83(boolean z) {
        this.b = z;
    }

    public abstract void a();

    public final void b() throws Exception {
        boolean zIsTerminated;
        CopyOnWriteArrayList copyOnWriteArrayList = this.c;
        Iterator it = copyOnWriteArrayList.iterator();
        it.getClass();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                copyOnWriteArrayList.clear();
                ArrayList arrayList = this.a;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((u83) obj).a();
                }
                arrayList.clear();
                return;
            }
            AutoCloseable autoCloseable = (AutoCloseable) it.next();
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else if (autoCloseable instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) autoCloseable;
                if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                    executorService.shutdown();
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (i == 0) {
                                executorService.shutdownNow();
                                i = 1;
                            }
                        }
                    }
                    if (i != 0) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
            } else {
                if (!(autoCloseable instanceof MediaDrm)) {
                    nz2.c();
                    return;
                }
                ((MediaDrm) autoCloseable).release();
            }
        }
    }

    public final void c(boolean z) {
        w33 w33Var;
        this.b = z;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            u83 u83Var = (u83) obj;
            boolean z2 = u83Var.e && z;
            if (u83Var.b != z2) {
                u83Var.b = z2;
                bq4 bq4Var = u83Var.c;
                if (bq4Var != null && (w33Var = (w33) bq4Var.o) != null) {
                    w33Var.b();
                }
            }
        }
    }
}
