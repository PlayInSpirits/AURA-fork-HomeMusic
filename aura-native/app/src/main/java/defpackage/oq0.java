package defpackage;

import android.app.Dialog;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.subsonic.models.Directory;
import com.eddyizm.tempus.ui.fragment.DirectoryFragment;
import com.eddyizm.tempus.ui.fragment.IndexFragment;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class oq0 implements a83 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AbstractList b;
    public final /* synthetic */ Serializable c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ oq0(Object obj, AbstractList abstractList, Serializable serializable, Object obj2, int i) {
        this.a = i;
        this.d = obj;
        this.b = abstractList;
        this.c = serializable;
        this.e = obj2;
    }

    @Override // defpackage.a83
    public final void b(Object obj) {
        switch (this.a) {
            case 0:
                DirectoryFragment directoryFragment = (DirectoryFragment) this.d;
                ArrayList arrayList = (ArrayList) this.b;
                AtomicInteger atomicInteger = (AtomicInteger) this.c;
                mq0 mq0Var = (mq0) this.e;
                Directory directory = (Directory) obj;
                if (directory != null && directory.getChildren() != null) {
                    for (Child child : directory.getChildren()) {
                        if (child.isDir()) {
                            String id = child.getId();
                            atomicInteger.incrementAndGet();
                            directoryFragment.q0.getClass();
                            om0.W(id).e(directoryFragment.v(), new oq0(directoryFragment, arrayList, atomicInteger, mq0Var, 0));
                        } else if (child.isVideo()) {
                            continue;
                        } else {
                            synchronized (arrayList) {
                                arrayList.add(child);
                            }
                        }
                    }
                }
                if (atomicInteger.decrementAndGet() == 0) {
                    mq0Var.run();
                    return;
                }
                return;
            case 1:
                IndexFragment indexFragment = (IndexFragment) this.d;
                ArrayList arrayList2 = (ArrayList) this.b;
                AtomicInteger atomicInteger2 = (AtomicInteger) this.c;
                tx1 tx1Var = (tx1) this.e;
                Directory directory2 = (Directory) obj;
                if (directory2 != null && directory2.getChildren() != null) {
                    for (Child child2 : directory2.getChildren()) {
                        if (child2.isDir()) {
                            String id2 = child2.getId();
                            atomicInteger2.incrementAndGet();
                            indexFragment.q0.getClass();
                            om0.W(id2).e(indexFragment.v(), new oq0(indexFragment, arrayList2, atomicInteger2, tx1Var, 1));
                        } else if (child2.isVideo()) {
                            continue;
                        } else {
                            synchronized (arrayList2) {
                                arrayList2.add(child2);
                            }
                        }
                    }
                }
                if (atomicInteger2.decrementAndGet() == 0) {
                    tx1Var.run();
                    return;
                }
                return;
            default:
                gl3 gl3Var = (gl3) this.d;
                AbstractList abstractList = this.b;
                String str = (String) this.c;
                Dialog dialog = (Dialog) this.e;
                List list = (List) obj;
                if (list != null) {
                    gl3Var.getClass();
                    abstractList.removeAll(hw.P(new nz2(14), list));
                }
                gl3Var.c.a(str, new ArrayList(abstractList), (Boolean) gl3Var.d.d());
                dialog.dismiss();
                return;
        }
    }
}
