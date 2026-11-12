package defpackage;

import android.R;
import android.content.res.TypedArray;
import android.graphics.drawable.AnimationDrawable;
import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.mediarouter.app.MediaRouteExpandCollapseButton;
import androidx.preference.Preference;
import com.google.android.material.internal.NavigationMenuItemView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class i4 implements View.OnClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ i4(int i, Object obj) {
        this.n = i;
        this.o = obj;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        Message message3;
        int i = this.n;
        Message messageObtain = null;
        messageObtain = null;
        int iMax = 0;
        int i2 = 1;
        Object obj = this.o;
        switch (i) {
            case 0:
                ((d5) obj).a();
                break;
            case 1:
                DrawerLayout drawerLayout = ((k4) obj).b;
                int iH = drawerLayout.h(8388611);
                View viewF = drawerLayout.f(8388611);
                if ((viewF != null ? DrawerLayout.o(viewF) : false) && iH != 2) {
                    drawerLayout.d();
                } else if (iH != 1) {
                    drawerLayout.q();
                }
                break;
            case 2:
                d9 d9Var = (d9) obj;
                if (view == d9Var.i && (message3 = d9Var.k) != null) {
                    messageObtain = Message.obtain(message3);
                } else if (view == d9Var.l && (message2 = d9Var.n) != null) {
                    messageObtain = Message.obtain(message2);
                } else if (view == d9Var.o && (message = d9Var.q) != null) {
                    messageObtain = Message.obtain(message);
                }
                if (messageObtain != null) {
                    messageObtain.sendToTarget();
                }
                d9Var.F.obtainMessage(1, d9Var.b).sendToTarget();
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                yt ytVar = (yt) obj;
                if (ytVar.x && ytVar.isShowing()) {
                    if (!ytVar.z) {
                        TypedArray typedArrayObtainStyledAttributes = ytVar.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                        ytVar.y = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                        ytVar.z = true;
                    }
                    if (ytVar.y) {
                        ytVar.cancel();
                    }
                    break;
                }
                break;
            case 4:
                cp1 cp1Var = (cp1) obj;
                cp1Var.n0.c.getClass();
                xi4.s(-1, false, false).e(cp1Var.v(), new np0(i2, this));
                break;
            case 5:
                nh2 nh2Var = (nh2) obj;
                int i3 = nh2Var.q0;
                if (i3 == 2) {
                    nh2Var.j0(1);
                } else if (i3 == 1) {
                    nh2Var.j0(2);
                }
                break;
            case 6:
                ((aq2) obj).dismiss();
                break;
            case 7:
                dq2 dq2Var = (dq2) obj;
                lq2 lq2Var = dq2Var.x;
                if (lq2Var.K != null) {
                    lq2Var.F.removeMessages(2);
                }
                lq2Var.K = dq2Var.u;
                boolean zIsActivated = view.isActivated();
                boolean z = !zIsActivated;
                if (zIsActivated) {
                    Integer num = (Integer) lq2Var.L.get(dq2Var.u.c);
                    iMax = num == null ? 1 : Math.max(1, num.intValue());
                }
                dq2Var.t(z);
                dq2Var.w.setProgress(iMax);
                dq2Var.u.j(iMax);
                lq2Var.F.sendEmptyMessageDelayed(2, 500L);
                break;
            case 8:
                eq2 eq2Var = (eq2) obj;
                yq2 yq2Var = eq2Var.A.z.t;
                wq2 wq2Var = eq2Var.z;
                yq2Var.getClass();
                if (wq2Var != null) {
                    yq2.b();
                    ui1 ui1VarC = yq2.c();
                    tq2 tq2VarA = ui1VarC.c.a();
                    if (tq2VarA == null) {
                        Log.w("AxMediaRouter", "Ignoring attempt to transfer for a selected non-group route");
                    } else {
                        List<wq2> listSingletonList = Collections.singletonList(wq2Var);
                        ArrayList arrayList = new ArrayList();
                        for (wq2 wq2Var2 : listSingletonList) {
                            mq2 mq2Var = (mq2) tq2VarA.x.get(wq2Var2.c);
                            if (mq2Var == null || !mq2Var.e) {
                                Log.w("AxMediaRouter", "Ignoring attempt to update the group with a non-transferable route: " + wq2Var2);
                            } else {
                                arrayList.add(wq2Var2.b);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            Log.w("AxMediaRouter", "Ignoring attempt to update the group with non-transferable routes");
                        } else if (tq2VarA.g()) {
                            oq2 oq2Var = ui1VarC.d;
                            if (!(oq2Var instanceof nq2)) {
                                kf2.o("There is no currently selected dynamic group route.");
                            } else {
                                ((nq2) oq2Var).o(arrayList);
                            }
                            break;
                        } else if (tq2VarA.m()) {
                            ui1VarC.e();
                            Log.w("AxMediaRouter", "Ignoring attempt to update routes for a non-available connected route: " + tq2VarA);
                        } else {
                            Log.w("AxMediaRouter", "Ignoring attempt to update routes for an unsupported group route:" + tq2VarA);
                        }
                    }
                    eq2Var.v.setVisibility(4);
                    eq2Var.w.setVisibility(0);
                } else {
                    nz2.n("route must not be null");
                }
                break;
            case 9:
                iq2 iq2Var = (iq2) obj;
                boolean zU = iq2Var.u(iq2Var.u);
                boolean z2 = !zU;
                boolean zE = iq2Var.u.e();
                jq2 jq2Var = iq2Var.H;
                if (!zU) {
                    yq2 yq2Var2 = jq2Var.z.t;
                    wq2 wq2Var3 = iq2Var.u;
                    yq2Var2.getClass();
                    if (wq2Var3 == null) {
                        nz2.n("route must not be null");
                        break;
                    } else {
                        yq2.b();
                        ui1 ui1VarC2 = yq2.c();
                        tq2 tq2VarA2 = ui1VarC2.c.a();
                        if (tq2VarA2 == null) {
                            Log.w("AxMediaRouter", "Ignoring attempt to add a member route to a selected non-group route");
                        } else if (!tq2VarA2.n(wq2Var3)) {
                            Log.w("AxMediaRouter", "Ignoring attempt to add a non-groupable member route: " + wq2Var3);
                        } else if (Collections.unmodifiableList(tq2VarA2.v).contains(wq2Var3)) {
                            Log.w("AxMediaRouter", "Ignoring attempt to add an existing member route: " + wq2Var3);
                        } else if (tq2VarA2.g()) {
                            oq2 oq2Var2 = ui1VarC2.d;
                            if (!(oq2Var2 instanceof nq2)) {
                                kf2.o("There is no currently selected dynamic group route.");
                            } else {
                                ((nq2) oq2Var2).m(wq2Var3.b);
                            }
                            break;
                        } else if (tq2VarA2.m()) {
                            ui1VarC2.e();
                            Log.w("AxMediaRouter", "Ignoring attempt to add a route to a non-available connected route: " + tq2VarA2);
                        } else {
                            Log.w("AxMediaRouter", "Ignoring attempt to add a route to an unsupported group route:" + tq2VarA2);
                        }
                    }
                } else {
                    yq2 yq2Var3 = jq2Var.z.t;
                    wq2 wq2Var4 = iq2Var.u;
                    yq2Var3.getClass();
                    if (wq2Var4 == null) {
                        nz2.n("route must not be null");
                        break;
                    } else {
                        yq2.b();
                        ui1 ui1VarC3 = yq2.c();
                        tq2 tq2VarA3 = ui1VarC3.c.a();
                        if (tq2VarA3 == null) {
                            Log.w("AxMediaRouter", "Ignoring attempt to remove a member route from a selected non-group route");
                        } else {
                            mq2 mq2Var2 = (mq2) tq2VarA3.x.get(wq2Var4.c);
                            if (mq2Var2 == null || !mq2Var2.c) {
                                Log.w("AxMediaRouter", "Ignoring attempt to remove a non-unselectable member route: " + wq2Var4);
                            } else if (!Collections.unmodifiableList(tq2VarA3.v).contains(wq2Var4)) {
                                Log.w("AxMediaRouter", "Ignoring attempt to remove a non-in-group member route: " + wq2Var4);
                            } else if (Collections.unmodifiableList(tq2VarA3.v).size() <= 1) {
                                Log.w("AxMediaRouter", "Ignoring attempt to remove the last member route.");
                            } else if (tq2VarA3.g()) {
                                oq2 oq2Var3 = ui1VarC3.d;
                                if (!(oq2Var3 instanceof nq2)) {
                                    kf2.o("There is no currently selected dynamic group route.");
                                } else {
                                    ((nq2) oq2Var3).n(wq2Var4.b);
                                }
                                break;
                            } else if (tq2VarA3.m()) {
                                ui1VarC3.e();
                                Log.w("AxMediaRouter", "Ignoring attempt to update routes for a non-available connected route: " + tq2VarA3);
                            } else {
                                Log.w("AxMediaRouter", "Ignoring attempt to remove a route from an unsupported group route:" + tq2VarA3);
                            }
                        }
                    }
                }
                iq2Var.v(z2, !zE);
                if (zE) {
                    List listUnmodifiableList = Collections.unmodifiableList(jq2Var.z.w.v);
                    for (wq2 wq2Var5 : Collections.unmodifiableList(iq2Var.u.v)) {
                        if (listUnmodifiableList.contains(wq2Var5) != z2) {
                            dq2 dq2Var2 = (dq2) jq2Var.z.J.get(wq2Var5.c);
                            if (dq2Var2 instanceof iq2) {
                                ((iq2) dq2Var2).v(z2, true);
                            }
                        }
                    }
                }
                lq2 lq2Var2 = jq2Var.z;
                wq2 wq2Var6 = iq2Var.u;
                List listUnmodifiableList2 = Collections.unmodifiableList(lq2Var2.w.v);
                int iMax2 = Math.max(1, listUnmodifiableList2.size());
                if (wq2Var6.e()) {
                    Iterator it = Collections.unmodifiableList(wq2Var6.v).iterator();
                    while (it.hasNext()) {
                        if (listUnmodifiableList2.contains((wq2) it.next()) != z2) {
                            iMax2 += !zU ? 1 : -1;
                        }
                    }
                } else {
                    iMax2 += !zU ? 1 : -1;
                }
                int i4 = (!lq2Var2.f0 || Collections.unmodifiableList(lq2Var2.w.v).size() <= 1) ? 0 : 1;
                i2 = (!lq2Var2.f0 || iMax2 < 2) ? 0 : 1;
                if (i4 != i2) {
                    cx3 cx3VarI = lq2Var2.G.I(0);
                    if (cx3VarI instanceof fq2) {
                        fq2 fq2Var = (fq2) cx3VarI;
                        jq2Var.p(fq2Var.a, i2 != 0 ? fq2Var.z : 0);
                    }
                }
                break;
            case 10:
                MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = (MediaRouteExpandCollapseButton) obj;
                AnimationDrawable animationDrawable = mediaRouteExpandCollapseButton.r;
                AnimationDrawable animationDrawable2 = mediaRouteExpandCollapseButton.q;
                boolean z3 = mediaRouteExpandCollapseButton.u;
                mediaRouteExpandCollapseButton.u = !z3;
                if (z3) {
                    mediaRouteExpandCollapseButton.setImageDrawable(animationDrawable);
                    animationDrawable.start();
                    mediaRouteExpandCollapseButton.setContentDescription(mediaRouteExpandCollapseButton.s);
                } else {
                    mediaRouteExpandCollapseButton.setImageDrawable(animationDrawable2);
                    animationDrawable2.start();
                    mediaRouteExpandCollapseButton.setContentDescription(mediaRouteExpandCollapseButton.t);
                }
                View.OnClickListener onClickListener = mediaRouteExpandCollapseButton.v;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                break;
            case 11:
                tu2 itemData = ((k33) view).getItemData();
                qt qtVar = (qt) obj;
                if (!qtVar.R.q(itemData, qtVar.Q, 0)) {
                    itemData.setChecked(true);
                }
                break;
            case 12:
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) view;
                l43 l43Var = (l43) obj;
                d43 d43Var = l43Var.r;
                if (d43Var != null) {
                    d43Var.s = true;
                }
                tu2 itemData2 = navigationMenuItemView.getItemData();
                boolean zQ = l43Var.p.q(itemData2, l43Var, 0);
                if (itemData2 != null && itemData2.isCheckable() && zQ) {
                    l43Var.r.q(itemData2);
                } else {
                    i2 = 0;
                }
                d43 d43Var2 = l43Var.r;
                if (d43Var2 != null) {
                    d43Var2.s = false;
                }
                if (i2 != 0) {
                    l43Var.c(false);
                }
                break;
            case 13:
                ((Preference) obj).s(view);
                break;
            default:
                yu4 yu4Var = ((Toolbar) obj).c0;
                tu2 tu2Var = yu4Var != null ? yu4Var.o : null;
                if (tu2Var != null) {
                    tu2Var.collapseActionView();
                }
                break;
        }
    }
}
