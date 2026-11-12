.class public Lsj2;
.super Lbq4;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic s:Lpn2;


# direct methods
.method public constructor <init>(Lpn2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lsj2;->s:Lpn2;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lbq4;-><init>(Lpn2;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final p(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    iget-object p0, p0, Lbq4;->o:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Lqj2;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Landroid/service/media/MediaBrowserService;->notifyChildrenChanged(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-super {p0, p1, p2}, Lbq4;->p(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final r()V
    .locals 2

    .line 1
    new-instance v0, Lrj2;

    .line 2
    .line 3
    iget-object v1, p0, Lsj2;->s:Lpn2;

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, Lrj2;-><init>(Lsj2;Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, Lbq4;->o:Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/service/media/MediaBrowserService;->onCreate()V

    .line 11
    .line 12
    .line 13
    return-void
.end method
