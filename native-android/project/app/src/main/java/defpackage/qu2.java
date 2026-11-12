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
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class qu2 implements Menu {
    public static final int[] y = null;
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
    public int l;
    public CharSequence m;
    public Drawable n;
    public View o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public final ArrayList t;
    public final CopyOnWriteArrayList u;
    public tu2 v;
    public boolean w;
    public boolean x;

    static {
        y = new int[]{1, 4, 5, 3, 2, 0};
    }

    public qu2(Context r6) {
        boolean r0 = false;
        this.l = 0;
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = false;
        this.t = new ArrayList();
        this.u = new CopyOnWriteArrayList();
        this.w = false;
        this.a = r6;
        Resources r1 = r6.getResources();
        this.b = r1;
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = true;
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = true;
        if (r1.getConfiguration().keyboard == 1) goto L15;
        ViewConfiguration r2 = ViewConfiguration.get(r6);
        Method r3 = n65.a;
        if (Build.VERSION.SDK_INT < 28) goto L7;
        boolean r7 = ne.t(r2);
    L13:
        if (r7 == false) goto L15;
        r0 = true;
        goto L15
    L7:
        Resources r8 = r6.getResources();
        int r4 = r8.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
        if (r4 != 0) goto L10;
    L12:
        r7 = false;
        goto L13
    L10:
        if (r8.getBoolean(r4) == false) goto L12;
        r7 = true;
    L15:
        this.d = r0;
    }

    public tu2 a(int r11, int r12, int r13, CharSequence r14) {
        int r0 = ((-65536) & r13) >> 16;
        if (r0 >= 0) goto L5;
    L15:
        kf2.n("order does not contain a valid category.");
        return null;
    L5:
        if (r0 >= 6) goto L15;
        int r7 = (y[r0] << 16) | (65535 & r13);
        tu2 r2 = new tu2(this, r11, r12, r13, r7, r14, this.l);
        ArrayList r10 = this.f;
        int r15 = r10.size() - 1;
    L7:
        if (r15 < 0) goto L12;
        if (((tu2) r10.get(r15)).d <= r7) goto L10;
        r15 = r15 - 1;
        goto L7
    L10:
        int r16 = r15 + 1;
    L13:
        r10.add(r16, r2);
        p(true);
        return r2;
    L12:
        r16 = 0;
        goto L13
    }

    @Override // android.view.Menu
    public final MenuItem add(int r2) {
        return a(0, 0, 0, this.b.getString(r2));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int r8, int r9, int r10, ComponentName r11, Intent[] r12, Intent r13, int r14, MenuItem[] r15) {
        PackageManager r0 = this.a.getPackageManager();
        int r1 = 0;
        List<ResolveInfo> r16 = r0.queryIntentActivityOptions(r11, r12, r13, 0);
        if (r16 == null) goto L5;
        int r2 = r16.size();
    L7:
        if ((r14 & 1) != 0) goto L9;
        removeGroup(r8);
    L9:
        if (r1 >= r2) goto L20;
        ResolveInfo r17 = r16.get(r1);
        int r4 = r17.specificIndex;
        if (r4 >= 0) goto L13;
        Intent r5 = r13;
    L14:
        Intent r3 = new Intent(r5);
        ActivityInfo r6 = r17.activityInfo;
        r3.setComponent(new ComponentName(r6.applicationInfo.packageName, r6.name));
        tu2 r7 = a(r8, r9, r10, r17.loadLabel(r0));
        r7.setIcon(r17.loadIcon(r0));
        r7.g = r3;
        if (r15 == null) goto L19;
        int r18 = r17.specificIndex;
        if (r18 < 0) goto L19;
        r15[r18] = r7;
    L19:
        r1 = r1 + 1;
        goto L9
    L13:
        r5 = r12[r4];
        goto L14
    L20:
        return r2;
    L5:
        r2 = 0;
        goto L7
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int r1, int r2, int r3, CharSequence r4) {
        tu2 r5 = a(r1, r2, r3, r4);
        en4 r6 = new en4(this.a, this, r5);
        r5.o = r6;
        r6.setHeaderTitle(r5.e);
        return r6;
    }

    public final void b(gv2 r3, Context r4) {
        WeakReference r0 = new WeakReference(r3);
        this.u.add(r0);
        r3.l(r4, this);
        this.k = true;
    }

    public final void c(boolean r5) {
        if (this.s == false) goto L5;
        return;
    L5:
        this.s = true;
        CopyOnWriteArrayList r0 = this.u;
        Iterator r1 = r0.iterator();
    L7:
        if (r1.hasNext() == false) goto L12;
        WeakReference r2 = (WeakReference) r1.next();
        gv2 r3 = (gv2) r2.get();
        if (r3 == null) goto L10;
        r3.a(this, r5);
        goto L7
    L10:
        r0.remove(r2);
        goto L7
    L12:
        this.s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        tu2 r0 = this.v;
        if (r0 == null) goto L5;
        d(r0);
    L5:
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

    public boolean d(tu2 r6) {
        CopyOnWriteArrayList r0 = this.u;
        boolean r2 = false;
        if (r0.isEmpty() == false) goto L5;
    L18:
        return r2;
    L5:
        if (this.v != r6) goto L18;
        y();
        Iterator r1 = r0.iterator();
    L9:
        if (r1.hasNext() == false) goto L15;
        WeakReference r3 = (WeakReference) r1.next();
        gv2 r4 = (gv2) r3.get();
        if (r4 == null) goto L12;
        r2 = r4.g(r6);
        if (r2 == false) goto L9;
    L12:
        r0.remove(r3);
    L15:
        x();
        if (r2 == false) goto L18;
        this.v = null;
        goto L18
    }

    public boolean e(qu2 r1, MenuItem r2) {
        ou2 r0 = this.e;
        if (r0 != null) goto L5;
        return false;
    L5:
        if (r0.m(r1, r2) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public boolean f(tu2 r6) {
        CopyOnWriteArrayList r0 = this.u;
        boolean r2 = false;
        if (r0.isEmpty() == false) goto L5;
        return false;
    L5:
        y();
        Iterator r1 = r0.iterator();
    L7:
        if (r1.hasNext() == false) goto L13;
        WeakReference r3 = (WeakReference) r1.next();
        gv2 r4 = (gv2) r3.get();
        if (r4 == null) goto L10;
        r2 = r4.j(r6);
        if (r2 == false) goto L7;
    L10:
        r0.remove(r3);
    L13:
        x();
        if (r2 == false) goto L16;
        this.v = r6;
    L16:
        return r2;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int r5) {
        ArrayList r4 = this.f;
        int r0 = r4.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L13;
        tu2 r2 = (tu2) r4.get(r1);
        if (r2.a == r5) goto L6;
        if (r2.hasSubMenu() == false) goto L12;
        MenuItem r3 = r2.o.findItem(r5);
        if (r3 == null) goto L12;
        return r3;
    L12:
        r1 = r1 + 1;
        goto L3
    L6:
        return r2;
    L13:
        return null;
    }

    public final tu2 g(int r11, KeyEvent r12) {
        ArrayList r0 = this.t;
        r0.clear();
        h(r0, r11, r12);
        if (r0.isEmpty() == false) goto L5;
        return null;
    L5:
        int r1 = r12.getMetaState();
        KeyCharacterMap.KeyData r3 = new KeyCharacterMap.KeyData();
        r12.getKeyData(r3);
        int r13 = r0.size();
        if (r13 == 1) goto L8;
        boolean r10 = n();
        int r4 = 0;
    L10:
        if (r4 >= r13) goto L30;
        tu2 r6 = (tu2) r0.get(r4);
        if (r10 == false) goto L14;
        char r7 = r6.j;
    L15:
        char[] r8 = r3.meta;
        if (r7 != r8[0]) goto L20;
        if ((r1 & 2) != 0) goto L20;
    L28:
        return r6;
    L20:
        if (r7 == r8[2]) goto L22;
    L23:
        if (r10 == false) goto L29;
        if (r7 != '\b') goto L29;
        if (r11 == 67) goto L28;
    L29:
        r4 = r4 + 1;
        goto L10
    L22:
        if ((r1 & 2) != 0) goto L28;
    L14:
        r7 = r6.h;
        goto L15
    L30:
        return null;
    L8:
        return (tu2) r0.get(0);
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int r1) {
        return (MenuItem) this.f.get(r1);
    }

    public final void h(List r13, int r14, KeyEvent r15) {
        boolean r0 = n();
        int r1 = r15.getModifiers();
        KeyCharacterMap.KeyData r2 = new KeyCharacterMap.KeyData();
        if (r15.getKeyData(r2) == true) goto L6;
        if (r14 == 67) goto L6;
        return;
    L6:
        ArrayList r12 = this.f;
        int r3 = r12.size();
        int r6 = 0;
    L7:
        if (r6 >= r3) goto L41;
        tu2 r7 = (tu2) r12.get(r6);
        if (r7.hasSubMenu() == false) goto L11;
        r7.o.h(r13, r14, r15);
    L11:
        if (r0 == false) goto L13;
        char r8 = r7.j;
    L14:
        if (r0 == false) goto L16;
        int r9 = r7.k;
    L18:
        if ((r1 & 69647) != (r9 & 69647)) goto L31;
        if (r8 == 0) goto L31;
        char[] r10 = r2.meta;
        if (r8 == r10[0]) goto L29;
        if (r8 == r10[2]) goto L29;
        if (r0 == false) goto L31;
        if (r8 != '\b') goto L31;
        if (r14 != 67) goto L31;
    L29:
        if (r7.isEnabled() == false) goto L31;
        r13.add(r7);
    L31:
        r6 = r6 + 1;
        goto L7
    L16:
        r9 = r7.i;
        goto L18
    L13:
        r8 = r7.h;
        goto L14
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.x == true) goto L9;
        ArrayList r4 = this.f;
        int r0 = r4.size();
        int r2 = 0;
    L6:
        if (r2 >= r0) goto L12;
        if (((tu2) r4.get(r2)).isVisible() == true) goto L15;
        r2 = r2 + 1;
        goto L6
    L15:
        return true;
    L12:
        return false;
    L9:
        return true;
    }

    public final void i() {
        ArrayList r0 = l();
        if (this.k == true) goto L5;
        return;
    L5:
        CopyOnWriteArrayList r1 = this.u;
        Iterator r2 = r1.iterator();
        boolean r4 = false;
    L7:
        if (r2.hasNext() == false) goto L12;
        WeakReference r5 = (WeakReference) r2.next();
        gv2 r6 = (gv2) r5.get();
        if (r6 == null) goto L10;
        r4 = r4 | r6.e();
        goto L7
    L10:
        r1.remove(r5);
        goto L7
    L12:
        ArrayList r3 = this.i;
        ArrayList r7 = this.j;
        if (r4 == false) goto L21;
        r3.clear();
        r7.clear();
        int r8 = r0.size();
        int r9 = 0;
    L15:
        if (r9 >= r8) goto L22;
        tu2 r10 = (tu2) r0.get(r9);
        if ((r10.x & 32) != 32) goto L19;
        r3.add(r10);
    L20:
        r9 = r9 + 1;
        goto L15
    L19:
        r7.add(r10);
    L22:
        this.k = false;
        return;
    L21:
        r3.clear();
        r7.clear();
        r7.addAll(l());
        goto L22
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int r1, KeyEvent r2) {
        if (g(r1, r2) == null) goto L6;
        return true;
    L6:
        return false;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public qu2 k() {
        return this;
    }

    public final ArrayList l() {
        boolean r0 = this.h;
        ArrayList r1 = this.g;
        if (r0 == true) goto L5;
        return r1;
    L5:
        r1.clear();
        ArrayList r2 = this.f;
        int r3 = r2.size();
        int r4 = 0;
    L6:
        if (r4 >= r3) goto L11;
        tu2 r5 = (tu2) r2.get(r4);
        if (r5.isVisible() == false) goto L10;
        r1.add(r5);
    L10:
        r4 = r4 + 1;
        goto L6
    L11:
        this.h = false;
        this.k = true;
        return r1;
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

    public void p(boolean r5) {
        if (this.p == true) goto L18;
        if (r5 == false) goto L6;
        this.h = true;
        this.k = true;
    L6:
        CopyOnWriteArrayList r0 = this.u;
        if (r0.isEmpty() == true) goto L29;
        y();
        Iterator r1 = r0.iterator();
    L11:
        if (r1.hasNext() == false) goto L16;
        WeakReference r2 = (WeakReference) r1.next();
        gv2 r3 = (gv2) r2.get();
        if (r3 == null) goto L14;
        r3.c(r5);
        goto L11
    L14:
        r0.remove(r2);
        goto L11
    L16:
        x();
        return;
    L29:
        return;
    L18:
        this.q = true;
        if (r5 == false) goto L28;
        this.r = true;
        return;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int r2, int r3) {
        return q(findItem(r2), null, r3);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int r1, KeyEvent r2, int r3) {
        tu2 r4 = g(r1, r2);
        if (r4 == null) goto L5;
        boolean r5 = q(r4, null, r3);
    L7:
        if ((r3 & 2) == 0) goto L9;
        c(true);
    L9:
        return r5;
    L5:
        r5 = false;
        goto L7
    }

    public final boolean q(MenuItem r7, gv2 r8, int r9) {
        tu2 r10 = (tu2) r7;
        boolean r0 = false;
        if (r10 != null) goto L5;
    L71:
        return false;
    L5:
        if (r10.isEnabled() == false) goto L71;
        qu2 r1 = r10.n;
        MenuItem.OnMenuItemClickListener r2 = r10.p;
        if (r2 == null) goto L13;
        if (r2.onMenuItemClick(r10) == false) goto L13;
    L11:
        boolean r3 = true;
    L27:
        e5 r4 = r10.A;
        if (r4 != null) goto L30;
    L32:
        boolean r5 = false;
    L34:
        if (r10.e() == false) goto L39;
        r3 = r3 | r10.expandActionView();
        if (r3 == false) goto L70;
        c(true);
    L70:
        return r3;
    L39:
        if (r10.hasSubMenu() == true) goto L46;
        if (r5 == true) goto L46;
        if ((r9 & 1) != 0) goto L70;
        c(true);
    L46:
        if ((r9 & 4) != 0) goto L49;
        c(false);
    L49:
        if (r10.hasSubMenu() == true) goto L51;
        en4 r11 = new en4(this.a, this, r10);
        r10.o = r11;
        r11.setHeaderTitle(r10.e);
    L51:
        en4 r12 = r10.o;
        if (r5 == false) goto L54;
        r4.f(r12);
    L54:
        CopyOnWriteArrayList r13 = this.u;
        if (r13.isEmpty() == true) goto L67;
        if (r8 == null) goto L59;
        r0 = r8.d(r12);
    L59:
        Iterator r14 = r13.iterator();
    L61:
        if (r14.hasNext() == false) goto L67;
        WeakReference r6 = (WeakReference) r14.next();
        gv2 r15 = (gv2) r6.get();
        if (r15 == null) goto L64;
        if (r0 == true) goto L61;
        r0 = r15.d(r12);
        goto L61
    L64:
        r13.remove(r6);
    L67:
        r3 = r3 | r0;
        if (r3 == true) goto L70;
        c(true);
        goto L70
    L30:
        if (r4.a() == false) goto L32;
        r5 = true;
    L13:
        if (r1.e(r1, r10) == true) goto L11;
        Intent r16 = r10.g;
        if (r16 != null) goto L72;
    L21:
        e5 r17 = r10.A;
        if (r17 != null) goto L24;
    L26:
        r3 = false;
        goto L27
    L24:
        if (r17.e() == false) goto L26;
    L72:
        r1.a.startActivity(r16);     // Catch: ActivityNotFoundException -> L19
    L19:
        e = move-exception;
        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
        goto L21
    }

    public final void r(gv2 r4) {
        CopyOnWriteArrayList r3 = this.u;
        Iterator r0 = r3.iterator();
    L4:
        if (r0.hasNext() == false) goto L9;
        WeakReference r1 = (WeakReference) r0.next();
        gv2 r2 = (gv2) r1.get();
        if (r2 == null) goto L8;
        if (r2 != r4) goto L4;
    L8:
        r3.remove(r1);
        goto L4
    }

    @Override // android.view.Menu
    public final void removeGroup(int r6) {
        ArrayList r0 = this.f;
        int r1 = r0.size();
        int r2 = 0;
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L8;
        if (((tu2) r0.get(r3)).b == r6) goto L9;
        r3 = r3 + 1;
    L9:
        if (r3 < 0) goto L30;
        int r4 = r0.size() - r3;
    L11:
        int r5 = r2 + 1;
        if (r2 >= r4) goto L21;
        if (((tu2) r0.get(r3)).b != r6) goto L21;
        if (r3 < 0) goto L20;
        if (r3 >= r0.size()) goto L20;
        r0.remove(r3);
    L20:
        r2 = r5;
    L21:
        p(true);
        return;
    L30:
        return;
    L8:
        r3 = -1;
        goto L9
    }

    @Override // android.view.Menu
    public final void removeItem(int r5) {
        ArrayList r0 = this.f;
        int r1 = r0.size();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L8;
        if (((tu2) r0.get(r2)).a == r5) goto L9;
        r2 = r2 + 1;
    L9:
        if (r2 >= 0) goto L11;
        return;
    L11:
        if (r2 >= r0.size()) goto L18;
        r0.remove(r2);
        p(true);
        return;
    L18:
        return;
    L8:
        r2 = -1;
        goto L9
    }

    public final void s(Bundle r8) {
        if (r8 == null) goto L26;
        SparseArray<Parcelable> r0 = r8.getSparseParcelableArray(j());
        int r1 = this.f.size();
        int r2 = 0;
    L5:
        if (r2 >= r1) goto L15;
        MenuItem r3 = getItem(r2);
        View r4 = r3.getActionView();
        if (r4 == null) goto L12;
        if (r4.getId() == (-1)) goto L12;
        r4.restoreHierarchyState(r0);
    L12:
        if (r3.hasSubMenu() == false) goto L14;
        ((en4) r3.getSubMenu()).s(r8);
    L14:
        r2 = r2 + 1;
        goto L5
    L15:
        int r9 = r8.getInt("android:menu:expandedactionview");
        if (r9 <= 0) goto L24;
        MenuItem r7 = findItem(r9);
        if (r7 == null) goto L25;
        r7.expandActionView();
        return;
    L25:
        return;
    L24:
        return;
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int r5, boolean r6, boolean r7) {
        ArrayList r4 = this.f;
        int r0 = r4.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L8;
        tu2 r2 = (tu2) r4.get(r1);
        if (r2.b != r5) goto L7;
        r2.f(r7);
        r2.setCheckable(r6);
    L7:
        r1 = r1 + 1;
        goto L3
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean r1) {
        this.w = r1;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int r5, boolean r6) {
        ArrayList r4 = this.f;
        int r0 = r4.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L8;
        tu2 r2 = (tu2) r4.get(r1);
        if (r2.b != r5) goto L7;
        r2.setEnabled(r6);
    L7:
        r1 = r1 + 1;
        goto L3
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int r11, boolean r12) {
        ArrayList r0 = this.f;
        int r1 = r0.size();
        int r3 = 0;
        boolean r4 = false;
    L4:
        if (r3 >= r1) goto L15;
        tu2 r6 = (tu2) r0.get(r3);
        if (r6.b != r11) goto L14;
        int r7 = r6.x;
        int r8 = r7 & (-9);
        if (r12 == false) goto L10;
        int r9 = 0;
    L11:
        int r10 = r8 | r9;
        r6.x = r10;
        if (r7 == r10) goto L14;
        r4 = true;
        goto L14
    L10:
        r9 = 8;
    L14:
        r3 = r3 + 1;
        goto L4
    L15:
        if (r4 == false) goto L22;
        p(true);
        return;
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean r1) {
        this.c = r1;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f.size();
    }

    public final void t(Bundle r4) {
        SparseArray r5 = r4.getSparseParcelableArray("android:menu:presenters");
        if (r5 == null) goto L18;
        CopyOnWriteArrayList r3 = this.u;
        if (r3.isEmpty() == true) goto L29;
        Iterator r0 = r3.iterator();
    L9:
        if (r0.hasNext() == false) goto L30;
        WeakReference r1 = (WeakReference) r0.next();
        gv2 r2 = (gv2) r1.get();
        if (r2 == null) goto L12;
        int r6 = r2.getId();
        if (r6 <= 0) goto L9;
        Parcelable r7 = (Parcelable) r5.get(r6);
        if (r7 == null) goto L9;
        r2.h(r7);
        goto L9
    L12:
        r3.remove(r1);
        goto L9
    L30:
        return;
    L29:
        return;
    }

    public final void u(Bundle r8) {
        int r0 = this.f.size();
        SparseArray<? extends Parcelable> r1 = null;
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L17;
        MenuItem r3 = getItem(r2);
        View r4 = r3.getActionView();
        if (r4 == null) goto L14;
        if (r4.getId() == (-1)) goto L14;
        if (r1 != null) goto L10;
        r1 = new SparseArray();
    L10:
        r4.saveHierarchyState(r1);
        if (r3.isActionViewExpanded() == false) goto L14;
        r8.putInt("android:menu:expandedactionview", r3.getItemId());
    L14:
        if (r3.hasSubMenu() == false) goto L16;
        ((en4) r3.getSubMenu()).u(r8);
    L16:
        r2 = r2 + 1;
        goto L3
    L17:
        if (r1 == null) goto L23;
        r8.putSparseParcelableArray(j(), r1);
        return;
    }

    public final void v(Bundle r5) {
        CopyOnWriteArrayList r4 = this.u;
        if (r4.isEmpty() == false) goto L5;
        return;
    L5:
        SparseArray<? extends Parcelable> r0 = new SparseArray();
        Iterator r1 = r4.iterator();
    L7:
        if (r1.hasNext() == false) goto L16;
        WeakReference r2 = (WeakReference) r1.next();
        gv2 r3 = (gv2) r2.get();
        if (r3 == null) goto L10;
        int r6 = r3.getId();
        if (r6 <= 0) goto L7;
        Parcelable r7 = r3.m();
        if (r7 == null) goto L7;
        r0.put(r6, r7);
        goto L7
    L10:
        r4.remove(r2);
        goto L7
    L16:
        r5.putSparseParcelableArray("android:menu:presenters", r0);
    }

    public final void w(int r2, CharSequence r3, int r4, Drawable r5, View r6) {
        if (r6 == null) goto L5;
        this.o = r6;
        this.m = null;
        this.n = null;
    L14:
        p(false);
        return;
    L5:
        if (r2 <= 0) goto L7;
        this.m = this.b.getText(r2);
    L9:
        if (r4 <= 0) goto L11;
        this.n = this.a.getDrawable(r4);
    L13:
        this.o = null;
        goto L14
    L11:
        if (r5 == null) goto L13;
        this.n = r5;
        goto L13
    L7:
        if (r3 == null) goto L9;
        this.m = r3;
        goto L9
    }

    public final void x() {
        this.p = false;
        if (this.q == false) goto L6;
        this.q = false;
        p(this.r);
        return;
    }

    public final void y() {
        if (this.p == true) goto L6;
        this.p = true;
        this.q = false;
        this.r = false;
        return;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence r2) {
        return a(0, 0, 0, r2);
    }

    @Override // android.view.Menu
    public final MenuItem add(int r1, int r2, int r3, CharSequence r4) {
        return a(r1, r2, r3, r4);
    }

    @Override // android.view.Menu
    public final MenuItem add(int r2, int r3, int r4, int r5) {
        return a(r2, r3, r4, this.b.getString(r5));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int r2) {
        return addSubMenu(0, 0, 0, this.b.getString(r2));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence r2) {
        return addSubMenu(0, 0, 0, r2);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int r2, int r3, int r4, int r5) {
        return addSubMenu(r2, r3, r4, this.b.getString(r5));
    }
}
