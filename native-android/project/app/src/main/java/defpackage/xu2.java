package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xu2 extends b3 implements MenuItem {
    public final oo4 c;
    public Method d;

    public xu2(Context r1, oo4 r2) {
        super(r1);
        if (r2 == null) goto L6;
        this.c = r2;
        return;
    L6:
        kf2.n("Wrapped Object can not be null.");
        throw null;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return this.c.collapseActionView();
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return this.c.expandActionView();
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        e5 r1 = this.c.b();
        if ((r1 instanceof uu2) == true) goto L5;
        return null;
    L5:
        return ((uu2) r1).d;
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View r1 = this.c.getActionView();
        if ((r1 instanceof vu2) == true) goto L5;
        return r1;
    L5:
        return (View) ((vu2) r1).n;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.c.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.c.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.c.getContentDescription();
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.c.getGroupId();
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.c.getIcon();
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.c.getIconTintList();
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.c.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.c.getIntent();
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.c.getItemId();
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.c.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.c.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.c.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.c.getOrder();
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.c.getSubMenu();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.c.getTitle();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        return this.c.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.c.getTooltipText();
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.c.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.c.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return this.c.isCheckable();
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return this.c.isChecked();
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return this.c.isEnabled();
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return this.c.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider r3) {
        uu2 r0 = new uu2(this, (Context) this.a, r3);
        if (r3 != null) goto L6;
        r0 = null;
    L6:
        this.c.a(r0);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int r3) {
        oo4 r0 = this.c;
        r0.setActionView(r3);
        View r4 = r0.getActionView();
        if ((r4 instanceof CollapsibleActionView) == false) goto L5;
        r0.setActionView(new vu2(r4));
    L5:
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char r2) {
        this.c.setAlphabeticShortcut(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean r2) {
        this.c.setCheckable(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean r2) {
        this.c.setChecked(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence r2) {
        this.c.setContentDescription(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean r2) {
        this.c.setEnabled(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable r2) {
        this.c.setIcon(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList r2) {
        this.c.setIconTintList(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode r2) {
        this.c.setIconTintMode(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent r2) {
        this.c.setIntent(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char r2) {
        this.c.setNumericShortcut(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener r2) {
        if (r2 == null) goto L4;
        wu2 r0 = new wu2(this, r2);
    L5:
        this.c.setOnActionExpandListener(r0);
        return this;
    L4:
        r0 = null;
        goto L5
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener r2) {
        if (r2 == null) goto L4;
        lo4 r0 = new lo4(this, r2);
    L5:
        this.c.setOnMenuItemClickListener(r0);
        return this;
    L4:
        r0 = null;
        goto L5
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char r2, char r3) {
        this.c.setShortcut(r2, r3);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int r1) {
        this.c.setShowAsAction(r1);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int r2) {
        this.c.setShowAsActionFlags(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence r2) {
        this.c.setTitle(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence r2) {
        this.c.setTitleCondensed(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence r2) {
        this.c.setTooltipText(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean r1) {
        return this.c.setVisible(r1);
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char r2, int r3) {
        this.c.setAlphabeticShortcut(r2, r3);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int r2) {
        this.c.setIcon(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char r2, int r3) {
        this.c.setNumericShortcut(r2, r3);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char r2, char r3, int r4, int r5) {
        this.c.setShortcut(r2, r3, r4, r5);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int r2) {
        this.c.setTitle(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View r2) {
        if ((r2 instanceof CollapsibleActionView) == false) goto L5;
        r2 = new vu2(r2);
    L5:
        this.c.setActionView(r2);
        return this;
    }
}
