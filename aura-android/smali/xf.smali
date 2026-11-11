.class public final Lxf;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/Window$Callback;


# instance fields
.field public final n:Landroid/view/Window$Callback;

.field public o:Lom1;

.field public p:Z

.field public q:Z

.field public r:Z

.field public final synthetic s:Lbg;


# direct methods
.method public constructor <init>(Lbg;Landroid/view/Window$Callback;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxf;->s:Lbg;

    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    iput-object p2, p0, Lxf;->n:Landroid/view/Window$Callback;

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    const-string p0, "Window callback may not be null"

    .line 12
    .line 13
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    throw p0
.end method


# virtual methods
.method public final a(Landroid/view/Window$Callback;)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    iput-boolean v0, p0, Lxf;->p:Z

    .line 4
    .line 5
    invoke-interface {p1}, Landroid/view/Window$Callback;->onContentChanged()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    iput-boolean v1, p0, Lxf;->p:Z

    .line 9
    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception p1

    .line 12
    iput-boolean v1, p0, Lxf;->p:Z

    .line 13
    .line 14
    throw p1
.end method

.method public final b(ILandroid/view/Menu;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lxf;->n:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final c(ILandroid/view/Menu;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lxf;->n:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final d(Ljava/util/List;Landroid/view/Menu;I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lxf;->n:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-static {p0, p1, p2, p3}, Lea5;->a(Landroid/view/Window$Callback;Ljava/util/List;Landroid/view/Menu;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lxf;->n:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Landroid/view/Window$Callback;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lxf;->q:Z

    .line 2
    .line 3
    iget-object v1, p0, Lxf;->n:Landroid/view/Window$Callback;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v1, p1}, Landroid/view/Window$Callback;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    iget-object p0, p0, Lxf;->s:Lbg;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lbg;->z(Landroid/view/KeyEvent;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-nez p0, :cond_2

    .line 19
    .line 20
    invoke-interface {v1, p1}, Landroid/view/Window$Callback;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-eqz p0, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 p0, 0x0

    .line 28
    return p0

    .line 29
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 30
    return p0
.end method

.method public final dispatchKeyShortcutEvent(Landroid/view/KeyEvent;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lxf;->n:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->dispatchKeyShortcutEvent(Landroid/view/KeyEvent;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-nez v0, :cond_3

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget-object p0, p0, Lxf;->s:Lbg;

    .line 15
    .line 16
    invoke-virtual {p0}, Lbg;->G()V

    .line 17
    .line 18
    .line 19
    iget-object v2, p0, Lbg;->A:Ll93;

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    invoke-virtual {v2, v0, p1}, Ll93;->P(ILandroid/view/KeyEvent;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iget-object v0, p0, Lbg;->Z:Lag;

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    invoke-virtual {p0, v0, v2, p1}, Lbg;->L(Lag;ILandroid/view/KeyEvent;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    iget-object p0, p0, Lbg;->Z:Lag;

    .line 45
    .line 46
    if-eqz p0, :cond_3

    .line 47
    .line 48
    iput-boolean v1, p0, Lag;->l:Z

    .line 49
    .line 50
    return v1

    .line 51
    :cond_1
    iget-object v0, p0, Lbg;->Z:Lag;

    .line 52
    .line 53
    const/4 v2, 0x0

    .line 54
    if-nez v0, :cond_2

    .line 55
    .line 56
    invoke-virtual {p0, v2}, Lbg;->F(I)Lag;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {p0, v0, p1}, Lbg;->M(Lag;Landroid/view/KeyEvent;)Z

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    invoke-virtual {p0, v0, v3, p1}, Lbg;->L(Lag;ILandroid/view/KeyEvent;)Z

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    iput-boolean v2, v0, Lag;->k:Z

    .line 72
    .line 73
    if-eqz p0, :cond_2

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    return v2

    .line 77
    :cond_3
    :goto_0
    return v1
.end method

.method public final dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lxf;->n:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Landroid/view/Window$Callback;->dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lxf;->n:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Landroid/view/Window$Callback;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final dispatchTrackballEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lxf;->n:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Landroid/view/Window$Callback;->dispatchTrackballEvent(Landroid/view/MotionEvent;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final onActionModeFinished(Landroid/view/ActionMode;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lxf;->n:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Landroid/view/Window$Callback;->onActionModeFinished(Landroid/view/ActionMode;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onActionModeStarted(Landroid/view/ActionMode;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lxf;->n:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Landroid/view/Window$Callback;->onActionModeStarted(Landroid/view/ActionMode;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onAttachedToWindow()V
    .locals 0

    .line 1
    iget-object p0, p0, Lxf;->n:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {p0}, Landroid/view/Window$Callback;->onAttachedToWindow()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onContentChanged()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lxf;->p:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lxf;->n:Landroid/view/Window$Callback;

    .line 6
    .line 7
    invoke-interface {p0}, Landroid/view/Window$Callback;->onContentChanged()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final onCreatePanelMenu(ILandroid/view/Menu;)Z
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    instance-of v0, p2, Lqu2;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return p0

    .line 9
    :cond_0
    iget-object p0, p0, Lxf;->n:Landroid/view/Window$Callback;

    .line 10
    .line 11
    invoke-interface {p0, p1, p2}, Landroid/view/Window$Callback;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method public final onCreatePanelView(I)Landroid/view/View;
    .locals 2

    .line 1
    iget-object v0, p0, Lxf;->o:Lom1;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    new-instance v1, Landroid/view/View;

    .line 8
    .line 9
    iget-object v0, v0, Lom1;->o:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lcv4;

    .line 12
    .line 13
    iget-object v0, v0, Lcv4;->d:Lgv4;

    .line 14
    .line 15
    iget-object v0, v0, Lgv4;->a:Landroidx/appcompat/widget/Toolbar;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-direct {v1, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v1, 0x0

    .line 26
    :goto_0
    if-eqz v1, :cond_1

    .line 27
    .line 28
    return-object v1

    .line 29
    :cond_1
    iget-object p0, p0, Lxf;->n:Landroid/view/Window$Callback;

    .line 30
    .line 31
    invoke-interface {p0, p1}, Landroid/view/Window$Callback;->onCreatePanelView(I)Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0
.end method

.method public final onDetachedFromWindow()V
    .locals 0

    .line 1
    iget-object p0, p0, Lxf;->n:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {p0}, Landroid/view/Window$Callback;->onDetachedFromWindow()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lxf;->n:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Landroid/view/Window$Callback;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final onMenuOpened(ILandroid/view/Menu;)Z
    .locals 1

    .line 1
    invoke-virtual {p0, p1, p2}, Lxf;->b(ILandroid/view/Menu;)Z

    .line 2
    .line 3
    .line 4
    const/16 p2, 0x6c

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    if-ne p1, p2, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Lxf;->s:Lbg;

    .line 10
    .line 11
    invoke-virtual {p0}, Lbg;->G()V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Lbg;->A:Ll93;

    .line 15
    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Ll93;->D(Z)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return v0
.end method

.method public final onPanelClosed(ILandroid/view/Menu;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lxf;->r:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lxf;->n:Landroid/view/Window$Callback;

    .line 6
    .line 7
    invoke-interface {p0, p1, p2}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {p0, p1, p2}, Lxf;->c(ILandroid/view/Menu;)V

    .line 12
    .line 13
    .line 14
    const/16 p2, 0x6c

    .line 15
    .line 16
    iget-object p0, p0, Lxf;->s:Lbg;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    if-ne p1, p2, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0}, Lbg;->G()V

    .line 22
    .line 23
    .line 24
    iget-object p0, p0, Lbg;->A:Ll93;

    .line 25
    .line 26
    if-eqz p0, :cond_2

    .line 27
    .line 28
    invoke-virtual {p0, v0}, Ll93;->D(Z)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    if-nez p1, :cond_2

    .line 33
    .line 34
    invoke-virtual {p0, p1}, Lbg;->F(I)Lag;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iget-boolean p2, p1, Lag;->m:Z

    .line 39
    .line 40
    if-eqz p2, :cond_2

    .line 41
    .line 42
    invoke-virtual {p0, p1, v0}, Lbg;->w(Lag;Z)V

    .line 43
    .line 44
    .line 45
    :cond_2
    return-void
.end method

.method public final onPointerCaptureChanged(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lxf;->n:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-static {p0, p1}, Lfa5;->a(Landroid/view/Window$Callback;Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z
    .locals 5

    .line 1
    instance-of v0, p3, Lqu2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lqu2;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    const/4 v1, 0x0

    .line 11
    if-nez p1, :cond_1

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    return v1

    .line 16
    :cond_1
    const/4 v2, 0x1

    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    iput-boolean v2, v0, Lqu2;->x:Z

    .line 20
    .line 21
    :cond_2
    iget-object v3, p0, Lxf;->o:Lom1;

    .line 22
    .line 23
    if-eqz v3, :cond_3

    .line 24
    .line 25
    if-nez p1, :cond_3

    .line 26
    .line 27
    iget-object v3, v3, Lom1;->o:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v3, Lcv4;

    .line 30
    .line 31
    iget-boolean v4, v3, Lcv4;->g:Z

    .line 32
    .line 33
    if-nez v4, :cond_3

    .line 34
    .line 35
    iget-object v4, v3, Lcv4;->d:Lgv4;

    .line 36
    .line 37
    iput-boolean v2, v4, Lgv4;->l:Z

    .line 38
    .line 39
    iput-boolean v2, v3, Lcv4;->g:Z

    .line 40
    .line 41
    :cond_3
    iget-object p0, p0, Lxf;->n:Landroid/view/Window$Callback;

    .line 42
    .line 43
    invoke-interface {p0, p1, p2, p3}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    if-eqz v0, :cond_4

    .line 48
    .line 49
    iput-boolean v1, v0, Lqu2;->x:Z

    .line 50
    .line 51
    :cond_4
    return p0
.end method

.method public final onProvideKeyboardShortcuts(Ljava/util/List;Landroid/view/Menu;I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lxf;->s:Lbg;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Lbg;->F(I)Lag;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, Lag;->h:Lqu2;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, p1, v0, p3}, Lxf;->d(Ljava/util/List;Landroid/view/Menu;I)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lxf;->d(Ljava/util/List;Landroid/view/Menu;I)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final onSearchRequested()Z
    .locals 0

    .line 8
    iget-object p0, p0, Lxf;->n:Landroid/view/Window$Callback;

    invoke-interface {p0}, Landroid/view/Window$Callback;->onSearchRequested()Z

    move-result p0

    return p0
.end method

.method public final onSearchRequested(Landroid/view/SearchEvent;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lxf;->n:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-static {p0, p1}, Lda5;->a(Landroid/view/Window$Callback;Landroid/view/SearchEvent;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final onWindowAttributesChanged(Landroid/view/WindowManager$LayoutParams;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lxf;->n:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Landroid/view/Window$Callback;->onWindowAttributesChanged(Landroid/view/WindowManager$LayoutParams;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onWindowFocusChanged(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lxf;->n:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Landroid/view/Window$Callback;->onWindowFocusChanged(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onWindowStartingActionMode(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode;
    .locals 0

    .line 421
    const/4 p0, 0x0

    return-object p0
.end method

.method public final onWindowStartingActionMode(Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;
    .locals 7

    .line 1
    iget-object v0, p0, Lxf;->s:Lbg;

    .line 2
    .line 3
    iget-object v1, v0, Lbg;->x:Landroid/content/Context;

    .line 4
    .line 5
    iget-boolean v2, v0, Lbg;->L:Z

    .line 6
    .line 7
    if-eqz v2, :cond_10

    .line 8
    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    goto/16 :goto_4

    .line 12
    .line 13
    :cond_0
    new-instance p0, Lbq4;

    .line 14
    .line 15
    invoke-direct {p0, v1, p1}, Lbq4;-><init>(Landroid/content/Context;Landroid/view/ActionMode$Callback;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, v0, Lbg;->G:Ld5;

    .line 19
    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    invoke-virtual {p1}, Ld5;->a()V

    .line 23
    .line 24
    .line 25
    :cond_1
    new-instance p1, Lrm3;

    .line 26
    .line 27
    invoke-direct {p1, v0, p0}, Lrm3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lbg;->G()V

    .line 31
    .line 32
    .line 33
    iget-object p2, v0, Lbg;->A:Ll93;

    .line 34
    .line 35
    if-eqz p2, :cond_2

    .line 36
    .line 37
    invoke-virtual {p2, p1}, Ll93;->n0(Lrm3;)Ld5;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    iput-object p2, v0, Lbg;->G:Ld5;

    .line 42
    .line 43
    :cond_2
    iget-object p2, v0, Lbg;->G:Ld5;

    .line 44
    .line 45
    const/4 v2, 0x0

    .line 46
    if-nez p2, :cond_e

    .line 47
    .line 48
    iget-object p2, v0, Lbg;->K:Ls75;

    .line 49
    .line 50
    if-eqz p2, :cond_3

    .line 51
    .line 52
    invoke-virtual {p2}, Ls75;->b()V

    .line 53
    .line 54
    .line 55
    :cond_3
    iget-object p2, v0, Lbg;->G:Ld5;

    .line 56
    .line 57
    if-eqz p2, :cond_4

    .line 58
    .line 59
    invoke-virtual {p2}, Ld5;->a()V

    .line 60
    .line 61
    .line 62
    :cond_4
    iget-object p2, v0, Lbg;->H:Landroidx/appcompat/widget/ActionBarContextView;

    .line 63
    .line 64
    const/4 v3, 0x1

    .line 65
    const/4 v4, 0x0

    .line 66
    if-nez p2, :cond_7

    .line 67
    .line 68
    iget-boolean p2, v0, Lbg;->V:Z

    .line 69
    .line 70
    if-eqz p2, :cond_6

    .line 71
    .line 72
    new-instance p2, Landroid/util/TypedValue;

    .line 73
    .line 74
    invoke-direct {p2}, Landroid/util/TypedValue;-><init>()V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    const v6, 0x7f04000c

    .line 82
    .line 83
    .line 84
    invoke-virtual {v5, v6, p2, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 85
    .line 86
    .line 87
    iget v6, p2, Landroid/util/TypedValue;->resourceId:I

    .line 88
    .line 89
    if-eqz v6, :cond_5

    .line 90
    .line 91
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 92
    .line 93
    .line 94
    move-result-object v6

    .line 95
    invoke-virtual {v6}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    .line 96
    .line 97
    .line 98
    move-result-object v6

    .line 99
    invoke-virtual {v6, v5}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 100
    .line 101
    .line 102
    iget v5, p2, Landroid/util/TypedValue;->resourceId:I

    .line 103
    .line 104
    invoke-virtual {v6, v5, v3}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 105
    .line 106
    .line 107
    new-instance v5, Lud0;

    .line 108
    .line 109
    invoke-direct {v5, v1, v4}, Lud0;-><init>(Landroid/content/Context;I)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v5}, Lud0;->getTheme()Landroid/content/res/Resources$Theme;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-virtual {v1, v6}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 117
    .line 118
    .line 119
    move-object v1, v5

    .line 120
    :cond_5
    new-instance v5, Landroidx/appcompat/widget/ActionBarContextView;

    .line 121
    .line 122
    invoke-direct {v5, v1}, Landroidx/appcompat/widget/ActionBarContextView;-><init>(Landroid/content/Context;)V

    .line 123
    .line 124
    .line 125
    iput-object v5, v0, Lbg;->H:Landroidx/appcompat/widget/ActionBarContextView;

    .line 126
    .line 127
    new-instance v5, Landroid/widget/PopupWindow;

    .line 128
    .line 129
    const v6, 0x7f04001c

    .line 130
    .line 131
    .line 132
    invoke-direct {v5, v1, v2, v6}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 133
    .line 134
    .line 135
    iput-object v5, v0, Lbg;->I:Landroid/widget/PopupWindow;

    .line 136
    .line 137
    const/4 v6, 0x2

    .line 138
    invoke-virtual {v5, v6}, Landroid/widget/PopupWindow;->setWindowLayoutType(I)V

    .line 139
    .line 140
    .line 141
    iget-object v5, v0, Lbg;->I:Landroid/widget/PopupWindow;

    .line 142
    .line 143
    iget-object v6, v0, Lbg;->H:Landroidx/appcompat/widget/ActionBarContextView;

    .line 144
    .line 145
    invoke-virtual {v5, v6}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    .line 146
    .line 147
    .line 148
    iget-object v5, v0, Lbg;->I:Landroid/widget/PopupWindow;

    .line 149
    .line 150
    const/4 v6, -0x1

    .line 151
    invoke-virtual {v5, v6}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 155
    .line 156
    .line 157
    move-result-object v5

    .line 158
    const v6, 0x7f040006

    .line 159
    .line 160
    .line 161
    invoke-virtual {v5, v6, p2, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 162
    .line 163
    .line 164
    iget p2, p2, Landroid/util/TypedValue;->data:I

    .line 165
    .line 166
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    invoke-static {p2, v1}, Landroid/util/TypedValue;->complexToDimensionPixelSize(ILandroid/util/DisplayMetrics;)I

    .line 175
    .line 176
    .line 177
    move-result p2

    .line 178
    iget-object v1, v0, Lbg;->H:Landroidx/appcompat/widget/ActionBarContextView;

    .line 179
    .line 180
    invoke-virtual {v1, p2}, Landroidx/appcompat/widget/ActionBarContextView;->setContentHeight(I)V

    .line 181
    .line 182
    .line 183
    iget-object p2, v0, Lbg;->I:Landroid/widget/PopupWindow;

    .line 184
    .line 185
    const/4 v1, -0x2

    .line 186
    invoke-virtual {p2, v1}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 187
    .line 188
    .line 189
    new-instance p2, Lqf;

    .line 190
    .line 191
    invoke-direct {p2, v0, v3}, Lqf;-><init>(Lbg;I)V

    .line 192
    .line 193
    .line 194
    iput-object p2, v0, Lbg;->J:Lqf;

    .line 195
    .line 196
    goto :goto_0

    .line 197
    :cond_6
    iget-object p2, v0, Lbg;->N:Landroid/view/ViewGroup;

    .line 198
    .line 199
    const v1, 0x7f0a007b

    .line 200
    .line 201
    .line 202
    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 203
    .line 204
    .line 205
    move-result-object p2

    .line 206
    check-cast p2, Landroidx/appcompat/widget/ViewStubCompat;

    .line 207
    .line 208
    if-eqz p2, :cond_7

    .line 209
    .line 210
    invoke-virtual {v0}, Lbg;->D()Landroid/content/Context;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    invoke-virtual {p2, v1}, Landroidx/appcompat/widget/ViewStubCompat;->setLayoutInflater(Landroid/view/LayoutInflater;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {p2}, Landroidx/appcompat/widget/ViewStubCompat;->a()Landroid/view/View;

    .line 222
    .line 223
    .line 224
    move-result-object p2

    .line 225
    check-cast p2, Landroidx/appcompat/widget/ActionBarContextView;

    .line 226
    .line 227
    iput-object p2, v0, Lbg;->H:Landroidx/appcompat/widget/ActionBarContextView;

    .line 228
    .line 229
    :cond_7
    :goto_0
    iget-object p2, v0, Lbg;->H:Landroidx/appcompat/widget/ActionBarContextView;

    .line 230
    .line 231
    if-eqz p2, :cond_d

    .line 232
    .line 233
    iget-object p2, v0, Lbg;->K:Ls75;

    .line 234
    .line 235
    if-eqz p2, :cond_8

    .line 236
    .line 237
    invoke-virtual {p2}, Ls75;->b()V

    .line 238
    .line 239
    .line 240
    :cond_8
    iget-object p2, v0, Lbg;->H:Landroidx/appcompat/widget/ActionBarContextView;

    .line 241
    .line 242
    invoke-virtual {p2}, Landroidx/appcompat/widget/ActionBarContextView;->e()V

    .line 243
    .line 244
    .line 245
    new-instance p2, Lrk4;

    .line 246
    .line 247
    iget-object v1, v0, Lbg;->H:Landroidx/appcompat/widget/ActionBarContextView;

    .line 248
    .line 249
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    iget-object v5, v0, Lbg;->H:Landroidx/appcompat/widget/ActionBarContextView;

    .line 254
    .line 255
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 256
    .line 257
    .line 258
    iput-object v1, p2, Lrk4;->p:Landroid/content/Context;

    .line 259
    .line 260
    iput-object v5, p2, Lrk4;->q:Landroidx/appcompat/widget/ActionBarContextView;

    .line 261
    .line 262
    iput-object p1, p2, Lrk4;->r:Lrm3;

    .line 263
    .line 264
    new-instance v1, Lqu2;

    .line 265
    .line 266
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 267
    .line 268
    .line 269
    move-result-object v5

    .line 270
    invoke-direct {v1, v5}, Lqu2;-><init>(Landroid/content/Context;)V

    .line 271
    .line 272
    .line 273
    iput v3, v1, Lqu2;->l:I

    .line 274
    .line 275
    iput-object v1, p2, Lrk4;->u:Lqu2;

    .line 276
    .line 277
    iput-object p2, v1, Lqu2;->e:Lou2;

    .line 278
    .line 279
    iget-object p1, p1, Lrm3;->n:Ljava/lang/Object;

    .line 280
    .line 281
    check-cast p1, Lbq4;

    .line 282
    .line 283
    invoke-virtual {p1, p2, v1}, Lbq4;->s(Ld5;Landroid/view/Menu;)Z

    .line 284
    .line 285
    .line 286
    move-result p1

    .line 287
    if-eqz p1, :cond_c

    .line 288
    .line 289
    invoke-virtual {p2}, Lrk4;->g()V

    .line 290
    .line 291
    .line 292
    iget-object p1, v0, Lbg;->H:Landroidx/appcompat/widget/ActionBarContextView;

    .line 293
    .line 294
    invoke-virtual {p1, p2}, Landroidx/appcompat/widget/ActionBarContextView;->c(Ld5;)V

    .line 295
    .line 296
    .line 297
    iput-object p2, v0, Lbg;->G:Ld5;

    .line 298
    .line 299
    iget-boolean p1, v0, Lbg;->M:Z

    .line 300
    .line 301
    if-eqz p1, :cond_9

    .line 302
    .line 303
    iget-object p1, v0, Lbg;->N:Landroid/view/ViewGroup;

    .line 304
    .line 305
    if-eqz p1, :cond_9

    .line 306
    .line 307
    invoke-virtual {p1}, Landroid/view/View;->isLaidOut()Z

    .line 308
    .line 309
    .line 310
    move-result p1

    .line 311
    if-eqz p1, :cond_9

    .line 312
    .line 313
    move p1, v3

    .line 314
    goto :goto_1

    .line 315
    :cond_9
    move p1, v4

    .line 316
    :goto_1
    iget-object p2, v0, Lbg;->H:Landroidx/appcompat/widget/ActionBarContextView;

    .line 317
    .line 318
    const/high16 v1, 0x3f800000    # 1.0f

    .line 319
    .line 320
    if-eqz p1, :cond_a

    .line 321
    .line 322
    const/4 p1, 0x0

    .line 323
    invoke-virtual {p2, p1}, Landroid/view/View;->setAlpha(F)V

    .line 324
    .line 325
    .line 326
    iget-object p1, v0, Lbg;->H:Landroidx/appcompat/widget/ActionBarContextView;

    .line 327
    .line 328
    invoke-static {p1}, Lj65;->a(Landroid/view/View;)Ls75;

    .line 329
    .line 330
    .line 331
    move-result-object p1

    .line 332
    invoke-virtual {p1, v1}, Ls75;->a(F)V

    .line 333
    .line 334
    .line 335
    iput-object p1, v0, Lbg;->K:Ls75;

    .line 336
    .line 337
    new-instance p2, Lsf;

    .line 338
    .line 339
    invoke-direct {p2, v3, v0}, Lsf;-><init>(ILjava/lang/Object;)V

    .line 340
    .line 341
    .line 342
    invoke-virtual {p1, p2}, Ls75;->d(Lu75;)V

    .line 343
    .line 344
    .line 345
    goto :goto_2

    .line 346
    :cond_a
    invoke-virtual {p2, v1}, Landroid/view/View;->setAlpha(F)V

    .line 347
    .line 348
    .line 349
    iget-object p1, v0, Lbg;->H:Landroidx/appcompat/widget/ActionBarContextView;

    .line 350
    .line 351
    invoke-virtual {p1, v4}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    .line 352
    .line 353
    .line 354
    iget-object p1, v0, Lbg;->H:Landroidx/appcompat/widget/ActionBarContextView;

    .line 355
    .line 356
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 357
    .line 358
    .line 359
    move-result-object p1

    .line 360
    instance-of p1, p1, Landroid/view/View;

    .line 361
    .line 362
    if-eqz p1, :cond_b

    .line 363
    .line 364
    iget-object p1, v0, Lbg;->H:Landroidx/appcompat/widget/ActionBarContextView;

    .line 365
    .line 366
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 367
    .line 368
    .line 369
    move-result-object p1

    .line 370
    check-cast p1, Landroid/view/View;

    .line 371
    .line 372
    sget-object p2, Lj65;->a:Ljava/util/WeakHashMap;

    .line 373
    .line 374
    invoke-virtual {p1}, Landroid/view/View;->requestApplyInsets()V

    .line 375
    .line 376
    .line 377
    :cond_b
    :goto_2
    iget-object p1, v0, Lbg;->I:Landroid/widget/PopupWindow;

    .line 378
    .line 379
    if-eqz p1, :cond_d

    .line 380
    .line 381
    iget-object p1, v0, Lbg;->y:Landroid/view/Window;

    .line 382
    .line 383
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 384
    .line 385
    .line 386
    move-result-object p1

    .line 387
    iget-object p2, v0, Lbg;->J:Lqf;

    .line 388
    .line 389
    invoke-virtual {p1, p2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 390
    .line 391
    .line 392
    goto :goto_3

    .line 393
    :cond_c
    iput-object v2, v0, Lbg;->G:Ld5;

    .line 394
    .line 395
    :cond_d
    :goto_3
    invoke-virtual {v0}, Lbg;->O()V

    .line 396
    .line 397
    .line 398
    iget-object p1, v0, Lbg;->G:Ld5;

    .line 399
    .line 400
    iput-object p1, v0, Lbg;->G:Ld5;

    .line 401
    .line 402
    :cond_e
    invoke-virtual {v0}, Lbg;->O()V

    .line 403
    .line 404
    .line 405
    iget-object p1, v0, Lbg;->G:Ld5;

    .line 406
    .line 407
    if-eqz p1, :cond_f

    .line 408
    .line 409
    invoke-virtual {p0, p1}, Lbq4;->i(Ld5;)Ljo4;

    .line 410
    .line 411
    .line 412
    move-result-object v2

    .line 413
    :cond_f
    return-object v2

    .line 414
    :cond_10
    :goto_4
    iget-object p0, p0, Lxf;->n:Landroid/view/Window$Callback;

    .line 415
    .line 416
    invoke-static {p0, p1, p2}, Lda5;->b(Landroid/view/Window$Callback;Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;

    .line 417
    .line 418
    .line 419
    move-result-object p0

    .line 420
    return-object p0
.end method
