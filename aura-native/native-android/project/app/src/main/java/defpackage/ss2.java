package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.MenuItem;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import app.homemusic.R;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.ui.fragment.PlaylistEditorFragment;
import com.eddyizm.tempus.ui.fragment.SongListPageFragment;
import com.google.android.material.search.SearchBar;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ss2 implements it2, gt2, jg2, q33, av4, tx, g3, gz3, mk, rc2, eg1, np4, fz, wc0, ro4 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ ss2(ip0 ip0Var, cy3 cy3Var) {
        this.n = 12;
        this.o = ip0Var;
    }

    @Override // defpackage.q33
    public boolean a(MenuItem menuItem) {
        v23 v23Var = (v23) this.o;
        v23Var.getClass();
        menuItem.getClass();
        return uo.C(menuItem, v23Var);
    }

    @Override // defpackage.wc0
    public void accept(Object obj) {
        int i = this.n;
        Object obj2 = this.o;
        switch (i) {
            case 21:
                un4 un4Var = (un4) obj2;
                lg0 lg0Var = (lg0) obj;
                tn4 tn4Var = new tn4(lg0Var.b, i80.y(lg0Var.a, lg0Var.c));
                un4Var.c.add(tn4Var);
                long j = un4Var.j;
                if (j == -9223372036854775807L || lg0Var.d >= j) {
                    un4Var.g(tn4Var);
                }
                break;
            default:
                ((uw1) obj2).c((lg0) obj);
                break;
        }
    }

    @Override // defpackage.eg1
    /* JADX INFO: renamed from: apply, reason: collision with other method in class */
    public Object mo77apply(Object obj) {
        int i = this.n;
        Object obj2 = this.o;
        switch (i) {
            case 17:
                Bitmap bitmapCreateScaledBitmap = (Bitmap) obj;
                int width = bitmapCreateScaledBitmap.getWidth();
                int i2 = ((x7) obj2).o;
                if (width > i2 || bitmapCreateScaledBitmap.getHeight() > i2) {
                    float f = i2;
                    float width2 = bitmapCreateScaledBitmap.getWidth();
                    float height = bitmapCreateScaledBitmap.getHeight();
                    float fMin = Math.min(f / width2, f / height);
                    bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, (int) (width2 * fMin), (int) (height * fMin), true);
                }
                return Build.VERSION.SDK_INT >= 31 ? bitmapCreateScaledBitmap.asShared() : bitmapCreateScaledBitmap;
            default:
                return ((x05) obj2).b((Type) obj);
        }
    }

    @Override // defpackage.tx
    public void b(long j, long j2, long j3) {
        zq3 zq3Var = (zq3) this.o;
        if (zq3Var.e == null) {
            return;
        }
        float fU = (j == -1 || j == 0) ? -1.0f : f35.U(j2, j);
        kt0 kt0Var = zq3Var.e;
        kt0Var.getClass();
        kt0Var.b(j, j2, fU);
    }

    @Override // defpackage.ro4
    public so4 c(y10 y10Var) {
        Context context = (Context) this.o;
        String str = (String) y10Var.e;
        uv uvVar = (uv) y10Var.f;
        uvVar.getClass();
        if (str != null && str.length() != 0) {
            return new bf1(context, str, uvVar, true, true);
        }
        kf2.n("Must set a non-null database name to a configuration that uses the no backup directory.");
        return null;
    }

    public void d() {
        wf1 wf1Var = (wf1) this.o;
        synchronized (jh4.c) {
            List list = jh4.h;
            list.getClass();
            ArrayList arrayList = new ArrayList(r40.k0(list, 10));
            boolean z = false;
            for (Object obj : list) {
                boolean z2 = true;
                if (!z && h12.c(obj, wf1Var)) {
                    z = true;
                    z2 = false;
                }
                if (z2) {
                    arrayList.add(obj);
                }
            }
            jh4.h = arrayList;
        }
    }

    @Override // defpackage.gt2
    public void e(al3 al3Var, fr2 fr2Var) {
        ((wc0) this.o).accept(al3Var);
    }

    @Override // defpackage.rc2
    public void f(Object obj, w71 w71Var) {
        ((oi3) obj).B((qe4) this.o, new ni3(w71Var));
    }

    @Override // defpackage.jg2
    public Object g(Object obj, Object obj2) {
        return hw.P(new rm3(((tz2) this.o).s, obj, false), (List) ((Collection) obj2));
    }

    @Override // defpackage.it2
    public Object h(tn2 tn2Var, fr2 fr2Var, int i) {
        int i2 = this.n;
        Object obj = this.o;
        switch (i2) {
            case 0:
                return tn2Var.z(fr2Var, (String) obj);
            case 1:
                return tn2Var.s(fr2Var, (jn2) obj);
            case 2:
                gt2 gt2Var = (gt2) obj;
                mw1 mw1Var = mw1.o;
                if (!tn2Var.l()) {
                    gt2Var.e(tn2Var.s, fr2Var);
                    kt2.P0(tn2Var, fr2Var, i, new ab4(0));
                }
                return mw1Var;
            default:
                pq pqVar = tn2Var.e;
                kn2 kn2Var = tn2Var.k;
                fr2 fr2VarB = tn2Var.B(fr2Var);
                pqVar.getClass();
                kn2Var.getClass();
                fr2VarB.getClass();
                gn2 gn2VarA = kn2Var.a().a();
                gn2VarA.getClass();
                String str = gn2VarA.a;
                str.getClass();
                return pqVar.e(kn2Var, fr2VarB, str, (lu3) obj);
        }
    }

    @Override // defpackage.np4
    public void j() {
        SongListPageFragment songListPageFragment = (SongListPageFragment) this.o;
        songListPageFragment.i0();
        ((SwipeRefreshLayout) songListPageFragment.l0.h).setRefreshing(false);
    }

    @Override // defpackage.gz3
    public void k(long j, be3 be3Var) {
        int i = this.n;
        Object obj = this.o;
        switch (i) {
            case 14:
                ji2.s(j, be3Var, (wv4[]) ((jv3) obj).o);
                break;
            default:
                ji2.t(j, be3Var, (wv4[]) ((r20) obj).p);
                break;
        }
    }

    @Override // defpackage.fz
    public void onCancel() {
        ((pj4) this.o).a();
    }

    @Override // defpackage.av4
    public boolean onMenuItemClick(MenuItem menuItem) {
        ArrayList arrayList;
        Integer num;
        PlaylistEditorFragment playlistEditorFragment = (PlaylistEditorFragment) this.o;
        if (menuItem.getItemId() != R.id.action_save_playlist) {
            return false;
        }
        menuItem.setEnabled(false);
        qg4 qg4Var = playlistEditorFragment.p0;
        if (qg4Var != null) {
            qg4Var.a(3);
        }
        wl3 wl3Var = playlistEditorFragment.m0;
        if (wl3Var.i) {
            return true;
        }
        wl3Var.i = true;
        String name = wl3Var.f.getName();
        rm2 rm2Var = new rm2(8, wl3Var);
        List list = (List) wl3Var.g.d();
        if (list == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Child) it.next()).getId());
            }
            arrayList = arrayList2;
        }
        if (arrayList == null) {
            rm2Var.g();
            return true;
        }
        if (arrayList.isEmpty() && (num = wl3Var.j) != null && num.intValue() > 0) {
            ((wl3) rm2Var.o).h.i(Integer.valueOf(R.string.playlist_editor_dialog_action_save_empty));
            return true;
        }
        mm3 mm3Var = wl3Var.c;
        String id = wl3Var.f.getId();
        mm3Var.getClass();
        new Thread(new mr((Object) mm3Var, id, (Object) name, (Object) arrayList, (Object) rm2Var, 10)).start();
        return true;
    }

    @Override // defpackage.g3
    public void onTouchExplorationStateChanged(boolean z) {
        SearchBar searchBar = (SearchBar) this.o;
        int i = SearchBar.z0;
        searchBar.setFocusableInTouchMode(z);
    }

    public /* synthetic */ ss2(int i, Object obj) {
        this.n = i;
        this.o = obj;
    }

    @Override // defpackage.mk
    public ic2 apply(Object obj) {
        return (ic2) this.o;
    }
}
