package defpackage;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class q4 implements oo4 {
    public CharSequence a;
    public CharSequence b;
    public Intent c;
    public char d;
    public int e;
    public char f;
    public int g;
    public Drawable h;
    public Context i;
    public CharSequence j;
    public CharSequence k;
    public ColorStateList l;
    public PorterDuff.Mode m;
    public boolean n;
    public boolean o;
    public int p;

    @Override // defpackage.oo4
    public final oo4 a(e5 r1) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.oo4
    public final e5 b() {
        return null;
    }

    public final void c() {
        Drawable r0 = this.h;
        if (r0 != null) goto L5;
        return;
    L5:
        if (this.n == false) goto L7;
    L8:
        this.h = r0;
        Drawable r1 = r0.mutate();
        this.h = r1;
        if (this.n == false) goto L12;
        r1.setTintList(this.l);
    L12:
        if (this.o == false) goto L17;
        this.h.setTintMode(this.m);
        return;
    L17:
        return;
    L7:
        if (this.o == true) goto L8;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // defpackage.oo4, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f;
    }

    @Override // defpackage.oo4, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.h;
    }

    @Override // defpackage.oo4, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.l;
    }

    @Override // defpackage.oo4, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // defpackage.oo4, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence r0 = this.b;
        if (r0 == null) goto L6;
        return r0;
    L6:
        return this.a;
    }

    @Override // defpackage.oo4, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        if ((this.p & 1) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        if ((this.p & 2) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        if ((this.p & 16) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        if ((this.p & 8) != 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider r1) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View r1) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.oo4, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char r1, int r2) {
        this.f = Character.toLowerCase(r1);
        this.g = KeyEvent.normalizeMetaState(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean r2) {
        int r0 = this.p & (-2);
        this.p = (r2 ? 1 : 0) | r0;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean r2) {
        int r0 = this.p & (-3);
        if (r2 == false) goto L5;
        int r3 = 2;
    L6:
        this.p = r3 | r0;
        return this;
    L5:
        r3 = 0;
        goto L6
    }

    @Override // defpackage.oo4, android.view.MenuItem
    public final oo4 setContentDescription(CharSequence r1) {
        this.j = r1;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean r2) {
        int r0 = this.p & (-17);
        if (r2 == false) goto L5;
        int r3 = 16;
    L6:
        this.p = r3 | r0;
        return this;
    L5:
        r3 = 0;
        goto L6
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int r2) {
        this.h = this.i.getDrawable(r2);
        c();
        return this;
    }

    @Override // defpackage.oo4, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList r1) {
        this.l = r1;
        this.n = true;
        c();
        return this;
    }

    @Override // defpackage.oo4, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode r1) {
        this.m = r1;
        this.o = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent r1) {
        this.c = r1;
        return this;
    }

    @Override // defpackage.oo4, android.view.MenuItem
    public final MenuItem setNumericShortcut(char r1, int r2) {
        this.d = r1;
        this.e = KeyEvent.normalizeMetaState(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener r1) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener r1) {
        return this;
    }

    @Override // defpackage.oo4, android.view.MenuItem
    public final MenuItem setShortcut(char r1, char r2, int r3, int r4) {
        this.d = r1;
        this.e = KeyEvent.normalizeMetaState(r3);
        this.f = Character.toLowerCase(r2);
        this.g = KeyEvent.normalizeMetaState(r4);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int r1) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int r1) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int r2) {
        this.a = this.i.getResources().getString(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence r1) {
        this.b = r1;
        return this;
    }

    @Override // defpackage.oo4, android.view.MenuItem
    public final oo4 setTooltipText(CharSequence r1) {
        this.k = r1;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean r3) {
        int r1 = 8;
        int r0 = this.p & 8;
        if (r3 == false) goto L5;
        r1 = 0;
    L5:
        this.p = r0 | r1;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence r1) {
        this.j = r1;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence r1) {
        this.k = r1;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int r1) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char r1) {
        this.d = r1;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable r1) {
        this.h = r1;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char r1) {
        this.f = Character.toLowerCase(r1);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence r1) {
        this.a = r1;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char r1, char r2) {
        this.d = r1;
        this.f = Character.toLowerCase(r2);
        return this;
    }
}
