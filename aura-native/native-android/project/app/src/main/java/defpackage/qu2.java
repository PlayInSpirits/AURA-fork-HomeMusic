package defpackage;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class qu2 implements Menu {
    public static final int[] y = {1, 4, 5, 3, 2, 0};
    public final Context a;
    public final Resources b;
    public boolean c;
    public final boolean d;
    public ou2 e;
    public final ArrayList f;
    public final ArrayList g;
    public boolean h;
    public final ArrayList i;
    public final ArrayList j;
    public boolean k;
    public CharSequence m;
    public Drawable n;
    public View o;
    public tu2 v;
    public boolean x;
    public int l = 0;
    public boolean p = false;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public final ArrayList t = new ArrayList();
    public final CopyOnWriteArrayList u = new CopyOnWriteArrayList();
    public boolean w = false;

    public qu2(Context context) {
        boolean zT;
        boolean z = false;
        this.a = context;
        Resources resources = context.getResources();
        this.b = resources;
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = true;
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = n65.a;
            if (Build.VERSION.SDK_INT >= 28) {
                zT = ne.t(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zT = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zT) {
                z = true;
            }
        }
        this.d = z;
    }

    public tu2 a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 < 0 || i5 >= 6) {
            kf2.n("order does not contain a valid category.");
            return null;
        }
        int i6 = (y[i5] << 16) | (65535 & i3);
        tu2 tu2Var = new tu2(this, i, i2, i3, i6, charSequence, this.l);
        ArrayList arrayList = this.f;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((tu2) arrayList.get(size)).d <= i6) {
                i4 = size + 1;
                arrayList.add(i4, tu2Var);
                p(true);
                return tu2Var;
            }
        }
        i4 = 0;
        arrayList.add(i4, tu2Var);
        p(true);
        return tu2Var;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return a(0, 0, 0, this.b.getString(i));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            tu2 tu2VarA = a(i, i2, i3, resolveInfo.loadLabel(packageManager));
            tu2VarA.setIcon(resolveInfo.loadIcon(packageManager));
            tu2VarA.g = intent2;
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = tu2VarA;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        tu2 tu2VarA = a(i, i2, i3, charSequence);
        en4 en4Var = new en4(this.a, this, tu2VarA);
        tu2VarA.o = en4Var;
        en4Var.setHeaderTitle(tu2VarA.e);
        return en4Var;
    }

    public final void b(gv2 gv2Var, Context context) {
        this.u.add(new WeakReference(gv2Var));
        gv2Var.l(context, this);
        this.k = true;
    }

    public final void c(boolean z) {
        if (this.s) {
            return;
        }
        this.s = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            gv2 gv2Var = (gv2) weakReference.get();
            if (gv2Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                gv2Var.a(this, z);
            }
        }
        this.s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        tu2 tu2Var = this.v;
        if (tu2Var != null) {
            d(tu2Var);
        }
        this.f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.n = null;
        this.m = null;
        this.o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(tu2 tu2Var) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
        boolean zG = false;
        if (!copyOnWriteArrayList.isEmpty() && this.v == tu2Var) {
            y();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                gv2 gv2Var = (gv2) weakReference.get();
                if (gv2Var != null) {
                    zG = gv2Var.g(tu2Var);
                    if (zG) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            x();
            if (zG) {
                this.v = null;
            }
        }
        return zG;
    }

    public boolean e(qu2 qu2Var, MenuItem menuItem) {
        ou2 ou2Var = this.e;
        return ou2Var != null && ou2Var.m(qu2Var, menuItem);
    }

    public boolean f(tu2 tu2Var) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
        boolean zJ = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        y();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            gv2 gv2Var = (gv2) weakReference.get();
            if (gv2Var != null) {
                zJ = gv2Var.j(tu2Var);
                if (zJ) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        x();
        if (zJ) {
            this.v = tu2Var;
        }
        return zJ;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            tu2 tu2Var = (tu2) arrayList.get(i2);
            if (tu2Var.a == i) {
                return tu2Var;
            }
            if (tu2Var.hasSubMenu() && (menuItemFindItem = tu2Var.o.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final tu2 g(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.t;
        arrayList.clear();
        h(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (tu2) arrayList.get(0);
        }
        boolean zN = n();
        for (int i2 = 0; i2 < size; i2++) {
            tu2 tu2Var = (tu2) arrayList.get(i2);
            char c = zN ? tu2Var.j : tu2Var.h;
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (zN && c == '\b' && i == 67))) {
                return tu2Var;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f.get(i);
    }

    public final void h(List list, int i, KeyEvent keyEvent) {
        boolean zN = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList = this.f;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                tu2 tu2Var = (tu2) arrayList.get(i2);
                if (tu2Var.hasSubMenu()) {
                    tu2Var.o.h(list, i, keyEvent);
                }
                char c = zN ? tu2Var.j : tu2Var.h;
                if ((modifiers & 69647) == ((zN ? tu2Var.k : tu2Var.i) & 69647) && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (zN && c == '\b' && i == 67)) && tu2Var.isEnabled()) {
                        list.add(tu2Var);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.x) {
            return true;
        }
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((tu2) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList arrayListL = l();
        if (this.k) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
            boolean zE = false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                gv2 gv2Var = (gv2) weakReference.get();
                if (gv2Var == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zE |= gv2Var.e();
                }
            }
            ArrayList arrayList = this.i;
            ArrayList arrayList2 = this.j;
            if (zE) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListL.size();
                for (int i = 0; i < size; i++) {
                    tu2 tu2Var = (tu2) arrayListL.get(i);
                    if ((tu2Var.x & 32) == 32) {
                        arrayList.add(tu2Var);
                    } else {
                        arrayList2.add(tu2Var);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return g(i, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public qu2 k() {
        return this;
    }

    public final ArrayList l() {
        boolean z = this.h;
        ArrayList arrayList = this.g;
        if (!z) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            tu2 tu2Var = (tu2) arrayList2.get(i);
            if (tu2Var.isVisible()) {
                arrayList.add(tu2Var);
            }
        }
        this.h = false;
        this.k = true;
        return arrayList;
    }

    public boolean m() {
        return this.w;
    }

    public boolean n() {
        return this.c;
    }

    public boolean o() {
        return this.d;
    }

    public void p(boolean z) {
        if (this.p) {
            this.q = true;
            if (z) {
                this.r = true;
                return;
            }
            return;
        }
        if (z) {
            this.h = true;
            this.k = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        y();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            gv2 gv2Var = (gv2) weakReference.get();
            if (gv2Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                gv2Var.c(z);
            }
        }
        x();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return q(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        tu2 tu2VarG = g(i, keyEvent);
        boolean zQ = tu2VarG != null ? q(tu2VarG, null, i2) : false;
        if ((i2 & 2) != 0) {
            c(true);
        }
        return zQ;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:32:0x004d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0054  */
    /* JADX WARN: Code duplicated, block: B:37:0x005b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0060  */
    /* JADX WARN: Code duplicated, block: B:45:0x0071  */
    /* JADX WARN: Code duplicated, block: B:47:0x0075  */
    /* JADX WARN: Code duplicated, block: B:50:0x007e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:57:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x009e  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00a6 A[SYNTHETIC] */
    public final boolean q(MenuItem menuItem, gv2 gv2Var, int i) {
        e5 e5Var;
        boolean zExpandActionView;
        e5 e5Var2;
        boolean z;
        en4 en4Var;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList;
        gv2 gv2Var2;
        tu2 tu2Var = (tu2) menuItem;
        boolean zD = false;
        if (tu2Var == null || !tu2Var.isEnabled()) {
            return false;
        }
        qu2 qu2Var = tu2Var.n;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = tu2Var.p;
        if ((onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(tu2Var)) && !qu2Var.e(qu2Var, tu2Var)) {
            Intent intent = tu2Var.g;
            if (intent != null) {
                try {
                    qu2Var.a.startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
                    e5Var = tu2Var.A;
                    if (e5Var == null) {
                    }
                    zExpandActionView = false;
                    e5Var2 = tu2Var.A;
                    if (e5Var2 == null) {
                        z = false;
                    } else {
                        z = false;
                    }
                    if (tu2Var.e()) {
                        zExpandActionView |= tu2Var.expandActionView();
                        if (zExpandActionView) {
                            c(true);
                        }
                    } else if (tu2Var.hasSubMenu()) {
                        if ((i & 4) == 0) {
                            c(false);
                        }
                        if (!tu2Var.hasSubMenu()) {
                            en4 en4Var2 = new en4(this.a, this, tu2Var);
                            tu2Var.o = en4Var2;
                            en4Var2.setHeaderTitle(tu2Var.e);
                        }
                        en4Var = tu2Var.o;
                        if (z) {
                            e5Var2.f(en4Var);
                        }
                        copyOnWriteArrayList = this.u;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            if (gv2Var != null) {
                            }
                            for (WeakReference weakReference : copyOnWriteArrayList) {
                                gv2Var2 = (gv2) weakReference.get();
                                if (gv2Var2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!zD) {
                                    zD = gv2Var2.d(en4Var);
                                }
                            }
                        }
                        zExpandActionView |= zD;
                        if (!zExpandActionView) {
                            c(true);
                        }
                    } else {
                        if ((i & 4) == 0) {
                            c(false);
                        }
                        if (!tu2Var.hasSubMenu()) {
                            en4 en4Var3 = new en4(this.a, this, tu2Var);
                            tu2Var.o = en4Var3;
                            en4Var3.setHeaderTitle(tu2Var.e);
                        }
                        en4Var = tu2Var.o;
                        if (z) {
                            e5Var2.f(en4Var);
                        }
                        copyOnWriteArrayList = this.u;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            zD = gv2Var != null ? gv2Var.d(en4Var) : false;
                            while (r8.hasNext()) {
                                gv2Var2 = (gv2) weakReference.get();
                                if (gv2Var2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!zD) {
                                    zD = gv2Var2.d(en4Var);
                                }
                            }
                        }
                        zExpandActionView |= zD;
                        if (!zExpandActionView) {
                            c(true);
                        }
                    }
                    return zExpandActionView;
                }
                zExpandActionView = true;
            } else {
                e5Var = tu2Var.A;
                if (e5Var == null && e5Var.e()) {
                    zExpandActionView = true;
                } else {
                    zExpandActionView = false;
                }
            }
        } else {
            zExpandActionView = true;
        }
        e5Var2 = tu2Var.A;
        if (e5Var2 == null && e5Var2.a()) {
            z = true;
        } else {
            z = false;
        }
        if (tu2Var.e()) {
            zExpandActionView |= tu2Var.expandActionView();
            if (zExpandActionView) {
                c(true);
            }
        } else if (tu2Var.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                c(false);
            }
            if (!tu2Var.hasSubMenu()) {
                en4 en4Var4 = new en4(this.a, this, tu2Var);
                tu2Var.o = en4Var4;
                en4Var4.setHeaderTitle(tu2Var.e);
            }
            en4Var = tu2Var.o;
            if (z) {
                e5Var2.f(en4Var);
            }
            copyOnWriteArrayList = this.u;
            if (!copyOnWriteArrayList.isEmpty()) {
                if (gv2Var != null) {
                }
                while (r8.hasNext()) {
                    gv2Var2 = (gv2) weakReference.get();
                    if (gv2Var2 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zD) {
                        zD = gv2Var2.d(en4Var);
                    }
                }
            }
            zExpandActionView |= zD;
            if (!zExpandActionView) {
                c(true);
            }
        } else if ((i & 1) == 0) {
            c(true);
        }
        return zExpandActionView;
    }

    public final void r(gv2 gv2Var) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            gv2 gv2Var2 = (gv2) weakReference.get();
            if (gv2Var2 == null || gv2Var2 == gv2Var) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((tu2) arrayList.get(i3)).b == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((tu2) arrayList.get(i3)).b != i) {
                    break;
                }
                if (i3 >= 0 && i3 < arrayList.size()) {
                    arrayList.remove(i3);
                }
                i2 = i4;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((tu2) arrayList.get(i2)).a == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0 || i2 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i2);
        p(true);
    }

    public final void s(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((en4) item.getSubMenu()).s(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (menuItemFindItem = findItem(i2)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            tu2 tu2Var = (tu2) arrayList.get(i2);
            if (tu2Var.b == i) {
                tu2Var.f(z2);
                tu2Var.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.w = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            tu2 tu2Var = (tu2) arrayList.get(i2);
            if (tu2Var.b == i) {
                tu2Var.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            tu2 tu2Var = (tu2) arrayList.get(i2);
            if (tu2Var.b == i) {
                int i3 = tu2Var.x;
                int i4 = (i3 & (-9)) | (z ? 0 : 8);
                tu2Var.x = i4;
                if (i3 != i4) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.c = z;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f.size();
    }

    public final void t(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
            if (copyOnWriteArrayList.isEmpty()) {
                return;
            }
            for (WeakReference weakReference : copyOnWriteArrayList) {
                gv2 gv2Var = (gv2) weakReference.get();
                if (gv2Var == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    int id = gv2Var.getId();
                    if (id > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id)) != null) {
                        gv2Var.h(parcelable);
                    }
                }
            }
        }
    }

    public final void u(Bundle bundle) {
        int size = this.f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((en4) item.getSubMenu()).u(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void v(Bundle bundle) {
        Parcelable parcelableM;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            gv2 gv2Var = (gv2) weakReference.get();
            if (gv2Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                int id = gv2Var.getId();
                if (id > 0 && (parcelableM = gv2Var.m()) != null) {
                    sparseArray.put(id, parcelableM);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
    }

    public final void w(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.o = view;
            this.m = null;
            this.n = null;
        } else {
            if (i > 0) {
                this.m = this.b.getText(i);
            } else if (charSequence != null) {
                this.m = charSequence;
            }
            if (i2 > 0) {
                this.n = this.a.getDrawable(i2);
            } else if (drawable != null) {
                this.n = drawable;
            }
            this.o = null;
        }
        p(false);
    }

    public final void x() {
        this.p = false;
        if (this.q) {
            this.q = false;
            p(this.r);
        }
    }

    public final void y() {
        if (this.p) {
            return;
        }
        this.p = true;
        this.q = false;
        this.r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return a(i, i2, i3, this.b.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.b.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.b.getString(i4));
    }
}
