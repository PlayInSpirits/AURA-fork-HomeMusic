package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class le2 extends kc1 {
    public ey l0;
    public final dc1 m0 = W(new cn(22, this), new q5(1));

    @Override // defpackage.kc1
    public final void F(Bundle bundle) {
        super.F(bundle);
        Bundle bundle2 = this.s;
        if (bundle2 != null) {
            bundle2.getBoolean("single_page_mode");
        }
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_login_permission, viewGroup, false);
        int i = R.id.btnRequestInternet;
        Button button = (Button) uo.s(viewInflate, R.id.btnRequestInternet);
        if (button != null) {
            i = R.id.btnRequestLocalNetwork;
            Button button2 = (Button) uo.s(viewInflate, R.id.btnRequestLocalNetwork);
            if (button2 != null) {
                i = R.id.btnRequestNearbyDevices;
                Button button3 = (Button) uo.s(viewInflate, R.id.btnRequestNearbyDevices);
                if (button3 != null) {
                    i = R.id.btnRequestNotification;
                    Button button4 = (Button) uo.s(viewInflate, R.id.btnRequestNotification);
                    if (button4 != null) {
                        i = R.id.tvInternetProvided;
                        TextView textView = (TextView) uo.s(viewInflate, R.id.tvInternetProvided);
                        if (textView != null) {
                            i = R.id.tvLocalNetworkProvided;
                            TextView textView2 = (TextView) uo.s(viewInflate, R.id.tvLocalNetworkProvided);
                            if (textView2 != null) {
                                i = R.id.tvNearbyDevicesProvided;
                                TextView textView3 = (TextView) uo.s(viewInflate, R.id.tvNearbyDevicesProvided);
                                if (textView3 != null) {
                                    i = R.id.tvNotificationProvided;
                                    TextView textView4 = (TextView) uo.s(viewInflate, R.id.tvNotificationProvided);
                                    if (textView4 != null) {
                                        LinearLayout linearLayout = (LinearLayout) viewInflate;
                                        this.l0 = new ey(linearLayout, button, button2, button3, button4, textView, textView2, textView3, textView4);
                                        linearLayout.getClass();
                                        return linearLayout;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        nz2.n("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.kc1
    public final void J() {
        this.R = true;
        this.l0 = null;
    }

    @Override // defpackage.kc1
    public final void P() {
        this.R = true;
        h0();
    }

    @Override // defpackage.kc1
    public final void T(View view, Bundle bundle) {
        view.getClass();
        ey eyVar = this.l0;
        eyVar.getClass();
        final int i = 0;
        ((Button) eyVar.a).setOnClickListener(new View.OnClickListener(this) { // from class: ke2
            public final /* synthetic */ le2 o;

            {
                this.o = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i2 = i;
                le2 le2Var = this.o;
                switch (i2) {
                    case 0:
                        le2Var.m0.a("android.permission.INTERNET");
                        break;
                    case 1:
                        if (Build.VERSION.SDK_INT >= 33) {
                            le2Var.m0.a("android.permission.POST_NOTIFICATIONS");
                        }
                        break;
                    case 2:
                        if (Build.VERSION.SDK_INT >= 37) {
                            le2Var.m0.a("android.permission.ACCESS_LOCAL_NETWORK");
                        }
                        break;
                    default:
                        if (Build.VERSION.SDK_INT >= 33) {
                            le2Var.m0.a("android.permission.NEARBY_WIFI_DEVICES");
                        }
                        break;
                }
            }
        });
        ey eyVar2 = this.l0;
        eyVar2.getClass();
        final int i2 = 1;
        ((Button) eyVar2.d).setOnClickListener(new View.OnClickListener(this) { // from class: ke2
            public final /* synthetic */ le2 o;

            {
                this.o = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i3 = i2;
                le2 le2Var = this.o;
                switch (i3) {
                    case 0:
                        le2Var.m0.a("android.permission.INTERNET");
                        break;
                    case 1:
                        if (Build.VERSION.SDK_INT >= 33) {
                            le2Var.m0.a("android.permission.POST_NOTIFICATIONS");
                        }
                        break;
                    case 2:
                        if (Build.VERSION.SDK_INT >= 37) {
                            le2Var.m0.a("android.permission.ACCESS_LOCAL_NETWORK");
                        }
                        break;
                    default:
                        if (Build.VERSION.SDK_INT >= 33) {
                            le2Var.m0.a("android.permission.NEARBY_WIFI_DEVICES");
                        }
                        break;
                }
            }
        });
        ey eyVar3 = this.l0;
        eyVar3.getClass();
        final int i3 = 2;
        ((Button) eyVar3.b).setOnClickListener(new View.OnClickListener(this) { // from class: ke2
            public final /* synthetic */ le2 o;

            {
                this.o = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i4 = i3;
                le2 le2Var = this.o;
                switch (i4) {
                    case 0:
                        le2Var.m0.a("android.permission.INTERNET");
                        break;
                    case 1:
                        if (Build.VERSION.SDK_INT >= 33) {
                            le2Var.m0.a("android.permission.POST_NOTIFICATIONS");
                        }
                        break;
                    case 2:
                        if (Build.VERSION.SDK_INT >= 37) {
                            le2Var.m0.a("android.permission.ACCESS_LOCAL_NETWORK");
                        }
                        break;
                    default:
                        if (Build.VERSION.SDK_INT >= 33) {
                            le2Var.m0.a("android.permission.NEARBY_WIFI_DEVICES");
                        }
                        break;
                }
            }
        });
        ey eyVar4 = this.l0;
        eyVar4.getClass();
        final int i4 = 3;
        ((Button) eyVar4.c).setOnClickListener(new View.OnClickListener(this) { // from class: ke2
            public final /* synthetic */ le2 o;

            {
                this.o = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i5 = i4;
                le2 le2Var = this.o;
                switch (i5) {
                    case 0:
                        le2Var.m0.a("android.permission.INTERNET");
                        break;
                    case 1:
                        if (Build.VERSION.SDK_INT >= 33) {
                            le2Var.m0.a("android.permission.POST_NOTIFICATIONS");
                        }
                        break;
                    case 2:
                        if (Build.VERSION.SDK_INT >= 37) {
                            le2Var.m0.a("android.permission.ACCESS_LOCAL_NETWORK");
                        }
                        break;
                    default:
                        if (Build.VERSION.SDK_INT >= 33) {
                            le2Var.m0.a("android.permission.NEARBY_WIFI_DEVICES");
                        }
                        break;
                }
            }
        });
        h0();
    }

    public final void h0() {
        boolean z = true;
        boolean z2 = ud3.c(Z(), "android.permission.INTERNET") == 0;
        ey eyVar = this.l0;
        eyVar.getClass();
        ((TextView) eyVar.e).setVisibility(z2 ? 0 : 8);
        ey eyVar2 = this.l0;
        eyVar2.getClass();
        ((Button) eyVar2.a).setVisibility(z2 ? 8 : 0);
        int i = Build.VERSION.SDK_INT;
        boolean z3 = i < 33 || ud3.c(Z(), "android.permission.POST_NOTIFICATIONS") == 0;
        ey eyVar3 = this.l0;
        eyVar3.getClass();
        ((TextView) eyVar3.h).setVisibility(z3 ? 0 : 8);
        ey eyVar4 = this.l0;
        eyVar4.getClass();
        ((Button) eyVar4.d).setVisibility(z3 ? 8 : 0);
        boolean z4 = i < 37 || ud3.c(Z(), "android.permission.ACCESS_LOCAL_NETWORK") == 0;
        ey eyVar5 = this.l0;
        eyVar5.getClass();
        ((TextView) eyVar5.f).setVisibility(z4 ? 0 : 8);
        ey eyVar6 = this.l0;
        eyVar6.getClass();
        ((Button) eyVar6.b).setVisibility(z4 ? 8 : 0);
        if (i >= 33 && ud3.c(Z(), "android.permission.NEARBY_WIFI_DEVICES") != 0) {
            z = false;
        }
        ey eyVar7 = this.l0;
        eyVar7.getClass();
        ((TextView) eyVar7.g).setVisibility(z ? 0 : 8);
        ey eyVar8 = this.l0;
        eyVar8.getClass();
        ((Button) eyVar8.c).setVisibility(z ? 8 : 0);
    }
}
