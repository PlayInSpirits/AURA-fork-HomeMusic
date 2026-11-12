package defpackage;

import android.util.Log;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.database.AppDatabase;
import com.eddyizm.tempus.model.Queue;
import com.eddyizm.tempus.subsonic.models.Child;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vs3 {
    public static final ExecutorService b = Executors.newSingleThreadExecutor();
    public final ns3 a = AppDatabase.y().E();

    public static void d(List list, String str, long j) {
        Log.d("QueueRepository", "Saving play queue to server - Items: " + list.size() + ", Current: " + str);
        rm3 rm3VarB = App.f(false).b();
        rm3VarB.getClass();
        Log.d("BookmarksClient", "savePlayQueue()");
        ((mt) rm3VarB.o).e(((pn4) rm3VarB.n).f(), list, str, j).enqueue(new hh3(8));
    }

    public final Queue a() {
        lg1 lg1Var = new lg1(22, this.a);
        Thread thread = new Thread(lg1Var);
        thread.start();
        try {
            thread.join();
            return (Queue) lg1Var.p;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public final List b() {
        ArrayList arrayList = new ArrayList();
        lg1 lg1Var = new lg1(23, this.a);
        Thread thread = new Thread(lg1Var);
        thread.start();
        try {
            thread.join();
            return (List) ((List) lg1Var.p).stream().map(new bi2(29)).collect(Collectors.toList());
        } catch (InterruptedException e) {
            e.printStackTrace();
            return arrayList;
        }
    }

    public final void c(final List list, final boolean z, final int i) {
        b.execute(new Runnable() { // from class: ts3
            @Override // java.lang.Runnable
            public final void run() {
                int size;
                vs3 vs3Var = this.n;
                ns3 ns3Var = vs3Var.a;
                List arrayList = new ArrayList();
                int i2 = 0;
                if (z) {
                    size = 0;
                } else {
                    arrayList = ns3Var.c();
                    size = i;
                }
                if (size < 0) {
                    size = 0;
                } else if (size > arrayList.size()) {
                    size = arrayList.size();
                }
                List list2 = (List) new ArrayList(list).stream().filter(new tj(vs3Var, arrayList)).collect(Collectors.toList());
                for (int i3 = 0; i3 < list2.size(); i3++) {
                    arrayList.add(size + i3, new Queue((Child) list2.get(i3)));
                }
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    ((Queue) arrayList.get(i4)).setTrackOrder(i4);
                }
                xl.E((s24) ns3Var.o, false, true, new ls3(ns3Var, arrayList, i2));
            }
        });
    }
}
