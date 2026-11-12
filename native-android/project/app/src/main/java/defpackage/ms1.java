package defpackage;

import com.eddyizm.tempus.App;
import com.eddyizm.tempus.homemusic.HubTracks$Item;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.ui.activity.MainActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ms1 {
    public static final ExecutorService a = Executors.newFixedThreadPool(4);
    public static volatile int b;

    public static void a(final MainActivity mainActivity, final List list, int i, final String str) {
        mainActivity.getClass();
        list.getClass();
        if (list.isEmpty()) {
            return;
        }
        final int iM = gb.m(i, 0, list.size() - 1);
        b++;
        final int i2 = b;
        io1.a.execute(new Runnable() { // from class: ks1
            @Override // java.lang.Runnable
            public final void run() {
                Object next;
                ExecutorService executorService = ms1.a;
                List list2 = list;
                ArrayList arrayListB = ms1.b(list2);
                ArrayList arrayList = new ArrayList();
                int size = arrayListB.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayListB.get(i3);
                    i3++;
                    if (obj != null) {
                        arrayList.add(obj);
                    }
                }
                Iterator it = q40.u0(arrayListB, iM).iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((Child) next) == null);
                Child child = (Child) next;
                if (child == null) {
                    child = (Child) q40.x0(arrayList);
                }
                io1.b.post(new ls1(i2, mainActivity, child, arrayList, list2, str));
            }
        });
    }

    public static ArrayList b(List list) {
        Object s14Var;
        Object objSubmit;
        String songId;
        list.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            HubTracks$Item hubTracks$Item = (HubTracks$Item) it.next();
            String ref = hubTracks$Item.getRef();
            if (ref != null && !qm4.u0(ref) && (songId = hubTracks$Item.getSongId()) != null && !qm4.u0(songId)) {
                String strG = xa3.g("hub:", hubTracks$Item.getRef());
                String songId2 = hubTracks$Item.getSongId();
                HashMap map = n61.a;
                synchronized (n61.class) {
                    if (songId2 != null) {
                        if (!n61.a.containsKey(n61.e(1, songId2))) {
                            String strE = n61.e(1, strG);
                            String str = "SONG:" + songId2;
                            if (!n61.e(1, songId2).equals(strE)) {
                                n61.c.put(str, strE);
                            }
                        }
                    }
                }
            }
        }
        int i = 0;
        gp3 gp3VarC = App.f(false).c();
        ArrayList arrayList = new ArrayList(r40.k0(list, 10));
        Iterator it2 = list.iterator();
        while (true) {
            String str2 = null;
            if (!it2.hasNext()) {
                break;
            }
            HubTracks$Item hubTracks$Item2 = (HubTracks$Item) it2.next();
            String songId3 = hubTracks$Item2.getSongId();
            if (songId3 != null && !qm4.u0(songId3)) {
                str2 = songId3;
            }
            if (str2 == null) {
                ConcurrentHashMap concurrentHashMap = ot1.a;
                objSubmit = CompletableFuture.completedFuture(ot1.b(hubTracks$Item2));
            } else {
                objSubmit = a.submit(new ei0(2, gp3VarC, str2));
            }
            arrayList.add(objSubmit);
        }
        ArrayList arrayList2 = new ArrayList(r40.k0(arrayList, 10));
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            int i3 = i + 1;
            if (i < 0) {
                gb.c0();
                throw null;
            }
            try {
                s14Var = (Child) ((Future) obj).get(30L, TimeUnit.SECONDS);
            } catch (Throwable th) {
                s14Var = new s14(th);
            }
            if (s14Var instanceof s14) {
                s14Var = null;
            }
            Child childB = (Child) s14Var;
            if (childB == null) {
                Object obj2 = list.get(i);
                if (((HubTracks$Item) obj2).getSongId() == null) {
                    obj2 = null;
                }
                HubTracks$Item hubTracks$Item3 = (HubTracks$Item) obj2;
                if (hubTracks$Item3 != null) {
                    ConcurrentHashMap concurrentHashMap2 = ot1.a;
                    childB = ot1.b(hubTracks$Item3);
                } else {
                    childB = null;
                }
            }
            arrayList2.add(childB);
            i = i3;
        }
        return arrayList2;
    }
}
