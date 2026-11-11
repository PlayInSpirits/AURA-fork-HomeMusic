.class public Landroidx/mediarouter/app/MediaRouteActionProvider;
.super Le5;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public c:Lrq2;

.field public final d:Ltp2;

.field public e:Lcp2;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Le5;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lrq2;->c:Lrq2;

    .line 5
    .line 6
    iput-object v0, p0, Landroidx/mediarouter/app/MediaRouteActionProvider;->c:Lrq2;

    .line 7
    .line 8
    sget-object v0, Ltp2;->a:Ltp2;

    .line 9
    .line 10
    iput-object v0, p0, Landroidx/mediarouter/app/MediaRouteActionProvider;->d:Ltp2;

    .line 11
    .line 12
    invoke-static {p1}, Lyq2;->d(Landroid/content/Context;)Lyq2;

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final c()Landroid/view/View;
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/mediarouter/app/MediaRouteActionProvider;->e:Lcp2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "MRActionProvider"

    .line 6
    .line 7
    const-string v1, "onCreateActionView: this ActionProvider is already associated with a menu item. Don\'t reuse MediaRouteActionProvider instances! Abandoning the old menu item..."

    .line 8
    .line 9
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    :cond_0
    new-instance v0, Lcp2;

    .line 13
    .line 14
    iget-object v1, p0, Le5;->a:Landroid/content/Context;

    .line 15
    .line 16
    invoke-direct {v0, v1}, Lcp2;-><init>(Landroid/content/Context;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Landroidx/mediarouter/app/MediaRouteActionProvider;->e:Lcp2;

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-virtual {v0, v1}, Lcp2;->setCheatSheetEnabled(Z)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Landroidx/mediarouter/app/MediaRouteActionProvider;->e:Lcp2;

    .line 26
    .line 27
    iget-object v1, p0, Landroidx/mediarouter/app/MediaRouteActionProvider;->c:Lrq2;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Lcp2;->setRouteSelector(Lrq2;)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Landroidx/mediarouter/app/MediaRouteActionProvider;->e:Lcp2;

    .line 33
    .line 34
    iget-object v1, p0, Landroidx/mediarouter/app/MediaRouteActionProvider;->d:Ltp2;

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Lcp2;->setDialogFactory(Ltp2;)V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Landroidx/mediarouter/app/MediaRouteActionProvider;->e:Lcp2;

    .line 40
    .line 41
    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    .line 42
    .line 43
    const/4 v2, -0x2

    .line 44
    const/4 v3, -0x1

    .line 45
    invoke-direct {v1, v2, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 49
    .line 50
    .line 51
    iget-object p0, p0, Landroidx/mediarouter/app/MediaRouteActionProvider;->e:Lcp2;

    .line 52
    .line 53
    return-object p0
.end method

.method public final e()Z
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/mediarouter/app/MediaRouteActionProvider;->e:Lcp2;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcp2;->c()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0
.end method
