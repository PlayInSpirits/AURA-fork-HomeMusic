package defpackage;

import android.util.Log;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.database.AppDatabase;
import com.eddyizm.tempus.model.Queue;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vs3 {
    public static final ExecutorService b = null;
    public final ns3 a;

    static {
        b = Executors.newSingleThreadExecutor();
    }

    public vs3() {
        this.a = AppDatabase.y().E();
    }

    public static void d(List r8, String r9, long r10) {
        Log.d("QueueRepository", "Saving play queue to server - Items: " + r8.size() + ", Current: " + r9);
        rm3 r0 = App.f(false).b();
        r0.getClass();
        Log.d("BookmarksClient", "savePlayQueue()");
        ((mt) r0.o).e(((pn4) r0.n).f(), r8, r9, r10).enqueue(new hh3(8));
    }

    public final Queue a() {
        lg1 r0 = new lg1(22, this.a);
        Thread r2 = new Thread(r0);
        r2.start();
        r2.join();     // Catch: InterruptedException -> L5
        return (Queue) r0.p;
    L5:
        e = move-exception;
        e.printStackTrace();
        return null;
    }

    public final List b() {
        ArrayList r0 = new ArrayList();
        lg1 r1 = new lg1(23, this.a);
        Thread r3 = new Thread(r1);
        r3.start();
        r3.join();     // Catch: InterruptedException -> L5
        return (List) ((List) r1.p).stream().map(new bi2(29)).collect(Collectors.toList());
    L5:
        e = move-exception;
        e.printStackTrace();
        return r0;
    }

    public final void c(final List r2, final boolean r3, final int r4) {
        Runnable r0 = new ts3(this, r4, r3, r2);
        b.execute(r0);
    }
}
