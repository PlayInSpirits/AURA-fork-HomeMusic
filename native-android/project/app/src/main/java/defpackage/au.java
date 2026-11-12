package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class au {
    public boolean a;
    public final Object b;
    public final Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public au(BottomSheetBehavior bottomSheetBehavior, View view, md1 md1Var) {
        this.a = false;
        this.f = new Handler(Looper.getMainLooper());
        this.b = bottomSheetBehavior;
        this.c = view;
        this.d = md1Var;
        this.e = new xi3();
        bottomSheetBehavior.w(new wt(1, this));
    }

    public void a(float f) {
        xi3 xi3Var = (xi3) this.e;
        if (xi3Var != null) {
            ns3 ns3Var = xi3Var.o0;
            ConstraintLayout constraintLayout = ns3Var != null ? (ConstraintLayout) ((ae1) ns3Var.q).b : null;
            if (constraintLayout != null) {
                float fMax = Math.max(0.0f, Math.min(0.2f, f - 0.2f)) / 0.2f;
                constraintLayout.setAlpha(1.0f - fMax);
                constraintLayout.setVisibility(((double) fMax) > 0.99d ? 8 : 0);
            }
        }
    }

    public tj0 b() {
        Context context = (Context) this.b;
        rr2.w(!this.a);
        this.a = true;
        if (((qp4) this.d) == null) {
            this.d = new qp4(new im[0]);
        }
        dn dnVar = (dn) this.f;
        wo0 wo0Var = (wo0) this.g;
        if (dnVar == null) {
            if (wo0Var == null) {
                this.g = new wo0(context);
            }
            if (((fz0) this.e) == null) {
                this.e = fz0.T;
            }
            ss0 ss0Var = new ss0();
            ss0Var.n = context != null ? context.getApplicationContext() : null;
            ss0Var.p = fz0.T;
            if (context == null) {
                ss0Var.q = nl.c;
            }
            nl nlVar = context == null ? (nl) this.c : null;
            Context context2 = (Context) ss0Var.n;
            if (context2 == null) {
                ss0Var.q = nlVar;
            }
            wo0 wo0Var2 = (wo0) this.g;
            ss0Var.o = wo0Var2;
            ss0Var.p = (fz0) this.e;
            if (wo0Var2 == null) {
                ss0Var.o = new wo0(context2);
            }
            this.f = new dn(ss0Var);
        } else {
            rr2.w(wo0Var == null);
            rr2.w(((fz0) this.e) == null);
        }
        return new tj0(this);
    }

    public lt2 c(int i) {
        go4 bm0Var;
        HashMap map = (HashMap) this.d;
        lt2 lt2Var = (lt2) map.get(Integer.valueOf(i));
        if (lt2Var != null) {
            return lt2Var;
        }
        HashMap map2 = (HashMap) this.c;
        go4 slVar = (go4) map2.get(Integer.valueOf(i));
        if (slVar == null) {
            final bi0 bi0Var = (bi0) this.e;
            bi0Var.getClass();
            final int i2 = 0;
            if (i != 0) {
                final int i3 = 1;
                if (i != 1) {
                    final int i4 = 2;
                    if (i == 2) {
                        final Class clsAsSubclass = HlsMediaSource$Factory.class.asSubclass(lt2.class);
                        bm0Var = new go4() { // from class: am0
                            @Override // defpackage.go4
                            public final Object get() {
                                switch (i4) {
                                    case 0:
                                        break;
                                    case 1:
                                        break;
                                }
                                return dm0.f(clsAsSubclass, bi0Var);
                            }
                        };
                    } else if (i == 3) {
                        slVar = new sl(i3, Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(lt2.class));
                    } else if (i == 4) {
                        bm0Var = new bm0(i2, this, bi0Var);
                    } else {
                        kf2.n(f34.f(i, "Unrecognized contentType: "));
                        slVar = null;
                    }
                } else {
                    final Class<? extends U> clsAsSubclass2 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(lt2.class);
                    bm0Var = new go4() { // from class: am0
                        @Override // defpackage.go4
                        public final Object get() {
                            switch (i3) {
                                case 0:
                                    break;
                                case 1:
                                    break;
                            }
                            return dm0.f(clsAsSubclass2, bi0Var);
                        }
                    };
                }
                slVar = bm0Var;
            } else {
                final Class<? extends U> clsAsSubclass3 = Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(lt2.class);
                slVar = new go4() { // from class: am0
                    @Override // defpackage.go4
                    public final Object get() {
                        switch (i2) {
                            case 0:
                                break;
                            case 1:
                                break;
                        }
                        return dm0.f(clsAsSubclass3, bi0Var);
                    }
                };
            }
            map2.put(Integer.valueOf(i), slVar);
        }
        lt2 lt2Var2 = (lt2) slVar.get();
        yc5 yc5Var = (yc5) this.g;
        if (yc5Var != null) {
            lt2Var2.e(yc5Var);
        }
        lt2Var2.a((om0) this.f);
        lt2Var2.c(this.a);
        lt2Var2.b();
        map.put(Integer.valueOf(i), lt2Var2);
        return lt2Var2;
    }

    public void d(boolean z) {
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.b;
        if (z || u52.c().a) {
            bottomSheetBehavior.J(4);
        } else {
            bottomSheetBehavior.J(5);
        }
    }

    public au(Context context) {
        this.b = context;
        this.c = nl.c;
    }

    public au(n51 n51Var, om0 om0Var) {
        this.b = n51Var;
        this.f = om0Var;
        this.c = new HashMap();
        this.d = new HashMap();
        this.a = true;
    }
}
