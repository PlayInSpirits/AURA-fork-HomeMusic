.class public final synthetic Ldefpackage/tt1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:Ljava/lang/Runnable;

.field public final synthetic o:Ljava/util/Map;

.field public final synthetic p:Z

.field public final synthetic q:Z


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Runnable;Ljava/util/Map;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/tt1;->n:Ljava/lang/Runnable;

    .line 5
    .line 6
    iput-object p2, p0, Ldefpackage/tt1;->o:Ljava/util/Map;

    .line 7
    .line 8
    iput-boolean p3, p0, Ldefpackage/tt1;->p:Z

    .line 9
    .line 10
    iput-boolean p4, p0, Ldefpackage/tt1;->q:Z

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    sget-object v0, Ldefpackage/ur1;->a:Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p1}, Ldefpackage/ur1;->a(Landroid/content/Context;)Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object v0, p0, Ldefpackage/tt1;->n:Ljava/lang/Runnable;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 14
    .line 15
    .line 16
    if-eqz p1, :cond_2

    .line 17
    .line 18
    sget-object v0, Lcom/eddyizm/tempus/homemusic/b;->a:Ljava/lang/ref/WeakReference;

    .line 19
    .line 20
    iget-boolean v0, p0, Ldefpackage/tt1;->q:Z

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    const-string v0, "player"

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    iget-boolean v0, p0, Ldefpackage/tt1;->p:Z

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    const-string v0, "artist_menu"

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const-string v0, "track_menu"

    .line 35
    .line 36
    :goto_0
    iget-object p0, p0, Ldefpackage/tt1;->o:Ljava/util/Map;

    .line 37
    .line 38
    const/4 v1, 0x0

    .line 39
    invoke-static {p1, p0, v1, v0}, Lcom/eddyizm/tempus/homemusic/b;->l(Lcom/eddyizm/tempus/ui/activity/MainActivity;Ljava/util/Map;Ldefpackage/k6;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :cond_2
    return-void
.end method
