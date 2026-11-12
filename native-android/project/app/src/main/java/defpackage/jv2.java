package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class jv2 extends b3 implements Menu {
    public final qu2 c;

    public jv2(Context r1, qu2 r2) {
        super(r1);
        if (r2 == null) goto L6;
        this.c = r2;
        return;
    L6:
        kf2.n("Wrapped Object can not be null.");
        throw null;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence r3) {
        return h(this.c.a(0, 0, 0, r3));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int r12, int r13, int r14, ComponentName r15, Intent[] r16, Intent r17, int r18, MenuItem[] r19) {
        if (r19 == null) goto L6;
        MenuItem[] r1 = new MenuItem[r19.length];
    L5:
        MenuItem[] r10 = r1;
        int r110 = this.c.addIntentOptions(r12, r13, r14, r15, r16, r17, r18, r10);
        if (r10 == null) goto L12;
        int r111 = r10.length;
        int r112 = 0;
    L10:
        if (r112 >= r111) goto L12;
        r19[r112] = h(r10[r112]);
        r112 = r112 + 1;
    L12:
        return r110;
    L6:
        r1 = null;
        goto L5
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence r2) {
        return this.c.addSubMenu(0, 0, 0, r2);
    }

    @Override // android.view.Menu
    public final void clear() {
        yd4 r0 = (yd4) this.b;
        if (r0 == null) goto L5;
        r0.clear();
    L5:
        this.c.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.c.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int r2) {
        return h(this.c.findItem(r2));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int r2) {
        return h(this.c.getItem(r2));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.c.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int r1, KeyEvent r2) {
        return this.c.isShortcutKey(r1, r2);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int r1, int r2) {
        return this.c.performIdentifierAction(r1, r2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int r1, KeyEvent r2, int r3) {
        return this.c.performShortcut(r1, r2, r3);
    }

    @Override // android.view.Menu
    public final void removeGroup(int r4) {
        if (((yd4) this.b) == null) goto L12;
        int r0 = 0;
    L6:
        yd4 r1 = (yd4) this.b;
        if (r0 >= r1.p) goto L12;
        if (((oo4) r1.f(r0)).getGroupId() != r4) goto L11;
        ((yd4) this.b).h(r0);
        r0 = r0 - 1;
    L11:
        r0 = r0 + 1;
    L12:
        this.c.removeGroup(r4);
    }

    @Override // android.view.Menu
    public final void removeItem(int r4) {
        if (((yd4) this.b) == null) goto L12;
        int r0 = 0;
    L6:
        yd4 r1 = (yd4) this.b;
        if (r0 >= r1.p) goto L12;
        if (((oo4) r1.f(r0)).getItemId() == r4) goto L10;
        r0 = r0 + 1;
        goto L6
    L10:
        ((yd4) this.b).h(r0);
    L12:
        this.c.removeItem(r4);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int r1, boolean r2, boolean r3) {
        this.c.setGroupCheckable(r1, r2, r3);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int r1, boolean r2) {
        this.c.setGroupEnabled(r1, r2);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int r1, boolean r2) {
        this.c.setGroupVisible(r1, r2);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean r1) {
        this.c.setQwertyMode(r1);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.c.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int r1) {
        return this.c.addSubMenu(r1);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int r1, int r2, int r3, CharSequence r4) {
        return this.c.addSubMenu(r1, r2, r3, r4);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int r1, int r2, int r3, int r4) {
        return this.c.addSubMenu(r1, r2, r3, r4);
    }

    @Override // android.view.Menu
    public final MenuItem add(int r2) {
        return h(this.c.add(r2));
    }

    @Override // android.view.Menu
    public final MenuItem add(int r2, int r3, int r4, CharSequence r5) {
        return h(this.c.a(r2, r3, r4, r5));
    }

    @Override // android.view.Menu
    public final MenuItem add(int r2, int r3, int r4, int r5) {
        return h(this.c.add(r2, r3, r4, r5));
    }
}
