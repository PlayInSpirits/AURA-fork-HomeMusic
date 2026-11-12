package defpackage;

import com.eddyizm.tempus.homemusic.PlayEvent;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lh3 {
    public final File a;
    public final nk1 b = new nk1();
    public ArrayList c;

    public lh3(File file) {
        this.a = file;
    }

    public final List a() throws IOException {
        ArrayList arrayList;
        ArrayList arrayList2 = this.c;
        if (arrayList2 != null) {
            return arrayList2;
        }
        File file = this.a;
        File file2 = new File(file.getPath() + ".bak");
        if (!file.exists() && file2.exists() && !file2.renameTo(file)) {
            kf2.o("Check failed.");
            return null;
        }
        if (file.exists()) {
            List list = (List) this.b.f(ji2.H(file), new TypeToken<List<? extends PlayEvent>>() { // from class: com.eddyizm.tempus.homemusic.PlayEventStore$load$loaded$parsed$1
            }.getType());
            if (list == null) {
                kf2.n("Listening outbox is not a JSON array");
                return null;
            }
            arrayList = new ArrayList(list);
        } else {
            arrayList = new ArrayList();
        }
        this.c = arrayList;
        return arrayList;
    }

    public final synchronized void b(Map map) {
        try {
            List listA = a();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listA) {
                if (map.containsKey(((PlayEvent) obj).getEventId())) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(r40.k0(arrayList, 10));
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                Object obj2 = arrayList.get(i2);
                i2++;
                arrayList2.add(((PlayEvent) obj2).getRejected());
            }
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj3 = arrayList.get(i3);
                i3++;
                PlayEvent playEvent = (PlayEvent) obj3;
                playEvent.setRejected((String) map.get(playEvent.getEventId()));
            }
            try {
                d(listA);
            } catch (Exception e) {
                int size3 = arrayList.size();
                int i4 = 0;
                while (i4 < size3) {
                    Object obj4 = arrayList.get(i4);
                    i4++;
                    int i5 = i + 1;
                    if (i < 0) {
                        gb.c0();
                        throw null;
                    }
                    ((PlayEvent) obj4).setRejected((String) arrayList2.get(i));
                    i = i5;
                }
                throw e;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(List list) {
        try {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                hashSet.add(((PlayEvent) it.next()).getEventId());
            }
            ArrayList arrayList = new ArrayList(a());
            if (v40.p0(arrayList, new kh3(hashSet, 0))) {
                d(arrayList);
                this.c = arrayList;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void d(List list) throws IOException {
        File file = this.a;
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            kf2.o("Check failed.");
            return;
        }
        File file2 = new File(file.getPath() + ".tmp");
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        try {
            String strJ = this.b.j(list);
            strJ.getClass();
            byte[] bytes = strJ.getBytes(w10.a);
            bytes.getClass();
            fileOutputStream.write(bytes);
            fileOutputStream.getFD().sync();
            fileOutputStream.close();
            if (file2.renameTo(file)) {
                return;
            }
            File file3 = new File(file.getPath() + ".bak");
            if (file3.exists() && !file3.delete()) {
                kf2.o("Check failed.");
                return;
            }
            boolean zExists = file.exists();
            if (zExists && !file.renameTo(file3)) {
                kf2.o("Check failed.");
                return;
            }
            if (file2.renameTo(file)) {
                if (!zExists || file3.delete()) {
                    return;
                }
                kf2.o("Check failed.");
                return;
            }
            if (!zExists || file3.renameTo(file)) {
                mj0.i("Could not replace listening outbox");
            } else {
                kf2.o("Check failed.");
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                q05.h(fileOutputStream, th);
                throw th2;
            }
        }
    }
}
