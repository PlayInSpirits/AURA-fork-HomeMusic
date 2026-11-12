package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class b9 extends Handler {
    public final /* synthetic */ int a = 0;
    public WeakReference b;

    public b9(xx3 xx3Var) {
        this.b = new WeakReference(xx3Var);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0067  */
    /* JADX WARN: Code duplicated, block: B:54:0x00fd  */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        mq2 mq2Var;
        ss2 ss2Var;
        oq2 oq2Var;
        ui1 ui1Var;
        switch (this.a) {
            case 0:
                int i = message.what;
                if (i == -3 || i == -2 || i == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.b.get(), message.what);
                    break;
                } else if (i == 1) {
                    ((DialogInterface) message.obj).dismiss();
                    break;
                }
                break;
            default:
                xx3 xx3Var = (xx3) this.b.get();
                if (xx3Var != null) {
                    SparseArray sparseArray = xx3Var.h;
                    cy3 cy3Var = xx3Var.i;
                    ArrayList arrayList = cy3Var.x;
                    int i2 = message.what;
                    int i3 = message.arg1;
                    int i4 = message.arg2;
                    Object obj = message.obj;
                    Bundle bundlePeekData = message.peekData();
                    int i5 = 0;
                    yx3 yx3Var = null;
                    yx3 yx3Var2 = null;
                    switch (i2) {
                        case 0:
                            if (i3 == xx3Var.g) {
                                xx3Var.g = 0;
                                if (cy3Var.A == xx3Var) {
                                    cy3Var.k();
                                }
                            }
                            if (((zx3) sparseArray.get(i3)) != null) {
                                sparseArray.remove(i3);
                                zx3.a(null, null);
                            }
                            break;
                        case 2:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle = (Bundle) obj;
                                if (xx3Var.f == 0 && i3 == xx3Var.g && i4 >= 1) {
                                    xx3Var.g = 0;
                                    xx3Var.f = i4;
                                    xk0 xk0VarH = xk0.h(bundle);
                                    if (cy3Var.A == xx3Var) {
                                        cy3Var.f(xk0VarH);
                                    }
                                    if (cy3Var.A == xx3Var) {
                                        cy3Var.B = true;
                                        int size = arrayList.size();
                                        while (i5 < size) {
                                            ((yx3) arrayList.get(i5)).b(cy3Var.A);
                                            i5++;
                                        }
                                        up2 up2Var = cy3Var.r;
                                        if (up2Var != null) {
                                            xx3 xx3Var2 = cy3Var.A;
                                            int i6 = xx3Var2.d;
                                            xx3Var2.d = i6 + 1;
                                            xx3Var2.b(10, i6, 0, up2Var.a, null);
                                        }
                                    }
                                }
                            }
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle2 = (Bundle) obj;
                                zx3 zx3Var = (zx3) sparseArray.get(i3);
                                if (zx3Var != null) {
                                    sparseArray.remove(i3);
                                    zx3Var.b(bundle2);
                                }
                            }
                            break;
                        case 4:
                            if (obj == null || (obj instanceof Bundle)) {
                                String string = bundlePeekData != null ? bundlePeekData.getString("error") : null;
                                Bundle bundle3 = (Bundle) obj;
                                if (((zx3) sparseArray.get(i3)) != null) {
                                    sparseArray.remove(i3);
                                    zx3.a(string, bundle3);
                                }
                            }
                            break;
                        case 5:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle4 = (Bundle) obj;
                                if (xx3Var.f != 0) {
                                    xk0 xk0VarH2 = xk0.h(bundle4);
                                    if (cy3Var.A == xx3Var) {
                                        cy3Var.f(xk0VarH2);
                                    }
                                }
                            }
                            break;
                        case 6:
                            if (!(obj instanceof Bundle)) {
                                Log.w("MediaRouteProviderProxy", "No further information on the dynamic group controller");
                            } else {
                                Bundle bundle5 = (Bundle) obj;
                                zx3 zx3Var2 = (zx3) sparseArray.get(i3);
                                if (!bundle5.containsKey("routeId")) {
                                    zx3Var2.getClass();
                                    zx3.a("DynamicGroupRouteController is created without valid route id.", bundle5);
                                } else {
                                    sparseArray.remove(i3);
                                    zx3Var2.b(bundle5);
                                }
                            }
                            break;
                        case 7:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle6 = (Bundle) obj;
                                if (xx3Var.f != 0) {
                                    Bundle bundle7 = (Bundle) bundle6.getParcelable("groupRoute");
                                    sp2 sp2Var = bundle7 != null ? new sp2(bundle7) : null;
                                    ArrayList parcelableArrayList = bundle6.getParcelableArrayList("dynamicRoutes");
                                    ArrayList arrayList2 = new ArrayList();
                                    int size2 = parcelableArrayList.size();
                                    int i7 = 0;
                                    while (i7 < size2) {
                                        Object obj2 = parcelableArrayList.get(i7);
                                        i7++;
                                        Bundle bundle8 = (Bundle) obj2;
                                        if (bundle8 == null) {
                                            mq2Var = null;
                                        } else {
                                            Bundle bundle9 = bundle8.getBundle("mrDescriptor");
                                            mq2Var = new mq2(bundle9 != null ? new sp2(bundle9) : null, bundle8.getInt("selectionState", 1), bundle8.getBoolean("isUnselectable", false), bundle8.getBoolean("isGroupable", false), bundle8.getBoolean("isTransferable", false));
                                        }
                                        arrayList2.add(mq2Var);
                                    }
                                    if (cy3Var.A == xx3Var) {
                                        int size3 = arrayList.size();
                                        while (i5 < size3) {
                                            Object obj3 = arrayList.get(i5);
                                            i5++;
                                            yx3 yx3Var3 = (yx3) obj3;
                                            if (yx3Var3.a() == i4) {
                                                yx3Var2 = yx3Var3;
                                                if (yx3Var2 instanceof ay3) {
                                                    ((ay3) yx3Var2).l(sp2Var, arrayList2);
                                                }
                                                break;
                                            }
                                        }
                                        if (yx3Var2 instanceof ay3) {
                                            ((ay3) yx3Var2).l(sp2Var, arrayList2);
                                        }
                                    }
                                }
                            }
                            break;
                        case 8:
                            if (cy3Var.A == xx3Var) {
                                int size4 = arrayList.size();
                                while (i5 < size4) {
                                    Object obj4 = arrayList.get(i5);
                                    i5++;
                                    yx3 yx3Var4 = (yx3) obj4;
                                    if (yx3Var4.a() == i4) {
                                        yx3Var = yx3Var4;
                                        ss2Var = cy3Var.C;
                                        if (ss2Var != null && (yx3Var instanceof oq2)) {
                                            oq2Var = (oq2) yx3Var;
                                            ui1Var = (ui1) ((ip0) ss2Var.o).c;
                                            if (ui1Var.d == oq2Var) {
                                                ui1Var.i(ui1Var.c(), 2, true);
                                            }
                                        }
                                        if (yx3Var != null) {
                                            arrayList.remove(yx3Var);
                                            yx3Var.c();
                                            cy3Var.l();
                                        }
                                        break;
                                    }
                                }
                                ss2Var = cy3Var.C;
                                if (ss2Var != null) {
                                    oq2Var = (oq2) yx3Var;
                                    ui1Var = (ui1) ((ip0) ss2Var.o).c;
                                    if (ui1Var.d == oq2Var) {
                                        ui1Var.i(ui1Var.c(), 2, true);
                                    }
                                }
                                if (yx3Var != null) {
                                    arrayList.remove(yx3Var);
                                    yx3Var.c();
                                    cy3Var.l();
                                }
                            }
                            break;
                    }
                    int i8 = cy3.D;
                }
                break;
        }
    }

    public /* synthetic */ b9() {
    }
}
