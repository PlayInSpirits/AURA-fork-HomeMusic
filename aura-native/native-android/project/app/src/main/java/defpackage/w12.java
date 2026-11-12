package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class w12 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    public final Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;

    public w12(i41 i41Var, d41 d41Var, vp4 vp4Var, int i, int i2, int i3, int i4) {
        this.a = 3;
        this.b = i41Var;
        this.d = d41Var;
        this.e = vp4Var;
        this.f = new zt4();
        this.g = vp4Var.a(i41Var.u, new gt0(4, this));
        this.h = new zm4(this, i);
        this.i = new an4(this, i2);
        this.j = new bn4(this, i3);
        this.k = new cn4(this, i4);
        j52 j52Var = new j52(3, this);
        this.c = j52Var;
        i41Var.n.a(j52Var);
    }

    public static final void a(w12 w12Var, cx2 cx2Var, f63 f63Var) {
        for (cx2 cx2Var2 = cx2Var.r; cx2Var2 != null; cx2Var2 = cx2Var2.r) {
            if (cx2Var2 == ((b63) w12Var.c)) {
                c72 c72VarT = ((c72) w12Var.b).t();
                f63Var.J = c72VarT != null ? (iz1) c72VarT.Q.d : null;
                w12Var.e = f63Var;
                return;
            } else {
                if ((cx2Var2.p & 2) != 0) {
                    return;
                }
                cx2Var2.p0(f63Var);
            }
        }
    }

    public static cx2 b(bx2 bx2Var, cx2 cx2Var) {
        cx2 cx2VarD;
        if (bx2Var instanceof gx2) {
            cx2VarD = ((gx2) bx2Var).d();
            cx2VarD.p = g63.e(cx2VarD);
        } else {
            xo xoVar = new xo();
            p03 p03Var = g63.a;
            int i = bx2Var instanceof zh ? 9 : 1;
            if (bx2Var instanceof zu) {
                i |= 524288;
            }
            xoVar.p = i;
            xoVar.B = bx2Var;
            new HashSet();
            cx2VarD = xoVar;
        }
        if (cx2VarD.A) {
            cz1.b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        cx2VarD.v = true;
        cx2 cx2Var2 = cx2Var.s;
        if (cx2Var2 != null) {
            cx2Var2.r = cx2VarD;
            cx2VarD.s = cx2Var2;
        }
        cx2Var.s = cx2VarD;
        cx2VarD.r = cx2Var;
        return cx2VarD;
    }

    public static cx2 c(cx2 cx2Var) {
        boolean z = cx2Var.A;
        if (z) {
            p03 p03Var = g63.a;
            if (!z) {
                cz1.b("autoInvalidateRemovedNode called on unattached node");
            }
            g63.a(cx2Var, -1, 2);
            cx2Var.n0();
            cx2Var.h0();
        }
        cx2 cx2Var2 = cx2Var.s;
        cx2 cx2Var3 = cx2Var.r;
        if (cx2Var2 != null) {
            cx2Var2.r = cx2Var3;
            cx2Var.s = null;
        }
        if (cx2Var3 != null) {
            cx2Var3.s = cx2Var2;
            cx2Var.r = null;
        }
        cx2Var3.getClass();
        return cx2Var3;
    }

    public static void h(bx2 bx2Var, bx2 bx2Var2, cx2 cx2Var) {
        if ((bx2Var instanceof gx2) && (bx2Var2 instanceof gx2)) {
            cx2Var.getClass();
            ((gx2) bx2Var2).e(cx2Var);
            if (cx2Var.A) {
                g63.c(cx2Var);
                return;
            } else {
                cx2Var.w = true;
                return;
            }
        }
        if (!(cx2Var instanceof xo)) {
            cz1.b("Unknown Modifier.Node type");
            return;
        }
        xo xoVar = (xo) cx2Var;
        boolean z = xoVar.A;
        if (z) {
            if (!z) {
                cz1.b("unInitializeModifier called on unattached node");
            }
            if ((xoVar.p & 8) != 0) {
                ((ra) j51.P(xoVar)).w();
            }
        }
        xoVar.B = bx2Var2;
        p03 p03Var = g63.a;
        int i = bx2Var2 instanceof zh ? 9 : 1;
        if (bx2Var2 instanceof zu) {
            i |= 524288;
        }
        xoVar.p = i;
        if (xoVar.A) {
            xoVar.q0(false);
        }
        if (cx2Var.A) {
            g63.c(cx2Var);
        } else {
            cx2Var.w = true;
        }
    }

    public boolean d(int i) {
        return (((cx2) this.g).q & i) != 0;
    }

    public void e() {
        for (cx2 cx2Var = (cx2) this.g; cx2Var != null; cx2Var = cx2Var.s) {
            cx2Var.m0();
            if (cx2Var.v) {
                p03 p03Var = g63.a;
                if (!cx2Var.A) {
                    cz1.b("autoInvalidateInsertedNode called on unattached node");
                }
                g63.a(cx2Var, -1, 1);
            }
            if (cx2Var.w) {
                g63.c(cx2Var);
            }
            cx2Var.v = false;
            cx2Var.w = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:174:0x0147 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:34:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:37:0x0102  */
    /* JADX WARN: Code duplicated, block: B:40:0x0110 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:46:0x0123  */
    /* JADX WARN: Code duplicated, block: B:48:0x012d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0145  */
    /* JADX WARN: Code duplicated, block: B:72:0x018f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0192  */
    /* JADX WARN: Code duplicated, block: B:75:0x0196  */
    /* JADX WARN: Code duplicated, block: B:76:0x0199  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:78:0x01a5
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public void f(int r32, defpackage.q03 r33, defpackage.q03 r34, defpackage.cx2 r35, boolean r36) {
        /*
            Method dump skipped, instruction units count: 968
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w12.f(int, q03, q03, cx2, boolean):void");
    }

    public void g() {
        w62 w62Var;
        tb3 tb3Var;
        c72 c72Var = (c72) this.b;
        f63 f63Var = (iz1) this.d;
        for (cx2 cx2Var = ((sq4) this.f).r; cx2Var != null; cx2Var = cx2Var.r) {
            u62 u62VarJ = j51.j(cx2Var);
            if (u62VarJ != null) {
                f63 f63Var2 = cx2Var.u;
                if (f63Var2 != null) {
                    w62Var = (w62) f63Var2;
                    u62 u62Var = w62Var.n0;
                    w62Var.b1(u62VarJ);
                    if (u62Var != cx2Var && (tb3Var = w62Var.g0) != null) {
                        ((vj1) tb3Var).c();
                    }
                } else {
                    w62Var = new w62(c72Var, u62VarJ);
                    cx2Var.p0(w62Var);
                }
                f63Var.J = w62Var;
                w62Var.I = f63Var;
                f63Var = w62Var;
            } else {
                cx2Var.p0(f63Var);
            }
        }
        c72 c72VarT = c72Var.t();
        f63Var.J = c72VarT != null ? (iz1) c72VarT.Q.d : null;
        this.e = f63Var;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder("[");
                cx2 cx2Var = (cx2) this.g;
                sq4 sq4Var = (sq4) this.f;
                if (cx2Var == sq4Var) {
                    sb.append("]");
                } else {
                    while (cx2Var != null && cx2Var != sq4Var) {
                        sb.append(String.valueOf(cx2Var));
                        if (cx2Var.s == sq4Var) {
                            sb.append("]");
                        } else {
                            sb.append(",");
                            cx2Var = cx2Var.s;
                        }
                    }
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public w12(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, Button button, Button button2, Button button3, TextView textView2, TextView textView3, TextView textView4, View view) {
        this.a = 0;
        this.b = constraintLayout;
        this.c = imageView;
        this.d = textView;
        this.h = button;
        this.i = button2;
        this.j = button3;
        this.e = textView2;
        this.f = textView3;
        this.g = textView4;
        this.k = view;
    }

    public w12(LinearLayout linearLayout, MaterialButton materialButton, TextInputEditText textInputEditText, TextInputLayout textInputLayout, ListView listView, TextView textView, ProgressBar progressBar, RecyclerView recyclerView, MaterialButton materialButton2, TextInputEditText textInputEditText2) {
        this.a = 2;
        this.b = linearLayout;
        this.c = materialButton;
        this.e = textInputEditText;
        this.f = textInputLayout;
        this.g = listView;
        this.d = textView;
        this.h = progressBar;
        this.i = recyclerView;
        this.j = materialButton2;
        this.k = textInputEditText2;
    }

    public w12(c72 c72Var) {
        this.a = 1;
        this.b = c72Var;
        b63 b63Var = new b63();
        b63Var.q = -1;
        this.c = b63Var;
        iz1 iz1Var = new iz1(c72Var);
        this.d = iz1Var;
        this.e = iz1Var;
        sq4 sq4Var = iz1Var.n0;
        this.f = sq4Var;
        this.g = sq4Var;
        this.h = new q03();
    }
}
