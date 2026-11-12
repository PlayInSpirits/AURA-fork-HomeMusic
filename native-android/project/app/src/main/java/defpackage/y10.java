package defpackage;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.eddyizm.tempus.service.MediaService;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class y10 {
    public final /* synthetic */ int a;
    public boolean b;
    public boolean c;
    public final Object d;
    public final Object e;
    public Object f;

    public y10(MediaService mediaService, Looper looper, vp4 vp4Var, int i) {
        this.a = i;
        switch (i) {
            case 4:
                this.d = new rf2((Object) mediaService.getApplicationContext());
                this.e = vp4Var.a(looper, null);
                this.f = vp4Var.a(Looper.getMainLooper(), null);
                break;
            default:
                this.d = new xc5(22, mediaService.getApplicationContext());
                this.e = vp4Var.a(looper, null);
                this.f = vp4Var.a(Looper.getMainLooper(), null);
                break;
        }
    }

    public IOException a(boolean z, boolean z2, IOException iOException) {
        bv3 bv3Var = (bv3) this.d;
        if (iOException != null) {
            l(iOException);
        }
        return bv3Var.f(this, z2, z, iOException);
    }

    public boolean b(Chip chip) {
        int id = chip.getId();
        HashSet hashSet = (HashSet) this.e;
        if (hashSet.contains(Integer.valueOf(id))) {
            return false;
        }
        Chip chip2 = (Chip) ((HashMap) this.d).get(Integer.valueOf(f()));
        if (chip2 != null) {
            m(chip2, false);
        }
        boolean zAdd = hashSet.add(Integer.valueOf(id));
        if (!chip.isChecked()) {
            chip.setChecked(true);
        }
        return zAdd;
    }

    public o21 c(oz3 oz3Var, boolean z) {
        oz3Var.getClass();
        this.b = z;
        tz3 tz3Var = oz3Var.d;
        tz3Var.getClass();
        long jContentLength = tz3Var.contentLength();
        return new o21(this, ((r21) this.f).e(oz3Var, jContentLength), jContentLength);
    }

    public ArrayList d(ViewGroup viewGroup) {
        HashSet hashSet = new HashSet((HashSet) this.e);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof Chip) && hashSet.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    public cv3 e() {
        q21 q21VarH = ((r21) this.f).h();
        cv3 cv3Var = q21VarH instanceof cv3 ? (cv3) q21VarH : null;
        if (cv3Var != null) {
            return cv3Var;
        }
        kf2.o("no connection for CONNECT tunnels");
        return null;
    }

    public int f() {
        HashSet hashSet = (HashSet) this.e;
        if (!this.b || hashSet.isEmpty()) {
            return -1;
        }
        return ((Integer) hashSet.iterator().next()).intValue();
    }

    public void g() {
        zg5 zg5Var = (zg5) this.f;
        if (zg5Var != null) {
            new HashSet((HashSet) this.e);
            ChipGroup chipGroup = (ChipGroup) zg5Var.n;
            n20 n20Var = chipGroup.t;
            if (n20Var != null) {
                chipGroup.u.d(chipGroup);
                ChipGroup chipGroup2 = (ChipGroup) ((d34) n20Var).o;
                if (chipGroup2.u.b) {
                    chipGroup2.getCheckedChipId();
                    throw null;
                }
            }
        }
    }

    public void h(boolean z, boolean z2) {
        yp4 yp4Var = (yp4) this.e;
        int i = 0;
        if (z && z2) {
            yp4Var.d(new v85(this, z, z2, i));
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        yp4 yp4Var2 = (yp4) this.f;
        yp4Var2.a.postDelayed(new w85(i, this, atomicBoolean), 1000L);
        yp4Var.d(new x85(this, atomicBoolean, z, z2, 0));
    }

    public void i(boolean z, boolean z2) {
        yp4 yp4Var = (yp4) this.e;
        int i = 1;
        if (z && z2) {
            yp4Var.d(new v85(this, z, z2, i));
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        yp4 yp4Var2 = (yp4) this.f;
        yp4Var2.a.postDelayed(new w85(3, this, atomicBoolean), 1000L);
        yp4Var.d(new x85(this, atomicBoolean, z, z2, 1));
    }

    public j14 j(boolean z) throws IOException {
        try {
            j14 j14VarF = ((r21) this.f).f(z);
            if (j14VarF != null) {
                j14VarF.m = this;
                j14VarF.n = new zf0(7, this);
            }
            return j14VarF;
        } catch (IOException e) {
            l(e);
            throw e;
        }
    }

    public void k(boolean z) {
        switch (this.a) {
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                if (this.c != z) {
                    this.c = z;
                    if (this.b) {
                        h(true, z);
                    }
                    break;
                }
                break;
            default:
                if (this.c != z) {
                    this.c = z;
                    if (this.b) {
                        i(true, z);
                    }
                    break;
                }
                break;
        }
    }

    public void l(IOException iOException) {
        this.c = true;
        ((r21) this.f).h().b((bv3) this.d, iOException);
    }

    public boolean m(Chip chip, boolean z) {
        int id = chip.getId();
        HashSet hashSet = (HashSet) this.e;
        if (!hashSet.contains(Integer.valueOf(id))) {
            return false;
        }
        if (z && hashSet.size() == 1 && hashSet.contains(Integer.valueOf(id))) {
            chip.setChecked(true);
            return false;
        }
        boolean zRemove = hashSet.remove(Integer.valueOf(id));
        if (chip.isChecked()) {
            chip.setChecked(false);
        }
        return zRemove;
    }

    public y10() {
        this.a = 0;
        this.d = new HashMap();
        this.e = new HashSet();
    }

    public y10(bv3 bv3Var, s21 s21Var, r21 r21Var) {
        this.a = 1;
        s21Var.getClass();
        this.d = bv3Var;
        this.e = s21Var;
        this.f = r21Var;
    }

    public y10(Context context, String str, uv uvVar, boolean z, boolean z2) {
        this.a = 2;
        context.getClass();
        uvVar.getClass();
        this.d = context;
        this.e = str;
        this.f = uvVar;
        this.b = z;
        this.c = z2;
    }
}
