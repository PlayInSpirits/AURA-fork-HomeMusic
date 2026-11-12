package defpackage;

import android.content.res.ColorStateList;
import android.widget.ImageButton;
import androidx.viewpager2.widget.ViewPager2;
import app.homemusic.R;
import com.eddyizm.tempus.ui.fragment.HomeFragment;
import com.eddyizm.tempus.ui.fragment.PlayerControllerFragment;
import com.eddyizm.tempus.ui.fragment.ToolbarFragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class q80 extends m75 {
    public final /* synthetic */ int a;
    public final Object b;

    public q80() {
        this.a = 0;
        this.b = new ArrayList(3);
    }

    @Override // defpackage.m75
    public void a(int r4) {
        int r0 = this.a;
        int r1 = 0;
        Object r3 = this.b;
        switch(r0) {
            case 0: goto L14;
            case 1: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        ((de1) r3).b(false);
        return;
    L14:
        ArrayList r5 = (ArrayList) r3;     // Catch: ConcurrentModificationException -> L11
        int r2 = r5.size();     // Catch: ConcurrentModificationException -> L11
    L8:
        if (r1 >= r2) goto L18;
        Object r6 = r5.get(r1);     // Catch: ConcurrentModificationException -> L11
        r1 = r1 + 1;     // Catch: ConcurrentModificationException -> L11
        ((m75) r6).a(r4);     // Catch: ConcurrentModificationException -> L11
        goto L8
    L18:
        return;
    L11:
        e = move-exception;
        mj0.j("Adding and removing callbacks during dispatch to callbacks is not supported", e);
    }

    @Override // defpackage.m75
    public void b(int r4, float r5, int r6) {
        switch(this.a) {
            case 0: goto L12;
            default: goto L4;
        };
    L4:
        return;
    L12:
        ArrayList r3 = (ArrayList) this.b;     // Catch: ConcurrentModificationException -> L9
        int r0 = r3.size();     // Catch: ConcurrentModificationException -> L9
        int r1 = 0;
    L6:
        if (r1 >= r0) goto L16;
        Object r2 = r3.get(r1);     // Catch: ConcurrentModificationException -> L9
        r1 = r1 + 1;     // Catch: ConcurrentModificationException -> L9
        ((m75) r2).b(r4, r5, r6);     // Catch: ConcurrentModificationException -> L9
        goto L6
    L16:
        return;
    L9:
        e = move-exception;
        mj0.j("Adding and removing callbacks during dispatch to callbacks is not supported", e);
    }

    @Override // defpackage.m75
    public final void c(int r4) {
        int r0 = this.a;
        int r1 = 0;
        Object r3 = this.b;
        switch(r0) {
            case 0: goto L35;
            case 1: goto L26;
            case 2: goto L22;
            default: goto L4;
        };
    L4:
        PlayerControllerFragment r5 = (PlayerControllerFragment) r3;
        xi3 r2 = (xi3) r5.X().k().D("PlayerBottomSheet");
        if (r4 != 0) goto L13;
        ((BottomSheetBehavior) ((au) r5.K0.V.n).b).X = true;
        r5.o0.setUserInputEnabled(false);
        if (r2 == null) goto L9;
        ((ViewPager2) ((om1) r2.o0.p).o).setUserInputEnabled(true);
    L9:
        ImageButton r6 = r5.B0;
        if (r6 == null) goto L41;
        int r7 = g12.t(r6, R.attr.colorOnSurface);
        r5.B0.setImageTintList(ColorStateList.valueOf(r7));
        return;
    L41:
        return;
    L13:
        if (r4 != 1) goto L40;
        ((BottomSheetBehavior) ((au) r5.K0.V.n).b).X = true;
        r5.o0.setUserInputEnabled(true);
        if (r2 == null) goto L17;
        ((ViewPager2) ((om1) r2.o0.p).o).setUserInputEnabled(false);
    L17:
        ImageButton r8 = r5.B0;
        if (r8 == null) goto L42;
        int r9 = g12.t(r8, R.attr.colorPrimary);
        r5.B0.setImageTintList(ColorStateList.valueOf(r9));
        return;
    L42:
        return;
    L40:
        return;
    L22:
        ToolbarFragment r10 = (ToolbarFragment) ((HomeFragment) r3).m().C(R.id.toolbar_fragment);
        if (r10 == null) goto L43;
        r10.h0();
        return;
    L43:
        return;
    L26:
        ((de1) r3).b(false);
        return;
    L35:
        ArrayList r11 = (ArrayList) r3;     // Catch: ConcurrentModificationException -> L32
        int r12 = r11.size();     // Catch: ConcurrentModificationException -> L32
    L29:
        if (r1 >= r12) goto L44;
        Object r13 = r11.get(r1);     // Catch: ConcurrentModificationException -> L32
        r1 = r1 + 1;     // Catch: ConcurrentModificationException -> L32
        ((m75) r13).c(r4);     // Catch: ConcurrentModificationException -> L32
        goto L29
    L44:
        return;
    L32:
        e = move-exception;
        mj0.j("Adding and removing callbacks during dispatch to callbacks is not supported", e);
    }

    public /* synthetic */ q80(int r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }
}
