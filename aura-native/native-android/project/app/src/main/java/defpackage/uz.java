package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import app.homemusic.R;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class uz extends yu2 implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public View A;
    public View B;
    public int C;
    public boolean D;
    public boolean E;
    public int F;
    public int G;
    public boolean I;
    public fv2 J;
    public ViewTreeObserver K;
    public PopupWindow.OnDismissListener L;
    public boolean M;
    public final Context o;
    public final int p;
    public final int q;
    public final boolean r;
    public final Handler s;
    public final ArrayList t = new ArrayList();
    public final ArrayList u = new ArrayList();
    public final sg v = new sg(2, this);
    public final bc w = new bc(1, this);
    public final d34 x = new d34(13, this);
    public int y = 0;
    public int z = 0;
    public boolean H = false;

    public uz(Context context, View view, int i, boolean z) {
        this.o = context;
        this.A = view;
        this.q = i;
        this.r = z;
        this.C = view.getLayoutDirection() == 1 ? 0 : 1;
        Resources resources = context.getResources();
        this.p = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.s = new Handler();
    }

    @Override // defpackage.gv2
    public final void a(qu2 qu2Var, boolean z) {
        ArrayList arrayList = this.u;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (qu2Var == ((tz) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((tz) arrayList.get(i2)).b.c(false);
        }
        tz tzVar = (tz) arrayList.remove(i);
        qu2 qu2Var2 = tzVar.b;
        ev2 ev2Var = tzVar.a;
        lg lgVar = ev2Var.M;
        qu2Var2.r(this);
        if (this.M) {
            bv2.b(lgVar, null);
            lgVar.setAnimationStyle(0);
        }
        ev2Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.C = ((tz) arrayList.get(size2 - 1)).c;
        } else {
            this.C = this.A.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((tz) arrayList.get(0)).b.c(false);
                return;
            }
            return;
        }
        dismiss();
        fv2 fv2Var = this.J;
        if (fv2Var != null) {
            fv2Var.a(qu2Var, true);
        }
        ViewTreeObserver viewTreeObserver = this.K;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.K.removeGlobalOnLayoutListener(this.v);
            }
            this.K = null;
        }
        this.B.removeOnAttachStateChangeListener(this.w);
        this.L.onDismiss();
    }

    @Override // defpackage.nd4
    public final boolean b() {
        ArrayList arrayList = this.u;
        return arrayList.size() > 0 && ((tz) arrayList.get(0)).a.M.isShowing();
    }

    @Override // defpackage.gv2
    public final void c(boolean z) {
        ArrayList arrayList = this.u;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ListAdapter adapter = ((tz) obj).a.p.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((nu2) adapter).notifyDataSetChanged();
        }
    }

    @Override // defpackage.gv2
    public final boolean d(en4 en4Var) {
        ArrayList arrayList = this.u;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            tz tzVar = (tz) obj;
            if (en4Var == tzVar.b) {
                tzVar.a.p.requestFocus();
                return true;
            }
        }
        if (!en4Var.hasVisibleItems()) {
            return false;
        }
        n(en4Var);
        fv2 fv2Var = this.J;
        if (fv2Var != null) {
            fv2Var.w(en4Var);
        }
        return true;
    }

    @Override // defpackage.nd4
    public final void dismiss() {
        ArrayList arrayList = this.u;
        int size = arrayList.size();
        if (size > 0) {
            tz[] tzVarArr = (tz[]) arrayList.toArray(new tz[size]);
            for (int i = size - 1; i >= 0; i--) {
                tz tzVar = tzVarArr[i];
                if (tzVar.a.M.isShowing()) {
                    tzVar.a.dismiss();
                }
            }
        }
    }

    @Override // defpackage.gv2
    public final boolean e() {
        return false;
    }

    @Override // defpackage.nd4
    public final void f() {
        if (b()) {
            return;
        }
        ArrayList arrayList = this.t;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            w((qu2) obj);
        }
        arrayList.clear();
        View view = this.A;
        this.B = view;
        if (view != null) {
            boolean z = this.K == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.K = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.v);
            }
            this.B.addOnAttachStateChangeListener(this.w);
        }
    }

    @Override // defpackage.gv2
    public final void h(Parcelable parcelable) {
    }

    @Override // defpackage.gv2
    public final void i(fv2 fv2Var) {
        this.J = fv2Var;
    }

    @Override // defpackage.nd4
    public final cx0 k() {
        ArrayList arrayList = this.u;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((tz) arrayList.get(arrayList.size() - 1)).a.p;
    }

    @Override // defpackage.gv2
    public final Parcelable m() {
        return null;
    }

    @Override // defpackage.yu2
    public final void n(qu2 qu2Var) {
        qu2Var.b(this, this.o);
        if (b()) {
            w(qu2Var);
        } else {
            this.t.add(qu2Var);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        tz tzVar;
        ArrayList arrayList = this.u;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                tzVar = null;
                break;
            }
            tzVar = (tz) arrayList.get(i);
            if (!tzVar.a.M.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (tzVar != null) {
            tzVar.b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // defpackage.yu2
    public final void p(View view) {
        if (this.A != view) {
            this.A = view;
            this.z = Gravity.getAbsoluteGravity(this.y, view.getLayoutDirection());
        }
    }

    @Override // defpackage.yu2
    public final void q(boolean z) {
        this.H = z;
    }

    @Override // defpackage.yu2
    public final void r(int i) {
        if (this.y != i) {
            this.y = i;
            this.z = Gravity.getAbsoluteGravity(i, this.A.getLayoutDirection());
        }
    }

    @Override // defpackage.yu2
    public final void s(int i) {
        this.D = true;
        this.F = i;
    }

    @Override // defpackage.yu2
    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.L = onDismissListener;
    }

    @Override // defpackage.yu2
    public final void u(boolean z) {
        this.I = z;
    }

    @Override // defpackage.yu2
    public final void v(int i) {
        this.E = true;
        this.G = i;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0168  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void w(qu2 qu2Var) {
        boolean z;
        char c;
        View childAt;
        tz tzVar;
        int i;
        int i2;
        int i3;
        int width;
        MenuItem item;
        nu2 nu2Var;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.o;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        nu2 nu2Var2 = new nu2(qu2Var, layoutInflaterFrom, this.r, R.layout.abc_cascading_menu_item_layout);
        if (!b() && this.H) {
            nu2Var2.p = true;
        } else if (b()) {
            int size = qu2Var.f.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    z = false;
                    break;
                }
                MenuItem item2 = qu2Var.getItem(i4);
                if (item2.isVisible() && item2.getIcon() != null) {
                    z = true;
                    break;
                }
                i4++;
            }
            nu2Var2.p = z;
        }
        int iO = yu2.o(nu2Var2, context, this.p);
        ev2 ev2Var = new ev2(context, null, this.q, 0);
        ev2Var.P = this.x;
        ev2Var.C = this;
        lg lgVar = ev2Var.M;
        lgVar.setOnDismissListener(this);
        ev2Var.B = this.A;
        ev2Var.y = this.z;
        ev2Var.L = true;
        lgVar.setFocusable(true);
        lgVar.setInputMethodMode(2);
        ev2Var.p(nu2Var2);
        ev2Var.r(iO);
        ev2Var.y = this.z;
        ArrayList arrayList = this.u;
        if (arrayList.size() > 0) {
            tzVar = (tz) arrayList.get(arrayList.size() - 1);
            qu2 qu2Var2 = tzVar.b;
            int size2 = qu2Var2.f.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size2) {
                    item = null;
                    break;
                }
                item = qu2Var2.getItem(i5);
                if (item.hasSubMenu() && qu2Var == item.getSubMenu()) {
                    break;
                } else {
                    i5++;
                }
            }
            if (item == null) {
                c = 0;
                childAt = null;
            } else {
                cx0 cx0Var = tzVar.a.p;
                ListAdapter adapter = cx0Var.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    nu2Var = (nu2) headerViewListAdapter.getWrappedAdapter();
                } else {
                    nu2Var = (nu2) adapter;
                    headersCount = 0;
                }
                int count = nu2Var.getCount();
                int i6 = 0;
                c = 0;
                while (true) {
                    if (i6 >= count) {
                        i6 = -1;
                        break;
                    } else if (item == nu2Var.getItem(i6)) {
                        break;
                    } else {
                        i6++;
                    }
                }
                childAt = (i6 != -1 && (firstVisiblePosition = (i6 + headersCount) - cx0Var.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < cx0Var.getChildCount()) ? cx0Var.getChildAt(firstVisiblePosition) : null;
            }
        } else {
            c = 0;
            childAt = null;
            tzVar = null;
        }
        if (childAt != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = ev2.Q;
                if (method != null) {
                    try {
                        Object[] objArr = new Object[1];
                        objArr[c] = Boolean.FALSE;
                        method.invoke(lgVar, objArr);
                    } catch (Exception unused) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            } else {
                cv2.a(lgVar, c);
            }
            bv2.a(lgVar, null);
            cx0 cx0Var2 = ((tz) arrayList.get(arrayList.size() - 1)).a.p;
            int[] iArr = new int[2];
            cx0Var2.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.B.getWindowVisibleDisplayFrame(rect);
            if (this.C == 1) {
                if (cx0Var2.getWidth() + iArr[0] + iO > rect.right) {
                    i = 0;
                } else {
                    i = 1;
                }
            } else if (iArr[0] - iO < 0) {
                i = 1;
            } else {
                i = 0;
            }
            boolean z2 = i == 1;
            this.C = i;
            if (Build.VERSION.SDK_INT >= 26) {
                ev2Var.B = childAt;
                i2 = 0;
                i3 = 0;
            } else {
                int[] iArr2 = new int[2];
                this.A.getLocationOnScreen(iArr2);
                int[] iArr3 = new int[2];
                childAt.getLocationOnScreen(iArr3);
                if ((this.z & 7) == 5) {
                    iArr2[0] = this.A.getWidth() + iArr2[0];
                    iArr3[0] = childAt.getWidth() + iArr3[0];
                }
                int i7 = iArr3[0] - iArr2[0];
                i2 = iArr3[1] - iArr2[1];
                i3 = i7;
            }
            if ((this.z & 5) != 5) {
                width = z2 ? i3 + childAt.getWidth() : i3 - iO;
            } else if (z2) {
                width = i3 + iO;
            } else {
                iO = childAt.getWidth();
            }
            ev2Var.s = width;
            ev2Var.x = true;
            ev2Var.w = true;
            ev2Var.j(i2);
        } else {
            if (this.D) {
                ev2Var.s = this.F;
            }
            if (this.E) {
                ev2Var.j(this.G);
            }
            Rect rect2 = this.n;
            ev2Var.K = rect2 != null ? new Rect(rect2) : null;
        }
        arrayList.add(new tz(ev2Var, qu2Var, this.C));
        ev2Var.f();
        cx0 cx0Var3 = ev2Var.p;
        cx0Var3.setOnKeyListener(this);
        if (tzVar == null && this.I && qu2Var.m != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) cx0Var3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(qu2Var.m);
            cx0Var3.addHeaderView(frameLayout, null, false);
            ev2Var.f();
        }
    }
}
