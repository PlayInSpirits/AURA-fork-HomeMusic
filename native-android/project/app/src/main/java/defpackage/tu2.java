package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tu2 implements oo4 {
    public e5 A;
    public MenuItem.OnActionExpandListener B;
    public boolean C;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public CharSequence e;
    public CharSequence f;
    public Intent g;
    public char h;
    public int i;
    public char j;
    public int k;
    public Drawable l;
    public int m;
    public final qu2 n;
    public en4 o;
    public MenuItem.OnMenuItemClickListener p;
    public CharSequence q;
    public CharSequence r;
    public ColorStateList s;
    public PorterDuff.Mode t;
    public boolean u;
    public boolean v;
    public boolean w;
    public int x;
    public int y;
    public View z;

    public tu2(qu2 r3, int r4, int r5, int r6, int r7, CharSequence r8, int r9) {
        this.i = 4096;
        this.k = 4096;
        this.m = 0;
        this.s = null;
        this.t = null;
        this.u = false;
        this.v = false;
        this.w = false;
        this.x = 16;
        this.C = false;
        this.n = r3;
        this.a = r5;
        this.b = r4;
        this.c = r6;
        this.d = r7;
        this.e = r8;
        this.y = r9;
    }

    public static void c(int r0, int r1, String r2, StringBuilder r3) {
        if ((r0 & r1) != r1) goto L6;
        r3.append(r2);
        return;
    }

    @Override // defpackage.oo4
    public final oo4 a(e5 r3) {
        e5 r0 = this.A;
        if (r0 == null) goto L5;
        r0.b = null;
    L5:
        this.z = null;
        this.A = r3;
        this.n.p(true);
        e5 r4 = this.A;
        if (r4 == null) goto L8;
        r4.h(new om1(11, this));
    L8:
        return this;
    }

    @Override // defpackage.oo4
    public final e5 b() {
        return this.A;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.y & 8) != 0) goto L6;
        return false;
    L6:
        if (this.z != null) goto L9;
        return true;
    L9:
        MenuItem.OnActionExpandListener r0 = this.B;
        if (r0 == null) goto L17;
        if (r0.onMenuItemActionCollapse(this) == true) goto L17;
        return false;
    L17:
        return this.n.d(this);
    }

    public final Drawable d(Drawable r2) {
        if (r2 != null) goto L4;
    L16:
        return r2;
    L4:
        if (this.w == false) goto L16;
        if (this.u == false) goto L8;
    L9:
        r2 = r2.mutate();
        if (this.u == false) goto L13;
        r2.setTintList(this.s);
    L13:
        if (this.v == false) goto L15;
        r2.setTintMode(this.t);
    L15:
        this.w = false;
        goto L16
    L8:
        if (this.v == false) goto L16;
        goto L9
    }

    public final boolean e() {
        if ((this.y & 8) != 0) goto L5;
        return false;
    L5:
        if (this.z != null) goto L10;
        e5 r0 = this.A;
        if (r0 == null) goto L10;
        this.z = r0.d(this);
    L10:
        if (this.z == null) goto L15;
        return true;
    L15:
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (e() == false) goto L14;
        MenuItem.OnActionExpandListener r0 = this.B;
        if (r0 == null) goto L13;
        if (r0.onMenuItemActionExpand(this) == true) goto L13;
        return false;
    L13:
        return this.n.f(this);
    L14:
        return false;
    }

    public final void f(boolean r2) {
        int r0 = this.x & (-5);
        if (r2 == false) goto L5;
        int r3 = 4;
    L6:
        this.x = r3 | r0;
        return;
    L5:
        r3 = 0;
        goto L6
    }

    public final void g(boolean r2) {
        int r0 = this.x;
        if (r2 == false) goto L6;
        this.x = r0 | 32;
        return;
    L6:
        this.x = r0 & (-33);
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View r0 = this.z;
        if (r0 == null) goto L5;
        return r0;
    L5:
        e5 r1 = this.A;
        if (r1 == null) goto L9;
        View r2 = r1.d(this);
        this.z = r2;
        return r2;
    L9:
        return null;
    }

    @Override // defpackage.oo4, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.j;
    }

    @Override // defpackage.oo4, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable r0 = this.l;
        if (r0 != null) goto L5;
        int r1 = this.m;
        if (r1 == 0) goto L10;
        Drawable r2 = zz1.r(this.n.a, r1);
        this.m = 0;
        this.l = r2;
        return d(r2);
    L10:
        return null;
    L5:
        return d(r0);
    }

    @Override // defpackage.oo4, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.s;
    }

    @Override // defpackage.oo4, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // defpackage.oo4, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence r0 = this.f;
        if (r0 == null) goto L6;
        return r0;
    L6:
        return this.e;
    }

    @Override // defpackage.oo4, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        if (this.o == null) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        if ((this.x & 1) != 1) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        if ((this.x & 2) != 2) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        if ((this.x & 16) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        e5 r0 = this.A;
        if (r0 == null) goto L12;
        if (r0.g() == false) goto L12;
        if ((this.x & 8) == 0) goto L9;
        return false;
    L9:
        if (this.A.b() == false) goto L18;
        return true;
    L18:
        return false;
    L12:
        if ((this.x & 8) != 0) goto L19;
        return true;
    L19:
        return false;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider r1) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int r5) {
        qu2 r0 = this.n;
        Context r1 = r0.a;
        View r6 = LayoutInflater.from(r1).inflate(r5, new LinearLayout(r1), false);
        this.z = r6;
        this.A = null;
        if (r6 != null) goto L5;
    L9:
        r0.k = true;
        r0.p(true);
        return this;
    L5:
        if (r6.getId() != (-1)) goto L9;
        int r2 = this.a;
        if (r2 <= 0) goto L9;
        r6.setId(r2);
        goto L9
    }

    @Override // defpackage.oo4, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char r2, int r3) {
        if (this.j == r2) goto L5;
    L7:
        this.j = Character.toLowerCase(r2);
        this.k = KeyEvent.normalizeMetaState(r3);
        this.n.p(false);
        return this;
    L5:
        if (this.k != r3) goto L7;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean r3) {
        int r0 = this.x;
        int r4 = r3 ? 1 : 0;
        int r5 = r4 | (r0 & (-2));
        this.x = r5;
        if (r0 == r5) goto L5;
        this.n.p(false);
    L5:
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean r10) {
        int r0 = this.x;
        int r1 = r0 & 4;
        int r2 = 2;
        qu2 r3 = this.n;
        if (r1 == 0) goto L26;
        ArrayList r11 = r3.f;
        int r4 = r11.size();
        r3.y();
        int r5 = 0;
    L5:
        if (r5 >= r4) goto L24;
        tu2 r6 = (tu2) r11.get(r5);
        if (r6.b != this.b) goto L23;
        if ((r6.x & 4) == 0) goto L23;
        if (r6.isCheckable() == false) goto L23;
        if (r6 != this) goto L15;
        boolean r7 = true;
    L16:
        int r8 = r6.x;
        int r9 = r8 & (-3);
        if (r7 == false) goto L19;
        int r12 = 2;
    L20:
        int r13 = r12 | r9;
        r6.x = r13;
        if (r8 == r13) goto L23;
        r6.n.p(false);
        goto L23
    L19:
        r12 = 0;
        goto L20
    L15:
        r7 = false;
    L23:
        r5 = r5 + 1;
        goto L5
    L24:
        r3.x();
        return this;
    L26:
        int r14 = r0 & (-3);
        if (r10 == true) goto L30;
        r2 = 0;
    L30:
        int r15 = r14 | r2;
        this.x = r15;
        if (r0 == r15) goto L33;
        r3.p(false);
    L33:
        return this;
    }

    @Override // defpackage.oo4, android.view.MenuItem
    public final oo4 setContentDescription(CharSequence r2) {
        this.q = r2;
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean r2) {
        int r0 = this.x;
        if (r2 == false) goto L5;
        this.x = r0 | 16;
    L6:
        this.n.p(false);
        return this;
    L5:
        this.x = r0 & (-17);
        goto L6
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int r2) {
        this.l = null;
        this.m = r2;
        this.w = true;
        this.n.p(false);
        return this;
    }

    @Override // defpackage.oo4, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList r2) {
        this.s = r2;
        this.u = true;
        this.w = true;
        this.n.p(false);
        return this;
    }

    @Override // defpackage.oo4, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode r2) {
        this.t = r2;
        this.v = true;
        this.w = true;
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent r1) {
        this.g = r1;
        return this;
    }

    @Override // defpackage.oo4, android.view.MenuItem
    public final MenuItem setNumericShortcut(char r2, int r3) {
        if (this.h == r2) goto L5;
    L7:
        this.h = r2;
        this.i = KeyEvent.normalizeMetaState(r3);
        this.n.p(false);
        return this;
    L5:
        if (this.i != r3) goto L7;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener r1) {
        this.B = r1;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener r1) {
        this.p = r1;
        return this;
    }

    @Override // defpackage.oo4, android.view.MenuItem
    public final MenuItem setShortcut(char r1, char r2, int r3, int r4) {
        this.h = r1;
        this.i = KeyEvent.normalizeMetaState(r3);
        this.j = Character.toLowerCase(r2);
        this.k = KeyEvent.normalizeMetaState(r4);
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int r4) {
        int r0 = r4 & 3;
        if (r0 == 0) goto L10;
        if (r0 == 1) goto L10;
        if (r0 == 2) goto L10;
        kf2.n("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        return;
    L10:
        this.y = r4;
        qu2 r3 = this.n;
        r3.k = true;
        r3.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int r1) {
        setShowAsAction(r1);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence r3) {
        this.e = r3;
        this.n.p(false);
        en4 r0 = this.o;
        if (r0 == null) goto L5;
        r0.setHeaderTitle(r3);
    L5:
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence r2) {
        this.f = r2;
        this.n.p(false);
        return this;
    }

    @Override // defpackage.oo4, android.view.MenuItem
    public final oo4 setTooltipText(CharSequence r2) {
        this.r = r2;
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean r3) {
        int r0 = this.x;
        int r1 = r0 & (-9);
        if (r3 == false) goto L5;
        int r4 = 0;
    L6:
        int r5 = r4 | r1;
        this.x = r5;
        if (r0 == r5) goto L9;
        qu2 r6 = this.n;
        r6.h = true;
        r6.p(true);
    L9:
        return this;
    L5:
        r4 = 8;
        goto L6
    }

    public final String toString() {
        CharSequence r0 = this.e;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.toString();
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence r1) {
        setContentDescription(r1);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence r1) {
        setTooltipText(r1);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable r2) {
        this.m = 0;
        this.l = r2;
        this.w = true;
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int r2) {
        setTitle(this.n.a.getString(r2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char r2) {
        if (this.h != r2) goto L5;
        return this;
    L5:
        this.h = r2;
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char r1, char r2) {
        this.h = r1;
        this.j = Character.toLowerCase(r2);
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char r2) {
        if (this.j != r2) goto L5;
        return this;
    L5:
        this.j = Character.toLowerCase(r2);
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View r3) {
        this.z = r3;
        this.A = null;
        if (r3 != null) goto L5;
    L9:
        qu2 r4 = this.n;
        r4.k = true;
        r4.p(true);
        return this;
    L5:
        if (r3.getId() != (-1)) goto L9;
        int r0 = this.a;
        if (r0 <= 0) goto L9;
        r3.setId(r0);
        goto L9
    }
}
