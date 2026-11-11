.class public final Lrj2;
.super Lqj2;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic o:Lsj2;


# direct methods
.method public constructor <init>(Lsj2;Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lrj2;->o:Lsj2;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lqj2;-><init>(Lbq4;Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onLoadChildren(Ljava/lang/String;Landroid/service/media/MediaBrowserService$Result;Landroid/os/Bundle;)V
    .locals 4

    .line 1
    invoke-static {p3}, Lf35;->n(Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    iget-object p0, p0, Lrj2;->o:Lsj2;

    .line 6
    .line 7
    iget-object v0, p0, Lsj2;->s:Lpn2;

    .line 8
    .line 9
    iget-object v1, v0, Lpn2;->p:Loj2;

    .line 10
    .line 11
    new-instance v2, Lom1;

    .line 12
    .line 13
    const/4 v3, 0x7

    .line 14
    invoke-direct {v2, v3, p2}, Lom1;-><init>(ILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    new-instance p2, Lpj2;

    .line 18
    .line 19
    invoke-direct {p2, p0, p1, v2, p3}, Lpj2;-><init>(Lsj2;Ljava/lang/String;Lom1;Landroid/os/Bundle;)V

    .line 20
    .line 21
    .line 22
    iput-object v1, v0, Lpn2;->s:Loj2;

    .line 23
    .line 24
    invoke-virtual {v0, p1, p2, p3}, Lpn2;->d(Ljava/lang/String;Luj2;Landroid/os/Bundle;)V

    .line 25
    .line 26
    .line 27
    const/4 p0, 0x0

    .line 28
    iput-object p0, v0, Lpn2;->s:Loj2;

    .line 29
    .line 30
    iput-object p0, v0, Lpn2;->s:Loj2;

    .line 31
    .line 32
    return-void
.end method
