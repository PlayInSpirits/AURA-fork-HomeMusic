package defpackage;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tk3 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ wk3 o;

    public /* synthetic */ tk3(wk3 wk3Var, int i) {
        this.n = i;
        this.o = wk3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        gq0 gq0Var = gq0.n;
        wk3 wk3Var = this.o;
        switch (i) {
            case 0:
                try {
                    wk3Var.X().runOnUiThread(new mm(wk3Var, u52.c().a ? u52.c().o : ((bj2) wk3Var.v0.get()).o0(), 5));
                } catch (Exception e) {
                    Log.e("PlayerQueueFragment", "Failed to get mediaBrowserListenableFuture in onResume", e);
                    return;
                }
                break;
            case 1:
                if (wk3Var.s0) {
                    wk3Var.k0();
                }
                break;
            case 2:
                yk3 yk3Var = wk3Var.w0;
                if (yk3Var != null) {
                    yk3Var.d();
                }
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                yk3 yk3Var2 = wk3Var.w0;
                if (yk3Var2 != null) {
                    yk3Var2.d();
                }
                break;
            case 4:
                try {
                    int iO0 = (u52.c().a ? u52.c().o : ((bj2) wk3Var.v0.get()).o0()) + 1;
                    int size = wk3Var.w0.s.size();
                    bl2 bl2Var = wk3Var.v0;
                    List list = wk3Var.w0.s;
                    WeakReference weakReference = bo2.a;
                    if (!u52.q("remove", iO0, size) && bl2Var != null) {
                        bl2Var.f(new vn2(bl2Var, iO0, size, list, 0), gq0Var);
                    }
                    ((RecyclerView) wk3Var.l0.t).getAdapter().n.f(iO0, size - iO0);
                } catch (Exception e2) {
                    Log.e("PlayerQueueFragment", "Error clearing queue", e2);
                }
                wk3Var.k0();
                break;
            case 5:
                if (wk3Var.l0 != null) {
                    View decorView = wk3Var.X().getWindow().getDecorView();
                    WeakHashMap weakHashMap = j65.a;
                    pb5 pb5VarA = b65.a(decorView);
                    int i2 = pb5VarA != null ? pb5VarA.a.h(519).d : 0;
                    RecyclerView recyclerView = (RecyclerView) wk3Var.l0.t;
                    recyclerView.setPadding(recyclerView.getPaddingLeft(), ((RecyclerView) wk3Var.l0.t).getPaddingTop(), ((RecyclerView) wk3Var.l0.t).getPaddingRight(), i2);
                    break;
                }
                break;
            default:
                try {
                    int iO1 = (u52.c().a ? u52.c().o : ((bj2) wk3Var.v0.get()).o0()) + 1;
                    int size2 = wk3Var.w0.s.size() - 1;
                    if (iO1 < size2) {
                        ArrayList arrayList = new ArrayList();
                        for (int i3 = iO1; i3 <= size2; i3++) {
                            arrayList.add(Integer.valueOf(i3));
                        }
                        while (arrayList.size() >= 2) {
                            int iRandom = (int) (Math.random() * ((double) arrayList.size()));
                            int iIntValue = ((Integer) arrayList.get(iRandom)).intValue();
                            arrayList.remove(iRandom);
                            int iRandom2 = (int) (Math.random() * ((double) arrayList.size()));
                            int iIntValue2 = ((Integer) arrayList.get(iRandom2)).intValue();
                            arrayList.remove(iRandom2);
                            Collections.swap(wk3Var.w0.s, iIntValue, iIntValue2);
                            ((RecyclerView) wk3Var.l0.t).getAdapter().n.c(iIntValue, iIntValue2);
                        }
                        bl2 bl2Var2 = wk3Var.v0;
                        List list2 = wk3Var.w0.s;
                        WeakReference weakReference2 = bo2.a;
                        list2.getClass();
                        if (!u52.r(list2, "reorder", 0, 0L) && bl2Var2 != null) {
                            bl2Var2.f(new vn2(bl2Var2, list2, iO1, size2), gq0Var);
                        }
                    }
                } catch (Exception e3) {
                    Log.e("PlayerQueueFragment", "Error shuffling queue", e3);
                }
                wk3Var.k0();
                break;
        }
    }
}
