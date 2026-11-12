package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.appcompat.widget.ActionMenuView;
import com.eddyizm.tempus.homemusic.WaveRetry;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xk0 implements b85, y43, fv2 {
    public static final int[] q = {8, 13, 11, 2, 0, 1, 7};
    public final /* synthetic */ int n;
    public boolean o;
    public Object p;

    public xk0(int i) {
        this.n = i;
        switch (i) {
            case 2:
                this.p = new SparseBooleanArray();
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                this.p = new ArrayList();
                break;
            case 6:
                this.p = new Handler(Looper.getMainLooper(), new yq(1));
                break;
        }
    }

    public static void e(int i, ArrayList arrayList) {
        if (jz4.y(q, i, 0, 7) == -1 || arrayList.contains(Integer.valueOf(i))) {
            return;
        }
        arrayList.add(Integer.valueOf(i));
    }

    public static xk0 h(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("routes");
        if (parcelableArrayList != null) {
            for (int i = 0; i < parcelableArrayList.size(); i++) {
                Bundle bundle2 = (Bundle) parcelableArrayList.get(i);
                arrayList.add(bundle2 != null ? new sp2(bundle2) : null);
            }
        }
        return new xk0(arrayList, bundle.getBoolean("supportsDynamicGroupRoute", false));
    }

    @Override // defpackage.y43
    public long R(int i, long j, long j2) {
        if (!this.o) {
            return 0L;
        }
        g74 g74Var = (g74) this.p;
        if (g74Var.a.a()) {
            return 0L;
        }
        return g74Var.i(g74Var.e(g74Var.a.d(g74Var.e(g74Var.h(j2)))));
    }

    @Override // defpackage.fv2
    public void a(qu2 qu2Var, boolean z) {
        y4 y4Var;
        cv4 cv4Var = (cv4) this.p;
        if (this.o) {
            return;
        }
        this.o = true;
        ActionMenuView actionMenuView = cv4Var.d.a.n;
        if (actionMenuView != null && (y4Var = actionMenuView.G) != null) {
            y4Var.f();
            t4 t4Var = y4Var.H;
            if (t4Var != null && t4Var.b()) {
                t4Var.i.dismiss();
            }
        }
        cv4Var.e.onPanelClosed(108, qu2Var);
        this.o = false;
    }

    public void b(int i) {
        rr2.w(!this.o);
        ((SparseBooleanArray) this.p).append(i, true);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.y43
    public Object b0(long j, long j2, vd0 vd0Var) throws Throwable {
        w64 w64Var;
        long jD;
        if (vd0Var instanceof w64) {
            w64Var = (w64) vd0Var;
            int i = w64Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                w64Var.q = i - Integer.MIN_VALUE;
            } else {
                w64Var = new w64(this, (wd0) vd0Var);
            }
        } else {
            w64Var = new w64(this, (wd0) vd0Var);
        }
        Object objA = w64Var.o;
        int i2 = w64Var.q;
        if (i2 == 0) {
            kb4.X(objA);
            jD = 0;
            if (this.o) {
                g74 g74Var = (g74) this.p;
                if (!g74Var.i) {
                    w64Var.n = j2;
                    w64Var.q = 1;
                    objA = g74Var.a(j2, w64Var);
                    xe0 xe0Var = xe0.n;
                    if (objA == xe0Var) {
                        return xe0Var;
                    }
                }
                jD = k45.d(j2, jD);
            }
            return new k45(jD);
        }
        if (i2 != 1) {
            kf2.o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j2 = w64Var.n;
        kb4.X(objA);
        jD = ((k45) objA).a;
        jD = k45.d(j2, jD);
        return new k45(jD);
    }

    public void c(w71 w71Var) {
        for (int i = 0; i < w71Var.a.size(); i++) {
            b(w71Var.b(i));
        }
    }

    public void d(int... iArr) {
        for (int i : iArr) {
            b(i);
        }
    }

    public w71 f() {
        rr2.w(!this.o);
        this.o = true;
        return new w71((SparseBooleanArray) this.p);
    }

    public boolean g() {
        return this.o;
    }

    public tb1 i(tb1 tb1Var) {
        if (!this.o || !((om0) this.p).n(tb1Var)) {
            return tb1Var;
        }
        sb1 sb1VarA = tb1Var.a();
        String str = tb1Var.k;
        sb1VarA.m = lw2.m("application/x-media3-cues");
        sb1VarA.K = ((om0) this.p).R(tb1Var);
        StringBuilder sb = new StringBuilder();
        sb.append(tb1Var.n);
        sb.append(str != null ? " ".concat(str) : "");
        sb1VarA.j = sb.toString();
        sb1VarA.r = Long.MAX_VALUE;
        return new tb1(sb1VarA);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0036  */
    public boolean j(CharSequence charSequence, int i) {
        char c = 0;
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            nz2.c();
            return false;
        }
        if (((rv2) this.p) == null) {
            return g();
        }
        c = 2;
        for (int i2 = 0; i2 < i && c == 2; i2++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i2));
            xk0 xk0Var = vr4.a;
            if (directionality == 0) {
                c = 1;
                continue;
            } else if (directionality != 1 && directionality != 2) {
                switch (directionality) {
                    case 14:
                    case 15:
                        c = 1;
                        continue;
                    case WaveRetry.MAX_FAILURES /* 16 */:
                    case 17:
                        break;
                    default:
                        c = 2;
                        continue;
                }
            }
        }
        if (c == 0) {
            return true;
        }
        if (c != 1) {
            return g();
        }
        return false;
    }

    public synchronized void k(q04 q04Var, boolean z) {
        try {
            if (this.o || z) {
                ((Handler) this.p).obtainMessage(1, q04Var).sendToTarget();
            } else {
                this.o = true;
                q04Var.b();
                this.o = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x007c  */
    @Override // defpackage.b85
    public pb5 m(View view, pb5 pb5Var, c85 c85Var) {
        boolean z;
        mb5 mb5Var = pb5Var.a;
        vz1 vz1VarH = mb5Var.h(519);
        vz1 vz1VarH2 = mb5Var.h(32);
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.p;
        int i = vz1VarH.b;
        int i2 = vz1VarH.c;
        int i3 = vz1VarH.a;
        bottomSheetBehavior.J = i;
        boolean z2 = vr1.z(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z3 = bottomSheetBehavior.B;
        if (z3) {
            int iA = pb5Var.a();
            bottomSheetBehavior.I = iA;
            paddingBottom = iA + c85Var.d;
        }
        if (bottomSheetBehavior.C) {
            paddingLeft = (z2 ? c85Var.c : c85Var.a) + i3;
        }
        if (bottomSheetBehavior.D) {
            paddingRight = (z2 ? c85Var.a : c85Var.c) + i2;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z4 = true;
        if (!bottomSheetBehavior.F || marginLayoutParams.leftMargin == i3) {
            z = false;
        } else {
            marginLayoutParams.leftMargin = i3;
            z = true;
        }
        if (bottomSheetBehavior.G && marginLayoutParams.rightMargin != i2) {
            marginLayoutParams.rightMargin = i2;
            z = true;
        }
        if (bottomSheetBehavior.H) {
            int i4 = marginLayoutParams.topMargin;
            int i5 = vz1VarH.b;
            if (i4 != i5) {
                marginLayoutParams.topMargin = i5;
            } else {
                z4 = z;
            }
        } else {
            z4 = z;
        }
        if (z4) {
            view.setLayoutParams(marginLayoutParams);
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        boolean z5 = this.o;
        if (z5) {
            bottomSheetBehavior.z = vz1VarH2.d;
        }
        if (!z3 && !z5) {
            return pb5Var;
        }
        bottomSheetBehavior.Q();
        return pb5Var;
    }

    public String toString() {
        switch (this.n) {
            case 5:
                StringBuilder sb = new StringBuilder("MediaRouteProviderDescriptor{ routes=");
                List list = (List) this.p;
                sb.append(Arrays.toString(list.toArray()));
                sb.append(", isValid=");
                int size = list.size();
                boolean z = false;
                for (int i = 0; i < size; i++) {
                    sp2 sp2Var = (sp2) list.get(i);
                    if (sp2Var == null || !sp2Var.e()) {
                        sb.append(z);
                        sb.append(" }");
                        return sb.toString();
                    }
                }
                z = true;
                sb.append(z);
                sb.append(" }");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.fv2
    public boolean w(qu2 qu2Var) {
        ((cv4) this.p).e.onMenuOpened(108, qu2Var);
        return true;
    }

    public /* synthetic */ xk0(Object obj, boolean z, int i) {
        this.n = i;
        this.p = obj;
        this.o = z;
    }

    public /* synthetic */ xk0(int i, Object obj) {
        this.n = i;
        this.p = obj;
    }

    public xk0(ArrayList arrayList, boolean z) {
        this.n = 5;
        if (arrayList.isEmpty()) {
            this.p = Collections.EMPTY_LIST;
        } else {
            this.p = Collections.unmodifiableList(new ArrayList(arrayList));
        }
        this.o = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public xk0(rv2 rv2Var, boolean z) {
        this(8, rv2Var);
        this.n = 8;
        this.o = z;
    }

    public xk0(WebView webView, boolean z) {
        this.n = 4;
        webView.getClass();
        this.p = webView;
        this.o = z;
    }
}
